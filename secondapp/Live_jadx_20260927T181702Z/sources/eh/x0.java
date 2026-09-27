package eh;

import androidx.annotation.Nullable;
import java.lang.Exception;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class x0<R, E extends Exception> implements RunnableFuture<R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f81251b = new k();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f81252c = new k();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f81253d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public Exception f81254e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public R f81255f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public Thread f81256g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f81257h;

    public final void a() {
        this.f81252c.c();
    }

    public final void b() {
        this.f81251b.c();
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        synchronized (this.f81253d) {
            try {
                if (!this.f81257h && !this.f81252c.e()) {
                    this.f81257h = true;
                    c();
                    Thread thread = this.f81256g;
                    if (thread == null) {
                        this.f81251b.f();
                        this.f81252c.f();
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

    @h1
    public abstract R d() throws Exception;

    @h1
    public final R e() throws ExecutionException {
        if (this.f81257h) {
            throw new CancellationException();
        }
        if (this.f81254e == null) {
            return this.f81255f;
        }
        throw new ExecutionException(this.f81254e);
    }

    @Override // java.util.concurrent.Future
    @h1
    public final R get() throws ExecutionException, InterruptedException {
        this.f81252c.a();
        return e();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f81257h;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f81252c.e();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        synchronized (this.f81253d) {
            try {
                if (this.f81257h) {
                    return;
                }
                this.f81256g = Thread.currentThread();
                this.f81251b.f();
                try {
                    try {
                        this.f81255f = d();
                        synchronized (this.f81253d) {
                            this.f81252c.f();
                            this.f81256g = null;
                            Thread.interrupted();
                        }
                    } catch (Throwable th2) {
                        synchronized (this.f81253d) {
                            this.f81252c.f();
                            this.f81256g = null;
                            Thread.interrupted();
                            throw th2;
                        }
                    }
                } catch (Exception e10) {
                    this.f81254e = e10;
                    synchronized (this.f81253d) {
                        this.f81252c.f();
                        this.f81256g = null;
                        Thread.interrupted();
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // java.util.concurrent.Future
    @h1
    public final R get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        if (this.f81252c.b(TimeUnit.MILLISECONDS.convert(j10, timeUnit))) {
            return e();
        }
        throw new TimeoutException();
    }

    public void c() {
    }
}
