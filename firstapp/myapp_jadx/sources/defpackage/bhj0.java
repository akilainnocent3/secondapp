package defpackage;

import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class bhj0 implements pdd0 {
    public final String a;
    public final bag b;
    public final String c;

    public bhj0(bag bagVar, String str, int i) {
        str = (i & 4) != 0 ? null : str;
        this.a = "withdrawal_page__view";
        this.b = bagVar;
        this.c = str;
    }

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        bag bagVar = this.b;
        HashMap<String, Object> mapD = kpu.d(new Pair("entrance", bagVar != null ? bagVar.K0() : null));
        String str = this.c;
        if (str != null) {
            mapD.put("default_tab_name", str);
        }
        return mapD;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bhj0)) {
            return false;
        }
        bhj0 bhj0Var = (bhj0) obj;
        return this.a.equals(bhj0Var.a) && Intrinsics.g(this.b, bhj0Var.b) && Intrinsics.g(this.c, bhj0Var.c);
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
        StringBuilder sb = new StringBuilder("WithdrawalPageViewEvent(name=");
        sb.append(this.a);
        sb.append(", entrance=");
        sb.append(this.b);
        sb.append(", defaultTabName=");
        return uf80.a(sb, this.c, ")");
    }
}
