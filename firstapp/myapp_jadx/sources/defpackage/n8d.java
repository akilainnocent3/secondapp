package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;

/* JADX INFO: loaded from: classes8.dex */
public final class n8d<T, R> extends m8d<T, R> implements v1b<R> {
    public zep a;
    public Object b;
    public v1b<Object> c;
    public Object d;

    @Override // defpackage.m8d
    public final void a(Unit unit, afp afpVar) {
        this.c = afpVar;
        this.b = unit;
        y5b y5bVar = y5b.a;
    }

    @Override // defpackage.v1b
    public final CoroutineContext getContext() {
        return e.a;
    }

    @Override // defpackage.v1b
    public final void resumeWith(Object obj) {
        this.c = null;
        this.d = obj;
    }
}
