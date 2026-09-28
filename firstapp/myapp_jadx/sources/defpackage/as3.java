package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.instantwin.presentation.legendsrace.AxRn.LGxrN;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class as3 {
    public final String a;
    public final int b;
    public final xt3 c;
    public final UiText d;
    public final ru3 e;
    public final String f;

    public as3(String str, int i, xt3 xt3Var, ResourceUiText resourceUiText, ru3 ru3Var, String str2) {
        this.a = str;
        this.b = i;
        this.c = xt3Var;
        this.d = resourceUiText;
        this.e = ru3Var;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof as3)) {
            return false;
        }
        as3 as3Var = (as3) obj;
        return this.a.equals(as3Var.a) && this.b == as3Var.b && Intrinsics.g(this.c, as3Var.c) && Intrinsics.g(this.d, as3Var.d) && this.e.equals(as3Var.e) && this.f.equals(as3Var.f);
    }

    public final int hashCode() {
        int iA = gpp.a(this.b, this.a.hashCode() * 31, 31);
        xt3 xt3Var = this.c;
        int iHashCode = (iA + (xt3Var == null ? 0 : xt3Var.hashCode())) * 31;
        UiText uiText = this.d;
        return this.f.hashCode() + ((this.e.hashCode() + ((iHashCode + (uiText != null ? uiText.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbA = ml5.a(this.b, "BetslipMultipleSelectionState(outcomeId=", this.a, ", backgroundColorResId=", ", groupTitleState=");
        sbA.append(this.c);
        sbA.append(", tagUiText=");
        sbA.append(this.d);
        sbA.append(", content=");
        sbA.append(this.e);
        sbA.append(LGxrN.IVX);
        sbA.append(this.f);
        sbA.append(")");
        return sbA.toString();
    }
}
