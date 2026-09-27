package nj;

import com.ironsource.C4235d4;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@o0
@km.h(km.h.a.FULL)
@yi.b(emulated = true)
public abstract class f<V> extends oj.a implements t1<V> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f116947e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final s1 f116948f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f116949g = 1000;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f116950h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Object f116951i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @zq.a
    public volatile Object f116952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @zq.a
    public volatile e f116953c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @zq.a
    public volatile l f116954d;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class b {
        public b() {
        }

        public abstract boolean a(f<?> future, @zq.a e expect, e update);

        public abstract boolean b(f<?> future, @zq.a Object expect, Object update);

        public abstract boolean c(f<?> future, @zq.a l expect, @zq.a l update);

        public abstract e d(f<?> future, e update);

        public abstract l e(f<?> future, l update);

        public abstract void f(l waiter, @zq.a l newValue);

        public abstract void g(l waiter, Thread newValue);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @zq.a
        public static final c f116955c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @zq.a
        public static final c f116956d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f116957a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @zq.a
        public final Throwable f116958b;

        static {
            if (f.f116947e) {
                f116956d = null;
                f116955c = null;
            } else {
                f116956d = new c(false, null);
                f116955c = new c(true, null);
            }
        }

        public c(boolean wasInterrupted, @zq.a Throwable cause) {
            this.f116957a = wasInterrupted;
            this.f116958b = cause;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f116959b = new d(new a("Failure occurred while trying to finish a future."));

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f116960a;

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class a extends Throwable {
            public a(String message) {
                super(message);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public d(Throwable exception) {
            this.f116960a = (Throwable) zi.l0.E(exception);
        }
    }

    /* JADX INFO: renamed from: nj.f$f, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class C1073f extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<l, Thread> f116965a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<l, l> f116966b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<? super f<?>, l> f116967c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<? super f<?>, e> f116968d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<? super f<?>, Object> f116969e;

        public C1073f(AtomicReferenceFieldUpdater<l, Thread> waiterThreadUpdater, AtomicReferenceFieldUpdater<l, l> waiterNextUpdater, AtomicReferenceFieldUpdater<? super f<?>, l> waitersUpdater, AtomicReferenceFieldUpdater<? super f<?>, e> listenersUpdater, AtomicReferenceFieldUpdater<? super f<?>, Object> valueUpdater) {
            super();
            this.f116965a = waiterThreadUpdater;
            this.f116966b = waiterNextUpdater;
            this.f116967c = waitersUpdater;
            this.f116968d = listenersUpdater;
            this.f116969e = valueUpdater;
        }

        @Override // nj.f.b
        public boolean a(f<?> future, @zq.a e expect, e update) {
            return h0.b.a(this.f116968d, future, expect, update);
        }

        @Override // nj.f.b
        public boolean b(f<?> future, @zq.a Object expect, Object update) {
            return h0.b.a(this.f116969e, future, expect, update);
        }

        @Override // nj.f.b
        public boolean c(f<?> future, @zq.a l expect, @zq.a l update) {
            return h0.b.a(this.f116967c, future, expect, update);
        }

        @Override // nj.f.b
        public e d(f<?> future, e update) {
            return this.f116968d.getAndSet(future, update);
        }

        @Override // nj.f.b
        public l e(f<?> future, l update) {
            return this.f116967c.getAndSet(future, update);
        }

        @Override // nj.f.b
        public void f(l waiter, @zq.a l newValue) {
            this.f116966b.lazySet(waiter, newValue);
        }

        @Override // nj.f.b
        public void g(l waiter, Thread newValue) {
            this.f116965a.lazySet(waiter, newValue);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class g<V> implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final f<V> f116970b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final t1<? extends V> f116971c;

        public g(f<V> owner, t1<? extends V> future) {
            this.f116970b = owner;
            this.f116971c = future;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f116970b.f116952b != this) {
                return;
            }
            if (f.f116950h.b(this.f116970b, this, f.w(this.f116971c))) {
                f.t(this.f116970b, false);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class h extends b {
        public h() {
            super();
        }

        @Override // nj.f.b
        public boolean a(f<?> future, @zq.a e expect, e update) {
            synchronized (future) {
                try {
                    if (future.f116953c != expect) {
                        return false;
                    }
                    future.f116953c = update;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // nj.f.b
        public boolean b(f<?> future, @zq.a Object expect, Object update) {
            synchronized (future) {
                try {
                    if (future.f116952b != expect) {
                        return false;
                    }
                    future.f116952b = update;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // nj.f.b
        public boolean c(f<?> future, @zq.a l expect, @zq.a l update) {
            synchronized (future) {
                try {
                    if (future.f116954d != expect) {
                        return false;
                    }
                    future.f116954d = update;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // nj.f.b
        public e d(f<?> future, e update) {
            e eVar;
            synchronized (future) {
                try {
                    eVar = future.f116953c;
                    if (eVar != update) {
                        future.f116953c = update;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return eVar;
        }

        @Override // nj.f.b
        public l e(f<?> future, l update) {
            l lVar;
            synchronized (future) {
                try {
                    lVar = future.f116954d;
                    if (lVar != update) {
                        future.f116954d = update;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return lVar;
        }

        @Override // nj.f.b
        public void f(l waiter, @zq.a l newValue) {
            waiter.f116980b = newValue;
        }

        @Override // nj.f.b
        public void g(l waiter, Thread newValue) {
            waiter.f116979a = newValue;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface i<V> extends t1<V> {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class j<V> extends f<V> implements i<V> {
        @Override // nj.f, nj.t1
        public void addListener(Runnable listener, Executor executor) {
            super.addListener(listener, executor);
        }

        @Override // nj.f, java.util.concurrent.Future
        @qj.a
        public boolean cancel(boolean mayInterruptIfRunning) {
            return super.cancel(mayInterruptIfRunning);
        }

        @Override // nj.f, java.util.concurrent.Future
        @qj.a
        @f2
        public V get() throws ExecutionException, InterruptedException {
            return (V) super.get();
        }

        @Override // nj.f, java.util.concurrent.Future
        public boolean isCancelled() {
            return super.isCancelled();
        }

        @Override // nj.f, java.util.concurrent.Future
        public boolean isDone() {
            return super.isDone();
        }

        @Override // nj.f, java.util.concurrent.Future
        @f2
        @qj.a
        public final V get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
            return (V) super.get(j10, timeUnit);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class k extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Unsafe f116972a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final long f116973b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final long f116974c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final long f116975d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final long f116976e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final long f116977f;

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class a implements PrivilegedExceptionAction<Unsafe> {
            @Override // java.security.PrivilegedExceptionAction
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Unsafe run() throws Exception {
                for (Field field : Unsafe.class.getDeclaredFields()) {
                    field.setAccessible(true);
                    Object obj = field.get(null);
                    if (Unsafe.class.isInstance(obj)) {
                        return (Unsafe) Unsafe.class.cast(obj);
                    }
                }
                throw new NoSuchFieldError("the Unsafe");
            }
        }

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (PrivilegedActionException e10) {
                    throw new RuntimeException("Could not initialize intrinsics", e10.getCause());
                }
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new a());
            }
            try {
                f116974c = unsafe.objectFieldOffset(f.class.getDeclaredField("d"));
                f116973b = unsafe.objectFieldOffset(f.class.getDeclaredField("c"));
                f116975d = unsafe.objectFieldOffset(f.class.getDeclaredField("b"));
                f116976e = unsafe.objectFieldOffset(l.class.getDeclaredField("a"));
                f116977f = unsafe.objectFieldOffset(l.class.getDeclaredField("b"));
                f116972a = unsafe;
            } catch (NoSuchFieldException e11) {
                throw new RuntimeException(e11);
            }
        }

        public k() {
            super();
        }

        @Override // nj.f.b
        public boolean a(f<?> future, @zq.a e expect, e update) {
            return com.google.android.gms.internal.ads.z0.a(f116972a, future, f116973b, expect, update);
        }

        @Override // nj.f.b
        public boolean b(f<?> future, @zq.a Object expect, Object update) {
            return com.google.android.gms.internal.ads.z0.a(f116972a, future, f116975d, expect, update);
        }

        @Override // nj.f.b
        public boolean c(f<?> future, @zq.a l expect, @zq.a l update) {
            return com.google.android.gms.internal.ads.z0.a(f116972a, future, f116974c, expect, update);
        }

        @Override // nj.f.b
        public e d(f<?> future, e update) {
            e eVar;
            do {
                eVar = future.f116953c;
                if (update == eVar) {
                    break;
                }
            } while (!a(future, eVar, update));
            return eVar;
        }

        @Override // nj.f.b
        public l e(f<?> future, l update) {
            l lVar;
            do {
                lVar = future.f116954d;
                if (update == lVar) {
                    break;
                }
            } while (!c(future, lVar, update));
            return lVar;
        }

        @Override // nj.f.b
        public void f(l waiter, @zq.a l newValue) {
            f116972a.putObject(waiter, f116977f, newValue);
        }

        @Override // nj.f.b
        public void g(l waiter, Thread newValue) {
            f116972a.putObject(waiter, f116976e, newValue);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class l {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final l f116978c = new l(false);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @zq.a
        public volatile Thread f116979a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @zq.a
        public volatile l f116980b;

        public l(boolean unused) {
        }

        public void a(@zq.a l next) {
            f.f116950h.f(this, next);
        }

        public void b() {
            Thread thread = this.f116979a;
            if (thread != null) {
                this.f116979a = null;
                LockSupport.unpark(thread);
            }
        }

        public l() {
            f.f116950h.g(this, Thread.currentThread());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.util.logging.Logger] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Error] */
    /* JADX WARN: Type inference failed for: r4v0, types: [nj.f$a] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v3 */
    static {
        boolean z10;
        Throwable th2;
        b c1073f;
        try {
            z10 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z10 = false;
        }
        f116947e = z10;
        f116948f = new s1(f.class);
        ?? r10 = 0;
        r10 = 0;
        try {
            c1073f = new k();
            th2 = null;
        } catch (Error | Exception e10) {
            th2 = e10;
            try {
                c1073f = new C1073f(AtomicReferenceFieldUpdater.newUpdater(l.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(l.class, l.class, "b"), AtomicReferenceFieldUpdater.newUpdater(f.class, l.class, "d"), AtomicReferenceFieldUpdater.newUpdater(f.class, e.class, "c"), AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "b"));
            } catch (Error | Exception e11) {
                h hVar = new h();
                r10 = e11;
                c1073f = hVar;
            }
        }
        f116950h = c1073f;
        if (r10 != 0) {
            s1 s1Var = f116948f;
            Logger loggerA = s1Var.a();
            Level level = Level.SEVERE;
            loggerA.log(level, "UnsafeAtomicHelper is broken!", th2);
            s1Var.a().log(level, "SafeAtomicHelper is broken!", r10);
        }
        f116951i = new Object();
    }

    public static CancellationException r(String message, @zq.a Throwable cause) {
        CancellationException cancellationException = new CancellationException(message);
        cancellationException.initCause(cause);
        return cancellationException;
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
    public static void t(f<?> fVar, boolean z10) {
        e eVar = null;
        while (true) {
            fVar.B();
            if (z10) {
                fVar.y();
                z10 = false;
            }
            fVar.o();
            e eVarS = fVar.s(eVar);
            while (eVarS != null) {
                eVar = eVarS.f116964c;
                Runnable runnable = eVarS.f116962a;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof g) {
                    g gVar = (g) runnable2;
                    fVar = gVar.f116970b;
                    if (fVar.f116952b == gVar) {
                        if (f116950h.b(fVar, gVar, w(gVar.f116971c))) {
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = eVarS.f116963b;
                    Objects.requireNonNull(executor);
                    u(runnable2, executor);
                }
                eVarS = eVar;
            }
            return;
        }
    }

    public static void u(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e10) {
            f116948f.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static Object w(t1<?> future) {
        Throwable thA;
        if (future instanceof i) {
            Object cVar = ((f) future).f116952b;
            if (cVar instanceof c) {
                c cVar2 = (c) cVar;
                if (cVar2.f116957a) {
                    cVar = cVar2.f116958b != null ? new c(false, cVar2.f116958b) : c.f116956d;
                }
            }
            Objects.requireNonNull(cVar);
            return cVar;
        }
        if ((future instanceof oj.a) && (thA = oj.b.a((oj.a) future)) != null) {
            return new d(thA);
        }
        boolean zIsCancelled = future.isCancelled();
        if ((!f116947e) && zIsCancelled) {
            c cVar3 = c.f116956d;
            Objects.requireNonNull(cVar3);
            return cVar3;
        }
        try {
            Object objX = x(future);
            if (!zIsCancelled) {
                return objX == null ? f116951i : objX;
            }
            return new c(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + future));
        } catch (Error | Exception e10) {
            return new d(e10);
        } catch (CancellationException e11) {
            if (zIsCancelled) {
                return new c(false, e11);
            }
            return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + future, e11));
        } catch (ExecutionException e12) {
            if (!zIsCancelled) {
                return new d(e12.getCause());
            }
            return new c(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + future, e12));
        }
    }

    @f2
    private static <V> V x(Future<V> future) throws ExecutionException {
        V v10;
        boolean z10 = false;
        while (true) {
            try {
                v10 = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return v10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @zq.a
    public String A() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void B() {
        for (l lVarE = f116950h.e(this, l.f116978c); lVarE != null; lVarE = lVarE.f116980b) {
            lVarE.b();
        }
    }

    public final void C(l node) {
        node.f116979a = null;
        while (true) {
            l lVar = this.f116954d;
            if (lVar == l.f116978c) {
                return;
            }
            l lVar2 = null;
            while (lVar != null) {
                l lVar3 = lVar.f116980b;
                if (lVar.f116979a != null) {
                    lVar2 = lVar;
                } else if (lVar2 != null) {
                    lVar2.f116980b = lVar3;
                    if (lVar2.f116979a == null) {
                    }
                } else if (!f116950h.c(this, lVar, lVar3)) {
                }
                lVar = lVar3;
            }
            return;
        }
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
    @qj.a
    public boolean D(@f2 V v10) {
        if (v10 == null) {
            v10 = (V) f116951i;
        }
        if (!f116950h.b(this, null, v10)) {
            return false;
        }
        t(this, false);
        return true;
    }

    @qj.a
    public boolean E(Throwable throwable) {
        if (!f116950h.b(this, null, new d((Throwable) zi.l0.E(throwable)))) {
            return false;
        }
        t(this, false);
        return true;
    }

    @qj.a
    public boolean F(t1<? extends V> future) {
        d dVar;
        zi.l0.E(future);
        Object obj = this.f116952b;
        if (obj == null) {
            if (future.isDone()) {
                if (!f116950h.b(this, null, w(future))) {
                    return false;
                }
                t(this, false);
                return true;
            }
            g gVar = new g(this, future);
            if (f116950h.b(this, null, gVar)) {
                try {
                    future.addListener(gVar, m0.INSTANCE);
                } catch (Throwable th2) {
                    try {
                        dVar = new d(th2);
                    } catch (Error | Exception unused) {
                        dVar = d.f116959b;
                    }
                    f116950h.b(this, gVar, dVar);
                }
                return true;
            }
            obj = this.f116952b;
        }
        if (obj instanceof c) {
            future.cancel(((c) obj).f116957a);
        }
        return false;
    }

    public final boolean G() {
        Object obj = this.f116952b;
        return (obj instanceof c) && ((c) obj).f116957a;
    }

    @Override // nj.t1
    public void addListener(Runnable listener, Executor executor) {
        e eVar;
        zi.l0.F(listener, "Runnable was null.");
        zi.l0.F(executor, "Executor was null.");
        if (!isDone() && (eVar = this.f116953c) != e.f116961d) {
            e eVar2 = new e(listener, executor);
            do {
                eVar2.f116964c = eVar;
                if (f116950h.a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f116953c;
                }
            } while (eVar != e.f116961d);
        }
        u(listener, executor);
    }

    @Override // oj.a
    @zq.a
    public final Throwable c() {
        if (!(this instanceof i)) {
            return null;
        }
        Object obj = this.f116952b;
        if (obj instanceof d) {
            return ((d) obj).f116960a;
        }
        return null;
    }

    @Override // java.util.concurrent.Future
    @qj.a
    public boolean cancel(boolean mayInterruptIfRunning) {
        c cVar;
        Object obj = this.f116952b;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        if (f116947e) {
            cVar = new c(mayInterruptIfRunning, new CancellationException("Future.cancel() was called."));
        } else {
            cVar = mayInterruptIfRunning ? c.f116955c : c.f116956d;
            Objects.requireNonNull(cVar);
        }
        f<V> fVar = this;
        boolean z10 = false;
        while (true) {
            if (f116950h.b(fVar, obj, cVar)) {
                t(fVar, mayInterruptIfRunning);
                if (obj instanceof g) {
                    t1<? extends V> t1Var = ((g) obj).f116971c;
                    if (t1Var instanceof i) {
                        fVar = (f) t1Var;
                        obj = fVar.f116952b;
                        if ((obj == null) | (obj instanceof g)) {
                            z10 = true;
                        }
                    } else {
                        t1Var.cancel(mayInterruptIfRunning);
                    }
                }
                return true;
            }
            obj = fVar.f116952b;
            if (!(obj instanceof g)) {
                return z10;
            }
        }
    }

    @Override // java.util.concurrent.Future
    @f2
    @qj.a
    public V get(long timeout, TimeUnit unit) throws ExecutionException, InterruptedException, TimeoutException {
        long nanos = unit.toNanos(timeout);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f116952b;
        if ((obj != null) && (!(obj instanceof g))) {
            return v(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            l lVar = this.f116954d;
            if (lVar != l.f116978c) {
                l lVar2 = new l();
                while (true) {
                    lVar2.a(lVar);
                    if (f116950h.c(this, lVar, lVar2)) {
                        do {
                            e2.a(this, nanos);
                            if (Thread.interrupted()) {
                                C(lVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f116952b;
                            if ((obj2 != null) && (!(obj2 instanceof g))) {
                                return v(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        C(lVar2);
                        break;
                    }
                    lVar = this.f116954d;
                    if (lVar == l.f116978c) {
                    }
                }
            }
            Object obj3 = this.f116952b;
            Objects.requireNonNull(obj3);
            return v(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.f116952b;
            if ((obj4 != null) && (!(obj4 instanceof g))) {
                return v(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = unit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String str = "Waited " + timeout + " " + unit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String str2 = str + " (plus ";
            long j10 = -nanos;
            long jConvert = unit.convert(j10, TimeUnit.NANOSECONDS);
            long nanos2 = j10 - unit.toNanos(jConvert);
            boolean z10 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String str3 = str2 + jConvert + " " + lowerCase;
                if (z10) {
                    str3 = str3 + ",";
                }
                str2 = str3 + " ";
            }
            if (z10) {
                str2 = str2 + nanos2 + " nanoseconds ";
            }
            str = str2 + "delay)";
        }
        if (isDone()) {
            throw new TimeoutException(str + " but future completed as timeout expired");
        }
        throw new TimeoutException(str + " for " + string);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f116952b instanceof c;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.f116952b;
        return (!(obj instanceof g)) & (obj != null);
    }

    public final void m(StringBuilder builder) {
        try {
            Object objX = x(this);
            builder.append("SUCCESS, result=[");
            p(builder, objX);
            builder.append(C4235d4.j.f61462e);
        } catch (CancellationException unused) {
            builder.append("CANCELLED");
        } catch (ExecutionException e10) {
            builder.append("FAILURE, cause=[");
            builder.append(e10.getCause());
            builder.append(C4235d4.j.f61462e);
        } catch (Exception e11) {
            builder.append("UNKNOWN, cause=[");
            builder.append(e11.getClass());
            builder.append(" thrown from get()]");
        }
    }

    public final void n(StringBuilder builder) {
        String strC;
        int length = builder.length();
        builder.append("PENDING");
        Object obj = this.f116952b;
        if (obj instanceof g) {
            builder.append(", setFuture=[");
            q(builder, ((g) obj).f116971c);
            builder.append(C4235d4.j.f61462e);
        } else {
            try {
                strC = zi.t0.c(A());
            } catch (Exception | StackOverflowError e10) {
                strC = "Exception thrown from implementation: " + e10.getClass();
            }
            if (strC != null) {
                builder.append(", info=[");
                builder.append(strC);
                builder.append(C4235d4.j.f61462e);
            }
        }
        if (isDone()) {
            builder.delete(length, builder.length());
            m(builder);
        }
    }

    public final void p(StringBuilder builder, @zq.a Object o10) {
        if (o10 == null) {
            builder.append(fw.b.f85379f);
        } else {
            if (o10 == this) {
                builder.append("this future");
                return;
            }
            builder.append(o10.getClass().getName());
            builder.append(to.c.phraseDel);
            builder.append(Integer.toHexString(System.identityHashCode(o10)));
        }
    }

    public final void q(StringBuilder builder, @zq.a Object o10) {
        try {
            if (o10 == this) {
                builder.append("this future");
            } else {
                builder.append(o10);
            }
        } catch (Exception e10) {
            e = e10;
            builder.append("Exception thrown from implementation: ");
            builder.append(e.getClass());
        } catch (StackOverflowError e11) {
            e = e11;
            builder.append("Exception thrown from implementation: ");
            builder.append(e.getClass());
        }
    }

    @zq.a
    public final e s(@zq.a e onto) {
        e eVar = onto;
        e eVarD = f116950h.d(this, e.f116961d);
        while (eVarD != null) {
            e eVar2 = eVarD.f116964c;
            eVarD.f116964c = eVar;
            eVar = eVarD;
            eVarD = eVar2;
        }
        return eVar;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb2.append(getClass().getSimpleName());
        } else {
            sb2.append(getClass().getName());
        }
        sb2.append('@');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[status=");
        if (isCancelled()) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            m(sb2);
        } else {
            n(sb2);
        }
        sb2.append(C4235d4.j.f61462e);
        return sb2.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @f2
    public final V v(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            throw r("Task was cancelled.", ((c) obj).f116958b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f116960a);
        }
        return obj == f116951i ? (V) d2.b() : obj;
    }

    public final void z(@zq.a Future<?> related) {
        if ((related != null) && isCancelled()) {
            related.cancel(G());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final e f116961d = new e();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @zq.a
        public final Runnable f116962a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @zq.a
        public final Executor f116963b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @zq.a
        public e f116964c;

        public e(Runnable task, Executor executor) {
            this.f116962a = task;
            this.f116963b = executor;
        }

        public e() {
            this.f116962a = null;
            this.f116963b = null;
        }
    }

    @qj.g
    public void o() {
    }

    public void y() {
    }

    @Override // java.util.concurrent.Future
    @qj.a
    @f2
    public V get() throws ExecutionException, InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f116952b;
            if ((obj2 != null) & (!(obj2 instanceof g))) {
                return v(obj2);
            }
            l lVar = this.f116954d;
            if (lVar != l.f116978c) {
                l lVar2 = new l();
                do {
                    lVar2.a(lVar);
                    if (f116950h.c(this, lVar, lVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f116952b;
                            } else {
                                C(lVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return v(obj);
                    }
                    lVar = this.f116954d;
                } while (lVar != l.f116978c);
            }
            Object obj3 = this.f116952b;
            Objects.requireNonNull(obj3);
            return v(obj3);
        }
        throw new InterruptedException();
    }
}
