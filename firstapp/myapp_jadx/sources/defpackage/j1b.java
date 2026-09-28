package defpackage;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes.dex */
public final class j1b implements v5b {
    public final CoroutineContext a;

    public j1b(CoroutineContext coroutineContext) {
        this.a = coroutineContext;
    }

    @Override // defpackage.v5b
    public final CoroutineContext getCoroutineContext() {
        return this.a;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.a + ')';
    }
}
