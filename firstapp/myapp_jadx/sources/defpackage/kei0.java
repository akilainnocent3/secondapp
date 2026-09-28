package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.vip.viewmodel.VipViewModel$initialise$1", f = "VipViewModel.kt", l = {79}, m = "invokeSuspend", v = 1)
public final class kei0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ lei0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kei0(lei0 lei0Var, v1b<? super kei0> v1bVar) {
        super(2, v1bVar);
        this.b = lei0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new kei0(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((kei0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            lei0 lei0Var = this.b;
            if (!lei0Var.d) {
                lei0Var.d = true;
                this.a = 1;
                Object objCollect = new yzh(lei0Var.a.a(new zdi0(), new aei0(lei0Var, null)).a, new bei0(3, null)).collect(new cei0(lei0Var), this);
                if (objCollect != y5bVar) {
                    objCollect = Unit.a;
                }
                if (objCollect == y5bVar) {
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
