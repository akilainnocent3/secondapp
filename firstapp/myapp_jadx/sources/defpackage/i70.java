package defpackage;

import kotlin.ranges.f;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes.dex */
public final class i70 {
    public static final float[] a;

    public static final class a {
        public final float a;
        public final float b;

        public a(float f, float f2) {
            this.a = f;
            this.b = f2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.a, aVar.a) == 0 && Float.compare(this.b, aVar.b) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FlingResult(distanceCoefficient=");
            sb.append(this.a);
            sb.append(", velocityCoefficient=");
            return h70.a(sb, this.b, ')');
        }
    }

    static {
        float f;
        float fA;
        float f2;
        float f3;
        float f4;
        float f5;
        float fA2;
        float f6;
        float f7;
        float f8;
        float[] fArr = new float[HttpStatusCodesKt.HTTP_SWITCHING_PROTOCOLS];
        a = fArr;
        float[] fArr2 = new float[HttpStatusCodesKt.HTTP_SWITCHING_PROTOCOLS];
        float f9 = 0.0f;
        int i = 0;
        float f10 = 0.0f;
        while (true) {
            float f11 = 1.0f;
            if (i >= 100) {
                fArr2[100] = 1.0f;
                fArr[100] = 1.0f;
                return;
            }
            float f12 = i / 100.0f;
            float f13 = 1.0f;
            while (true) {
                f = 2.0f;
                fA = g70.a(f13, f9, 2.0f, f9);
                f2 = f11 - fA;
                f3 = fA * 3.0f * f2;
                f4 = fA * fA * fA;
                float f14 = (((fA * 0.35000002f) + (f2 * 0.175f)) * f3) + f4;
                f5 = f11;
                if (Math.abs(f14 - f12) < 1.0E-5d) {
                    break;
                }
                if (f14 > f12) {
                    f13 = fA;
                } else {
                    f9 = fA;
                }
                f11 = f5;
            }
            float f15 = 0.5f;
            fArr[i] = (((f2 * 0.5f) + fA) * f3) + f4;
            float f16 = f5;
            while (true) {
                fA2 = g70.a(f16, f10, f, f10);
                f6 = f5 - fA2;
                f7 = fA2 * 3.0f * f6;
                f8 = fA2 * fA2 * fA2;
                float f17 = (((f6 * f15) + fA2) * f7) + f8;
                if (Math.abs(f17 - f12) >= 1.0E-5d) {
                    if (f17 > f12) {
                        f16 = fA2;
                    } else {
                        f10 = fA2;
                    }
                    f15 = 0.5f;
                    f = 2.0f;
                }
            }
            fArr2[i] = (((fA2 * 0.35000002f) + (f6 * 0.175f)) * f7) + f8;
            i++;
        }
    }

    public static a a(float f) {
        float f2 = 0.0f;
        float f3 = 1.0f;
        float fD = f.d(f, 0.0f, 1.0f);
        int i = (int) (100.0f * fD);
        if (i < 100) {
            float f4 = i / 100.0f;
            int i2 = i + 1;
            float[] fArr = a;
            float f5 = fArr[i];
            float f6 = (fArr[i2] - f5) / ((i2 / 100.0f) - f4);
            float fA = hxa.a(fD, f4, f6, f5);
            f2 = f6;
            f3 = fA;
        }
        return new a(f3, f2);
    }
}
