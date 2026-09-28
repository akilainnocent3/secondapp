package defpackage;

import com.google.android.material.circularreveal.cardview.Kghu.xOgHBQVl;
import com.sporty.android.common_ui.uitext.UiText;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes2.dex */
public final class pfu {
    public final char a;
    public final Integer b;
    public final UiText c;
    public final List<String> d;
    public final UiText e;
    public final UiText f;
    public final z900 g;
    public final UiText h;
    public final UiText i;
    public final UiText j;
    public final UiText k;
    public final gtp l;
    public final wg8 m;
    public final uxs n;
    public final rrj0 o;
    public final il8 p;

    public pfu(char c, Integer num, UiText uiText, List<String> list, UiText uiText2, UiText uiText3, z900 z900Var, UiText uiText4, UiText uiText5, UiText uiText6, UiText uiText7, gtp gtpVar, wg8 wg8Var, uxs uxsVar, rrj0 rrj0Var, il8 il8Var) {
        list.getClass();
        uiText4.getClass();
        uiText5.getClass();
        uxsVar.getClass();
        this.a = c;
        this.b = num;
        this.c = uiText;
        this.d = list;
        this.e = uiText2;
        this.f = uiText3;
        this.g = z900Var;
        this.h = uiText4;
        this.i = uiText5;
        this.j = uiText6;
        this.k = uiText7;
        this.l = gtpVar;
        this.m = wg8Var;
        this.n = uxsVar;
        this.o = rrj0Var;
        this.p = il8Var;
    }

    public static pfu a(pfu pfuVar, Integer num, UiText uiText, List list, UiText uiText2, UiText uiText3, z900 z900Var, UiText uiText4, UiText uiText5, UiText uiText6, UiText uiText7, gtp gtpVar, wg8 wg8Var, uxs uxsVar, rrj0 rrj0Var, il8 il8Var, int i) {
        char c = pfuVar.a;
        Integer num2 = (i & 2) != 0 ? pfuVar.b : num;
        UiText uiText8 = (i & 4) != 0 ? pfuVar.c : uiText;
        List list2 = (i & 8) != 0 ? pfuVar.d : list;
        UiText uiText9 = (i & 16) != 0 ? pfuVar.e : uiText2;
        UiText uiText10 = (i & 32) != 0 ? pfuVar.f : uiText3;
        z900 z900Var2 = (i & 64) != 0 ? pfuVar.g : z900Var;
        UiText uiText11 = (i & 128) != 0 ? pfuVar.h : uiText4;
        UiText uiText12 = (i & 256) != 0 ? pfuVar.i : uiText5;
        UiText uiText13 = (i & 512) != 0 ? pfuVar.j : uiText6;
        UiText uiText14 = (i & 1024) != 0 ? pfuVar.k : uiText7;
        gtp gtpVar2 = (i & 2048) != 0 ? pfuVar.l : gtpVar;
        wg8 wg8Var2 = (i & 4096) != 0 ? pfuVar.m : wg8Var;
        uxs uxsVar2 = (i & 8192) != 0 ? pfuVar.n : uxsVar;
        rrj0 rrj0Var2 = (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? pfuVar.o : rrj0Var;
        il8 il8Var2 = (i & 32768) != 0 ? pfuVar.p : il8Var;
        pfuVar.getClass();
        list2.getClass();
        uiText11.getClass();
        uiText12.getClass();
        uxsVar2.getClass();
        return new pfu(c, num2, uiText8, list2, uiText9, uiText10, z900Var2, uiText11, uiText12, uiText13, uiText14, gtpVar2, wg8Var2, uxsVar2, rrj0Var2, il8Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pfu)) {
            return false;
        }
        pfu pfuVar = (pfu) obj;
        return this.a == pfuVar.a && Intrinsics.g(this.b, pfuVar.b) && Intrinsics.g(this.c, pfuVar.c) && Intrinsics.g(this.d, pfuVar.d) && Intrinsics.g(this.e, pfuVar.e) && Intrinsics.g(this.f, pfuVar.f) && this.g.equals(pfuVar.g) && Intrinsics.g(this.h, pfuVar.h) && Intrinsics.g(this.i, pfuVar.i) && Intrinsics.g(this.j, pfuVar.j) && Intrinsics.g(this.k, pfuVar.k) && this.l.equals(pfuVar.l) && this.m.equals(pfuVar.m) && this.n == pfuVar.n && Intrinsics.g(this.o, pfuVar.o) && this.p.equals(pfuVar.p);
    }

    public final int hashCode() {
        int iHashCode = Character.hashCode(this.a) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        UiText uiText = this.c;
        int iA = ai50.a((iHashCode2 + (uiText == null ? 0 : uiText.hashCode())) * 31, 31, this.d);
        UiText uiText2 = this.e;
        int iHashCode3 = (iA + (uiText2 == null ? 0 : uiText2.hashCode())) * 31;
        UiText uiText3 = this.f;
        int iA2 = yvf.a(yvf.a((this.g.hashCode() + ((iHashCode3 + (uiText3 == null ? 0 : uiText3.hashCode())) * 31)) * 31, 31, this.h), 31, this.i);
        UiText uiText4 = this.j;
        int iHashCode4 = (iA2 + (uiText4 == null ? 0 : uiText4.hashCode())) * 31;
        UiText uiText5 = this.k;
        int iA3 = y45.a(this.n, (this.m.hashCode() + ((this.l.hashCode() + ((iHashCode4 + (uiText5 == null ? 0 : uiText5.hashCode())) * 31)) * 31)) * 31, 31);
        rrj0 rrj0Var = this.o;
        return this.p.hashCode() + ((iA3 + (rrj0Var != null ? rrj0Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MPesaWithdrawState(decimalSeparator=");
        sb.append(this.a);
        sb.append(", logo=");
        sb.append(this.b);
        sb.append(", topHint=");
        sb.append(this.c);
        sb.append(", hints=");
        sb.append(this.d);
        sb.append(", amountLabel=");
        vh8.a(sb, this.e, ", amountHint=", this.f, ", amountError=");
        sb.append(this.g);
        sb.append(", balanceLabel=");
        sb.append(this.h);
        sb.append(", balanceText=");
        vh8.a(sb, this.i, xOgHBQVl.YegMCWzDwSxsr, this.j, ", phoneNumberMasked=");
        sb.append(this.k);
        sb.append(", kycMessage=");
        sb.append(this.l);
        sb.append(", commonPayDialogsState=");
        sb.append(this.m);
        sb.append(", withdrawButtonStatus=");
        sb.append(this.n);
        sb.append(", withdrawableBalance=");
        sb.append(this.o);
        sb.append(", commonWithdrawDialogsState=");
        sb.append(this.p);
        sb.append(")");
        return sb.toString();
    }
}
