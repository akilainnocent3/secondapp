package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes8.dex */
public final class v680<Q> implements u680<Q> {
    public final Object a;
    public final gaj<Object, a780<?>, Object, Unit> b;
    public final gaj<Object, Object, Object, Object> c;
    public final gaj<a780<?>, Object, Object, gaj<Throwable, Object, CoroutineContext, Unit>> d;

    public v680(Object obj, gaj gajVar, gaj gajVar2, qb5 qb5Var) {
        this.a = obj;
        this.b = gajVar;
        this.c = gajVar2;
        this.d = qb5Var;
    }

    @Override // defpackage.w680
    public final gaj<Object, a780<?>, Object, Unit> a() {
        return this.b;
    }

    @Override // defpackage.w680
    public final gaj<a780<?>, Object, Object, gaj<Throwable, Object, CoroutineContext, Unit>> b() {
        return this.d;
    }

    @Override // defpackage.w680
    public final gaj<Object, Object, Object, Object> c() {
        return this.c;
    }

    @Override // defpackage.w680
    public final Object d() {
        return this.a;
    }
}
