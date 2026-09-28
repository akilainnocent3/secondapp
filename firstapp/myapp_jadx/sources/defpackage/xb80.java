package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes8.dex */
public class xb80 {
    public static final /* synthetic */ AtomicLongFieldUpdater c;
    public static final /* synthetic */ AtomicLongFieldUpdater d;
    public static final /* synthetic */ AtomicIntegerFieldUpdater e;
    public static final /* synthetic */ long f;
    public static final /* synthetic */ long i;
    public static final /* synthetic */ long v;
    private volatile /* synthetic */ int _availablePermits$volatile;
    public final int a;
    public final wb80 b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    public /* synthetic */ class a extends saj implements Function2<Long, dc80, dc80> {
        public static final a a = new a(2, cc80.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);

        @Override // kotlin.jvm.functions.Function2
        public final dc80 invoke(Long l, dc80 dc80Var) {
            int i = cc80.a;
            return new dc80(l.longValue(), dc80Var, 0);
        }
    }

    static {
        Unsafe unsafe = s0o.a;
        i = unsafe.objectFieldOffset(xb80.class.getDeclaredField("head$volatile"));
        c = AtomicLongFieldUpdater.newUpdater(xb80.class, "deqIdx$volatile");
        v = unsafe.objectFieldOffset(xb80.class.getDeclaredField("tail$volatile"));
        d = AtomicLongFieldUpdater.newUpdater(xb80.class, "enqIdx$volatile");
        e = AtomicIntegerFieldUpdater.newUpdater(xb80.class, "_availablePermits$volatile");
        f = unsafe.objectFieldOffset(xb80.class.getDeclaredField("_availablePermits$volatile"));
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [wb80] */
    public xb80(int i2, int i3) {
        this.a = i2;
        if (i2 <= 0) {
            kb5.a(hce0.a(i2, "Semaphore should have at least 1 permit, but had "));
            throw null;
        }
        if (i3 < 0 || i3 > i2) {
            kb5.a(hce0.a(i2, "The number of acquired permits should be in 0.."));
            throw null;
        }
        dc80 dc80Var = new dc80(0L, null, 2);
        this.head$volatile = dc80Var;
        this.tail$volatile = dc80Var;
        this._availablePermits$volatile = i2 - i3;
        this.b = new gaj() { // from class: wb80
            @Override // defpackage.gaj
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                this.a.c();
                return Unit.a;
            }
        };
    }

    public final Object a(x1b x1bVar) throws Throwable {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int andDecrement;
        int i2;
        do {
            atomicIntegerFieldUpdater = e;
            andDecrement = atomicIntegerFieldUpdater.getAndDecrement(this);
            i2 = this.a;
        } while (andDecrement > i2);
        if (andDecrement > 0) {
            return Unit.a;
        }
        bc6 bc6VarA = dc6.a(yzo.b(x1bVar));
        try {
            if (!b(bc6VarA)) {
                while (true) {
                    int andDecrement2 = atomicIntegerFieldUpdater.getAndDecrement(this);
                    if (andDecrement2 <= i2) {
                        if (andDecrement2 > 0) {
                            bc6VarA.s(Unit.a, this.b);
                            break;
                        }
                        if (b(bc6VarA)) {
                            break;
                        }
                    }
                }
            }
            Object objO = bc6VarA.o();
            y5b y5bVar = y5b.a;
            if (objO != y5bVar) {
                objO = Unit.a;
            }
            return objO == y5bVar ? objO : Unit.a;
        } catch (Throwable th) {
            bc6VarA.A();
            throw th;
        }
    }

    public final boolean b(bwi0 bwi0Var) {
        Object objA;
        Unsafe unsafe;
        xb80 xb80Var = this;
        Unsafe unsafe2 = s0o.a;
        long j = v;
        dc80 dc80Var = (dc80) unsafe2.getObjectVolatile(xb80Var, j);
        long andIncrement = d.getAndIncrement(xb80Var);
        a aVar = a.a;
        long j2 = andIncrement / ((long) cc80.f);
        loop0: while (true) {
            objA = coa.a(dc80Var, j2, aVar);
            if (ltg.b(objA)) {
                break;
            }
            f580 f580VarA = ltg.a(objA);
            while (true) {
                f580 f580Var = (f580) s0o.a.getObjectVolatile(xb80Var, j);
                if (f580Var.d >= f580VarA.d) {
                    xb80Var = this;
                    break loop0;
                }
                if (!f580VarA.j()) {
                    break;
                }
                do {
                    unsafe = s0o.a;
                    xb80Var = this;
                    if (unsafe.compareAndSwapObject(xb80Var, v, f580Var, f580VarA)) {
                        if (!f580Var.f()) {
                            break loop0;
                        }
                        f580Var.e();
                        break loop0;
                    }
                } while (unsafe.getObjectVolatile(xb80Var, j) == f580Var);
                if (f580VarA.f()) {
                    f580VarA.e();
                }
            }
            xb80Var = this;
        }
        dc80 dc80Var2 = (dc80) ltg.a(objA);
        AtomicReferenceArray atomicReferenceArray = dc80Var2.i;
        int i2 = (int) (andIncrement % ((long) cc80.f));
        while (!atomicReferenceArray.compareAndSet(i2, null, bwi0Var)) {
            if (atomicReferenceArray.get(i2) != null) {
                toe0 toe0Var = cc80.b;
                toe0 toe0Var2 = cc80.c;
                while (!atomicReferenceArray.compareAndSet(i2, toe0Var, toe0Var2)) {
                    if (atomicReferenceArray.get(i2) != toe0Var) {
                        return false;
                    }
                }
                ((zb6) bwi0Var).s(Unit.a, xb80Var.b);
                return true;
            }
        }
        bwi0Var.a(dc80Var2, i2);
        return true;
    }

