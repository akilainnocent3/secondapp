package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class r8k0 extends h68 {
    @Override // defpackage.h68
    public final float[] a(float[] fArr) {
        float f = fArr[0];
        if (f < -2.0f) {
            f = -2.0f;
        }
        if (f > 2.0f) {
            f = 2.0f;
        }
        fArr[0] = f;
        float f2 = fArr[1];
        if (f2 < -2.0f) {
            f2 = -2.0f;
        }
        if (f2 > 2.0f) {
            f2 = 2.0f;
        }
        fArr[1] = f2;
        float f3 = fArr[2];
        float f4 = f3 >= -2.0f ? f3 : -2.0f;
        fArr[2] = f4 <= 2.0f ? f4 : 2.0f;
        return fArr;
    }

    @Override // defpackage.h68
    public final float b(int i) {
        return 2.0f;
    }

    @Override // defpackage.h68
    public final float c(int i) {
        return -2.0f;
    }

    @Override // defpackage.h68
    public final long e(float f, float f2, float f3) {
        if (f < -2.0f) {
            f = -2.0f;
        }
        if (f > 2.0f) {
            f = 2.0f;
        }
        if (f2 < -2.0f) {
            f2 = -2.0f;
        }
        return (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2 <= 2.0f ? f2 : 2.0f)) & 4294967295L);
    }

    @Override // defpackage.h68
    public final float[] f(float[] fArr) {
        float f = fArr[0];
        if (f < -2.0f) {
            f = -2.0f;
        }
        if (f > 2.0f) {
            f = 2.0f;
        }
        fArr[0] = f;
        float f2 = fArr[1];
        if (f2 < -2.0f) {
            f2 = -2.0f;
        }
        if (f2 > 2.0f) {
            f2 = 2.0f;
        }
        fArr[1] = f2;
        float f3 = fArr[2];
        float f4 = f3 >= -2.0f ? f3 : -2.0f;
        fArr[2] = f4 <= 2.0f ? f4 : 2.0f;
        return fArr;
    }

    @Override // defpackage.h68
    public final float g(float f, float f2, float f3) {
        if (f3 < -2.0f) {
            f3 = -2.0f;
        }
        if (f3 > 2.0f) {
            return 2.0f;
        }
        return f3;
    }

    @Override // defpackage.h68
    public final long h(float f, float f2, float f3, float f4, h68 h68Var) {
        if (f < -2.0f) {
            f = -2.0f;
        }
        if (f > 2.0f) {
            f = 2.0f;
        }
        if (f2 < -2.0f) {
            f2 = -2.0f;
        }
        if (f2 > 2.0f) {
            f2 = 2.0f;
        }
        if (f3 < -2.0f) {
            f3 = -2.0f;
        }
        return r58.a(f, f2, f3 <= 2.0f ? f3 : 2.0f, f4, h68Var);
    }
}
