package fk;

import android.annotation.SuppressLint;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f84839a = 2;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f84840a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AtomicLong f84841b;

        /* JADX INFO: renamed from: fk.k0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class C0833a extends d {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Runnable f84842b;

            public C0833a(Runnable runnable) {
                this.f84842b = runnable;
            }

            @Override // fk.d
            public void a() {
                this.f84842b.run();
            }
        }

        public a(String str, AtomicLong atomicLong) {
            this.f84840a = str;
            this.f84841b = atomicLong;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = Executors.defaultThreadFactory().newThread(new C0833a(runnable));
            threadNewThread.setName(this.f84840a + this.f84841b.getAndIncrement());
            return threadNewThread;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f84844b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ExecutorService f84845c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f84846d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ TimeUnit f84847e;

        public b(String str, ExecutorService executorService, long j10, TimeUnit timeUnit) {
            this.f84844b = str;
            this.f84845c = executorService;
            this.f84846d = j10;
            this.f84847e = timeUnit;
        }

        @Override // fk.d
        public void a() {
            try {
                ck.g.f().b("Executing shutdown hook for " + this.f84844b);
                this.f84845c.shutdown();
                if (this.f84845c.awaitTermination(this.f84846d, this.f84847e)) {
                    return;
                }
                ck.g.f().b(this.f84844b + " did not shut down in the allocated time. Requesting immediate shutdown.");
                this.f84845c.shutdownNow();
            } catch (InterruptedException unused) {
                ck.g.f().b(String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", this.f84844b));
                this.f84845c.shutdownNow();
            }
        }
    }

    public static void a(String str, ExecutorService executorService) {
        b(str, executorService, 2L, TimeUnit.SECONDS);
    }

    @SuppressLint({"ThreadPoolCreation"})
    public static void b(String str, ExecutorService executorService, long j10, TimeUnit timeUnit) {
        Runtime.getRuntime().addShutdownHook(new Thread(new b(str, executorService, j10, timeUnit), "Crashlytics Shutdown Hook for " + str));
    }

    public static Executor c(Executor executor) {
        return ak.z.h(executor);
    }

    public static ExecutorService d(String str) {
        ExecutorService executorServiceG = g(f(str), new ThreadPoolExecutor.DiscardPolicy());
        a(str, executorServiceG);
        return executorServiceG;
    }

    public static ScheduledExecutorService e(String str) {
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(f(str));
        a(str, scheduledExecutorServiceNewSingleThreadScheduledExecutor);
        return scheduledExecutorServiceNewSingleThreadScheduledExecutor;
    }

    public static ThreadFactory f(String str) {
        return new a(str, new AtomicLong(1L));
    }

    @SuppressLint({"ThreadPoolCreation"})
    public static ExecutorService g(ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        return Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory, rejectedExecutionHandler));
    }
}
