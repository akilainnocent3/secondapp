package yads;

import android.opengl.Matrix;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class tx0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f156114a = new float[16];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f156115b = new float[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n63 f156116c = new n63();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f156117d;

    public static void a(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float f10 = fArr2[10];
        float f11 = fArr2[8];
        float fSqrt = (float) Math.sqrt((f11 * f11) + (f10 * f10));
        float f12 = fArr2[10] / fSqrt;
        fArr[0] = f12;
        float f13 = fArr2[8];
        fArr[2] = f13 / fSqrt;
        fArr[8] = (-f13) / fSqrt;
        fArr[10] = f12;
    }

    public final void a(long j10, float[] fArr) {
        Object objA;
        n63 n63Var = this.f156116c;
        synchronized (n63Var) {
            objA = n63Var.a(j10, true);
        }
        float[] fArr2 = (float[]) objA;
        if (fArr2 == null) {
            return;
        }
        float[] fArr3 = this.f156115b;
        float f10 = fArr2[0];
        float f11 = -fArr2[1];
        float f12 = -fArr2[2];
        float length = Matrix.length(f10, f11, f12);
        if (length != 0.0f) {
            Matrix.setRotateM(fArr3, 0, (float) Math.toDegrees(length), f10 / length, f11 / length, f12 / length);
        } else {
            Matrix.setIdentityM(fArr3, 0);
        }
        if (!this.f156117d) {
            a(this.f156114a, this.f156115b);
            this.f156117d = true;
        }
        Matrix.multiplyMM(fArr, 0, this.f156114a, 0, this.f156115b, 0);
    }
}
