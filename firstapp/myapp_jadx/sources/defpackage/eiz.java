package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes5.dex */
public final class eiz {
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
    public final dh30 l;
    public final uxs m;
    public final String n;
    public final vc8 o;
    public final mhz p;
    public final boolean q;
    public final boolean r;

    public eiz(char c, Integer num, UiText uiText, List<String> list, UiText uiText2, UiText uiText3, z900 z900Var, UiText uiText4, UiText uiText5, gtp gtpVar, wg8 wg8Var, dh30 dh30Var, uxs uxsVar, String str, vc8 vc8Var, mhz mhzVar, boolean z, boolean z2) {
        list.getClass();
        uiText4.getClass();
        uiText5.getClass();
        dh30Var.getClass();
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
        this.l = dh30Var;
        this.m = uxsVar;
        this.n = str;
        this.o = vc8Var;
        this.p = mhzVar;
        this.q = z;
        this.r = z2;
    }

    public static eiz a(eiz eizVar, Integer num, UiText uiText, List list, UiText uiText2, UiText uiText3, z900 z900Var, UiText uiText4, UiText uiText5, gtp gtpVar, wg8 wg8Var, dh30 dh30Var, uxs uxsVar, String str, vc8 vc8Var, mhz mhzVar, boolean z, boolean z2, int i) {
        char c = eizVar.a;
        Integer num2 = (i & 2) != 0 ? eizVar.b : num;
        UiText uiText6 = (i & 4) != 0 ? eizVar.c : uiText;
        List list2 = (i & 8) != 0 ? eizVar.d : list;
        UiText uiText7 = (i & 16) != 0 ? eizVar.e : uiText2;
        UiText uiText8 = (i & 32) != 0 ? eizVar.f : uiText3;
        z900 z900Var2 = (i & 64) != 0 ? eizVar.g : z900Var;
        UiText uiText9 = (i & 128) != 0 ? eizVar.h : uiText4;
        UiText uiText10 = (i & 256) != 0 ? eizVar.i : uiText5;
        gtp gtpVar2 = (i & 512) != 0 ? eizVar.j : gtpVar;
        wg8 wg8Var2 = (i & 1024) != 0 ? eizVar.k : wg8Var;
        dh30 dh30Var2 = (i & 2048) != 0 ? eizVar.l : dh30Var;
        uxs uxsVar2 = (i & 4096) != 0 ? eizVar.m : uxsVar;
        String str2 = (i & 8192) != 0 ? eizVar.n : str;
        vc8 vc8Var2 = (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? eizVar.o : vc8Var;
        mhz mhzVar2 = (i & 32768) != 0 ? eizVar.p : mhzVar;
        boolean z3 = (i & 65536) != 0 ? eizVar.q : z;
        boolean z4 = (i & 131072) != 0 ? eizVar.r : z2;
        eizVar.getClass();
        list2.getClass();
        uiText9.getClass();
        uiText10.getClass();
        dh30Var2.getClass();
        uxsVar2.getClass();
        return new eiz(c, num2, uiText6, list2, uiText7, uiText8, z900Var2, uiText9, uiText10, gtpVar2, wg8Var2, dh30Var2, uxsVar2, str2, vc8Var2, mhzVar2, z3, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eiz)) {
            return false;
        }
        eiz eizVar = (eiz) obj;
        return this.a == eizVar.a && Intrinsics.g(this.b, eizVar.b) && Intrinsics.g(this.c, eizVar.c) && Intrinsics.g(this.d, eizVar.d) && Intrinsics.g(this.e, eizVar.e) && Intrinsics.g(this.f, eizVar.f) && this.g.equals(eizVar.g) && Intrinsics.g(this.h, eizVar.h) && Intrinsics.g(this.i, eizVar.i) && this.j.equals(eizVar.j) && this.k.equals(eizVar.k) && Intrinsics.g(this.l, eizVar.l) && this.m == eizVar.m && this.n.equals(eizVar.n) && this.o.equals(eizVar.o) && this.p == eizVar.p && this.q == eizVar.q && this.r == eizVar.r;
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
        int iHashCode4 = (this.o.hashCode() + gmf0.a(y45.a(this.m, (this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + yvf.a(yvf.a((this.g.hashCode() + ((iHashCode3 + (uiText3 == null ? 0 : uiText3.hashCode())) * 31)) * 31, 31, this.h), 31, this.i)) * 31)) * 31)) * 31, 31), 31, this.n)) * 31;
        mhz mhzVar = this.p;
        return Boolean.hashCode(this.r) + mtg0.a((iHashCode4 + (mhzVar != null ? mhzVar.hashCode() : 0)) * 31, 31, this.q);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OzowDepositState(decimalSeparator=");
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
        sb.append(", quickInput=");
        sb.append(this.l);
        sb.append(", depositButtonStatus=");
        sb.append(this.m);
        sb.append(", depositBanner=");
        sb.append(this.n);
        sb.append(", commonDepositDialogsState=");
        sb.append(this.o);
        sb.append(", logoHeight=");
        sb.append(this.p);
        sb.append(", isPendingRequestDialogVisible=");
        return lng.a(", isDepositFailedDialogVisible=", ")", sb, this.q, this.r);
    }
}
