package defpackage;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes.dex */
public final class et7 implements AutoCloseable, v5b {
    public final CoroutineContext a;

    public et7(CoroutineContext coroutineContext) {
        coroutineContext.getClass();
        this.a = coroutineContext;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        i9p.b(this.a, null);
    }

    @Override // defpackage.v5b
    public final CoroutineContext getCoroutineContext() {
        return this.a;
    }
}
