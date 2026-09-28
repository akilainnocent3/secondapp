package defpackage;

import android.text.TextUtils;
import com.sporty.android.core.model.pocket.common.BankTradeResponse;
import com.sportybet.android.data.SimpleResponseWrapper;

/* JADX INFO: loaded from: classes5.dex */
public final class rzh0 extends SimpleResponseWrapper<BankTradeResponse> {
    public final /* synthetic */ szh0 a;

    public rzh0(szh0 szh0Var) {
        this.a = szh0Var;
    }

    @Override // com.sportybet.android.data.SimpleResponseWrapper
    public final void onFailure(Throwable th) {
        this.a.b.m(null);
    }

    @Override // com.sportybet.android.data.CallbackWrapper
    public final void onResponseComplete() {
        this.a.d = null;
    }

    @Override // com.sportybet.android.data.SimpleResponseWrapper
    public final void onSuccess(BankTradeResponse bankTradeResponse) {
        BankTradeResponse bankTradeResponse2 = bankTradeResponse;
        if (TextUtils.isEmpty(bankTradeResponse2.displayMsg)) {
            bankTradeResponse2.displayMsg = getMessage();
        }
        this.a.b.m(bankTradeResponse2);
    }
}
