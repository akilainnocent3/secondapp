package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.crypto.IURC.iKBWavCysVP;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes2.dex */
public final class hm00 {
    public final String a;
    public final String b;
    public final ijf0 c;
    public final ijf0 d;
    public final ijf0 e;
    public final UiText f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final ijf0 k;
    public final UiText l;
    public final UiText m;
    public final ijf0 n;
    public final UiText o;
    public final UiText p;
    public final ijf0 q;
    public final UiText r;
    public final UiText s;

    public /* synthetic */ hm00(int i) {
        this("", "", new ijf0((String) null, 0L, 7), new ijf0((String) null, 0L, 7), new ijf0((String) null, 0L, 7), null, "", false, false, false, new ijf0((String) null, 0L, 7), null, null, new ijf0((String) null, 0L, 7), null, null, new ijf0((String) null, 0L, 7), null, null);
    }

    public static hm00 a(hm00 hm00Var, String str, String str2, ijf0 ijf0Var, ijf0 ijf0Var2, ijf0 ijf0Var3, UiText uiText, String str3, boolean z, boolean z2, boolean z3, ijf0 ijf0Var4, ResourceUiText resourceUiText, ResourceUiText resourceUiText2, ijf0 ijf0Var5, ResourceUiText resourceUiText3, ResourceUiText resourceUiText4, ijf0 ijf0Var6, ResourceUiText resourceUiText5, UiText uiText2, int i) {
        String str4 = (i & 1) != 0 ? hm00Var.a : str;
        String str5 = (i & 2) != 0 ? hm00Var.b : str2;
        ijf0 ijf0Var7 = (i & 4) != 0 ? hm00Var.c : ijf0Var;
        ijf0 ijf0Var8 = (i & 8) != 0 ? hm00Var.d : ijf0Var2;
        ijf0 ijf0Var9 = (i & 16) != 0 ? hm00Var.e : ijf0Var3;
        UiText uiText3 = (i & 32) != 0 ? hm00Var.f : uiText;
        String str6 = (i & 64) != 0 ? hm00Var.g : str3;
        boolean z4 = (i & 128) != 0 ? hm00Var.h : z;
        boolean z5 = (i & 256) != 0 ? hm00Var.i : z2;
        boolean z6 = (i & 512) != 0 ? hm00Var.j : z3;
        ijf0 ijf0Var10 = (i & 1024) != 0 ? hm00Var.k : ijf0Var4;
        UiText uiText4 = (i & 2048) != 0 ? hm00Var.l : resourceUiText;
        UiText uiText5 = (i & 4096) != 0 ? hm00Var.m : resourceUiText2;
        ijf0 ijf0Var11 = (i & 8192) != 0 ? hm00Var.n : ijf0Var5;
        String str7 = str4;
        UiText uiText6 = (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? hm00Var.o : resourceUiText3;
        UiText uiText7 = (i & 32768) != 0 ? hm00Var.p : resourceUiText4;
        ijf0 ijf0Var12 = (i & 65536) != 0 ? hm00Var.q : ijf0Var6;
        UiText uiText8 = (i & 131072) != 0 ? hm00Var.r : resourceUiText5;
        UiText uiText9 = (i & 262144) != 0 ? hm00Var.s : uiText2;
        hm00Var.getClass();
        str7.getClass();
        str5.getClass();
        ijf0Var7.getClass();
        ijf0Var8.getClass();
        ijf0Var9.getClass();
        str6.getClass();
        ijf0Var10.getClass();
        ijf0Var11.getClass();
        ijf0Var12.getClass();
        return new hm00(str7, str5, ijf0Var7, ijf0Var8, ijf0Var9, uiText3, str6, z4, z5, z6, ijf0Var10, uiText4, uiText5, ijf0Var11, uiText6, uiText7, ijf0Var12, uiText8, uiText9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hm00)) {
            return false;
        }
        hm00 hm00Var = (hm00) obj;
        return Intrinsics.g(this.a, hm00Var.a) && Intrinsics.g(this.b, hm00Var.b) && Intrinsics.g(this.c, hm00Var.c) && Intrinsics.g(this.d, hm00Var.d) && Intrinsics.g(this.e, hm00Var.e) && Intrinsics.g(this.f, hm00Var.f) && Intrinsics.g(this.g, hm00Var.g) && this.h == hm00Var.h && this.i == hm00Var.i && this.j == hm00Var.j && Intrinsics.g(this.k, hm00Var.k) && Intrinsics.g(this.l, hm00Var.l) && Intrinsics.g(this.m, hm00Var.m) && Intrinsics.g(this.n, hm00Var.n) && Intrinsics.g(this.o, hm00Var.o) && Intrinsics.g(this.p, hm00Var.p) && Intrinsics.g(this.q, hm00Var.q) && Intrinsics.g(this.r, hm00Var.r) && Intrinsics.g(this.s, hm00Var.s);
    }

