package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.DepositCardViewModel$normalizedCardExpirationFlow$2", f = "DepositCardViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class wtd extends tje0 implements Function2<yyx, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ tud b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wtd(tud tudVar, v1b<? super wtd> v1bVar) {
        super(2, v1bVar);
        this.b = tudVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        wtd wtdVar = new wtd(this.b, v1bVar);
        wtdVar.a = obj;
        return wtdVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(yyx yyxVar, v1b<? super Unit> v1bVar) {
        return ((wtd) create(yyxVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        yyx yyxVar = (yyx) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.b.U0 = yyxVar;
        return Unit.a;
    }
}
