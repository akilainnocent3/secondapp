package com.yandex.div.internal.drawable;

import ds.a;
import kotlin.jvm.internal.o0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class RadialGradientDrawable$Companion$createRadialGradient$distancesToSides$2 extends o0 implements a<Float[]> {
    final /* synthetic */ float $absoluteCenterX;
    final /* synthetic */ float $absoluteCenterY;
    final /* synthetic */ float $bottomCord;
    final /* synthetic */ float $leftCord;
    final /* synthetic */ float $rightCord;
    final /* synthetic */ float $topCord;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RadialGradientDrawable$Companion$createRadialGradient$distancesToSides$2(float f10, float f11, float f12, float f13, float f14, float f15) {
        super(0);
        this.$leftCord = f10;
        this.$rightCord = f11;
        this.$bottomCord = f12;
        this.$topCord = f13;
        this.$absoluteCenterX = f14;
        this.$absoluteCenterY = f15;
    }

    @Override // ds.a
    @l
    public final Float[] invoke() {
        return new Float[]{Float.valueOf(RadialGradientDrawable.Companion.createRadialGradient$distToVerticalSide(this.$absoluteCenterX, this.$leftCord)), Float.valueOf(RadialGradientDrawable.Companion.createRadialGradient$distToVerticalSide(this.$absoluteCenterX, this.$rightCord)), Float.valueOf(RadialGradientDrawable.Companion.createRadialGradient$distToHorizontalSide(this.$absoluteCenterY, this.$bottomCord)), Float.valueOf(RadialGradientDrawable.Companion.createRadialGradient$distToHorizontalSide(this.$absoluteCenterY, this.$topCord))};
    }
}
