package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.a;

/* JADX INFO: loaded from: classes5.dex */
public final class x5b extends a implements l5b {
    public final /* synthetic */ wsm a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x5b(wsm wsmVar) {
        super(l5b.a.a);
        this.a = wsmVar;
    }

    @Override // defpackage.l5b
    public final void handleException(CoroutineContext coroutineContext, Throwable th) {
        itf0.a.f(th, "Unhandled coroutine exception in ApplicationScope", new Object[0]);
        wsm.d(this.a, th);
    }
}
