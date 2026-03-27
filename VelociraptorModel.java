package com.bernardo.dbi.client.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;

public class VelociraptorModel<T extends Entity> extends EntityModel<T> {

    public static final ModelLayerLocation LAYER_LOCATION =
            new ModelLayerLocation(new ResourceLocation("dbi", "velociraptor"), "main");

    private final ModelPart Root;
    private final ModelPart body;
    private final ModelPart head;
    private final ModelPart bone19;
    private final ModelPart bone21;
    private final ModelPart bone22;
    private final ModelPart bone20;
    private final ModelPart rightArm;
    private final ModelPart bone15;
    private final ModelPart bone16;
    private final ModelPart bone17;
    private final ModelPart bone18;
    private final ModelPart leftArm;
    private final ModelPart bone14;
    private final ModelPart bone11;
    private final ModelPart bone12;
    private final ModelPart bone13;
    private final ModelPart rightLeg;
    private final ModelPart bone6;
    private final ModelPart bone7;
    private final ModelPart bone8;
    private final ModelPart bone9;
    private final ModelPart bone10;
    private final ModelPart leftLeg;
    private final ModelPart bone5;
    private final ModelPart bone;
    private final ModelPart bone2;
    private final ModelPart bone3;
    private final ModelPart bone4;
    private final ModelPart rightItem;

