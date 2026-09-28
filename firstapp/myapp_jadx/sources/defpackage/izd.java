package defpackage;

import com.sportybet.feature.payment.impl.deposit.domain.model.DepositDropAlertStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.DepositEWalletViewModel$depositDropAlertStatusStateFlow$3", f = "DepositEWalletViewModel.kt", l = {151}, m = "invokeSuspend", v = 2)
public final class izd extends tje0 implements Function2<Unit, v1b<? super DepositDropAlertStatus>, Object> {
    public int a;
    public final /* synthetic */ vzd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public izd(vzd vzdVar, v1b<? super izd> v1bVar) {
        super(2, v1bVar);
        this.b = vzdVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new izd(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, v1b<? super DepositDropAlertStatus> v1bVar) {
        return ((izd) create(unit, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
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
        vzd vzdVar = this.b;
        lyd lydVar = vzdVar.m0;
        int iE = vzdVar.B1().e();
        this.a = 1;
        Object objB = lyd.b(lydVar, iE, null, null, this, 6);
        return objB == y5bVar ? y5bVar : objB;
    }
}
