package tl;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import qj.d;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final tl.a f137033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile tl.a f137034b;

    /* JADX INFO: renamed from: tl.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class C1409b implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final long f137035a = 60;

        public C1409b() {
        }

        @Override // tl.a
        @NonNull
        @SuppressLint({"ThreadPoolCreation"})
        public ExecutorService a(int i10, ThreadFactory threadFactory, c cVar) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i10, i10, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            return Executors.unconfigurableExecutorService(threadPoolExecutor);
        }

        @Override // tl.a
        @NonNull
        @SuppressLint({"ThreadPoolCreation"})
        public Future<?> b(@d String str, @d String str2, c cVar, Runnable runnable) {
            FutureTask futureTask = new FutureTask(runnable, null);
            new Thread(futureTask, str2).start();
            return futureTask;
        }

        @Override // tl.a
        @NonNull
        @SuppressLint({"ThreadPoolCreation"})
        public ScheduledExecutorService c(int i10, ThreadFactory threadFactory, c cVar) {
            return Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(i10, threadFactory));
        }

        @Override // tl.a
        @NonNull
        @SuppressLint({"ThreadPoolCreation"})
        public ExecutorService d(c cVar) {
            return Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        }

        @Override // tl.a
        @NonNull
        public ExecutorService e(int i10, c cVar) {
            return a(i10, Executors.defaultThreadFactory(), cVar);
        }

        @Override // tl.a
        @NonNull
        @SuppressLint({"ThreadPoolCreation"})
        public void f(@d String str, @d String str2, c cVar, Runnable runnable) {
            new Thread(runnable, str2).start();
        }

        @Override // tl.a
        @NonNull
        public ExecutorService g(ThreadFactory threadFactory, c cVar) {
            return a(1, threadFactory, cVar);
        }

        @Override // tl.a
        @NonNull
        @SuppressLint({"ThreadPoolCreation"})
        public ScheduledExecutorService h(int i10, c cVar) {
            return Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(i10));
        }

        @Override // tl.a
        @NonNull
        public ExecutorService i(c cVar) {
            return e(1, cVar);
        }

        @Override // tl.a
        @NonNull
        @SuppressLint({"ThreadPoolCreation"})
        public ExecutorService j(ThreadFactory threadFactory, c cVar) {
            return Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(threadFactory));
        }
    }

    static {
        C1409b c1409b = new C1409b();
        f137033a = c1409b;
        f137034b = c1409b;
    }

    public static tl.a a() {
        return f137034b;
    }

    public static void b(tl.a aVar) {
        if (f137034b != f137033a) {
            throw new IllegalStateException("Trying to install an ExecutorFactory twice!");
        }
        f137034b = aVar;
    }
}
