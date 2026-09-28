package defpackage;

import android.view.View;
import com.sportybet.feature.payment.impl.tradeadditional.domain.model.TradeAdditionalResult;
import kotlin.Pair;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class ws80 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View.OnCreateContextMenuListener b;

    public /* synthetic */ ws80(View.OnCreateContextMenuListener onCreateContextMenuListener, int i) {
        this.a = i;
        this.b = onCreateContextMenuListener;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        View.OnCreateContextMenuListener onCreateContextMenuListener = this.b;
        switch (i) {
            case 0:
                new c6j0(((et80) onCreateContextMenuListener).a).a();
                break;
            default:
                amg0 amg0Var = (amg0) onCreateContextMenuListener;
                amg0Var.getParentFragmentManager().m0("REQUEST_KEY_TRADE_ADDITIONAL_PHONE", vj5.a(new Pair("RESULT_KEY_TRADE_ADDITIONAL_RESULT", new TradeAdditionalResult(null, 16383))));
                amg0Var.dismissAllowingStateLoss();
                break;
        }
    }
}
