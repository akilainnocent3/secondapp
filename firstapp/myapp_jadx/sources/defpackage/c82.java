package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc82;", "Lj8i0;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public abstract class c82 extends j8i0 {
    public final kfe0 a;
    public final CoroutineContext b;
    public final mpe0 c;

    public static final class a extends kotlin.coroutines.a implements l5b {
        @Override // defpackage.l5b
        public final void handleException(CoroutineContext coroutineContext, Throwable th) {
            itf0.a.d("Coroutine Exception Handler", th);
        }
    }

    public c82() {
        a aVar = new a(l5b.a.a);
        kfe0 kfe0VarA = lfe0.a();
        this.a = kfe0VarA;
        CoroutineContext coroutineContextD = CoroutineContext.Element.a.d(kfe0VarA, aVar);
        this.b = coroutineContextD;
        w5b.a(coroutineContextD.plus(zu7.f));
        pfd pfdVar = fse.a;
        w5b.a(coroutineContextD.plus(gku.a.h0()));
        wm70.c.getClass();
        this.c = hwr.b(new b82(0));
    }

    @Override // defpackage.j8i0
    public final void onCleared() {
        super.onCleared();
        this.a.cancel((CancellationException) null);
        if (((ema) this.c.getValue()).b) {
            return;
        }
        ((ema) this.c.getValue()).dispose();
    }
}
