package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.paymentproviders.PaymentProvidersDelegate$onChannelTooltipClicked$1", f = "PaymentProvidersDelegate.kt", l = {107}, m = "invokeSuspend", v = 2)
public final class s800 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ v800 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s800(int i, v800 v800Var, v1b<? super s800> v1bVar) {
        super(2, v1bVar);
        this.b = i;
        this.c = v800Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new s800(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((s800) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        n990 n990Var = null;
        if (i == 0) {
            uj50.b(obj);
            c100 c100Var = c100.e;
            int i2 = this.b;
            if (i2 == 34001) {
                n990Var = n990.b.a;
            } else if (i2 == 31004) {
                n990Var = n990.a.a;
            }
            if (n990Var != null) {
                ku90<n990> ku90Var = this.c.j;
                this.a = 1;
                if (ku90Var.a.emit(n990Var, this) == y5bVar) {
                    return y5bVar;
                }
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
