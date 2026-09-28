package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.DepositCardViewModel$setNewCardAsDefaultStateFlow$1", f = "DepositCardViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class iud extends tje0 implements Function2<Boolean, v1b<? super Unit>, Object> {
    public /* synthetic */ boolean a;
    public final /* synthetic */ tud b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iud(tud tudVar, v1b<? super iud> v1bVar) {
        super(2, v1bVar);
        this.b = tudVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        iud iudVar = new iud(this.b, v1bVar);
        iudVar.a = ((Boolean) obj).booleanValue();
        return iudVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, v1b<? super Unit> v1bVar) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        return ((iud) create(bool2, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (z) {
            wwd0 wwd0Var = this.b.a1;
            Boolean bool = Boolean.TRUE;
            wwd0Var.getClass();
            wwd0Var.k(null, bool);
        }
        return Unit.a;
    }
}
