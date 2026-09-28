package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class yv40 {
    public final String a;
    public final String b;

    public yv40(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yv40)) {
            return false;
        }
        yv40 yv40Var = (yv40) obj;
        return Intrinsics.g(this.a, yv40Var.a) && Intrinsics.g(this.b, yv40Var.b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(2000) * 31;
        String str = this.a;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.b;
        return mtg0.a((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, true);
    }

    public final String toString() {
        return tx5.a("RegisterSimpleKycParam(userCertFlowEntry=2000, accessToken=", this.a, ", title=", this.b, ", enableDefaultActionBar=true, kycCollectToken=null)");
    }
}
