package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tv5 {
    public static final float[][] a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] c = {95.047f, 100.0f, 108.883f};
    public static final float[][] d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    public static float a(int i, int i2, int i3) {
        float f = i2 / i3;
        if (f >= 2.0f) {
            if (i == 1) {
                return 0.8f;
            }
            if (i != 2) {
                return i != 3 ? 0.53f : 0.65f;
            }
            return 0.73f;
        }
        if (f >= 1.89f) {
            if (i == 1) {
                return 0.85f;
            }
            if (i != 2) {
                return i != 3 ? 0.5f : 0.66f;
            }
            return 0.75f;
        }
        if (f >= 1.5f) {
            if (i == 1) {
                return 1.0f;
            }
            if (i != 2) {
                return i != 3 ? 0.7f : 0.8f;
            }
            return 0.9f;
        }
        if (i == 1) {
            return 1.0f;
        }
        if (i != 2) {
            return i != 3 ? 0.7f : 0.8f;
        }
        return 0.9f;
    }

    public static int b(float f) {
        if (f < 1.0f) {
            return -16777216;
        }
        if (f > 99.0f) {
            return -1;
        }
        float f2 = (f + 16.0f) / 116.0f;
        float f3 = f > 8.0f ? f2 * f2 * f2 : f / 903.2963f;
        float f4 = f2 * f2 * f2;
        boolean z = f4 > 0.008856452f;
        float f5 = z ? f4 : ((f2 * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f4 = ((f2 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = c;
        return b78.a(f5 * fArr[0], f3 * fArr[1], f4 * fArr[2]);
    }

    public static float c(int i) {
        float f = i / 255.0f;
        return (f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static float d() {
        return ((float) Math.pow(0.5689655172413793d, 3.0d)) * 100.0f;
    }
}
