package defpackage;

import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.BaseDepositViewModel$onAmountAddingClicked$2", f = "BaseDepositViewModel.kt", l = {121}, m = "invokeSuspend", v = 2)
public final class n02 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ m02 b;
    public final /* synthetic */ BigDecimal c;
    public final /* synthetic */ Function0<Unit> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n02(m02 m02Var, BigDecimal bigDecimal, Function0<Unit> function0, v1b<? super n02> v1bVar) {
        super(2, v1bVar);
        this.b = m02Var;
        this.c = bigDecimal;
        this.d = function0;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new n02(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((n02) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        m02 m02Var = this.b;
        if (i == 0) {
            uj50.b(obj);
            eth0 eth0Var = m02Var.a0;
            BigDecimal bigDecimal = m02Var.S.c;
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
        String string = m02Var.S.c.add(this.c).toString();
        string.getClass();
        m02Var.x1(string);
        this.d.invoke();
        return Unit.a;
    }
}
