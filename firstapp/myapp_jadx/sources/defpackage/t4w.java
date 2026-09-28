package defpackage;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes.dex */
public final class t4w {
    public static final r4w a(CoroutineContext coroutineContext) {
        r4w r4wVar = (r4w) coroutineContext.get(r4w.a.a);
        if (r4wVar != null) {
            return r4wVar;
        }
        ib5.a("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
        return null;
    }
}
