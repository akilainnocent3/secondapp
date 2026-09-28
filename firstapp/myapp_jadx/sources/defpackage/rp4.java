package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class rp4 {
    public final float a;
    public final float b;

    public rp4(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public static rp4 a(rp4 rp4Var, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = rp4Var.a;
        }
        if ((i & 2) != 0) {
            f2 = rp4Var.b;
        }
        rp4Var.getClass();
        return new rp4(f, f2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rp4)) {
            return false;
        }
        rp4 rp4Var = (rp4) obj;
        return Float.compare(this.a, rp4Var.a) == 0 && Float.compare(this.b, rp4Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BonusCupVec2(x=");
        sb.append(this.a);
        sb.append(", y=");
        return h70.a(sb, this.b, ')');
    }
}
