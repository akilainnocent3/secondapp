package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ysq {
    public final String a;
    public final String b;

    public ysq(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ysq)) {
            return false;
        }
        ysq ysqVar = (ysq) obj;
        return Intrinsics.g(this.a, ysqVar.a) && Intrinsics.g(this.b, ysqVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tx5.a("LNMarketOutcome(marketId=", this.a, ", outcomeId=", this.b, ")");
    }
}
