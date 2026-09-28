package defpackage;

import com.sportybet.feature.payment.impl.deposit.domain.model.DepositDropAlertStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.DepositOtherBanksViewModel$depositDropAlertStatusStateFlow$2", f = "DepositOtherBanksViewModel.kt", l = {235}, m = "invokeSuspend", v = 2)
public final class o4e extends tje0 implements Function2<jw1, v1b<? super DepositDropAlertStatus>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ f5e c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4e(f5e f5eVar, v1b<? super o4e> v1bVar) {
        super(2, v1bVar);
        this.c = f5eVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        o4e o4eVar = new o4e(this.c, v1bVar);
        o4eVar.b = obj;
        return o4eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(jw1 jw1Var, v1b<? super DepositDropAlertStatus> v1bVar) {
        return ((o4e) create(jw1Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws Exception {
        jw1 jw1Var = (jw1) this.b;
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
        f5e f5eVar = this.c;
        lyd lydVar = f5eVar.m0;
        f5eVar.u0.e();
        String str = jw1Var.b;
        this.b = null;
        this.a = 1;
        Object objB = lyd.b(lydVar, 21, str, null, this, 4);
        return objB == y5bVar ? y5bVar : objB;
    }
}
