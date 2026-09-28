package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class sc70 {
    public final String a;
    public final rc70 b;
    public final boolean c;
    public final String d;
    public final String e;
    public final UiText f;
    public final String g;
    public final UiText h;
    public final UiText i;

    public sc70(String str, rc70 rc70Var, boolean z, String str2, String str3, UiText uiText, String str4, UiText uiText2, UiText uiText3) {
        uiText.getClass();
        uiText3.getClass();
        this.a = str;
        this.b = rc70Var;
        this.c = z;
        this.d = str2;
        this.e = str3;
        this.f = uiText;
        this.g = str4;
        this.h = uiText2;
        this.i = uiText3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sc70)) {
            return false;
        }
        sc70 sc70Var = (sc70) obj;
        return this.a.equals(sc70Var.a) && this.b.equals(sc70Var.b) && this.c == sc70Var.c && this.d.equals(sc70Var.d) && this.e.equals(sc70Var.e) && Intrinsics.g(this.f, sc70Var.f) && this.g.equals(sc70Var.g) && this.h.equals(sc70Var.h) && Intrinsics.g(this.i, sc70Var.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + yvf.a(gmf0.a(yvf.a(gmf0.a(gmf0.a(mtg0.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScheduledFootballOpenBetsSelectionState(selectionId=");
        sb.append(this.a);
        sb.append(", result=");
        sb.append(this.b);
        sb.append(", shouldShowResultTooltip=");
        mng.a(", outcomeText=", this.d, ", marketTitleText=", sb, this.c);
        sb.append(this.e);
        sb.append(", eventUiText=");
        sb.append(this.f);
        sb.append(", leagueText=");
        sb.append(this.g);
        sb.append(", matchdayUiText=");
        sb.append(this.h);
        sb.append(", datetimeUiText=");
        return plf.a(sb, this.i, ")");
    }
}
