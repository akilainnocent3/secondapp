package defpackage;

import android.os.Bundle;
import com.sportybet.feature.payment.impl.tradeadditional.domain.model.TradeAdditionalResult;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.tradeadditional.presentation.fragment.TradeAdditionalUpstreamSmsDialogFragment$initViewModel$1$2", f = "TradeAdditionalUpstreamSmsDialogFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class gog0 extends tje0 implements Function2<TradeAdditionalResult, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ eog0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gog0(eog0 eog0Var, v1b<? super gog0> v1bVar) {
        super(2, v1bVar);
        this.b = eog0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        gog0 gog0Var = new gog0(this.b, v1bVar);
        gog0Var.a = obj;
        return gog0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(TradeAdditionalResult tradeAdditionalResult, v1b<? super Unit> v1bVar) {
        return ((gog0) create(tradeAdditionalResult, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        TradeAdditionalResult tradeAdditionalResult = (TradeAdditionalResult) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        Bundle bundleA = vj5.a(new Pair("RESULT_KEY_TRADE_ADDITIONAL_RESULT", tradeAdditionalResult));
        eog0 eog0Var = this.b;
        eog0Var.getParentFragmentManager().m0("REQUEST_KEY_TRADE_ADDITIONAL_UPSTREAM_SMS", bundleA);
        eog0Var.dismissAllowingStateLoss();
        return Unit.a;
    }
}
