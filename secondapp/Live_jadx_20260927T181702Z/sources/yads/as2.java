package yads;

import android.os.SystemClock;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class as2 implements RunnableFuture {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vy f146912b = new vy();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vy f146913c = new vy();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f146914d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Exception f146915e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f146916f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Thread f146917g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f146918h;

    public abstract Object b();

    public final Object c() throws ExecutionException {
        if (this.f146918h) {
            throw new CancellationException();
        }
        if (this.f146915e == null) {
            return this.f146916f;
        }
        throw new ExecutionException(this.f146915e);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        synchronized (this.f146914d) {
            try {
                if (!this.f146918h && !this.f146913c.c()) {
                    this.f146918h = true;
                    a();
                    Thread thread = this.f146917g;
                    if (thread == null) {
                        this.f146912b.d();
                        this.f146913c.d();
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

    @Override // java.util.concurrent.Future
    public final Object get() {
        this.f146913c.a();
        return c();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f146918h;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        boolean z10;
        vy vyVar = this.f146913c;
        synchronized (vyVar) {
            z10 = vyVar.f157128a;
        }
        return z10;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        synchronized (this.f146914d) {
            try {
                if (this.f146918h) {
                    return;
                }
                this.f146917g = Thread.currentThread();
                this.f146912b.d();
                try {
                    try {
                        this.f146916f = b();
                        synchronized (this.f146914d) {
                            this.f146913c.d();
                            this.f146917g = null;
                            Thread.interrupted();
                        }
                    } catch (Throwable th2) {
                        synchronized (this.f146914d) {
                            this.f146913c.d();
                            this.f146917g = null;
                            Thread.interrupted();
                            throw th2;
                        }
                    }
                } catch (Exception e10) {
                    this.f146915e = e10;
                    synchronized (this.f146914d) {
                        this.f146913c.d();
                        this.f146917g = null;
                        Thread.interrupted();
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) throws TimeoutException {
        boolean z10;
        long jConvert = TimeUnit.MILLISECONDS.convert(j10, timeUnit);
        vy vyVar = this.f146913c;
        synchronized (vyVar) {
            try {
                if (jConvert <= 0) {
                    z10 = vyVar.f157128a;
                } else {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    long j11 = jConvert + jElapsedRealtime;
                    if (j11 < jElapsedRealtime) {
                        vyVar.a();
                    } else {
                        while (!vyVar.f157128a && jElapsedRealtime < j11) {
                            vyVar.wait(j11 - jElapsedRealtime);
                            jElapsedRealtime = SystemClock.elapsedRealtime();
                        }
                    }
                    z10 = vyVar.f157128a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            return c();
        }
        throw new TimeoutException();
    }

    public void a() {
    }
}
