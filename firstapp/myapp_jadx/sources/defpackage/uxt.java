package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class uxt {
    public final ArrayList a;
    public final ArrayList b;
    public final ArrayList c;
    public final ArrayList d;

    public uxt(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.a = arrayList;
        this.b = arrayList2;
        this.c = arrayList3;
        this.d = arrayList4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uxt)) {
            return false;
        }
        uxt uxtVar = (uxt) obj;
        return this.a.equals(uxtVar.a) && this.b.equals(uxtVar.b) && this.c.equals(uxtVar.c) && this.d.equals(uxtVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + vt5.a(this.c, vt5.a(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "LoyaltyOverviewV2(rewards=" + this.a + ", missions=" + this.b + ", challenges=" + this.c + ", betslipThemes=" + this.d + ")";
    }
}
