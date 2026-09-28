package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes5.dex */
public final class x8y {
    public final char a;
    public final Integer b;
    public final UiText c;
    public final List<String> d;
    public final UiText e;
    public final UiText f;
    public final z900 g;
    public final UiText h;
    public final UiText i;
    public final gtp j;
    public final wg8 k;
    public final uxs l;
    public final rrj0 m;
    public final il8 n;
    public final d3b o;

    public x8y(char c, Integer num, UiText uiText, List<String> list, UiText uiText2, UiText uiText3, z900 z900Var, UiText uiText4, UiText uiText5, gtp gtpVar, wg8 wg8Var, uxs uxsVar, rrj0 rrj0Var, il8 il8Var, d3b d3bVar) {
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
        this.j = gtpVar;
        this.k = wg8Var;
        this.l = uxsVar;
        this.m = rrj0Var;
        this.n = il8Var;
        this.o = d3bVar;
    }

    public static x8y a(x8y x8yVar, Integer num, UiText uiText, List list, UiText uiText2, UiText uiText3, z900 z900Var, UiText uiText4, UiText uiText5, gtp gtpVar, wg8 wg8Var, uxs uxsVar, rrj0 rrj0Var, il8 il8Var, d3b d3bVar, int i) {
        char c = x8yVar.a;
        Integer num2 = (i & 2) != 0 ? x8yVar.b : num;
        UiText uiText6 = (i & 4) != 0 ? x8yVar.c : uiText;
        List list2 = (i & 8) != 0 ? x8yVar.d : list;
        UiText uiText7 = (i & 16) != 0 ? x8yVar.e : uiText2;
        UiText uiText8 = (i & 32) != 0 ? x8yVar.f : uiText3;
        z900 z900Var2 = (i & 64) != 0 ? x8yVar.g : z900Var;
        UiText uiText9 = (i & 128) != 0 ? x8yVar.h : uiText4;
        UiText uiText10 = (i & 256) != 0 ? x8yVar.i : uiText5;
        gtp gtpVar2 = (i & 512) != 0 ? x8yVar.j : gtpVar;
        wg8 wg8Var2 = (i & 1024) != 0 ? x8yVar.k : wg8Var;
        uxs uxsVar2 = (i & 2048) != 0 ? x8yVar.l : uxsVar;
        rrj0 rrj0Var2 = (i & 4096) != 0 ? x8yVar.m : rrj0Var;
        il8 il8Var2 = (i & 8192) != 0 ? x8yVar.n : il8Var;
        d3b d3bVar2 = (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? x8yVar.o : d3bVar;
        x8yVar.getClass();
        list2.getClass();
        uiText9.getClass();
        uiText10.getClass();
        uxsVar2.getClass();
        return new x8y(c, num2, uiText6, list2, uiText7, uiText8, z900Var2, uiText9, uiText10, gtpVar2, wg8Var2, uxsVar2, rrj0Var2, il8Var2, d3bVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x8y)) {
            return false;
        }
        x8y x8yVar = (x8y) obj;
        return this.a == x8yVar.a && Intrinsics.g(this.b, x8yVar.b) && Intrinsics.g(this.c, x8yVar.c) && Intrinsics.g(this.d, x8yVar.d) && Intrinsics.g(this.e, x8yVar.e) && Intrinsics.g(this.f, x8yVar.f) && this.g.equals(x8yVar.g) && Intrinsics.g(this.h, x8yVar.h) && Intrinsics.g(this.i, x8yVar.i) && this.j.equals(x8yVar.j) && this.k.equals(x8yVar.k) && this.l == x8yVar.l && Intrinsics.g(this.m, x8yVar.m) && this.n.equals(x8yVar.n) && Intrinsics.g(this.o, x8yVar.o);
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
        int iA2 = y45.a(this.l, (this.k.hashCode() + ((this.j.hashCode() + yvf.a(yvf.a((this.g.hashCode() + ((iHashCode3 + (uiText3 == null ? 0 : uiText3.hashCode())) * 31)) * 31, 31, this.h), 31, this.i)) * 31)) * 31, 31);
        rrj0 rrj0Var = this.m;
        int iHashCode4 = (this.n.hashCode() + ((iA2 + (rrj0Var == null ? 0 : rrj0Var.hashCode())) * 31)) * 31;
        d3b d3bVar = this.o;
        return iHashCode4 + (d3bVar != null ? d3bVar.a.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NuveiWithdrawState(decimalSeparator=");
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
        sb.append(this.i);
        sb.append(", kycMessage=");
        sb.append(this.j);
        sb.append(", commonPayDialogsState=");
        sb.append(this.k);
        sb.append(", withdrawButtonStatus=");
        sb.append(this.l);
        sb.append(", withdrawableBalance=");
        sb.append(this.m);
        sb.append(", commonWithdrawDialogsState=");
        sb.append(this.n);
        sb.append(", coolDownWithdrawDialog=");
        sb.append(this.o);
        sb.append(")");
        return sb.toString();
    }
}
