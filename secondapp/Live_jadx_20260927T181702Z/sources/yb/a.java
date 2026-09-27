package yb;

import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import k.e0;
import k.h1;
import v1.h;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements ExecutorService, AutoCloseable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f159118c = "source";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f159119d = "disk-cache";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f159120e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f159121f = "GlideExecutor";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f159122g = "source-unlimited";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f159123h = "animation";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final long f159124i = TimeUnit.SECONDS.toMillis(10);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f159125j = 4;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static volatile int f159126k;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExecutorService f159127b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final long f159128h = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f159129a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f159130b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f159131c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NonNull
        public ThreadFactory f159132d = new c();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NonNull
        public e f159133e = e.f159148d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f159134f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f159135g;

        public b(boolean z10) {
            this.f159129a = z10;
        }

        public a a() {
            if (TextUtils.isEmpty(this.f159134f)) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: " + this.f159134f);
            }
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(this.f159130b, this.f159131c, this.f159135g, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new d(this.f159132d, this.f159134f, this.f159133e, this.f159129a));
            if (this.f159135g != 0) {
                threadPoolExecutor.allowCoreThreadTimeOut(true);
            }
            return new a(threadPoolExecutor);
        }

        public b b(String str) {
            this.f159134f = str;
            return this;
        }

        public b c(@e0(from = 1) int i10) {
            this.f159130b = i10;
            this.f159131c = i10;
            return this;
        }

        @Deprecated
        public b d(@NonNull ThreadFactory threadFactory) {
            this.f159132d = threadFactory;
            return this;
        }

        public b e(long j10) {
            this.f159135g = j10;
            return this;
        }

        public b f(@NonNull e eVar) {
            this.f159133e = eVar;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f159136a = 9;

        /* JADX INFO: renamed from: yb.a$c$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class C1544a extends Thread {
            public C1544a(Runnable runnable) {
                super(runnable);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(9);
                super.run();
            }
        }

        public c() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@NonNull Runnable runnable) {
            return new C1544a(runnable);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class d implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ThreadFactory f159138a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f159139b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final e f159140c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f159141d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final AtomicInteger f159142e = new AtomicInteger();

        /* JADX INFO: renamed from: yb.a$d$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class RunnableC1545a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Runnable f159143b;

            public RunnableC1545a(Runnable runnable) {
                this.f159143b = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (d.this.f159141d) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    this.f159143b.run();
                } catch (Throwable th2) {
                    d.this.f159140c.a(th2);
                }
            }
        }

        public d(ThreadFactory threadFactory, String str, e eVar, boolean z10) {
            this.f159138a = threadFactory;
            this.f159139b = str;
            this.f159140c = eVar;
            this.f159141d = z10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@NonNull Runnable runnable) {
            Thread threadNewThread = this.f159138a.newThread(new RunnableC1545a(runnable));
            threadNewThread.setName("glide-" + this.f159139b + "-thread-" + this.f159142e.getAndIncrement());
            return threadNewThread;
        }
    }

    @h1
    public a(ExecutorService executorService) {
        this.f159127b = executorService;
    }

    @Deprecated
    public static a D(e eVar) {
        return r().f(eVar).a();
    }

    public static a E() {
        return new a(new ThreadPoolExecutor(0, Integer.MAX_VALUE, f159124i, TimeUnit.MILLISECONDS, new SynchronousQueue(), new d(new c(), f159122g, e.f159148d, false)));
    }

    public static int d() {
        return h() >= 4 ? 2 : 1;
    }

    public static int h() {
        if (f159126k == 0) {
            f159126k = Math.min(4, yb.b.a());
        }
        return f159126k;
    }

    public static b k() {
        return new b(true).c(d()).b(f159123h);
    }

    public static a l() {
        return k().a();
    }

    @Deprecated
    public static a m(int i10, e eVar) {
        return k().c(i10).f(eVar).a();
    }

    public static b n() {
        return new b(true).c(1).b(f159119d);
    }

    public static a o() {
        return n().a();
    }

    @Deprecated
    public static a p(int i10, String str, e eVar) {
        return n().c(i10).b(str).f(eVar).a();
    }

    @Deprecated
    public static a q(e eVar) {
        return n().f(eVar).a();
    }

    public static b r() {
        return new b(false).c(h()).b("source");
    }

    public static a t() {
        return r().a();
    }

    @Deprecated
    public static a y(int i10, String str, e eVar) {
        return r().c(i10).b(str).f(eVar).a();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j10, @NonNull TimeUnit timeUnit) throws InterruptedException {
        return this.f159127b.awaitTermination(j10, timeUnit);
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        h.a(this);
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NonNull Runnable runnable) {
        this.f159127b.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public <T> List<Future<T>> invokeAll(@NonNull Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f159127b.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public <T> T invokeAny(@NonNull Collection<? extends Callable<T>> collection) throws ExecutionException, InterruptedException {
        return (T) this.f159127b.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f159127b.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f159127b.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.f159127b.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public List<Runnable> shutdownNow() {
        return this.f159127b.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public Future<?> submit(@NonNull Runnable runnable) {
        return this.f159127b.submit(runnable);
    }

    public String toString() {
        return this.f159127b.toString();
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public <T> List<Future<T>> invokeAll(@NonNull Collection<? extends Callable<T>> collection, long j10, @NonNull TimeUnit timeUnit) throws InterruptedException {
        return this.f159127b.invokeAll(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(@NonNull Collection<? extends Callable<T>> collection, long j10, @NonNull TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return (T) this.f159127b.invokeAny(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public <T> Future<T> submit(@NonNull Runnable runnable, T t10) {
        return this.f159127b.submit(runnable, t10);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(@NonNull Callable<T> callable) {
        return this.f159127b.submit(callable);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f159145a = new C1546a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e f159146b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f159147c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final e f159148d;

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class b implements e {
            @Override // yb.a.e
            public void a(Throwable th2) {
                if (th2 == null || !Log.isLoggable(a.f159121f, 6)) {
                    return;
                }
                Log.e(a.f159121f, "Request threw uncaught throwable", th2);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class c implements e {
            @Override // yb.a.e
            public void a(Throwable th2) {
                if (th2 != null) {
                    throw new RuntimeException("Request threw uncaught throwable", th2);
                }
            }
        }

        static {
            b bVar = new b();
            f159146b = bVar;
            f159147c = new c();
            f159148d = bVar;
        }

        void a(Throwable th2);

        /* JADX INFO: renamed from: yb.a$e$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class C1546a implements e {
            @Override // yb.a.e
            public void a(Throwable th2) {
            }
        }
    }
}
