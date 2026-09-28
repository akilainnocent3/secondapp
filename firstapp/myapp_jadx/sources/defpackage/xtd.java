package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.DepositCardViewModel$normalizedCardNumberFlow$2", f = "DepositCardViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class xtd extends tje0 implements Function2<zyx, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ tud b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xtd(tud tudVar, v1b<? super xtd> v1bVar) {
        super(2, v1bVar);
        this.b = tudVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        xtd xtdVar = new xtd(this.b, v1bVar);
        xtdVar.a = obj;
        return xtdVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(zyx zyxVar, v1b<? super Unit> v1bVar) {
        return ((xtd) create(zyxVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        zyx zyxVar = (zyx) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.b.P0 = zyxVar;
        return Unit.a;
    }
}
