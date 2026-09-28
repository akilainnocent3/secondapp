package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class t2h0 implements b0n {
    public final UiText a;
    public final UiText b;
    public final boolean c;

    public t2h0(UiText uiText, UiText uiText2, int i) {
        this((i & 1) != 0 ? vch0.a : uiText, (i & 2) != 0 ? vch0.a : uiText2, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t2h0)) {
            return false;
        }
        t2h0 t2h0Var = (t2h0) obj;
        return Intrinsics.g(this.a, t2h0Var.a) && Intrinsics.g(this.b, t2h0Var.b) && this.c == t2h0Var.c;
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
        return Boolean.hashCode(this.c) + yvf.a(this.a.hashCode() * 31, 31, this.b);
    }

    @Override // defpackage.b0n
    public final boolean isVisible() {
        return this.c;
    }

    public final String toString() {
        return mq0.a(uh8.a(this.a, this.b, "TxDetailsInfo(title=", ", content=", ", isVisible="), this.c, ")");
    }

    public t2h0(UiText uiText, UiText uiText2, boolean z) {
        uiText.getClass();
        uiText2.getClass();
        this.a = uiText;
        this.b = uiText2;
        this.c = z;
    }
}
