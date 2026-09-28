package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class bw3 {
    public final int a;
    public final q43 b;
    public final List<z43> c;
    public final c330 d;
    public final tzs e;

    /* JADX WARN: Illegal instructions before constructor call */
    public bw3(int i) {
        m2g m2gVar = m2g.a;
        StringUiText stringUiText = vch0.a;
        this(2, null, m2gVar, new c330.a(new ResourceUiText(R.string.component_betslip__accept_changes), true), tzs.a.a);
    }

    public static bw3 a(bw3 bw3Var, int i, q43 q43Var, ArrayList arrayList, c330 c330Var, tzs tzsVar, int i2) {
        if ((i2 & 1) != 0) {
            i = bw3Var.a;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            q43Var = bw3Var.b;
        }
        q43 q43Var2 = q43Var;
        List<z43> list = arrayList;
        if ((i2 & 4) != 0) {
            list = bw3Var.c;
        }
        List<z43> list2 = list;
        if ((i2 & 8) != 0) {
            c330Var = bw3Var.d;
        }
        c330 c330Var2 = c330Var;
        if ((i2 & 16) != 0) {
            tzsVar = bw3Var.e;
        }
        tzs tzsVar2 = tzsVar;
        bw3Var.getClass();
        list2.getClass();
        c330Var2.getClass();
        tzsVar2.getClass();
        return new bw3(i3, q43Var2, list2, c330Var2, tzsVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bw3)) {
            return false;
        }
        bw3 bw3Var = (bw3) obj;
        return this.a == bw3Var.a && this.b == bw3Var.b && Intrinsics.g(this.c, bw3Var.c) && Intrinsics.g(this.d, bw3Var.d) && Intrinsics.g(this.e, bw3Var.e);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        q43 q43Var = this.b;
        return this.e.hashCode() + ((this.d.hashCode() + ai50.a((iHashCode + (q43Var == null ? 0 : q43Var.hashCode())) * 31, 31, this.c)) * 31);
    }

    public final String toString() {
        return "BetslipState(orderBetType=" + this.a + ", betSlipHeaderState=" + this.b + ", betSlipItemViewStates=" + this.c + ", acceptChangesProgressButtonUiState=" + this.d + ", footerButtonProgressingMaskUiState=" + this.e + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public bw3(int i, q43 q43Var, List<? extends z43> list, c330 c330Var, tzs tzsVar) {
        list.getClass();
        tzsVar.getClass();
        this.a = i;
        this.b = q43Var;
        this.c = list;
        this.d = c330Var;
        this.e = tzsVar;
    }

    public bw3() {
        this(0);
    }
}
