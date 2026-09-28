package defpackage;

import android.view.View;
import com.sportybet.feature.payment.impl.tradeadditional.domain.model.TradeAdditionalResult;
import com.sportybet.plugin.realsports.home.featuredsection.FeaturedMatchView;
import kotlin.Pair;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class wfh implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wfh(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        e6f0 e6f0Var;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                FeaturedMatchView featuredMatchView = (FeaturedMatchView) obj;
                if (featuredMatchView.E && (e6f0Var = featuredMatchView.D) != null) {
                    String str = e6f0Var.a;
                    if (!StringsKt.U(str)) {
                        featuredMatchView.c.t(str, e6f0Var.b, e6f0Var.c);
                    }
                }
                break;
            default:
                mmg0 mmg0Var = (mmg0) obj;
                mmg0Var.getParentFragmentManager().m0("REQUEST_KEY_TRADE_ADDITIONAL_PIN", vj5.a(new Pair("RESULT_KEY_TRADE_ADDITIONAL_RESULT", new TradeAdditionalResult(null, 16383))));
                mmg0Var.dismissAllowingStateLoss();
                break;
        }
    }
}
