package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class o3h0 implements b0n {
    public final UiText a;
    public final UiText b;
    public final boolean c;

    public o3h0(UiText uiText, UiText uiText2, boolean z) {
        uiText.getClass();
        uiText2.getClass();
        this.a = uiText;
        this.b = uiText2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o3h0)) {
            return false;
        }
        o3h0 o3h0Var = (o3h0) obj;
        return Intrinsics.g(this.a, o3h0Var.a) && Intrinsics.g(this.b, o3h0Var.b) && this.c == o3h0Var.c;
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
        return mq0.a(uh8.a(this.a, this.b, "TxDetailsSourceOrTargetInfo(title=", ", content=", ", isVisible="), this.c, ")");
    }
}
