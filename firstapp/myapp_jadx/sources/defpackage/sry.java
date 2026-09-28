package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class sry {
    public static final sry c = new sry(Ctry.d, null);
    public final Ctry a;
    public final rry b;

    public sry(Ctry ctry, rry rryVar) {
        ctry.getClass();
        this.a = ctry;
        this.b = rryVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sry)) {
            return false;
        }
        sry sryVar = (sry) obj;
        return Intrinsics.g(this.a, sryVar.a) && Intrinsics.g(this.b, sryVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        rry rryVar = this.b;
        return iHashCode + (rryVar == null ? 0 : rryVar.hashCode());
    }

    public final String toString() {
        return "OneTimeBankPageContent(promotion=" + this.a + ", howToDeposit=" + this.b + ")";
    }
}
