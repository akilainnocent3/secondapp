package defpackage;

import android.accounts.Account;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.sportybet.android.globalpay.pixBtg.withdraw.PixBtgWithdrawActivity;
import com.sportybet.android.verifybet.VerifyBetActivity;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class y75 implements tit {
    public final /* synthetic */ int a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ Object c;

    public /* synthetic */ y75(Activity activity, Object obj, int i) {
        this.a = i;
        this.b = activity;
        this.c = obj;
    }

    @Override // defpackage.tit
    public final void w(Account account, boolean z) {
        int i = this.a;
        Object obj = this.c;
        Activity activity = this.b;
        switch (i) {
            case 0:
                Bundle bundle = (Bundle) obj;
                if (account != null) {
                    int i2 = PixBtgWithdrawActivity.b;
                    Intent intent = new Intent(activity, (Class<?>) PixBtgWithdrawActivity.class);
                    if (bundle != null) {
                        intent.putExtras(bundle);
                    }
                    yrh0.s(activity, intent, true);
                    break;
                }
                break;
            default:
                VerifyBetActivity verifyBetActivity = (VerifyBetActivity) activity;
                String str = (String) obj;
                int i3 = VerifyBetActivity.f;
                if (account != null) {
                    tyh0 tyh0Var = (tyh0) verifyBetActivity.c.getValue();
                    ej5.c(o8i0.d(tyh0Var), null, null, new syh0(tyh0Var, str, null), 3);
                }
                break;
        }
    }
}
