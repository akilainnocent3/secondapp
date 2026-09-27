package com.bytedance.adsdk.tq;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.Interpolator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
class wgt implements Interpolator {
    private final float[] hww;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private final float[] f32361tq;

    public wgt(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int i10 = (int) (length / 0.002f);
        int i11 = i10 + 1;
        this.hww = new float[i11];
        this.f32361tq = new float[i11];
        float[] fArr = new float[2];
        for (int i12 = 0; i12 < i11; i12++) {
            pathMeasure.getPosTan((i12 * length) / i10, fArr, null);
            this.hww[i12] = fArr[0];
            this.f32361tq[i12] = fArr[1];
        }
    }

    private static Path hww(float f10, float f11, float f12, float f13) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f10, f11, f12, f13, 1.0f, 1.0f);
        return path;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f10) {
        if (f10 <= 0.0f) {
            return 0.0f;
        }
        if (f10 >= 1.0f) {
            return 1.0f;
        }
        int length = this.hww.length - 1;
        int i10 = 0;
        while (length - i10 > 1) {
            int i11 = (i10 + length) / 2;
            if (f10 < this.hww[i11]) {
                length = i11;
            } else {
                i10 = i11;
            }
        }
        float[] fArr = this.hww;
        float f11 = fArr[length];
        float f12 = fArr[i10];
        float f13 = f11 - f12;
        if (f13 == 0.0f) {
            return this.f32361tq[i10];
        }
        float f14 = (f10 - f12) / f13;
        float[] fArr2 = this.f32361tq;
        float f15 = fArr2[i10];
        return f15 + (f14 * (fArr2[length] - f15));
    }

    public wgt(float f10, float f11, float f12, float f13) {
        this(hww(f10, f11, f12, f13));
    }
}
