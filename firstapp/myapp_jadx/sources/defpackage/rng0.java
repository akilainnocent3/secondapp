package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.tradeadditional.presentation.viewmodel.TradeAdditionalSmsViewModel$smsCodeTextStateFlow$1", f = "TradeAdditionalSmsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class rng0 extends tje0 implements Function2<String, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ sng0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rng0(sng0 sng0Var, v1b<? super rng0> v1bVar) {
        super(2, v1bVar);
        this.b = sng0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        rng0 rng0Var = new rng0(this.b, v1bVar);
        rng0Var.a = obj;
        return rng0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, v1b<? super Unit> v1bVar) {
        return ((rng0) create(str, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        String str = (String) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.b.A;
        if (!(wwd0Var.getValue() instanceof c330.b)) {
            c330.a aVar = new c330.a(null, !StringsKt.U(str));
            wwd0Var.getClass();
            wwd0Var.k(null, aVar);
        }
        return Unit.a;
    }
}
