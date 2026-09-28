package defpackage;

import com.sporty.android.common_ui.uitext.ConcatUiText;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class br90 {
    public final ConcatUiText a;
    public final qeo b;
    public final ResourceUiText c;
    public final String d;
    public final String e;
    public final us90 f;
    public final ms90 g;
    public final ResourceUiText h;
    public final boolean i;
    public final String j;
    public final os90 k;
    public final boolean l;
    public final int m;

    public br90(ConcatUiText concatUiText, qeo qeoVar, ResourceUiText resourceUiText, String str, String str2, us90 us90Var, ms90 ms90Var, ResourceUiText resourceUiText2, boolean z, String str3, os90 os90Var, boolean z2, int i) {
        this.a = concatUiText;
        this.b = qeoVar;
        this.c = resourceUiText;
        this.d = str;
        this.e = str2;
        this.f = us90Var;
        this.g = ms90Var;
        this.h = resourceUiText2;
        this.i = z;
        this.j = str3;
        this.k = os90Var;
        this.l = z2;
        this.m = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof br90)) {
            return false;
        }
        br90 br90Var = (br90) obj;
        return this.a.equals(br90Var.a) && Intrinsics.g(this.b, br90Var.b) && this.c.equals(br90Var.c) && this.d.equals(br90Var.d) && this.e.equals(br90Var.e) && Intrinsics.g(this.f, br90Var.f) && Intrinsics.g(this.g, br90Var.g) && this.h.equals(br90Var.h) && this.i == br90Var.i && this.j.equals(br90Var.j) && this.k.equals(br90Var.k) && this.l == br90Var.l && this.m == br90Var.m;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        qeo qeoVar = this.b;
        int iA = gmf0.a(gmf0.a(wh8.a((iHashCode + (qeoVar == null ? 0 : qeoVar.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e);
        us90 us90Var = this.f;
        int iHashCode2 = (iA + (us90Var == null ? 0 : us90Var.hashCode())) * 31;
        ms90 ms90Var = this.g;
        return Integer.hashCode(this.m) + mtg0.a((this.k.hashCode() + gmf0.a(mtg0.a(wh8.a((iHashCode2 + (ms90Var != null ? ms90Var.hashCode() : 0)) * 31, 31, this.h), 31, this.i), 31, this.j)) * 31, 31, this.l);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimulationTicketDetailContentItemState(matchupUiText=");
        sb.append(this.a);
        sb.append(", footballScoreInfoState=");
        sb.append(this.b);
        sb.append(", pickUiText=");
        sb.append(this.c);
        sb.append(", marketText=");
        sb.append(this.d);
        sb.append(", outcomeText=");
        sb.append(this.e);
        sb.append(", watermarkIconState=");
        sb.append(this.f);
        sb.append(", selectionDescriptionState=");
        sb.append(this.g);
        sb.append(", betGroupIdUiText=");
        sb.append(this.h);
        sb.append(", isLastItem=");
        mng.a(", selectionId=", this.j, ", result=", sb, this.i);
        sb.append(this.k);
        sb.append(", shouldShowResultTooltip=");
        sb.append(this.l);
        sb.append(", pairDetailsBackgroundColorResId=");
        return zk1.a(this.m, ")", sb);
    }
}
