package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class jqc0 {
    public final boolean a;
    public final kqc0 b;

    public jqc0(boolean z, kqc0 kqc0Var) {
        this.a = z;
        this.b = kqc0Var;
    }

    public static jqc0 a(jqc0 jqc0Var, kqc0 kqc0Var) {
        return new jqc0(jqc0Var.a, kqc0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jqc0)) {
            return false;
        }
        jqc0 jqc0Var = (jqc0) obj;
        return this.a == jqc0Var.a && this.b == jqc0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "SportyLegendsTutorialState(enabled=" + this.a + ", step=" + this.b + ")";
    }

    public jqc0() {
        this(0);
    }

    public /* synthetic */ jqc0(int i) {
        this(false, kqc0.d);
    }
}
