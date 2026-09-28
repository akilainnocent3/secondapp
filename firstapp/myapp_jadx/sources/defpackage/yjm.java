package defpackage;

import android.view.View;
import com.sportybet.feature.horseracing.view.HorseRacingActivity;
import com.sportybet.feature.payment.impl.tradeadditional.domain.model.TradeAdditionalResult;
import com.sportygames.sportyherov2.components.ShHeaderContainer;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class yjm implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yjm(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                int i2 = HorseRacingActivity.e;
                fkm fkmVarH1 = ((HorseRacingActivity) obj).H1();
                ej5.c(o8i0.d(fkmVarH1), null, null, new kkm(fkmVarH1, null), 3);
                break;
            case 1:
                int i3 = ShHeaderContainer.b;
                ((Function0) obj).invoke();
                break;
            default:
                ymg0 ymg0Var = (ymg0) obj;
                ymg0Var.getParentFragmentManager().m0("REQUEST_KEY_TRADE_ADDITIONAL_SECOND_OTP", vj5.a(new Pair("RESULT_KEY_TRADE_ADDITIONAL_RESULT", new TradeAdditionalResult(null, 16383))));
                ymg0Var.dismissAllowingStateLoss();
                break;
        }
    }
}
