package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.recommendation.TL.UccrWswQGaIj;

/* JADX INFO: loaded from: classes2.dex */
public final class kt3 {
    public final String a;
    public final String b;
    public final hs3 c;

    public kt3(String str, String str2, hs3 hs3Var) {
        this.a = str;
        this.b = str2;
        this.c = hs3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kt3)) {
            return false;
        }
        kt3 kt3Var = (kt3) obj;
        return this.a.equals(kt3Var.a) && this.b.equals(kt3Var.b) && this.c.equals(kt3Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("BetslipRecommendationSelectionState(selectionKey=", this.a, ", oddsText=", this.b, UccrWswQGaIj.rXwSrKC);
        sbA.append(this.c);
        sbA.append(")");
        return sbA.toString();
    }
}
