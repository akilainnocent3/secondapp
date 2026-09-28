package defpackage;

import android.os.Bundle;
import androidx.transition.nfj.CaBJCMnsV;
import com.sportybet.feature.payment.impl.tradeadditional.domain.model.TradeAdditionalResult;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@c0d(c = "com.sportybet.feature.payment.impl.tradeadditional.presentation.fragment.TradeAdditionalBirthdayDialogFragment$initViewModel$1$4", f = "TradeAdditionalBirthdayDialogFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class lkg0 extends tje0 implements Function2<TradeAdditionalResult, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ hkg0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lkg0(hkg0 hkg0Var, v1b<? super lkg0> v1bVar) {
        super(2, v1bVar);
        this.b = hkg0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        lkg0 lkg0Var = new lkg0(this.b, v1bVar);
        lkg0Var.a = obj;
        return lkg0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(TradeAdditionalResult tradeAdditionalResult, v1b<? super Unit> v1bVar) {
        return ((lkg0) create(tradeAdditionalResult, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        TradeAdditionalResult tradeAdditionalResult = (TradeAdditionalResult) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        Bundle bundleA = vj5.a(new Pair("RESULT_KEY_TRADE_ADDITIONAL_RESULT", tradeAdditionalResult));
        hkg0 hkg0Var = this.b;
        hkg0Var.getParentFragmentManager().m0(CaBJCMnsV.VzdhJRslsSMt, bundleA);
        hkg0Var.dismissAllowingStateLoss();
        return Unit.a;
    }
}
