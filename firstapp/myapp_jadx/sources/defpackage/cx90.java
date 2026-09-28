package defpackage;

import android.util.SizeF;

/* JADX INFO: loaded from: classes.dex */
public final class cx90 {
    private final float a;
    private final float b;

    public cx90(float f, float f2) {
        km20.c(f, "width");
        this.a = f;
        km20.c(f2, "height");
        this.b = f2;
    }

    public static cx90 d(SizeF sizeF) {
        sizeF.getClass();
        return new cx90(sizeF.getWidth(), sizeF.getHeight());
    }

    public float a() {
        return this.b;
    }

    public float b() {
        return this.a;
    }

    public SizeF c() {
        return new SizeF(b(), a());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cx90)) {
            return false;
        }
        cx90 cx90Var = (cx90) obj;
        return cx90Var.a == this.a && cx90Var.b == this.b;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.b) ^ Float.floatToIntBits(this.a);
    }

    public String toString() {
        return this.a + "x" + this.b;
    }
}
