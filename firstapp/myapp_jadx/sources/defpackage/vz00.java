package defpackage;

import com.sporty.android.core.model.security.sportypin.WithdrawalPinStatusInfo;
import com.sportybet.android.data.SimpleResponseWrapper;

/* JADX INFO: loaded from: classes6.dex */
public final class vz00 extends SimpleResponseWrapper<WithdrawalPinStatusInfo> {
    public final /* synthetic */ tz00 a;

    public vz00(tz00 tz00Var) {
        this.a = tz00Var;
    }

    @Override // com.sportybet.android.data.SimpleResponseWrapper
    public final void onFailure(Throwable th) {
        this.a.b.m(null);
    }

    @Override // com.sportybet.android.data.SimpleResponseWrapper
    public final void onSuccess(WithdrawalPinStatusInfo withdrawalPinStatusInfo) {
        this.a.b.m(withdrawalPinStatusInfo);
    }
}
