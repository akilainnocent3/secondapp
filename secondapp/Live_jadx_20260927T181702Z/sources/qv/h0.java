package qv;

import dr.w2;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.s1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@s1({"SMAP\nLockFreeTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LockFreeTaskQueue.kt\nkotlinx/coroutines/internal/LockFreeTaskQueueCore\n+ 2 LockFreeTaskQueue.kt\nkotlinx/coroutines/internal/LockFreeTaskQueueCore$Companion\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,304:1\n295#2,3:305\n295#2,3:308\n295#2,3:311\n295#2,3:314\n295#2,3:317\n295#2,3:321\n295#2,3:324\n1#3:320\n*S KotlinDebug\n*F\n+ 1 LockFreeTaskQueue.kt\nkotlinx/coroutines/internal/LockFreeTaskQueueCore\n*L\n87#1:305,3\n88#1:308,3\n103#1:311,3\n163#1:314,3\n196#1:317,3\n227#1:321,3\n243#1:324,3\n*E\n"})
public final class h0<E> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f122967h = 8;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f122968i = 30;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f122969j = 1073741823;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f122970k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final long f122971l = 1073741823;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f122972m = 30;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final long f122973n = 1152921503533105152L;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f122974o = 60;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final long f122975p = 1152921504606846976L;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f122976q = 61;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final long f122977r = 2305843009213693952L;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f122978s = 1024;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f122980u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f122981v = 1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f122982w = 2;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f122983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f122984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f122985c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f122986d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oy.l
    public static final a f122964e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f122965f = AtomicReferenceFieldUpdater.newUpdater(h0.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f122966g = AtomicLongFieldUpdater.newUpdater(h0.class, "_state$volatile");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @oy.l
    @cs.g
    public static final z0 f122979t = new z0("REMOVE_FROZEN");

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
            this();
        }

        public final int a(long j10) {
            return (j10 & h0.f122977r) != 0 ? 2 : 1;
        }

        public final long b(long j10, int i10) {
            return e(j10, h0.f122971l) | ((long) i10);
        }

        public final long c(long j10, int i10) {
            return e(j10, h0.f122973n) | (((long) i10) << 30);
        }

        public final <T> T d(long j10, @oy.l ds.p<? super Integer, ? super Integer, ? extends T> pVar) {
            return pVar.invoke(Integer.valueOf((int) (h0.f122971l & j10)), Integer.valueOf((int) ((j10 & h0.f122973n) >> 30)));
        }

        public final long e(long j10, long j11) {
            return j10 & (~j11);
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @cs.g
        public final int f122987a;

        public b(int i10) {
            this.f122987a = i10;
        }
    }

    public h0(int i10, boolean z10) {
        this.f122983a = i10;
        this.f122984b = z10;
        int i11 = i10 - 1;
        this.f122985c = i11;
        this.f122986d = new AtomicReferenceArray(i10);
        if (i11 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i10 & i11) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final int a(@oy.l E e10) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f122966g;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j10) != 0) {
                return f122964e.a(j10);
            }
            int i10 = (int) (f122971l & j10);
            int i11 = (int) ((f122973n & j10) >> 30);
            int i12 = this.f122985c;
            if (((i11 + 2) & i12) == (i10 & i12)) {
                return 1;
            }
            if (!this.f122984b && f().get(i11 & i12) != null) {
                int i13 = this.f122983a;
                if (i13 < 1024 || ((i11 - i10) & 1073741823) > (i13 >> 1)) {
                    return 1;
                }
            } else if (f122966g.compareAndSet(this, j10, f122964e.c(j10, (i11 + 1) & 1073741823))) {
                f().set(i11 & i12, e10);
                h0<E> h0VarE = this;
                while ((f122966g.get(h0VarE) & f122975p) != 0 && (h0VarE = h0VarE.r().e(i11, e10)) != null) {
                }
                return 0;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final h0<E> b(long j10) {
        h0<E> h0Var = new h0<>(this.f122983a * 2, this.f122984b);
        int i10 = (int) (f122971l & j10);
        int i11 = (int) ((f122973n & j10) >> 30);
        while (true) {
            int i12 = this.f122985c;
            if ((i10 & i12) == (i12 & i11)) {
                f122966g.set(h0Var, f122964e.e(j10, f122975p));
                return h0Var;
            }
            Object bVar = f().get(this.f122985c & i10);
            if (bVar == null) {
                bVar = new b(i10);
            }
            h0Var.f().set(h0Var.f122985c & i10, bVar);
            i10++;
        }
    }

    public final h0<E> c(long j10) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f122965f;
        while (true) {
            h0<E> h0Var = (h0) atomicReferenceFieldUpdater.get(this);
            if (h0Var != null) {
                return h0Var;
            }
            h0.b.a(f122965f, this, null, b(j10));
        }
    }

    public final boolean d() {
        long j10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f122966g;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            if ((j10 & f122977r) != 0) {
                return true;
            }
            if ((f122975p & j10) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, f122977r | j10));
        return true;
    }

    public final h0<E> e(int i10, E e10) {
        Object obj = f().get(this.f122985c & i10);
        if (!(obj instanceof b) || ((b) obj).f122987a != i10) {
            return null;
        }
        f().set(i10 & this.f122985c, e10);
        return this;
    }

    public final /* synthetic */ AtomicReferenceArray f() {
        return this.f122986d;
    }

    public final int g() {
        long j10 = f122966g.get(this);
        return (((int) ((j10 & f122973n) >> 30)) - ((int) (f122971l & j10))) & 1073741823;
    }

    public final /* synthetic */ Object h() {
        return this._next$volatile;
    }

    public final /* synthetic */ long j() {
        return this._state$volatile;
    }

    public final boolean l() {
        return (f122966g.get(this) & f122977r) != 0;
    }

    public final boolean m() {
        long j10 = f122966g.get(this);
        return ((int) (f122971l & j10)) == ((int) ((j10 & f122973n) >> 30));
    }

    public final /* synthetic */ void n(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, ds.l<Object, w2> lVar) {
        while (true) {
            lVar.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    public final /* synthetic */ void o(AtomicLongFieldUpdater atomicLongFieldUpdater, Object obj, ds.l<? super Long, w2> lVar) {
        while (true) {
            lVar.invoke(Long.valueOf(atomicLongFieldUpdater.get(obj)));
        }
    }

    @oy.l
    public final <R> List<R> p(@oy.l ds.l<? super E, ? extends R> lVar) {
        ArrayList arrayList = new ArrayList(this.f122983a);
        long j10 = f122966g.get(this);
        int i10 = (int) (f122971l & j10);
        int i11 = (int) ((j10 & f122973n) >> 30);
        while (true) {
            int i12 = this.f122985c;
            if ((i10 & i12) == (i12 & i11)) {
                return arrayList;
            }
            a0.b.a aVar = (Object) f().get(this.f122985c & i10);
            if (aVar != null && !(aVar instanceof b)) {
                arrayList.add(lVar.invoke(aVar));
            }
            i10++;
        }
    }

    public final long q() {
        long j10;
        long j11;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f122966g;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            if ((j10 & f122975p) != 0) {
                return j10;
            }
            j11 = f122975p | j10;
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, j11));
        return j11;
    }

    @oy.l
    public final h0<E> r() {
        return c(q());
    }

    @oy.m
    public final Object s() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f122966g;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            if ((f122975p & j10) != 0) {
                return f122979t;
            }
            int i10 = (int) (f122971l & j10);
            int i11 = (int) ((f122973n & j10) >> 30);
            int i12 = this.f122985c;
            if ((i11 & i12) == (i12 & i10)) {
                return null;
            }
            Object obj = f().get(this.f122985c & i10);
            if (obj == null) {
                if (this.f122984b) {
                    return null;
                }
            } else {
                if (obj instanceof b) {
                    return null;
                }
                int i13 = (i10 + 1) & 1073741823;
                if (f122966g.compareAndSet(this, j10, f122964e.b(j10, i13))) {
                    f().set(this.f122985c & i10, null);
                    return obj;
                }
                if (this.f122984b) {
                    h0<E> h0VarT = this;
                    do {
                        h0VarT = h0VarT.t(i10, i13);
                    } while (h0VarT != null);
                    return obj;
                }
            }
        }
    }

    public final h0<E> t(int i10, int i11) {
        long j10;
        int i12;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f122966g;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            i12 = (int) (f122971l & j10);
            if ((f122975p & j10) != 0) {
                return r();
            }
        } while (!f122966g.compareAndSet(this, j10, f122964e.b(j10, i11)));
        f().set(this.f122985c & i12, null);
        return null;
    }

    public final /* synthetic */ void u(Object obj) {
        this._next$volatile = obj;
    }

    public final /* synthetic */ void v(long j10) {
        this._state$volatile = j10;
    }

    public final /* synthetic */ void w(AtomicLongFieldUpdater atomicLongFieldUpdater, Object obj, ds.l<? super Long, Long> lVar) {
        while (true) {
            long j10 = atomicLongFieldUpdater.get(obj);
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = atomicLongFieldUpdater;
            Object obj2 = obj;
            if (atomicLongFieldUpdater2.compareAndSet(obj2, j10, lVar.invoke(Long.valueOf(j10)).longValue())) {
                return;
            }
            atomicLongFieldUpdater = atomicLongFieldUpdater2;
            obj = obj2;
        }
    }

    public final /* synthetic */ long x(AtomicLongFieldUpdater atomicLongFieldUpdater, Object obj, ds.l<? super Long, Long> lVar) {
        while (true) {
            long j10 = atomicLongFieldUpdater.get(obj);
            Long lInvoke = lVar.invoke(Long.valueOf(j10));
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = atomicLongFieldUpdater;
            Object obj2 = obj;
            if (atomicLongFieldUpdater2.compareAndSet(obj2, j10, lInvoke.longValue())) {
                return lInvoke.longValue();
            }
            atomicLongFieldUpdater = atomicLongFieldUpdater2;
            obj = obj2;
        }
    }
}
