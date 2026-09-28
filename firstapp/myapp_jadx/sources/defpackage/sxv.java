package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.e;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportybet.android.globalpay.mobileMoney.MobileMoneyDepositFragment;
import com.sportybet.feature.payment.impl.common.presentation.activity.TradingActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class sxv implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sxv(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ohp<Object>[] ohpVarArr = MobileMoneyDepositFragment.q0;
                e activity = ((MobileMoneyDepositFragment) obj).getActivity();
                if (activity != null) {
                    activity.finish();
                }
                return Unit.a;
            default:
                TradingActivity tradingActivity = (TradingActivity) obj;
                int i2 = TradingActivity.X;
                d900 d900Var = tradingActivity.i;
                Intent intent = null;
                if (d900Var == null) {
                    Intrinsics.n("paymentRouter");
                    throw null;
                }
                Uri uri = Uri.parse(d900Var.a.h("m/my_accounts/transactions/materials_upload?from=withdraw"));
                String scheme = uri.getScheme();
                String host = uri.getHost();
                if (scheme != null && host != null) {
                    intent = syi0.a(uri, null).a;
                }
                if (intent == null) {
                    return Unit.a;
                }
                tradingActivity.V.b(intent);
                f00 f00Var = vgb0.a;
                vgb0.b(AnalyticsEvent.NIN_VERIFICATION_DONT_HAVE_NIN_CLICKED, (Bundle) tradingActivity.e.getValue());
                return Unit.a;
        }
    }
}
