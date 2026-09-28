package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class bdv {
    public static float a(float f, float f2, float f3, float f4) {
        return (float) Math.hypot(f3 - f, f4 - f2);
    }

    public static float b(float f, float f2, float f3, float f4) {
        float fA = a(f, f2, 0.0f, 0.0f);
        float fA2 = a(f, f2, f3, 0.0f);
        float fA3 = a(f, f2, f3, f4);
        float fA4 = a(f, f2, 0.0f, f4);
        if (fA > fA2 && fA > fA3 && fA > fA4) {
            return fA;
        }
        if (fA2 <= fA3 || fA2 <= fA4) {
            return fA3 > fA4 ? fA3 : fA4;
        }
        return fA2;
    }

    public static float c(float f, float f2, float f3) {
        return (f3 * f2) + ((1.0f - f3) * f);
    }
}
