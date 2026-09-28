package defpackage;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes8.dex */
public final class pfd extends ztg {
    public static final pfd c = new pfd();
    public final u5b b;

    public pfd() {
        int i = a6f0.c;
        int i2 = a6f0.d;
        this.b = new u5b(i, a6f0.a, a6f0.e, i2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // defpackage.k5b
    public final void d0(CoroutineContext coroutineContext, Runnable runnable) {
        u5b.l(this.b, runnable, 6);
    }

    @Override // defpackage.k5b
    public final void e0(CoroutineContext coroutineContext, Runnable runnable) {
        u5b.l(this.b, runnable, 2);
    }

    @Override // defpackage.k5b
    public final k5b g0(int i) {
        wcs.a(i);
        return i >= a6f0.c ? this : super.g0(i);
    }

    @Override // defpackage.k5b
    public final String toString() {
        return "Dispatchers.Default";
    }
}
