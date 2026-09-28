package com.sportygames.commons.models;

import defpackage.ew7;
import defpackage.tvh;
import defpackage.wi1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b'\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003Jc\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u000200HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000f\"\u0004\b\u0019\u0010\u0011R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u000f\"\u0004\b\u001b\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u000fR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u000fR\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000f\"\u0004\b\u001f\u0010\u0011¨\u00061"}, d2 = {"Lcom/sportygames/commons/models/OnboardingFocusBox;", "", "fromLeftPercent", "", "fromTopPercent", "fromRightPercent", "fromBottomPercent", "leftFactor", "topFactor", "rightFactor", "bottomFactor", "radiusPx", "<init>", "(FFFFFFFFF)V", "getFromLeftPercent", "()F", "setFromLeftPercent", "(F)V", "getFromTopPercent", "setFromTopPercent", "getFromRightPercent", "setFromRightPercent", "getFromBottomPercent", "setFromBottomPercent", "getLeftFactor", "setLeftFactor", "getTopFactor", "setTopFactor", "getRightFactor", "getBottomFactor", "getRadiusPx", "setRadiusPx", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OnboardingFocusBox {
    public static final int $stable = 8;
    private final float bottomFactor;
    private float fromBottomPercent;
    private float fromLeftPercent;
    private float fromRightPercent;
    private float fromTopPercent;
    private float leftFactor;
    private float radiusPx;
    private final float rightFactor;
    private float topFactor;

    public OnboardingFocusBox(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.fromLeftPercent = f;
        this.fromTopPercent = f2;
        this.fromRightPercent = f3;
        this.fromBottomPercent = f4;
        this.leftFactor = f5;
        this.topFactor = f6;
        this.rightFactor = f7;
        this.bottomFactor = f8;
        this.radiusPx = f9;
        if (f < 0.0f || f > 1.0f) {
            this.fromLeftPercent = 0.0f;
        }
        if (f2 < 0.0f || f2 > 1.0f) {
            this.fromTopPercent = 0.0f;
        }
        if (f3 < 0.0f || f3 > 1.0f) {
            this.fromRightPercent = 0.0f;
        }
        if (f4 < 0.0f || f4 > 1.0f) {
            this.fromBottomPercent = 0.0f;
        }
        if (f9 < 0.0f) {
            this.radiusPx = 0.0f;
        }
    }

    public static /* synthetic */ OnboardingFocusBox copy$default(OnboardingFocusBox onboardingFocusBox, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, int i, Object obj) {
        if ((i & 1) != 0) {
            f = onboardingFocusBox.fromLeftPercent;
        }
        if ((i & 2) != 0) {
            f2 = onboardingFocusBox.fromTopPercent;
        }
        if ((i & 4) != 0) {
            f3 = onboardingFocusBox.fromRightPercent;
        }
        if ((i & 8) != 0) {
            f4 = onboardingFocusBox.fromBottomPercent;
        }
        if ((i & 16) != 0) {
            f5 = onboardingFocusBox.leftFactor;
        }
        if ((i & 32) != 0) {
            f6 = onboardingFocusBox.topFactor;
        }
        if ((i & 64) != 0) {
            f7 = onboardingFocusBox.rightFactor;
        }
        if ((i & 128) != 0) {
            f8 = onboardingFocusBox.bottomFactor;
        }
        if ((i & 256) != 0) {
            f9 = onboardingFocusBox.radiusPx;
        }
        float f10 = f8;
        float f11 = f9;
        float f12 = f6;
        float f13 = f7;
        float f14 = f5;
        float f15 = f3;
        return onboardingFocusBox.copy(f, f2, f15, f4, f14, f12, f13, f10, f11);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getFromLeftPercent() {
        return this.fromLeftPercent;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getFromTopPercent() {
        return this.fromTopPercent;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getFromRightPercent() {
        return this.fromRightPercent;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getFromBottomPercent() {
        return this.fromBottomPercent;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final float getLeftFactor() {
        return this.leftFactor;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final float getTopFactor() {
        return this.topFactor;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final float getRightFactor() {
        return this.rightFactor;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final float getBottomFactor() {
        return this.bottomFactor;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final float getRadiusPx() {
        return this.radiusPx;
    }

    public final OnboardingFocusBox copy(float fromLeftPercent, float fromTopPercent, float fromRightPercent, float fromBottomPercent, float leftFactor, float topFactor, float rightFactor, float bottomFactor, float radiusPx) {
        return new OnboardingFocusBox(fromLeftPercent, fromTopPercent, fromRightPercent, fromBottomPercent, leftFactor, topFactor, rightFactor, bottomFactor, radiusPx);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OnboardingFocusBox)) {
            return false;
        }
        OnboardingFocusBox onboardingFocusBox = (OnboardingFocusBox) other;
        return Float.compare(this.fromLeftPercent, onboardingFocusBox.fromLeftPercent) == 0 && Float.compare(this.fromTopPercent, onboardingFocusBox.fromTopPercent) == 0 && Float.compare(this.fromRightPercent, onboardingFocusBox.fromRightPercent) == 0 && Float.compare(this.fromBottomPercent, onboardingFocusBox.fromBottomPercent) == 0 && Float.compare(this.leftFactor, onboardingFocusBox.leftFactor) == 0 && Float.compare(this.topFactor, onboardingFocusBox.topFactor) == 0 && Float.compare(this.rightFactor, onboardingFocusBox.rightFactor) == 0 && Float.compare(this.bottomFactor, onboardingFocusBox.bottomFactor) == 0 && Float.compare(this.radiusPx, onboardingFocusBox.radiusPx) == 0;
    }

    public final float getBottomFactor() {
        return this.bottomFactor;
    }

    public final float getFromBottomPercent() {
        return this.fromBottomPercent;
    }

    public final float getFromLeftPercent() {
        return this.fromLeftPercent;
    }

    public final float getFromRightPercent() {
        return this.fromRightPercent;
    }

    public final float getFromTopPercent() {
        return this.fromTopPercent;
    }

    public final float getLeftFactor() {
        return this.leftFactor;
    }

    public final float getRadiusPx() {
        return this.radiusPx;
    }

    public final float getRightFactor() {
        return this.rightFactor;
    }

    public final float getTopFactor() {
        return this.topFactor;
    }

    public int hashCode() {
        return Float.hashCode(this.radiusPx) + tvh.a(this.bottomFactor, tvh.a(this.rightFactor, tvh.a(this.topFactor, tvh.a(this.leftFactor, tvh.a(this.fromBottomPercent, tvh.a(this.fromRightPercent, tvh.a(this.fromTopPercent, Float.hashCode(this.fromLeftPercent) * 31, 31), 31), 31), 31), 31), 31), 31);
    }

    public final void setFromBottomPercent(float f) {
        this.fromBottomPercent = f;
    }

    public final void setFromLeftPercent(float f) {
        this.fromLeftPercent = f;
    }

    public final void setFromRightPercent(float f) {
        this.fromRightPercent = f;
    }

    public final void setFromTopPercent(float f) {
        this.fromTopPercent = f;
    }

    public final void setLeftFactor(float f) {
        this.leftFactor = f;
    }

    public final void setRadiusPx(float f) {
        this.radiusPx = f;
    }

    public final void setTopFactor(float f) {
        this.topFactor = f;
    }

    public String toString() {
        float f = this.fromLeftPercent;
        float f2 = this.fromTopPercent;
        float f3 = this.fromRightPercent;
        float f4 = this.fromBottomPercent;
        float f5 = this.leftFactor;
        float f6 = this.topFactor;
        float f7 = this.rightFactor;
        float f8 = this.bottomFactor;
        float f9 = this.radiusPx;
        StringBuilder sb = new StringBuilder("OnboardingFocusBox(fromLeftPercent=");
        sb.append(f);
        sb.append(", fromTopPercent=");
        sb.append(f2);
        sb.append(", fromRightPercent=");
        ew7.b(sb, f3, ", fromBottomPercent=", f4, ", leftFactor=");
        ew7.b(sb, f5, ", topFactor=", f6, ", rightFactor=");
        ew7.b(sb, f7, ", bottomFactor=", f8, ", radiusPx=");
        return wi1.a(f9, ")", sb);
    }

    public OnboardingFocusBox() {
        this(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 511, null);
    }

    public /* synthetic */ OnboardingFocusBox(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2, (i & 4) != 0 ? 0.0f : f3, (i & 8) != 0 ? 0.0f : f4, (i & 16) != 0 ? 0.0f : f5, (i & 32) != 0 ? 0.0f : f6, (i & 64) != 0 ? 0.0f : f7, (i & 128) != 0 ? 0.0f : f8, (i & 256) != 0 ? 0.0f : f9);
    }
}
