package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.OrderBetType;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes7.dex */
public final class i91 {
    public final String a;
    public final l91 b;
    public final OrderBetType c;
    public final UiText d;
    public final UiText e;
    public final int f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final UiText n;
    public final boolean o;
    public final String p;
    public final String q;
    public final String r;
    public final String s;
    public final String t;

    public i91(String str, l91 l91Var, OrderBetType orderBetType, UiText uiText, UiText uiText2, int i, String str2, String str3, String str4, String str5, String str6, String str7, String str8, UiText uiText3, boolean z, String str9, String str10, String str11, String str12, String str13) {
        str.getClass();
        uiText.getClass();
        this.a = str;
        this.b = l91Var;
        this.c = orderBetType;
        this.d = uiText;
        this.e = uiText2;
        this.f = i;
        this.g = str2;
        this.h = str3;
        this.i = str4;
        this.j = str5;
        this.k = str6;
        this.l = str7;
        this.m = str8;
        this.n = uiText3;
        this.o = z;
        this.p = str9;
        this.q = str10;
        this.r = str11;
        this.s = str12;
        this.t = str13;
    }

    public static i91 a(i91 i91Var, String str, boolean z, int i) {
        String str2 = i91Var.a;
        l91 l91Var = i91Var.b;
        OrderBetType orderBetType = i91Var.c;
        UiText uiText = i91Var.d;
        UiText uiText2 = i91Var.e;
        int i2 = i91Var.f;
        String str3 = i91Var.g;
        String str4 = i91Var.h;
        String str5 = i91Var.i;
        String str6 = i91Var.j;
        String str7 = i91Var.k;
        String str8 = (i & 2048) != 0 ? i91Var.l : str;
        String str9 = i91Var.m;
        String str10 = str8;
        UiText uiText3 = i91Var.n;
        boolean z2 = (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? i91Var.o : z;
        String str11 = i91Var.p;
        String str12 = i91Var.q;
        String str13 = i91Var.r;
        String str14 = i91Var.s;
        String str15 = i91Var.t;
        str2.getClass();
        uiText.getClass();
        str10.getClass();
        return new i91(str2, l91Var, orderBetType, uiText, uiText2, i2, str3, str4, str5, str6, str7, str10, str9, uiText3, z2, str11, str12, str13, str14, str15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i91)) {
            return false;
        }
        i91 i91Var = (i91) obj;
        return Intrinsics.g(this.a, i91Var.a) && this.b == i91Var.b && this.c == i91Var.c && Intrinsics.g(this.d, i91Var.d) && this.e.equals(i91Var.e) && this.f == i91Var.f && this.g.equals(i91Var.g) && this.h.equals(i91Var.h) && this.i.equals(i91Var.i) && Intrinsics.g(this.j, i91Var.j) && this.k.equals(i91Var.k) && this.l.equals(i91Var.l) && this.m.equals(i91Var.m) && Intrinsics.g(this.n, i91Var.n) && this.o == i91Var.o && this.p.equals(i91Var.p) && this.q.equals(i91Var.q) && Intrinsics.g(this.r, i91Var.r) && this.s.equals(i91Var.s) && Intrinsics.g(this.t, i91Var.t);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        l91 l91Var = this.b;
        int iHashCode2 = (iHashCode + (l91Var == null ? 0 : l91Var.hashCode())) * 31;
        OrderBetType orderBetType = this.c;
        int iA = gmf0.a(gmf0.a(gmf0.a(gpp.a(this.f, yvf.a(yvf.a((iHashCode2 + (orderBetType == null ? 0 : orderBetType.hashCode())) * 31, 31, this.d), 31, this.e), 31), 31, this.g), 31, this.h), 31, this.i);
        String str = this.j;
        int iA2 = gmf0.a(gmf0.a(gmf0.a((iA + (str == null ? 0 : str.hashCode())) * 31, 31, this.k), 31, this.l), 31, this.m);
        UiText uiText = this.n;
        int iA3 = gmf0.a(gmf0.a(mtg0.a((iA2 + (uiText == null ? 0 : uiText.hashCode())) * 31, 31, this.o), 31, this.p), 31, this.q);
        String str2 = this.r;
        int iA4 = gmf0.a((iA3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.s);
        String str3 = this.t;
        return iA4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AutoBetItem(settingId=");
        sb.append(this.a);
        sb.append(", status=");
        sb.append(this.b);
        sb.append(", orderType=");
        sb.append(this.c);
        sb.append(", statusText=");
        sb.append(this.d);
        sb.append(", orderTypeText=");
        sb.append(this.e);
        sb.append(", count=");
        sb.append(this.f);
        sb.append(", match=");
        hxa.c(sb, this.g, ", market=", this.h, ", outcome=");
        hxa.c(sb, this.i, ", sportIconUrl=", this.j, ", stake=");
        hxa.c(sb, this.k, ", odds=", this.l, ", targetOdds=");
        sb.append(this.m);
        sb.append(", failReason=");
        sb.append(this.n);
        sb.append(", isDeleting=");
        mng.a(", eventId=", this.p, ", marketId=", sb, this.o);
        hxa.c(sb, this.q, ", specifier=", this.r, ", outcomeId=");
        return kwi.a(sb, this.s, ", orderId=", this.t, ")");
    }
}
