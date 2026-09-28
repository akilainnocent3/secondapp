package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class i58 {
    public float a;
    public float b;
    public float c;
    public float d;

    static {
        i58 i58Var = new i58(1.0f, 1.0f, 1.0f, 1.0f);
        new i58(-1077952513);
        new i58(2139062271);
        new i58(1061109759);
        new i58(0.0f, 0.0f, 0.0f, 1.0f);
        Float.intBitsToFloat((((int) (i58Var.a * 255.0f)) | (((int) (i58Var.d * 255.0f)) << 24) | (((int) (i58Var.c * 255.0f)) << 16) | (((int) (i58Var.b * 255.0f)) << 8)) & (-16777217));
        new i58(0.0f, 0.0f, 0.0f, 0.0f);
        new i58(1.0f, 1.0f, 1.0f, 0.0f);
        new i58(0.0f, 0.0f, 1.0f, 1.0f);
        new i58(0.0f, 0.0f, 0.5f, 1.0f);
        new i58(1097458175);
        new i58(1887473919);
        new i58(-2016482305);
        new i58(0.0f, 1.0f, 1.0f, 1.0f);
        new i58(0.0f, 0.5f, 0.5f, 1.0f);
        new i58(16711935);
        new i58(2147418367);
        new i58(852308735);
        new i58(579543807);
        new i58(1804477439);
        new i58(-65281);
        new i58(-2686721);
        new i58(-626712321);
        new i58(-5963521);
        new i58(-1958407169);
        new i58(-759919361);
        new i58(-1306385665);
        new i58(-16776961);
        new i58(-13361921);
        new i58(-8433409);
        new i58(-92245249);
        new i58(-9849601);
        new i58(1.0f, 0.0f, 1.0f, 1.0f);
        new i58(-1608453889);
        new i58(-293409025);
        new i58(-1339006721);
    }

    public i58(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        b();
    }

    public static void c(i58 i58Var, int i) {
        i58Var.a = ((16711680 & i) >>> 16) / 255.0f;
        i58Var.b = ((65280 & i) >>> 8) / 255.0f;
        i58Var.c = (i & 255) / 255.0f;
    }

    public static void d(i58 i58Var, int i) {
        i58Var.a = (((-16777216) & i) >>> 24) / 255.0f;
        i58Var.b = ((16711680 & i) >>> 16) / 255.0f;
        i58Var.c = ((65280 & i) >>> 8) / 255.0f;
        i58Var.d = (i & 255) / 255.0f;
    }

    public static void g(String str, i58 i58Var) {
        if (str.charAt(0) == '#') {
            str = str.substring(1);
        }
        i58Var.a = Integer.parseInt(str.substring(0, 2), 16) / 255.0f;
        i58Var.b = Integer.parseInt(str.substring(2, 4), 16) / 255.0f;
        i58Var.c = Integer.parseInt(str.substring(4, 6), 16) / 255.0f;
        i58Var.d = str.length() != 8 ? 1.0f : Integer.parseInt(str.substring(6, 8), 16) / 255.0f;
    }

    public final void a(float f, float f2, float f3, float f4) {
        this.a += f;
        this.b += f2;
        this.c += f3;
        this.d += f4;
        b();
    }

    public final void b() {
        float f = this.a;
        if (f < 0.0f) {
            this.a = 0.0f;
        } else if (f > 1.0f) {
            this.a = 1.0f;
        }
        float f2 = this.b;
        if (f2 < 0.0f) {
            this.b = 0.0f;
        } else if (f2 > 1.0f) {
            this.b = 1.0f;
        }
        float f3 = this.c;
        if (f3 < 0.0f) {
            this.c = 0.0f;
        } else if (f3 > 1.0f) {
            this.c = 1.0f;
        }
        float f4 = this.d;
        if (f4 < 0.0f) {
            this.d = 0.0f;
        } else if (f4 > 1.0f) {
            this.d = 1.0f;
        }
    }

    public final void e(i58 i58Var) {
        this.a = i58Var.a;
        this.b = i58Var.b;
        this.c = i58Var.c;
        this.d = i58Var.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && i58.class == obj.getClass() && f() == ((i58) obj).f();
    }

    public final int f() {
        return ((int) (this.a * 255.0f)) | (((int) (this.d * 255.0f)) << 24) | (((int) (this.c * 255.0f)) << 16) | (((int) (this.b * 255.0f)) << 8);
    }

    public final int hashCode() {
        float f = this.a;
        int iFloatToIntBits = (f != 0.0f ? Float.floatToIntBits(f) : 0) * 31;
        float f2 = this.b;
        int iFloatToIntBits2 = (iFloatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31;
        float f3 = this.c;
        int iFloatToIntBits3 = (iFloatToIntBits2 + (f3 != 0.0f ? Float.floatToIntBits(f3) : 0)) * 31;
        float f4 = this.d;
        return iFloatToIntBits3 + (f4 != 0.0f ? Float.floatToIntBits(f4) : 0);
    }

    public final String toString() {
        String hexString = Integer.toHexString(((int) (this.d * 255.0f)) | (((int) (this.a * 255.0f)) << 24) | (((int) (this.b * 255.0f)) << 16) | (((int) (this.c * 255.0f)) << 8));
        while (hexString.length() < 8) {
            hexString = "0".concat(hexString);
        }
        return hexString;
    }

    public i58(int i) {
        d(this, i);
    }

    public i58() {
    }
}
