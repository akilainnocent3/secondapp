package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class vi1 implements yzd0 {
    public static final vi1 c;
    public static final vi1 d;
    public final xzd0 a;
    public final String b;

    static {
        new vi1(xzd0.b, "");
        c = new vi1(xzd0.a, "");
        d = new vi1(xzd0.c, "");
    }

    public vi1(xzd0 xzd0Var, String str) {
        this.a = xzd0Var;
        this.b = str;
    }

    @Override // defpackage.yzd0
    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vi1) {
            vi1 vi1Var = (vi1) obj;
            if (this.a.equals(vi1Var.a) && this.b.equals(vi1Var.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.yzd0
    public final xzd0 getStatusCode() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImmutableStatusData{statusCode=");
        sb.append(this.a);
        sb.append(", description=");
        return uf80.a(sb, this.b, "}");
    }
}
