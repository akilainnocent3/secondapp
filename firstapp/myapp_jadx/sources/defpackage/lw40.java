package defpackage;

import androidx.swiperefreshlayout.widget.dP.LxHElgWAiSeM;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class lw40 {
    public final List<kw40> a;
    public final hpx b;
    public final hyf0 c;

    public lw40(List<kw40> list, hpx hpxVar, hyf0 hyf0Var) {
        list.getClass();
        this.a = list;
        this.b = hpxVar;
        this.c = hyf0Var;
    }

    public static lw40 a(lw40 lw40Var, uf00 uf00Var, hpx hpxVar, int i) {
        List<kw40> list = uf00Var;
        if ((i & 1) != 0) {
            list = lw40Var.a;
        }
        if ((i & 2) != 0) {
            hpxVar = lw40Var.b;
        }
        hyf0 hyf0Var = lw40Var.c;
        lw40Var.getClass();
        list.getClass();
        return new lw40(list, hpxVar, hyf0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lw40)) {
            return false;
        }
        lw40 lw40Var = (lw40) obj;
        return Intrinsics.g(this.a, lw40Var.a) && Intrinsics.g(this.b, lw40Var.b) && Intrinsics.g(this.c, lw40Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        hpx hpxVar = this.b;
        int iHashCode2 = (iHashCode + (hpxVar == null ? 0 : Boolean.hashCode(hpxVar.a))) * 31;
        hyf0 hyf0Var = this.c;
        return iHashCode2 + (hyf0Var != null ? hyf0Var.hashCode() : 0);
    }

    public final String toString() {
        return "RegisteredBanksAccountsState(bankAccounts=" + this.a + ", newBankAccountState=" + this.b + ", tip=" + this.c + LxHElgWAiSeM.yqrADOZ;
    }

    public lw40(int i, ArrayList arrayList) {
        this((i & 1) != 0 ? m2g.a : arrayList, null, null);
    }
}
