package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.a;

/* JADX INFO: loaded from: classes6.dex */
public final class bvw extends a implements l5b {
    public final /* synthetic */ avw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bvw(avw avwVar) {
        super(l5b.a.a);
        this.a = avwVar;
    }

    @Override // defpackage.l5b
    public final void handleException(CoroutineContext coroutineContext, Throwable th) {
        avw avwVar = this.a;
        itf0.a.e(th);
        try {
            ej5.c(o8i0.d(avwVar), null, null, new cvw(avwVar, null), 3);
        } catch (Exception unused) {
            itf0.a.e(th);
        }
    }
}
