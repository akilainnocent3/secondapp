package com.inmobi.media;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* JADX INFO: renamed from: com.inmobi.media.v1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C4053v1 extends Animation {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f57876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f57877c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Camera f57879e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f57875a = 90.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f57878d = true;

    public C4053v1(float f10, float f11) {
        this.f57876b = f10;
        this.f57877c = f11;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f10, Transformation t10) {
        kotlin.jvm.internal.m0.p(t10, "t");
        float f11 = ((this.f57875a - 0.0f) * f10) + 0.0f;
        float f12 = this.f57876b;
        float f13 = this.f57877c;
        Camera camera = this.f57879e;
        Matrix matrix = t10.getMatrix();
        if (camera != null) {
            camera.save();
            if (this.f57878d) {
                camera.translate(0.0f, 0.0f, f10 * 0.0f);
            } else {
                camera.translate(0.0f, 0.0f, (1.0f - f10) * 0.0f);
            }
            camera.rotateY(f11);
            camera.getMatrix(matrix);
            camera.restore();
        }
        matrix.preTranslate(-f12, -f13);
        matrix.postTranslate(f12, f13);
    }

    @Override // android.view.animation.Animation
    public final void initialize(int i10, int i11, int i12, int i13) {
        super.initialize(i10, i11, i12, i13);
        this.f57879e = new Camera();
    }
}
