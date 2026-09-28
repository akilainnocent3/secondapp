package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.a;

/* JADX INFO: loaded from: classes5.dex */
public final class nxx extends a implements l5b {
    @Override // defpackage.l5b
    public final void handleException(CoroutineContext coroutineContext, Throwable th) {
        itf0.a aVar = itf0.a;
        aVar.q("NonFtdRefresher");
        aVar.f(th, "non-FTD engagement refresh failed", new Object[0]);
    }
}
