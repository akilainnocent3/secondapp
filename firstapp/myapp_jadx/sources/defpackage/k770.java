package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class k770 implements w270 {
    public final String a;
    public final boolean b;
    public final a770 c;
    public final ef70 d;
    public final Integer e;
    public final ek70 f;
    public final ek70 g;
    public final qcn<r570> h;
    public final int i;
    public final UiText j;

    public k770(String str, boolean z, a770 a770Var, ef70 ef70Var, Integer num, ek70 ek70Var, ek70 ek70Var2, qcn qcnVar, int i, UiText uiText) {
        ef70Var.getClass();
        qcnVar.getClass();
        this.a = str;
        this.b = z;
        this.c = a770Var;
        this.d = ef70Var;
        this.e = num;
        this.f = ek70Var;
        this.g = ek70Var2;
        this.h = qcnVar;
        this.i = i;
        this.j = uiText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k770)) {
            return false;
        }
        k770 k770Var = (k770) obj;
        return this.a.equals(k770Var.a) && this.b == k770Var.b && this.c.equals(k770Var.c) && Intrinsics.g(this.d, k770Var.d) && Intrinsics.g(this.e, k770Var.e) && Intrinsics.g(this.f, k770Var.f) && Intrinsics.g(this.g, k770Var.g) && Intrinsics.g(this.h, k770Var.h) && this.i == k770Var.i && this.j.equals(k770Var.j);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + mtg0.a(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31;
        Integer num = this.e;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        ek70 ek70Var = this.f;
        int iHashCode3 = (iHashCode2 + (ek70Var == null ? 0 : ek70Var.hashCode())) * 31;
        ek70 ek70Var2 = this.g;
        return this.j.hashCode() + gpp.a(this.i, gpp.a(2, shu.a(this.h, (iHashCode3 + (ek70Var2 != null ? ek70Var2.hashCode() : 0)) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbA = z620.a("ScheduledFootballKickoffCellState(matchdayId=", this.a, ", isExpanded=", ", headerState=", this.b);
        sbA.append(this.c);
        sbA.append(", playbackStatus=");
        sbA.append(this.d);
        sbA.append(", gamesEndImageUrlResId=");
        sbA.append(this.e);
        sbA.append(", leftTeamNameplateState=");
        sbA.append(this.f);
        sbA.append(", rightTeamNameplateState=");
        sbA.append(this.g);
        sbA.append(", eventScoreStates=");
        sbA.append(this.h);
        sbA.append(", eventScoresPerRow=2, visibleEventScoresWhenCollapsed=");
        sbA.append(this.i);
        sbA.append(", expansionButtonUiText=");
        sbA.append(this.j);
        sbA.append(")");
        return sbA.toString();
    }
}
