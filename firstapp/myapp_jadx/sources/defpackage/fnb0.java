package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class fnb0 {
    public final float a;
    public final float b;
    public final float c;
    public final int d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;

    public fnb0(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, int i) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = i;
        this.e = f4;
        this.f = f5;
        this.g = f6;
        this.h = f7;
        this.i = f8;
    }

    public static fnb0 a(fnb0 fnb0Var, float f, float f2, float f3, int i, float f4, float f5, float f6, int i2) {
        if ((i2 & 4) != 0) {
            f3 = fnb0Var.c;
        }
        return new fnb0(f, f2, f3, f4, (i2 & 32) != 0 ? fnb0Var.f : 0.8f, (i2 & 64) != 0 ? fnb0Var.g : 0.4f, f5, f6, (i2 & 8) != 0 ? fnb0Var.d : i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fnb0)) {
            return false;
        }
        fnb0 fnb0Var = (fnb0) obj;
        return Float.compare(this.a, fnb0Var.a) == 0 && Float.compare(this.b, fnb0Var.b) == 0 && Float.compare(this.c, fnb0Var.c) == 0 && this.d == fnb0Var.d && Float.compare(this.e, fnb0Var.e) == 0 && Float.compare(this.f, fnb0Var.f) == 0 && Float.compare(this.g, fnb0Var.g) == 0 && Float.compare(this.h, fnb0Var.h) == 0 && Float.compare(this.i, fnb0Var.i) == 0 && Float.compare(300.0f, 300.0f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(300.0f) + tvh.a(this.i, tvh.a(this.h, tvh.a(this.g, tvh.a(this.f, tvh.a(this.e, gpp.a(this.d, tvh.a(this.c, tvh.a(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SportyCarsConfig(carFinalPosY=");
        sb.append(this.a);
        sb.append(", carStartPosY=");
        sb.append(this.b);
        sb.append(", carBaseScale=");
        sb.append(this.c);
        sb.append(", speedometerMarginTopDp=");
        sb.append(this.d);
        sb.append(", spineMultiplierBaseScale=");
        ew7.b(sb, this.e, ", glowImageHeightScale=", this.f, ", glowImageWidthScale=");
        ew7.b(sb, this.g, ", coeffMultiplierY=", this.h, ", poweringUpYDivideFactor=");
        return wi1.a(this.i, ", topSpineOffsetY=300.0)", sb);
    }
}