    public final int hashCode() {
        int iB = ey1.b(this.e, ey1.b(this.d, ey1.b(this.c, gmf0.a(this.a.hashCode() * 31, 31, this.b), 31), 31), 31);
        UiText uiText = this.f;
        int iB2 = ey1.b(this.k, mtg0.a(mtg0.a(mtg0.a(gmf0.a((iB + (uiText == null ? 0 : uiText.hashCode())) * 31, 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31);
        UiText uiText2 = this.l;
        int iHashCode = (iB2 + (uiText2 == null ? 0 : uiText2.hashCode())) * 31;
        UiText uiText3 = this.m;
        int iB3 = ey1.b(this.n, (iHashCode + (uiText3 == null ? 0 : uiText3.hashCode())) * 31, 31);
        UiText uiText4 = this.o;
        int iHashCode2 = (iB3 + (uiText4 == null ? 0 : uiText4.hashCode())) * 31;
        UiText uiText5 = this.p;
        int iB4 = ey1.b(this.q, (iHashCode2 + (uiText5 == null ? 0 : uiText5.hashCode())) * 31, 31);
        UiText uiText6 = this.r;
        int iHashCode3 = (iB4 + (uiText6 == null ? 0 : uiText6.hashCode())) * 31;
        UiText uiText7 = this.s;
        return iHashCode3 + (uiText7 != null ? uiText7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("PersonalInfoUiState(fullName=", this.a, ", dob=", this.b, ", street=");
        sbA.append(this.c);
        sbA.append(", city=");
        sbA.append(this.d);
        sbA.append(", postalCode=");
        sbA.append(this.e);
        sbA.append(", postalCodeError=");
        sbA.append(this.f);
        sbA.append(", state=");
        uts.b(this.g, ", isRunningValidations=", ", isCreatingAccount=", sbA, this.h);
        nng.a(", isAdvancedSettingsExpanded=", ", monthlyLossRealSports=", sbA, this.i, this.j);
        sbA.append(this.k);
        sbA.append(", monthlyLossRealSportsHint=");
        sbA.append(this.l);
        sbA.append(", monthlyLossRealSportsError=");
        sbA.append(this.m);
        sbA.append(", monthlyLossCasino=");
        sbA.append(this.n);
        sbA.append(", monthlyLossCasinoHint=");
        vh8.a(sbA, this.o, ", monthlyLossCasinoError=", this.p, ", weeklyTimeLimit=");
        sbA.append(this.q);
        sbA.append(", weeklyTimeLimitHint=");
        sbA.append(this.r);
        sbA.append(", weeklyTimeLimitError=");
        return plf.a(sbA, this.s, iKBWavCysVP.DIybQmSsBtzsa);
    }

    public hm00(String str, String str2, ijf0 ijf0Var, ijf0 ijf0Var2, ijf0 ijf0Var3, UiText uiText, String str3, boolean z, boolean z2, boolean z3, ijf0 ijf0Var4, UiText uiText2, UiText uiText3, ijf0 ijf0Var5, UiText uiText4, UiText uiText5, ijf0 ijf0Var6, UiText uiText6, UiText uiText7) {
        this.a = str;
        this.b = str2;
        this.c = ijf0Var;
        this.d = ijf0Var2;
        this.e = ijf0Var3;
        this.f = uiText;
        this.g = str3;
        this.h = z;
        this.i = z2;
        this.j = z3;
        this.k = ijf0Var4;
        this.l = uiText2;
        this.m = uiText3;
        this.n = ijf0Var5;
        this.o = uiText4;
        this.p = uiText5;
        this.q = ijf0Var6;
        this.r = uiText6;
        this.s = uiText7;
    }

    public hm00() {
        this(0);
    }
}
