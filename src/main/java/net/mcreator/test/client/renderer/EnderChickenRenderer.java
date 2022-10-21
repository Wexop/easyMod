
package net.mcreator.test.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.ChickenModel;

import net.mcreator.test.entity.EnderChickenEntity;

public class EnderChickenRenderer extends MobRenderer<EnderChickenEntity, ChickenModel<EnderChickenEntity>> {
	public EnderChickenRenderer(EntityRendererProvider.Context context) {
		super(context, new ChickenModel(context.bakeLayer(ModelLayers.CHICKEN)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EnderChickenEntity entity) {
		return new ResourceLocation("test:textures/entities/ender_chicken.png");
	}
}
