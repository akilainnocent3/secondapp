package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class zf40 {
    public final boolean a;
    public final String b;
    public final String c;

    public zf40(boolean z, String str, String str2) {
        this.a = z;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zf40)) {
            return false;
        }
        zf40 zf40Var = (zf40) obj;
        return this.a == zf40Var.a && this.b.equals(zf40Var.b) && this.c.equals(zf40Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + gmf0.a(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return uf80.a(t160.a("RecentAccountRow(isSelected=", ", unformattedAccountNumber=", this.b, ", formattedAccountNumber=", this.a), this.c, ")");
    }
}
