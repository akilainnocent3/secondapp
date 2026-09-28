package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.a;

/* JADX INFO: loaded from: classes6.dex */
public final class fgt extends a implements l5b {
    @Override // defpackage.l5b
    public final void handleException(CoroutineContext coroutineContext, Throwable th) {
        itf0.a.d(a320.a("LoggedInUserTracker error: ", th), new Object[0]);
    }
}
