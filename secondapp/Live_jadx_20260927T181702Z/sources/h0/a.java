package h0;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.C4235d4;
import java.util.Locale;
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
import k.y0;
import nj.t1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@y0({y0.a.LIBRARY_GROUP_PREFIX})
public abstract class a<V> implements t1<V> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f87543e = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Logger f87544f = Logger.getLogger(a.class.getName());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f87545g = 1000;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f87546h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Object f87547i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public volatile Object f87548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public volatile e f87549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public volatile i f87550d;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class b {
        public b() {
        }

        public abstract boolean a(a<?> aVar, e eVar, e eVar2);

        public abstract boolean b(a<?> aVar, Object obj, Object obj2);

        public abstract boolean c(a<?> aVar, i iVar, i iVar2);

        public abstract void d(i iVar, i iVar2);

        public abstract void e(i iVar, Thread thread);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f87551c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f87552d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f87553a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final Throwable f87554b;

        static {
            if (a.f87543e) {
                f87552d = null;
                f87551c = null;
            } else {
                f87552d = new c(false, null);
                f87551c = new c(true, null);
            }
        }

        public c(boolean z10, @Nullable Throwable th2) {
            this.f87553a = z10;
            this.f87554b = th2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f87555b = new d(new C0864a("Failure occurred while trying to finish a future."));

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f87556a;

        /* JADX INFO: renamed from: h0.a$d$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class C0864a extends Throwable {
            public C0864a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public d(Throwable th2) {
            this.f87556a = (Throwable) a.d(th2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final e f87557d = new e(null, null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Runnable f87558a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Executor f87559b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public e f87560c;

        public e(Runnable runnable, Executor executor) {
            this.f87558a = runnable;
            this.f87559b = executor;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class f extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<i, Thread> f87561a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<i, i> f87562b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<a, i> f87563c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<a, e> f87564d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<a, Object> f87565e;

        public f(AtomicReferenceFieldUpdater<i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<i, i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a, i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f87561a = atomicReferenceFieldUpdater;
            this.f87562b = atomicReferenceFieldUpdater2;
            this.f87563c = atomicReferenceFieldUpdater3;
            this.f87564d = atomicReferenceFieldUpdater4;
            this.f87565e = atomicReferenceFieldUpdater5;
        }

        @Override // h0.a.b
        public boolean a(a<?> aVar, e eVar, e eVar2) {
            return h0.b.a(this.f87564d, aVar, eVar, eVar2);
        }

        @Override // h0.a.b
        public boolean b(a<?> aVar, Object obj, Object obj2) {
            return h0.b.a(this.f87565e, aVar, obj, obj2);
        }

        @Override // h0.a.b
        public boolean c(a<?> aVar, i iVar, i iVar2) {
            return h0.b.a(this.f87563c, aVar, iVar, iVar2);
        }

        @Override // h0.a.b
        public void d(i iVar, i iVar2) {
            this.f87562b.lazySet(iVar, iVar2);
        }

        @Override // h0.a.b
        public void e(i iVar, Thread thread) {
            this.f87561a.lazySet(iVar, thread);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class g<V> implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a<V> f87566b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final t1<? extends V> f87567c;

        public g(a<V> aVar, t1<? extends V> t1Var) {
            this.f87566b = aVar;
            this.f87567c = t1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f87566b.f87548b != this) {
                return;
            }
            if (a.f87546h.b(this.f87566b, this, a.i(this.f87567c))) {
                a.f(this.f87566b);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class h extends b {
        public h() {
            super();
        }

        @Override // h0.a.b
        public boolean a(a<?> aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f87549c != eVar) {
                        return false;
                    }
                    aVar.f87549c = eVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // h0.a.b
        public boolean b(a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                try {
                    if (aVar.f87548b != obj) {
                        return false;
                    }
                    aVar.f87548b = obj2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // h0.a.b
        public boolean c(a<?> aVar, i iVar, i iVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f87550d != iVar) {
                        return false;
                    }
                    aVar.f87550d = iVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // h0.a.b
        public void d(i iVar, i iVar2) {
            iVar.f87570b = iVar2;
        }

        @Override // h0.a.b
        public void e(i iVar, Thread thread) {
            iVar.f87569a = thread;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class i {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final i f87568c = new i(false);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public volatile Thread f87569a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public volatile i f87570b;

        public i(boolean z10) {
        }

        public void a(i iVar) {
            a.f87546h.d(this, iVar);
        }

        public void b() {
            Thread thread = this.f87569a;
            if (thread != null) {
                this.f87569a = null;
                LockSupport.unpark(thread);
            }
        }

        public i() {
            a.f87546h.e(this, Thread.currentThread());
        }
    }

    static {
        b hVar;
        try {
            hVar = new f(AtomicReferenceFieldUpdater.newUpdater(i.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(i.class, i.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, i.class, "d"), AtomicReferenceFieldUpdater.newUpdater(a.class, e.class, "c"), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "b"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            hVar = new h();
        }
        f87546h = hVar;
        if (th != null) {
            f87544f.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f87547i = new Object();
    }

    private void a(StringBuilder sb2) {
        try {
            Object objJ = j(this);
            sb2.append("SUCCESS, result=[");
            sb2.append(u(objJ));
            sb2.append(C4235d4.j.f61462e);
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (RuntimeException e10) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e10.getClass());
            sb2.append(" thrown from get()]");
        } catch (ExecutionException e11) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e11.getCause());
            sb2.append(C4235d4.j.f61462e);
        }
    }

    private static CancellationException c(@Nullable String str, @Nullable Throwable th2) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th2);
        return cancellationException;
    }

    @NonNull
    public static <T> T d(@Nullable T t10) {
        t10.getClass();
        return t10;
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
    public static void f(a<?> aVar) {
        e eVar = null;
        while (true) {
            aVar.n();
            aVar.b();
            e eVarE = aVar.e(eVar);
            while (eVarE != null) {
                eVar = eVarE.f87560c;
                Runnable runnable = eVarE.f87558a;
                if (runnable instanceof g) {
                    g gVar = (g) runnable;
                    aVar = gVar.f87566b;
                    if (aVar.f87548b == gVar) {
                        if (f87546h.b(aVar, gVar, i(gVar.f87567c))) {
                        }
                    } else {
                        continue;
                    }
                } else {
                    g(runnable, eVarE.f87559b);
                }
                eVarE = eVar;
            }
            return;
        }
    }

    private static void g(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f87544f.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private V h(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            throw c("Task was cancelled.", ((c) obj).f87554b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f87556a);
        }
        if (obj == f87547i) {
            return null;
        }
        return obj;
    }

    public static Object i(t1<?> t1Var) {
        if (t1Var instanceof a) {
            Object obj = ((a) t1Var).f87548b;
            if (!(obj instanceof c)) {
                return obj;
            }
            c cVar = (c) obj;
            if (cVar.f87553a) {
                return cVar.f87554b != null ? new c(false, cVar.f87554b) : c.f87552d;
            }
            return obj;
        }
        boolean zIsCancelled = t1Var.isCancelled();
        if ((!f87543e) && zIsCancelled) {
            return c.f87552d;
        }
        try {
            Object objJ = j(t1Var);
            return objJ == null ? f87547i : objJ;
        } catch (CancellationException e10) {
            if (zIsCancelled) {
                return new c(false, e10);
            }
            return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + t1Var, e10));
        } catch (ExecutionException e11) {
            return new d(e11.getCause());
        } catch (Throwable th2) {
            return new d(th2);
        }
    }

    @y0({y0.a.LIBRARY_GROUP})
    public static <V> V j(Future<V> future) throws ExecutionException {
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

    private void n() {
        i iVar;
        do {
            iVar = this.f87550d;
        } while (!f87546h.c(this, iVar, i.f87568c));
        while (iVar != null) {
            iVar.b();
            iVar = iVar.f87570b;
        }
    }

    @Override // nj.t1
    public final void addListener(Runnable runnable, Executor executor) {
        d(runnable);
        d(executor);
        e eVar = this.f87549c;
        if (eVar != e.f87557d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f87560c = eVar;
                if (f87546h.a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f87549c;
                }
            } while (eVar != e.f87557d);
        }
        g(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        c cVar;
        Object obj = this.f87548b;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        if (f87543e) {
            cVar = new c(z10, new CancellationException("Future.cancel() was called."));
        } else {
            cVar = z10 ? c.f87551c : c.f87552d;
        }
        a<V> aVar = this;
        boolean z11 = false;
        while (true) {
            if (f87546h.b(aVar, obj, cVar)) {
                if (z10) {
                    aVar.k();
                }
                f(aVar);
                if (obj instanceof g) {
                    t1<? extends V> t1Var = ((g) obj).f87567c;
                    if (t1Var instanceof a) {
                        aVar = (a) t1Var;
                        obj = aVar.f87548b;
                        if ((obj == null) | (obj instanceof g)) {
                            z11 = true;
                        }
                    } else {
                        t1Var.cancel(z10);
                    }
                }
                return true;
            }
            obj = aVar.f87548b;
            if (!(obj instanceof g)) {
                return z11;
            }
        }
    }

    public final e e(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f87549c;
        } while (!f87546h.a(this, eVar2, e.f87557d));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.f87560c;
            eVar4.f87560c = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    @Override // java.util.concurrent.Future
    public final V get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j10);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f87548b;
        if ((obj != null) && (!(obj instanceof g))) {
            return h(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            i iVar = this.f87550d;
            if (iVar != i.f87568c) {
                i iVar2 = new i();
                while (true) {
                    iVar2.a(iVar);
                    if (f87546h.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                o(iVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f87548b;
                            if ((obj2 != null) && (!(obj2 instanceof g))) {
                                return h(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        o(iVar2);
                        break;
                    }
                    iVar = this.f87550d;
                    if (iVar == i.f87568c) {
                    }
                }
            }
            return h(this.f87548b);
        }
        while (nanos > 0) {
            Object obj3 = this.f87548b;
            if ((obj3 != null) && (!(obj3 instanceof g))) {
                return h(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String str = "Waited " + j10 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String str2 = str + " (plus ";
            long j11 = -nanos;
            long jConvert = timeUnit.convert(j11, TimeUnit.NANOSECONDS);
            long nanos2 = j11 - timeUnit.toNanos(jConvert);
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
    public final boolean isCancelled() {
        return this.f87548b instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.f87548b;
        return (!(obj instanceof g)) & (obj != null);
    }

    public final void l(@Nullable Future<?> future) {
        if ((future != null) && isCancelled()) {
            future.cancel(v());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public String m() {
        Object obj = this.f87548b;
        if (obj instanceof g) {
            return "setFuture=[" + u(((g) obj).f87567c) + C4235d4.j.f61462e;
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void o(i iVar) {
        iVar.f87569a = null;
        while (true) {
            i iVar2 = this.f87550d;
            if (iVar2 == i.f87568c) {
                return;
            }
            i iVar3 = null;
            while (iVar2 != null) {
                i iVar4 = iVar2.f87570b;
                if (iVar2.f87569a != null) {
                    iVar3 = iVar2;
                } else if (iVar3 != null) {
                    iVar3.f87570b = iVar4;
                    if (iVar3.f87569a == null) {
                    }
                } else if (!f87546h.c(this, iVar2, iVar4)) {
                }
                iVar2 = iVar4;
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
    public boolean q(@Nullable V v10) {
        if (v10 == null) {
            v10 = (V) f87547i;
        }
        if (!f87546h.b(this, null, v10)) {
            return false;
        }
        f(this);
        return true;
    }

    public boolean s(Throwable th2) {
        if (!f87546h.b(this, null, new d((Throwable) d(th2)))) {
            return false;
        }
        f(this);
        return true;
    }

    public boolean t(t1<? extends V> t1Var) {
        d dVar;
        d(t1Var);
        Object obj = this.f87548b;
        if (obj == null) {
            if (t1Var.isDone()) {
                if (!f87546h.b(this, null, i(t1Var))) {
                    return false;
                }
                f(this);
                return true;
            }
            g gVar = new g(this, t1Var);
            if (f87546h.b(this, null, gVar)) {
                try {
                    t1Var.addListener(gVar, h0.d.INSTANCE);
                } catch (Throwable th2) {
                    try {
                        dVar = new d(th2);
                    } catch (Throwable unused) {
                        dVar = d.f87555b;
                    }
                    f87546h.b(this, gVar, dVar);
                }
                return true;
            }
            obj = this.f87548b;
        }
        if (obj instanceof c) {
            t1Var.cancel(((c) obj).f87553a);
        }
        return false;
    }

    public String toString() {
        String strM;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (isCancelled()) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            a(sb2);
        } else {
            try {
                strM = m();
            } catch (RuntimeException e10) {
                strM = "Exception thrown from implementation: " + e10.getClass();
            }
            if (strM != null && !strM.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(strM);
                sb2.append(C4235d4.j.f61462e);
            } else if (isDone()) {
                a(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append(C4235d4.j.f61462e);
        return sb2.toString();
    }

    public final String u(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    public final boolean v() {
        Object obj = this.f87548b;
        return (obj instanceof c) && ((c) obj).f87553a;
    }

    public void b() {
    }

    public void k() {
    }

    @Override // java.util.concurrent.Future
    public final V get() throws ExecutionException, InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f87548b;
            if ((obj2 != null) & (!(obj2 instanceof g))) {
                return h(obj2);
            }
            i iVar = this.f87550d;
            if (iVar != i.f87568c) {
                i iVar2 = new i();
                do {
                    iVar2.a(iVar);
                    if (f87546h.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f87548b;
                            } else {
                                o(iVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return h(obj);
                    }
                    iVar = this.f87550d;
                } while (iVar != i.f87568c);
            }
            return h(this.f87548b);
        }
        throw new InterruptedException();
    }
}
