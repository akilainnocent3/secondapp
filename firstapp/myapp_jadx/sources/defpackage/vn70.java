package defpackage;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes8.dex */
public class vn70<T> extends a3<T> implements z5b {
    public final v1b<T> e;

    public vn70(v1b v1bVar, CoroutineContext coroutineContext) {
        super(coroutineContext, true);
        this.e = v1bVar;
    }

    @Override // defpackage.m9p
    public final boolean Q() {
        return true;
    }

    @Override // defpackage.z5b
    public final z5b getCallerFrame() {
        v1b<T> v1bVar = this.e;
        if (v1bVar instanceof z5b) {
            return (z5b) v1bVar;
        }
        return null;
    }

    @Override // defpackage.m9p
    public void n(Object obj) {
        zre.b(yzo.b(this.e), gn8.a(obj));
    }

    @Override // defpackage.m9p
    public void p(Object obj) {
        this.e.resumeWith(gn8.a(obj));
    }

    public void o0() {
    }
}
