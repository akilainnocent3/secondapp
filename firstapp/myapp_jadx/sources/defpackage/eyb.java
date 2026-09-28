package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class eyb {
    public final String a;
    public final String b;
    public final String c;

    public eyb(String str, String str2, String str3) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eyb)) {
            return false;
        }
        eyb eybVar = (eyb) obj;
        return Intrinsics.g(this.a, eybVar.a) && this.b.equals(eybVar.b) && this.c.equals(eybVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return uf80.a(ux5.a("CreatorCreditBreakdownViewInfo(batchId=", this.a, ", rewardWithCurrency=", this.b, ", aliasCode="), this.c, ")");
    }
}
