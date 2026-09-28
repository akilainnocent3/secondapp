package defpackage;

import android.content.Intent;
import com.sporty.android.core.model.account.AccountActivationData;
import com.sportybet.android.account.AccountActivationWebViewActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class g8 implements Function1 {
    public final /* synthetic */ AccountActivationWebViewActivity a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AccountActivationData accountActivationData = (AccountActivationData) obj;
        int i = AccountActivationWebViewActivity.c;
        if (accountActivationData != null) {
            Intent intentPutExtra = new Intent().putExtra("data", accountActivationData);
            intentPutExtra.getClass();
            AccountActivationWebViewActivity accountActivationWebViewActivity = this.a;
            accountActivationWebViewActivity.setResult(-1, intentPutExtra);
            accountActivationWebViewActivity.finish();
        }
        return Unit.a;
    }
}
