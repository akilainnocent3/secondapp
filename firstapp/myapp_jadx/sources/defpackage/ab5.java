package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ab5 implements kjf0 {
    public final dx80 a;
    public final float b;

    public ab5(dx80 dx80Var, float f) {
        this.a = dx80Var;
        this.b = f;
    }

    @Override // defpackage.kjf0
    public final float a() {
        return this.b;
    }

    @Override // defpackage.kjf0
    public final long d() {
        int i = j58.n;
        return j58.m;
    }

    @Override // defpackage.kjf0
    public final ya5 e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ab5)) {
            return false;
        }
        ab5 ab5Var = (ab5) obj;
        return this.a.equals(ab5Var.a) && Float.compare(this.b, ab5Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BrushStyle(value=");
        sb.append(this.a);
        sb.append(", alpha=");
        return h70.a(sb, this.b, ')');
    }
}
