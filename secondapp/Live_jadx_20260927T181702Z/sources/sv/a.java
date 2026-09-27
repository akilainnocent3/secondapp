package sv;

import dr.o0;
import dr.w2;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import jv.x0;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s1;
import kotlin.jvm.internal.x;
import ms.u;
import qv.u0;
import qv.z0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@s1({"SMAP\nCoroutineScheduler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler\n+ 2 Tasks.kt\nkotlinx/coroutines/scheduling/TasksKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 5 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 6 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler$Worker\n*L\n1#1,1041:1\n286#1:1044\n284#1:1045\n284#1:1046\n286#1:1047\n281#1:1050\n282#1,5:1051\n292#1:1057\n284#1:1058\n285#1:1059\n284#1:1062\n285#1:1063\n281#1:1064\n289#1:1065\n284#1:1066\n284#1:1069\n285#1:1070\n286#1:1071\n77#2:1042\n77#2:1056\n77#2:1067\n1#3:1043\n28#4:1048\n28#4:1060\n16#5:1049\n16#5:1061\n619#6:1068\n*S KotlinDebug\n*F\n+ 1 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler\n*L\n282#1:1044\n289#1:1045\n290#1:1046\n299#1:1047\n348#1:1050\n377#1:1051,5\n400#1:1057\n444#1:1058\n445#1:1059\n481#1:1062\n482#1:1063\n488#1:1064\n497#1:1065\n497#1:1066\n578#1:1069\n579#1:1070\n580#1:1071\n120#1:1042\n397#1:1056\n514#1:1067\n348#1:1048\n477#1:1060\n348#1:1049\n477#1:1061\n521#1:1068\n*E\n"})
public final class a implements Executor, Closeable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @oy.l
    public static final C1391a f135535i = new C1391a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f135536j = AtomicLongFieldUpdater.newUpdater(a.class, "parkedWorkersStack$volatile");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f135537k = AtomicLongFieldUpdater.newUpdater(a.class, "controlState$volatile");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f135538l = AtomicIntegerFieldUpdater.newUpdater(a.class, "_isTerminated$volatile");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @oy.l
    @cs.g
    public static final z0 f135539m = new z0("NOT_IN_STACK");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f135540n = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f135541o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f135542p = 1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f135543q = 21;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final long f135544r = 2097151;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final long f135545s = 4398044413952L;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f135546t = 42;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final long f135547u = 9223367638808264704L;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f135548v = 1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f135549w = 2097150;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final long f135550x = 2097151;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final long f135551y = -2097152;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final long f135552z = 2097152;
    private volatile /* synthetic */ int _isTerminated$volatile;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @cs.g
    public final int f135553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @cs.g
    public final int f135554c;
    private volatile /* synthetic */ long controlState$volatile;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @cs.g
    public final long f135555d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oy.l
    @cs.g
    public final String f135556e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @oy.l
    @cs.g
    public final e f135557f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @oy.l
    @cs.g
    public final e f135558g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @oy.l
    @cs.g
    public final u0<c> f135559h;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* JADX INFO: renamed from: sv.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class C1391a {
        public /* synthetic */ C1391a(x xVar) {
            this();
        }

        public C1391a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f135560a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.PARKING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.BLOCKING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.CPU_ACQUIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d.DORMANT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[d.TERMINATED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f135560a = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum d {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED;


        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ sr.a f135576h = sr.c.c(d());

        @oy.l
        public static sr.a<d> g() {
            return f135576h;
        }
    }

    public a(int i10, int i11, long j10, @oy.l String str) {
        this.f135553b = i10;
        this.f135554c = i11;
        this.f135555d = j10;
        this.f135556e = str;
        if (i10 < 1) {
            throw new IllegalArgumentException(("Core pool size " + i10 + " should be at least 1").toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(("Max pool size " + i11 + " should be greater than or equals to core pool size " + i10).toString());
        }
        if (i11 > 2097150) {
            throw new IllegalArgumentException(("Max pool size " + i11 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j10 > 0) {
            this.f135557f = new e();
            this.f135558g = new e();
            this.f135559h = new u0<>((i10 + 1) * 2);
            this.controlState$volatile = ((long) i10) << 42;
            return;
        }
        throw new IllegalArgumentException(("Idle worker keep alive time " + j10 + " must be positive").toString());
    }

    public static final /* synthetic */ AtomicLongFieldUpdater E() {
        return f135537k;
    }

    public static /* synthetic */ void t(a aVar, Runnable runnable, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        aVar.r(runnable, z10, z11);
    }

    public static /* synthetic */ boolean z0(a aVar, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = f135537k.get(aVar);
        }
        return aVar.y0(j10);
    }

    public final boolean A0() {
        c cVarY;
        do {
            cVarY = Y();
            if (cVarY == null) {
                return false;
            }
        } while (!c.f135561j.compareAndSet(cVarY, -1, 0));
        LockSupport.unpark(cVarY);
        return true;
    }

    public final /* synthetic */ long D() {
        return this.controlState$volatile;
    }

    public final int F() {
        return (int) (E().get(this) & 2097151);
    }

    public final /* synthetic */ long G() {
        return this.parkedWorkersStack$volatile;
    }

    public final /* synthetic */ int I() {
        return this._isTerminated$volatile;
    }

    public final long N() {
        return f135537k.addAndGet(this, 2097152L);
    }

    public final int O() {
        return (int) (f135537k.incrementAndGet(this) & 2097151);
    }

    public final /* synthetic */ void S(AtomicLongFieldUpdater atomicLongFieldUpdater, Object obj, ds.l<? super Long, w2> lVar) {
        while (true) {
            lVar.invoke(Long.valueOf(atomicLongFieldUpdater.get(obj)));
        }
    }

    public final int W(c cVar) {
        Object objH = cVar.h();
        while (objH != f135539m) {
            if (objH == null) {
                return 0;
            }
            c cVar2 = (c) objH;
            int iG = cVar2.g();
            if (iG != 0) {
                return iG;
            }
            objH = cVar2.h();
        }
        return -1;
    }

    public final c Y() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f135536j;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            c cVarB = this.f135559h.b((int) (2097151 & j10));
            if (cVarB == null) {
                return null;
            }
            long j11 = (2097152 + j10) & f135551y;
            int iW = W(cVarB);
            if (iW >= 0 && f135536j.compareAndSet(this, j10, ((long) iW) | j11)) {
                cVarB.t(f135539m);
                return cVarB;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws InterruptedException {
        n0(10000L);
    }

    public final boolean d0(@oy.l c cVar) {
        long j10;
        long j11;
        int iG;
        if (cVar.h() != f135539m) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f135536j;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            j11 = (2097152 + j10) & f135551y;
            iG = cVar.g();
            cVar.t(this.f135559h.b((int) (2097151 & j10)));
        } while (!f135536j.compareAndSet(this, j10, j11 | ((long) iG)));
        return true;
    }

    public final void e0(@oy.l c cVar, int i10, int i11) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f135536j;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            int iW = (int) (2097151 & j10);
            long j11 = (2097152 + j10) & f135551y;
            if (iW == i10) {
                iW = i11 == 0 ? W(cVar) : i11;
            }
            if (iW >= 0) {
                if (f135536j.compareAndSet(this, j10, j11 | ((long) iW))) {
                    return;
                }
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(@oy.l Runnable runnable) {
        t(this, runnable, false, false, 6, null);
    }

    public final long f0() {
        return E().addAndGet(this, 4398046511104L);
    }

    public final void g0(@oy.l i iVar) {
        try {
            iVar.run();
            jv.b bVar = jv.c.f100774a;
            if (bVar != null) {
                bVar.f();
            }
        } catch (Throwable th2) {
            try {
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th2);
            } finally {
                jv.b bVar2 = jv.c.f100774a;
                if (bVar2 != null) {
                    bVar2.f();
                }
            }
        }
    }

    public final boolean h(i iVar) {
        return iVar.f135587c ? this.f135558g.a(iVar) : this.f135557f.a(iVar);
    }

    public final int i(long j10) {
        return (int) ((j10 & f135547u) >> 42);
    }

    public final boolean isTerminated() {
        return f135538l.get(this) == 1;
    }

    public final /* synthetic */ void j0(long j10) {
        this.controlState$volatile = j10;
    }

    public final int k(long j10) {
        return (int) ((j10 & f135545s) >> 21);
    }

    public final int l() {
        synchronized (this.f135559h) {
            try {
                if (isTerminated()) {
                    return -1;
                }
                long j10 = f135537k.get(this);
                int i10 = (int) (j10 & 2097151);
                int iU = u.u(i10 - ((int) ((j10 & f135545s) >> 21)), 0);
                if (iU >= this.f135553b) {
                    return 0;
                }
                if (i10 >= this.f135554c) {
                    return 0;
                }
                int i11 = ((int) (E().get(this) & 2097151)) + 1;
                if (i11 <= 0 || this.f135559h.b(i11) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                c cVar = new c(this, i11);
                this.f135559h.c(i11, cVar);
                if (i11 != ((int) (2097151 & f135537k.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i12 = iU + 1;
                cVar.start();
                return i12;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final /* synthetic */ void l0(long j10) {
        this.parkedWorkersStack$volatile = j10;
    }

    @oy.l
    public final i m(@oy.l Runnable runnable, boolean z10) {
        long jA = k.f135594f.a();
        if (!(runnable instanceof i)) {
            return k.b(runnable, jA, z10);
        }
        i iVar = (i) runnable;
        iVar.f135586b = jA;
        iVar.f135587c = z10;
        return iVar;
    }

    public final /* synthetic */ void m0(int i10) {
        this._isTerminated$volatile = i10;
    }

    public final int n(long j10) {
        return (int) (j10 & 2097151);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005f  */
    public final void n0(long j10) throws InterruptedException {
        int i10;
        i iVarJ;
        if (f135538l.compareAndSet(this, 0, 1)) {
            c cVarO = o();
            synchronized (this.f135559h) {
                i10 = (int) (E().get(this) & 2097151);
            }
            if (1 <= i10) {
                int i11 = 1;
                while (true) {
                    c cVarB = this.f135559h.b(i11);
                    m0.m(cVarB);
                    c cVar = cVarB;
                    if (cVar != cVarO) {
                        while (cVar.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(cVar);
                            cVar.join(j10);
                        }
                        cVar.f135562b.o(this.f135558g);
                    }
                    if (i11 == i10) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            this.f135558g.b();
            this.f135557f.b();
            while (true) {
                if (cVarO == null) {
                    iVarJ = this.f135557f.j();
                    if (iVarJ == null && (iVarJ = this.f135558g.j()) == null) {
                        break;
                    }
                } else {
                    iVarJ = cVarO.f(true);
                    if (iVarJ == null) {
                        iVarJ = this.f135557f.j();
                        if (iVarJ == null) {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
                g0(iVarJ);
            }
            if (cVarO != null) {
                cVarO.x(d.TERMINATED);
            }
            f135536j.set(this, 0L);
            f135537k.set(this, 0L);
        }
    }

    public final c o() {
        Thread threadCurrentThread = Thread.currentThread();
        c cVar = threadCurrentThread instanceof c ? (c) threadCurrentThread : null;
        if (cVar == null || !m0.g(a.this, this)) {
            return null;
        }
        return cVar;
    }

    public final void o0(long j10) {
        if (A0() || y0(j10)) {
            return;
        }
        A0();
    }

    public final void p() {
        E().addAndGet(this, f135551y);
    }

    public final void p0() {
        if (A0() || z0(this, 0L, 1, null)) {
            return;
        }
        A0();
    }

    public final int q() {
        return (int) (E().getAndDecrement(this) & 2097151);
    }

    public final void r(@oy.l Runnable runnable, boolean z10, boolean z11) {
        jv.b bVar = jv.c.f100774a;
        if (bVar != null) {
            bVar.e();
        }
        i iVarM = m(runnable, z10);
        boolean z12 = iVarM.f135587c;
        long jAddAndGet = z12 ? f135537k.addAndGet(this, 2097152L) : 0L;
        i iVarV0 = v0(o(), iVarM, z11);
        if (iVarV0 != null && !h(iVarV0)) {
            throw new RejectedExecutionException(this.f135556e + " was terminated");
        }
        if (z12) {
            o0(jAddAndGet);
        } else {
            p0();
        }
    }

    @oy.l
    public String toString() {
        ArrayList arrayList = new ArrayList();
        int iA = this.f135559h.a();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 1; i15 < iA; i15++) {
            c cVarB = this.f135559h.b(i15);
            if (cVarB != null) {
                int iN = cVarB.f135562b.n();
                int i16 = b.f135560a[cVarB.f135564d.ordinal()];
                if (i16 == 1) {
                    i12++;
                } else if (i16 == 2) {
                    i11++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(iN);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (i16 == 3) {
                    i10++;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(iN);
                    sb3.append('c');
                    arrayList.add(sb3.toString());
                } else if (i16 == 4) {
                    i13++;
                    if (iN > 0) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(iN);
                        sb4.append('d');
                        arrayList.add(sb4.toString());
                    }
                } else {
                    if (i16 != 5) {
                        throw new o0();
                    }
                    i14++;
                }
            }
        }
        long j10 = f135537k.get(this);
        return this.f135556e + '@' + x0.b(this) + "[Pool Size {core = " + this.f135553b + ", max = " + this.f135554c + "}, Worker States {CPU = " + i10 + ", blocking = " + i11 + ", parked = " + i12 + ", dormant = " + i13 + ", terminated = " + i14 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f135557f.c() + ", global blocking queue size = " + this.f135558g.c() + ", Control State {created workers= " + ((int) (2097151 & j10)) + ", blocking tasks = " + ((int) ((f135545s & j10) >> 21)) + ", CPUs acquired = " + (this.f135553b - ((int) ((f135547u & j10) >> 42))) + "}]";
    }

    public final i v0(c cVar, i iVar, boolean z10) {
        d dVar;
        if (cVar == null || (dVar = cVar.f135564d) == d.TERMINATED) {
            return iVar;
        }
        if (!iVar.f135587c && dVar == d.BLOCKING) {
            return iVar;
        }
        cVar.f135568h = true;
        return cVar.f135562b.a(iVar, z10);
    }

    public final boolean w0() {
        long j10;
        AtomicLongFieldUpdater atomicLongFieldUpdaterE = E();
        do {
            j10 = atomicLongFieldUpdaterE.get(this);
            if (((int) ((f135547u & j10) >> 42)) == 0) {
                return false;
            }
        } while (!E().compareAndSet(this, j10, j10 - 4398046511104L));
        return true;
    }

    public final int y() {
        return (int) ((f135537k.get(this) & f135547u) >> 42);
    }

    public final boolean y0(long j10) {
        if (u.u(((int) (2097151 & j10)) - ((int) ((j10 & f135545s) >> 21)), 0) < this.f135553b) {
            int iL = l();
            if (iL == 1 && this.f135553b > 1) {
                l();
            }
            if (iL > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nCoroutineScheduler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler$Worker\n+ 2 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Tasks.kt\nkotlinx/coroutines/scheduling/TasksKt\n+ 5 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 6 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n*L\n1#1,1041:1\n298#2,2:1042\n286#2:1044\n300#2,4:1045\n305#2:1049\n295#2,2:1050\n295#2,2:1055\n281#2:1059\n290#2:1060\n284#2:1061\n281#2:1062\n1#3:1052\n77#4:1053\n77#4:1054\n28#5:1057\n16#6:1058\n*S KotlinDebug\n*F\n+ 1 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler$Worker\n*L\n684#1:1042,2\n684#1:1044\n684#1:1045,4\n699#1:1049\n773#1:1050,2\n821#1:1055,2\n872#1:1059\n898#1:1060\n898#1:1061\n971#1:1062\n812#1:1053\n815#1:1054\n868#1:1057\n868#1:1058\n*E\n"})
    public final class c extends Thread {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f135561j = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl$volatile");

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oy.l
        @cs.g
        public final m f135562b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @oy.l
        public final l1.h<i> f135563c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @oy.l
        @cs.g
        public d f135564d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f135565e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f135566f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f135567g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @cs.g
        public boolean f135568h;
        private volatile int indexInArray;

        @oy.m
        private volatile Object nextParkedWorker;
        private volatile /* synthetic */ int workerCtl$volatile;

        public c() {
            setDaemon(true);
            setContextClassLoader(a.this.getClass().getClassLoader());
            this.f135562b = new m();
            this.f135563c = new l1.h<>();
            this.f135564d = d.DORMANT;
            this.nextParkedWorker = a.f135539m;
            int iNanoTime = (int) System.nanoTime();
            this.f135567g = iNanoTime == 0 ? 42 : iNanoTime;
        }

        public final void b(i iVar) {
            this.f135565e = 0L;
            if (this.f135564d == d.PARKING) {
                this.f135564d = d.BLOCKING;
            }
            if (!iVar.f135587c) {
                a.this.g0(iVar);
                return;
            }
            if (x(d.BLOCKING)) {
                a.this.p0();
            }
            a.this.g0(iVar);
            a.E().addAndGet(a.this, a.f135551y);
            if (this.f135564d != d.TERMINATED) {
                this.f135564d = d.DORMANT;
            }
        }

        public final i c(boolean z10) {
            i iVarP;
            i iVarP2;
            if (z10) {
                boolean z11 = n(a.this.f135553b * 2) == 0;
                if (z11 && (iVarP2 = p()) != null) {
                    return iVarP2;
                }
                i iVarP3 = this.f135562b.p();
                if (iVarP3 != null) {
                    return iVarP3;
                }
                if (!z11 && (iVarP = p()) != null) {
                    return iVarP;
                }
            } else {
                i iVarP4 = p();
                if (iVarP4 != null) {
                    return iVarP4;
                }
            }
            return y(3);
        }

        public final i d() {
            i iVarQ = this.f135562b.q();
            if (iVarQ != null) {
                return iVarQ;
            }
            i iVarJ = a.this.f135558g.j();
            return iVarJ == null ? y(1) : iVarJ;
        }

        public final i e() {
            i iVarS = this.f135562b.s();
            if (iVarS != null) {
                return iVarS;
            }
            i iVarJ = a.this.f135558g.j();
            return iVarJ == null ? y(2) : iVarJ;
        }

        @oy.m
        public final i f(boolean z10) {
            return v() ? c(z10) : d();
        }

        public final int g() {
            return this.indexInArray;
        }

        @oy.m
        public final Object h() {
            return this.nextParkedWorker;
        }

        @oy.l
        public final a i() {
            return a.this;
        }

        public final /* synthetic */ int j() {
            return this.workerCtl$volatile;
        }

        public final boolean l() {
            return this.nextParkedWorker != a.f135539m;
        }

        public final boolean m() {
            return this.f135564d == d.BLOCKING;
        }

        public final int n(int i10) {
            int i11 = this.f135567g;
            int i12 = i11 ^ (i11 << 13);
            int i13 = i12 ^ (i12 >> 17);
            int i14 = i13 ^ (i13 << 5);
            this.f135567g = i14;
            int i15 = i10 - 1;
            return (i15 & i10) == 0 ? i14 & i15 : (i14 & Integer.MAX_VALUE) % i10;
        }

        public final void o() {
            if (this.f135565e == 0) {
                this.f135565e = System.nanoTime() + a.this.f135555d;
            }
            LockSupport.parkNanos(a.this.f135555d);
            if (System.nanoTime() - this.f135565e >= 0) {
                this.f135565e = 0L;
                z();
            }
        }

        public final i p() {
            if (n(2) == 0) {
                i iVarJ = a.this.f135557f.j();
                return iVarJ != null ? iVarJ : a.this.f135558g.j();
            }
            i iVarJ2 = a.this.f135558g.j();
            return iVarJ2 != null ? iVarJ2 : a.this.f135557f.j();
        }

        public final long q() {
            boolean z10 = this.f135564d == d.CPU_ACQUIRED;
            i iVarE = z10 ? e() : d();
            if (iVarE == null) {
                long j10 = this.f135566f;
                if (j10 == 0) {
                    return -1L;
                }
                return j10;
            }
            a.this.g0(iVarE);
            if (!z10) {
                a.E().addAndGet(a.this, a.f135551y);
            }
            return 0L;
        }

        public final void r() {
            loop0: while (true) {
                boolean z10 = false;
                while (true) {
                    if (a.this.isTerminated() || this.f135564d == d.TERMINATED) {
                        break loop0;
                    }
                    i iVarF = f(this.f135568h);
                    if (iVarF != null) {
                        this.f135566f = 0L;
                        b(iVarF);
                        break;
                    }
                    this.f135568h = false;
                    if (this.f135566f == 0) {
                        w();
                    } else {
                        if (z10) {
                            x(d.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f135566f);
                            this.f135566f = 0L;
                            break;
                        }
                        z10 = true;
                    }
                }
            }
            x(d.TERMINATED);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            r();
        }

        public final void s(int i10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(a.this.f135556e);
            sb2.append("-worker-");
            sb2.append(i10 == 0 ? "TERMINATED" : String.valueOf(i10));
            setName(sb2.toString());
            this.indexInArray = i10;
        }

        public final void t(@oy.m Object obj) {
            this.nextParkedWorker = obj;
        }

        public final /* synthetic */ void u(int i10) {
            this.workerCtl$volatile = i10;
        }

        public final boolean v() {
            long j10;
            if (this.f135564d == d.CPU_ACQUIRED) {
                return true;
            }
            a aVar = a.this;
            AtomicLongFieldUpdater atomicLongFieldUpdaterE = a.E();
            do {
                j10 = atomicLongFieldUpdaterE.get(aVar);
                if (((int) ((a.f135547u & j10) >> 42)) == 0) {
                    return false;
                }
            } while (!a.E().compareAndSet(aVar, j10, j10 - 4398046511104L));
            this.f135564d = d.CPU_ACQUIRED;
            return true;
        }

        public final void w() {
            if (!l()) {
                a.this.d0(this);
                return;
            }
            f135561j.set(this, -1);
            while (l() && f135561j.get(this) == -1 && !a.this.isTerminated() && this.f135564d != d.TERMINATED) {
                x(d.PARKING);
                Thread.interrupted();
                o();
            }
        }

        public final boolean x(@oy.l d dVar) {
            d dVar2 = this.f135564d;
            boolean z10 = dVar2 == d.CPU_ACQUIRED;
            if (z10) {
                a.E().addAndGet(a.this, 4398046511104L);
            }
            if (dVar2 != dVar) {
                this.f135564d = dVar;
            }
            return z10;
        }

        public final i y(int i10) {
            int i11 = (int) (a.E().get(a.this) & 2097151);
            if (i11 < 2) {
                return null;
            }
            int iN = n(i11);
            a aVar = a.this;
            long jMin = Long.MAX_VALUE;
            for (int i12 = 0; i12 < i11; i12++) {
                iN++;
                if (iN > i11) {
                    iN = 1;
                }
                c cVarB = aVar.f135559h.b(iN);
                if (cVarB != null && cVarB != this) {
                    long jB = cVarB.f135562b.B(i10, this.f135563c);
                    if (jB == -1) {
                        l1.h<i> hVar = this.f135563c;
                        i iVar = hVar.f102749b;
                        hVar.f102749b = null;
                        return iVar;
                    }
                    if (jB > 0) {
                        jMin = Math.min(jMin, jB);
                    }
                }
            }
            if (jMin == Long.MAX_VALUE) {
                jMin = 0;
            }
            this.f135566f = jMin;
            return null;
        }

        public final void z() {
            a aVar = a.this;
            synchronized (aVar.f135559h) {
                try {
                    if (aVar.isTerminated()) {
                        return;
                    }
                    if (((int) (a.E().get(aVar) & 2097151)) <= aVar.f135553b) {
                        return;
                    }
                    if (f135561j.compareAndSet(this, -1, 1)) {
                        int i10 = this.indexInArray;
                        s(0);
                        aVar.e0(this, i10, 0);
                        int andDecrement = (int) (2097151 & a.E().getAndDecrement(aVar));
                        if (andDecrement != i10) {
                            c cVarB = aVar.f135559h.b(andDecrement);
                            m0.m(cVarB);
                            c cVar = cVarB;
                            aVar.f135559h.c(i10, cVar);
                            cVar.s(i10);
                            aVar.e0(cVar, andDecrement, i10);
                        }
                        aVar.f135559h.c(andDecrement, null);
                        w2 w2Var = w2.f79517a;
                        this.f135564d = d.TERMINATED;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public c(a aVar, int i10) {
            this();
            s(i10);
        }
    }

    public /* synthetic */ a(int i10, int i11, long j10, String str, int i12, x xVar) {
        this(i10, i11, (i12 & 4) != 0 ? k.f135593e : j10, (i12 & 8) != 0 ? k.f135589a : str);
    }
}
