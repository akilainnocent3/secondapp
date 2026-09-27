package v1;

import android.os.Handler;
import android.os.Process;
import androidx.annotation.NonNull;
import e2.x;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import k.e0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class m {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f139909a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f139910b;

        /* JADX INFO: renamed from: v1.m$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static class C1465a extends Thread {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f139911b;

            public C1465a(Runnable runnable, String str, int i10) {
                super(runnable, str);
                this.f139911b = i10;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.f139911b);
                super.run();
            }
        }

        public a(@NonNull String str, int i10) {
            this.f139909a = str;
            this.f139910b = i10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C1465a(runnable, this.f139909a, this.f139910b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b implements Executor {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Handler f139912b;

        public b(@NonNull Handler handler) {
            this.f139912b = (Handler) x.l(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(@NonNull Runnable runnable) {
            if (this.f139912b.post((Runnable) x.l(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.f139912b + " is shutting down");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class c<T> implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        public Callable<T> f139913b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NonNull
        public e2.e<T> f139914c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NonNull
        public Handler f139915d;

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e2.e f139916b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Object f139917c;

            public a(e2.e eVar, Object obj) {
                this.f139916b = eVar;
                this.f139917c = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                this.f139916b.accept(this.f139917c);
            }
        }

        public c(@NonNull Handler handler, @NonNull Callable<T> callable, @NonNull e2.e<T> eVar) {
            this.f139913b = callable;
            this.f139914c = eVar;
            this.f139915d = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            T tCall;
            try {
                tCall = this.f139913b.call();
            } catch (Exception unused) {
                tCall = null;
            }
            this.f139915d.post(new a(this.f139914c, tCall));
        }
    }

    public static ThreadPoolExecutor a(@NonNull String str, int i10, @e0(from = 0) int i11) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i11, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i10));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    public static Executor b(@NonNull Handler handler) {
        return new b(handler);
    }

    public static <T> void c(@NonNull Executor executor, @NonNull Callable<T> callable, @NonNull e2.e<T> eVar) {
        executor.execute(new c(v1.b.a(), callable, eVar));
    }

    public static <T> T d(@NonNull ExecutorService executorService, @NonNull Callable<T> callable, @e0(from = 0) int i10) throws InterruptedException {
        try {
            return executorService.submit(callable).get(i10, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            throw e10;
        } catch (ExecutionException e11) {
            throw new RuntimeException(e11);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
