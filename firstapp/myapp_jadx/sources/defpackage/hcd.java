package defpackage;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes8.dex */
public final class hcd extends upg implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final hcd y;
    public static final long z;

    static {
        Long l;
        hcd hcdVar = new hcd();
        y = hcdVar;
        hcdVar.n0(false);
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        z = TimeUnit.MILLISECONDS.toNanos(l.longValue());
    }

    @Override // defpackage.upg, defpackage.tpg
    public final void A0() {
        debugStatus = 4;
        super.A0();
    }

    @Override // defpackage.vpg
    public final Thread D0() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setContextClassLoader(y.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // defpackage.vpg
    public final void F0(long j, upg.c cVar) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // defpackage.upg
    public final void G0(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.G0(runnable);
    }

    public final synchronized void X0() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            Unsafe unsafe = s0o.a;
            unsafe.putObjectVolatile(this, upg.v, (Object) null);
            unsafe.putObjectVolatile(this, upg.f, (Object) null);
            notifyAll();
        }
    }

    @Override // defpackage.upg, defpackage.ekd
    public final wse m(long j, Runnable runnable, CoroutineContext coroutineContext) {
        long j2 = 0;
        if (j > 0) {
            j2 = j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j;
        }
        if (j2 >= 4611686018427387903L) {
            return lxx.a;
        }
        long jNanoTime = System.nanoTime();
        upg.b bVar = new upg.b(j2 + jNanoTime, runnable);
        W0(jNanoTime, bVar);
        return bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xof0.a.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    _thread = null;
                    X0();
                    if (O0()) {
                        return;
                    }
                    D0();
                    return;
                }
                debugStatus = 1;
                notifyAll();
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jU0 = u0();
                    if (jU0 == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = z + jNanoTime;
                        }
                        long j2 = j - jNanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            X0();
                            if (O0()) {
                                return;
                            }
                            D0();
                            return;
                        }
                        if (jU0 > j2) {
                            jU0 = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (jU0 > 0) {
                        int i2 = debugStatus;
                        if (i2 == 2 || i2 == 3) {
                            _thread = null;
                            X0();
                            if (O0()) {
                                return;
                            }
                            D0();
                            return;
                        }
                        LockSupport.parkNanos(this, jU0);
                    }
                }
            }
        } catch (Throwable th) {
            _thread = null;
            X0();
            if (!O0()) {
                D0();
            }
            throw th;
        }
    }

    @Override // defpackage.k5b
    public final String toString() {
        return "DefaultExecutor";
    }
}
