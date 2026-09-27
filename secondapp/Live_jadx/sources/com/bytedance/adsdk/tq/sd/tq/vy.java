package com.bytedance.adsdk.tq.sd.tq;

import gi.j;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class vy {
    private final float[] hww;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private final int[] f32305tq;

    public vy(float[] fArr, int[] iArr) {
        this.hww = fArr;
        this.f32305tq = iArr;
    }

    public float[] hww() {
        return this.hww;
    }

    public int sd() {
        return this.f32305tq.length;
    }

    public int[] tq() {
        return this.f32305tq;
    }

    public void hww(vy vyVar, vy vyVar2, float f10) {
        if (vyVar.f32305tq.length == vyVar2.f32305tq.length) {
            for (int i10 = 0; i10 < vyVar.f32305tq.length; i10++) {
                this.hww[i10] = com.bytedance.adsdk.tq.hu.hv.hww(vyVar.hww[i10], vyVar2.hww[i10], f10);
                this.f32305tq[i10] = com.bytedance.adsdk.tq.hu.tq.hww(f10, vyVar.f32305tq[i10], vyVar2.f32305tq[i10]);
            }
            return;
        }
        throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + vyVar.f32305tq.length + " vs " + vyVar2.f32305tq.length + j.f86771d);
    }

    public vy hww(float[] fArr) {
        int[] iArr = new int[fArr.length];
        for (int i10 = 0; i10 < fArr.length; i10++) {
            iArr[i10] = hww(fArr[i10]);
        }
        return new vy(fArr, iArr);
    }

    private int hww(float f10) {
        int iBinarySearch = Arrays.binarySearch(this.hww, f10);
        if (iBinarySearch >= 0) {
            return this.f32305tq[iBinarySearch];
        }
        int i10 = -(iBinarySearch + 1);
        if (i10 == 0) {
            return this.f32305tq[0];
        }
        int[] iArr = this.f32305tq;
        if (i10 == iArr.length - 1) {
            return iArr[iArr.length - 1];
        }
        float[] fArr = this.hww;
        int i11 = i10 - 1;
        float f11 = fArr[i11];
        return com.bytedance.adsdk.tq.hu.tq.hww((f10 - f11) / (fArr[i10] - f11), iArr[i11], iArr[i10]);
    }
}
