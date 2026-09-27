package androidx.loader.content;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public abstract class d<Params, Progress, Result> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f13495g = "AsyncTask";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f13496h = 5;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f13497i = 128;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f13498j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final ThreadFactory f13499k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final BlockingQueue<Runnable> f13500l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Executor f13501m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f13502n = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f13503o = 2;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static f f13504p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static volatile Executor f13505q;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h<Params, Result> f13506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FutureTask<Result> f13507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile g f13508d = g.PENDING;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f13509e = new AtomicBoolean();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f13510f = new AtomicBoolean();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicInteger f13511a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "ModernAsyncTask #" + this.f13511a.getAndIncrement());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b extends h<Params, Result> {
        public b() {
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // java.util.concurrent.Callable
        public Result call() throws Exception {
            d.this.f13510f.set(true);
            Result result = null;
            try {
                Process.setThreadPriority(10);
                result = (Result) d.this.b(this.f13521a);
                Binder.flushPendingCommands();
                d.this.q(result);
                return result;
            } catch (Throwable th2) {
                try {
                    d.this.f13509e.set(true);
                    throw th2;
                } catch (Throwable th3) {
                    d.this.q(result);
                    throw th3;
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class c extends FutureTask<Result> {
        public c(Callable callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        public void done() {
            try {
                d.this.r(get());
            } catch (InterruptedException e10) {
                Log.w(d.f13495g, e10);
            } catch (CancellationException unused) {
                d.this.r(null);
            } catch (ExecutionException e11) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e11.getCause());
            } catch (Throwable th2) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th2);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.loader.content.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static /* synthetic */ class C0101d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13514a;

        static {
            int[] iArr = new int[g.values().length];
            f13514a = iArr;
            try {
                iArr[g.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13514a[g.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class e<Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f13515a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Data[] f13516b;

        public e(d dVar, Data... dataArr) {
            this.f13515a = dVar;
            this.f13516b = dataArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class f extends Handler {
        public f() {
            super(Looper.getMainLooper());
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            e eVar = (e) message.obj;
            int i10 = message.what;
            if (i10 == 1) {
                eVar.f13515a.f(eVar.f13516b[0]);
            } else {
                if (i10 != 2) {
                    return;
                }
                eVar.f13515a.p(eVar.f13516b);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum g {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class h<Params, Result> implements Callable<Result> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Params[] f13521a;
    }

    static {
        a aVar = new a();
        f13499k = aVar;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(10);
        f13500l = linkedBlockingQueue;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, linkedBlockingQueue, aVar);
        f13501m = threadPoolExecutor;
        f13505q = threadPoolExecutor;
    }

    public d() {
        b bVar = new b();
        this.f13506b = bVar;
        this.f13507c = new c(bVar);
    }

    public static void d(Runnable runnable) {
        f13505q.execute(runnable);
    }

    public static Handler i() {
        f fVar;
        synchronized (d.class) {
            try {
                if (f13504p == null) {
                    f13504p = new f();
                }
                fVar = f13504p;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fVar;
    }

    @y0({y0.a.LIBRARY_GROUP})
    public static void t(Executor executor) {
        f13505q = executor;
    }

    public final boolean a(boolean z10) {
        this.f13509e.set(true);
        return this.f13507c.cancel(z10);
    }

    public abstract Result b(Params... paramsArr);

    public final d<Params, Progress, Result> c(Params... paramsArr) {
        return e(f13505q, paramsArr);
    }

    public final d<Params, Progress, Result> e(Executor executor, Params... paramsArr) {
        if (this.f13508d == g.PENDING) {
            this.f13508d = g.RUNNING;
            o();
            this.f13506b.f13521a = paramsArr;
            executor.execute(this.f13507c);
            return this;
        }
        int i10 = C0101d.f13514a[this.f13508d.ordinal()];
        if (i10 == 1) {
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (i10 != 2) {
            throw new IllegalStateException("We should never reach this state");
        }
        throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
    }

    public void f(Result result) {
        if (k()) {
            m(result);
        } else {
            n(result);
        }
        this.f13508d = g.FINISHED;
    }

    public final Result g() throws ExecutionException, InterruptedException {
        return this.f13507c.get();
    }

    public final Result h(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.f13507c.get(j10, timeUnit);
    }

    public final g j() {
        return this.f13508d;
    }

    public final boolean k() {
        return this.f13509e.get();
    }

    public void m(Result result) {
        l();
    }

    public Result q(Result result) {
        i().obtainMessage(1, new e(this, result)).sendToTarget();
        return result;
    }

    public void r(Result result) {
        if (this.f13510f.get()) {
            return;
        }
        q(result);
    }

    public final void s(Progress... progressArr) {
        if (k()) {
            return;
        }
        i().obtainMessage(2, new e(this, progressArr)).sendToTarget();
    }

    public void l() {
    }

    public void n(Result result) {
    }

    public void o() {
    }

    public void p(Progress... progressArr) {
    }
}
