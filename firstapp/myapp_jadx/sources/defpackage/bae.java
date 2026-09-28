package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.basepay.viewModel.DepositWithdrawDelegateImpl$loadHintConfig$1", f = "DepositWithdrawDelegate.kt", l = {138}, m = "invokeSuspend", v = 2)
public final class bae extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public wwd0 a;
    public int b;
    public final /* synthetic */ w9e c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bae(w9e w9eVar, String str, v1b<? super bae> v1bVar) {
        super(2, v1bVar);
        this.c = w9eVar;
        this.d = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new bae(this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((bae) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws Throwable {
        wwd0 wwd0Var;
        y5b y5bVar = y5b.a;
        int i = this.b;
        if (i == 0) {
            uj50.b(obj);
            w9e w9eVar = this.c;
            wwd0 wwd0Var2 = w9eVar.i;
            this.a = wwd0Var2;
            this.b = 1;
            obj = w9eVar.e(this.d, this);
            if (obj == y5bVar) {
                return y5bVar;
            }
            wwd0Var = wwd0Var2;
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wwd0Var = this.a;
            uj50.b(obj);
        }
        wwd0Var.setValue(obj);
        return Unit.a;
    }
}
