package defpackage;

import com.sporty.android.core.model.pocket.withdraw.bvn.VerifyBVNResponse;
import com.sportybet.android.data.SimpleResponseWrapper;

/* JADX INFO: loaded from: classes5.dex */
public final class qzh0 extends SimpleResponseWrapper<VerifyBVNResponse> {
    public final /* synthetic */ szh0 a;

    public qzh0(szh0 szh0Var) {
        this.a = szh0Var;
    }

    @Override // com.sportybet.android.data.SimpleResponseWrapper
    public final void onFailure(Throwable th) {
        this.a.a.m(null);
    }

    @Override // com.sportybet.android.data.CallbackWrapper
    public final void onResponseComplete() {
        this.a.c = null;
    }

    @Override // com.sportybet.android.data.SimpleResponseWrapper
    public final void onSuccess(VerifyBVNResponse verifyBVNResponse) {
        this.a.a.m(verifyBVNResponse);
    }
}
