package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes8.dex */
public class tb5<E> implements l67<E> {
    public static final /* synthetic */ long A;
    public static final /* synthetic */ long B;
    public static final /* synthetic */ long C;
    public static final /* synthetic */ long D;
    public static final /* synthetic */ long E;
    public static final /* synthetic */ long F;
    public static final /* synthetic */ AtomicLongFieldUpdater d = AtomicLongFieldUpdater.newUpdater(tb5.class, "sendersAndCloseStatus$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater e;
    public static final /* synthetic */ AtomicLongFieldUpdater f;
    public static final /* synthetic */ AtomicLongFieldUpdater i;
    public static final /* synthetic */ AtomicReferenceFieldUpdater v;
    public static final /* synthetic */ long w;
    public static final /* synthetic */ long y;
    public static final /* synthetic */ long z;
    private volatile /* synthetic */ Object _closeCause$volatile;
    public final int a;
    public final Function1<E, Unit> b;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    public final qb5 c;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    public final class a implements c77<E>, bwi0 {
        public Object a = zb5.p;
        public bc6<? super Boolean> b;

        public a() {
        }

        @Override // defpackage.bwi0
        public final void a(f580<?> f580Var, int i) {
            bc6<? super Boolean> bc6Var = this.b;
            if (bc6Var != null) {
                bc6Var.a(f580Var, i);
            }
        }

        @Override // defpackage.c77
        public final Object b(v1b<? super Boolean> v1bVar) throws Throwable {
            i77<E> i77VarQ;
            Boolean bool;
            Object obj = this.a;
            boolean z = true;
            if (obj == zb5.p || obj == zb5.l) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = tb5.v;
                tb5<E> tb5Var = tb5.this;
                i77<E> i77Var = (i77) atomicReferenceFieldUpdater.get(tb5Var);
                while (!tb5Var.B()) {
                    long andIncrement = tb5.e.getAndIncrement(tb5Var);
                    int i = zb5.b;
                    long j = andIncrement / ((long) i);
                    int i2 = (int) (andIncrement % ((long) i));
                    if (i77Var.d != j) {
                        i77VarQ = tb5Var.q(j, i77Var);
                        if (i77VarQ == null) {
                            continue;
                        }
                    } else {
                        i77VarQ = i77Var;
                    }
                    Object objM = tb5Var.M(i77VarQ, i2, andIncrement, null);
                    i77<E> i77Var2 = i77VarQ;
                    toe0 toe0Var = zb5.m;
                    rb5 rb5Var = null;
                    if (objM == toe0Var) {
                        ib5.a("unreachable");
                        return null;
                    }
                    toe0 toe0Var2 = zb5.o;
                    if (objM == toe0Var2) {
                        if (andIncrement < tb5Var.x()) {
                            i77Var2.a();
                        }
                        i77Var = i77Var2;
                    } else {
                        if (objM == zb5.n) {
                            tb5<E> tb5Var2 = tb5.this;
                            bc6<? super Boolean> bc6VarA = dc6.a(yzo.b(v1bVar));
                            try {
                                this.b = bc6VarA;
                                Object objM2 = tb5Var2.M(i77Var2, i2, andIncrement, this);
                                Function1<E, Unit> function1 = tb5Var2.b;
                                if (objM2 != toe0Var) {
                                    if (objM2 == toe0Var2) {
                                        if (andIncrement < tb5Var2.x()) {
                                            i77Var2.a();
                                        }
                                        i77<E> i77Var3 = (i77) tb5.v.get(tb5Var2);
                                        while (true) {
                                            if (tb5Var2.B()) {
                                                bc6<? super Boolean> bc6Var = this.b;
                                                bc6Var.getClass();
                                                this.b = null;
                                                this.a = zb5.l;
                                                Throwable thT = tb5Var.t();
                                                if (thT != null) {
                                                    zi50.a aVar = zi50.b;
                                                    bc6Var.resumeWith(new zi50.b(thT));
                                                    break;
                                                }
                                                zi50.a aVar2 = zi50.b;
                                                bc6Var.resumeWith(Boolean.FALSE);
                                                break;
                                            }
                                            long andIncrement2 = tb5.e.getAndIncrement(tb5Var2);
                                            long j2 = zb5.b;
                                            long j3 = andIncrement2 / j2;
                                            int i3 = (int) (andIncrement2 % j2);
                                            if (i77Var3.d != j3) {
                                                i77<E> i77VarQ2 = tb5Var2.q(j3, i77Var3);
                                                if (i77VarQ2 != null) {
                                                    i77Var3 = i77VarQ2;
                                                }
                                            }
                                            Object objM3 = tb5Var2.M(i77Var3, i3, andIncrement2, this);
                                            if (objM3 == zb5.m) {
                                                a(i77Var3, i3);
                                                break;
                                            }
                                            if (objM3 == zb5.o) {
                                                if (andIncrement2 < tb5Var2.x()) {
                                                    i77Var3.a();
                                                }
                                            } else {
                                                if (objM3 == zb5.n) {
                                                    throw new IllegalStateException("unexpected");
                                                }
                                                i77Var3.a();
                                                this.a = objM3;
                                                this.b = null;
                                                bool = Boolean.TRUE;
                                                if (function1 != null) {
                                                    rb5Var = new rb5(objM3, function1);
                                                }
                                            }
                                        }
                                    } else {
                                        i77Var2.a();
                                        this.a = objM2;
                                        this.b = null;
                                        bool = Boolean.TRUE;
                                        if (function1 != null) {
                                            rb5Var = new rb5(objM2, function1);
                                        }
                                    }
                                    bc6VarA.s(bool, rb5Var);
                                    break;
                                }
                                a(i77Var2, i2);
                                Object objO = bc6VarA.o();
                                y5b y5bVar = y5b.a;
                                return objO;
                            } catch (Throwable th) {
                                bc6VarA.A();
                                throw th;
                            }
                        }
                        i77Var2.a();
                        this.a = objM;
                    }
                }
                this.a = zb5.l;
                Throwable thT2 = tb5Var.t();
                if (thT2 != null) {
                    int i4 = dld0.a;
                    throw thT2;
                }
                z = false;
            }
            return Boolean.valueOf(z);
        }

        @Override // defpackage.c77
        public final E next() throws Throwable {
            E e = (E) this.a;
            toe0 toe0Var = zb5.p;
            if (e == toe0Var) {
                ib5.a("`hasNext()` has not been invoked");
                return null;
            }
            this.a = toe0Var;
            if (e != zb5.l) {
                return e;
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater = tb5.d;
            Throwable thU = tb5.this.u();
            int i = dld0.a;
            throw thU;
        }
    }

    public static final class b implements bwi0 {
    }

    public /* synthetic */ class c extends saj implements gaj<tb5<?>, a780<?>, Object, Unit> {
        public static final c a = new c(3, tb5.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

        @Override // defpackage.gaj
        public final Unit invoke(tb5<?> tb5Var, a780<?> a780Var, Object obj) {
            i77<?> i77Var;
            tb5<?> tb5Var2 = tb5Var;
            a780<?> a780Var2 = a780Var;
            AtomicLongFieldUpdater atomicLongFieldUpdater = tb5.d;
            tb5Var2.getClass();
            i77<?> i77Var2 = (i77) s0o.a.getObjectVolatile(tb5Var2, tb5.C);
            while (!tb5Var2.B()) {
                long andIncrement = tb5.e.getAndIncrement(tb5Var2);
                long j = zb5.b;
                long j2 = andIncrement / j;
                int i = (int) (andIncrement % j);
                if (i77Var2.d != j2) {
                    i77<?> i77VarQ = tb5Var2.q(j2, i77Var2);
                    if (i77VarQ == null) {
                        continue;
                    } else {
                        i77Var = i77VarQ;
                    }
                } else {
                    i77Var = i77Var2;
                }
                Object objM = tb5Var2.M(i77Var, i, andIncrement, a780Var2);
                i77<?> i77Var3 = i77Var;
                if (objM == zb5.m) {
                    bwi0 bwi0Var = a780Var2 instanceof bwi0 ? (bwi0) a780Var2 : null;
                    if (bwi0Var != null) {
                        bwi0Var.a(i77Var3, i);
                    }
                } else if (objM == zb5.o) {
                    if (andIncrement < tb5Var2.x()) {
                        i77Var3.a();
                    }
                    i77Var2 = i77Var3;
                } else {
                    if (objM == zb5.n) {
                        ib5.a("unexpected");
                        return null;
                    }
                    i77Var3.a();
                    a780Var2.c(objM);
                }
                return Unit.a;
            }
            a780Var2.c(zb5.l);
            return Unit.a;
        }
    }

    public /* synthetic */ class d extends saj implements gaj<tb5<?>, Object, Object, Object> {
        public static final d a = new d(3, tb5.class, "processResultSelectReceiveCatching", "processResultSelectReceiveCatching(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);

        @Override // defpackage.gaj
        public final Object invoke(tb5<?> tb5Var, Object obj, Object obj2) {
            tb5<?> tb5Var2 = tb5Var;
            AtomicLongFieldUpdater atomicLongFieldUpdater = tb5.d;
            tb5Var2.getClass();
            if (obj2 == zb5.l) {
                obj2 = new h77.a(tb5Var2.t());
            }
            return new h77(obj2);
        }
    }

    static {
        Unsafe unsafe = s0o.a;
        F = unsafe.objectFieldOffset(tb5.class.getDeclaredField("sendersAndCloseStatus$volatile"));
        e = AtomicLongFieldUpdater.newUpdater(tb5.class, "receivers$volatile");
        D = unsafe.objectFieldOffset(tb5.class.getDeclaredField("receivers$volatile"));
        f = AtomicLongFieldUpdater.newUpdater(tb5.class, "bufferEnd$volatile");
        y = unsafe.objectFieldOffset(tb5.class.getDeclaredField("bufferEnd$volatile"));
        i = AtomicLongFieldUpdater.newUpdater(tb5.class, "completedExpandBuffersAndPauseFlag$volatile");
        B = unsafe.objectFieldOffset(tb5.class.getDeclaredField("completedExpandBuffersAndPauseFlag$volatile"));
        E = unsafe.objectFieldOffset(tb5.class.getDeclaredField("sendSegment$volatile"));
        v = AtomicReferenceFieldUpdater.newUpdater(tb5.class, Object.class, "receiveSegment$volatile");
        C = unsafe.objectFieldOffset(tb5.class.getDeclaredField("receiveSegment$volatile"));
        z = unsafe.objectFieldOffset(tb5.class.getDeclaredField("bufferEndSegment$volatile"));
        w = unsafe.objectFieldOffset(tb5.class.getDeclaredField("_closeCause$volatile"));
        A = unsafe.objectFieldOffset(tb5.class.getDeclaredField("closeHandler$volatile"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public tb5(int i2, Function1<? super E, Unit> function1) {
        long j;
        this.a = i2;
        this.b = function1;
        if (i2 < 0) {
            kb5.a(pe4.b(i2, "Invalid channel capacity: ", ", should be >=0"));
            throw null;
        }
        i77<Object> i77Var = zb5.a;
        if (i2 != 0) {
            j = i2 != Integer.MAX_VALUE ? i2 : Long.MAX_VALUE;
        } else {
            j = 0;
        }
        this.bufferEnd$volatile = j;
        this.completedExpandBuffersAndPauseFlag$volatile = s();
        i77<Object> i77Var2 = new i77<>(0L, null, this, 3);
        this.sendSegment$volatile = i77Var2;
        this.receiveSegment$volatile = i77Var2;
        if (D()) {
            i77Var2 = zb5.a;
            i77Var2.getClass();
        }
        this.bufferEndSegment$volatile = i77Var2;
        this.c = function1 != 0 ? new gaj() { // from class: qb5
            @Override // defpackage.gaj
            public final Object invoke(Object obj, Object obj2, final Object obj3) {
                final a780 a780Var = (a780) obj;
                final tb5 tb5Var = this.a;
                return new gaj() { // from class: sb5
                    @Override // defpackage.gaj
                    public final Object invoke(Object obj4, Object obj5, Object obj6) {
                        toe0 toe0Var = zb5.l;
                        Object obj7 = obj3;
                        if (obj7 != toe0Var) {
                            lpy.a(tb5Var.b, obj7, a780Var.getContext());
                        }
                        return Unit.a;
                    }
                };
            }
        } : 0;
        this._closeCause$volatile = zb5.s;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static Object H(tb5 tb5Var, x1b x1bVar) throws Throwable {
        wb5 wb5Var;
        i77<E> i77Var;
        if (x1bVar instanceof wb5) {
            wb5Var = (wb5) x1bVar;
            int i2 = wb5Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wb5Var.c = i2 - Integer.MIN_VALUE;
            } else {
                wb5Var = new wb5(tb5Var, x1bVar);
            }
        } else {
            wb5Var = new wb5(tb5Var, x1bVar);
        }
        wb5 wb5Var2 = wb5Var;
        Object obj = wb5Var2.a;
        y5b y5bVar = y5b.a;
        int i3 = wb5Var2.c;
        if (i3 != 0) {
            if (i3 == 1) {
                uj50.b(obj);
                return ((h77) obj).a;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        i77<E> i77Var2 = (i77) s0o.a.getObjectVolatile(tb5Var, C);
        while (!tb5Var.B()) {
            long andIncrement = e.getAndIncrement(tb5Var);
            long j = zb5.b;
            long j2 = andIncrement / j;
            int i4 = (int) (andIncrement % j);
            if (i77Var2.d != j2) {
                i77<E> i77VarQ = tb5Var.q(j2, i77Var2);
                if (i77VarQ == null) {
                    continue;
                } else {
                    i77Var = i77VarQ;
                }
            } else {
                i77Var = i77Var2;
            }
            tb5 tb5Var2 = tb5Var;
            Object objM = tb5Var2.M(i77Var, i4, andIncrement, null);
            if (objM == zb5.m) {
                ib5.a("unexpected");
                return null;
            }
            if (objM != zb5.o) {
                if (objM != zb5.n) {
                    i77Var.a();
                    return objM;
                }
                wb5Var2.c = 1;
                Object objI = tb5Var2.I(i77Var, i4, andIncrement, wb5Var2);
                return objI == y5bVar ? y5bVar : objI;
            }
            if (andIncrement < tb5Var2.x()) {
                i77Var.a();
            }
            tb5Var = tb5Var2;
            i77Var2 = i77Var;
        }
        return new h77.a(tb5Var.t());
    }

    public final boolean A(long j, boolean z2) {
        tb5<E> tb5Var = this;
        int i2 = (int) (j >> 60);
        if (i2 != 0 && i2 != 1) {
            if (i2 == 2) {
                tb5Var.n(j & 1152921504606846975L);
                if (z2) {
                    while (true) {
                        Unsafe unsafe = s0o.a;
                        long j2 = C;
                        i77<E> i77VarQ = (i77) unsafe.getObjectVolatile(tb5Var, j2);
                        long jV = tb5Var.v();
                        if (tb5Var.x() <= jV) {
                            break;
                        }
                        long j3 = zb5.b;
                        long j4 = jV / j3;
                        if (i77VarQ.d != j4 && (i77VarQ = tb5Var.q(j4, i77VarQ)) == null) {
                            if (((i77) unsafe.getObjectVolatile(tb5Var, j2)).d < j4) {
                                break;
                            }
                        } else {
                            i77VarQ.a();
                            int i3 = (int) (jV % j3);
                            while (true) {
                                Object objL = i77VarQ.l(i3);
                                if (objL != null && objL != zb5.e) {
                                    if (objL != zb5.d && (objL == zb5.j || objL == zb5.l || objL == zb5.i || objL == zb5.h || (objL != zb5.g && (objL == zb5.f || jV != tb5Var.v())))) {
                                        break;
                                        break;
                                        break;
                                        break;
                                        break;
                                        break;
                                    }
                                } else {
                                    if (i77VarQ.k(i3, objL, zb5.h)) {
                                        tb5Var.p();
                                        break;
                                    }
                                    tb5Var = this;
                                }
                            }
                            s0o.a.compareAndSwapLong(tb5Var, D, jV, 1 + jV);
                            tb5Var = this;
                        }
                    }
                }
            } else {
                if (i2 != 3) {
                    q1b.a(hce0.a(i2, "unexpected close status: "));
                    return false;
                }
                i77<E> i77VarN = tb5Var.n(j & 1152921504606846975L);
                jdh0 jdh0VarB = null;
                Object objA = null;
                loop0: do {
                    AtomicReferenceArray atomicReferenceArray = i77VarN.v;
                    for (int i4 = zb5.b - 1; -1 < i4; i4--) {
                        long j5 = (i77VarN.d * ((long) zb5.b)) + ((long) i4);
                        while (true) {
                            Object objL2 = i77VarN.l(i4);
                            if (objL2 == zb5.i) {
                                break loop0;
                            }
                            toe0 toe0Var = zb5.d;
                            Function1<E, Unit> function1 = tb5Var.b;
                            if (objL2 != toe0Var) {
                                if (objL2 != zb5.e && objL2 != null) {
                                    if (!(objL2 instanceof bwi0) && !(objL2 instanceof cwi0)) {
                                        toe0 toe0Var2 = zb5.g;
                                        if (objL2 == toe0Var2 || objL2 == zb5.f) {
                                            break loop0;
                                        }
                                        if (objL2 != toe0Var2) {
                                            break;
                                        }
                                    } else {
                                        if (j5 < tb5Var.v()) {
                                            break loop0;
                                        }
                                        bwi0 bwi0Var = objL2 instanceof cwi0 ? ((cwi0) objL2).a : (bwi0) objL2;
                                        if (i77VarN.k(i4, objL2, zb5.l)) {
                                            if (function1 != null) {
                                                jdh0VarB = lpy.b(function1, atomicReferenceArray.get(i4 * 2), jdh0VarB);
                                            }
                                            objA = bln.a(objA, bwi0Var);
                                            i77VarN.n(i4, null);
                                            i77VarN.i();
                                            break;
                                        }
                                    }
                                } else {
                                    if (i77VarN.k(i4, objL2, zb5.l)) {
                                        i77VarN.i();
                                        break;
                                    }
                                }
                            } else {
                                if (j5 < tb5Var.v()) {
                                    break loop0;
                                }
                                if (i77VarN.k(i4, objL2, zb5.l)) {
                                    if (function1 != null) {
                                        jdh0VarB = lpy.b(function1, atomicReferenceArray.get(i4 * 2), jdh0VarB);
                                    }
                                    i77VarN.n(i4, null);
                                    i77VarN.i();
                                    break;
                                }
                            }
                        }
                    }
                    i77VarN = (i77) ((doa) s0o.a.getObjectVolatile(i77VarN, doa.b));
                } while (i77VarN != null);
                if (objA != null) {
                    if (objA instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) objA;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            tb5Var.J((bwi0) arrayList.get(size), false);
                        }
                    } else {
                        tb5Var.J((bwi0) objA, false);
                    }
                }
                if (jdh0VarB != null) {
                    throw jdh0VarB;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean B() {
        return A(s0o.a.getLongVolatile(this, F), true);
    }

    public boolean C() {
        return false;
    }

    public final boolean D() {
        long jS = s();
        return jS == 0 || jS == Long.MAX_VALUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void E(long j, i77<E> i77Var) {
        tb5<E> tb5Var;
        i77<E> i77Var2;
        i77<E> i77Var3;
        while (i77Var.d < j && (i77Var3 = (i77) i77Var.c()) != null) {
            i77Var = i77Var3;
        }
        while (true) {
            i77<E> i77Var4 = i77Var;
            while (i77Var4.d() && (i77Var2 = (i77) i77Var4.c()) != null) {
                i77Var4 = i77Var2;
            }
            while (true) {
                Unsafe unsafe = s0o.a;
                long j2 = z;
                f580 f580Var = (f580) unsafe.getObjectVolatile(this, j2);
                if (f580Var.d >= i77Var4.d) {
                    return;
                }
                if (!i77Var4.j()) {
                    break;
                }
                while (true) {
                    Unsafe unsafe2 = s0o.a;
                    tb5Var = this;
                    if (unsafe2.compareAndSwapObject(tb5Var, z, f580Var, i77Var4)) {
                        if (f580Var.f()) {
                            f580Var.e();
                            return;
                        }
                        return;
                    } else if (unsafe2.getObjectVolatile(tb5Var, j2) != f580Var) {
                        break;
                    } else {
                        this = tb5Var;
                    }
                }
                if (i77Var4.f()) {
                    i77Var4.e();
                }
                this = tb5Var;
            }
            i77Var = i77Var4;
        }
    }

    public final Object F(v1b v1bVar, Object obj) throws Throwable {
        jdh0 jdh0VarB;
        bc6 bc6Var = new bc6(1, yzo.b(v1bVar));
        bc6Var.q();
        Function1<E, Unit> function1 = this.b;
        if (function1 == null || (jdh0VarB = lpy.b(function1, obj, null)) == null) {
            Throwable thW = w();
            zi50.a aVar = zi50.b;
            bc6Var.resumeWith(new zi50.b(thW));
        } else {
            rtg.a(jdh0VarB, w());
            zi50.a aVar2 = zi50.b;
            bc6Var.resumeWith(new zi50.b(jdh0VarB));
        }
        Object objO = bc6Var.o();
        return objO == y5b.a ? objO : Unit.a;
    }

    public final void G(bc6 bc6Var, Object obj) {
        Function1<E, Unit> function1 = this.b;
        if (function1 != null) {
            lpy.a(function1, obj, bc6Var.e);
        }
        Throwable thW = w();
        zi50.a aVar = zi50.b;
        bc6Var.resumeWith(new zi50.b(thW));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object I(i77 i77Var, int i2, long j, x1b x1bVar) throws Throwable {
        xb5 xb5Var;
        h77 h77Var;
        i77<E> i77Var2;
        if (x1bVar instanceof xb5) {
            xb5Var = (xb5) x1bVar;
            int i3 = xb5Var.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                xb5Var.c = i3 - Integer.MIN_VALUE;
            } else {
                xb5Var = new xb5(this, x1bVar);
            }
        } else {
            xb5Var = new xb5(this, x1bVar);
        }
        Object objO = xb5Var.a;
        y5b y5bVar = y5b.a;
        int i4 = xb5Var.c;
        vb5 vb5Var = null;
        if (i4 == 0) {
            uj50.b(objO);
            xb5Var.c = 1;
            bc6 bc6VarA = dc6.a(yzo.b(xb5Var));
            try {
                vf40 vf40Var = new vf40(bc6VarA);
                Object objM = M(i77Var, i2, j, vf40Var);
                if (objM != zb5.m) {
                    toe0 toe0Var = zb5.o;
                    Function1<E, Unit> function1 = this.b;
                    if (objM == toe0Var) {
                        if (j < x()) {
                            i77Var.a();
                        }
                        i77<E> i77Var3 = (i77) s0o.a.getObjectVolatile(this, C);
                        while (true) {
                            if (B()) {
                                zi50.a aVar = zi50.b;
                                bc6VarA.resumeWith(new h77(new h77.a(t())));
                                break;
                            }
                            long andIncrement = e.getAndIncrement(this);
                            long j2 = zb5.b;
                            long j3 = andIncrement / j2;
                            int i5 = (int) (andIncrement % j2);
                            if (i77Var3.d != j3) {
                                i77<E> i77VarQ = q(j3, i77Var3);
                                if (i77VarQ != null) {
                                    i77Var2 = i77VarQ;
                                }
                            } else {
                                i77Var2 = i77Var3;
                            }
                            Object objM2 = M(i77Var2, i5, andIncrement, vf40Var);
                            i77<E> i77Var4 = i77Var2;
                            if (objM2 == zb5.m) {
                                vf40Var.a(i77Var4, i5);
                                break;
                            }
                            if (objM2 == zb5.o) {
                                if (andIncrement < x()) {
                                    i77Var4.a();
                                }
                                i77Var3 = i77Var4;
                            } else {
                                if (objM2 == zb5.n) {
                                    throw new IllegalStateException("unexpected");
                                }
                                i77Var4.a();
                                h77Var = new h77(objM2);
                                if (function1 != null) {
                                    vb5Var = new vb5(this);
                                }
                            }
                        }
                    } else {
                        i77Var.a();
                        h77Var = new h77(objM);
                        if (function1 != null) {
                            vb5Var = new vb5(this);
                        }
                    }
                    bc6VarA.s(h77Var, vb5Var);
                    break;
                }
                vf40Var.a(i77Var, i2);
                objO = bc6VarA.o();
                y5b y5bVar2 = y5b.a;
                if (objO == y5bVar) {
                    return y5bVar;
                }
            } catch (Throwable th) {
                bc6VarA.A();
                throw th;
            }
        } else {
            if (i4 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objO);
        }
        return ((h77) objO).a;
    }

    public final void J(bwi0 bwi0Var, boolean z2) {
        if (bwi0Var instanceof b) {
            zi50.a aVar = zi50.b;
            throw null;
        }
        if (bwi0Var instanceof zb6) {
            v1b v1bVar = (v1b) bwi0Var;
            zi50.a aVar2 = zi50.b;
            v1bVar.resumeWith(new zi50.b(z2 ? u() : w()));
            return;
        }
        if (bwi0Var instanceof vf40) {
            bc6<h77<? extends E>> bc6Var = ((vf40) bwi0Var).a;
            zi50.a aVar3 = zi50.b;
            bc6Var.resumeWith(new h77(new h77.a(t())));
            return;
        }
        if (!(bwi0Var instanceof a)) {
            if (bwi0Var instanceof a780) {
                ((a780) bwi0Var).d(this, zb5.l);
                return;
            } else {
                ogf.a(bwi0Var, "Unexpected waiter: ");
                return;
            }
        }
        a aVar4 = (a) bwi0Var;
        bc6<? super Boolean> bc6Var2 = aVar4.b;
        bc6Var2.getClass();
        aVar4.b = null;
        aVar4.a = zb5.l;
        Throwable thT = tb5.this.t();
        if (thT == null) {
            zi50.a aVar5 = zi50.b;
            bc6Var2.resumeWith(Boolean.FALSE);
        } else {
            zi50.a aVar6 = zi50.b;
            bc6Var2.resumeWith(new zi50.b(thT));
        }
    }

    public final boolean K(Object obj, E e2) {
        gaj ub5Var;
        if (obj instanceof a780) {
            return ((a780) obj).d(this, e2);
        }
        boolean z2 = obj instanceof vf40;
        Function1<E, Unit> function1 = this.b;
        if (z2) {
            bc6<h77<? extends E>> bc6Var = ((vf40) obj).a;
            h77 h77Var = new h77(e2);
            ub5Var = function1 != null ? new vb5(this) : null;
            i77<Object> i77Var = zb5.a;
            toe0 toe0VarI = bc6Var.i(h77Var, ub5Var);
            if (toe0VarI == null) {
                return false;
            }
            bc6Var.x(toe0VarI);
            return true;
        }
        if (!(obj instanceof a)) {
            if (!(obj instanceof zb6)) {
                ogf.a(obj, "Unexpected receiver type: ");
                return false;
            }
            zb6 zb6Var = (zb6) obj;
            ub5Var = function1 != null ? new ub5(this) : null;
            i77<Object> i77Var2 = zb5.a;
            toe0 toe0VarI2 = zb6Var.i(e2, ub5Var);
            if (toe0VarI2 == null) {
                return false;
            }
            zb6Var.x(toe0VarI2);
            return true;
        }
        a aVar = (a) obj;
        bc6<? super Boolean> bc6Var2 = aVar.b;
        bc6Var2.getClass();
        aVar.b = null;
        aVar.a = e2;
        Boolean bool = Boolean.TRUE;
        Function1<E, Unit> function2 = tb5.this.b;
        ub5Var = function2 != null ? new rb5(e2, function2) : null;
        i77<Object> i77Var3 = zb5.a;
        toe0 toe0VarI3 = bc6Var2.i(bool, ub5Var);
        if (toe0VarI3 == null) {
            return false;
        }
        bc6Var2.x(toe0VarI3);
        return true;
    }

    public final boolean L(Object obj, i77<E> i77Var, int i2) {
        rxg0 rxg0Var;
        if (obj instanceof zb6) {
            zb6 zb6Var = (zb6) obj;
            Unit unit = Unit.a;
            i77<Object> i77Var2 = zb5.a;
            toe0 toe0VarI = zb6Var.i(unit, null);
            if (toe0VarI == null) {
                return false;
            }
            zb6Var.x(toe0VarI);
            return true;
        }
        if (!(obj instanceof a780)) {
            if (obj instanceof b) {
                i77<Object> i77Var3 = zb5.a;
                throw null;
            }
            ogf.a(obj, "Unexpected waiter: ");
            return false;
        }
        int iJ = ((x680) obj).j(this, Unit.a);
        if (iJ == 0) {
            rxg0Var = rxg0.a;
        } else if (iJ == 1) {
            rxg0Var = rxg0.b;
        } else if (iJ == 2) {
            rxg0Var = rxg0.c;
        } else {
            if (iJ != 3) {
                fa30.a(iJ, "Unexpected internal result: ");
                return false;
            }
            rxg0Var = rxg0.d;
        }
        if (rxg0Var == rxg0.b) {
            i77Var.n(i2, null);
        }
        return rxg0Var == rxg0.a;
    }

    public final Object M(i77<E> i77Var, int i2, long j, Object obj) {
        Object objL = i77Var.l(i2);
        AtomicReferenceArray atomicReferenceArray = i77Var.v;
        long j2 = F;
        if (objL == null) {
            if (j >= (s0o.a.getLongVolatile(this, j2) & 1152921504606846975L)) {
                if (obj == null) {
                    return zb5.n;
                }
                if (i77Var.k(i2, objL, obj)) {
                    p();
                    return zb5.m;
                }
            }
        } else if (objL == zb5.d && i77Var.k(i2, objL, zb5.i)) {
            p();
            Object obj2 = atomicReferenceArray.get(i2 * 2);
            i77Var.n(i2, null);
            return obj2;
        }
        while (true) {
            Object objL2 = i77Var.l(i2);
            if (objL2 == null || objL2 == zb5.e) {
                if (j < (s0o.a.getLongVolatile(this, j2) & 1152921504606846975L)) {
                    if (i77Var.k(i2, objL2, zb5.h)) {
                        p();
                        return zb5.o;
                    }
                } else {
                    if (obj == null) {
                        return zb5.n;
                    }
                    if (i77Var.k(i2, objL2, obj)) {
                        p();
                        return zb5.m;
                    }
                }
            } else if (objL2 != zb5.d) {
                toe0 toe0Var = zb5.j;
                if (objL2 == toe0Var) {
                    return zb5.o;
                }
                if (objL2 == zb5.h) {
                    return zb5.o;
                }
                if (objL2 == zb5.l) {
                    p();
                    return zb5.o;
                }
                if (objL2 != zb5.g && i77Var.k(i2, objL2, zb5.f)) {
                    boolean z2 = objL2 instanceof cwi0;
                    if (z2) {
                        objL2 = ((cwi0) objL2).a;
                    }
                    if (L(objL2, i77Var, i2)) {
                        i77Var.o(i2, zb5.i);
                        p();
                        Object obj3 = atomicReferenceArray.get(i2 * 2);
                        i77Var.n(i2, null);
                        return obj3;
                    }
                    i77Var.o(i2, toe0Var);
                    i77Var.i();
                    if (z2) {
                        p();
                    }
                    return zb5.o;
                }
            } else if (i77Var.k(i2, objL2, zb5.i)) {
                p();
                Object obj4 = atomicReferenceArray.get(i2 * 2);
                i77Var.n(i2, null);
                return obj4;
            }
        }
    }

    public final int N(i77<E> i77Var, int i2, E e2, long j, Object obj, boolean z2) {
        i77Var.n(i2, e2);
        if (z2) {
            return O(i77Var, i2, e2, j, obj, z2);
        }
        Object objL = i77Var.l(i2);
        if (objL == null) {
            if (g(j)) {
                if (i77Var.k(i2, null, zb5.d)) {
                    return 1;
                }
            } else {
                if (obj == null) {
                    return 3;
                }
                if (i77Var.k(i2, null, obj)) {
                    return 2;
                }
            }
        } else if (objL instanceof bwi0) {
            i77Var.n(i2, null);
            if (K(objL, e2)) {
                i77Var.o(i2, zb5.i);
                return 0;
            }
            toe0 toe0Var = zb5.k;
            if (i77Var.v.getAndSet((i2 * 2) + 1, toe0Var) == toe0Var) {
                return 5;
            }
            i77Var.m(i2, true);
            return 5;
        }
        return O(i77Var, i2, e2, j, obj, z2);
    }

    public final int O(i77<E> i77Var, int i2, E e2, long j, Object obj, boolean z2) {
        while (true) {
            Object objL = i77Var.l(i2);
            if (objL == null) {
                if (!g(j) || z2) {
                    if (z2) {
                        if (i77Var.k(i2, null, zb5.j)) {
                            i77Var.i();
                            return 4;
                        }
                    } else {
                        if (obj == null) {
                            return 3;
                        }
                        if (i77Var.k(i2, null, obj)) {
                            return 2;
                        }
                    }
                } else if (i77Var.k(i2, null, zb5.d)) {
                    break;
                }
            } else {
                if (objL != zb5.e) {
                    toe0 toe0Var = zb5.k;
                    if (objL == toe0Var) {
                        i77Var.n(i2, null);
                        return 5;
                    }
                    if (objL == zb5.h) {
                        i77Var.n(i2, null);
                        return 5;
                    }
                    if (objL == zb5.l) {
                        i77Var.n(i2, null);
                        m();
                        return 4;
                    }
                    i77Var.n(i2, null);
                    if (objL instanceof cwi0) {
                        objL = ((cwi0) objL).a;
                    }
                    if (K(objL, e2)) {
                        i77Var.o(i2, zb5.i);
                        return 0;
                    }
                    if (i77Var.v.getAndSet((i2 * 2) + 1, toe0Var) != toe0Var) {
                        i77Var.m(i2, true);
                    }
                    return 5;
                }
                if (i77Var.k(i2, objL, zb5.d)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void P(long j) {
        tb5<E> tb5Var = this;
        if (tb5Var.D()) {
            return;
        }
        while (tb5Var.s() <= j) {
            tb5Var = this;
        }
        int i2 = zb5.c;
        int i3 = 0;
        while (true) {
            long j2 = B;
            if (i3 < i2) {
                long jS = tb5Var.s();
                if (jS == (s0o.a.getLongVolatile(tb5Var, j2) & 4611686018427387903L) && jS == tb5Var.s()) {
                    return;
                } else {
                    i3++;
                }
            } else {
                while (true) {
                    Unsafe unsafe = s0o.a;
                    long longVolatile = unsafe.getLongVolatile(tb5Var, j2);
                    if (unsafe.compareAndSwapLong(tb5Var, B, longVolatile, 4611686018427387904L + (longVolatile & 4611686018427387903L))) {
                        break;
                    } else {
                        tb5Var = this;
                    }
                }
                while (true) {
                    long jS2 = tb5Var.s();
                    Unsafe unsafe2 = s0o.a;
                    long longVolatile2 = unsafe2.getLongVolatile(tb5Var, j2);
                    long j3 = longVolatile2 & 4611686018427387903L;
                    boolean z2 = (longVolatile2 & 4611686018427387904L) != 0;
                    if (jS2 == j3 && jS2 == tb5Var.s()) {
                        break;
                    }
                    if (z2) {
                        tb5Var = this;
                    } else {
                        tb5Var = this;
                        unsafe2.compareAndSwapLong(tb5Var, B, longVolatile2, j3 + 4611686018427387904L);
                    }
                }
                while (true) {
                    Unsafe unsafe3 = s0o.a;
                    long longVolatile3 = unsafe3.getLongVolatile(tb5Var, j2);
                    if (unsafe3.compareAndSwapLong(tb5Var, B, longVolatile3, longVolatile3 & 4611686018427387903L)) {
                        return;
                    } else {
                        tb5Var = this;
                    }
                }
            }
        }
    }

    @Override // defpackage.wf40
    public final Object a(v1b<? super E> v1bVar) throws Throwable {
        i77<E> i77Var;
        Throwable th;
        i77<E> i77Var2;
        Unsafe unsafe = s0o.a;
        long j = C;
        i77<E> i77Var3 = (i77) unsafe.getObjectVolatile(this, j);
        while (!this.B()) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = e;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j2 = zb5.b;
            long j3 = andIncrement / j2;
            int i2 = (int) (andIncrement % j2);
            if (i77Var3.d != j3) {
                i77<E> i77VarQ = this.q(j3, i77Var3);
                if (i77VarQ == null) {
                    continue;
                } else {
                    i77Var = i77VarQ;
                }
            } else {
                i77Var = i77Var3;
            }
            tb5<E> tb5Var = this;
            Object objM = tb5Var.M(i77Var, i2, andIncrement, null);
            toe0 toe0Var = zb5.m;
            ub5 ub5Var = null;
            if (objM == toe0Var) {
                ib5.a("unexpected");
                return null;
            }
            toe0 toe0Var2 = zb5.o;
            if (objM == toe0Var2) {
                if (andIncrement < tb5Var.x()) {
                    i77Var.a();
                }
                this = tb5Var;
                i77Var3 = i77Var;
            } else {
                if (objM != zb5.n) {
                    i77Var.a();
                    return objM;
                }
                bc6 bc6VarA = dc6.a(yzo.b(v1bVar));
                try {
                    Object objM2 = tb5Var.M(i77Var, i2, andIncrement, bc6VarA);
                    if (objM2 != toe0Var) {
                        Function1<E, Unit> function1 = tb5Var.b;
                        if (objM2 == toe0Var2) {
                            if (andIncrement < tb5Var.x()) {
                                i77Var.a();
                            }
                            i77<E> i77Var4 = (i77) s0o.a.getObjectVolatile(tb5Var, j);
                            while (true) {
                                if (tb5Var.B()) {
                                    zi50.a aVar = zi50.b;
                                    bc6VarA.resumeWith(new zi50.b(tb5Var.u()));
                                    break;
                                }
                                bc6 bc6Var = bc6VarA;
                                try {
                                    long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(tb5Var);
                                    long j4 = zb5.b;
                                    long j5 = andIncrement2 / j4;
                                    int i3 = (int) (andIncrement2 % j4);
                                    if (i77Var4.d != j5) {
                                        try {
                                            i77<E> i77VarQ2 = tb5Var.q(j5, i77Var4);
                                            if (i77VarQ2 == null) {
                                                bc6VarA = bc6Var;
                                            } else {
                                                i77Var2 = i77VarQ2;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            bc6VarA = bc6Var;
                                            bc6VarA.A();
                                            throw th;
                                        }
                                    } else {
                                        i77Var2 = i77Var4;
                                    }
                                    tb5<E> tb5Var2 = tb5Var;
                                    objM2 = tb5Var2.M(i77Var2, i3, andIncrement2, bc6Var);
                                    tb5Var = tb5Var2;
                                    i77<E> i77Var5 = i77Var2;
                                    bc6VarA = bc6Var;
                                    if (objM2 == zb5.m) {
                                        bc6VarA.a(i77Var5, i3);
                                        break;
                                    }
                                    if (objM2 == zb5.o) {
                                        if (andIncrement2 < tb5Var.x()) {
                                            i77Var5.a();
                                        }
                                        i77Var4 = i77Var5;
                                    } else {
                                        if (objM2 == zb5.n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        i77Var5.a();
                                        if (function1 != null) {
                                            ub5Var = new ub5(tb5Var);
                                        }
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    bc6VarA = bc6Var;
                                    th = th;
                                    bc6VarA.A();
                                    throw th;
                                }
                            }
                        } else {
                            i77Var.a();
                            if (function1 != null) {
                                ub5Var = new ub5(tb5Var);
                            }
                        }
                        bc6VarA.s(objM2, ub5Var);
                        break;
                    }
                    bc6VarA.a(i77Var, i2);
                    Object objO = bc6VarA.o();
                    y5b y5bVar = y5b.a;
                    return objO;
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        }
        Throwable thU = this.u();
        int i4 = dld0.a;
        throw thU;
    }

    @Override // defpackage.ec80
    public final void b(Function1<? super Throwable, Unit> function1) {
        Unsafe unsafe;
        while (true) {
            Unsafe unsafe2 = s0o.a;
            tb5<E> tb5Var = this;
            if (unsafe2.compareAndSwapObject(tb5Var, A, (Object) null, function1)) {
                return;
            }
            long j = A;
            if (unsafe2.getObjectVolatile(tb5Var, j) != null) {
                while (true) {
                    Object objectVolatile = s0o.a.getObjectVolatile(tb5Var, j);
                    toe0 toe0Var = zb5.q;
                    if (objectVolatile != toe0Var) {
                        if (objectVolatile == zb5.r) {
                            ib5.a("Another handler was already registered and successfully invoked");
                            return;
                        } else {
                            ogf.a(objectVolatile, "Another handler is already registered: ");
                            return;
                        }
                    }
                    toe0 toe0Var2 = zb5.r;
                    do {
                        tb5<E> tb5Var2 = tb5Var;
                        unsafe = s0o.a;
                        boolean zCompareAndSwapObject = unsafe.compareAndSwapObject(tb5Var2, A, toe0Var, toe0Var2);
                        tb5Var = tb5Var2;
                        if (zCompareAndSwapObject) {
                            function1.invoke(tb5Var.t());
                            return;
                        }
                    } while (unsafe.getObjectVolatile(tb5Var, j) == toe0Var);
                }
            } else {
                this = tb5Var;
            }
        }
    }

    @Override // defpackage.ec80
    public Object c(E e2) {
        tb5<E> tb5Var = this;
        Unsafe unsafe = s0o.a;
        long longVolatile = unsafe.getLongVolatile(tb5Var, F);
        long j = 1152921504606846975L;
        boolean z2 = tb5Var.A(longVolatile, false) ? false : !tb5Var.g(longVolatile & 1152921504606846975L);
        h77.b bVar = h77.b;
        if (z2) {
            return bVar;
        }
        Object obj = zb5.j;
        i77<E> i77Var = (i77) unsafe.getObjectVolatile(tb5Var, E);
        while (true) {
            long andIncrement = d.getAndIncrement(tb5Var);
            long j2 = andIncrement & j;
            boolean zA = tb5Var.A(andIncrement, false);
            int i2 = zb5.b;
            long j3 = i2;
            long j4 = j2 / j3;
            int i3 = (int) (j2 % j3);
            if (i77Var.d != j4) {
                i77<E> i77VarR = tb5Var.r(j4, i77Var);
                if (i77VarR != null) {
                    i77Var = i77VarR;
                } else {
                    if (zA) {
                        return new h77.a(tb5Var.w());
                    }
                    j = 1152921504606846975L;
                }
            }
            int iN = tb5Var.N(i77Var, i3, e2, j2, obj, zA);
            if (iN == 0) {
                i77Var.a();
                return Unit.a;
            }
            if (iN == 1) {
                return Unit.a;
            }
            if (iN == 2) {
                if (zA) {
                    i77Var.i();
                    return new h77.a(w());
                }
                bwi0 bwi0Var = obj instanceof bwi0 ? (bwi0) obj : null;
                if (bwi0Var != null) {
                    bwi0Var.a(i77Var, i3 + i2);
                }
                i77Var.i();
                return bVar;
            }
            if (iN == 3) {
                ib5.a("unexpected");
                return null;
            }
            if (iN == 4) {
                if (j2 < v()) {
                    i77Var.a();
                }
                return new h77.a(w());
            }
            if (iN == 5) {
                i77Var.a();
            }
            j = 1152921504606846975L;
            tb5Var = this;
        }
    }

    @Override // defpackage.wf40
    public final void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        i(cancellationException, true);
    }

    @Override // defpackage.wf40
    public final Object e(tje0 tje0Var) {
        return H(this, tje0Var);
    }

    @Override // defpackage.wf40
    public final u680<h77<E>> f() {
        c cVar = c.a;
        cVar.getClass();
        y8h0.d(3, cVar);
        d dVar = d.a;
        dVar.getClass();
        y8h0.d(3, dVar);
        return new v680(this, cVar, dVar, this.c);
    }

    public final boolean g(long j) {
        return j < s() || j < v() + ((long) this.a);
    }

    @Override // defpackage.wf40
    public final Object h() {
        i77<E> i77Var;
        Unsafe unsafe = s0o.a;
        long longVolatile = unsafe.getLongVolatile(this, D);
        long longVolatile2 = unsafe.getLongVolatile(this, F);
        if (A(longVolatile2, true)) {
            return new h77.a(t());
        }
        long j = longVolatile2 & 1152921504606846975L;
        h77.b bVar = h77.b;
        if (longVolatile >= j) {
            return bVar;
        }
        Object obj = zb5.k;
        i77<E> i77Var2 = (i77) unsafe.getObjectVolatile(this, C);
        while (!this.B()) {
            long andIncrement = e.getAndIncrement(this);
            long j2 = zb5.b;
            long j3 = andIncrement / j2;
            int i2 = (int) (andIncrement % j2);
            if (i77Var2.d != j3) {
                i77<E> i77VarQ = this.q(j3, i77Var2);
                if (i77VarQ == null) {
                    continue;
                } else {
                    i77Var = i77VarQ;
                }
            } else {
                i77Var = i77Var2;
            }
            tb5<E> tb5Var = this;
            Object objM = tb5Var.M(i77Var, i2, andIncrement, obj);
            i77Var2 = i77Var;
            if (objM == zb5.m) {
                bwi0 bwi0Var = obj instanceof bwi0 ? (bwi0) obj : null;
                if (bwi0Var != null) {
                    bwi0Var.a(i77Var2, i2);
                }
                tb5Var.P(andIncrement);
                i77Var2.i();
                return bVar;
            }
            if (objM != zb5.o) {
                if (objM != zb5.n) {
                    i77Var2.a();
                    return objM;
                }
                ib5.a("unexpected");
                return null;
            }
            if (andIncrement < tb5Var.x()) {
                i77Var2.a();
            }
            this = tb5Var;
        }
        return new h77.a(this.t());
    }

    public final boolean i(Throwable th, boolean z2) {
        boolean z3;
        Unsafe unsafe;
        long j;
        long longVolatile;
        long j2;
        Object objectVolatile;
        Unsafe unsafe2;
        Unsafe unsafe3;
        long j3;
        long longVolatile2;
        Unsafe unsafe4;
        long j4;
        long longVolatile3;
        if (z2) {
            do {
                unsafe4 = s0o.a;
                j4 = F;
                longVolatile3 = unsafe4.getLongVolatile(this, j4);
                if (((int) (longVolatile3 >> 60)) != 0) {
                    break;
                }
                i77<Object> i77Var = zb5.a;
            } while (!unsafe4.compareAndSwapLong(this, j4, longVolatile3, (longVolatile3 & 1152921504606846975L) + 1152921504606846976L));
        }
        toe0 toe0Var = zb5.s;
        while (true) {
            Unsafe unsafe5 = s0o.a;
            long j5 = w;
            if (unsafe5.compareAndSwapObject(this, j5, toe0Var, th)) {
                z3 = true;
                break;
            }
            if (unsafe5.getObjectVolatile(this, j5) != toe0Var) {
                z3 = false;
                break;
            }
        }
        if (z2) {
            do {
                unsafe3 = s0o.a;
                j3 = F;
                longVolatile2 = unsafe3.getLongVolatile(this, j3);
            } while (!unsafe3.compareAndSwapLong(this, j3, longVolatile2, (longVolatile2 & 1152921504606846975L) + 3458764513820540928L));
        } else {
            do {
                unsafe = s0o.a;
                j = F;
                longVolatile = unsafe.getLongVolatile(this, j);
                int i2 = (int) (longVolatile >> 60);
                if (i2 == 0) {
                    j2 = (longVolatile & 1152921504606846975L) + 2305843009213693952L;
                } else {
                    if (i2 != 1) {
                        break;
                    }
                    j2 = (longVolatile & 1152921504606846975L) + 3458764513820540928L;
                }
            } while (!unsafe.compareAndSwapLong(this, j, longVolatile, j2));
        }
        m();
        if (z3) {
            loop3: while (true) {
                Unsafe unsafe6 = s0o.a;
                long j6 = A;
                objectVolatile = unsafe6.getObjectVolatile(this, j6);
                toe0 toe0Var2 = objectVolatile == null ? zb5.q : zb5.r;
                do {
                    unsafe2 = s0o.a;
                    if (unsafe2.compareAndSwapObject(this, A, objectVolatile, toe0Var2)) {
                        break loop3;
                    }
                } while (unsafe2.getObjectVolatile(this, j6) == objectVolatile);
            }
            if (objectVolatile != null) {
                y8h0.d(1, objectVolatile);
                ((Function1) objectVolatile).invoke(t());
                return z3;
            }
        }
        return z3;
    }

    @Override // defpackage.wf40
    public final c77<E> iterator() {
        return new a();
    }

    /* JADX WARN: Code duplicated, block: B:89:0x0158  */
    /* JADX WARN: Code duplicated, block: B:91:0x015c A[RETURN] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ec80
    public Object j(v1b v1bVar, Object obj) throws Throwable {
        Object objO;
        y5b y5bVar;
        int i2;
        tb5<E> tb5Var = this;
        Unsafe unsafe = s0o.a;
        long j = E;
        i77<E> i77Var = (i77) unsafe.getObjectVolatile(tb5Var, j);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = d;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(tb5Var);
            long j2 = andIncrement & 1152921504606846975L;
            boolean zA = tb5Var.A(andIncrement, false);
            int i3 = zb5.b;
            long j3 = i3;
            long j4 = j2 / j3;
            int i4 = (int) (j2 % j3);
            if (i77Var.d != j4) {
                i77<E> i77VarR = tb5Var.r(j4, i77Var);
                if (i77VarR != null) {
                    i77Var = i77VarR;
                } else if (zA) {
                    Object objF = F(v1bVar, obj);
                    if (objF != y5b.a) {
                        break;
                    }
                    return objF;
                }
            }
            int iN = tb5Var.N(i77Var, i4, obj, j2, null, zA);
            if (iN == 0) {
                i77Var.a();
                break;
            }
            if (iN != 1) {
                if (iN == 2) {
                    if (!zA) {
                        break;
                    }
                    i77Var.i();
                    Object objF2 = F(v1bVar, obj);
                    if (objF2 != y5b.a) {
                        break;
                    }
                    return objF2;
                }
                if (iN == 3) {
                    bc6 bc6VarA = dc6.a(yzo.b(v1bVar));
                    try {
                        int iN2 = N(i77Var, i4, obj, j2, bc6VarA, false);
                        if (iN2 == 0) {
                            i77Var.a();
                            zi50.a aVar = zi50.b;
                        } else {
                            if (iN2 != 1) {
                                if (iN2 != 2) {
                                    if (iN2 != 4) {
                                        String str = "unexpected";
                                        if (iN2 != 5) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        i77Var.a();
                                        i77<E> i77Var2 = (i77) s0o.a.getObjectVolatile(this, j);
                                        while (true) {
                                            long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                            long j5 = andIncrement2 & 1152921504606846975L;
                                            boolean zA2 = A(andIncrement2, false);
                                            int i5 = zb5.b;
                                            atomicLongFieldUpdater = atomicLongFieldUpdater;
                                            long j6 = i5;
                                            long j7 = j5 / j6;
                                            int i6 = (int) (j5 % j6);
                                            if (i77Var2.d != j7) {
                                                i77<E> i77VarR2 = r(j7, i77Var2);
                                                if (i77VarR2 != null) {
                                                    i2 = i6;
                                                    i77Var2 = i77VarR2;
                                                } else if (zA2) {
                                                }
                                            } else {
                                                i2 = i6;
                                            }
                                            int iN3 = N(i77Var2, i2, obj, j5, bc6VarA, zA2);
                                            if (iN3 == 0) {
                                                i77Var2.a();
                                                zi50.a aVar2 = zi50.b;
                                            } else if (iN3 == 1) {
                                                zi50.a aVar3 = zi50.b;
                                            } else if (iN3 == 2) {
                                                if (!zA2) {
                                                    bc6VarA.a(i77Var2, i2 + i5);
                                                    break;
                                                }
                                                i77Var2.i();
                                            } else {
                                                if (iN3 == 3) {
                                                    throw new IllegalStateException(str);
                                                }
                                                if (iN3 != 4) {
                                                    if (iN3 == 5) {
                                                        i77Var2.a();
                                                    }
                                                    str = str;
                                                } else if (j5 < v()) {
                                                    i77Var2.a();
                                                }
                                            }
                                        }
                                    } else if (j2 < v()) {
                                        i77Var.a();
                                    }
                                    G(bc6VarA, obj);
                                    break;
                                } else {
                                    bc6VarA.a(i77Var, i4 + i3);
                                }
                                objO = bc6VarA.o();
                                y5bVar = y5b.a;
                                if (objO != y5bVar) {
                                    objO = Unit.a;
                                }
                                if (objO == y5bVar) {
                                    break;
                                }
                                return objO;
                            }
                            zi50.a aVar4 = zi50.b;
                        }
                        bc6VarA.resumeWith(Unit.a);
                        objO = bc6VarA.o();
                        y5bVar = y5b.a;
                        if (objO != y5bVar) {
                            objO = Unit.a;
                        }
                        if (objO == y5bVar) {
                            break;
                        }
                        return objO;
                    } catch (Throwable th) {
                        bc6VarA.A();
                        throw th;
                    }
                }
                if (iN == 4) {
                    if (j2 < v()) {
                        i77Var.a();
                    }
                    Object objF3 = F(v1bVar, obj);
                    if (objF3 != y5b.a) {
                        break;
                    }
                    return objF3;
                }
                if (iN == 5) {
                    i77Var.a();
                }
                tb5Var = this;
            } else {
                break;
            }
        }
        return Unit.a;
    }

    @Override // defpackage.ec80
    public final boolean k(Throwable th) {
        return i(th, false);
    }

    @Override // defpackage.ec80
    public final boolean m() {
        return A(s0o.a.getLongVolatile(this, F), false);
    }

    public final i77<E> n(long j) {
        doa doaVar;
        long j2;
        Unsafe unsafe;
        long j3;
        Unsafe unsafe2 = s0o.a;
        Object objectVolatile = unsafe2.getObjectVolatile(this, z);
        i77 i77Var = (i77) unsafe2.getObjectVolatile(this, E);
        if (i77Var.d > ((i77) objectVolatile).d) {
            objectVolatile = i77Var;
        }
        i77 i77Var2 = (i77) unsafe2.getObjectVolatile(this, C);
        if (i77Var2.d > ((i77) objectVolatile).d) {
            objectVolatile = i77Var2;
        }
        doa doaVar2 = (doa) objectVolatile;
        loop0: while (true) {
            doaVar = doaVar2;
            while (true) {
                int i2 = doa.c;
                doaVar.getClass();
                Object objectVolatile2 = s0o.a.getObjectVolatile(doaVar, doa.a);
                toe0 toe0Var = coa.a;
                if (objectVolatile2 == toe0Var) {
                    break loop0;
                }
                doaVar2 = (doa) objectVolatile2;
                if (doaVar2 == null) {
                    do {
                        unsafe = s0o.a;
                        j3 = doa.a;
                        if (unsafe.compareAndSwapObject(doaVar, j3, (Object) null, toe0Var)) {
                            break loop0;
                        }
                    } while (unsafe.getObjectVolatile(doaVar, j3) == null);
                }
            }
        }
        i77<E> i77Var3 = (i77) doaVar;
        if (C()) {
            i77<E> i77Var4 = i77Var3;
            loop3: while (true) {
                int i3 = zb5.b - 1;
                while (true) {
                    if (-1 < i3) {
                        j2 = (i77Var4.d * ((long) zb5.b)) + ((long) i3);
                        if (j2 >= v()) {
                            while (true) {
                                Object objL = i77Var4.l(i3);
                                if (objL != null && objL != zb5.e) {
                                    if (objL != zb5.d) {
                                        break;
                                    }
                                    break loop3;
                                }
                                if (i77Var4.k(i3, objL, zb5.l)) {
                                    i77Var4.i();
                                    break;
                                }
                            }
                            i3--;
                        }
                    } else {
                        i77Var4 = (i77) ((doa) s0o.a.getObjectVolatile(i77Var4, doa.b));
                        if (i77Var4 == null) {
                        }
                    }
                    j2 = -1;
                    break;
                }
            }
            if (j2 != -1) {
                o(j2);
            }
        }
        Object objA = null;
        loop6: for (i77<E> i77Var5 = i77Var3; i77Var5 != null; i77Var5 = (i77) ((doa) s0o.a.getObjectVolatile(i77Var5, doa.b))) {
            for (int i4 = zb5.b - 1; -1 < i4; i4--) {
                if ((i77Var5.d * ((long) zb5.b)) + ((long) i4) < j) {
                    break loop6;
                }
                while (true) {
                    Object objL2 = i77Var5.l(i4);
                    if (objL2 != null && objL2 != zb5.e) {
                        if (!(objL2 instanceof cwi0)) {
                            if (!(objL2 instanceof bwi0)) {
                                break;
                            }
                            if (i77Var5.k(i4, objL2, zb5.l)) {
                                objA = bln.a(objA, objL2);
                                i77Var5.m(i4, true);
                                break;
                            }
                        } else {
                            if (i77Var5.k(i4, objL2, zb5.l)) {
                                objA = bln.a(objA, ((cwi0) objL2).a);
                                i77Var5.m(i4, true);
                                break;
                            }
                        }
                    } else {
                        if (i77Var5.k(i4, objL2, zb5.l)) {
                            i77Var5.i();
                            break;
                        }
                    }
                }
            }
        }
        if (objA != null) {
            if (!(objA instanceof ArrayList)) {
                J((bwi0) objA, true);
                return i77Var3;
            }
            ArrayList arrayList = (ArrayList) objA;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                J((bwi0) arrayList.get(size), true);
            }
        }
        return i77Var3;
    }

    public final void o(long j) {
        jdh0 jdh0VarB;
        i77<E> i77Var = (i77) s0o.a.getObjectVolatile(this, C);
        while (true) {
            Unsafe unsafe = s0o.a;
            long j2 = D;
            long longVolatile = unsafe.getLongVolatile(this, j2);
            if (j < Math.max(((long) this.a) + longVolatile, this.s())) {
                return;
            }
            this = this;
            if (unsafe.compareAndSwapLong(this, j2, longVolatile, 1 + longVolatile)) {
                long j3 = zb5.b;
                long j4 = longVolatile / j3;
                int i2 = (int) (longVolatile % j3);
                if (i77Var.d != j4) {
                    i77<E> i77VarQ = this.q(j4, i77Var);
                    if (i77VarQ != null) {
                        i77Var = i77VarQ;
                    }
                }
                i77<E> i77Var2 = i77Var;
                Object objM = this.M(i77Var2, i2, longVolatile, null);
                if (objM != zb5.o) {
                    i77Var2.a();
                    Function1<E, Unit> function1 = this.b;
                    if (function1 != null && (jdh0VarB = lpy.b(function1, objM, null)) != null) {
                        throw jdh0VarB;
                    }
                } else if (longVolatile < this.x()) {
                    i77Var2.a();
                }
                i77Var = i77Var2;
            }
        }
    }

    public final void p() {
        Object objA;
        Unsafe unsafe;
        if (D()) {
            return;
        }
        Unsafe unsafe2 = s0o.a;
        long j = z;
        i77<E> i77Var = (i77) unsafe2.getObjectVolatile(this, j);
        while (true) {
            long andIncrement = f.getAndIncrement(this);
            long j2 = andIncrement / ((long) zb5.b);
            if (x() <= andIncrement) {
                if (i77Var.d < j2 && i77Var.c() != 0) {
                    E(j2, i77Var);
                }
                y(1L);
                return;
            }
            if (i77Var.d != j2) {
                yb5 yb5Var = yb5.a;
                while (true) {
                    objA = coa.a(i77Var, j2, yb5Var);
                    if (!ltg.b(objA)) {
                        f580 f580VarA = ltg.a(objA);
                        while (true) {
                            f580 f580Var = (f580) s0o.a.getObjectVolatile(this, j);
                            if (f580Var.d >= f580VarA.d) {
                                break;
                            }
                            if (!f580VarA.j()) {
                                break;
                            }
                            do {
                                unsafe = s0o.a;
                                if (unsafe.compareAndSwapObject(this, z, f580Var, f580VarA)) {
                                    if (!f580Var.f()) {
                                        break;
                                    }
                                    f580Var.e();
                                    break;
                                }
                            } while (unsafe.getObjectVolatile(this, j) == f580Var);
                            if (f580VarA.f()) {
                                f580VarA.e();
                            }
                        }
                    } else {
                        break;
                    }
                }
                i77<E> i77Var2 = null;
                if (ltg.b(objA)) {
                    m();
                    E(j2, i77Var);
                    y(1L);
                } else {
                    i77<E> i77Var3 = (i77) ltg.a(objA);
                    long j3 = i77Var3.d;
                    if (j3 > j2) {
                        long j4 = ((long) zb5.b) * j3;
                        if (s0o.a.compareAndSwapLong(this, y, 1 + andIncrement, j4)) {
                            y(j4 - andIncrement);
                        } else {
                            y(1L);
                        }
                    } else {
                        i77Var2 = i77Var3;
                    }
                }
                if (i77Var2 == null) {
                    continue;
                } else {
                    i77Var = i77Var2;
                }
            }
            int i2 = (int) (andIncrement % ((long) zb5.b));
            Object objL = i77Var.l(i2);
            boolean z2 = objL instanceof bwi0;
            long j5 = D;
            if (!z2 || andIncrement < s0o.a.getLongVolatile(this, j5) || !i77Var.k(i2, objL, zb5.g)) {
                while (true) {
                    Object objL2 = i77Var.l(i2);
                    if (objL2 instanceof bwi0) {
                        if (andIncrement < s0o.a.getLongVolatile(this, j5)) {
                            if (i77Var.k(i2, objL2, new cwi0((bwi0) objL2))) {
                                y(1L);
                                return;
                            }
                        } else if (i77Var.k(i2, objL2, zb5.g)) {
                            if (!L(objL2, i77Var, i2)) {
                                i77Var.o(i2, zb5.j);
                                i77Var.i();
                                break;
                            } else {
                                i77Var.o(i2, zb5.d);
                                y(1L);
                                return;
                            }
                        }
                    } else {
                        if (objL2 == zb5.j) {
                            break;
                        }
                        if (objL2 == null) {
                            if (i77Var.k(i2, objL2, zb5.e)) {
                                y(1L);
                                return;
                            }
                        } else if (objL2 == zb5.d || objL2 == zb5.h || objL2 == zb5.i || objL2 == zb5.k || objL2 == zb5.l) {
                            y(1L);
                            return;
                        } else if (objL2 != zb5.f) {
                            ogf.a(objL2, "Unexpected cell state: ");
                            return;
                        }
                    }
                }
                y(1L);
            } else if (L(objL, i77Var, i2)) {
                i77Var.o(i2, zb5.d);
                y(1L);
                return;
            } else {
                i77Var.o(i2, zb5.j);
                i77Var.i();
                y(1L);
            }
        }
    }

    public final i77<E> q(long j, i77<E> i77Var) {
        Object objA;
        i77<E> i77Var2;
        Unsafe unsafe;
        long j2;
        long longVolatile;
        Unsafe unsafe2;
        i77<Object> i77Var3 = zb5.a;
        yb5 yb5Var = yb5.a;
        loop0: while (true) {
            objA = coa.a(i77Var, j, yb5Var);
            if (!ltg.b(objA)) {
                f580 f580VarA = ltg.a(objA);
                while (true) {
                    Unsafe unsafe3 = s0o.a;
                    long j3 = C;
                    f580 f580Var = (f580) unsafe3.getObjectVolatile(this, j3);
                    if (f580Var.d >= f580VarA.d) {
                        break loop0;
                    }
                    if (!f580VarA.j()) {
                        break;
                    }
                    do {
                        unsafe2 = s0o.a;
                        if (unsafe2.compareAndSwapObject(this, C, f580Var, f580VarA)) {
                            if (!f580Var.f()) {
                                break loop0;
                            }
                            f580Var.e();
                            break loop0;
                        }
                    } while (unsafe2.getObjectVolatile(this, j3) == f580Var);
                    if (f580VarA.f()) {
                        f580VarA.e();
                    }
                }
            } else {
                break;
            }
        }
        if (ltg.b(objA)) {
            m();
            if (i77Var.d * ((long) zb5.b) < x()) {
                i77Var.a();
                return null;
            }
        } else {
            i77<E> i77Var4 = (i77) ltg.a(objA);
            long j4 = i77Var4.d;
            if (D() || j > s() / ((long) zb5.b)) {
                i77Var2 = i77Var4;
                break;
            }
            loop3: while (true) {
                Unsafe unsafe4 = s0o.a;
                long j5 = z;
                f580 f580Var2 = (f580) unsafe4.getObjectVolatile(this, j5);
                if (f580Var2.d >= j4 || !i77Var4.j()) {
                    i77Var2 = i77Var4;
                    break;
                }
                while (true) {
                    Unsafe unsafe5 = s0o.a;
                    i77Var2 = i77Var4;
                    if (unsafe5.compareAndSwapObject(this, z, f580Var2, i77Var4)) {
                        if (!f580Var2.f()) {
                            break loop3;
                        }
                        f580Var2.e();
                        break loop3;
                    }
                    if (unsafe5.getObjectVolatile(this, j5) != f580Var2) {
                        break;
                    }
                    i77Var4 = i77Var2;
                }
                if (i77Var2.f()) {
                    i77Var2.e();
                }
                i77Var4 = i77Var2;
            }
            if (j4 <= j) {
                return i77Var2;
            }
            long j6 = j4 * ((long) zb5.b);
            do {
                unsafe = s0o.a;
                j2 = D;
                longVolatile = unsafe.getLongVolatile(this, j2);
                if (longVolatile >= j6) {
                    break;
                }
            } while (!unsafe.compareAndSwapLong(this, j2, longVolatile, j6));
            if (j4 * ((long) zb5.b) < x()) {
                i77Var2.a();
            }
        }
        return null;
    }

    public final i77<E> r(long j, i77<E> i77Var) {
        Object objA;
        i77<E> i77Var2;
        long j2;
        Unsafe unsafe;
        tb5<E> tb5Var = this;
        i77<Object> i77Var3 = zb5.a;
        yb5 yb5Var = yb5.a;
        loop0: while (true) {
            objA = coa.a(i77Var, j, yb5Var);
            if (!ltg.b(objA)) {
                f580 f580VarA = ltg.a(objA);
                while (true) {
                    Unsafe unsafe2 = s0o.a;
                    long j3 = E;
                    f580 f580Var = (f580) unsafe2.getObjectVolatile(tb5Var, j3);
                    if (f580Var.d >= f580VarA.d) {
                        break loop0;
                    }
                    if (!f580VarA.j()) {
                        break;
                    }
                    do {
                        unsafe = s0o.a;
                        if (unsafe.compareAndSwapObject(tb5Var, E, f580Var, f580VarA)) {
                            if (!f580Var.f()) {
                                break loop0;
                            }
                            f580Var.e();
                            break loop0;
                        }
                    } while (unsafe.getObjectVolatile(tb5Var, j3) == f580Var);
                    if (f580VarA.f()) {
                        f580VarA.e();
                    }
                }
            } else {
                break;
            }
        }
        i77<E> i77Var4 = null;
        if (ltg.b(objA)) {
            tb5Var.m();
            if (i77Var.d * ((long) zb5.b) >= tb5Var.v()) {
                return null;
            }
            i77Var.a();
            return null;
        }
        i77<E> i77Var5 = (i77) ltg.a(objA);
        long j4 = i77Var5.d;
        if (j4 <= j) {
            return i77Var5;
        }
        long j5 = j4 * ((long) zb5.b);
        while (true) {
            Unsafe unsafe3 = s0o.a;
            long j6 = F;
            long longVolatile = unsafe3.getLongVolatile(tb5Var, j6);
            long j7 = 1152921504606846975L & longVolatile;
            if (j7 >= j5) {
                i77Var2 = i77Var4;
                j2 = j4;
                break;
            }
            i77Var2 = i77Var4;
            j2 = j4;
            if (unsafe3.compareAndSwapLong(tb5Var, j6, longVolatile, j7 + (((long) ((int) (longVolatile >> 60))) << 60))) {
                break;
            }
            tb5Var = this;
            i77Var4 = i77Var2;
            j4 = j2;
        }
        if (j2 * ((long) zb5.b) >= v()) {
            return i77Var2;
        }
        i77Var5.a();
        return i77Var2;
    }

    public final long s() {
        return s0o.a.getLongVolatile(this, y);
    }

    public final Throwable t() {
        return (Throwable) s0o.a.getObjectVolatile(this, w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String string;
        StringBuilder sb = new StringBuilder();
        Unsafe unsafe = s0o.a;
        int longVolatile = (int) (unsafe.getLongVolatile(this, F) >> 60);
        if (longVolatile == 2) {
            sb.append("closed,");
        } else if (longVolatile == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.a + ',');
        sb.append("data=[");
        int i2 = 0;
        List listK = kotlin.collections.b.k(unsafe.getObjectVolatile(this, C), unsafe.getObjectVolatile(this, E), unsafe.getObjectVolatile(this, z));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listK) {
            if (((i77) obj) != zb5.a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            lrh0.a();
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j = ((i77) next).d;
            do {
                Object next2 = it.next();
                long j2 = ((i77) next2).d;
                if (j > j2) {
                    next = next2;
                    j = j2;
                }
            } while (it.hasNext());
        }
        i77 i77Var = (i77) next;
        long jV = v();
        long jX = x();
        loop2: while (true) {
            int i3 = zb5.b;
            for (int i4 = i2; i4 < i3; i4++) {
                long j3 = (i77Var.d * ((long) zb5.b)) + ((long) i4);
                if (j3 >= jX && j3 >= jV) {
                    break loop2;
                }
                Object objL = i77Var.l(i4);
                Object obj2 = i77Var.v.get(i4 * 2);
                if (objL instanceof zb6) {
                    string = (j3 >= jV || j3 < jX) ? (j3 >= jX || j3 < jV) ? "cont" : "send" : "receive";
                } else if (objL instanceof a780) {
                    string = (j3 >= jV || j3 < jX) ? (j3 >= jX || j3 < jV) ? "select" : "onSend" : "onReceive";
                } else if (objL instanceof vf40) {
                    string = "receiveCatching";
                } else if (objL instanceof b) {
                    string = "sendBroadcast";
                } else if (objL instanceof cwi0) {
                    string = "EB(" + objL + ')';
                } else if (Intrinsics.g(objL, zb5.f) || Intrinsics.g(objL, zb5.g)) {
                    string = "resuming_sender";
                } else {
                    if (objL != null && !objL.equals(zb5.e) && !objL.equals(zb5.i) && !objL.equals(zb5.h) && !objL.equals(zb5.k) && !objL.equals(zb5.j) && !objL.equals(zb5.l)) {
                        string = objL.toString();
                    }
                }
                if (obj2 != null) {
                    sb.append("(" + string + ',' + obj2 + "),");
                } else {
                    sb.append(string + ',');
                }
            }
            i77Var = (i77) i77Var.c();
            if (i77Var == null) {
                break;
            }
            i2 = 0;
        }
        if (wae0.I(sb) == ',') {
            sb.deleteCharAt(sb.length() - 1).getClass();
        }
        sb.append("]");
        return sb.toString();
    }

    public final Throwable u() {
        Throwable thT = t();
        return thT == null ? new jt7("Channel was closed") : thT;
    }

    public final long v() {
        return s0o.a.getLongVolatile(this, D);
    }

    public final Throwable w() {
        Throwable thT = t();
        return thT == null ? new lt7("Channel was closed") : thT;
    }

    public final long x() {
        return s0o.a.getLongVolatile(this, F) & 1152921504606846975L;
    }

    public final void y(long j) {
        if ((i.addAndGet(this, j) & 4611686018427387904L) != 0) {
            while ((s0o.a.getLongVolatile(this, B) & 4611686018427387904L) != 0) {
            }
        }
    }
}