    public VelociraptorModel(ModelPart root) {
        this.Root      = root.getChild("Root");
        this.body      = this.Root.getChild("body");
        this.head      = this.Root.getChild("head");
        this.bone19    = this.head.getChild("bone19");
        this.bone21    = this.bone19.getChild("bone21");
        this.bone22    = this.bone19.getChild("bone22");
        this.bone20    = this.head.getChild("bone20");
        this.rightArm  = this.Root.getChild("rightArm");
        this.bone15    = this.rightArm.getChild("bone15");
        this.bone16    = this.bone15.getChild("bone16");
        this.bone17    = this.bone15.getChild("bone17");
        this.bone18    = this.bone15.getChild("bone18");
        this.leftArm   = this.Root.getChild("leftArm");
        this.bone14    = this.leftArm.getChild("bone14");
        this.bone11    = this.bone14.getChild("bone11");
        this.bone12    = this.bone14.getChild("bone12");
        this.bone13    = this.bone14.getChild("bone13");
        this.rightLeg  = this.Root.getChild("rightLeg");
        this.bone6     = this.rightLeg.getChild("bone6");
        this.bone7     = this.bone6.getChild("bone7");
        this.bone8     = this.bone6.getChild("bone8");
        this.bone9     = this.bone6.getChild("bone9");
        this.bone10    = this.bone6.getChild("bone10");
        this.leftLeg   = this.Root.getChild("leftLeg");
        this.bone5     = this.leftLeg.getChild("bone5");
        this.bone      = this.bone5.getChild("bone");
        this.bone2     = this.bone5.getChild("bone2");
        this.bone3     = this.bone5.getChild("bone3");
        this.bone4     = this.bone5.getChild("bone4");
        this.rightItem = this.Root.getChild("rightItem");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition Root = partdefinition.addOrReplaceChild("Root",
                CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition body = Root.addOrReplaceChild("body", CubeListBuilder.create()
                .texOffs(0, 33).addBox(-8.0F, -9.0F, 1.0F, 16.0F, 16.0F, 15.0F, new CubeDeformation(0.0F))
                .texOffs(48, 105).addBox(-7.0F, -8.0F, 16.0F, 14.0F, 14.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(0, 64).addBox(-6.0F, -7.0F, 22.0F, 12.0F, 12.0F, 12.0F, new CubeDeformation(0.0F))
                .texOffs(62, 33).addBox(-5.0F, -6.0F, 34.0F, 10.0F, 10.0F, 15.0F, new CubeDeformation(0.0F))
                .texOffs(66, 0).addBox(-4.0F, -5.0F, 49.0F, 8.0F, 8.0F, 16.0F, new CubeDeformation(0.0F))
                .texOffs(62, 58).addBox(-3.0F, -4.0F, 65.0F, 6.0F, 6.0F, 19.0F, new CubeDeformation(0.0F))
                .texOffs(96, 83).addBox(-2.0F, -3.0F, 84.0F, 4.0F, 4.0F, 18.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-7.0F, -8.0F, -18.0F, 14.0F, 14.0F, 19.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, -24.0F, 0.0F));

        body.addOrReplaceChild("body_r1", CubeListBuilder.create()
                .texOffs(114, 0).addBox(-4.0F, -5.0F, -9.0F, 8.0F, 10.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(112, 24).addBox(-5.0F, -6.0F, -3.0F, 10.0F, 12.0F, 8.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -2.0F, -21.0F, -0.2094F, 0.0F, 0.0F));

        PartDefinition head = Root.addOrReplaceChild("head",
                CubeListBuilder.create(), PartPose.offset(0.0F, -24.0F, 0.0F));

        PartDefinition bone19 = head.addOrReplaceChild("bone19", CubeListBuilder.create()
                .texOffs(48, 83).addBox(-4.0F, -6.0F, -16.0F, 8.0F, 6.0F, 16.0F, new CubeDeformation(0.0F))
                .texOffs(82, 136).addBox(2.0F, -5.0F, -16.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(90, 136).addBox(-4.0F, -5.0F, -16.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(104, 31).addBox(-1.0F, 0.0F, -15.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(30, 133).addBox(3.0F, 0.0F, -7.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(104, 24).addBox(3.0F, -1.0F, -5.0F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(50, 135).addBox(-3.0F, -1.0F, -5.0F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(30, 137).addBox(-3.0F, 0.0F, -7.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(134, 138).addBox(3.0F, 0.0F, -10.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(134, 138).addBox(3.0F, 0.0F, -7.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(138, 138).addBox(-3.0F, 0.0F, -10.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(0, 139).addBox(3.0F, 0.0F, -13.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(4, 139).addBox(-3.0F, 0.0F, -13.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, -3.0F, -29.0F));

        bone19.addOrReplaceChild("bone19_r1", CubeListBuilder.create()
                .texOffs(12, 139).addBox(0.0F, -1.0F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.0F, 1.0F, -14.0F, 0.0F, -0.9076F, 0.0F));
        bone19.addOrReplaceChild("bone19_r2", CubeListBuilder.create()
                .texOffs(8, 139).addBox(0.0F, -1.0F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.0F, 1.0F, -14.0F, 0.0F, 0.9076F, 0.0F));

        PartDefinition bone21 = bone19.addOrReplaceChild("bone21",
                CubeListBuilder.create(), PartPose.offset(5.0F, -5.0F, -6.0F));
        bone21.addOrReplaceChild("bone21_r1", CubeListBuilder.create()
                .texOffs(34, 108).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, 0.2618F, 0.2094F, 0.0F));
        bone21.addOrReplaceChild("bone21_r2", CubeListBuilder.create()
                .texOffs(98, 130).addBox(-1.0F, -0.5F, -1.5F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.4F)),
                PartPose.offsetAndRotation(-1.0F, 2.0F, 0.0F, 0.2618F, 0.2094F, 0.0F));

        PartDefinition bone22 = bone19.addOrReplaceChild("bone22",
                CubeListBuilder.create(), PartPose.offset(-5.0F, -5.0F, -6.0F));
        bone22.addOrReplaceChild("bone22_r1", CubeListBuilder.create()
                .texOffs(34, 114).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.0F, 0.0F, 0.0F, 0.2618F, -0.2094F, 0.0F));
        bone22.addOrReplaceChild("bone22_r2", CubeListBuilder.create()
                .texOffs(106, 130).addBox(-1.0F, -0.5F, -1.5F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.4F)),
                PartPose.offsetAndRotation(1.0F, 2.0F, 0.0F, 0.2618F, -0.2094F, 0.0F));

        head.addOrReplaceChild("bone20", CubeListBuilder.create()
                .texOffs(48, 105).addBox(-4.0F, 0.0F, -16.0F, 8.0F, 4.0F, 16.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, -3.0F, -29.0F));

        // ── RIGHT ARM ────────────────────────────────────────────────────────
        PartDefinition rightArm = Root.addOrReplaceChild("rightArm",
                CubeListBuilder.create(), PartPose.offset(-6.0F, -20.0F, 0.0F));
        PartDefinition bone15 = rightArm.addOrReplaceChild("bone15",
                CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition bone16 = bone15.addOrReplaceChild("bone16",
                CubeListBuilder.create(), PartPose.offset(-2.0F, 0.0F, -10.0F));
        bone16.addOrReplaceChild("bone16_r1", CubeListBuilder.create()
                .texOffs(48, 108).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(114, 16).addBox(-2.0F, -6.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6109F, 0.0F, 0.0F));
        PartDefinition bone17 = bone15.addOrReplaceChild("bone17",
                CubeListBuilder.create(), PartPose.offset(-2.0F, 4.0F, -8.0F));
        bone17.addOrReplaceChild("bone17_r1", CubeListBuilder.create()
                .texOffs(48, 64).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.0472F, 0.0F, 0.0F));
        PartDefinition bone18 = bone15.addOrReplaceChild("bone18",
                CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, 9.0F, -12.0F, -0.3142F, 0.0F, 0.0F));
        bone18.addOrReplaceChild("bone18_r1", CubeListBuilder.create()
                .texOffs(140, 92).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(90, 140).addBox(-2.0F, -2.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, -1.0472F, 0.0F, 0.0F));
        bone18.addOrReplaceChild("bone18_r2", CubeListBuilder.create()
                .texOffs(138, 115).addBox(-1.0F, -3.0F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.0F, 0.0F, 1.0F, -1.7104F, 0.0F, 0.0F));
        bone18.addOrReplaceChild("bone18_r3", CubeListBuilder.create()
                .texOffs(130, 16).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -2.0F, -1.0F, -1.0472F, 0.0F, 0.0F));

        // ── LEFT ARM ─────────────────────────────────────────────────────────
        PartDefinition leftArm = Root.addOrReplaceChild("leftArm",
                CubeListBuilder.create(), PartPose.offset(6.0F, -20.0F, 0.0F));
        PartDefinition bone14 = leftArm.addOrReplaceChild("bone14",
                CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition bone11 = bone14.addOrReplaceChild("bone11",
                CubeListBuilder.create(), PartPose.offset(2.0F, 0.0F, -10.0F));
        bone11.addOrReplaceChild("bone11_r1", CubeListBuilder.create()
                .texOffs(66, 125).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(114, 16).addBox(-2.0F, -6.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6109F, 0.0F, 0.0F));
        PartDefinition bone12 = bone14.addOrReplaceChild("bone12",
                CubeListBuilder.create(), PartPose.offset(2.0F, 4.0F, -8.0F));
        bone12.addOrReplaceChild("bone12_r1", CubeListBuilder.create()
                .texOffs(48, 72).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.0472F, 0.0F, 0.0F));
        PartDefinition bone13 = bone14.addOrReplaceChild("bone13",
                CubeListBuilder.create(), PartPose.offsetAndRotation(2.0F, 9.0F, -12.0F, -0.3142F, 0.0F, 0.0F));
        bone13.addOrReplaceChild("bone13_r1", CubeListBuilder.create()
                .texOffs(140, 96).addBox(-1.5F, -2.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(94, 140).addBox(0.0F, -2.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.0F, 0.0F, 1.0F, -1.0472F, 0.0F, 0.0F));
        bone13.addOrReplaceChild("bone13_r2", CubeListBuilder.create()
                .texOffs(138, 121).addBox(0.0F, -3.0F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.0F, 0.0F, 1.0F, -1.7104F, 0.0F, 0.0F));
        bone13.addOrReplaceChild("bone13_r3", CubeListBuilder.create()
                .texOffs(82, 130).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -2.0F, -1.0F, -1.0472F, 0.0F, 0.0F));

        // ── RIGHT LEG ────────────────────────────────────────────────────────
        PartDefinition rightLeg = Root.addOrReplaceChild("rightLeg",
                CubeListBuilder.create(), PartPose.offset(-10.0F, -23.0F, 8.0F));
        PartDefinition bone6 = rightLeg.addOrReplaceChild("bone6",
                CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition bone7 = bone6.addOrReplaceChild("bone7", CubeListBuilder.create()
                .texOffs(66, 24).addBox(-3.0F, -1.0F, 1.0F, 5.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, 21.0F, -3.0F));
        bone7.addOrReplaceChild("bone7_r1", CubeListBuilder.create()
                .texOffs(82, 125).addBox(-1.0F, -1.5F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(3.0F, 0.0F, -1.0F, -0.4538F, -0.4538F, -0.2618F));
        bone7.addOrReplaceChild("bone7_r2", CubeListBuilder.create()
                .texOffs(0, 133).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(3.0F, 0.0F, 0.0F, -0.4538F, -0.4538F, -0.2618F));
        bone7.addOrReplaceChild("bone7_r3", CubeListBuilder.create()
                .texOffs(66, 135).addBox(-1.0F, -2.0F, -1.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.1F))
                .texOffs(58, 135).addBox(-3.0F, -2.0F, -1.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.1F)),
                PartPose.offsetAndRotation(1.0F, 1.0F, 0.0F, 0.4887F, 0.0F, 0.0F));
        bone7.addOrReplaceChild("bone7_r4", CubeListBuilder.create()
                .texOffs(106, 135).addBox(0.0F, -1.0F, -2.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.2F)),
                PartPose.offsetAndRotation(-4.0F, 0.0F, 1.0F, 0.5236F, 0.384F, 0.2094F));
        PartDefinition bone8 = bone6.addOrReplaceChild("bone8",
                CubeListBuilder.create(), PartPose.offset(1.0F, 17.0F, 3.0F));
        bone8.addOrReplaceChild("bone8_r1", CubeListBuilder.create()
                .texOffs(48, 80).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.2F)),
                PartPose.offsetAndRotation(3.0F, 2.0F, -1.0F, 2.9147F, 1.2915F, -2.2166F));
        bone8.addOrReplaceChild("bone8_r2", CubeListBuilder.create()
                .texOffs(10, 133).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.3F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -2.9671F, 1.2915F, -2.2166F));
        bone8.addOrReplaceChild("bone8_r3", CubeListBuilder.create()
                .texOffs(122, 115).addBox(-1.0F, -6.0F, -2.0F, 3.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.0F, -2.0F, 0.0F, -0.3491F, 0.0F, 0.0F));
        PartDefinition bone9 = bone6.addOrReplaceChild("bone9",
                CubeListBuilder.create(), PartPose.offset(-1.0F, 8.0F, -2.0F));
        bone9.addOrReplaceChild("bone9_r1", CubeListBuilder.create()
                .texOffs(112, 44).addBox(-2.0F, -3.0F, -6.0F, 5.0F, 6.0F, 12.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, -0.3491F, 0.0F, 0.0F));
        PartDefinition bone10 = bone6.addOrReplaceChild("bone10",
                CubeListBuilder.create(), PartPose.offset(-1.0F, 2.0F, -1.0F));
        bone10.addOrReplaceChild("bone10_r1", CubeListBuilder.create()
                .texOffs(88, 105).addBox(-3.0F, -8.0F, -5.0F, 7.0F, 15.0F, 10.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3491F, 0.0F, 0.0F));

        // ── LEFT LEG ─────────────────────────────────────────────────────────
        PartDefinition leftLeg = Root.addOrReplaceChild("leftLeg",
                CubeListBuilder.create(), PartPose.offset(2.0F, -12.0F, 0.0F));
        PartDefinition bone5 = leftLeg.addOrReplaceChild("bone5",
                CubeListBuilder.create(), PartPose.offset(8.0F, -11.0F, 8.0F));
        PartDefinition bone = bone5.addOrReplaceChild("bone", CubeListBuilder.create()
                .texOffs(122, 105).addBox(-2.0F, -1.0F, 1.0F, 5.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, 21.0F, -3.0F));
        bone.addOrReplaceChild("bone_r1", CubeListBuilder.create()
                .texOffs(138, 127).addBox(-2.0F, -2.0F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-3.0F, 0.0F, -2.0F, -0.4538F, 0.4538F, 0.2618F));
        bone.addOrReplaceChild("bone_r2", CubeListBuilder.create()
                .texOffs(20, 133).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-3.0F, 0.0F, 0.0F, -0.4538F, 0.4538F, 0.2618F));
        bone.addOrReplaceChild("bone_r3", CubeListBuilder.create()
                .texOffs(98, 135).addBox(0.0F, -2.0F, -1.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.1F))
                .texOffs(74, 135).addBox(2.0F, -2.0F, -1.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.1F)),
                PartPose.offsetAndRotation(-1.0F, 1.0F, 0.0F, 0.4887F, 0.0F, 0.0F));
        bone.addOrReplaceChild("bone_r4", CubeListBuilder.create()
                .texOffs(114, 135).addBox(-1.0F, -1.0F, -2.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.2F)),
                PartPose.offsetAndRotation(4.0F, 0.0F, 1.0F, 0.5236F, -0.384F, -0.2094F));
        PartDefinition bone2 = bone5.addOrReplaceChild("bone2",
                CubeListBuilder.create(), PartPose.offset(-1.0F, 17.0F, 3.0F));
        bone2.addOrReplaceChild("bone2_r1", CubeListBuilder.create()
                .texOffs(54, 80).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.2F)),
                PartPose.offsetAndRotation(-3.0F, 2.0F, -1.0F, 2.9147F, -1.2915F, 2.2166F));
        bone2.addOrReplaceChild("bone2_r2", CubeListBuilder.create()
                .texOffs(134, 132).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.3F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -2.9671F, -1.2915F, 2.2166F));
        bone2.addOrReplaceChild("bone2_r3", CubeListBuilder.create()
                .texOffs(34, 125).addBox(-2.0F, -6.0F, -2.0F, 3.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.0F, -2.0F, 0.0F, -0.3491F, 0.0F, 0.0F));
        PartDefinition bone3 = bone5.addOrReplaceChild("bone3",
                CubeListBuilder.create(), PartPose.offset(1.0F, 8.0F, -2.0F));
        bone3.addOrReplaceChild("bone3_r1", CubeListBuilder.create()
                .texOffs(112, 62).addBox(-3.0F, -3.0F, -6.0F, 5.0F, 6.0F, 12.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, -0.3491F, 0.0F, 0.0F));
        PartDefinition bone4 = bone5.addOrReplaceChild("bone4",
                CubeListBuilder.create(), PartPose.offset(1.0F, 2.0F, -1.0F));
        bone4.addOrReplaceChild("bone4_r1", CubeListBuilder.create()
                .texOffs(0, 108).addBox(-4.0F, -8.0F, -5.0F, 7.0F, 15.0F, 10.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3491F, 0.0F, 0.0F));

        Root.addOrReplaceChild("rightItem",
                CubeListBuilder.create(), PartPose.offset(-6.0F, -15.0F, 1.0F));

        return LayerDefinition.create(meshdefinition, 256, 256);
    }

    @Override
    public void setupAnim(T entity, float limbSwing, float limbSwingAmount,
                          float ageInTicks, float netHeadYaw, float headPitch) {
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer,
                               int packedLight, int packedOverlay,
                               float red, float green, float blue, float alpha) {
        Root.render(poseStack, vertexConsumer, packedLight, packedOverlay,
                    red, green, blue, alpha);
    }
}
