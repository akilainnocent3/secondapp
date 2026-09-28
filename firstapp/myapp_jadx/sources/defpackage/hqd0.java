package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.stacker.presentation.StackerViewModel$initialise$1", f = "StackerViewModel.kt", l = {99}, m = "invokeSuspend", v = 1)
public final class hqd0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ tqd0 b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hqd0(tqd0 tqd0Var, String str, v1b<? super hqd0> v1bVar) {
        super(2, v1bVar);
        this.b = tqd0Var;
        this.c = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new hqd0(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((hqd0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            tqd0 tqd0Var = this.b;
            if (!tqd0Var.E) {
                tqd0Var.E = true;
                tqd0Var.D = this.c;
                ej5.c(o8i0.d(tqd0Var), null, null, new kqd0(tqd0Var, null), 3);
                ej5.c(o8i0.d(tqd0Var), null, null, new lqd0(tqd0Var, null), 3);
                ej5.c(o8i0.d(tqd0Var), null, null, new iqd0(tqd0Var, null), 3);
                ej5.c(o8i0.d(tqd0Var), null, null, new mqd0(tqd0Var, null), 3);
                this.a = 1;
                Object objCollect = new yzh(tqd0Var.f.a(new cqd0(), new eqd0(2, null)).a, new fqd0(tqd0Var, null)).collect(new gqd0(tqd0Var), this);
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
