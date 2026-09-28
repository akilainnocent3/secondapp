package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes8.dex */
public final class bmc implements ThreadFactory {
    public final String a;
    public final AtomicInteger b;
    public final ThreadFactory c;

    public static class a implements Thread.UncaughtExceptionHandler {
        public final Thread.UncaughtExceptionHandler a;

        public a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.a = uncaughtExceptionHandler;
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public final void uncaughtException(Thread thread, Throwable th) {
            if (th instanceof InterruptedException) {
                thread.interrupt();
                return;
            }
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.a;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        }
    }

    public bmc() {
        ThreadFactory threadFactoryDefaultThreadFactory = Executors.defaultThreadFactory();
        this.b = new AtomicInteger();
        this.a = "okhttp-dispatch";
        this.c = threadFactoryDefaultThreadFactory;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.c.newThread(runnable);
        threadNewThread.setUncaughtExceptionHandler(new a(threadNewThread.getUncaughtExceptionHandler()));
        try {
            threadNewThread.setDaemon(true);
            threadNewThread.setName(this.a + "-" + this.b.incrementAndGet());
            threadNewThread.setContextClassLoader(null);
        } catch (SecurityException unused) {
        }
        return threadNewThread;
    }
}
