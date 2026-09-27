package jv;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@kotlin.jvm.internal.s1({"SMAP\nEventLoop.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoopImplBase\n+ 2 EventLoop.kt\nkotlinx/coroutines/EventLoopKt\n+ 3 ThreadSafeHeap.kt\nkotlinx/coroutines/internal/ThreadSafeHeap\n+ 4 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 5 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,547:1\n53#2:548\n51#3:549\n52#3,7:552\n28#4:550\n16#5:551\n1#6:559\n*S KotlinDebug\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoopImplBase\n*L\n263#1:548\n336#1:549\n336#1:552,7\n336#1:550\n336#1:551\n*E\n"})
public abstract class t1 extends u1 implements c1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f100879g = AtomicReferenceFieldUpdater.newUpdater(t1.class, Object.class, "_queue$volatile");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f100880h = AtomicReferenceFieldUpdater.newUpdater(t1.class, Object.class, "_delayed$volatile");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f100881i = AtomicIntegerFieldUpdater.newUpdater(t1.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @kotlin.jvm.internal.s1({"SMAP\nEventLoop.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoopImplBase$DelayedResumeTask\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,547:1\n1#2:548\n*E\n"})
    public final class a extends c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @oy.l
        public final n<dr.w2> f100882d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@oy.l long j10, n<? super dr.w2> nVar) {
            super(j10);
            this.f100882d = nVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f100882d.r(t1.this, dr.w2.f79517a);
        }

        @Override // jv.t1.c
        @oy.l
        public String toString() {
            return super.toString() + this.f100882d;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @oy.l
        public final Runnable f100884d;

        public b(long j10, @oy.l Runnable runnable) {
            super(j10);
            this.f100884d = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f100884d.run();
        }

        @Override // jv.t1.c
        @oy.l
        public String toString() {
            return super.toString() + this.f100884d;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @kotlin.jvm.internal.s1({"SMAP\nEventLoop.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoopImplBase$DelayedTask\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 4 ThreadSafeHeap.kt\nkotlinx/coroutines/internal/ThreadSafeHeap\n*L\n1#1,547:1\n28#2:548\n28#2:551\n28#2:560\n16#3:549\n16#3:552\n16#3:561\n63#4:550\n64#4,7:553\n*S KotlinDebug\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoopImplBase$DelayedTask\n*L\n441#1:548\n443#1:551\n483#1:560\n441#1:549\n443#1:552\n483#1:561\n443#1:550\n443#1:553,7\n*E\n"})
    public static abstract class c implements Runnable, Comparable<c>, o1, qv.n1 {

        @oy.m
        private volatile Object _heap;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @cs.g
        public long f100885b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f100886c = -1;

        public c(long j10) {
            this.f100885b = j10;
        }

        @Override // jv.o1
        public final void a() {
            synchronized (this) {
                try {
                    Object obj = this._heap;
                    if (obj == w1.f100932a) {
                        return;
                    }
                    d dVar = obj instanceof d ? (d) obj : null;
                    if (dVar != null) {
                        dVar.l(this);
                    }
                    this._heap = w1.f100932a;
                    dr.w2 w2Var = dr.w2.f79517a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // qv.n1
        @oy.m
        public qv.m1<?> c() {
            Object obj = this._heap;
            if (obj instanceof qv.m1) {
                return (qv.m1) obj;
            }
            return null;
        }

        @Override // qv.n1
        public void d(@oy.m qv.m1<?> m1Var) {
            if (this._heap == w1.f100932a) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            this._heap = m1Var;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public int compareTo(@oy.l c cVar) {
            long j10 = this.f100885b - cVar.f100885b;
            if (j10 > 0) {
                return 1;
            }
            return j10 < 0 ? -1 : 0;
        }

        public final int f(long j10, @oy.l d dVar, @oy.l t1 t1Var) {
            synchronized (this) {
                if (this._heap == w1.f100932a) {
                    return 2;
                }
                synchronized (dVar) {
                    try {
                        c cVarE = dVar.e();
                        if (t1Var.k()) {
                            return 1;
                        }
                        if (cVarE == null) {
                            dVar.f100887c = j10;
                        } else {
                            long j11 = cVarE.f100885b;
                            if (j11 - j10 < 0) {
                                j10 = j11;
                            }
                            if (j10 - dVar.f100887c > 0) {
                                dVar.f100887c = j10;
                            }
                        }
                        long j12 = this.f100885b;
                        long j13 = dVar.f100887c;
                        if (j12 - j13 < 0) {
                            this.f100885b = j13;
                        }
                        dVar.a(this);
                        return 0;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        public final boolean g(long j10) {
            return j10 - this.f100885b >= 0;
        }

        @Override // qv.n1
        public int getIndex() {
            return this.f100886c;
        }

        @Override // qv.n1
        public void setIndex(int i10) {
            this.f100886c = i10;
        }

        @oy.l
        public String toString() {
            return "Delayed[nanos=" + this.f100885b + fw.b.f85385l;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class d extends qv.m1<c> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @cs.g
        public long f100887c;

        public d(long j10) {
            this.f100887c = j10;
        }
    }

    private final /* synthetic */ void U1(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, ds.l<Object, dr.w2> lVar) {
        while (true) {
            lVar.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean k() {
        return f100881i.get(this) == 1;
    }

    @Override // jv.n0
    public final void F(@oy.l or.j jVar, @oy.l Runnable runnable) {
        w1(runnable);
    }

    public final boolean F1(Runnable runnable) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f100879g;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (k()) {
                return false;
            }
            if (obj == null) {
                if (h0.b.a(f100879g, this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof qv.h0) {
                kotlin.jvm.internal.m0.n(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable>");
                qv.h0 h0Var = (qv.h0) obj;
                int iA = h0Var.a(runnable);
                if (iA == 0) {
                    return true;
                }
                if (iA == 1) {
                    h0.b.a(f100879g, this, obj, h0Var.r());
                } else if (iA == 2) {
                    return false;
                }
            } else {
                if (obj == w1.f100939h) {
                    return false;
                }
                qv.h0 h0Var2 = new qv.h0(8, true);
                kotlin.jvm.internal.m0.n(obj, "null cannot be cast to non-null type java.lang.Runnable");
                h0Var2.a((Runnable) obj);
                h0Var2.a(runnable);
                if (h0.b.a(f100879g, this, obj, h0Var2)) {
                    return true;
                }
            }
        }
    }

    public final /* synthetic */ Object G1() {
        return this._delayed$volatile;
    }

    @Override // jv.s1
    public long I0() {
        c cVarJ;
        if (super.I0() == 0) {
            return 0L;
        }
        Object obj = f100879g.get(this);
        if (obj != null) {
            if (!(obj instanceof qv.h0)) {
                return obj == w1.f100939h ? Long.MAX_VALUE : 0L;
            }
            if (!((qv.h0) obj).m()) {
                return 0L;
            }
        }
        d dVar = (d) f100880h.get(this);
        if (dVar == null || (cVarJ = dVar.j()) == null) {
            return Long.MAX_VALUE;
        }
        long j10 = cVarJ.f100885b;
        jv.b bVar = jv.c.f100774a;
        return ms.u.v(j10 - (bVar != null ? bVar.b() : System.nanoTime()), 0L);
    }

    public final /* synthetic */ int K1() {
        return this._isCompleted$volatile;
    }

    public final /* synthetic */ Object O1() {
        return this._queue$volatile;
    }

    @Override // jv.s1
    public boolean P0() {
        if (!W0()) {
            return false;
        }
        d dVar = (d) f100880h.get(this);
        if (dVar != null && !dVar.i()) {
            return false;
        }
        Object obj = f100879g.get(this);
        if (obj == null) {
            return true;
        }
        if (obj instanceof qv.h0) {
            return ((qv.h0) obj).m();
        }
        return obj == w1.f100939h;
    }

    public final void W1() {
        c cVarO;
        jv.b bVar = jv.c.f100774a;
        long jB = bVar != null ? bVar.b() : System.nanoTime();
        while (true) {
            d dVar = (d) f100880h.get(this);
            if (dVar == null || (cVarO = dVar.o()) == null) {
                return;
            } else {
                i1(jB, cVarO);
            }
        }
    }

    public final void X1() {
        f100879g.set(this, null);
        f100880h.set(this, null);
    }

    @Override // jv.s1
    public long Y0() {
        if (Z0()) {
            return 0L;
        }
        y1();
        Runnable runnableT1 = t1();
        if (runnableT1 == null) {
            return I0();
        }
        runnableT1.run();
        return 0L;
    }

    public final void Y1(long j10, @oy.l c cVar) {
        int iZ1 = Z1(j10, cVar);
        if (iZ1 == 0) {
            if (f2(cVar)) {
                l1();
            }
        } else if (iZ1 == 1) {
            i1(j10, cVar);
        } else if (iZ1 != 2) {
            throw new IllegalStateException("unexpected result");
        }
    }

    public final int Z1(long j10, c cVar) {
        if (k()) {
            return 1;
        }
        d dVar = (d) f100880h.get(this);
        if (dVar == null) {
            h0.b.a(f100880h, this, null, new d(j10));
            Object obj = f100880h.get(this);
            kotlin.jvm.internal.m0.m(obj);
            dVar = (d) obj;
        }
        return cVar.f(j10, dVar, this);
    }

    @oy.l
    public final o1 a2(long j10, @oy.l Runnable runnable) {
        long jD = w1.d(j10);
        if (jD >= 4611686018427387903L) {
            return c3.f100777b;
        }
        jv.b bVar = jv.c.f100774a;
        long jB = bVar != null ? bVar.b() : System.nanoTime();
        b bVar2 = new b(jD + jB, runnable);
        Y1(jB, bVar2);
        return bVar2;
    }

    public final void b2(boolean z10) {
        f100881i.set(this, z10 ? 1 : 0);
    }

    public final /* synthetic */ void c2(Object obj) {
        this._delayed$volatile = obj;
    }

    @Override // jv.c1
    @dr.o(level = dr.q.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    @oy.m
    public Object d(long j10, @oy.l or.f<? super dr.w2> fVar) {
        return c1.a.a(this, j10, fVar);
    }

    public final /* synthetic */ void d2(int i10) {
        this._isCompleted$volatile = i10;
    }

    public final /* synthetic */ void e2(Object obj) {
        this._queue$volatile = obj;
    }

    public final boolean f2(c cVar) {
        d dVar = (d) f100880h.get(this);
        return (dVar != null ? dVar.j() : null) == cVar;
    }

    public final void q1() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f100879g;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                if (h0.b.a(f100879g, this, null, w1.f100939h)) {
                    return;
                }
            } else if (obj instanceof qv.h0) {
                ((qv.h0) obj).d();
                return;
            } else {
                if (obj == w1.f100939h) {
                    return;
                }
                qv.h0 h0Var = new qv.h0(8, true);
                kotlin.jvm.internal.m0.n(obj, "null cannot be cast to non-null type java.lang.Runnable");
                h0Var.a((Runnable) obj);
                if (h0.b.a(f100879g, this, obj, h0Var)) {
                    return;
                }
            }
        }
    }

    @Override // jv.c1
    @oy.l
    public o1 r(long j10, @oy.l Runnable runnable, @oy.l or.j jVar) {
        return c1.a.b(this, j10, runnable, jVar);
    }

    @Override // jv.s1
    public void shutdown() {
        s3.f100876a.c();
        b2(true);
        q1();
        while (Y0() <= 0) {
        }
        W1();
    }

    public final Runnable t1() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f100879g;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return null;
            }
            if (obj instanceof qv.h0) {
                kotlin.jvm.internal.m0.n(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable>");
                qv.h0 h0Var = (qv.h0) obj;
                Object objS = h0Var.s();
                if (objS != qv.h0.f122979t) {
                    return (Runnable) objS;
                }
                h0.b.a(f100879g, this, obj, h0Var.r());
            } else {
                if (obj == w1.f100939h) {
                    return null;
                }
                if (h0.b.a(f100879g, this, obj, null)) {
                    kotlin.jvm.internal.m0.n(obj, "null cannot be cast to non-null type java.lang.Runnable");
                    return (Runnable) obj;
                }
            }
        }
    }

    public void w1(@oy.l Runnable runnable) {
        y1();
        if (F1(runnable)) {
            l1();
        } else {
            y0.f100957j.w1(runnable);
        }
    }

    @Override // jv.c1
    public void y(long j10, @oy.l n<? super dr.w2> nVar) {
        long jD = w1.d(j10);
        if (jD < 4611686018427387903L) {
            jv.b bVar = jv.c.f100774a;
            long jB = bVar != null ? bVar.b() : System.nanoTime();
            a aVar = new a(jD + jB, nVar);
            Y1(jB, aVar);
            r.a(nVar, aVar);
        }
    }

    public final void y1() {
        c cVarM;
        d dVar = (d) f100880h.get(this);
        if (dVar == null || dVar.i()) {
            return;
        }
        jv.b bVar = jv.c.f100774a;
        long jB = bVar != null ? bVar.b() : System.nanoTime();
        do {
            synchronized (dVar) {
                try {
                    c cVarE = dVar.e();
                    cVarM = null;
                    if (cVarE != null) {
                        c cVar = cVarE;
                        cVarM = cVar.g(jB) ? F1(cVar) : false ? dVar.m(0) : null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } while (cVarM != null);
    }
}
