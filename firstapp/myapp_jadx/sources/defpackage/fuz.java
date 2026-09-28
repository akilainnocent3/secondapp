package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class fuz {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final ResourceUiText d;
    public final UiText e;
    public final UiText f;

    public fuz(boolean z, boolean z2, boolean z3, ResourceUiText resourceUiText, StringUiText stringUiText, ResourceUiText resourceUiText2) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = resourceUiText;
        this.e = stringUiText;
        this.f = resourceUiText2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fuz)) {
            return false;
        }
        fuz fuzVar = (fuz) obj;
        return this.a == fuzVar.a && this.b == fuzVar.b && this.c == fuzVar.c && this.d.equals(fuzVar.d) && Intrinsics.g(this.e, fuzVar.e) && Intrinsics.g(this.f, fuzVar.f);
    }

    public final int hashCode() {
        int iA = wh8.a(mtg0.a(mtg0.a(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
        UiText uiText = this.e;
        int iHashCode = (iA + (uiText == null ? 0 : uiText.hashCode())) * 31;
        UiText uiText2 = this.f;
        return iHashCode + (uiText2 != null ? uiText2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbA = cwz.a("PartnerWithdrawRequestTimelineUiState(isIndicatorGreen=", ", isTimelineGreen=", ", isTimelineShown=", this.a, this.b);
        sbA.append(this.c);
        sbA.append(", titleUiText=");
        sbA.append(this.d);
        sbA.append(", timeUiText=");
        sbA.append(this.e);
        sbA.append(", hintUiText=");
        sbA.append(this.f);
        sbA.append(")");
        return sbA.toString();
    }
}
