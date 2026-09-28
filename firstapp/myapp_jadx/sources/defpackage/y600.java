package defpackage;

import com.sporty.android.core.model.pocket.common.DefaultLimitAmountData;
import com.sportybet.android.data.SimpleResponseWrapper;

/* JADX INFO: loaded from: classes5.dex */
public final class y600 extends SimpleResponseWrapper<DefaultLimitAmountData> {
    public final /* synthetic */ z600 a;

    public y600(z600 z600Var) {
        this.a = z600Var;
    }

    @Override // com.sportybet.android.data.SimpleResponseWrapper
    public final void onFailure(Throwable th) {
        z600 z600Var = this.a;
        z600Var.e = null;
        z600Var.f.j(Boolean.FALSE);
    }

    @Override // com.sportybet.android.data.SimpleResponseWrapper
    public final void onSuccess(DefaultLimitAmountData defaultLimitAmountData) {
        z600 z600Var = this.a;
        z600Var.e = defaultLimitAmountData;
        z600Var.f.j(Boolean.TRUE);
    }
}
