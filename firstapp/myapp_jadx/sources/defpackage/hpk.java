package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class hpk {
    public final ArrayList a;
    public final int b;

    public hpk(int i, ArrayList arrayList) {
        this.a = arrayList;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hpk)) {
            return false;
        }
        hpk hpkVar = (hpk) obj;
        return this.a.equals(hpkVar.a) && this.b == hpkVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "GiftListResult(gifts=" + this.a + ", totalNum=" + this.b + ")";
    }
}
