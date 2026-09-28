package defpackage;

import com.sporty.android.core.model.patron.WithdrawalPinVerifyResponse;
import com.sportybet.android.data.SimpleResponseWrapper;

/* JADX INFO: loaded from: classes6.dex */
public final class sz00 extends SimpleResponseWrapper<WithdrawalPinVerifyResponse> {
    public final /* synthetic */ tz00 a;

    public sz00(tz00 tz00Var) {
        this.a = tz00Var;
    }

    @Override // com.sportybet.android.data.SimpleResponseWrapper
    public final void onFailure(Throwable th) {
        this.a.c.m(null);
    }

    @Override // com.sportybet.android.data.SimpleResponseWrapper
    public final void onSuccess(WithdrawalPinVerifyResponse withdrawalPinVerifyResponse) {
        this.a.c.m(withdrawalPinVerifyResponse);
    }
}
