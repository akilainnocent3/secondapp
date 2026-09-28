package defpackage;

import com.google.protobuf.Reader;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes5.dex */
public final class jqr {
    public final boolean a;
    public final nor b;
    public final ijf0 c;
    public final UiText d;
    public final ijf0 e;
    public final UiText f;
    public final dwz g;
    public final ijf0 h;
    public final ijf0 i;
    public final ijf0 j;
    public final UiText k;
    public final String l;
    public final int m;
    public final Long n;
    public final ijf0 o;
    public final UiText p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final boolean x;

    public /* synthetic */ jqr(dwz dwzVar, int i) {
        this(false, nor.a.a, new ijf0((String) null, 0L, 7), null, new ijf0((String) null, 0L, 7), null, (i & 64) != 0 ? new dwz(255) : dwzVar, new ijf0((String) null, 0L, 7), new ijf0((String) null, 0L, 7), new ijf0((String) null, 0L, 7), null, "", Reader.READ_DONE, null, new ijf0((String) null, 0L, 7), null, false, true, true, true, true, true, false, false);
    }

    public static jqr a(jqr jqrVar, nor norVar, ijf0 ijf0Var, UiText uiText, ijf0 ijf0Var2, UiText uiText2, dwz dwzVar, ijf0 ijf0Var3, ijf0 ijf0Var4, ijf0 ijf0Var5, UiText uiText3, String str, int i, Long l, ijf0 ijf0Var6, UiText uiText4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, int i2) {
        boolean z9 = (i2 & 1) != 0 ? jqrVar.a : true;
        nor norVar2 = (i2 & 2) != 0 ? jqrVar.b : norVar;
        ijf0 ijf0Var7 = (i2 & 4) != 0 ? jqrVar.c : ijf0Var;
        UiText uiText5 = (i2 & 8) != 0 ? jqrVar.d : uiText;
        ijf0 ijf0Var8 = (i2 & 16) != 0 ? jqrVar.e : ijf0Var2;
        UiText uiText6 = (i2 & 32) != 0 ? jqrVar.f : uiText2;
        dwz dwzVar2 = (i2 & 64) != 0 ? jqrVar.g : dwzVar;
        ijf0 ijf0Var9 = (i2 & 128) != 0 ? jqrVar.h : ijf0Var3;
        ijf0 ijf0Var10 = (i2 & 256) != 0 ? jqrVar.i : ijf0Var4;
        ijf0 ijf0Var11 = (i2 & 512) != 0 ? jqrVar.j : ijf0Var5;
        UiText uiText7 = (i2 & 1024) != 0 ? jqrVar.k : uiText3;
        String str2 = (i2 & 2048) != 0 ? jqrVar.l : str;
        int i3 = (i2 & 4096) != 0 ? jqrVar.m : i;
        Long l2 = (i2 & 8192) != 0 ? jqrVar.n : l;
        boolean z10 = z9;
        ijf0 ijf0Var12 = (i2 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? jqrVar.o : ijf0Var6;
        UiText uiText8 = (i2 & 32768) != 0 ? jqrVar.p : uiText4;
        boolean z11 = (i2 & 65536) != 0 ? jqrVar.q : z;
        boolean z12 = (i2 & 131072) != 0 ? jqrVar.r : z2;
        boolean z13 = (i2 & 262144) != 0 ? jqrVar.s : z3;
        boolean z14 = (i2 & 524288) != 0 ? jqrVar.t : z4;
        boolean z15 = (i2 & 1048576) != 0 ? jqrVar.u : z5;
        boolean z16 = (i2 & 2097152) != 0 ? jqrVar.v : z6;
        boolean z17 = (i2 & 4194304) != 0 ? jqrVar.w : z7;
        boolean z18 = (i2 & 8388608) != 0 ? jqrVar.x : z8;
        jqrVar.getClass();
        norVar2.getClass();
        ijf0Var7.getClass();
        ijf0Var8.getClass();
        dwzVar2.getClass();
        ijf0Var9.getClass();
        ijf0Var10.getClass();
        ijf0Var11.getClass();
        str2.getClass();
        ijf0Var12.getClass();
        return new jqr(z10, norVar2, ijf0Var7, uiText5, ijf0Var8, uiText6, dwzVar2, ijf0Var9, ijf0Var10, ijf0Var11, uiText7, str2, i3, l2, ijf0Var12, uiText8, z11, z12, z13, z14, z15, z16, z17, z18);
    }

    public final uxs b() {
        if (this.x) {
            return uxs.LOADING;
        }
        return (c() && this.r && this.s && this.t && this.u) ? uxs.ENABLE : uxs.DISABLE;
    }

    public final boolean c() {
        if (this.c.a.b.length() <= 0 || this.d != null || !this.g.a() || this.f != null) {
            return false;
        }
        nor norVar = this.b;
        if (norVar.a() != null && (this.h.a.b.length() <= 0 || this.i.a.b.length() <= 0)) {
            return false;
        }
        if (!(norVar.g() && this.k == null) && norVar.g()) {
            return false;
        }
        if ((!norVar.f() || this.o.a.b.length() <= 0) && norVar.f()) {
            return false;
        }
        return ((norVar.e() && this.n != null) || !norVar.e()) && this.p == null && !this.w;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jqr)) {
            return false;
        }
        jqr jqrVar = (jqr) obj;
        return this.a == jqrVar.a && Intrinsics.g(this.b, jqrVar.b) && Intrinsics.g(this.c, jqrVar.c) && Intrinsics.g(this.d, jqrVar.d) && Intrinsics.g(this.e, jqrVar.e) && Intrinsics.g(this.f, jqrVar.f) && Intrinsics.g(this.g, jqrVar.g) && Intrinsics.g(this.h, jqrVar.h) && Intrinsics.g(this.i, jqrVar.i) && Intrinsics.g(this.j, jqrVar.j) && Intrinsics.g(this.k, jqrVar.k) && Intrinsics.g(this.l, jqrVar.l) && this.m == jqrVar.m && Intrinsics.g(this.n, jqrVar.n) && Intrinsics.g(this.o, jqrVar.o) && Intrinsics.g(this.p, jqrVar.p) && this.q == jqrVar.q && this.r == jqrVar.r && this.s == jqrVar.s && this.t == jqrVar.t && this.u == jqrVar.u && this.v == jqrVar.v && this.w == jqrVar.w && this.x == jqrVar.x;
    }

    public final int hashCode() {
        int iB = ey1.b(this.c, (this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31, 31);
        UiText uiText = this.d;
        int iB2 = ey1.b(this.e, (iB + (uiText == null ? 0 : uiText.hashCode())) * 31, 31);
        UiText uiText2 = this.f;
        int iB3 = ey1.b(this.j, ey1.b(this.i, ey1.b(this.h, (this.g.hashCode() + ((iB2 + (uiText2 == null ? 0 : uiText2.hashCode())) * 31)) * 31, 31), 31), 31);
        UiText uiText3 = this.k;
        int iA = gpp.a(this.m, gmf0.a((iB3 + (uiText3 == null ? 0 : uiText3.hashCode())) * 31, 31, this.l), 31);
        Long l = this.n;
        int iB4 = ey1.b(this.o, (iA + (l == null ? 0 : l.hashCode())) * 31, 31);
        UiText uiText4 = this.p;
        return Boolean.hashCode(this.x) + mtg0.a(mtg0.a(mtg0.a(mtg0.a(mtg0.a(mtg0.a(mtg0.a((iB4 + (uiText4 != null ? uiText4.hashCode() : 0)) * 31, 31, this.q), 31, this.r), 31, this.s), 31, this.t), 31, this.u), 31, this.v), 31, this.w);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LatamSignUpEmailUIState(isLoaded=");
        sb.append(this.a);
        sb.append(", country=");
        sb.append(this.b);
        sb.append(", emailValue=");
        sb.append(this.c);
        sb.append(", emailError=");
        sb.append(this.d);
        sb.append(", passwordValue=");
        sb.append(this.e);
        sb.append(", passwordError=");
        sb.append(this.f);
        sb.append(", passwordStatus=");
        sb.append(this.g);
        sb.append(", firstNameValue=");
        sb.append(this.h);
        sb.append(", lastNameValue=");
        sb.append(this.i);
        sb.append(", phoneNumberValue=");
        sb.append(this.j);
        sb.append(", phoneNumberError=");
        sb.append(this.k);
        sb.append(", callingCode=");
        sb.append(this.l);
        sb.append(", phoneNumberMaxLength=");
        sb.append(this.m);
        sb.append(", dateOfBirth=");
        sb.append(this.n);
        sb.append(", kycDocValue=");
        sb.append(this.o);
        sb.append(", kycDocError=");
        sb.append(this.p);
        sb.append(", showKycDocInfoDialog=");
        nng.a(", acceptedAgeRestriction=", ", acceptedPersonalDataRestriction=", sb, this.q, this.r);
        nng.a(", acceptedMonitoringRestriction=", ", acceptedTermsAndConditionsRestriction=", sb, this.s, this.t);
        nng.a(", acceptedMarketingPromotions=", ", isRunningValidations=", sb, this.u, this.v);
        return lng.a(", isCreatingAccount=", ")", sb, this.w, this.x);
    }

    public jqr(boolean z, nor norVar, ijf0 ijf0Var, UiText uiText, ijf0 ijf0Var2, UiText uiText2, dwz dwzVar, ijf0 ijf0Var3, ijf0 ijf0Var4, ijf0 ijf0Var5, UiText uiText3, String str, int i, Long l, ijf0 ijf0Var6, UiText uiText4, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        norVar.getClass();
        dwzVar.getClass();
        this.a = z;
        this.b = norVar;
        this.c = ijf0Var;
        this.d = uiText;
        this.e = ijf0Var2;
        this.f = uiText2;
        this.g = dwzVar;
        this.h = ijf0Var3;
        this.i = ijf0Var4;
        this.j = ijf0Var5;
        this.k = uiText3;
        this.l = str;
        this.m = i;
        this.n = l;
        this.o = ijf0Var6;
        this.p = uiText4;
        this.q = z2;
        this.r = z3;
        this.s = z4;
        this.t = z5;
        this.u = z6;
        this.v = z7;
        this.w = z8;
        this.x = z9;
    }

    public jqr() {
        this(null, 16777215);
    }
}
