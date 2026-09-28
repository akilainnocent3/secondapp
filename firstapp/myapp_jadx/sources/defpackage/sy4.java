package defpackage;

import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class sy4 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final StringUiText f;
    public final StringUiText g;
    public final StringUiText h;
    public final UiText i;
    public final StringUiText j;
    public final StringUiText k;
    public final String l;
    public final String m;
    public final int n;
    public final int o;
    public final rz4 p;

    public sy4(String str, String str2, String str3, String str4, String str5, StringUiText stringUiText, StringUiText stringUiText2, StringUiText stringUiText3, UiText uiText, StringUiText stringUiText4, StringUiText stringUiText5, String str6, String str7, int i, int i2, rz4 rz4Var) {
        uiText.getClass();
        rz4Var.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = stringUiText;
        this.g = stringUiText2;
        this.h = stringUiText3;
        this.i = uiText;
        this.j = stringUiText4;
        this.k = stringUiText5;
        this.l = str6;
        this.m = str7;
        this.n = i;
        this.o = i2;
        this.p = rz4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sy4)) {
            return false;
        }
        sy4 sy4Var = (sy4) obj;
        return Intrinsics.g(this.a, sy4Var.a) && Intrinsics.g(this.b, sy4Var.b) && Intrinsics.g(this.c, sy4Var.c) && Intrinsics.g(this.d, sy4Var.d) && Intrinsics.g(this.e, sy4Var.e) && this.f.equals(sy4Var.f) && this.g.equals(sy4Var.g) && this.h.equals(sy4Var.h) && Intrinsics.g(this.i, sy4Var.i) && this.j.equals(sy4Var.j) && this.k.equals(sy4Var.k) && Intrinsics.g(this.l, sy4Var.l) && Intrinsics.g(this.m, sy4Var.m) && this.n == sy4Var.n && this.o == sy4Var.o && Intrinsics.g(this.p, sy4Var.p);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        int iHashCode5 = (this.k.a.hashCode() + ((this.j.a.hashCode() + yvf.a((this.h.a.hashCode() + ((this.g.a.hashCode() + ((this.f.a.hashCode() + ((iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31)) * 31)) * 31)) * 31, 31, this.i)) * 31)) * 31;
        String str6 = this.l;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.m;
        return this.p.hashCode() + gpp.a(this.o, gpp.a(this.n, (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("BookingCodeInfoOutcomeUiState(sportId=", this.a, ", eventId=", this.b, ", marketId=");
        hxa.c(sbA, this.c, ", outcomeId=", this.d, ", tournamentIconUrl=");
        sbA.append(this.e);
        sbA.append(", outcomeDescUiText=");
        sbA.append(this.f);
        sbA.append(", oddsUiText=");
        sbA.append(this.g);
        sbA.append(", marketDescUiText=");
        sbA.append(this.h);
        sbA.append(", startTimeUiText=");
        sbA.append(this.i);
        sbA.append(", homeTeamNameUiText=");
        sbA.append(this.j);
        sbA.append(", awayTeamNameUiText=");
        sbA.append(this.k);
        sbA.append(", homeTeamIconUrl=");
        sbA.append(this.l);
        sbA.append(", awayTeamIconUrl=");
        wxa.b(this.n, this.m, ", homeTeamDefaultIcon=", ", awayTeamDefaultIcon=", sbA);
        sbA.append(this.o);
        sbA.append(", outcomeStyle=");
        sbA.append(this.p);
        sbA.append(")");
        return sbA.toString();
    }
}
