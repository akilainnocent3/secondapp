package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.a;

/* JADX INFO: loaded from: classes5.dex */
public final class i8b extends a implements l5b {
    public final /* synthetic */ h8b a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i8b(h8b h8bVar) {
        super(l5b.a.a);
        this.a = h8bVar;
    }

    @Override // defpackage.l5b
    public final void handleException(CoroutineContext coroutineContext, Throwable th) {
        if (th instanceof CancellationException) {
            return;
        }
        this.a.c.g("Error occurred in CountryManager", "", th, m2g.a);
    }
}
