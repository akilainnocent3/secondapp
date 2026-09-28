package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes5.dex */
public final class sdu {
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
    public final uxs l;
    public final gtp m;
    public final wg8 n;
    public final vc8 o;
    public final dh30 p;
    public final boolean q;

    public sdu(char c, Integer num, UiText uiText, List<String> list, UiText uiText2, UiText uiText3, z900 z900Var, UiText uiText4, UiText uiText5, UiText uiText6, UiText uiText7, uxs uxsVar, gtp gtpVar, wg8 wg8Var, vc8 vc8Var, dh30 dh30Var, boolean z) {
        list.getClass();
        uiText4.getClass();
        uiText5.getClass();
        uxsVar.getClass();
        dh30Var.getClass();
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
        this.l = uxsVar;
        this.m = gtpVar;
        this.n = wg8Var;
        this.o = vc8Var;
        this.p = dh30Var;
        this.q = z;
    }

    public static sdu a(sdu sduVar, Integer num, UiText uiText, List list, UiText uiText2, UiText uiText3, z900 z900Var, UiText uiText4, UiText uiText5, UiText uiText6, UiText uiText7, uxs uxsVar, gtp gtpVar, wg8 wg8Var, vc8 vc8Var, dh30 dh30Var, boolean z, int i) {
        char c = sduVar.a;
        Integer num2 = (i & 2) != 0 ? sduVar.b : num;
        UiText uiText8 = (i & 4) != 0 ? sduVar.c : uiText;
        List list2 = (i & 8) != 0 ? sduVar.d : list;
        UiText uiText9 = (i & 16) != 0 ? sduVar.e : uiText2;
        UiText uiText10 = (i & 32) != 0 ? sduVar.f : uiText3;
        z900 z900Var2 = (i & 64) != 0 ? sduVar.g : z900Var;
        UiText uiText11 = (i & 128) != 0 ? sduVar.h : uiText4;
        UiText uiText12 = (i & 256) != 0 ? sduVar.i : uiText5;
        UiText uiText13 = (i & 512) != 0 ? sduVar.j : uiText6;
        UiText uiText14 = (i & 1024) != 0 ? sduVar.k : uiText7;
        uxs uxsVar2 = (i & 2048) != 0 ? sduVar.l : uxsVar;
        gtp gtpVar2 = (i & 4096) != 0 ? sduVar.m : gtpVar;
        wg8 wg8Var2 = (i & 8192) != 0 ? sduVar.n : wg8Var;
        vc8 vc8Var2 = (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? sduVar.o : vc8Var;
        dh30 dh30Var2 = (i & 32768) != 0 ? sduVar.p : dh30Var;
        boolean z2 = (i & 65536) != 0 ? sduVar.q : z;
        sduVar.getClass();
        list2.getClass();
        uiText11.getClass();
        uiText12.getClass();
        uxsVar2.getClass();
        dh30Var2.getClass();
        return new sdu(c, num2, uiText8, list2, uiText9, uiText10, z900Var2, uiText11, uiText12, uiText13, uiText14, uxsVar2, gtpVar2, wg8Var2, vc8Var2, dh30Var2, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sdu)) {
            return false;
        }
        sdu sduVar = (sdu) obj;
        return this.a == sduVar.a && Intrinsics.g(this.b, sduVar.b) && Intrinsics.g(this.c, sduVar.c) && Intrinsics.g(this.d, sduVar.d) && Intrinsics.g(this.e, sduVar.e) && Intrinsics.g(this.f, sduVar.f) && this.g.equals(sduVar.g) && Intrinsics.g(this.h, sduVar.h) && Intrinsics.g(this.i, sduVar.i) && Intrinsics.g(this.j, sduVar.j) && Intrinsics.g(this.k, sduVar.k) && this.l == sduVar.l && this.m.equals(sduVar.m) && this.n.equals(sduVar.n) && this.o.equals(sduVar.o) && Intrinsics.g(this.p, sduVar.p) && this.q == sduVar.q;
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
        return Boolean.hashCode(this.q) + ((this.p.hashCode() + ((this.o.hashCode() + ((this.n.hashCode() + ((this.m.hashCode() + y45.a(this.l, (iHashCode4 + (uiText5 != null ? uiText5.hashCode() : 0)) * 31, 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MPesaDepositState(decimalSeparator=");
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
        vh8.a(sb, this.i, ", phoneCountryCode=", this.j, ", phoneNumberMasked=");
        sb.append(this.k);
        sb.append(", depositButtonStatus=");
        sb.append(this.l);
        sb.append(", kycMessage=");
        sb.append(this.m);
        sb.append(", commonPayDialogsState=");
        sb.append(this.n);
        sb.append(", commonDepositDialogsState=");
        sb.append(this.o);
        sb.append(", quickInput=");
        sb.append(this.p);
        sb.append(", isDepositInitiatedDialogVisible=");
        return mq0.a(sb, this.q, ")");
    }
}
