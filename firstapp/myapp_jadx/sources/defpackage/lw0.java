package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class lw0 {
    public final int a;
    public final float b;
    public int c;
    public int d;
    public final float e;
    public final float f;
    public final int g;
    public final float h;

    public lw0(int i, float f, float f2, float f3, int i2, float f4, int i3, float f5, int i4, float f6) {
        float f7;
        this.a = i;
        float fA = cdv.a(f, f2, f3);
        this.b = fA;
        this.c = i2;
        this.e = f4;
        this.d = i3;
        this.f = f5;
        this.g = i4;
        float f8 = i4;
        float f9 = (f4 * i3) + (f5 * f8);
        float f10 = i2;
        float f11 = f6 - ((fA * f10) + f9);
        if (i2 > 0 && f11 > 0.0f) {
            fA += Math.min(f11 / f10, f3 - fA);
            this.b = fA;
        } else if (i2 > 0 && f11 < 0.0f) {
            fA += Math.max(f11 / f10, f2 - fA);
            this.b = fA;
        }
        int i5 = this.c;
        fA = i5 <= 0 ? 0.0f : fA;
        this.b = fA;
        int i6 = this.d;
        float f12 = i6;
        float f13 = f12 / 2.0f;
        float f14 = (f6 - ((i5 + f13) * (i5 > 0 ? fA : 0.0f))) / (f13 + f8);
        this.f = f14;
        float f15 = (fA + f14) / 2.0f;
        this.e = f15;
        if (i6 > 0 && f14 != f5) {
            float f16 = (f5 - f14) * f8;
            float fMin = Math.min(Math.abs(f16), f15 * 0.1f * f12);
            float f17 = this.e;
            int i7 = this.d;
            if (f16 > 0.0f) {
                f7 = f17 - (fMin / i7);
                this.e = f7;
                f14 = (fMin / f8) + this.f;
                this.f = f14;
            } else {
                f7 = (fMin / i7) + f17;
                this.e = f7;
                f14 = this.f - (fMin / f8);
                this.f = f14;
            }
            f15 = f7;
            i6 = i7;
        }
        this.h = (i4 <= 0 || this.c <= 0 || i6 <= 0 ? i4 <= 0 || this.c <= 0 || f14 > this.b : f14 > f15 && f15 > this.b) ? i * Math.abs(f5 - f14) : Float.MAX_VALUE;
    }

    public static lw0 a(float f, float f2, float f3, float f4, int[] iArr, float f5, int[] iArr2, float f6, int[] iArr3) {
        lw0 lw0Var = null;
        int i = 1;
        for (int i2 : iArr3) {
            int length = iArr2.length;
            int i3 = 0;
            while (i3 < length) {
                int i4 = iArr2[i3];
                int length2 = iArr.length;
                int i5 = 0;
                while (i5 < length2) {
                    int i6 = length;
                    int i7 = i3;
                    int i8 = i;
                    int i9 = length2;
                    int i10 = i5;
                    lw0 lw0Var2 = new lw0(i8, f2, f3, f4, iArr[i5], f5, i4, f6, i2, f);
                    float f7 = lw0Var2.h;
                    if (lw0Var == null || f7 < lw0Var.h) {
                        if (f7 == 0.0f) {
                            return lw0Var2;
                        }
                        lw0Var = lw0Var2;
                    }
                    int i11 = i8 + 1;
                    i5 = i10 + 1;
                    i3 = i7;
                    i = i11;
                    length = i6;
                    length2 = i9;
                }
                i3++;
                i = i;
                length = length;
            }
        }
        return lw0Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Arrangement [priority=");
        sb.append(this.a);
        sb.append(", smallCount=");
        sb.append(this.c);
        sb.append(", smallSize=");
        sb.append(this.b);
        sb.append(", mediumCount=");
        sb.append(this.d);
        sb.append(", mediumSize=");
        sb.append(this.e);
        sb.append(", largeCount=");
        sb.append(this.g);
        sb.append(", largeSize=");
        sb.append(this.f);
        sb.append(", cost=");
        return wi1.a(this.h, "]", sb);
    }
}
