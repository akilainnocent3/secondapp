package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class yqb0 {

    public static final class a {
        public final float a;
        public final float b;
        public final float c;
        public final float d;

        public a(float f, float f2, float f3, float f4) {
            this.a = f;
            this.b = f2;
            this.c = f3;
            this.d = f4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.a, aVar.a) == 0 && Float.compare(this.b, aVar.b) == 0 && Float.compare(this.c, aVar.c) == 0 && Float.compare(this.d, aVar.d) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.d) + tvh.a(this.c, tvh.a(this.b, Float.hashCode(this.a) * 31, 31), 31);
        }

        public final String toString() {
            return "ArrowPlacement(offsetX=" + this.a + ", offsetY=" + this.b + ", heightPx=" + this.c + ", widthPx=" + this.d + ")";
        }
    }

    /* JADX INFO: loaded from: classes8.dex */
    public static final class b {
        public final lk40 a;
        public final float b;

        public b(lk40 lk40Var, float f) {
            this.a = lk40Var;
            this.b = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a.equals(bVar.a) && Float.compare(this.b, bVar.b) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "BetHolePlacement(rect=" + this.a + ", boxUpFraction=" + this.b + ")";
        }
    }

    public static a a(lk40 lk40Var, float f, float f2) {
        lk40Var.getClass();
        float fFloatValue = ((1.0f - new Float[]{Float.valueOf(0.51f), Float.valueOf(0.03f)}[0].floatValue()) + 0.04f) * f;
        float f3 = lk40Var.b;
        float f4 = lk40Var.d;
        float f5 = f4 - f3;
        if (f5 < 0.0f) {
            f5 = 0.0f;
        }
        float f6 = 0.85f * f5;
        float f7 = ((f5 - f6) / 2.0f) + (f2 - f4);
        float f8 = 0.72f * f6;
        return new a((f - fFloatValue) - f8, (f2 - f7) - f6, f6, f8);
    }

    public static lk40 b(lk40 lk40Var, float f, float f2, n6a n6aVar, float f3) {
        float fFloatValue;
        float f4 = n6aVar.m;
        float f5 = n6aVar.l;
        float f6 = n6aVar.b;
        float f7 = n6aVar.a;
        float f8 = lk40Var.c;
        float f9 = lk40Var.b;
        float f10 = lk40Var.d;
        float f11 = lk40Var.a;
        if (f8 - f11 <= 0.0f) {
            return null;
        }
        float f12 = f10 - f9;
        if (f12 <= 0.0f || f <= 0.0f || f2 <= 0.0f) {
            return null;
        }
        float f13 = f7 + f6 + f5 + f4 + n6aVar.n;
        if (f13 <= 0.0f) {
            return null;
        }
        Float f14 = n6aVar.o;
        if (f14 != null) {
            fFloatValue = (f8 - f11) * f14.floatValue();
        } else {
            fFloatValue = 0.0f;
        }
        float f15 = f11 + fFloatValue;
        float f16 = (f8 - fFloatValue) - f15;
        if (f16 < 0.0f) {
            f16 = 0.0f;
        }
        float f17 = f16 - (f3 < 0.0f ? 0.0f : f3);
        float f18 = n6aVar.p;
        float f19 = n6aVar.q;
        float f20 = f18 + f19;
        if (f20 <= 0.0f || f17 <= 0.0f) {
            return null;
        }
        float f21 = ((f7 + f6) + f5) / f13;
        float f22 = f15 + ((f18 / f20) * f17) + f3;
        return new lk40(f22, (f12 * f21) + f9, ((f19 / f20) * f17) + f22, ((f21 + (f4 / f13)) * f12) + f9);
    }
}
