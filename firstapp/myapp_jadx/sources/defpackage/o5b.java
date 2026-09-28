package defpackage;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes8.dex */
public final class o5b {
    public static final void a(CoroutineContext coroutineContext, Throwable th) {
        if (th instanceof vre) {
            th = ((vre) th).a;
        }
        try {
            l5b l5bVar = (l5b) coroutineContext.get(l5b.a.a);
            if (l5bVar != null) {
                l5bVar.handleException(coroutineContext, th);
            } else {
                n5b.a(coroutineContext, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                rtg.a(runtimeException, th);
                th = runtimeException;
            }
            n5b.a(coroutineContext, th);
        }
    }
}
