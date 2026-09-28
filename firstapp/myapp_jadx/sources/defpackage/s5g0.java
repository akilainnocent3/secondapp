package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class s5g0 {
    public final String a;
    public final u5g0 b;
    public final u5g0 c;
    public final Integer d;
    public final Integer e;
    public final Integer f;
    public final Integer g;
    public final String h;
    public final String i;
    public final boolean j;
    public final boolean k;
    public final String l;
    public final UiText m;
    public final boolean n;

    public s5g0(String str, u5g0 u5g0Var, u5g0 u5g0Var2, Integer num, Integer num2, Integer num3, Integer num4, String str2, String str3, boolean z, boolean z2, String str4, UiText uiText, boolean z3) {
        str.getClass();
        this.a = str;
        this.b = u5g0Var;
        this.c = u5g0Var2;
        this.d = num;
        this.e = num2;
        this.f = num3;
        this.g = num4;
        this.h = str2;
        this.i = str3;
        this.j = z;
        this.k = z2;
        this.l = str4;
        this.m = uiText;
        this.n = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s5g0)) {
            return false;
        }
        s5g0 s5g0Var = (s5g0) obj;
        return Intrinsics.g(this.a, s5g0Var.a) && Intrinsics.g(this.b, s5g0Var.b) && Intrinsics.g(this.c, s5g0Var.c) && Intrinsics.g(this.d, s5g0Var.d) && Intrinsics.g(this.e, s5g0Var.e) && Intrinsics.g(this.f, s5g0Var.f) && Intrinsics.g(this.g, s5g0Var.g) && Intrinsics.g(this.h, s5g0Var.h) && Intrinsics.g(this.i, s5g0Var.i) && this.j == s5g0Var.j && this.k == s5g0Var.k && Intrinsics.g(this.l, s5g0Var.l) && Intrinsics.g(this.m, s5g0Var.m) && this.n == s5g0Var.n;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        u5g0 u5g0Var = this.b;
        int iHashCode2 = (iHashCode + (u5g0Var == null ? 0 : u5g0Var.hashCode())) * 31;
        u5g0 u5g0Var2 = this.c;
        int iHashCode3 = (iHashCode2 + (u5g0Var2 == null ? 0 : u5g0Var2.hashCode())) * 31;
        Integer num = this.d;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.e;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.g;
        int iHashCode7 = (iHashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str = this.h;
        int iHashCode8 = (iHashCode7 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.i;
        int iA = mtg0.a(mtg0.a((iHashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.j), 31, this.k);
        String str3 = this.l;
        int iHashCode9 = (iA + (str3 == null ? 0 : str3.hashCode())) * 31;
        UiText uiText = this.m;
        return Boolean.hashCode(this.n) + ((iHashCode9 + (uiText != null ? uiText.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TournamentBracketMatch(id=");
        sb.append(this.a);
        sb.append(", homeTeam=");
        sb.append(this.b);
        sb.append(", awayTeam=");
        sb.append(this.c);
        sb.append(", homeScore=");
        sb.append(this.d);
        sb.append(", awayScore=");
        cv7.a(sb, this.e, ", penaltyHomeScore=", this.f, ", penaltyAwayScore=");
        w03.a(this.g, ", winnerTeamId=", this.h, ", dateTimeLabel=", sb);
        uts.b(this.i, ", isLive=", ", canBetNow=", sb, this.j);
        mng.a(", eventId=", this.l, ", label=", sb, this.k);
        sb.append(this.m);
        sb.append(", isConsolationMatch=");
        sb.append(this.n);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ s5g0(String str, u5g0 u5g0Var, u5g0 u5g0Var2, Integer num, String str2, String str3) {
        this(str, u5g0Var, u5g0Var2, num, 1, null, null, str2, str3, false, false, null, null, false);
    }
}
