package sg.bigo.ads.common.h.b;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
class c extends ThreadPoolExecutor implements AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static c f133106a;

    private c(TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        super(5, 8, 3000L, timeUnit, blockingQueue, threadFactory, rejectedExecutionHandler);
    }

    public static synchronized c a(boolean z10) {
        try {
            if (f133106a == null) {
                synchronized (c.class) {
                    try {
                        if (f133106a == null) {
                            b(z10);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return f133106a;
    }

    private static synchronized void b(boolean z10) {
        f133106a = new c(TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new sg.bigo.ads.common.n.c("Download", z10), new ThreadPoolExecutor.AbortPolicy());
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        v1.h.a(this);
    }
}
