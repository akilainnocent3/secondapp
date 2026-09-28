package defpackage;

import com.sportybet.feature.payment.impl.deposit.domain.model.DepositDropAlertStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.DepositCardViewModel$depositDropAlertStatusStateFlow$3", f = "DepositCardViewModel.kt", l = {175}, m = "invokeSuspend", v = 2)
public final class ltd extends tje0 implements Function2<Unit, v1b<? super DepositDropAlertStatus>, Object> {
    public int a;
    public final /* synthetic */ tud b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ltd(tud tudVar, v1b<? super ltd> v1bVar) {
        super(2, v1bVar);
        this.b = tudVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ltd(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, v1b<? super DepositDropAlertStatus> v1bVar) {
        return ((ltd) create(unit, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws Exception {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        tud tudVar = this.b;
        lyd lydVar = tudVar.o0;
        int iE = tudVar.A0.e();
        this.a = 1;
        Object objB = lyd.b(lydVar, iE, null, null, this, 6);
        return objB == y5bVar ? y5bVar : objB;
    }
}
