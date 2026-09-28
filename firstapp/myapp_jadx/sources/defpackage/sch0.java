package defpackage;

import com.sporty.android.core.model.pocket.deposit.sportybank.SportyBankDto;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class sch0 {
    public final boolean a;
    public final int b;
    public final List<q5d> c;
    public final List<SportyBankDto> d;
    public final List<Integer> e;

    public sch0(boolean z, int i, List<q5d> list, List<SportyBankDto> list2, List<Integer> list3) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.a = z;
        this.b = i;
        this.c = list;
        this.d = list2;
        this.e = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sch0)) {
            return false;
        }
        sch0 sch0Var = (sch0) obj;
        return this.a == sch0Var.a && this.b == sch0Var.b && Intrinsics.g(this.c, sch0Var.c) && Intrinsics.g(this.d, sch0Var.d) && Intrinsics.g(this.e, sch0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ai50.a(ai50.a(gpp.a(this.b, Boolean.hashCode(this.a) * 31, 31), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbA = zug0.a("UiState(isMaxSelectableBanksReached=", ", accountLimit=", ", accountList=", this.b, this.a);
        qpu.a(", bankList=", ", selectedBanks=", sbA, this.c, this.d);
        return ng1.a(sbA, this.e, ")");
    }

    public sch0() {
        this(0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public sch0(int i) {
        m2g m2gVar = m2g.a;
        this(true, 0, m2gVar, m2gVar, m2gVar);
    }
}
