package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.common.framework.loading.LoadingTask$1", f = "LoadingTask.kt", l = {}, m = "invokeSuspend", v = 1)
public final class jzs extends tje0 implements Function1<v1b<? super Unit>, Object> {
    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new jzs(1, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super Unit> v1bVar) {
        return ((jzs) create(v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return Unit.a;
    }
}
