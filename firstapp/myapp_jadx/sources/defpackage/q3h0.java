package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class q3h0 implements b0n {
    public final UiText a;
    public final UiText b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public q3h0(UiText uiText, UiText uiText2, boolean z, boolean z2, boolean z3) {
        uiText.getClass();
        uiText2.getClass();
        this.a = uiText;
        this.b = uiText2;
        this.c = true;
        this.d = z;
        this.e = z2;
        this.f = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q3h0)) {
            return false;
        }
        q3h0 q3h0Var = (q3h0) obj;
        return Intrinsics.g(this.a, q3h0Var.a) && Intrinsics.g(this.b, q3h0Var.b) && this.c == q3h0Var.c && this.d == q3h0Var.d && this.e == q3h0Var.e && this.f == q3h0Var.f;
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
        return Boolean.hashCode(this.f) + mtg0.a(mtg0.a(mtg0.a(yvf.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    @Override // defpackage.b0n
    public final boolean isVisible() {
        return this.c;
    }

    public final String toString() {
        StringBuilder sbA = uh8.a(this.a, this.b, "TxDetailsStatusInfo(title=", ", content=", ", isVisible=");
        nng.a(", isSucceed=", ", isRefreshNeeded=", sbA, this.c, this.d);
        return lng.a(", showKycVerifyButton=", ")", sbA, this.e, this.f);
    }
}
