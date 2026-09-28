package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class gz4 {
    public final String a;
    public final UiText b;
    public final UiText c;
    public final List<sy4> d;
    public final boolean e;
    public final boolean f;
    public final int g;
    public final tzs h;
    public final tzs i;
    public final tzs j;
    public final int k;
    public final int l;

    public gz4(String str, UiText uiText, UiText uiText2, List<sy4> list, boolean z, boolean z2, int i, tzs tzsVar, tzs tzsVar2, tzs tzsVar3, int i2, int i3) {
        str.getClass();
        uiText2.getClass();
        tzsVar.getClass();
        tzsVar2.getClass();
        tzsVar3.getClass();
        this.a = str;
        this.b = uiText;
        this.c = uiText2;
        this.d = list;
        this.e = z;
        this.f = z2;
        this.g = i;
        this.h = tzsVar;
        this.i = tzsVar2;
        this.j = tzsVar3;
        this.k = i2;
        this.l = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gz4)) {
            return false;
        }
        gz4 gz4Var = (gz4) obj;
        return Intrinsics.g(this.a, gz4Var.a) && this.b.equals(gz4Var.b) && Intrinsics.g(this.c, gz4Var.c) && this.d.equals(gz4Var.d) && this.e == gz4Var.e && this.f == gz4Var.f && this.g == gz4Var.g && Intrinsics.g(this.h, gz4Var.h) && Intrinsics.g(this.i, gz4Var.i) && Intrinsics.g(this.j, gz4Var.j) && this.k == gz4Var.k && this.l == gz4Var.l;
    }

    public final int hashCode() {
        return Integer.hashCode(this.l) + gpp.a(this.k, (this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + gpp.a(this.g, mtg0.a(mtg0.a(ai50.a(yvf.a(yvf.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31)) * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbA = x45.a(this.b, "BookingCodeInfoUiState(bookingCode=", this.a, ", foldsAmountUiText=", ", oddsUiText=");
        sbA.append(this.c);
        sbA.append(", outcomeUiStates=");
        sbA.append(this.d);
        sbA.append(", isBetBuilder=");
        nng.a(", isAddToMultiMakerVisible=", ", outcomeDividerIndex=", sbA, this.e, this.f);
        sbA.append(this.g);
        sbA.append(", shareButtonUiState=");
        sbA.append(this.h);
        sbA.append(", addToBetslipUiState=");
        sbA.append(this.i);
        sbA.append(", addToMultiMakerUiState=");
        sbA.append(this.j);
        sbA.append(", outcomesSectionMaxHeightDp=");
        return b7f.a(sbA, this.k, ", outcomesSectionMinHeightDp=", this.l, ")");
    }
}
