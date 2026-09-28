package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f5h0 implements b0n {
    public final UiText a;
    public final UiText b;
    public final boolean c;
    public final f1h0 d;

    public f5h0(UiText uiText, UiText uiText2, boolean z, f1h0 f1h0Var) {
        uiText.getClass();
        uiText2.getClass();
        this.a = uiText;
        this.b = uiText2;
        this.c = z;
        this.d = f1h0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f5h0)) {
            return false;
        }
        f5h0 f5h0Var = (f5h0) obj;
        return Intrinsics.g(this.a, f5h0Var.a) && Intrinsics.g(this.b, f5h0Var.b) && this.c == f5h0Var.c && Intrinsics.g(this.d, f5h0Var.d);
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
        return this.d.hashCode() + mtg0.a(yvf.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    @Override // defpackage.b0n
    public final boolean isVisible() {
        return this.c;
    }

    public final String toString() {
        StringBuilder sbA = uh8.a(this.a, this.b, "TxDetailsWithNavInfo(title=", ", content=", ", isVisible=");
        sbA.append(this.c);
        sbA.append(", navInfo=");
        sbA.append(this.d);
        sbA.append(")");
        return sbA.toString();
    }
}
