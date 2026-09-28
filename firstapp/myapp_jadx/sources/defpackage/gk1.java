package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class gk1 extends pg50 {
    public final String d;
    public final m21 e;

    public gk1(m21 m21Var, String str) {
        this.d = str;
        if (m21Var != null) {
            this.e = m21Var;
        } else {
            bmy.a("Null attributes");
            throw null;
        }
    }

    @Override // defpackage.pg50
    public final m21 b() {
        return this.e;
    }

    @Override // defpackage.pg50
    public final String c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pg50)) {
            return false;
        }
        pg50 pg50Var = (pg50) obj;
        String str = this.d;
        if (str == null) {
            if (pg50Var.c() != null) {
                return false;
            }
        } else if (!str.equals(pg50Var.c())) {
            return false;
        }
        return this.e.equals(pg50Var.b());
    }

    public final int hashCode() {
        String str = this.d;
        return this.e.hashCode() ^ (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "Resource{schemaUrl=" + this.d + ", attributes=" + this.e + "}";
    }
}
