package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class byk {
    public static final byk j = new byk(false, "", cyk.a.a, false, false, false, false, "", vch0.a);
    public final boolean a;
    public final String b;
    public final cyk c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final String h;
    public final UiText i;

    public byk(boolean z, String str, cyk cykVar, boolean z2, boolean z3, boolean z4, boolean z5, String str2, UiText uiText) {
        cykVar.getClass();
        uiText.getClass();
        this.a = z;
        this.b = str;
        this.c = cykVar;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = str2;
        this.i = uiText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof byk)) {
            return false;
        }
        byk bykVar = (byk) obj;
        return this.a == bykVar.a && this.b.equals(bykVar.b) && Intrinsics.g(this.c, bykVar.c) && this.d == bykVar.d && this.e == bykVar.e && this.f == bykVar.f && this.g == bykVar.g && this.h.equals(bykVar.h) && Intrinsics.g(this.i, bykVar.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + gmf0.a(mtg0.a(mtg0.a(mtg0.a(mtg0.a((this.c.hashCode() + gmf0.a(Boolean.hashCode(this.a) * 31, 31, this.b)) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sbA = t160.a("GiftValueEditorUiState(isVisible=", ", selectedGiftTotalValue=", this.b, ", giftValueOption=", this.a);
        sbA.append(this.c);
        sbA.append(", isAddingToStake=");
        sbA.append(this.d);
        sbA.append(", isAddToStakeSwitcherVisible=");
        nng.a(", isGiftSelectorVisible=", ", isUseButtonEnabled=", sbA, this.e, this.f);
        mng.a(", potentialWinString=", this.h, ", partialValuePlaceHolderString=", sbA, this.g);
        return plf.a(sbA, this.i, ")");
    }
}
