package defpackage;

import android.view.View;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.payment.impl.tradeadditional.domain.model.TradeAdditionalResult;
import kotlin.Pair;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class yr80 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View.OnCreateContextMenuListener b;

    public /* synthetic */ yr80(View.OnCreateContextMenuListener onCreateContextMenuListener, int i) {
        this.a = i;
        this.b = onCreateContextMenuListener;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        View.OnCreateContextMenuListener onCreateContextMenuListener = this.b;
        switch (i) {
            case 0:
                os80 os80Var = (os80) onCreateContextMenuListener;
                String string = os80Var.getContext().getString(R.string.daily);
                string.getClass();
                os80Var.d = string;
                wz.a("BiggestCoeffClicked", "Sporty Hero", "Day");
                os80Var.a.x1(os80Var.d);
                os80Var.c();
                os80Var.b().w.setBackgroundColor(os80Var.getContext().getColor(R.color.bg_primary));
                os80Var.b().A.setBackgroundColor(os80Var.getContext().getColor(R.color.sb_black));
                os80Var.b().E.setBackgroundColor(os80Var.getContext().getColor(R.color.sb_black));
                break;
            default:
                qkg0 qkg0Var = (qkg0) onCreateContextMenuListener;
                qkg0Var.getParentFragmentManager().m0("REQUEST_KEY_TRADE_ADDITIONAL_CHECK_HOLDING", vj5.a(new Pair("RESULT_KEY_TRADE_ADDITIONAL_RESULT", new TradeAdditionalResult(null, 16383))));
                qkg0Var.dismissAllowingStateLoss();
                break;
        }
    }
}
