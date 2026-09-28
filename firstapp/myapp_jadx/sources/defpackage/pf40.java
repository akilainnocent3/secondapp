package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class pf40 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final List<de40> e;
    public final UiText f;

    /* JADX WARN: Multi-variable type inference failed */
    public pf40(boolean z, boolean z2, boolean z3, boolean z4, List<? extends de40> list, UiText uiText) {
        list.getClass();
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = list;
        this.f = uiText;
    }

    public static pf40 a(pf40 pf40Var, boolean z, UiText uiText, int i) {
        if ((i & 1) != 0) {
            z = pf40Var.a;
        }
        boolean z2 = z;
        boolean z3 = pf40Var.b;
        boolean z4 = (i & 4) != 0 ? pf40Var.c : false;
        boolean z5 = pf40Var.d;
        List<de40> list = pf40Var.e;
        if ((i & 32) != 0) {
            uiText = pf40Var.f;
        }
        pf40Var.getClass();
        list.getClass();
        return new pf40(z2, z3, z4, z5, list, uiText);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pf40)) {
            return false;
        }
        pf40 pf40Var = (pf40) obj;
        return this.a == pf40Var.a && this.b == pf40Var.b && this.c == pf40Var.c && this.d == pf40Var.d && Intrinsics.g(this.e, pf40Var.e) && Intrinsics.g(this.f, pf40Var.f);
    }

    public final int hashCode() {
        int iA = ai50.a(mtg0.a(mtg0.a(mtg0.a(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        UiText uiText = this.f;
        return iA + (uiText == null ? 0 : uiText.hashCode());
    }

    public final String toString() {
        StringBuilder sbA = cwz.a("RecapUiState(isLoading=", ", isEligible=", ", shouldShowTutorial=", this.a, this.b);
        nng.a(", shouldNavigateToResult=", ", pages=", sbA, this.c, this.d);
        sbA.append(this.e);
        sbA.append(", errorMessage=");
        sbA.append(this.f);
        sbA.append(")");
        return sbA.toString();
    }

    public pf40() {
        this(0);
    }

    public pf40(int i) {
        this(false, true, false, false, m2g.a, null);
    }
}
