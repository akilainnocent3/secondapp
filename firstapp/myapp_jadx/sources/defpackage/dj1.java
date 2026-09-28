package defpackage;

/* JADX INFO: loaded from: classes8.dex */
@Deprecated
public final class dj1 {
    public static final /* synthetic */ int d = 0;
    public final String a;
    public final String b;
    public final String c;

    static {
        new dj1("", null, null);
    }

    public dj1(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dj1)) {
            return false;
        }
        dj1 dj1Var = (dj1) obj;
        if (!this.a.equals(dj1Var.a)) {
            return false;
        }
        String str = this.b;
        if (str == null) {
            if (dj1Var.b() != null) {
                return false;
            }
        } else if (!str.equals(dj1Var.b())) {
            return false;
        }
        String str2 = this.c;
        if (str2 == null) {
            return dj1Var.a() == null;
        }
        return str2.equals(dj1Var.a());
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.c;
        return iHashCode2 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstrumentationLibraryInfo{name=");
        sb.append(this.a);
        sb.append(", version=");
        sb.append(this.b);
        sb.append(", schemaUrl=");
        return uf80.a(sb, this.c, "}");
    }
}
