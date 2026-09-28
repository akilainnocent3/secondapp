package defpackage;

import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class m2q {
    public final dqh0 a;
    public final dqh0.b b;
    public final z2q c;
    public final String d;
    public final String e;
    public final UiText f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final boolean l;
    public final tsd0 m;
    public final s2q n;
    public final s2q o;
    public final qrd0 p;
    public final t2q q;
    public final g0q r;
    public final boolean s;
    public final String t;
    public final ovp u;

    public m2q(dqh0 dqh0Var, dqh0.b bVar, z2q z2qVar, String str, String str2, UiText uiText, String str3, String str4, String str5, String str6, String str7, boolean z, tsd0 tsd0Var, s2q s2qVar, s2q s2qVar2, qrd0 qrd0Var, t2q t2qVar, g0q g0qVar, boolean z2, String str8, ovp ovpVar) {
        dqh0Var.getClass();
        z2qVar.getClass();
        str.getClass();
        uiText.getClass();
        str4.getClass();
        str6.getClass();
        str7.getClass();
        tsd0Var.getClass();
        s2qVar.getClass();
        s2qVar2.getClass();
        t2qVar.getClass();
        str8.getClass();
        ovpVar.getClass();
        this.a = dqh0Var;
        this.b = bVar;
        this.c = z2qVar;
        this.d = str;
        this.e = str2;
        this.f = uiText;
        this.g = str3;
        this.h = str4;
        this.i = str5;
        this.j = str6;
        this.k = str7;
        this.l = z;
        this.m = tsd0Var;
        this.n = s2qVar;
        this.o = s2qVar2;
        this.p = qrd0Var;
        this.q = t2qVar;
        this.r = g0qVar;
        this.s = z2;
        this.t = str8;
        this.u = ovpVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m2q)) {
            return false;
        }
        m2q m2qVar = (m2q) obj;
        return Intrinsics.g(this.a, m2qVar.a) && Intrinsics.g(this.b, m2qVar.b) && Intrinsics.g(this.c, m2qVar.c) && Intrinsics.g(this.d, m2qVar.d) && Intrinsics.g(this.e, m2qVar.e) && Intrinsics.g(this.f, m2qVar.f) && Intrinsics.g(this.g, m2qVar.g) && Intrinsics.g(this.h, m2qVar.h) && Intrinsics.g(this.i, m2qVar.i) && Intrinsics.g(this.j, m2qVar.j) && Intrinsics.g(this.k, m2qVar.k) && this.l == m2qVar.l && Intrinsics.g(this.m, m2qVar.m) && Intrinsics.g(this.n, m2qVar.n) && Intrinsics.g(this.o, m2qVar.o) && Intrinsics.g(this.p, m2qVar.p) && Intrinsics.g(this.q, m2qVar.q) && Intrinsics.g(this.r, m2qVar.r) && this.s == m2qVar.s && Intrinsics.g(this.t, m2qVar.t) && this.u == m2qVar.u;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        dqh0.b bVar = this.b;
        int iHashCode2 = (this.o.hashCode() + ((this.n.hashCode() + ((this.m.hashCode() + mtg0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(yvf.a(gmf0.a(gmf0.a((this.c.hashCode() + ((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31)) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l)) * 31)) * 31)) * 31;
        qrd0 qrd0Var = this.p;
        int iHashCode3 = (this.q.hashCode() + ((iHashCode2 + (qrd0Var == null ? 0 : qrd0Var.hashCode())) * 31)) * 31;
        g0q g0qVar = this.r;
        return this.u.hashCode() + gmf0.a(mtg0.a((iHashCode3 + (g0qVar != null ? g0qVar.hashCode() : 0)) * 31, 31, this.s), 31, this.t);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LNBetPanelState(userSelectState=");
        sb.append(this.a);
        sb.append(", collapsedSelectedNumbers=");
        sb.append(this.b);
        sb.append(", controller=");
        sb.append(this.c);
        sb.append(", totalStake=");
        sb.append(this.d);
        sb.append(", potWin=");
        sb.append(this.e);
        sb.append(", betAmount=");
        sb.append(this.f);
        sb.append(", multiplier=");
        hxa.c(sb, this.g, ", lotteryName=", this.h, ", marketName=");
        hxa.c(sb, this.i, ", balance=", this.j, ", currency=");
        uts.b(this.k, ", placeBetButtonEnable=", ", keyboardUiState=", sb, this.l);
        sb.append(this.m);
        sb.append(", topWarningHint=");
        sb.append(this.n);
        sb.append(", stakeWarningHint=");
        sb.append(this.o);
        sb.append(", betError=");
        sb.append(this.p);
        sb.append(", betDialog=");
        sb.append(this.q);
        sb.append(", gift=");
        sb.append(this.r);
        sb.append(", show=");
        mng.a(", aboutToPay=", this.t, ", myNumberState=", sb, this.s);
        sb.append(this.u);
        sb.append(")");
        return sb.toString();
    }

    public m2q() {
        this(0);
    }

    public m2q(int i) {
        dqh0.c cVar = new dqh0.c(0);
        z2q z2qVar = new z2q();
        StringUiText stringUiText = vch0.a;
        tsd0 tsd0Var = new tsd0(0);
        s2q.a aVar = s2q.a.a;
        this(cVar, null, z2qVar, "", "", stringUiText, "", "", "", "", "", true, tsd0Var, aVar, aVar, null, t2q.c.a, null, false, "", ovp.c);
    }
}
