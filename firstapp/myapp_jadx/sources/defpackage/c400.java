package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.common.presentation.viewmodel.PayMethodsViewModel$selectTab$1", f = "PayMethodsViewModel.kt", l = {65}, m = "invokeSuspend", v = 2)
public final class c400 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ y200 b;
    public final /* synthetic */ e400 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c400(y200 y200Var, e400 e400Var, v1b<? super c400> v1bVar) {
        super(2, v1bVar);
        this.b = y200Var;
        this.c = e400Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new c400(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((c400) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            y200 y200Var = this.b;
            String strM = y200Var.m();
            if (strM == null) {
                strM = y200Var.b();
            }
            b700 b700Var = this.c.b;
            this.a = 1;
            if (b700Var.i(strM, this) == y5bVar) {
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
