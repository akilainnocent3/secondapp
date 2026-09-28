package defpackage;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes8.dex */
public final class vre extends Exception {
    public final Throwable a;

    public vre(Throwable th, k5b k5bVar, CoroutineContext coroutineContext) {
        super("Coroutine dispatcher " + k5bVar + " threw an exception, context = " + coroutineContext, th);
        this.a = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.a;
    }
}
