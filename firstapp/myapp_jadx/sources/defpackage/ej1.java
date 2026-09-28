package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class ej1 extends oso {
    public final String b;
    public final String c;
    public final String d;
    public final m21 e;

    public ej1(String str, String str2, String str3, m21 m21Var) {
        if (str == null) {
            bmy.a("Null name");
            throw null;
        }
        this.b = str;
        this.c = str2;
        this.d = str3;
        if (m21Var != null) {
            this.e = m21Var;
        } else {
            bmy.a("Null attributes");
            throw null;
        }
    }

    @Override // defpackage.oso
    public final m21 b() {
        return this.e;
    }

    @Override // defpackage.oso
    public final String c() {
        return this.b;
    }

    @Override // defpackage.oso
    public final String d() {
        return this.d;
    }

    @Override // defpackage.oso
    public final String e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof oso)) {
            return false;
        }
        oso osoVar = (oso) obj;
        if (!this.b.equals(osoVar.c())) {
            return false;
        }
        String str = this.c;
        if (str == null) {
            if (osoVar.e() != null) {
                return false;
            }
        } else if (!str.equals(osoVar.e())) {
            return false;
        }
        String str2 = this.d;
        if (str2 == null) {
            if (osoVar.d() != null) {
                return false;
            }
        } else if (!str2.equals(osoVar.d())) {
            return false;
        }
        return this.e.equals(osoVar.b());
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() ^ 1000003) * 1000003;
        String str = this.c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.d;
        return this.e.hashCode() ^ ((iHashCode2 ^ (str2 != null ? str2.hashCode() : 0)) * 1000003);
    }

    public final String toString() {
        return "InstrumentationScopeInfo{name=" + this.b + ", version=" + this.c + ", schemaUrl=" + this.d + ", attributes=" + this.e + "}";
    }
}
