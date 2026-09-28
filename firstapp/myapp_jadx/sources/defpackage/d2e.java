package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.DepositMomoViewModel$initDepositProcessResult$1", f = "DepositMomoViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class d2e extends tje0 implements Function2<x7e, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ r2e b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2e(v1b v1bVar, r2e r2eVar) {
        super(2, v1bVar);
        this.b = r2eVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        d2e d2eVar = new d2e(v1bVar, this.b);
        d2eVar.a = obj;
        return d2eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(x7e x7eVar, v1b<? super Unit> v1bVar) {
        return ((d2e) create(x7eVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        x7e x7eVar = (x7e) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        auo auoVar = this.b.A0;
        if ((auoVar.U().getValue() instanceof xi7.b) && (x7eVar instanceof x7e.d) && !(x7eVar instanceof x7e.d.q)) {
            auoVar.g0();
        }
        return Unit.a;
    }
}
