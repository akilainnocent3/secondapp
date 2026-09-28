package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.room.coroutines.ConnectionPoolImpl$useConnection$4", f = "ConnectionPoolImpl.kt", l = {148}, m = "invokeSuspend")
public final class wua extends tje0 implements Function2<v5b, v1b<Object>, Object> {
    public int a;
    public final /* synthetic */ Function2<crg0, v1b<Object>, Object> b;
    public final /* synthetic */ dq40<u120> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public wua(Function2<? super crg0, ? super v1b<Object>, ? extends Object> function2, dq40<u120> dq40Var, v1b<? super wua> v1bVar) {
        super(2, v1bVar);
        this.b = function2;
        this.c = dq40Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new wua(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<Object> v1bVar) {
        return ((wua) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        u120 u120Var = this.c.a;
        this.a = 1;
        Object objInvoke = this.b.invoke(u120Var, this);
        return objInvoke == y5bVar ? y5bVar : objInvoke;
    }
}
