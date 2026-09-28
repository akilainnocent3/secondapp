package defpackage;

import android.text.TextUtils;
import android.view.View;
import com.sporty.android.core.model.realsports.Order;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.jackpot.data.JackpotElement;
import com.sportybet.plugin.realsports.betsucc.presentation.fragment.BetSuccessfulPageFragment;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ca3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ca3(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                BetSuccessfulPageFragment betSuccessfulPageFragment = (BetSuccessfulPageFragment) obj;
                if (!betSuccessfulPageFragment.b0) {
                    if (!betSuccessfulPageFragment.a0) {
                        Order order = betSuccessfulPageFragment.Q;
                        if (order == null || TextUtils.isEmpty(order.shareCode)) {
                            zyf0.b(R.string.common_feedback__something_went_wrong_please_try_again, 0);
                        } else {
                            uqm uqmVar = betSuccessfulPageFragment.C;
                            if (uqmVar != null && uqmVar.hasPersonalPage()) {
                                betSuccessfulPageFragment.u0(true);
                                boolean zIsEmpty = TextUtils.isEmpty(betSuccessfulPageFragment.R);
                                betSuccessfulPageFragment.G.a(new b090(false, !zIsEmpty, "betslip"), k00.d, k00.c);
                                if (zIsEmpty || TextUtils.isEmpty(betSuccessfulPageFragment.Q.orderId)) {
                                    betSuccessfulPageFragment.Z.y1(betSuccessfulPageFragment.Q.shareCode, null);
                                } else {
                                    eja0 eja0Var = betSuccessfulPageFragment.Z;
                                    Order order2 = betSuccessfulPageFragment.Q;
                                    eja0Var.y1(order2.shareCode, order2.orderId);
                                }
                            } else {
                                betSuccessfulPageFragment.r0();
                            }
                        }
                    } else {
                        betSuccessfulPageFragment.r0();
                    }
                    break;
                }
                break;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append(o7d.a(wae.EVENT_DETAIL));
                sb.append("?eventId=");
                sh8.c().e(uf80.a(sb, ((JackpotElement) obj).eventId, "&eventType=live"));
                break;
        }
    }
}
