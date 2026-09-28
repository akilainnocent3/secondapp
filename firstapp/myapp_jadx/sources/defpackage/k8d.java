package defpackage;

import android.content.Context;
import android.content.Intent;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.patron.NameConfirmationStatus;
import com.sporty.android.core.model.patron.UserCertConstants;
import com.sporty.android.core.model.patron.UserCertStatusRules;
import com.sportybet.android.data.SimpleResponseWrapper;
import com.sportybet.feature.kyc.confirmAccountInfo.ConfirmAccountInfoActivity;

/* JADX INFO: loaded from: classes6.dex */
public final class k8d extends SimpleResponseWrapper<NameConfirmationStatus> {
    public final /* synthetic */ h8d a;

    public k8d(h8d h8dVar) {
        this.a = h8dVar;
    }

    @Override // com.sportybet.android.data.SimpleResponseWrapper
    public final void onFailure(Throwable th) {
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_UI_ROUTER);
        aVar.o(th);
        this.a.c();
    }

    @Override // com.sportybet.android.data.SimpleResponseWrapper
    public final void onSuccess(NameConfirmationStatus nameConfirmationStatus) {
        boolean zIsNgNameConfirmRequired = UserCertStatusRules.isNgNameConfirmRequired(nameConfirmationStatus.status);
        h8d h8dVar = this.a;
        if (!zIsNgNameConfirmRequired) {
            h8dVar.c();
            return;
        }
        Context context = h8dVar.a;
        Intent intent = new Intent(context, (Class<?>) ConfirmAccountInfoActivity.class);
        intent.putExtra(UserCertConstants.EXTRA_SOURCE, 1000);
        pcx.a aVar = pcx.b;
        intent.putExtra(UserCertConstants.EXTRA_TRIGGER, "push");
        yrh0.s(context, intent, true);
    }
}
