package defpackage;

import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes6.dex */
public final class n7e0 {
    public final t6e0 a;
    public final int b;
    public final int c;
    public final UiText d;
    public final UiText e;
    public final UiText f;
    public final String g;
    public final boolean h;
    public final UiText i;
    public final boolean j;
    public final s24 k;
    public final Long l;
    public final UiText m;
    public final UiText n;
    public final Float o;
    public final qcn<r7e0> p;
    public final boolean q;
    public final boolean r;
    public final s7e0 s;
    public final boolean t;
    public final boolean u;
    public final qcn<r3e0> v;

    public n7e0(t6e0 t6e0Var, int i, int i2, UiText uiText, UiText uiText2, UiText uiText3, String str, boolean z, UiText uiText4, boolean z2, s24 s24Var, Long l, UiText uiText5, StringUiText stringUiText, Float f, qcn qcnVar, boolean z3, qcn qcnVar2, int i3) {
        this((i3 & 1) != 0 ? t6e0.Level0 : t6e0Var, (i3 & 2) != 0 ? R.drawable.img__streak_level_0 : i, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? vch0.a : uiText, (i3 & 16) != 0 ? vch0.a : uiText2, (i3 & 32) != 0 ? vch0.a : uiText3, (i3 & 64) != 0 ? "" : str, (i3 & 128) != 0 ? false : z, (i3 & 256) != 0 ? vch0.a : uiText4, (i3 & 512) != 0 ? false : z2, (i3 & 1024) != 0 ? s24.PlacingWager : s24Var, (i3 & 2048) != 0 ? null : l, (i3 & 4096) != 0 ? null : uiText5, (i3 & 8192) != 0 ? null : stringUiText, (i3 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : f, (32768 & i3) != 0 ? n1a0.c : qcnVar, false, (131072 & i3) != 0 ? false : z3, null, false, false, (i3 & 2097152) != 0 ? n1a0.c : qcnVar2);
    }

    public static n7e0 a(n7e0 n7e0Var, boolean z, s24 s24Var, Long l, UiText uiText, StringUiText stringUiText, Float f, boolean z2, boolean z3, s7e0 s7e0Var, boolean z4, boolean z5, int i) {
        t6e0 t6e0Var = n7e0Var.a;
        int i2 = n7e0Var.b;
        int i3 = n7e0Var.c;
        UiText uiText2 = n7e0Var.d;
        UiText uiText3 = n7e0Var.e;
        UiText uiText4 = n7e0Var.f;
        String str = n7e0Var.g;
        boolean z6 = n7e0Var.h;
        UiText uiText5 = n7e0Var.i;
        boolean z7 = (i & 512) != 0 ? n7e0Var.j : z;
        s24 s24Var2 = (i & 1024) != 0 ? n7e0Var.k : s24Var;
        Long l2 = (i & 2048) != 0 ? n7e0Var.l : l;
        UiText uiText6 = (i & 4096) != 0 ? n7e0Var.m : uiText;
        UiText uiText7 = (i & 8192) != 0 ? n7e0Var.n : stringUiText;
        Float f2 = (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? n7e0Var.o : f;
        qcn<r7e0> qcnVar = n7e0Var.p;
        boolean z8 = (i & 65536) != 0 ? n7e0Var.q : z2;
        boolean z9 = (i & 131072) != 0 ? n7e0Var.r : z3;
        s7e0 s7e0Var2 = (i & 262144) != 0 ? n7e0Var.s : s7e0Var;
        boolean z10 = (i & 524288) != 0 ? n7e0Var.t : z4;
        boolean z11 = (i & 1048576) != 0 ? n7e0Var.u : z5;
        qcn<r3e0> qcnVar2 = n7e0Var.v;
        n7e0Var.getClass();
        t6e0Var.getClass();
        uiText2.getClass();
        uiText3.getClass();
        uiText4.getClass();
        str.getClass();
        uiText5.getClass();
        s24Var2.getClass();
        qcnVar.getClass();
        qcnVar2.getClass();
        return new n7e0(t6e0Var, i2, i3, uiText2, uiText3, uiText4, str, z6, uiText5, z7, s24Var2, l2, uiText6, uiText7, f2, qcnVar, z8, z9, s7e0Var2, z10, z11, qcnVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n7e0)) {
            return false;
        }
        n7e0 n7e0Var = (n7e0) obj;
        return this.a == n7e0Var.a && this.b == n7e0Var.b && this.c == n7e0Var.c && Intrinsics.g(this.d, n7e0Var.d) && Intrinsics.g(this.e, n7e0Var.e) && Intrinsics.g(this.f, n7e0Var.f) && Intrinsics.g(this.g, n7e0Var.g) && this.h == n7e0Var.h && Intrinsics.g(this.i, n7e0Var.i) && this.j == n7e0Var.j && this.k == n7e0Var.k && Intrinsics.g(this.l, n7e0Var.l) && Intrinsics.g(this.m, n7e0Var.m) && Intrinsics.g(this.n, n7e0Var.n) && Intrinsics.g(this.o, n7e0Var.o) && Intrinsics.g(this.p, n7e0Var.p) && this.q == n7e0Var.q && this.r == n7e0Var.r && Intrinsics.g(this.s, n7e0Var.s) && this.t == n7e0Var.t && this.u == n7e0Var.u && Intrinsics.g(this.v, n7e0Var.v);
    }

    public final int hashCode() {
        int iHashCode = (this.k.hashCode() + mtg0.a(yvf.a(mtg0.a(gmf0.a(yvf.a(yvf.a(yvf.a(gpp.a(this.c, gpp.a(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j)) * 31;
        Long l = this.l;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        UiText uiText = this.m;
        int iHashCode3 = (iHashCode2 + (uiText == null ? 0 : uiText.hashCode())) * 31;
        UiText uiText2 = this.n;
        int iHashCode4 = (iHashCode3 + (uiText2 == null ? 0 : uiText2.hashCode())) * 31;
        Float f = this.o;
        int iA = mtg0.a(mtg0.a(shu.a(this.p, (iHashCode4 + (f == null ? 0 : f.hashCode())) * 31, 31), 31, this.q), 31, this.r);
        s7e0 s7e0Var = this.s;
        return this.v.hashCode() + mtg0.a(mtg0.a((iA + (s7e0Var != null ? s7e0Var.hashCode() : 0)) * 31, 31, this.t), 31, this.u);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StreakScreenData(currentStreakLevel=");
        sb.append(this.a);
        sb.append(", currentStreakImgRes=");
        sb.append(this.b);
        sb.append(", currentStreakDays=");
        sb.append(this.c);
        sb.append(", currentBonusInMultiplier=");
        sb.append(this.d);
        sb.append(", streakBoostInfo=");
        vh8.a(sb, this.e, ", maxStreakBoostNote=", this.f, ", availableRepairTools=");
        uts.b(this.g, ", canUseRepairTool=", ", repairToolStreakDays=", sb, this.h);
        sb.append(this.i);
        sb.append(", hasMission=");
        sb.append(this.j);
        sb.append(", missionType=");
        sb.append(this.k);
        sb.append(", missionEndTimeMillis=");
        sb.append(this.l);
        sb.append(", missionTimeLeft=");
        vh8.a(sb, this.m, ", missionGoal=", this.n, ", missionProgress=");
        sb.append(this.o);
        sb.append(", allWeeks=");
        sb.append(this.p);
        sb.append(", showNewBadgeForAlert=");
        nng.a(", isAlertOn=", ", currentWeekData=", sb, this.q, this.r);
        sb.append(this.s);
        sb.append(", canNavigateToPrevious=");
        sb.append(this.t);
        sb.append(", canNavigateToNext=");
        sb.append(this.u);
        sb.append(", achievementsUiState=");
        sb.append(this.v);
        sb.append(")");
        return sb.toString();
    }

    public n7e0(t6e0 t6e0Var, int i, int i2, UiText uiText, UiText uiText2, UiText uiText3, String str, boolean z, UiText uiText4, boolean z2, s24 s24Var, Long l, UiText uiText5, UiText uiText6, Float f, qcn<r7e0> qcnVar, boolean z3, boolean z4, s7e0 s7e0Var, boolean z5, boolean z6, qcn<r3e0> qcnVar2) {
        t6e0Var.getClass();
        uiText.getClass();
        uiText2.getClass();
        uiText3.getClass();
        str.getClass();
        uiText4.getClass();
        s24Var.getClass();
        qcnVar.getClass();
        qcnVar2.getClass();
        this.a = t6e0Var;
        this.b = i;
        this.c = i2;
        this.d = uiText;
        this.e = uiText2;
        this.f = uiText3;
        this.g = str;
        this.h = z;
        this.i = uiText4;
        this.j = z2;
        this.k = s24Var;
        this.l = l;
        this.m = uiText5;
        this.n = uiText6;
        this.o = f;
        this.p = qcnVar;
        this.q = z3;
        this.r = z4;
        this.s = s7e0Var;
        this.t = z5;
        this.u = z6;
        this.v = qcnVar2;
    }

    public n7e0() {
        this(null, 0, 0, null, null, null, null, false, null, false, null, null, null, null, null, null, false, null, 4194303);
    }
}
