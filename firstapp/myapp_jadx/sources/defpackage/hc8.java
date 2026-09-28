package defpackage;

import com.sporty.android.core.model.patron.AccountInfoModel;
import com.sportybet.android.account.confirm.activity.CommonConfirmNameActivity;
import com.sportybet.android.data.SimpleResponseWrapper;

/* JADX INFO: loaded from: classes5.dex */
public final class hc8 extends SimpleResponseWrapper<AccountInfoModel> {
    public final /* synthetic */ CommonConfirmNameActivity a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hc8(CommonConfirmNameActivity commonConfirmNameActivity, CommonConfirmNameActivity commonConfirmNameActivity2) {
        super(commonConfirmNameActivity2);
        this.a = commonConfirmNameActivity;
    }

    @Override // com.sportybet.android.data.SimpleResponseWrapper
    public final void onSuccess(AccountInfoModel accountInfoModel) {
        AccountInfoModel accountInfoModel2 = accountInfoModel;
        super.onSuccess(accountInfoModel2);
        this.a.e = accountInfoModel2.dataSource;
    }
}
