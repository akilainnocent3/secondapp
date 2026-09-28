package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class ht00 {
    public final ArrayList a;
    public final boolean b;

    public ht00(ArrayList arrayList, boolean z) {
        this.a = arrayList;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ht00)) {
            return false;
        }
        ht00 ht00Var = (ht00) obj;
        return this.a.equals(ht00Var.a) && this.b == ht00Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PickMarketsPage(events=" + this.a + ", hasMore=" + this.b + ")";
    }
}
