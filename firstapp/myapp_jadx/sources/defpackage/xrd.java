package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class xrd {
    public final ArrayList a;
    public final ArrayList b;
    public final String c;

    public xrd(ArrayList arrayList, ArrayList arrayList2, String str) {
        this.a = arrayList;
        this.b = arrayList2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xrd)) {
            return false;
        }
        xrd xrdVar = (xrd) obj;
        return this.a.equals(xrdVar.a) && this.b.equals(xrdVar.b) && this.c.equals(xrdVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + vt5.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DepositBountyConfig(quickInputItems=");
        sb.append(this.a);
        sb.append(", ranges=");
        sb.append(this.b);
        sb.append(", freeDepositThreshold=");
        return uf80.a(sb, this.c, ")");
    }
}
