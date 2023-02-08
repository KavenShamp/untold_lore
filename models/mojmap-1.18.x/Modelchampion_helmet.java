// Made with Blockbench 4.6.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelchampion_helmet<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "champion_helmet"), "main");
	private final ModelPart brute_helm;

	public Modelchampion_helmet(ModelPart root) {
		this.brute_helm = root.getChild("brute_helm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition brute_helm = partdefinition.addOrReplaceChild("brute_helm", CubeListBuilder.create()
				.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.3F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition brute_plates = brute_helm.addOrReplaceChild("brute_plates", CubeListBuilder.create()
				.texOffs(1, 28).addBox(-2.0F, -28.0F, -5.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.1F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition visor_r1 = brute_plates
				.addOrReplaceChild("visor_r1",
						CubeListBuilder.create().texOffs(0, 22).addBox(-6.0F, -30.0F, -12.0F, 12.0F, 1.0F, 12.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition right_r1 = brute_plates.addOrReplaceChild("right_r1",
				CubeListBuilder.create().texOffs(37, 18).addBox(-16.0F, -26.0F, -5.0F, 1.0F, 5.0F, 4.0F,
						new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0873F, 0.0F, 0.3491F));

		PartDefinition left_r1 = brute_plates.addOrReplaceChild("left_r1",
				CubeListBuilder.create().texOffs(37, 18).mirror()
						.addBox(15.0F, -26.0F, -5.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.1F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0873F, 0.0F, -0.3491F));

		PartDefinition deco = brute_helm.addOrReplaceChild("deco",
				CubeListBuilder.create().texOffs(26, 10)
						.addBox(-0.5F, -34.0F, -1.0F, 1.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(1, 21)
						.addBox(-0.5F, -36.0F, -1.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(36, 22)
						.addBox(0.0F, -40.0F, -1.0F, 0.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition tusk_left_r1 = deco.addOrReplaceChild("tusk_left_r1",
				CubeListBuilder.create().texOffs(2, 1).mirror()
						.addBox(2.12F, -28.0F, 3.25F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(2, 1).addBox(-3.12F, -28.0F, 3.25F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3491F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		brute_helm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}