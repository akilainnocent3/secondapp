package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class tzb {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public tzb(String str, String str2, String str3, String str4) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tzb)) {
            return false;
        }
        tzb tzbVar = (tzb) obj;
        return Intrinsics.g(this.a, tzbVar.a) && this.b.equals(tzbVar.b) && this.c.equals(tzbVar.c) && this.d.equals(tzbVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return kwi.a(ux5.a("CreatorCreditHistoryViewInfo(batchId=", this.a, ", rewardWithCurrency=", this.b, ", lastClaimedTime="), this.c, ", period=", this.d, ")");
    }
}
