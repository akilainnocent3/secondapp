package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes8.dex */
public final class t680 implements s680 {
    public final Object a;
    public final gaj<Object, a780<?>, Object, Unit> b;
    public final b780.a c = b780.a.a;

    public t680(Object obj, gaj gajVar) {
        this.a = obj;
        this.b = gajVar;
    }

    @Override // defpackage.w680
    public final gaj<Object, a780<?>, Object, Unit> a() {
        return this.b;
    }

    @Override // defpackage.w680
    public final gaj<a780<?>, Object, Object, gaj<Throwable, Object, CoroutineContext, Unit>> b() {
        return null;
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
