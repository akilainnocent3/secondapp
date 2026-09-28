package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.animation.SharedTransitionScopeImpl$onStateRemoved$1$1", f = "SharedTransitionScope.kt", l = {}, m = "invokeSuspend")
public final class d490 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ y290 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d490(y290 y290Var, v1b<? super d490> v1bVar) {
        super(2, v1bVar);
        this.a = y290Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new d490(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((d490) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        y290 y290Var = this.a;
        if (y290Var.k.isEmpty()) {
            y290Var.b.y.k(y290Var.a);
        }
        return Unit.a;
    }
}
