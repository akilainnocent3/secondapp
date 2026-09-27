package qa;

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
/* JADX INFO: loaded from: classes2.dex */
@y0({y0.a.LIBRARY_GROUP})
public abstract class a<V> implements t1<V> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f122048e = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Logger f122049f = Logger.getLogger(a.class.getName());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f122050g = 1000;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f122051h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Object f122052i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public volatile Object f122053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public volatile e f122054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public volatile i f122055d;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class b {
        public b() {
        }

        public abstract boolean a(a<?> future, e expect, e update);

        public abstract boolean b(a<?> future, Object expect, Object update);

        public abstract boolean c(a<?> future, i expect, i update);

        public abstract void d(i waiter, i newValue);

        public abstract void e(i waiter, Thread newValue);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f122056c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f122057d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f122058a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final Throwable f122059b;

        static {
            if (a.f122048e) {
                f122057d = null;
                f122056c = null;
            } else {
                f122057d = new c(false, null);
                f122056c = new c(true, null);
            }
        }

        public c(boolean wasInterrupted, @Nullable Throwable cause) {
            this.f122058a = wasInterrupted;
            this.f122059b = cause;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f122060b = new d(new C1179a("Failure occurred while trying to finish a future."));

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f122061a;

        /* JADX INFO: renamed from: qa.a$d$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class C1179a extends Throwable {
            public C1179a(String message) {
                super(message);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public d(Throwable exception) {
            this.f122061a = (Throwable) a.d(exception);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final e f122062d = new e(null, null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Runnable f122063a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Executor f122064b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public e f122065c;

        public e(Runnable task, Executor executor) {
            this.f122063a = task;
            this.f122064b = executor;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class f extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<i, Thread> f122066a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<i, i> f122067b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<a, i> f122068c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<a, e> f122069d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<a, Object> f122070e;

        public f(AtomicReferenceFieldUpdater<i, Thread> waiterThreadUpdater, AtomicReferenceFieldUpdater<i, i> waiterNextUpdater, AtomicReferenceFieldUpdater<a, i> waitersUpdater, AtomicReferenceFieldUpdater<a, e> listenersUpdater, AtomicReferenceFieldUpdater<a, Object> valueUpdater) {
            super();
            this.f122066a = waiterThreadUpdater;
            this.f122067b = waiterNextUpdater;
            this.f122068c = waitersUpdater;
            this.f122069d = listenersUpdater;
            this.f122070e = valueUpdater;
        }

        @Override // qa.a.b
        public boolean a(a<?> future, e expect, e update) {
            return h0.b.a(this.f122069d, future, expect, update);
        }

        @Override // qa.a.b
        public boolean b(a<?> future, Object expect, Object update) {
            return h0.b.a(this.f122070e, future, expect, update);
        }

        @Override // qa.a.b
        public boolean c(a<?> future, i expect, i update) {
            return h0.b.a(this.f122068c, future, expect, update);
        }

        @Override // qa.a.b
        public void d(i waiter, i newValue) {
            this.f122067b.lazySet(waiter, newValue);
        }

        @Override // qa.a.b
        public void e(i waiter, Thread newValue) {
            this.f122066a.lazySet(waiter, newValue);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class g<V> implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a<V> f122071b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final t1<? extends V> f122072c;

        public g(a<V> owner, t1<? extends V> future) {
            this.f122071b = owner;
            this.f122072c = future;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f122071b.f122053b != this) {
                return;
            }
            if (a.f122051h.b(this.f122071b, this, a.i(this.f122072c))) {
                a.f(this.f122071b);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class h extends b {
        public h() {
            super();
        }

        @Override // qa.a.b
        public boolean a(a<?> future, e expect, e update) {
            synchronized (future) {
                try {
                    if (future.f122054c != expect) {
                        return false;
                    }
                    future.f122054c = update;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // qa.a.b
        public boolean b(a<?> future, Object expect, Object update) {
            synchronized (future) {
                try {
                    if (future.f122053b != expect) {
                        return false;
                    }
                    future.f122053b = update;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // qa.a.b
        public boolean c(a<?> future, i expect, i update) {
            synchronized (future) {
                try {
                    if (future.f122055d != expect) {
                        return false;
                    }
                    future.f122055d = update;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // qa.a.b
        public void d(i waiter, i newValue) {
            waiter.f122075b = newValue;
        }

        @Override // qa.a.b
        public void e(i waiter, Thread newValue) {
            waiter.f122074a = newValue;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class i {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final i f122073c = new i(false);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public volatile Thread f122074a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public volatile i f122075b;

        public i(boolean unused) {
        }

        public void a(i next) {
            a.f122051h.d(this, next);
        }

        public void b() {
            Thread thread = this.f122074a;
            if (thread != null) {
                this.f122074a = null;
                LockSupport.unpark(thread);
            }
        }

        public i() {
            a.f122051h.e(this, Thread.currentThread());
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
        f122051h = hVar;
        if (th != null) {
            f122049f.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f122052i = new Object();
    }

    private void a(StringBuilder builder) {
        try {
            Object objJ = j(this);
            builder.append("SUCCESS, result=[");
            builder.append(s(objJ));
            builder.append(C4235d4.j.f61462e);
        } catch (CancellationException unused) {
            builder.append("CANCELLED");
        } catch (RuntimeException e10) {
            builder.append("UNKNOWN, cause=[");
            builder.append(e10.getClass());
            builder.append(" thrown from get()]");
        } catch (ExecutionException e11) {
            builder.append("FAILURE, cause=[");
            builder.append(e11.getCause());
            builder.append(C4235d4.j.f61462e);
        }
    }

    private static CancellationException c(@Nullable String message, @Nullable Throwable cause) {
        CancellationException cancellationException = new CancellationException(message);
        cancellationException.initCause(cause);
        return cancellationException;
    }

    @NonNull
    public static <T> T d(@Nullable T reference) {
        reference.getClass();
        return reference;
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
                eVar = eVarE.f122065c;
                Runnable runnable = eVarE.f122063a;
                if (runnable instanceof g) {
                    g gVar = (g) runnable;
                    aVar = gVar.f122071b;
                    if (aVar.f122053b == gVar) {
                        if (f122051h.b(aVar, gVar, i(gVar.f122072c))) {
                        }
                    } else {
                        continue;
                    }
                } else {
                    g(runnable, eVarE.f122064b);
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
            f122049f.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private V h(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            throw c("Task was cancelled.", ((c) obj).f122059b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f122061a);
        }
        if (obj == f122052i) {
            return null;
        }
        return obj;
    }

    public static Object i(t1<?> future) {
        if (future instanceof a) {
            Object obj = ((a) future).f122053b;
            if (!(obj instanceof c)) {
                return obj;
            }
            c cVar = (c) obj;
            if (cVar.f122058a) {
                return cVar.f122059b != null ? new c(false, cVar.f122059b) : c.f122057d;
            }
            return obj;
        }
        boolean zIsCancelled = future.isCancelled();
        if ((!f122048e) && zIsCancelled) {
            return c.f122057d;
        }
        try {
            Object objJ = j(future);
            return objJ == null ? f122052i : objJ;
        } catch (CancellationException e10) {
            if (zIsCancelled) {
                return new c(false, e10);
            }
            return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + future, e10));
        } catch (ExecutionException e11) {
            return new d(e11.getCause());
        } catch (Throwable th2) {
            return new d(th2);
        }
    }

    private static <V> V j(Future<V> future) throws ExecutionException {
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
            iVar = this.f122055d;
        } while (!f122051h.c(this, iVar, i.f122073c));
        while (iVar != null) {
            iVar.b();
            iVar = iVar.f122075b;
        }
    }

    private String s(Object o10) {
        return o10 == this ? "this future" : String.valueOf(o10);
    }

    @Override // nj.t1
    public final void addListener(Runnable listener, Executor executor) {
        d(listener);
        d(executor);
        e eVar = this.f122054c;
        if (eVar != e.f122062d) {
            e eVar2 = new e(listener, executor);
            do {
                eVar2.f122065c = eVar;
                if (f122051h.a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f122054c;
                }
            } while (eVar != e.f122062d);
        }
        g(listener, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean mayInterruptIfRunning) {
        c cVar;
        Object obj = this.f122053b;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        if (f122048e) {
            cVar = new c(mayInterruptIfRunning, new CancellationException("Future.cancel() was called."));
        } else {
            cVar = mayInterruptIfRunning ? c.f122056c : c.f122057d;
        }
        a<V> aVar = this;
        boolean z10 = false;
        while (true) {
            if (f122051h.b(aVar, obj, cVar)) {
                if (mayInterruptIfRunning) {
                    aVar.k();
                }
                f(aVar);
                if (obj instanceof g) {
                    t1<? extends V> t1Var = ((g) obj).f122072c;
                    if (t1Var instanceof a) {
                        aVar = (a) t1Var;
                        obj = aVar.f122053b;
                        if ((obj == null) | (obj instanceof g)) {
                            z10 = true;
                        }
                    } else {
                        t1Var.cancel(mayInterruptIfRunning);
                    }
                }
                return true;
            }
            obj = aVar.f122053b;
            if (!(obj instanceof g)) {
                return z10;
            }
        }
    }

    public final e e(e onto) {
        e eVar;
        do {
            eVar = this.f122054c;
        } while (!f122051h.a(this, eVar, e.f122062d));
        e eVar2 = onto;
        e eVar3 = eVar;
        while (eVar3 != null) {
            e eVar4 = eVar3.f122065c;
            eVar3.f122065c = eVar2;
            eVar2 = eVar3;
            eVar3 = eVar4;
        }
        return eVar2;
    }

    @Override // java.util.concurrent.Future
    public final V get(long timeout, TimeUnit unit) throws ExecutionException, InterruptedException, TimeoutException {
        long nanos = unit.toNanos(timeout);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f122053b;
        if ((obj != null) && (!(obj instanceof g))) {
            return h(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            i iVar = this.f122055d;
            if (iVar != i.f122073c) {
                i iVar2 = new i();
                while (true) {
                    iVar2.a(iVar);
                    if (f122051h.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                o(iVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f122053b;
                            if ((obj2 != null) && (!(obj2 instanceof g))) {
                                return h(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        o(iVar2);
                        break;
                    }
                    iVar = this.f122055d;
                    if (iVar == i.f122073c) {
                    }
                }
            }
            return h(this.f122053b);
        }
        while (nanos > 0) {
            Object obj3 = this.f122053b;
            if ((obj3 != null) && (!(obj3 instanceof g))) {
                return h(obj3);
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
    public final boolean isCancelled() {
        return this.f122053b instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.f122053b;
        return (!(obj instanceof g)) & (obj != null);
    }

    public final void l(@Nullable Future<?> related) {
        if ((related != null) && isCancelled()) {
            related.cancel(t());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public String m() {
        Object obj = this.f122053b;
        if (obj instanceof g) {
            return "setFuture=[" + s(((g) obj).f122072c) + C4235d4.j.f61462e;
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void o(i node) {
        node.f122074a = null;
        while (true) {
            i iVar = this.f122055d;
            if (iVar == i.f122073c) {
                return;
            }
            i iVar2 = null;
            while (iVar != null) {
                i iVar3 = iVar.f122075b;
                if (iVar.f122074a != null) {
                    iVar2 = iVar;
                } else if (iVar2 != null) {
                    iVar2.f122075b = iVar3;
                    if (iVar2.f122074a == null) {
                    }
                } else if (!f122051h.c(this, iVar, iVar3)) {
                }
                iVar = iVar3;
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
    public boolean p(@Nullable V v10) {
        if (v10 == null) {
            v10 = (V) f122052i;
        }
        if (!f122051h.b(this, null, v10)) {
            return false;
        }
        f(this);
        return true;
    }

    public boolean q(Throwable throwable) {
        if (!f122051h.b(this, null, new d((Throwable) d(throwable)))) {
            return false;
        }
        f(this);
        return true;
    }

    public boolean r(t1<? extends V> future) {
        d dVar;
        d(future);
        Object obj = this.f122053b;
        if (obj == null) {
            if (future.isDone()) {
                if (!f122051h.b(this, null, i(future))) {
                    return false;
                }
                f(this);
                return true;
            }
            g gVar = new g(this, future);
            if (f122051h.b(this, null, gVar)) {
                try {
                    future.addListener(gVar, qa.b.INSTANCE);
                } catch (Throwable th2) {
                    try {
                        dVar = new d(th2);
                    } catch (Throwable unused) {
                        dVar = d.f122060b;
                    }
                    f122051h.b(this, gVar, dVar);
                }
                return true;
            }
            obj = this.f122053b;
        }
        if (obj instanceof c) {
            future.cancel(((c) obj).f122058a);
        }
        return false;
    }

    public final boolean t() {
        Object obj = this.f122053b;
        return (obj instanceof c) && ((c) obj).f122058a;
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

    public void b() {
    }

    public void k() {
    }

    @Override // java.util.concurrent.Future
    public final V get() throws ExecutionException, InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f122053b;
            if ((obj2 != null) & (!(obj2 instanceof g))) {
                return h(obj2);
            }
            i iVar = this.f122055d;
            if (iVar != i.f122073c) {
                i iVar2 = new i();
                do {
                    iVar2.a(iVar);
                    if (f122051h.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f122053b;
                            } else {
                                o(iVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return h(obj);
                    }
                    iVar = this.f122055d;
                } while (iVar != i.f122073c);
            }
            return h(this.f122053b);
        }
        throw new InterruptedException();
    }
}
