package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes5.dex */
public final class b7y {
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
    public final vc8 n;
    public final boolean o;

    public b7y(char c, Integer num, UiText uiText, List<String> list, UiText uiText2, UiText uiText3, z900 z900Var, UiText uiText4, UiText uiText5, gtp gtpVar, wg8 wg8Var, dh30 dh30Var, uxs uxsVar, vc8 vc8Var, boolean z) {
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
        this.n = vc8Var;
        this.o = z;
    }

    public static b7y a(b7y b7yVar, Integer num, UiText uiText, List list, UiText uiText2, UiText uiText3, z900 z900Var, UiText uiText4, UiText uiText5, gtp gtpVar, wg8 wg8Var, dh30 dh30Var, uxs uxsVar, vc8 vc8Var, boolean z, int i) {
        char c = b7yVar.a;
        Integer num2 = (i & 2) != 0 ? b7yVar.b : num;
        UiText uiText6 = (i & 4) != 0 ? b7yVar.c : uiText;
        List list2 = (i & 8) != 0 ? b7yVar.d : list;
        UiText uiText7 = (i & 16) != 0 ? b7yVar.e : uiText2;
        UiText uiText8 = (i & 32) != 0 ? b7yVar.f : uiText3;
        z900 z900Var2 = (i & 64) != 0 ? b7yVar.g : z900Var;
        UiText uiText9 = (i & 128) != 0 ? b7yVar.h : uiText4;
        UiText uiText10 = (i & 256) != 0 ? b7yVar.i : uiText5;
        gtp gtpVar2 = (i & 512) != 0 ? b7yVar.j : gtpVar;
        wg8 wg8Var2 = (i & 1024) != 0 ? b7yVar.k : wg8Var;
        dh30 dh30Var2 = (i & 2048) != 0 ? b7yVar.l : dh30Var;
        uxs uxsVar2 = (i & 4096) != 0 ? b7yVar.m : uxsVar;
        vc8 vc8Var2 = (i & 8192) != 0 ? b7yVar.n : vc8Var;
        boolean z2 = (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? b7yVar.o : z;
        b7yVar.getClass();
        list2.getClass();
        uiText9.getClass();
        uiText10.getClass();
        dh30Var2.getClass();
        uxsVar2.getClass();
        return new b7y(c, num2, uiText6, list2, uiText7, uiText8, z900Var2, uiText9, uiText10, gtpVar2, wg8Var2, dh30Var2, uxsVar2, vc8Var2, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b7y)) {
            return false;
        }
        b7y b7yVar = (b7y) obj;
        return this.a == b7yVar.a && Intrinsics.g(this.b, b7yVar.b) && Intrinsics.g(this.c, b7yVar.c) && Intrinsics.g(this.d, b7yVar.d) && Intrinsics.g(this.e, b7yVar.e) && Intrinsics.g(this.f, b7yVar.f) && this.g.equals(b7yVar.g) && Intrinsics.g(this.h, b7yVar.h) && Intrinsics.g(this.i, b7yVar.i) && this.j.equals(b7yVar.j) && this.k.equals(b7yVar.k) && Intrinsics.g(this.l, b7yVar.l) && this.m == b7yVar.m && this.n.equals(b7yVar.n) && this.o == b7yVar.o;
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
        return Boolean.hashCode(this.o) + ((this.n.hashCode() + y45.a(this.m, (this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + yvf.a(yvf.a((this.g.hashCode() + ((iHashCode3 + (uiText3 != null ? uiText3.hashCode() : 0)) * 31)) * 31, 31, this.h), 31, this.i)) * 31)) * 31)) * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NuveiDepositState(decimalSeparator=");
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
        sb.append(", commonDepositDialogsState=");
        sb.append(this.n);
        sb.append(", isDepositFailedOverTier1LimitDialogVisible=");
        return mq0.a(sb, this.o, ")");
    }
}
