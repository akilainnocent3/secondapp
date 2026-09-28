package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class rz60 extends c3 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        this.b = Thread.currentThread();
        try {
            this.a.run();
            this.b = null;
        } catch (Throwable th) {
            this.b = null;
            lazySet(c3.c);
            o760.b(th);
        }
    }
}
