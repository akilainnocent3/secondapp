package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.paymentproviders.PaymentProvidersDelegate$onAllPaymentsTabChannelSelected$1", f = "PaymentProvidersDelegate.kt", l = {119}, m = "invokeSuspend", v = 2)
public final class r800 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ v800 b;
    public final /* synthetic */ b800 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r800(v800 v800Var, b800 b800Var, v1b<? super r800> v1bVar) {
        super(2, v1bVar);
        this.b = v800Var;
        this.c = b800Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new r800(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((r800) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            ku90<Integer> ku90Var = this.b.h;
            Integer num = new Integer(this.c.d);
            this.a = 1;
            if (ku90Var.a.emit(num, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
