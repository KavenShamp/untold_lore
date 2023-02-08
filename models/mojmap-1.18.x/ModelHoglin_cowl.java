// Made with Blockbench 4.6.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelHoglin_cowl<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "hoglin_cowl"), "main");
	private final ModelPart cowl;

	public ModelHoglin_cowl(ModelPart root) {
		this.cowl = root.getChild("cowl");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition cowl = partdefinition.addOrReplaceChild("cowl",
				CubeListBuilder.create().texOffs(0, 23)
						.addBox(-6.0F, -8.0F, -4.0F, 12.0F, 8.0F, 9.0F, new CubeDeformation(0.3F)).texOffs(0, 30)
						.addBox(0.0F, -11.0F, 4.0F, 0.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition ear_r1 = cowl.addOrReplaceChild("ear_r1",
				CubeListBuilder.create().texOffs(39, 5).mirror()
						.addBox(-4.0F, -11.8F, 1.0F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.8727F));

		PartDefinition ear_r2 = cowl
				.addOrReplaceChild("ear_r2",
						CubeListBuilder.create().texOffs(39, 5).addBox(-2.0F, -11.8F, 1.0F, 6.0F, 1.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.8727F));

		PartDefinition tusk_right_r1 = cowl.addOrReplaceChild("tusk_right_r1",
				CubeListBuilder.create().texOffs(36, 19)
						.addBox(-8.0F, -15.0F, -4.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(36, 19)
						.addBox(6.0F, -15.0F, -4.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition head_r1 = cowl
				.addOrReplaceChild("head_r1",
						CubeListBuilder.create().texOffs(0, 0).addBox(-7.0F, -7.0F, -9.0F, 14.0F, 19.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.4835F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		cowl.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}