package defpackage;

import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d7e0 {
    public final String a;
    public final UiText b;
    public final UiText c;
    public final long d;
    public final StringUiText e;

    public d7e0(String str, UiText uiText, UiText uiText2, long j, StringUiText stringUiText) {
        str.getClass();
        uiText2.getClass();
        this.a = str;
        this.b = uiText;
        this.c = uiText2;
        this.d = j;
        this.e = stringUiText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d7e0)) {
            return false;
        }
        d7e0 d7e0Var = (d7e0) obj;
        if (!Intrinsics.g(this.a, d7e0Var.a) || !this.b.equals(d7e0Var.b) || !Intrinsics.g(this.c, d7e0Var.c)) {
            return false;
        }
        long j = d7e0Var.d;
        int i = j58.n;
        return nbh0.a(this.d, j) && this.e.equals(d7e0Var.e);
    }

    public final int hashCode() {
        int iA = yvf.a(yvf.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        int i = j58.n;
        nbh0.a aVar = nbh0.b;
        return this.e.a.hashCode() + f87.a(iA, this.d, 31);
    }

    public final String toString() {
        String strI = j58.i(this.d);
        StringBuilder sbA = x45.a(this.b, "StreakRecordScreenData(date=", this.a, ", daysRequiredUiText=", ", statusUiText=");
        sbA.append(this.c);
        sbA.append(", statusBgColor=");
        sbA.append(strI);
        sbA.append(", multiplierUiText=");
        sbA.append(this.e);
        sbA.append(")");
        return sbA.toString();
    }
}
