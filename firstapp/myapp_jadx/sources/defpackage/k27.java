package defpackage;

import com.sporty.android.core.model.crypto.IURC.iKBWavCysVP;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class k27 {
    public final int a;
    public final String b;
    public final Long c;
    public final String d;
    public final String e;

    public k27(int i, String str, Long l, String str2, String str3) {
        this.a = i;
        this.b = str;
        this.c = l;
        this.d = str2;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k27)) {
            return false;
        }
        k27 k27Var = (k27) obj;
        return this.a == k27Var.a && Intrinsics.g(this.b, k27Var.b) && Intrinsics.g(this.c, k27Var.c) && Intrinsics.g(this.d, k27Var.d) && Intrinsics.g(this.e, k27Var.e);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.c;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbA = uqe0.a(this.a, "ChallengeReward(rewardType=", ", referenceId=", this.b, ", rewardAmount=");
        sbA.append(this.c);
        sbA.append(iKBWavCysVP.XjSRBv);
        sbA.append(this.d);
        sbA.append(", customizedText=");
        return uf80.a(sbA, this.e, ")");
    }
}
