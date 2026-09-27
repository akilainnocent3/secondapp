package fx;

import dr.w2;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.s1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
@s1({"SMAP\nAsyncTimeout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AsyncTimeout.kt\nokio/AsyncTimeout\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,382:1\n1#2:383\n*E\n"})
public class j extends g1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @oy.l
    public static final a f85620j = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @oy.l
    public static final ReentrantLock f85621k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @oy.l
    public static final Condition f85622l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f85623m = 65536;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final long f85624n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final long f85625o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f85626p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f85627q = 1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f85628r = 2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f85629s = 3;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @oy.m
    public static j f85630t;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f85631g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @oy.m
    public j f85632h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f85633i;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
            this();
        }

        @oy.m
        public final j c() throws InterruptedException {
            j jVar = j.f85630t;
            kotlin.jvm.internal.m0.m(jVar);
            j jVar2 = jVar.f85632h;
            if (jVar2 == null) {
                long jNanoTime = System.nanoTime();
                d().await(j.f85624n, TimeUnit.MILLISECONDS);
                j jVar3 = j.f85630t;
                kotlin.jvm.internal.m0.m(jVar3);
                if (jVar3.f85632h != null || System.nanoTime() - jNanoTime < j.f85625o) {
                    return null;
                }
                return j.f85630t;
            }
            long jD = jVar2.D(System.nanoTime());
            if (jD > 0) {
                d().await(jD, TimeUnit.NANOSECONDS);
                return null;
            }
            j jVar4 = j.f85630t;
            kotlin.jvm.internal.m0.m(jVar4);
            jVar4.f85632h = jVar2.f85632h;
            jVar2.f85632h = null;
            jVar2.f85631g = 2;
            return jVar2;
        }

        @oy.l
        public final Condition d() {
            return j.f85622l;
        }

        @oy.l
        public final ReentrantLock e() {
            return j.f85621k;
        }

        public final void f(j jVar, long j10, boolean z10) {
            if (j.f85630t == null) {
                j.f85630t = new j();
                new b().start();
            }
            long jNanoTime = System.nanoTime();
            if (j10 != 0 && z10) {
                jVar.f85633i = Math.min(j10, jVar.f() - jNanoTime) + jNanoTime;
            } else if (j10 != 0) {
                jVar.f85633i = j10 + jNanoTime;
            } else {
                if (!z10) {
                    throw new AssertionError();
                }
                jVar.f85633i = jVar.f();
            }
            long jD = jVar.D(jNanoTime);
            j jVar2 = j.f85630t;
            kotlin.jvm.internal.m0.m(jVar2);
            while (jVar2.f85632h != null) {
                j jVar3 = jVar2.f85632h;
                kotlin.jvm.internal.m0.m(jVar3);
                if (jD < jVar3.D(jNanoTime)) {
                    break;
                }
                jVar2 = jVar2.f85632h;
                kotlin.jvm.internal.m0.m(jVar2);
            }
            jVar.f85632h = jVar2.f85632h;
            jVar2.f85632h = jVar;
            if (jVar2 == j.f85630t) {
                d().signal();
            }
        }

        public final void g(j jVar) {
            for (j jVar2 = j.f85630t; jVar2 != null; jVar2 = jVar2.f85632h) {
                if (jVar2.f85632h == jVar) {
                    jVar2.f85632h = jVar.f85632h;
                    jVar.f85632h = null;
                    return;
                }
            }
            throw new IllegalStateException("node was not found in the queue");
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends Thread {
        public b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (true) {
                try {
                    ReentrantLock reentrantLockE = j.f85620j.e();
                    reentrantLockE.lock();
                    try {
                        j jVarC = j.f85620j.c();
                        if (jVarC == j.f85630t) {
                            a unused = j.f85620j;
                            j.f85630t = null;
                            reentrantLockE.unlock();
                            return;
                        } else {
                            w2 w2Var = w2.f79517a;
                            reentrantLockE.unlock();
                            if (jVarC != null) {
                                jVarC.G();
                            }
                        }
                    } catch (Throwable th2) {
                        reentrantLockE.unlock();
                        throw th2;
                    }
                } catch (InterruptedException unused2) {
                    continue;
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nAsyncTimeout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AsyncTimeout.kt\nokio/AsyncTimeout$sink$1\n+ 2 AsyncTimeout.kt\nokio/AsyncTimeout\n*L\n1#1,382:1\n171#2,11:383\n171#2,11:394\n171#2,11:405\n*S KotlinDebug\n*F\n+ 1 AsyncTimeout.kt\nokio/AsyncTimeout$sink$1\n*L\n127#1:383,11\n133#1:394,11\n137#1:405,11\n*E\n"})
    public static final class c implements b1 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b1 f85635c;

        public c(b1 b1Var) {
            this.f85635c = b1Var;
        }

        @Override // fx.b1
        public void T1(l source, long j10) throws IOException {
            kotlin.jvm.internal.m0.p(source, "source");
            i.e(source.size(), 0L, j10);
            while (true) {
                long j11 = 0;
                if (j10 <= 0) {
                    return;
                }
                y0 y0Var = source.f85645b;
                kotlin.jvm.internal.m0.m(y0Var);
                while (j11 < 65536) {
                    j11 += (long) (y0Var.f85742c - y0Var.f85741b);
                    if (j11 >= j10) {
                        j11 = j10;
                        break;
                    } else {
                        y0Var = y0Var.f85745f;
                        kotlin.jvm.internal.m0.m(y0Var);
                    }
                }
                j jVar = j.this;
                b1 b1Var = this.f85635c;
                jVar.A();
                try {
                    try {
                        b1Var.T1(source, j11);
                        w2 w2Var = w2.f79517a;
                        if (jVar.B()) {
                            throw jVar.u(null);
                        }
                        j10 -= j11;
                    } catch (IOException e10) {
                        if (!jVar.B()) {
                            throw e10;
                        }
                        throw jVar.u(e10);
                    }
                } catch (Throwable th2) {
                    jVar.B();
                    throw th2;
                }
            }
        }

        @Override // fx.b1, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            j jVar = j.this;
            b1 b1Var = this.f85635c;
            jVar.A();
            try {
                try {
                    b1Var.close();
                    w2 w2Var = w2.f79517a;
                    if (jVar.B()) {
                        throw jVar.u(null);
                    }
                } catch (IOException e10) {
                    if (!jVar.B()) {
                        throw e10;
                    }
                    throw jVar.u(e10);
                }
            } catch (Throwable th2) {
                jVar.B();
                throw th2;
            }
        }

        @Override // fx.b1
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public j timeout() {
            return j.this;
        }

        @Override // fx.b1, java.io.Flushable
        public void flush() throws IOException {
            j jVar = j.this;
            b1 b1Var = this.f85635c;
            jVar.A();
            try {
                try {
                    b1Var.flush();
                    w2 w2Var = w2.f79517a;
                    if (jVar.B()) {
                        throw jVar.u(null);
                    }
                } catch (IOException e10) {
                    if (!jVar.B()) {
                        throw e10;
                    }
                    throw jVar.u(e10);
                }
            } catch (Throwable th2) {
                jVar.B();
                throw th2;
            }
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f85635c + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nAsyncTimeout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AsyncTimeout.kt\nokio/AsyncTimeout$source$1\n+ 2 AsyncTimeout.kt\nokio/AsyncTimeout\n*L\n1#1,382:1\n171#2,11:383\n171#2,11:394\n*S KotlinDebug\n*F\n+ 1 AsyncTimeout.kt\nokio/AsyncTimeout$source$1\n*L\n153#1:383,11\n157#1:394,11\n*E\n"})
    public static final class d implements d1 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ d1 f85637c;

        public d(d1 d1Var) {
            this.f85637c = d1Var;
        }

        @Override // fx.d1, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            j jVar = j.this;
            d1 d1Var = this.f85637c;
            jVar.A();
            try {
                try {
                    d1Var.close();
                    w2 w2Var = w2.f79517a;
                    if (jVar.B()) {
                        throw jVar.u(null);
                    }
                } catch (IOException e10) {
                    if (!jVar.B()) {
                        throw e10;
                    }
                    throw jVar.u(e10);
                }
            } catch (Throwable th2) {
                jVar.B();
                throw th2;
            }
        }

        @Override // fx.d1
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public j timeout() {
            return j.this;
        }

        @Override // fx.d1
        public long read(l sink, long j10) throws IOException {
            kotlin.jvm.internal.m0.p(sink, "sink");
            j jVar = j.this;
            d1 d1Var = this.f85637c;
            jVar.A();
            try {
                try {
                    long j11 = d1Var.read(sink, j10);
                    if (jVar.B()) {
                        throw jVar.u(null);
                    }
                    return j11;
                } catch (IOException e10) {
                    if (jVar.B()) {
                        throw jVar.u(e10);
                    }
                    throw e10;
                }
            } catch (Throwable th2) {
                jVar.B();
                throw th2;
            }
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f85637c + ')';
        }
    }

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f85621k = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        kotlin.jvm.internal.m0.o(conditionNewCondition, "newCondition(...)");
        f85622l = conditionNewCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f85624n = millis;
        f85625o = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void A() {
        long jL = l();
        boolean zH = h();
        if (jL != 0 || zH) {
            ReentrantLock reentrantLock = f85621k;
            reentrantLock.lock();
            try {
                if (this.f85631g != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.f85631g = 1;
                f85620j.f(this, jL, zH);
                w2 w2Var = w2.f79517a;
                reentrantLock.unlock();
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }
    }

    public final boolean B() {
        ReentrantLock reentrantLock = f85621k;
        reentrantLock.lock();
        try {
            int i10 = this.f85631g;
            this.f85631g = 0;
            if (i10 != 1) {
                return i10 == 2;
            }
            f85620j.g(this);
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    @oy.l
    public IOException C(@oy.m IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final long D(long j10) {
        return this.f85633i - j10;
    }

    @oy.l
    public final b1 E(@oy.l b1 sink) {
        kotlin.jvm.internal.m0.p(sink, "sink");
        return new c(sink);
    }

    @oy.l
    public final d1 F(@oy.l d1 source) {
        kotlin.jvm.internal.m0.p(source, "source");
        return new d(source);
    }

    public final <T> T H(@oy.l ds.a<? extends T> block) throws IOException {
        kotlin.jvm.internal.m0.p(block, "block");
        A();
        try {
            try {
                T tInvoke = block.invoke();
                kotlin.jvm.internal.j0.d(1);
                if (B()) {
                    throw u(null);
                }
                kotlin.jvm.internal.j0.c(1);
                return tInvoke;
            } catch (IOException e10) {
                if (B()) {
                    throw u(e10);
                }
                throw e10;
            }
        } catch (Throwable th2) {
            kotlin.jvm.internal.j0.d(1);
            B();
            kotlin.jvm.internal.j0.c(1);
            throw th2;
        }
    }

    @Override // fx.g1
    public void b() {
        super.b();
        ReentrantLock reentrantLock = f85621k;
        reentrantLock.lock();
        try {
            if (this.f85631g == 1) {
                f85620j.g(this);
                this.f85631g = 3;
            }
            w2 w2Var = w2.f79517a;
        } finally {
            reentrantLock.unlock();
        }
    }

    @dr.f1
    @oy.l
    public final IOException u(@oy.m IOException iOException) {
        return C(iOException);
    }

    public void G() {
    }
}
