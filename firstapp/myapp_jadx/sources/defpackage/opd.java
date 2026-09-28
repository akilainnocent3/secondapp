package defpackage;

import com.sportybet.feature.payment.impl.deposit.domain.model.DepositDropAlertStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.DepositBankTransferOneTimeAccountViewModel$depositDropAlertStatusStateFlow$3", f = "DepositBankTransferOneTimeAccountViewModel.kt", l = {267}, m = "invokeSuspend", v = 2)
public final class opd extends tje0 implements Function2<Integer, v1b<? super DepositDropAlertStatus>, Object> {
    public int a;
    public /* synthetic */ int b;
    public final /* synthetic */ fqd c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public opd(fqd fqdVar, v1b<? super opd> v1bVar) {
        super(2, v1bVar);
        this.c = fqdVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        opd opdVar = new opd(this.c, v1bVar);
        opdVar.b = ((Number) obj).intValue();
        return opdVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Integer num, v1b<? super DepositDropAlertStatus> v1bVar) {
        return ((opd) create(Integer.valueOf(num.intValue()), v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws Exception {
        int i = this.b;
        y5b y5bVar = y5b.a;
        int i2 = this.a;
        if (i2 != 0) {
            if (i2 == 1) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        fqd fqdVar = this.c;
        lyd lydVar = fqdVar.n0;
        fqdVar.v0.e();
        Integer num = new Integer(i);
        this.b = i;
        this.a = 1;
        Object objB = lyd.b(lydVar, 25, null, num, this, 2);
        return objB == y5bVar ? y5bVar : objB;
    }
}
