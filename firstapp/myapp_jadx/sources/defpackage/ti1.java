package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class ti1 {
    public static final ti1 c;
    public static final ti1 d;
    public final us60 a;
    public final m21 b;

    static {
        vw0 vw0Var = vw0.d;
        c = new ti1(us60.c, vw0Var);
        d = new ti1(us60.a, vw0Var);
        new ti1(us60.b, vw0Var);
    }

    public ti1(us60 us60Var, m21 m21Var) {
        this.a = us60Var;
        if (m21Var != null) {
            this.b = m21Var;
        } else {
            bmy.a("Null attributes");
            throw null;
        }
    }

    public final m21 a() {
        return this.b;
    }

    public final us60 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ti1)) {
            return false;
        }
        ti1 ti1Var = (ti1) obj;
        return this.a.equals(ti1Var.b()) && this.b.equals(ti1Var.a());
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "ImmutableSamplingResult{decision=" + this.a + ", attributes=" + this.b + "}";
    }
}
