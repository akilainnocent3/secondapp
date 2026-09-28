package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "coil3.request.ViewTargetRequestManager$dispose$1", f = "ViewTargetRequestManager.kt", l = {}, m = "invokeSuspend")
public final class v9i0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ w9i0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v9i0(w9i0 w9i0Var, v1b<? super v9i0> v1bVar) {
        super(2, v1bVar);
        this.a = w9i0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new v9i0(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((v9i0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        w9i0 w9i0Var = this.a;
        u9i0 u9i0Var = w9i0Var.d;
        if (u9i0Var != null) {
            u9i0Var.d();
        }
        w9i0Var.d = null;
        return Unit.a;
    }
}
