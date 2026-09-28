package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.runtime.Recomposer$join$2", f = "Recomposer.kt", l = {}, m = "invokeSuspend")
public final class xj40 extends tje0 implements Function2<wj40.c, v1b<? super Boolean>, Object> {
    public /* synthetic */ Object a;

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        xj40 xj40Var = new xj40(2, v1bVar);
        xj40Var.a = obj;
        return xj40Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(wj40.c cVar, v1b<? super Boolean> v1bVar) {
        return ((xj40) create(cVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return Boolean.valueOf(((wj40.c) this.a) == wj40.c.a);
    }
}
