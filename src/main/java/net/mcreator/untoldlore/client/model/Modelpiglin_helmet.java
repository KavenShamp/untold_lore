package net.mcreator.untoldlore.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.6.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelpiglin_helmet<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("untold_lore", "modelpiglin_helmet"), "main");
	public final ModelPart brute_helm;

	public Modelpiglin_helmet(ModelPart root) {
		this.brute_helm = root.getChild("brute_helm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition brute_helm = partdefinition.addOrReplaceChild("brute_helm",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.3F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition brute_plates = brute_helm.addOrReplaceChild("brute_plates",
				CubeListBuilder.create().texOffs(24, 3).addBox(-2.0F, -27.85F, -5.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.15F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition right_r1 = brute_plates.addOrReplaceChild("right_r1",
				CubeListBuilder.create().texOffs(27, 16).addBox(-15.0F, -27.0F, -2.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3491F));
		PartDefinition left_r1 = brute_plates
				.addOrReplaceChild(
						"left_r1", CubeListBuilder.create().texOffs(27, 16).mirror()
								.addBox(14.0F, -27.0F, -2.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.1F)).mirror(false),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3491F));
		PartDefinition brute_torse = brute_helm.addOrReplaceChild("brute_torse",
				CubeListBuilder.create().texOffs(0, 16).addBox(-4.5F, -31.0F, -4.5F, 9.0F, 1.0F, 9.0F, new CubeDeformation(0.1F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		brute_helm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
