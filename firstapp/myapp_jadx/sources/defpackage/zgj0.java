package defpackage;

import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class zgj0 implements pdd0 {
    public final String a;
    public final bag b;
    public final String c;

    public zgj0(bag bagVar, String str, int i) {
        bagVar = (i & 2) != 0 ? null : bagVar;
        str = (i & 4) != 0 ? null : str;
        this.a = "withdrawal_page__select_bank__click";
        this.b = bagVar;
        this.c = str;
    }

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        bag bagVar = this.b;
        return kpu.d(new Pair("entrance", bagVar != null ? bagVar.K0() : null), new Pair("select_bank", this.c));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zgj0)) {
            return false;
        }
        zgj0 zgj0Var = (zgj0) obj;
        return Intrinsics.g(this.a, zgj0Var.a) && Intrinsics.g(this.b, zgj0Var.b) && Intrinsics.g(this.c, zgj0Var.c);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return this.a;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        bag bagVar = this.b;
        int iHashCode2 = (iHashCode + (bagVar == null ? 0 : bagVar.hashCode())) * 31;
        String str = this.c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WithdrawalPageSelectBankClickEvent(name=");
        sb.append(this.a);
        sb.append(", entrance=");
        sb.append(this.b);
        sb.append(", selectBank=");
        return uf80.a(sb, this.c, ")");
    }
}
