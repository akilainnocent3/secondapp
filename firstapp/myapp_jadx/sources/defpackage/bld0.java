package defpackage;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes8.dex */
public final class bld0<T> implements v1b<T>, z5b {
    public final v1b<T> a;
    public final CoroutineContext b;

    /* JADX WARN: Multi-variable type inference failed */
    public bld0(v1b<? super T> v1bVar, CoroutineContext coroutineContext) {
        this.a = v1bVar;
        this.b = coroutineContext;
    }

    @Override // defpackage.z5b
    public final z5b getCallerFrame() {
        v1b<T> v1bVar = this.a;
        if (v1bVar instanceof z5b) {
            return (z5b) v1bVar;
        }
        return null;
    }

    @Override // defpackage.v1b
    public final CoroutineContext getContext() {
        return this.b;
    }

    @Override // defpackage.v1b
    public final void resumeWith(Object obj) {
        this.a.resumeWith(obj);
    }
}
