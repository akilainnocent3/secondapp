package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1", f = "ChannelFlow.kt", l = {56}, m = "invokeSuspend")
public final class t67 extends tje0 implements Function2<ez20<Object>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ u67<Object> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t67(u67<Object> u67Var, v1b<? super t67> v1bVar) {
        super(2, v1bVar);
        this.c = u67Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        t67 t67Var = new t67(this.c, v1bVar);
        t67Var.b = obj;
        return t67Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ez20<Object> ez20Var, v1b<? super Unit> v1bVar) {
        return ((t67) create(ez20Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            ez20<? super Object> ez20Var = (ez20) this.b;
            this.a = 1;
            if (this.c.f(ez20Var, this) == y5bVar) {
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
