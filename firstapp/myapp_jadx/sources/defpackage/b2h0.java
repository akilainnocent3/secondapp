package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b2h0 implements b0n {
    public final UiText a;
    public final UiText b;
    public final boolean c;
    public final UiText d;
    public final boolean e;
    public final c2h0 f;

    public b2h0(UiText uiText, UiText uiText2, c2h0 c2h0Var, int i) {
        this((i & 1) != 0 ? vch0.a : uiText, (i & 2) != 0 ? vch0.a : uiText2, (i & 4) == 0, vch0.a, (i & 16) != 0, (i & 32) != 0 ? c2h0.b.a : c2h0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b2h0)) {
            return false;
        }
        b2h0 b2h0Var = (b2h0) obj;
        return Intrinsics.g(this.a, b2h0Var.a) && Intrinsics.g(this.b, b2h0Var.b) && this.c == b2h0Var.c && Intrinsics.g(this.d, b2h0Var.d) && this.e == b2h0Var.e && Intrinsics.g(this.f, b2h0Var.f);
    }

    @Override // defpackage.b0n
    public final UiText getContent() {
        return this.b;
    }

    @Override // defpackage.b0n
    public final UiText getTitle() {
        return this.a;
    }

    public final int hashCode() {
        return this.f.hashCode() + mtg0.a(yvf.a(mtg0.a(yvf.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    @Override // defpackage.b0n
    public final boolean isVisible() {
        return this.c;
    }

    public final String toString() {
        StringBuilder sbA = uh8.a(this.a, this.b, "TxDetailsAlertInfo(title=", ", content=", ", isVisible=");
        sbA.append(this.c);
        sbA.append(", buttonText=");
        sbA.append(this.d);
        sbA.append(", isButtonVisible=");
        sbA.append(this.e);
        sbA.append(", alertType=");
        sbA.append(this.f);
        sbA.append(")");
        return sbA.toString();
    }

    public b2h0(UiText uiText, UiText uiText2, boolean z, UiText uiText3, boolean z2, c2h0 c2h0Var) {
        uiText.getClass();
        uiText2.getClass();
        uiText3.getClass();
        c2h0Var.getClass();
        this.a = uiText;
        this.b = uiText2;
        this.c = z;
        this.d = uiText3;
        this.e = z2;
        this.f = c2h0Var;
    }
}
