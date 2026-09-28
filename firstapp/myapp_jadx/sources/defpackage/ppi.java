package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes6.dex */
public final class ppi {
    public final Integer a;
    public final UiText b;
    public final Pair<UiText, UiText> c;
    public final UiText d;
    public final UiText e;
    public final boolean f;
    public final boolean g;
    public final UiText h;
    public final UiText i;
    public final UiText j;
    public final UiText k;
    public final String l;
    public final String m;
    public final UiText n;
    public final UiText o;
    public final p800 p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final UiText t;
    public final u75 u;
    public final boolean v;
    public final List<mpi> w;

    public ppi(Integer num, UiText uiText, Pair pair, ResourceUiText resourceUiText, ResourceUiText resourceUiText2, boolean z, boolean z2, ResourceUiText resourceUiText3, ResourceUiText resourceUiText4, ResourceUiText resourceUiText5, ResourceUiText resourceUiText6, boolean z3, ResourceUiText resourceUiText7, u75 u75Var, boolean z4, List list, int i) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : uiText, (i & 4) != 0 ? null : pair, (i & 8) != 0 ? null : resourceUiText, (i & 16) != 0 ? null : resourceUiText2, (i & 32) != 0 ? false : z, (i & 64) != 0 ? false : z2, null, (i & 256) != 0 ? null : resourceUiText3, (i & 512) != 0 ? null : resourceUiText4, (i & 1024) != 0 ? null : resourceUiText5, null, null, null, (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : resourceUiText6, new p800(0), true, (131072 & i) != 0 ? false : z3, true, (524288 & i) != 0 ? vch0.a : resourceUiText7, (1048576 & i) != 0 ? null : u75Var, (2097152 & i) != 0 ? false : z4, (i & 4194304) != 0 ? m2g.a : list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppi)) {
            return false;
        }
        ppi ppiVar = (ppi) obj;
        return Intrinsics.g(this.a, ppiVar.a) && Intrinsics.g(this.b, ppiVar.b) && Intrinsics.g(this.c, ppiVar.c) && Intrinsics.g(this.d, ppiVar.d) && Intrinsics.g(this.e, ppiVar.e) && this.f == ppiVar.f && this.g == ppiVar.g && Intrinsics.g(this.h, ppiVar.h) && Intrinsics.g(this.i, ppiVar.i) && Intrinsics.g(this.j, ppiVar.j) && Intrinsics.g(this.k, ppiVar.k) && Intrinsics.g(this.l, ppiVar.l) && Intrinsics.g(this.m, ppiVar.m) && Intrinsics.g(this.n, ppiVar.n) && Intrinsics.g(this.o, ppiVar.o) && Intrinsics.g(this.p, ppiVar.p) && this.q == ppiVar.q && this.r == ppiVar.r && this.s == ppiVar.s && Intrinsics.g(this.t, ppiVar.t) && Intrinsics.g(this.u, ppiVar.u) && this.v == ppiVar.v && Intrinsics.g(this.w, ppiVar.w);
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        UiText uiText = this.b;
        int iHashCode2 = (iHashCode + (uiText == null ? 0 : uiText.hashCode())) * 31;
        Pair<UiText, UiText> pair = this.c;
        int iHashCode3 = (iHashCode2 + (pair == null ? 0 : pair.hashCode())) * 31;
        UiText uiText2 = this.d;
        int iHashCode4 = (iHashCode3 + (uiText2 == null ? 0 : uiText2.hashCode())) * 31;
        UiText uiText3 = this.e;
        int iA = mtg0.a(mtg0.a((iHashCode4 + (uiText3 == null ? 0 : uiText3.hashCode())) * 31, 31, this.f), 31, this.g);
        UiText uiText4 = this.h;
        int iHashCode5 = (iA + (uiText4 == null ? 0 : uiText4.hashCode())) * 31;
        UiText uiText5 = this.i;
        int iHashCode6 = (iHashCode5 + (uiText5 == null ? 0 : uiText5.hashCode())) * 31;
        UiText uiText6 = this.j;
        int iHashCode7 = (iHashCode6 + (uiText6 == null ? 0 : uiText6.hashCode())) * 31;
        UiText uiText7 = this.k;
        int iHashCode8 = (iHashCode7 + (uiText7 == null ? 0 : uiText7.hashCode())) * 31;
        String str = this.l;
        int iHashCode9 = (iHashCode8 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.m;
        int iHashCode10 = (iHashCode9 + (str2 == null ? 0 : str2.hashCode())) * 31;
        UiText uiText8 = this.n;
        int iHashCode11 = (iHashCode10 + (uiText8 == null ? 0 : uiText8.hashCode())) * 31;
        UiText uiText9 = this.o;
        int iA2 = yvf.a(mtg0.a(mtg0.a(mtg0.a((this.p.hashCode() + ((iHashCode11 + (uiText9 == null ? 0 : uiText9.hashCode())) * 31)) * 31, 31, this.q), 31, this.r), 31, this.s), 31, this.t);
        u75 u75Var = this.u;
        return this.w.hashCode() + mtg0.a((iA2 + (u75Var != null ? u75Var.hashCode() : 0)) * 31, 31, this.v);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FooterState(ageIcon=");
        sb.append(this.a);
        sb.append(", ageTip=");
        sb.append(this.b);
        sb.append(", payBill=");
        sb.append(this.c);
        sb.append(", copyright=");
        sb.append(this.d);
        sb.append(", paymentMethodsText=");
        sb.append(this.e);
        sb.append(", supportsCustomerService=");
        sb.append(this.f);
        sb.append(", supportsContactUs=");
        sb.append(this.g);
        sb.append(", contactUsEmail=");
        sb.append(this.h);
        sb.append(", merRegulations=");
        vh8.a(sb, this.i, ", responsibleGaming=", this.j, ", paia=");
        sb.append(this.k);
        sb.append(", partnersImageUrl=");
        sb.append(this.l);
        sb.append(", endorsementImageUrl=");
        sb.append(this.m);
        sb.append(", partnershipBannerImageUrl=");
        sb.append(this.n);
        sb.append(", copyrightDisclaimer=");
        sb.append(this.o);
        sb.append(", paymentProviders=");
        sb.append(this.p);
        sb.append(", showFooterInfo=");
        nng.a(", showDateTime=", ", showLogoutButton=", sb, this.q, this.r);
        sb.append(this.s);
        sb.append(", slogan=");
        sb.append(this.t);
        sb.append(", brCustomerSupport=");
        sb.append(this.u);
        sb.append(", showMoneyPolicy=");
        sb.append(this.v);
        sb.append(", socialLinks=");
        return ng1.a(sb, this.w, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ppi(Integer num, UiText uiText, Pair<? extends UiText, ? extends UiText> pair, UiText uiText2, UiText uiText3, boolean z, boolean z2, UiText uiText4, UiText uiText5, UiText uiText6, UiText uiText7, String str, String str2, UiText uiText8, UiText uiText9, p800 p800Var, boolean z3, boolean z4, boolean z5, UiText uiText10, u75 u75Var, boolean z6, List<mpi> list) {
        p800Var.getClass();
        uiText10.getClass();
        list.getClass();
        this.a = num;
        this.b = uiText;
        this.c = pair;
        this.d = uiText2;
        this.e = uiText3;
        this.f = z;
        this.g = z2;
        this.h = uiText4;
        this.i = uiText5;
        this.j = uiText6;
        this.k = uiText7;
        this.l = str;
        this.m = str2;
        this.n = uiText8;
        this.o = uiText9;
        this.p = p800Var;
        this.q = z3;
        this.r = z4;
        this.s = z5;
        this.t = uiText10;
        this.u = u75Var;
        this.v = z6;
        this.w = list;
    }

    public ppi() {
        this(null, null, null, null, null, false, false, null, null, null, null, false, null, null, false, null, 8388607);
    }
}
