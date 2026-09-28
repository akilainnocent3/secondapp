package defpackage;

import android.view.View;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.bethistory.presentation.dialog.a;
import com.sportybet.feature.payment.impl.withdraw.presentation.activity.PartnerWithdrawRequestDetailsActivity;
import kotlin.Pair;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class d93 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d93(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                a aVar = (a) obj;
                aVar.c = null;
                aVar.m0();
                aVar.getParentFragmentManager().m0("bet_status_result_details", vj5.a(new Pair(AnalyticsParam.EVENT_PARAM_RESULT, null), new Pair("mode", aVar.b)));
                aVar.dismiss();
                break;
            default:
                int i2 = PartnerWithdrawRequestDetailsActivity.w;
                buz buzVar = (buz) ((PartnerWithdrawRequestDetailsActivity) obj).v.getValue();
                ej5.c(o8i0.d(buzVar), null, null, new vtz(buzVar, null), 3);
                break;
        }
    }
}
