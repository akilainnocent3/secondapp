package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class us4 {
    public final String a;
    public final kv4 b;
    public final String c;
    public final List<String> d;
    public final List<String> e;
    public final float f;
    public final Double g;
    public final Double h;
    public final Double i;
    public final String j;
    public final String k;
    public final double l;
    public final double m;
    public final jv4 n;
    public final ts4 o;
    public final ArrayList p;

    public us4(String str, kv4 kv4Var, String str2, List list, List list2, float f, Double d, Double d2, Double d3, String str3, String str4, double d4, double d5, jv4 jv4Var, ts4 ts4Var, ArrayList arrayList) {
        str.getClass();
        list.getClass();
        list2.getClass();
        this.a = str;
        this.b = kv4Var;
        this.c = str2;
        this.d = list;
        this.e = list2;
        this.f = f;
        this.g = d;
        this.h = d2;
        this.i = d3;
        this.j = str3;
        this.k = str4;
        this.l = d4;
        this.m = d5;
        this.n = jv4Var;
        this.o = ts4Var;
        this.p = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof us4)) {
            return false;
        }
        us4 us4Var = (us4) obj;
        return Intrinsics.g(this.a, us4Var.a) && this.b == us4Var.b && this.c.equals(us4Var.c) && Intrinsics.g(this.d, us4Var.d) && Intrinsics.g(this.e, us4Var.e) && Float.compare(this.f, us4Var.f) == 0 && Intrinsics.g(this.g, us4Var.g) && Intrinsics.g(this.h, us4Var.h) && Intrinsics.g(this.i, us4Var.i) && Intrinsics.g(this.j, us4Var.j) && Intrinsics.g(this.k, us4Var.k) && Double.compare(this.l, us4Var.l) == 0 && Double.compare(this.m, us4Var.m) == 0 && this.n == us4Var.n && this.o == us4Var.o && this.p.equals(us4Var.p);
    }

    public final int hashCode() {
        int iA = tvh.a(this.f, ai50.a(ai50.a(gmf0.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e), 31);
        Double d = this.g;
        int iHashCode = (iA + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.h;
        int iHashCode2 = (iHashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.i;
        int iHashCode3 = (iHashCode2 + (d3 == null ? 0 : d3.hashCode())) * 31;
        String str = this.j;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.k;
        return this.p.hashCode() + ((this.o.hashCode() + ((this.n.hashCode() + nrg0.a(nrg0.a((iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.l), 31, this.m)) * 31)) * 31);
    }

    public final String toString() {
        return "BonusVaultData(timeRemaining=" + this.a + ", timeUnit=" + this.b + ", currency=" + this.c + ", supportedGames=" + this.d + ", supportedGamesForGift=" + this.e + ", tierProgress=" + this.f + ", minStakeAmountCondition=" + this.g + ", minCoefficientAmountCondition=" + this.h + ", missionCompletedTotalWinnings=" + this.i + ", totalStakeAmount=" + this.j + ", totalBetCount=" + this.k + ", usedGiftAmount=" + this.l + ", totalGiftAmount=" + this.m + ", bonusVaultTierStatus=" + this.n + ", tierCriteriaType=" + this.o + ", vaultGames=" + this.p + ')';
    }
}
