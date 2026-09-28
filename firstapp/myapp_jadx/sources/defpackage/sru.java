package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class sru {
    public final int a;
    public final String b;
    public final String c;

    public sru(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sru)) {
            return false;
        }
        sru sruVar = (sru) obj;
        return this.a == sruVar.a && this.b.equals(sruVar.b) && this.c.equals(sruVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + gmf0.a(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return uf80.a(uqe0.a(this.a, "MarketUiItem(rank=", ", name=", this.b, ", tag="), this.c, ")");
    }
}
