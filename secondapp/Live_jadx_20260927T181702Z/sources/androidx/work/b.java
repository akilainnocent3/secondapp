package androidx.work;

import android.annotation.SuppressLint;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @SuppressLint({"MinMaxConstant"})
    public static final int f20024m = 20;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final Executor f20025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final Executor f20026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final i0 f20027c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final o f20028d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final c0 f20029e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final m f20030f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final String f20031g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f20032h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f20033i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f20034j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f20035k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f20036l;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicInteger f20037a = new AtomicInteger(0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f20038b;

        public a(final boolean val$isTaskExecutor) {
            this.f20038b = val$isTaskExecutor;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, (this.f20038b ? "WM.task-" : "androidx.work-") + this.f20037a.incrementAndGet());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface c {
        @NonNull
        b a();
    }

    public b(@NonNull C0177b builder) {
        Executor executor = builder.f20040a;
        if (executor == null) {
            this.f20025a = a(false);
        } else {
            this.f20025a = executor;
        }
        Executor executor2 = builder.f20043d;
        if (executor2 == null) {
            this.f20036l = true;
            this.f20026b = a(true);
        } else {
            this.f20036l = false;
            this.f20026b = executor2;
        }
        i0 i0Var = builder.f20041b;
        if (i0Var == null) {
            this.f20027c = i0.c();
        } else {
            this.f20027c = i0Var;
        }
        o oVar = builder.f20042c;
        if (oVar == null) {
            this.f20028d = o.c();
        } else {
            this.f20028d = oVar;
        }
        c0 c0Var = builder.f20044e;
        if (c0Var == null) {
            this.f20029e = new fa.a();
        } else {
            this.f20029e = c0Var;
        }
        this.f20032h = builder.f20047h;
        this.f20033i = builder.f20048i;
        this.f20034j = builder.f20049j;
        this.f20035k = builder.f20050k;
        this.f20030f = builder.f20045f;
        this.f20031g = builder.f20046g;
    }

    @NonNull
    public final Executor a(boolean isTaskExecutor) {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), b(isTaskExecutor));
    }

    @NonNull
    public final ThreadFactory b(boolean isTaskExecutor) {
        return new a(isTaskExecutor);
    }

    @Nullable
    public String c() {
        return this.f20031g;
    }

    @Nullable
    @y0({y0.a.LIBRARY_GROUP})
    public m d() {
        return this.f20030f;
    }

    @NonNull
    public Executor e() {
        return this.f20025a;
    }

    @NonNull
    public o f() {
        return this.f20028d;
    }

    public int g() {
        return this.f20034j;
    }

    @k.e0(from = 20, to = 50)
    @y0({y0.a.LIBRARY_GROUP})
    public int h() {
        return Build.VERSION.SDK_INT == 23 ? this.f20035k / 2 : this.f20035k;
    }

    public int i() {
        return this.f20033i;
    }

    @y0({y0.a.LIBRARY_GROUP})
    public int j() {
        return this.f20032h;
    }

    @NonNull
    public c0 k() {
        return this.f20029e;
    }

    @NonNull
    public Executor l() {
        return this.f20026b;
    }

    @NonNull
    public i0 m() {
        return this.f20027c;
    }

    @y0({y0.a.LIBRARY_GROUP})
    public boolean n() {
        return this.f20036l;
    }

    /* JADX INFO: renamed from: androidx.work.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class C0177b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Executor f20040a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public i0 f20041b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public o f20042c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Executor f20043d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public c0 f20044e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public m f20045f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public String f20046g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f20047h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f20048i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f20049j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f20050k;

        public C0177b() {
            this.f20047h = 4;
            this.f20048i = 0;
            this.f20049j = Integer.MAX_VALUE;
            this.f20050k = 20;
        }

        @NonNull
        public b a() {
            return new b(this);
        }

        @NonNull
        public C0177b b(@NonNull String processName) {
            this.f20046g = processName;
            return this;
        }

        @NonNull
        public C0177b c(@NonNull Executor executor) {
            this.f20040a = executor;
            return this;
        }

        @NonNull
        @y0({y0.a.LIBRARY_GROUP})
        public C0177b d(@NonNull m exceptionHandler) {
            this.f20045f = exceptionHandler;
            return this;
        }

        @NonNull
        public C0177b e(@NonNull o inputMergerFactory) {
            this.f20042c = inputMergerFactory;
            return this;
        }

        @NonNull
        public C0177b f(int minJobSchedulerId, int maxJobSchedulerId) {
            if (maxJobSchedulerId - minJobSchedulerId < 1000) {
                throw new IllegalArgumentException("WorkManager needs a range of at least 1000 job ids.");
            }
            this.f20048i = minJobSchedulerId;
            this.f20049j = maxJobSchedulerId;
            return this;
        }

        @NonNull
        public C0177b g(int maxSchedulerLimit) {
            if (maxSchedulerLimit < 20) {
                throw new IllegalArgumentException("WorkManager needs to be able to schedule at least 20 jobs in JobScheduler.");
            }
            this.f20050k = Math.min(maxSchedulerLimit, 50);
            return this;
        }

        @NonNull
        public C0177b h(int loggingLevel) {
            this.f20047h = loggingLevel;
            return this;
        }

        @NonNull
        public C0177b i(@NonNull c0 runnableScheduler) {
            this.f20044e = runnableScheduler;
            return this;
        }

        @NonNull
        public C0177b j(@NonNull Executor taskExecutor) {
            this.f20043d = taskExecutor;
            return this;
        }

        @NonNull
        public C0177b k(@NonNull i0 workerFactory) {
            this.f20041b = workerFactory;
            return this;
        }

        @y0({y0.a.LIBRARY_GROUP})
        public C0177b(@NonNull b configuration) {
            this.f20040a = configuration.f20025a;
            this.f20041b = configuration.f20027c;
            this.f20042c = configuration.f20028d;
            this.f20043d = configuration.f20026b;
            this.f20047h = configuration.f20032h;
            this.f20048i = configuration.f20033i;
            this.f20049j = configuration.f20034j;
            this.f20050k = configuration.f20035k;
            this.f20044e = configuration.f20029e;
            this.f20045f = configuration.f20030f;
            this.f20046g = configuration.f20031g;
        }
    }
}
