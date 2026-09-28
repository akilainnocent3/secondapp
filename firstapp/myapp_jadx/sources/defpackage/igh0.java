package defpackage;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes8.dex */
public final class igh0 extends k5b {
    public static final igh0 b = new igh0();

    @Override // defpackage.k5b
    public final void d0(CoroutineContext coroutineContext, Runnable runnable) {
        pfd.c.b.g(runnable, true, false);
    }

    @Override // defpackage.k5b
    public final void e0(CoroutineContext coroutineContext, Runnable runnable) {
        pfd.c.b.g(runnable, true, true);
    }

    @Override // defpackage.k5b
    public final k5b g0(int i) {
        wcs.a(i);
        return i >= a6f0.d ? this : super.g0(i);
    }

    @Override // defpackage.k5b
    public final String toString() {
        return "Dispatchers.IO";
    }
}
