package net.mattias.pedestal.datagen.custom;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.mattias.pedestal.Pedestals;
import net.mattias.pedestal.util.PedestalVariant;
import net.mattias.pedestal.util.PedestalVariants;
import net.minecraft.data.DataOutput;
import net.minecraft.data.DataProvider;
import net.minecraft.data.DataWriter;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;

public class PedestalModelGenerator implements DataProvider {
	private final FabricDataOutput output;
	private final Gson gson = new GsonBuilder().setPrettyPrinting().create();

	public PedestalModelGenerator(FabricDataOutput fabricDataOutput) {
		this.output = fabricDataOutput;
	}

	@Override
	public CompletableFuture<?> run(DataWriter writer) {
		return CompletableFuture.supplyAsync(() -> {
			try {
				JsonObject template = loadTemplate();

				for (PedestalVariant pedestalVariant : PedestalVariants.VARIANTS) {
					try {
						JsonObject model = template.deepCopy();

						JsonObject textures = model.getAsJsonObject("textures");

						Identifier baseBlockId = Registries.BLOCK.getId(pedestalVariant.baseBlock().get());

						textures.addProperty("0", baseBlockId.getNamespace() + ":block/" + pedestalVariant.textureName());
						textures.addProperty("particle", baseBlockId.getNamespace() + ":block/" + pedestalVariant.textureName());

						if(pedestalVariant.textureName().contains("glass")) {
							model.addProperty("render_type", "translucent");
						}

						Path modelFile = output.resolvePath(DataOutput.OutputType.RESOURCE_PACK).resolve(Pedestals.MOD_ID + "/models/block/" + pedestalVariant.registryName() + ".json");

						Files.createDirectories(modelFile.getParent());
						DataProvider.writeToPath(writer, model, modelFile).get();
					} catch (Exception e) {
						Pedestals.LOGGER.warn("Failed to generate model for: " + pedestalVariant.registryName());
						e.printStackTrace();
					}
				}
			} catch (IOException e) {
				Pedestals.LOGGER.error("Failed to do something");
				throw new RuntimeException(e);
			}
			return null;
		});
	}

	private JsonObject loadTemplate() throws IOException {
		InputStream stream = getClass().getClassLoader().getResourceAsStream("assets/pedestals/template/models/block/pedestal.json");
		if (stream == null) throw new FileNotFoundException("Pedestal template model not found");
		return gson.fromJson(new InputStreamReader(stream), JsonObject.class);
	}

	@Override
	public String getName() {
		return "Pedestal Model Generator";
	}
}
