package fx;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import kotlin.jvm.internal.s1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
@s1({"SMAP\nTimeout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Timeout.kt\nokio/Timeout\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,358:1\n1#2:359\n*E\n"})
public class g1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oy.l
    public static final b f85600e = new b(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @oy.l
    @cs.g
    public static final g1 f85601f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f85602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f85603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f85604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.m
    public volatile Object f85605d;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.x xVar) {
            this();
        }

        public final long a(long j10, long j11) {
            return (j10 != 0 && (j11 == 0 || j10 < j11)) ? j10 : j11;
        }

        @oy.l
        public final g1 b(@oy.l g1 g1Var, long j10, @oy.l ev.k unit) {
            kotlin.jvm.internal.m0.p(g1Var, "<this>");
            kotlin.jvm.internal.m0.p(unit, "unit");
            return g1Var.k(j10, ev.m.e(unit));
        }

        @oy.l
        public final g1 c(@oy.l g1 timeout, long j10) {
            kotlin.jvm.internal.m0.p(timeout, "$this$timeout");
            return timeout.k(ev.h.y(j10), TimeUnit.NANOSECONDS);
        }

        public b() {
        }
    }

    public void a(@oy.l Condition condition) throws InterruptedIOException {
        kotlin.jvm.internal.m0.p(condition, "condition");
        try {
            boolean zH = h();
            long jL = l();
            if (!zH && jL == 0) {
                condition.await();
                return;
            }
            if (zH && jL != 0) {
                jL = Math.min(jL, f() - System.nanoTime());
            } else if (zH) {
                jL = f() - System.nanoTime();
            }
            if (jL <= 0) {
                throw new InterruptedIOException("timeout");
            }
            Object obj = this.f85605d;
            if (condition.awaitNanos(jL) <= 0 && this.f85605d == obj) {
                throw new InterruptedIOException("timeout");
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }

    public void b() {
        this.f85605d = new Object();
    }

    @oy.l
    public g1 c() {
        this.f85602a = false;
        return this;
    }

    @oy.l
    public g1 d() {
        this.f85604c = 0L;
        return this;
    }

    @oy.l
    public final g1 e(long j10, @oy.l TimeUnit unit) {
        kotlin.jvm.internal.m0.p(unit, "unit");
        if (j10 > 0) {
            return g(System.nanoTime() + unit.toNanos(j10));
        }
        throw new IllegalArgumentException(("duration <= 0: " + j10).toString());
    }

    public long f() {
        if (this.f85602a) {
            return this.f85603b;
        }
        throw new IllegalStateException("No deadline");
    }

    @oy.l
    public g1 g(long j10) {
        this.f85602a = true;
        this.f85603b = j10;
        return this;
    }

    public boolean h() {
        return this.f85602a;
    }

    public final <T> T i(@oy.l g1 other, @oy.l ds.a<? extends T> block) {
        kotlin.jvm.internal.m0.p(other, "other");
        kotlin.jvm.internal.m0.p(block, "block");
        long jL = l();
        k(f85600e.a(other.l(), l()), TimeUnit.NANOSECONDS);
        if (!h()) {
            if (other.h()) {
                g(other.f());
            }
            try {
                T tInvoke = block.invoke();
                kotlin.jvm.internal.j0.d(1);
                return tInvoke;
            } finally {
                kotlin.jvm.internal.j0.d(1);
                k(jL, TimeUnit.NANOSECONDS);
                if (other.h()) {
                    c();
                }
                kotlin.jvm.internal.j0.c(1);
            }
        }
        long jF = f();
        if (other.h()) {
            g(Math.min(f(), other.f()));
        }
        try {
            T tInvoke2 = block.invoke();
            kotlin.jvm.internal.j0.d(1);
            return tInvoke2;
        } finally {
            kotlin.jvm.internal.j0.d(1);
            k(jL, TimeUnit.NANOSECONDS);
            if (other.h()) {
                g(jF);
            }
            kotlin.jvm.internal.j0.c(1);
        }
    }

    public void j() throws IOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f85602a && this.f85603b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    @oy.l
    public g1 k(long j10, @oy.l TimeUnit unit) {
        kotlin.jvm.internal.m0.p(unit, "unit");
        if (j10 >= 0) {
            this.f85604c = unit.toNanos(j10);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j10).toString());
    }

    public long l() {
        return this.f85604c;
    }

    public void m(@oy.l Object monitor) throws InterruptedIOException {
        kotlin.jvm.internal.m0.p(monitor, "monitor");
        try {
            boolean zH = h();
            long jL = l();
            if (!zH && jL == 0) {
                monitor.wait();
                return;
            }
            long jNanoTime = System.nanoTime();
            if (zH && jL != 0) {
                jL = Math.min(jL, f() - jNanoTime);
            } else if (zH) {
                jL = f() - jNanoTime;
            }
            if (jL <= 0) {
                throw new InterruptedIOException("timeout");
            }
            Object obj = this.f85605d;
            long j10 = jL / 1000000;
            Long.signum(j10);
            monitor.wait(j10, (int) (jL - (1000000 * j10)));
            if (System.nanoTime() - jNanoTime >= jL && this.f85605d == obj) {
                throw new InterruptedIOException("timeout");
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a extends g1 {
        @Override // fx.g1
        public g1 k(long j10, TimeUnit unit) {
            kotlin.jvm.internal.m0.p(unit, "unit");
            return this;
        }

        @Override // fx.g1
        public void j() {
        }

        @Override // fx.g1
        public g1 g(long j10) {
            return this;
        }
    }
}
