package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.DepositCardViewModel$newCardDepositableFlow$2", f = "DepositCardViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class vtd extends tje0 implements Function2<Boolean, v1b<? super Unit>, Object> {
    public /* synthetic */ boolean a;
    public final /* synthetic */ tud b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vtd(tud tudVar, v1b<? super vtd> v1bVar) {
        super(2, v1bVar);
        this.b = tudVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        vtd vtdVar = new vtd(this.b, v1bVar);
        vtdVar.a = ((Boolean) obj).booleanValue();
        return vtdVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, v1b<? super Unit> v1bVar) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        return ((vtd) create(bool2, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.b.M0;
        if (wwd0Var.getValue() instanceof c330.a) {
            bkj0.a(z, null, wwd0Var, null);
        }
        return Unit.a;
    }
}
