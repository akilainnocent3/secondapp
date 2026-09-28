package defpackage;

import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.b;
import androidx.fragment.app.e;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes.dex */
public final class hjp implements gv5<BaseResponse<xdp>> {
    public final /* synthetic */ gjp a;

    public hjp(gjp gjpVar) {
        this.a = gjpVar;
    }

    @Override // defpackage.gv5
    public final void onFailure(su5<BaseResponse<xdp>> su5Var, Throwable th) {
        gjp gjpVar = this.a;
        e activity = gjpVar.getActivity();
        gjpVar.O = false;
        if (activity == null || activity.isFinishing() || su5Var.isCanceled() || gjpVar.isDetached()) {
            return;
        }
        gjpVar.E.setLoading(false);
        gjpVar.p0(1, null);
        gjpVar.k0.a(new ind("generic_error"), k00.c);
    }

    @Override // defpackage.gv5
    public final void onResponse(su5<BaseResponse<xdp>> su5Var, bi50<BaseResponse<xdp>> bi50Var) {
        gjp gjpVar = this.a;
        e activity = gjpVar.getActivity();
        if (activity == null || activity.isFinishing() || su5Var.isCanceled() || gjpVar.isDetached()) {
            return;
        }
        gjpVar.E.setLoading(false);
        BaseResponse<xdp> baseResponse = bi50Var.b;
        if (bi50Var.a.getIsSuccessful() && baseResponse != null) {
            if (gjpVar.l0.a() && baseResponse.hasData()) {
                xdp xdpVar = baseResponse.data;
                xdpVar.getClass();
                int iA = lal.a(xdpVar, AnalyticsParam.EVENT_STATUS, 0);
                String strB = lal.b(baseResponse.data, "tradeId");
                rdd0 rdd0Var = gjpVar.k0;
                bag bagVarB = tj5.b(gjpVar);
                BigDecimal bigDecimalC = p54.c(gjpVar.F);
                if (iA == 0) {
                    iA = baseResponse.bizCode;
                }
                Integer numValueOf = Integer.valueOf(iA);
                c0e c0eVar = gjpVar.l0;
                c0eVar.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis() - c0eVar.a;
                c0eVar.a = 0L;
                rdd0Var.a(new qnd(bagVarB, strB, bigDecimalC, numValueOf, Long.valueOf(jCurrentTimeMillis), null, null, null, 16256), k00.d);
            }
            int i = baseResponse.bizCode;
            if (i == 10000) {
                gjpVar.O = true;
                if (baseResponse.data != null) {
                    f00 f00Var = vgb0.a;
                    vgb0.a(AnalyticsEvent.DEPOSIT);
                    gjpVar.I = lal.b(baseResponse.data, "tradeId");
                    gjp.r0.set(0);
                    zyf0.c(1, sn5.d(gjpVar, R.string.page_payment__success_please_follow_instructions_on_the_ussd_prompt_on_your_phone_to_complete_deposit, new Object[0]));
                    gjpVar.J = true;
                    return;
                }
                return;
            }
            if (i == 62100) {
                gjpVar.O = false;
                BigDecimal bigDecimal = gjpVar.H;
                String string = bigDecimal != null ? bigDecimal.toString() : "";
                b.a aVar = new b.a(gjpVar.getActivity());
                String strD = sn5.d(gjpVar, R.string.page_payment__maximum_daily_transaction_value_is_vcurrency_vthreshold_tip, a8b.e(), string);
                AlertController.b bVar = aVar.a;
                bVar.f = strD;
                bVar.k = false;
                aVar.setPositiveButton(R.string.common_functions__ok, new v7n()).f();
                gjpVar.k0.a(new ind("max_daily_transaction"), k00.c);
                return;
            }
        }
        gjpVar.O = false;
        gjpVar.p0(1, baseResponse.message);
    }
}
