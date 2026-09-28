package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class cxn {
    public final ArrayList a;
    public final List<qwn> b;

    public cxn(List list, ArrayList arrayList) {
        list.getClass();
        this.a = arrayList;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cxn)) {
            return false;
        }
        cxn cxnVar = (cxn) obj;
        return this.a.equals(cxnVar.a) && Intrinsics.g(this.b, cxnVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "InstantRacingMarketInfo(marketCategories=" + this.a + ", markets=" + this.b + ")";
    }
}
