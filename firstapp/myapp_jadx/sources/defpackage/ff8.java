package defpackage;

import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.ugpay.deposit.momo.CommonMobileMoneyDepositViewModel$onAmountAddingClicked$2", f = "CommonMobileMoneyDepositViewModel.kt", l = {383}, m = "invokeSuspend", v = 2)
public final class ff8 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ df8 b;
    public final /* synthetic */ BigDecimal c;
    public final /* synthetic */ he8 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ff8(df8 df8Var, BigDecimal bigDecimal, he8 he8Var, v1b v1bVar) {
        super(2, v1bVar);
        this.b = df8Var;
        this.c = bigDecimal;
        this.d = he8Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ff8(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ff8) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        df8 df8Var = this.b;
        if (i == 0) {
            uj50.b(obj);
            eth0 eth0Var = df8Var.v;
            BigDecimal bigDecimal = df8Var.M;
            this.a = 1;
            obj = eth0Var.a(bigDecimal, this);
            if (obj == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        if (obj instanceof lod.c) {
            return Unit.a;
        }
        String string = df8Var.M.add(this.c).toString();
        string.getClass();
        df8Var.x1(string);
        this.d.invoke();
        return Unit.a;
    }
}
