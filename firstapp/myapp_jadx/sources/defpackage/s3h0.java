package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.pocket.common.PLAOperatorBOConfig;
import com.sporty.android.core.model.pocket.transaction.Transaction;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class s3h0 {
    public final Transaction a;
    public final UiText b;
    public final f1h0 c;
    public final PLAOperatorBOConfig d;
    public final boolean e;
    public final boolean f;

    public s3h0(Transaction transaction, UiText uiText, f1h0 f1h0Var, PLAOperatorBOConfig pLAOperatorBOConfig, boolean z, boolean z2) {
        f1h0Var.getClass();
        this.a = transaction;
        this.b = uiText;
        this.c = f1h0Var;
        this.d = pLAOperatorBOConfig;
        this.e = z;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s3h0)) {
            return false;
        }
        s3h0 s3h0Var = (s3h0) obj;
        return this.a.equals(s3h0Var.a) && this.b.equals(s3h0Var.b) && Intrinsics.g(this.c, s3h0Var.c) && Intrinsics.g(this.d, s3h0Var.d) && this.e == s3h0Var.e && this.f == s3h0Var.f;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + yvf.a(this.a.hashCode() * 31, 31, this.b)) * 31;
        PLAOperatorBOConfig pLAOperatorBOConfig = this.d;
        return Boolean.hashCode(this.f) + mtg0.a((iHashCode + (pLAOperatorBOConfig == null ? 0 : pLAOperatorBOConfig.hashCode())) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TxDetailsUiState(transaction=");
        sb.append(this.a);
        sb.append(", txTypeUiText=");
        sb.append(this.b);
        sb.append(", txDetailNavInfo=");
        sb.append(this.c);
        sb.append(", plaOperatorConfig=");
        sb.append(this.d);
        sb.append(", shouldInitialBalanceShow=");
        return lng.a(", showWinningsTax=", ")", sb, this.e, this.f);
    }
}