    public final void c() {
        Unsafe unsafe;
        long j;
        int intVolatile;
        int i2;
        Object objA;
        boolean zD;
        Unsafe unsafe2;
        do {
            int andIncrement = e.getAndIncrement(this);
            int i3 = this.a;
            if (andIncrement >= i3) {
                do {
                    unsafe = s0o.a;
                    j = f;
                    intVolatile = unsafe.getIntVolatile(this, j);
                    i2 = this.a;
                    if (intVolatile <= i2) {
                        break;
                    }
                } while (!unsafe.compareAndSwapInt(this, j, intVolatile, i2));
                fa30.a(i3, "The number of released permits cannot be greater than ");
                return;
            }
            if (andIncrement >= 0) {
                return;
            }
            Unsafe unsafe3 = s0o.a;
            long j2 = i;
            dc80 dc80Var = (dc80) unsafe3.getObjectVolatile(this, j2);
            long andIncrement2 = c.getAndIncrement(this);
            long j3 = andIncrement2 / ((long) cc80.f);
            yb80 yb80Var = yb80.a;
            while (true) {
                objA = coa.a(dc80Var, j3, yb80Var);
                if (!ltg.b(objA)) {
                    f580 f580VarA = ltg.a(objA);
                    while (true) {
                        f580 f580Var = (f580) s0o.a.getObjectVolatile(this, j2);
                        if (f580Var.d >= f580VarA.d) {
                            break;
                        }
                        if (!f580VarA.j()) {
                            break;
                        }
                        do {
                            unsafe2 = s0o.a;
                            if (unsafe2.compareAndSwapObject(this, i, f580Var, f580VarA)) {
                                if (!f580Var.f()) {
                                    break;
                                }
                                f580Var.e();
                                break;
                            }
                        } while (unsafe2.getObjectVolatile(this, j2) == f580Var);
                        if (f580VarA.f()) {
                            f580VarA.e();
                        }
                    }
                } else {
                    break;
                }
            }
            dc80 dc80Var2 = (dc80) ltg.a(objA);
            AtomicReferenceArray atomicReferenceArray = dc80Var2.i;
            dc80Var2.a();
            zD = false;
            if (dc80Var2.d <= j3) {
                int i4 = (int) (andIncrement2 % ((long) cc80.f));
                Object andSet = atomicReferenceArray.getAndSet(i4, cc80.b);
                if (andSet == null) {
                    int i5 = cc80.a;
                    int i6 = 0;
                    while (true) {
                        if (i6 >= i5) {
                            toe0 toe0Var = cc80.b;
                            toe0 toe0Var2 = cc80.d;
                            do {
                                if (atomicReferenceArray.compareAndSet(i4, toe0Var, toe0Var2)) {
                                    zD = true;
                                    break;
                                }
                            } while (atomicReferenceArray.get(i4) == toe0Var);
                            zD = !zD;
                            break;
                        }
                        if (atomicReferenceArray.get(i4) == cc80.c) {
                            zD = true;
                            break;
                        }
                        i6++;
                    }
                } else if (andSet != cc80.e) {
                    if (andSet instanceof zb6) {
                        zb6 zb6Var = (zb6) andSet;
                        toe0 toe0VarI = zb6Var.i(Unit.a, this.b);
                        if (toe0VarI != null) {
                            zb6Var.x(toe0VarI);
                            zD = true;
                            break;
                            break;
                        }
                    } else {
                        if (!(andSet instanceof a780)) {
                            ogf.a(andSet, "unexpected: ");
                            return;
                        }
                        zD = ((a780) andSet).d(this, Unit.a);
                    }
                }
            }
        } while (!zD);
    }
}
