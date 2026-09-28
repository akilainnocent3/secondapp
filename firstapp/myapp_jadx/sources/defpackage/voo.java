package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class voo {
    public final String a;
    public final uoo b;
    public final UiText c;
    public final String d;
    public final UiText e;
    public final UiText f;
    public final UiText g;
    public final UiText h;
    public final qeo i;
    public final koo j;

    public voo(String str, uoo uooVar, ResourceUiText resourceUiText, String str2, UiText uiText, UiText uiText2, UiText uiText3, UiText uiText4, qeo qeoVar, koo kooVar) {
        uiText.getClass();
        this.a = str;
        this.b = uooVar;
        this.c = resourceUiText;
        this.d = str2;
        this.e = uiText;
        this.f = uiText2;
        this.g = uiText3;
        this.h = uiText4;
        this.i = qeoVar;
        this.j = kooVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof voo)) {
            return false;
        }
        voo vooVar = (voo) obj;
        return this.a.equals(vooVar.a) && this.b.equals(vooVar.b) && Intrinsics.g(this.c, vooVar.c) && Intrinsics.g(this.d, vooVar.d) && Intrinsics.g(this.e, vooVar.e) && Intrinsics.g(this.f, vooVar.f) && Intrinsics.g(this.g, vooVar.g) && Intrinsics.g(this.h, vooVar.h) && Intrinsics.g(this.i, vooVar.i) && Intrinsics.g(this.j, vooVar.j);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        UiText uiText = this.c;
        int iHashCode2 = (iHashCode + (uiText == null ? 0 : uiText.hashCode())) * 31;
        String str = this.d;
        int iA = yvf.a((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
        UiText uiText2 = this.f;
        int iHashCode3 = (iA + (uiText2 == null ? 0 : uiText2.hashCode())) * 31;
        UiText uiText3 = this.g;
        int iHashCode4 = (iHashCode3 + (uiText3 == null ? 0 : uiText3.hashCode())) * 31;
        UiText uiText4 = this.h;
        int iHashCode5 = (iHashCode4 + (uiText4 == null ? 0 : uiText4.hashCode())) * 31;
        qeo qeoVar = this.i;
        int iHashCode6 = (iHashCode5 + (qeoVar == null ? 0 : qeoVar.hashCode())) * 31;
        koo kooVar = this.j;
        return iHashCode6 + (kooVar != null ? kooVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstantWinTicketDetailSelectionState(id=");
        sb.append(this.a);
        sb.append(", result=");
        sb.append(this.b);
        sb.append(", resultTooltipUiText=");
        sb.append(this.c);
        sb.append(", numberText=");
        sb.append(this.d);
        sb.append(", primaryUiText=");
        vh8.a(sb, this.e, ", secondaryUiText=", this.f, ", tertiaryUiText=");
        vh8.a(sb, this.g, ", quaternaryUiText=", this.h, ", footballScoreInfoState=");
        sb.append(this.i);
        sb.append(", contentState=");
        sb.append(this.j);
        sb.append(")");
        return sb.toString();
    }
}
