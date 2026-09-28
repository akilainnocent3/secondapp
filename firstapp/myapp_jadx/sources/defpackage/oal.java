package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class oal {
    public final ftt a;
    public final ArrayList b;
    public final ArrayList c;
    public final ArrayList d;
    public final ArrayList e;

    public oal(ftt fttVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.a = fttVar;
        this.b = arrayList;
        this.c = arrayList2;
        this.d = arrayList3;
        this.e = arrayList4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oal)) {
            return false;
        }
        oal oalVar = (oal) obj;
        return this.a.equals(oalVar.a) && this.b.equals(oalVar.b) && this.c.equals(oalVar.c) && this.d.equals(oalVar.d) && this.e.equals(oalVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + vt5.a(this.d, vt5.a(this.c, vt5.a(this.b, this.a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        return "GuestLoyaltyBundle(homeData=" + this.a + ", activities=" + this.b + ", missions=" + this.c + ", challenges=" + this.d + ", betslipThemes=" + this.e + ")";
    }
}
