package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wy80 {
    public static p060 a(int i) {
        int i2 = (i & 1) != 0 ? 8 : 10;
        return q060.a(i2, 1.0f / ((float) Math.cos(csh0.b / i2)), new w4b(2), null);
    }

    public static final p060 b(int i, float f, w4b w4bVar) {
        w4bVar.getClass();
        if (f <= 0.0f) {
            hb5.a("Star radii must both be greater than 0");
            return null;
        }
        if (f >= 1.0f) {
            hb5.a("innerRadius must be less than radius");
            return null;
        }
        float[] fArr = new float[i * 4];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            float f2 = csh0.b / i;
            long jE = csh0.e(1.0f, 2.0f * f2 * i3);
            fArr[i2] = a020.d(jE) + 0.0f;
            fArr[i2 + 1] = a020.e(jE) + 0.0f;
            long jE2 = csh0.e(f, f2 * ((i3 * 2) + 1));
            int i4 = i2 + 3;
            fArr[i2 + 2] = a020.d(jE2) + 0.0f;
            i2 += 4;
            fArr[i4] = a020.e(jE2) + 0.0f;
        }
        return q060.b(fArr, w4bVar, null, 0.0f, 0.0f);
    }
}
