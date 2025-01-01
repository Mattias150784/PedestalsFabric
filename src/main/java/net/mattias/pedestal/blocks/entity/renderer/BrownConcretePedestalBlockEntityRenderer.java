package net.mattias.pedestal.blocks.entity.renderer;

import net.mattias.pedestal.blocks.entity.custom.BrownConcretePedestalBlockEntity;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.LightmapTextureManager;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.entity.BlockEntityRenderer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.world.LightType;
import net.minecraft.world.World;

public class BrownConcretePedestalBlockEntityRenderer implements BlockEntityRenderer<BrownConcretePedestalBlockEntity> {

    public BrownConcretePedestalBlockEntityRenderer(BlockEntityRendererFactory.Context context) {
    }

    @Override
    public void render(BrownConcretePedestalBlockEntity entity, float tickDelta, MatrixStack matrices,
                       VertexConsumerProvider vertexConsumers, int light, int overlay) {
        ItemRenderer itemRenderer = MinecraftClient.getInstance().getItemRenderer();
        ItemStack stack = entity.getStack(0);

        long time = System.currentTimeMillis();
        float bobbingOffset = (float) Math.sin((time % 1000) / 1000.0 * Math.PI * 2) * 0.1f;

        matrices.push();
        matrices.translate(0.5f, 1.15f + bobbingOffset, 0.5f);
        matrices.scale(0.5f, 0.5f, 0.5f);
        matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(entity.getRenderingRotation()));


        itemRenderer.renderItem(stack, ModelTransformationMode.GROUND, getLightLevel(entity.getWorld(),
                entity.getPos()), OverlayTexture.DEFAULT_UV, matrices, vertexConsumers, entity.getWorld(), 1);
        matrices.pop();
    }

    private int getLightLevel(World world, BlockPos pos) {
        int bLight = world.getLightLevel(LightType.BLOCK, pos);
        int sLight = world.getLightLevel(LightType.SKY, pos);
        return LightmapTextureManager.pack(bLight, sLight);
    }
}
