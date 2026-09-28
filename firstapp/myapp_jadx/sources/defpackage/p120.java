package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.room.coroutines.Pool$acquireWithTimeout$2", f = "ConnectionPoolImpl.kt", l = {214}, m = "invokeSuspend")
public final class p120 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public dq40 a;
    public int b;
    public final /* synthetic */ dq40<ava> c;
    public final /* synthetic */ r120 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p120(dq40<ava> dq40Var, r120 r120Var, v1b<? super p120> v1bVar) {
        super(2, v1bVar);
        this.c = dq40Var;
        this.d = r120Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new p120(this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((p120) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        T t;
        dq40<ava> dq40Var;
        y5b y5bVar = y5b.a;
        int i = this.b;
        if (i == 0) {
            uj50.b(obj);
            dq40<ava> dq40Var2 = this.c;
            this.a = dq40Var2;
            this.b = 1;
            Object objA = this.d.a(this);
            if (objA == y5bVar) {
                return y5bVar;
            }
            t = objA;
            dq40Var = dq40Var2;
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dq40Var = this.a;
            uj50.b(obj);
            t = obj;
        }
        dq40Var.a = t;
        return Unit.a;
    }
}
