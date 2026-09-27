package x4;

import androidx.annotation.Nullable;
import java.lang.Exception;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@m1
public abstract class x0<R, E extends Exception> implements RunnableFuture<R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f144498b = new o();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f144499c = new o();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f144500d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public Exception f144501e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public R f144502f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public Thread f144503g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f144504h;

    public final void a() {
        this.f144499c.c();
    }

    public final void b() {
        this.f144498b.c();
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        synchronized (this.f144500d) {
            try {
                if (!this.f144504h && !this.f144499c.f()) {
                    this.f144504h = true;
                    c();
                    Thread thread = this.f144503g;
                    if (thread == null) {
                        this.f144498b.g();
                        this.f144499c.g();
                    } else if (z10) {
                        thread.interrupt();
                    }
                    return true;
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @l1
    public abstract R d() throws Exception;

    @l1
    public final R e() throws ExecutionException {
        if (this.f144504h) {
            throw new CancellationException();
        }
        if (this.f144501e == null) {
            return this.f144502f;
        }
        throw new ExecutionException(this.f144501e);
    }

    @Override // java.util.concurrent.Future
    @l1
    public final R get() throws ExecutionException, InterruptedException {
        this.f144499c.a();
        return e();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f144504h;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f144499c.f();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        synchronized (this.f144500d) {
            try {
                if (this.f144504h) {
                    return;
                }
                this.f144503g = Thread.currentThread();
                this.f144498b.g();
                try {
                    try {
                        this.f144502f = d();
                        synchronized (this.f144500d) {
                            this.f144499c.g();
                            this.f144503g = null;
                            Thread.interrupted();
                        }
                    } catch (Throwable th2) {
                        synchronized (this.f144500d) {
                            this.f144499c.g();
                            this.f144503g = null;
                            Thread.interrupted();
                            throw th2;
                        }
                    }
                } catch (Exception e10) {
                    this.f144501e = e10;
                    synchronized (this.f144500d) {
                        this.f144499c.g();
                        this.f144503g = null;
                        Thread.interrupted();
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // java.util.concurrent.Future
    @l1
    public final R get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        if (this.f144499c.b(TimeUnit.MILLISECONDS.convert(j10, timeUnit))) {
            return e();
        }
        throw new TimeoutException();
    }

    public void c() {
    }
}
