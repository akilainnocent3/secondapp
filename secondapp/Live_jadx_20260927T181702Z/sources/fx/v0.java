package fx;

import dr.w2;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.s1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
@s1({"SMAP\nPipe.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pipe.kt\nokio/Pipe\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Timeout.kt\nokio/Timeout\n*L\n1#1,262:1\n1#2:263\n302#3,26:264\n*S KotlinDebug\n*F\n+ 1 Pipe.kt\nokio/Pipe\n*L\n222#1:264,26\n*E\n"})
public final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f85712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final l f85713b = new l();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f85714c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f85715d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f85716e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @oy.m
    public b1 f85717f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @oy.l
    public final ReentrantLock f85718g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @oy.l
    public final Condition f85719h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @oy.l
    public final b1 f85720i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @oy.l
    public final d1 f85721j;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nPipe.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pipe.kt\nokio/Pipe$sink$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Pipe.kt\nokio/Pipe\n+ 4 Timeout.kt\nokio/Timeout\n*L\n1#1,262:1\n1#2:263\n222#3:264\n223#3:291\n222#3:292\n223#3:319\n222#3:320\n223#3:347\n302#4,26:265\n302#4,26:293\n302#4,26:321\n*S KotlinDebug\n*F\n+ 1 Pipe.kt\nokio/Pipe$sink$1\n*L\n87#1:264\n87#1:291\n106#1:292\n106#1:319\n124#1:320\n124#1:347\n87#1:265,26\n106#1:293,26\n124#1:321,26\n*E\n"})
    public static final class a implements b1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final g1 f85722b = new g1();

        public a() {
        }

        @Override // fx.b1
        public void T1(l source, long j10) {
            b1 b1VarI;
            boolean zH;
            kotlin.jvm.internal.m0.p(source, "source");
            ReentrantLock reentrantLockJ = v0.this.j();
            v0 v0Var = v0.this;
            reentrantLockJ.lock();
            try {
                if (v0Var.l()) {
                    throw new IllegalStateException("closed");
                }
                if (v0Var.g()) {
                    throw new IOException("canceled");
                }
                while (true) {
                    if (j10 <= 0) {
                        b1VarI = null;
                        break;
                    }
                    b1VarI = v0Var.i();
                    if (b1VarI != null) {
                        break;
                    }
                    if (v0Var.m()) {
                        throw new IOException("source is closed");
                    }
                    long jK = v0Var.k() - v0Var.f().size();
                    if (jK == 0) {
                        this.f85722b.a(v0Var.h());
                        if (v0Var.g()) {
                            throw new IOException("canceled");
                        }
                    } else {
                        long jMin = Math.min(jK, j10);
                        v0Var.f().T1(source, jMin);
                        j10 -= jMin;
                        v0Var.h().signalAll();
                    }
                }
                w2 w2Var = w2.f79517a;
                reentrantLockJ.unlock();
                if (b1VarI != null) {
                    v0 v0Var2 = v0.this;
                    g1 g1VarTimeout = b1VarI.timeout();
                    g1 g1VarTimeout2 = v0Var2.r().timeout();
                    long jL = g1VarTimeout.l();
                    g1VarTimeout.k(g1.f85600e.a(g1VarTimeout2.l(), g1VarTimeout.l()), TimeUnit.NANOSECONDS);
                    if (!g1VarTimeout.h()) {
                        if (g1VarTimeout2.h()) {
                            g1VarTimeout.g(g1VarTimeout2.f());
                        }
                        try {
                            b1VarI.T1(source, j10);
                            if (zH) {
                                return;
                            } else {
                                return;
                            }
                        } finally {
                            g1VarTimeout.k(jL, TimeUnit.NANOSECONDS);
                            if (g1VarTimeout2.h()) {
                                g1VarTimeout.c();
                            }
                        }
                    }
                    long jF = g1VarTimeout.f();
                    if (g1VarTimeout2.h()) {
                        g1VarTimeout.g(Math.min(g1VarTimeout.f(), g1VarTimeout2.f()));
                    }
                    try {
                        b1VarI.T1(source, j10);
                    } finally {
                        g1VarTimeout.k(jL, TimeUnit.NANOSECONDS);
                        if (g1VarTimeout2.h()) {
                            g1VarTimeout.g(jF);
                        }
                    }
                }
            } catch (Throwable th2) {
                reentrantLockJ.unlock();
                throw th2;
            }
        }

        @Override // fx.b1, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            boolean zH;
            ReentrantLock reentrantLockJ = v0.this.j();
            v0 v0Var = v0.this;
            reentrantLockJ.lock();
            try {
                if (v0Var.l()) {
                    reentrantLockJ.unlock();
                    return;
                }
                b1 b1VarI = v0Var.i();
                if (b1VarI == null) {
                    if (v0Var.m() && v0Var.f().size() > 0) {
                        throw new IOException("source is closed");
                    }
                    v0Var.p(true);
                    v0Var.h().signalAll();
                    b1VarI = null;
                }
                w2 w2Var = w2.f79517a;
                reentrantLockJ.unlock();
                if (b1VarI != null) {
                    v0 v0Var2 = v0.this;
                    g1 g1VarTimeout = b1VarI.timeout();
                    g1 g1VarTimeout2 = v0Var2.r().timeout();
                    long jL = g1VarTimeout.l();
                    g1VarTimeout.k(g1.f85600e.a(g1VarTimeout2.l(), g1VarTimeout.l()), TimeUnit.NANOSECONDS);
                    if (!g1VarTimeout.h()) {
                        if (g1VarTimeout2.h()) {
                            g1VarTimeout.g(g1VarTimeout2.f());
                        }
                        try {
                            b1VarI.close();
                            if (zH) {
                                return;
                            } else {
                                return;
                            }
                        } finally {
                            g1VarTimeout.k(jL, TimeUnit.NANOSECONDS);
                            if (g1VarTimeout2.h()) {
                                g1VarTimeout.c();
                            }
                        }
                    }
                    long jF = g1VarTimeout.f();
                    if (g1VarTimeout2.h()) {
                        g1VarTimeout.g(Math.min(g1VarTimeout.f(), g1VarTimeout2.f()));
                    }
                    try {
                        b1VarI.close();
                    } finally {
                        g1VarTimeout.k(jL, TimeUnit.NANOSECONDS);
                        if (g1VarTimeout2.h()) {
                            g1VarTimeout.g(jF);
                        }
                    }
                }
            } catch (Throwable th2) {
                reentrantLockJ.unlock();
                throw th2;
            }
        }

        @Override // fx.b1, java.io.Flushable
        public void flush() {
            boolean zH;
            ReentrantLock reentrantLockJ = v0.this.j();
            v0 v0Var = v0.this;
            reentrantLockJ.lock();
            try {
                if (v0Var.l()) {
                    throw new IllegalStateException("closed");
                }
                if (v0Var.g()) {
                    throw new IOException("canceled");
                }
                b1 b1VarI = v0Var.i();
                if (b1VarI == null) {
                    if (v0Var.m() && v0Var.f().size() > 0) {
                        throw new IOException("source is closed");
                    }
                    b1VarI = null;
                }
                w2 w2Var = w2.f79517a;
                reentrantLockJ.unlock();
                if (b1VarI != null) {
                    v0 v0Var2 = v0.this;
                    g1 g1VarTimeout = b1VarI.timeout();
                    g1 g1VarTimeout2 = v0Var2.r().timeout();
                    long jL = g1VarTimeout.l();
                    g1VarTimeout.k(g1.f85600e.a(g1VarTimeout2.l(), g1VarTimeout.l()), TimeUnit.NANOSECONDS);
                    if (!g1VarTimeout.h()) {
                        if (g1VarTimeout2.h()) {
                            g1VarTimeout.g(g1VarTimeout2.f());
                        }
                        try {
                            b1VarI.flush();
                            if (zH) {
                                return;
                            } else {
                                return;
                            }
                        } finally {
                            g1VarTimeout.k(jL, TimeUnit.NANOSECONDS);
                            if (g1VarTimeout2.h()) {
                                g1VarTimeout.c();
                            }
                        }
                    }
                    long jF = g1VarTimeout.f();
                    if (g1VarTimeout2.h()) {
                        g1VarTimeout.g(Math.min(g1VarTimeout.f(), g1VarTimeout2.f()));
                    }
                    try {
                        b1VarI.flush();
                    } finally {
                        g1VarTimeout.k(jL, TimeUnit.NANOSECONDS);
                        if (g1VarTimeout2.h()) {
                            g1VarTimeout.g(jF);
                        }
                    }
                }
            } catch (Throwable th2) {
                reentrantLockJ.unlock();
                throw th2;
            }
        }

        @Override // fx.b1
        public g1 timeout() {
            return this.f85722b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nPipe.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pipe.kt\nokio/Pipe$source$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,262:1\n1#2:263\n*E\n"})
    public static final class b implements d1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final g1 f85724b = new g1();

        public b() {
        }

        @Override // fx.d1, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            ReentrantLock reentrantLockJ = v0.this.j();
            v0 v0Var = v0.this;
            reentrantLockJ.lock();
            try {
                v0Var.q(true);
                v0Var.h().signalAll();
                w2 w2Var = w2.f79517a;
            } finally {
                reentrantLockJ.unlock();
            }
        }

        @Override // fx.d1
        public long read(l sink, long j10) {
            kotlin.jvm.internal.m0.p(sink, "sink");
            ReentrantLock reentrantLockJ = v0.this.j();
            v0 v0Var = v0.this;
            reentrantLockJ.lock();
            try {
                if (v0Var.m()) {
                    throw new IllegalStateException("closed");
                }
                if (v0Var.g()) {
                    throw new IOException("canceled");
                }
                while (v0Var.f().size() == 0) {
                    if (v0Var.l()) {
                        reentrantLockJ.unlock();
                        return -1L;
                    }
                    this.f85724b.a(v0Var.h());
                    if (v0Var.g()) {
                        throw new IOException("canceled");
                    }
                }
                long j11 = v0Var.f().read(sink, j10);
                v0Var.h().signalAll();
                reentrantLockJ.unlock();
                return j11;
            } catch (Throwable th2) {
                reentrantLockJ.unlock();
                throw th2;
            }
        }

        @Override // fx.d1
        public g1 timeout() {
            return this.f85724b;
        }
    }

    public v0(long j10) {
        this.f85712a = j10;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f85718g = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        kotlin.jvm.internal.m0.o(conditionNewCondition, "newCondition(...)");
        this.f85719h = conditionNewCondition;
        if (j10 >= 1) {
            this.f85720i = new a();
            this.f85721j = new b();
        } else {
            throw new IllegalArgumentException(("maxBufferSize < 1: " + j10).toString());
        }
    }

    @cs.j(name = "-deprecated_sink")
    @oy.l
    @dr.o(level = dr.q.ERROR, message = "moved to val", replaceWith = @dr.g1(expression = "sink", imports = {}))
    public final b1 a() {
        return this.f85720i;
    }

    @cs.j(name = "-deprecated_source")
    @oy.l
    @dr.o(level = dr.q.ERROR, message = "moved to val", replaceWith = @dr.g1(expression = "source", imports = {}))
    public final d1 b() {
        return this.f85721j;
    }

    public final void c() {
        ReentrantLock reentrantLock = this.f85718g;
        reentrantLock.lock();
        try {
            this.f85714c = true;
            this.f85713b.l();
            this.f85719h.signalAll();
            w2 w2Var = w2.f79517a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void d(@oy.l b1 sink) throws IOException {
        l lVar;
        boolean z10;
        kotlin.jvm.internal.m0.p(sink, "sink");
        while (true) {
            ReentrantLock reentrantLock = this.f85718g;
            reentrantLock.lock();
            try {
                if (this.f85717f != null) {
                    throw new IllegalStateException("sink already folded");
                }
                if (this.f85714c) {
                    this.f85717f = sink;
                    throw new IOException("canceled");
                }
                boolean z11 = this.f85715d;
                l lVar2 = null;
                if (this.f85713b.exhausted()) {
                    this.f85716e = true;
                    this.f85717f = sink;
                    lVar = null;
                    z10 = true;
                } else {
                    lVar = new l();
                    l lVar3 = this.f85713b;
                    lVar.T1(lVar3, lVar3.size());
                    this.f85719h.signalAll();
                    z10 = false;
                }
                w2 w2Var = w2.f79517a;
                reentrantLock.unlock();
                if (z10) {
                    if (z11) {
                        sink.close();
                        return;
                    }
                    return;
                }
                if (lVar == null) {
                    try {
                        kotlin.jvm.internal.m0.S("sinkBuffer");
                    } catch (Throwable th2) {
                        ReentrantLock reentrantLock2 = this.f85718g;
                        reentrantLock2.lock();
                        try {
                            this.f85716e = true;
                            this.f85719h.signalAll();
                            w2 w2Var2 = w2.f79517a;
                            throw th2;
                        } finally {
                            reentrantLock2.unlock();
                        }
                    }
                } else {
                    lVar2 = lVar;
                }
                sink.T1(lVar2, lVar.size());
                sink.flush();
            } catch (Throwable th3) {
                reentrantLock.unlock();
                throw th3;
            }
        }
    }

    public final void e(b1 b1Var, ds.l<? super b1, w2> lVar) {
        g1 g1VarTimeout = b1Var.timeout();
        g1 g1VarTimeout2 = r().timeout();
        long jL = g1VarTimeout.l();
        g1VarTimeout.k(g1.f85600e.a(g1VarTimeout2.l(), g1VarTimeout.l()), TimeUnit.NANOSECONDS);
        if (!g1VarTimeout.h()) {
            if (g1VarTimeout2.h()) {
                g1VarTimeout.g(g1VarTimeout2.f());
            }
            try {
                lVar.invoke(b1Var);
                w2 w2Var = w2.f79517a;
                kotlin.jvm.internal.j0.d(1);
                return;
            } finally {
                kotlin.jvm.internal.j0.d(1);
                g1VarTimeout.k(jL, TimeUnit.NANOSECONDS);
                if (g1VarTimeout2.h()) {
                    g1VarTimeout.c();
                }
                kotlin.jvm.internal.j0.c(1);
            }
        }
        long jF = g1VarTimeout.f();
        if (g1VarTimeout2.h()) {
            g1VarTimeout.g(Math.min(g1VarTimeout.f(), g1VarTimeout2.f()));
        }
        try {
            lVar.invoke(b1Var);
            w2 w2Var2 = w2.f79517a;
            kotlin.jvm.internal.j0.d(1);
        } finally {
            kotlin.jvm.internal.j0.d(1);
            g1VarTimeout.k(jL, TimeUnit.NANOSECONDS);
            if (g1VarTimeout2.h()) {
                g1VarTimeout.g(jF);
            }
            kotlin.jvm.internal.j0.c(1);
        }
    }

    @oy.l
    public final l f() {
        return this.f85713b;
    }

    public final boolean g() {
        return this.f85714c;
    }

    @oy.l
    public final Condition h() {
        return this.f85719h;
    }

    @oy.m
    public final b1 i() {
        return this.f85717f;
    }

    @oy.l
    public final ReentrantLock j() {
        return this.f85718g;
    }

    public final long k() {
        return this.f85712a;
    }

    public final boolean l() {
        return this.f85715d;
    }

    public final boolean m() {
        return this.f85716e;
    }

    public final void n(boolean z10) {
        this.f85714c = z10;
    }

    public final void o(@oy.m b1 b1Var) {
        this.f85717f = b1Var;
    }

    public final void p(boolean z10) {
        this.f85715d = z10;
    }

    public final void q(boolean z10) {
        this.f85716e = z10;
    }

    @cs.j(name = "sink")
    @oy.l
    public final b1 r() {
        return this.f85720i;
    }

    @cs.j(name = "source")
    @oy.l
    public final d1 s() {
        return this.f85721j;
    }
}
