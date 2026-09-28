package defpackage;

import java.util.concurrent.locks.LockSupport;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes8.dex */
public abstract class upg extends vpg implements ekd {
    public static final /* synthetic */ long f;
    public static final /* synthetic */ long i;
    public static final /* synthetic */ long v;
    public static final /* synthetic */ int w = 0;
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    public final class a extends c {
        public final bc6 c;

        public a(long j, bc6 bc6Var) {
            super(j);
            this.c = bc6Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.c.D(upg.this, Unit.a);
        }

        @Override // upg.c
        public final String toString() {
            return super.toString() + this.c;
        }
    }

    public static final class b extends c {
        public final Runnable c;

        public b(long j, Runnable runnable) {
            super(j);
            this.c = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.c.run();
        }

        @Override // upg.c
        public final String toString() {
            return super.toString() + this.c;
        }
    }

    public static abstract class c implements Runnable, Comparable<c>, wse, cpf0 {
        private volatile Object _heap;
        public long a;
        public int b = -1;

        public c(long j) {
            this.a = j;
        }

        @Override // defpackage.cpf0
        public final void a(d dVar) {
            if (this._heap != wpg.a) {
                this._heap = dVar;
            } else {
                hb5.a("Failed requirement.");
            }
        }

        public final int c(long j, d dVar, upg upgVar) {
            synchronized (this) {
                if (this._heap == wpg.a) {
                    return 2;
                }
                synchronized (dVar) {
                    try {
                        Object[] objArr = dVar.a;
                        c cVar = (c) (objArr != null ? objArr[0] : null);
                        int i = upg.w;
                        if (s0o.a.getIntVolatile(upgVar, upg.i) == 1) {
                            return 1;
                        }
                        if (cVar == null) {
                            dVar.c = j;
                        } else {
                            long j2 = cVar.a;
                            if (j2 - j < 0) {
                                j = j2;
                            }
                            long j3 = dVar.c;
                            if (j - j3 > 0) {
                                dVar.c = j;
                            } else {
                                j = j3;
                            }
                        }
                        if (this.a - j < 0) {
                            this.a = j;
                        }
                        dVar.a(this);
                        return 0;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        @Override // java.lang.Comparable
        public final int compareTo(c cVar) {
            long j = this.a - cVar.a;
            if (j > 0) {
                return 1;
            }
            return j < 0 ? -1 : 0;
        }

        @Override // defpackage.wse
        public final void dispose() {
            synchronized (this) {
                try {
                    Object obj = this._heap;
                    toe0 toe0Var = wpg.a;
                    if (obj == toe0Var) {
                        return;
                    }
                    d dVar = obj instanceof d ? (d) obj : null;
                    if (dVar != null) {
                        synchronized (dVar) {
                            Object obj2 = this._heap;
                            if ((obj2 instanceof bpf0 ? (bpf0) obj2 : null) != null) {
                                dVar.c(this.b);
                            }
                        }
                    }
                    this._heap = toe0Var;
                    Unit unit = Unit.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // defpackage.cpf0
        public final void setIndex(int i) {
            this.b = i;
        }

        public String toString() {
            return uvh.a(new StringBuilder("Delayed[nanos="), this.a, ']');
        }
    }

    public static final class d extends bpf0<c> {
        public long c;
    }

    static {
        Unsafe unsafe = s0o.a;
        v = unsafe.objectFieldOffset(upg.class.getDeclaredField("_queue$volatile"));
        f = unsafe.objectFieldOffset(upg.class.getDeclaredField("_delayed$volatile"));
        i = unsafe.objectFieldOffset(upg.class.getDeclaredField("_isCompleted$volatile"));
    }

    @Override // defpackage.tpg
    public void A0() {
        toe0 toe0Var;
        Unsafe unsafe;
        c cVarC;
        xof0.a.set(null);
        s0o.a.putIntVolatile(this, i, 1);
        toe0 toe0Var2 = wpg.b;
        long j = v;
        loop0: while (true) {
            Object objectVolatile = s0o.a.getObjectVolatile(this, j);
            if (objectVolatile == null) {
                while (true) {
                    Unsafe unsafe2 = s0o.a;
                    toe0Var = toe0Var2;
                    if (unsafe2.compareAndSwapObject(this, v, (Object) null, toe0Var2)) {
                        break loop0;
                    } else if (unsafe2.getObjectVolatile(this, j) != null) {
                        break;
                    } else {
                        toe0Var2 = toe0Var;
                    }
                }
                toe0Var2 = toe0Var;
            } else {
                toe0Var = toe0Var2;
                if (objectVolatile instanceof wet) {
                    ((wet) objectVolatile).b();
                    break;
                }
                if (objectVolatile == toe0Var) {
                    break;
                }
                wet wetVar = new wet(8, true);
                wetVar.a((Runnable) objectVolatile);
                do {
                    unsafe = s0o.a;
                    if (unsafe.compareAndSwapObject(this, v, objectVolatile, wetVar)) {
                        break loop0;
                    }
                } while (unsafe.getObjectVolatile(this, j) == objectVolatile);
                toe0Var2 = toe0Var;
            }
        }
        while (u0() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            d dVar = (d) s0o.a.getObjectVolatile(this, f);
            if (dVar == null) {
                return;
            }
            synchronized (dVar) {
                cVarC = dVar.b() > 0 ? dVar.c(0) : null;
            }
            c cVar = cVarC;
            if (cVar == null) {
                return;
            } else {
                F0(jNanoTime, cVar);
            }
        }
    }

    public void G0(Runnable runnable) {
        I0();
        if (!K0(runnable)) {
            hcd.y.G0(runnable);
            return;
        }
        Thread threadD0 = D0();
        if (Thread.currentThread() != threadD0) {
            LockSupport.unpark(threadD0);
        }
    }

    public final void I0() {
        c cVarC;
        d dVar = (d) s0o.a.getObjectVolatile(this, f);
        if (dVar == null || dVar.b() == 0) {
            return;
        }
        long jNanoTime = System.nanoTime();
        do {
            synchronized (dVar) {
                try {
                    Object[] objArr = dVar.a;
                    cVarC = null;
                    Object obj = objArr != null ? objArr[0] : null;
                    if (obj != null) {
                        c cVar = (c) obj;
                        cVarC = ((jNanoTime - cVar.a) > 0L ? 1 : ((jNanoTime - cVar.a) == 0L ? 0 : -1)) >= 0 ? K0(cVar) : false ? dVar.c(0) : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (cVarC != null);
    }

    public final boolean K0(Runnable runnable) {
        Unsafe unsafe;
        Unsafe unsafe2;
        Unsafe unsafe3;
        while (true) {
            Unsafe unsafe4 = s0o.a;
            long j = v;
            Object objectVolatile = unsafe4.getObjectVolatile(this, j);
            if (unsafe4.getIntVolatile(this, i) == 1) {
                return false;
            }
            if (objectVolatile == null) {
                do {
                    unsafe = s0o.a;
                    if (unsafe.compareAndSwapObject(this, v, (Object) null, runnable)) {
                        return true;
                    }
                } while (unsafe.getObjectVolatile(this, j) == null);
            } else if (objectVolatile instanceof wet) {
                wet wetVar = (wet) objectVolatile;
                int iA = wetVar.a(runnable);
                if (iA == 0) {
                    return true;
                }
                if (iA == 1) {
                    wet wetVarC = wetVar.c();
                    do {
                        unsafe2 = s0o.a;
                        if (unsafe2.compareAndSwapObject(this, v, objectVolatile, wetVarC)) {
                            break;
                        }
                    } while (unsafe2.getObjectVolatile(this, j) == objectVolatile);
                } else if (iA == 2) {
                    return false;
                }
            } else {
                if (objectVolatile == wpg.b) {
                    return false;
                }
                wet wetVar2 = new wet(8, true);
                wetVar2.a((Runnable) objectVolatile);
                wetVar2.a(runnable);
                do {
                    unsafe3 = s0o.a;
                    if (unsafe3.compareAndSwapObject(this, v, objectVolatile, wetVar2)) {
                        return true;
                    }
                } while (unsafe3.getObjectVolatile(this, j) == objectVolatile);
            }
        }
    }

    public final boolean O0() {
        gx0<bse<?>> gx0Var = this.d;
        if (gx0Var != null ? gx0Var.isEmpty() : true) {
            Unsafe unsafe = s0o.a;
            d dVar = (d) unsafe.getObjectVolatile(this, f);
            if (dVar != null && dVar.b() != 0) {
                return false;
            }
            Object objectVolatile = unsafe.getObjectVolatile(this, v);
            if (objectVolatile != null) {
                if (objectVolatile instanceof wet) {
                    long longVolatile = unsafe.getLongVolatile((wet) objectVolatile, wet.g);
                    return ((int) (1073741823 & longVolatile)) == ((int) ((longVolatile & 1152921503533105152L) >> 30));
                }
                if (objectVolatile == wpg.b) {
                }
            }
            return true;
        }
        return false;
    }

    public final void W0(long j, c cVar) {
        upg upgVar;
        int iC;
        Unsafe unsafe;
        Thread threadD0;
        long j2 = f;
        Unsafe unsafe2 = s0o.a;
        if (unsafe2.getIntVolatile(this, i) == 1) {
            upgVar = this;
            iC = 1;
        } else {
            d dVar = (d) unsafe2.getObjectVolatile(this, j2);
            if (dVar == null) {
                d dVar2 = new d();
                dVar2.c = j;
                while (true) {
                    unsafe = s0o.a;
                    upgVar = this;
                    if (unsafe.compareAndSwapObject(upgVar, f, (Object) null, dVar2) || unsafe.getObjectVolatile(upgVar, j2) != null) {
                        break;
                    } else {
                        this = upgVar;
                    }
                }
                Object objectVolatile = unsafe.getObjectVolatile(upgVar, j2);
                objectVolatile.getClass();
                dVar = (d) objectVolatile;
                unsafe2 = unsafe;
            } else {
                upgVar = this;
            }
            iC = cVar.c(j, dVar, upgVar);
        }
        if (iC != 0) {
            if (iC == 1) {
                upgVar.F0(j, cVar);
                return;
            } else {
                if (iC == 2) {
                    return;
                }
                ib5.a("unexpected result");
                return;
            }
        }
        d dVar3 = (d) unsafe2.getObjectVolatile(upgVar, j2);
        cpf0 cpf0Var = null;
        if (dVar3 != null) {
            synchronized (dVar3) {
                cpf0[] cpf0VarArr = dVar3.a;
                cpf0Var = cpf0VarArr != null ? cpf0VarArr[0] : null;
            }
            cpf0Var = (c) cpf0Var;
        }
        if (cpf0Var != cVar || Thread.currentThread() == (threadD0 = upgVar.D0())) {
            return;
        }
        LockSupport.unpark(threadD0);
    }

    @Override // defpackage.k5b
    public final void d0(CoroutineContext coroutineContext, Runnable runnable) {
        G0(runnable);
    }

    @Override // defpackage.ekd
    public final void l(long j, bc6 bc6Var) {
        long j2 = 0;
        if (j > 0) {
            j2 = j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j;
        }
        if (j2 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            a aVar = new a(j2 + jNanoTime, bc6Var);
            W0(jNanoTime, aVar);
            bc6Var.u(new gte(aVar));
        }
    }

    public wse m(long j, Runnable runnable, CoroutineContext coroutineContext) {
        return icd.a.m(j, runnable, coroutineContext);
    }

    @Override // defpackage.tpg
    public final long u0() {
        Unsafe unsafe;
        upg upgVar;
        Unsafe unsafe2;
        Runnable runnable;
        Object obj;
        toe0 toe0Var = wpg.b;
        long j = v;
        if (!z0()) {
            I0();
            loop0: while (true) {
                unsafe = s0o.a;
                Object objectVolatile = unsafe.getObjectVolatile(this, j);
                if (objectVolatile == null) {
                    upgVar = this;
                } else if (objectVolatile instanceof wet) {
                    wet wetVar = (wet) objectVolatile;
                    Object objD = wetVar.d();
                    if (objD != wet.e) {
                        Runnable runnable2 = (Runnable) objD;
                        upgVar = this;
                        runnable = runnable2;
                        unsafe2 = unsafe;
                        break;
                    }
                    wet wetVarC = wetVar.c();
                    while (true) {
                        Unsafe unsafe3 = s0o.a;
                        upgVar = this;
                        if (unsafe3.compareAndSwapObject(upgVar, v, objectVolatile, wetVarC) || unsafe3.getObjectVolatile(upgVar, j) != objectVolatile) {
                            break;
                        }
                        this = upgVar;
                    }
                    this = upgVar;
                } else {
                    upgVar = this;
                    if (objectVolatile != toe0Var) {
                        do {
                            unsafe2 = s0o.a;
                            if (unsafe2.compareAndSwapObject(upgVar, v, objectVolatile, (Object) null)) {
                                runnable = (Runnable) objectVolatile;
                                unsafe = unsafe2;
                                break loop0;
                            }
                        } while (unsafe2.getObjectVolatile(upgVar, j) == objectVolatile);
                        this = upgVar;
                    }
                }
                unsafe2 = unsafe;
                runnable = null;
                break;
            }
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            gx0<bse<?>> gx0Var = upgVar.d;
            if (((gx0Var == null || gx0Var.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object objectVolatile2 = unsafe.getObjectVolatile(upgVar, j);
                if (objectVolatile2 != null) {
                    if (objectVolatile2 instanceof wet) {
                        long longVolatile = unsafe2.getLongVolatile((wet) objectVolatile2, wet.g);
                        if (((int) (1073741823 & longVolatile)) != ((int) ((longVolatile & 1152921503533105152L) >> 30))) {
                            return 0L;
                        }
                    } else if (objectVolatile2 == toe0Var) {
                        return Long.MAX_VALUE;
                    }
                }
                d dVar = (d) unsafe.getObjectVolatile(upgVar, f);
                if (dVar != null) {
                    synchronized (dVar) {
                        Object[] objArr = dVar.a;
                        obj = objArr != null ? objArr[0] : null;
                    }
                    c cVar = (c) obj;
                    if (cVar != null) {
                        long jNanoTime = cVar.a - System.nanoTime();
                        if (jNanoTime >= 0) {
                            return jNanoTime;
                        }
                    }
                }
                return Long.MAX_VALUE;
            }
        }
        return 0L;
    }
}
