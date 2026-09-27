package gh;

import android.opengl.Matrix;
import eh.b0;
import eh.e1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f86623a = new float[16];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f86624b = new float[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e1<float[]> f86625c = new e1<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f86626d;

    public static void a(float[] fArr, float[] fArr2) {
        b0.M(fArr);
        float f10 = fArr2[10];
        float f11 = fArr2[8];
        float fSqrt = (float) Math.sqrt((f10 * f10) + (f11 * f11));
        float f12 = fArr2[10];
        fArr[0] = f12 / fSqrt;
        float f13 = fArr2[8];
        fArr[2] = f13 / fSqrt;
        fArr[8] = (-f13) / fSqrt;
        fArr[10] = f12 / fSqrt;
    }

    public static void b(float[] fArr, float[] fArr2) {
        float f10 = fArr2[0];
        float f11 = -fArr2[1];
        float f12 = -fArr2[2];
        float length = Matrix.length(f10, f11, f12);
        if (length != 0.0f) {
            Matrix.setRotateM(fArr, 0, (float) Math.toDegrees(length), f10 / length, f11 / length, f12 / length);
        } else {
            b0.M(fArr);
        }
    }

    public boolean c(float[] fArr, long j10) {
        float[] fArrJ = this.f86625c.j(j10);
        if (fArrJ == null) {
            return false;
        }
        b(this.f86624b, fArrJ);
        if (!this.f86626d) {
            a(this.f86623a, this.f86624b);
            this.f86626d = true;
        }
        Matrix.multiplyMM(fArr, 0, this.f86623a, 0, this.f86624b, 0);
        return true;
    }

    public void d() {
        this.f86625c.c();
        this.f86626d = false;
    }

    public void e(long j10, float[] fArr) {
        this.f86625c.a(j10, fArr);
    }
}
