package defpackage;

import com.sporty.android.permission.location.KN.qUnCRF;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes8.dex */
public final class u5b implements Executor, Closeable {
    public static final /* synthetic */ long A;
    public static final /* synthetic */ AtomicLongFieldUpdater v;
    public static final toe0 w;
    public static final /* synthetic */ long y;
    public static final /* synthetic */ long z;
    private volatile /* synthetic */ int _isTerminated$volatile;
    public final int a;
    public final int b;
    public final long c;
    private volatile /* synthetic */ long controlState$volatile;
    public final String d;
    public final p2l e;
    public final p2l f;
    public final tf50<a> i;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    public final class a extends Thread {
        public static final /* synthetic */ AtomicIntegerFieldUpdater w = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl$volatile");
        public static final /* synthetic */ long y = s0o.a.objectFieldOffset(a.class.getDeclaredField("workerCtl$volatile"));
        public final iwj0 a;
        public final dq40<n5f0> b;
        public b c;
        public long d;
        public long e;
        public int f;
        public boolean i;
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;
        private volatile /* synthetic */ int workerCtl$volatile;

        public a() {
            throw null;
        }

        public a(int i) {
            setDaemon(true);
            setContextClassLoader(u5b.class.getClassLoader());
            this.a = new iwj0();
            this.b = new dq40<>();
            this.c = b.d;
            this.nextParkedWorker = u5b.w;
            int iNanoTime = (int) System.nanoTime();
            this.f = iNanoTime == 0 ? 42 : iNanoTime;
            f(i);
        }

        public final n5f0 a(boolean z) {
            n5f0 n5f0VarE;
            n5f0 n5f0VarE2;
            long j;
            Unsafe unsafe;
            b bVar = this.c;
            b bVar2 = b.a;
            u5b u5bVar = u5b.this;
            n5f0 n5f0Var = null;
            iwj0 iwj0Var = this.a;
            if (bVar != bVar2) {
                AtomicLongFieldUpdater atomicLongFieldUpdater = u5b.v;
                do {
                    j = atomicLongFieldUpdater.get(u5bVar);
                    if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                        iwj0Var.getClass();
                        long j2 = iwj0.f;
                        loop1: while (true) {
                            Unsafe unsafe2 = s0o.a;
                            n5f0 n5f0Var2 = (n5f0) unsafe2.getObjectVolatile(iwj0Var, j2);
                            if (n5f0Var2 == null || !n5f0Var2.b) {
                                int intVolatile = unsafe2.getIntVolatile(iwj0Var, iwj0.e);
                                int intVolatile2 = unsafe2.getIntVolatile(iwj0Var, iwj0.g);
                                while (intVolatile != intVolatile2 && s0o.a.getIntVolatile(iwj0Var, iwj0.d) != 0) {
                                    intVolatile2--;
                                    n5f0 n5f0VarD = iwj0Var.d(intVolatile2, true);
                                    if (n5f0VarD != null) {
                                        n5f0Var = n5f0VarD;
                                        break;
                                    }
                                }
                                break;
                            }
                            do {
                                unsafe = s0o.a;
                                if (unsafe.compareAndSwapObject(iwj0Var, iwj0.f, n5f0Var2, (Object) null)) {
                                    n5f0Var = n5f0Var2;
                                    break loop1;
                                }
                            } while (unsafe.getObjectVolatile(iwj0Var, j2) == n5f0Var2);
                        }
                        if (n5f0Var != null) {
                            return n5f0Var;
                        }
                        n5f0 n5f0VarD2 = u5bVar.f.d();
                        return n5f0VarD2 == null ? i(1) : n5f0VarD2;
                    }
                } while (!u5b.v.compareAndSet(u5bVar, j, j - 4398046511104L));
                this.c = b.a;
            }
            if (z) {
                boolean z2 = d(u5bVar.a * 2) == 0;
                if (z2 && (n5f0VarE2 = e()) != null) {
                    return n5f0VarE2;
                }
                iwj0Var.getClass();
                n5f0 n5f0VarC = (n5f0) s0o.a.getAndSetObject(iwj0Var, iwj0.f, (Object) null);
                if (n5f0VarC == null) {
                    n5f0VarC = iwj0Var.c();
                }
                if (n5f0VarC != null) {
                    return n5f0VarC;
                }
                if (!z2 && (n5f0VarE = e()) != null) {
                    return n5f0VarE;
                }
            } else {
                n5f0 n5f0VarE3 = e();
                if (n5f0VarE3 != null) {
                    return n5f0VarE3;
                }
            }
            return i(3);
        }

        public final int b() {
            return this.indexInArray;
        }

        public final Object c() {
            return this.nextParkedWorker;
        }

        public final int d(int i) {
            int i2 = this.f;
            int i3 = i2 ^ (i2 << 13);
            int i4 = i3 ^ (i3 >> 17);
            int i5 = i4 ^ (i4 << 5);
            this.f = i5;
            int i6 = i - 1;
            return (i6 & i) == 0 ? i6 & i5 : (Integer.MAX_VALUE & i5) % i;
        }

        public final n5f0 e() {
            int iD = d(2);
            u5b u5bVar = u5b.this;
            if (iD == 0) {
                n5f0 n5f0VarD = u5bVar.e.d();
                return n5f0VarD != null ? n5f0VarD : u5bVar.f.d();
            }
            n5f0 n5f0VarD2 = u5bVar.f.d();
            return n5f0VarD2 != null ? n5f0VarD2 : u5bVar.e.d();
        }

        public final void f(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append(u5b.this.d);
            sb.append("-worker-");
            sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
            setName(sb.toString());
            this.indexInArray = i;
        }

        public final void g(Object obj) {
            this.nextParkedWorker = obj;
        }

        public final boolean h(b bVar) {
            b bVar2 = this.c;
            boolean z = bVar2 == b.a;
            if (z) {
                u5b.v.addAndGet(u5b.this, 4398046511104L);
            }
            if (bVar2 != bVar) {
                this.c = bVar;
            }
            return z;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r7v8, types: [T, java.lang.Object, n5f0] */
        public final n5f0 i(int i) {
            int i2;
            long j;
            T tC;
            long j2;
            long j3;
            Unsafe unsafe;
            AtomicLongFieldUpdater atomicLongFieldUpdater = u5b.v;
            u5b u5bVar = u5b.this;
            int i3 = (int) (atomicLongFieldUpdater.get(u5bVar) & 2097151);
            Object obj = null;
            if (i3 < 2) {
                return null;
            }
            int iD = d(i3);
            int i4 = 0;
            long jMin = Long.MAX_VALUE;
            while (i4 < i3) {
                iD++;
                if (iD > i3) {
                    iD = 1;
                }
                a aVarB = u5bVar.i.b(iD);
                if (aVarB == null || aVarB == this) {
                    i2 = i3;
                } else {
                    iwj0 iwj0Var = aVarB.a;
                    if (i != 3) {
                        iwj0Var.getClass();
                        Unsafe unsafe2 = s0o.a;
                        int intVolatile = unsafe2.getIntVolatile(iwj0Var, iwj0.e);
                        j = 0;
                        int intVolatile2 = unsafe2.getIntVolatile(iwj0Var, iwj0.g);
                        boolean z = i == 1;
                        while (true) {
                            if (intVolatile != intVolatile2) {
                                if (z) {
                                    i2 = i3;
                                    if (s0o.a.getIntVolatile(iwj0Var, iwj0.d) == 0) {
                                    }
                                } else {
                                    i2 = i3;
                                }
                                int i5 = intVolatile + 1;
                                n5f0 n5f0VarD = iwj0Var.d(intVolatile, z);
                                if (n5f0VarD != null) {
                                    tC = n5f0VarD;
                                    break;
                                }
                                intVolatile = i5;
                                i3 = i2;
                            } else {
                                i2 = i3;
                            }
                            tC = obj;
                            break;
                        }
                    } else {
                        i2 = i3;
                        j = 0;
                        tC = iwj0Var.c();
                    }
                    dq40<n5f0> dq40Var = this.b;
                    if (tC == 0) {
                        j2 = -1;
                        long j4 = iwj0.f;
                        while (true) {
                            ?? r7 = (n5f0) s0o.a.getObjectVolatile(iwj0Var, j4);
                            if (r7 != 0) {
                                if (((r7.b ? 1 : 2) & i) != 0) {
                                    a6f0.f.getClass();
                                    iwj0 iwj0Var2 = iwj0Var;
                                    long jNanoTime = System.nanoTime() - r7.a;
                                    long j5 = a6f0.b;
                                    if (jNanoTime < j5) {
                                        j3 = j5 - jNanoTime;
                                        break;
                                    }
                                    do {
                                        unsafe = s0o.a;
                                        if (unsafe.compareAndSwapObject(iwj0Var2, iwj0.f, (Object) r7, (Object) null)) {
                                            dq40Var.a = r7;
                                            j3 = -1;
                                            break;
                                        }
                                    } while (unsafe.getObjectVolatile(iwj0Var2, j4) == r7);
                                    iwj0Var = iwj0Var2;
                                }
                            }
                            j3 = -2;
                            break;
                        }
                    } else {
                        dq40Var.a = tC;
                        j3 = -1;
                        j2 = -1;
                    }
                    if (j3 == j2) {
                        n5f0 n5f0Var = dq40Var.a;
                        dq40Var.a = null;
                        return n5f0Var;
                    }
                    if (j3 > j) {
                        jMin = Math.min(jMin, j3);
                    }
                }
                i4++;
                i3 = i2;
                obj = null;
            }
            if (jMin == Long.MAX_VALUE) {
                jMin = 0;
            }
            this.e = jMin;
            return null;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            loop0: while (true) {
                boolean z = false;
                while (true) {
                    if (!u5b.this.isTerminated()) {
                        b bVar = this.c;
                        b bVar2 = b.e;
                        if (bVar == bVar2) {
                            break loop0;
                        }
                        n5f0 n5f0VarA = a(this.i);
                        long j = 0;
                        if (n5f0VarA != null) {
                            this.e = 0L;
                            u5b u5bVar = u5b.this;
                            this.d = 0L;
                            if (this.c == b.c) {
                                this.c = b.b;
                            }
                            if (!n5f0VarA.b) {
                                u5bVar.getClass();
                                try {
                                    n5f0VarA.run();
                                    break;
                                } catch (Throwable th) {
                                    Thread threadCurrentThread = Thread.currentThread();
                                    threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
                                    break;
                                }
                            }
                            if (h(b.b) && !u5bVar.F() && !u5bVar.o(s0o.a.getLongVolatile(u5bVar, u5b.z))) {
                                u5bVar.F();
                            }
                            u5bVar.getClass();
                            try {
                                n5f0VarA.run();
                            } catch (Throwable th2) {
                                Thread threadCurrentThread2 = Thread.currentThread();
                                threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th2);
                            }
                            u5b.v.addAndGet(u5bVar, -2097152L);
                            if (this.c == bVar2) {
                                break;
                            }
                            this.c = b.d;
                            break;
                        }
                        this.i = false;
                        if (this.e == 0) {
                            Object obj = this.nextParkedWorker;
                            toe0 toe0Var = u5b.w;
                            if (obj != toe0Var) {
                                s0o.a.putIntVolatile(this, y, -1);
                                while (this.nextParkedWorker != u5b.w) {
                                    Unsafe unsafe = s0o.a;
                                    long j2 = y;
                                    if (unsafe.getIntVolatile(this, j2) != -1 || u5b.this.isTerminated()) {
                                        break;
                                    }
                                    b bVar3 = this.c;
                                    b bVar4 = b.e;
                                    if (bVar3 == bVar4) {
                                        break;
                                    }
                                    h(b.c);
                                    Thread.interrupted();
                                    if (this.d == j) {
                                        this.d = System.nanoTime() + u5b.this.c;
                                    }
                                    LockSupport.parkNanos(u5b.this.c);
                                    if (System.nanoTime() - this.d >= j) {
                                        this.d = j;
                                        u5b u5bVar2 = u5b.this;
                                        synchronized (u5bVar2.i) {
                                            try {
                                                if (!u5bVar2.isTerminated()) {
                                                    AtomicLongFieldUpdater atomicLongFieldUpdater = u5b.v;
                                                    if (((int) (atomicLongFieldUpdater.get(u5bVar2) & 2097151)) > u5bVar2.a) {
                                                        if (unsafe.compareAndSwapInt(this, j2, -1, 1)) {
                                                            int i = this.indexInArray;
                                                            f(0);
                                                            u5bVar2.m(this, i, 0);
                                                            int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(u5bVar2) & 2097151);
                                                            if (andDecrement != i) {
                                                                a aVarB = u5bVar2.i.b(andDecrement);
                                                                aVarB.getClass();
                                                                a aVar = aVarB;
                                                                u5bVar2.i.c(i, aVar);
                                                                aVar.f(i);
                                                                u5bVar2.m(aVar, andDecrement, i);
                                                            }
                                                            u5bVar2.i.c(andDecrement, null);
                                                            Unit unit = Unit.a;
                                                            this.c = bVar4;
                                                        }
                                                    }
                                                }
                                            } catch (Throwable th3) {
                                                throw th3;
                                            }
                                        }
                                    }
                                    j = 0;
                                }
                            } else {
                                u5b u5bVar3 = u5b.this;
                                u5bVar3.getClass();
                                if (this.nextParkedWorker == toe0Var) {
                                    while (true) {
                                        Unsafe unsafe2 = s0o.a;
                                        long j3 = u5b.A;
                                        long longVolatile = unsafe2.getLongVolatile(u5bVar3, j3);
                                        int i2 = this.indexInArray;
                                        this.nextParkedWorker = u5bVar3.i.b((int) (longVolatile & 2097151));
                                        u5b u5bVar4 = u5bVar3;
                                        if (unsafe2.compareAndSwapLong(u5bVar4, j3, longVolatile, ((longVolatile + 2097152) & (-2097152)) | ((long) i2))) {
                                            break;
                                        } else {
                                            u5bVar3 = u5bVar4;
                                        }
                                    }
                                }
                            }
                        } else {
                            if (z) {
                                h(b.c);
                                Thread.interrupted();
                                LockSupport.parkNanos(this.e);
                                this.e = 0L;
                                break;
                            }
                            z = true;
                        }
                    } else {
                        break loop0;
                    }
                }
            }
            h(b.e);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        public static final b a;
        public static final b b;
        public static final b c;
        public static final b d;
        public static final b e;
        public static final /* synthetic */ b[] f;

        static {
            b bVar = new b("CPU_ACQUIRED", 0);
            a = bVar;
            b bVar2 = new b("BLOCKING", 1);
            b = bVar2;
            b bVar3 = new b("PARKING", 2);
            c = bVar3;
            b bVar4 = new b("DORMANT", 3);
            d = bVar4;
            b bVar5 = new b("TERMINATED", 4);
            e = bVar5;
            f = new b[]{bVar, bVar2, bVar3, bVar4, bVar5};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f.clone();
        }
    }

    static {
        Unsafe unsafe = s0o.a;
        A = unsafe.objectFieldOffset(u5b.class.getDeclaredField("parkedWorkersStack$volatile"));
        v = AtomicLongFieldUpdater.newUpdater(u5b.class, "controlState$volatile");
        z = unsafe.objectFieldOffset(u5b.class.getDeclaredField("controlState$volatile"));
        y = unsafe.objectFieldOffset(u5b.class.getDeclaredField("_isTerminated$volatile"));
        w = new toe0("NOT_IN_STACK");
    }

    public static /* synthetic */ void l(u5b u5bVar, Runnable runnable, int i) {
        u5bVar.g(runnable, false, (i & 4) == 0);
    }

    public final boolean F() {
        u5b u5bVar;
        toe0 toe0Var;
        int iB;
        while (true) {
            Unsafe unsafe = s0o.a;
            long j = A;
            long longVolatile = unsafe.getLongVolatile(this, j);
            a aVarB = this.i.b((int) (2097151 & longVolatile));
            if (aVarB == null) {
                aVarB = null;
                u5bVar = this;
            } else {
                long j2 = (2097152 + longVolatile) & (-2097152);
                Object objC = aVarB.c();
                while (true) {
                    toe0Var = w;
                    if (objC == toe0Var) {
                        iB = -1;
                        break;
                    }
                    if (objC == null) {
                        iB = 0;
                        break;
                    }
                    a aVar = (a) objC;
                    iB = aVar.b();
                    if (iB != 0) {
                        break;
                    }
                    objC = aVar.c();
                    unsafe = unsafe;
                    this = this;
                }
                if (iB >= 0) {
                    u5b u5bVar2 = this;
                    boolean zCompareAndSwapLong = unsafe.compareAndSwapLong(u5bVar2, j, longVolatile, j2 | ((long) iB));
                    u5bVar = u5bVar2;
                    if (zCompareAndSwapLong) {
                        aVarB.g(toe0Var);
                    }
                    this = u5bVar;
                } else {
                    continue;
                }
            }
            if (aVarB == null) {
                return false;
            }
            if (a.w.compareAndSet(aVarB, -1, 0)) {
                LockSupport.unpark(aVarB);
                return true;
            }
            this = u5bVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0091  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws InterruptedException {
        int longVolatile;
        n5f0 n5f0VarD;
        Unsafe unsafe = s0o.a;
        if (unsafe.compareAndSwapInt(this, y, 0, 1)) {
            Thread threadCurrentThread = Thread.currentThread();
            a aVar = threadCurrentThread instanceof a ? (a) threadCurrentThread : null;
            if (aVar == null || !Intrinsics.g(u5b.this, this)) {
                aVar = null;
            }
            synchronized (this.i) {
                longVolatile = (int) (unsafe.getLongVolatile(this, z) & 2097151);
            }
            if (1 <= longVolatile) {
                int i = 1;
                while (true) {
                    a aVarB = this.i.b(i);
                    aVarB.getClass();
                    a aVar2 = aVarB;
                    if (aVar2 != aVar) {
                        while (aVar2.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(aVar2);
                            aVar2.join(10000L);
                        }
                        iwj0 iwj0Var = aVar2.a;
                        p2l p2lVar = this.f;
                        iwj0Var.getClass();
                        n5f0 n5f0Var = (n5f0) s0o.a.getAndSetObject(iwj0Var, iwj0.f, (Object) null);
                        if (n5f0Var != null) {
                            p2lVar.a(n5f0Var);
                        }
                        while (true) {
                            n5f0 n5f0VarC = iwj0Var.c();
                            if (n5f0VarC == null) {
                                break;
                            } else {
                                p2lVar.a(n5f0VarC);
                            }
                        }
                    }
                    if (i == longVolatile) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            this.f.b();
            this.e.b();
            while (true) {
                if (aVar != null) {
                    n5f0VarD = aVar.a(true);
                    if (n5f0VarD == null) {
                        n5f0VarD = this.e.d();
                        if (n5f0VarD == null) {
                            break;
                            break;
                        }
                    }
                } else {
                    n5f0VarD = this.e.d();
                    if (n5f0VarD == null && (n5f0VarD = this.f.d()) == null) {
                        break;
                    }
                }
                try {
                    n5f0VarD.run();
                } catch (Throwable th) {
                    Thread threadCurrentThread2 = Thread.currentThread();
                    threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
                }
            }
            if (aVar != null) {
                aVar.h(b.e);
            }
            Unsafe unsafe2 = s0o.a;
            unsafe2.putLongVolatile(this, A, 0L);
            unsafe2.putLongVolatile(this, z, 0L);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        l(this, runnable, 6);
    }

    public final int f() {
        synchronized (this.i) {
            try {
                if (isTerminated()) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = v;
                Unsafe unsafe = s0o.a;
                long j = z;
                long longVolatile = unsafe.getLongVolatile(this, j);
                int i = (int) (longVolatile & 2097151);
                int i2 = i - ((int) ((longVolatile & 4398044413952L) >> 21));
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i2 >= this.a) {
                    return 0;
                }
                if (i >= this.b) {
                    return 0;
                }
                int longVolatile2 = ((int) (unsafe.getLongVolatile(this, j) & 2097151)) + 1;
                if (longVolatile2 <= 0 || this.i.b(longVolatile2) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                a aVar = new a(longVolatile2);
                this.i.c(longVolatile2, aVar);
                if (longVolatile2 != ((int) (atomicLongFieldUpdater.incrementAndGet(this) & 2097151))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i3 = i2 + 1;
                aVar.start();
                return i3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(Runnable runnable, boolean z2, boolean z3) {
        n5f0 q5f0Var;
        b bVar;
        a6f0.f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof n5f0) {
            q5f0Var = (n5f0) runnable;
            q5f0Var.a = jNanoTime;
            q5f0Var.b = z2;
        } else {
            q5f0Var = new q5f0(runnable, jNanoTime, z2);
        }
        boolean z4 = q5f0Var.b;
        long jAddAndGet = z4 ? v.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        a aVar = threadCurrentThread instanceof a ? (a) threadCurrentThread : null;
        if (aVar == null || !Intrinsics.g(u5b.this, this)) {
            aVar = null;
        }
        if (aVar != null && (bVar = aVar.c) != b.e && (q5f0Var.b || bVar != b.b)) {
            aVar.i = true;
            iwj0 iwj0Var = aVar.a;
            if (z3) {
                q5f0Var = iwj0Var.a(q5f0Var);
            } else {
                iwj0Var.getClass();
                n5f0 n5f0Var = (n5f0) s0o.a.getAndSetObject(iwj0Var, iwj0.f, q5f0Var);
                q5f0Var = n5f0Var == null ? null : iwj0Var.a(n5f0Var);
            }
        }
        if (q5f0Var != null) {
            if (!(q5f0Var.b ? this.f.a(q5f0Var) : this.e.a(q5f0Var))) {
                throw new RejectedExecutionException(uf80.a(new StringBuilder(), this.d, " was terminated"));
            }
        }
        if (z4) {
            if (F() || o(jAddAndGet)) {
                return;
            }
            F();
            return;
        }
        if (F() || o(s0o.a.getLongVolatile(this, z))) {
            return;
        }
        F();
    }

    public final boolean isTerminated() {
        return s0o.a.getIntVolatile(this, y) == 1;
    }

    public final void m(a aVar, int i, int i2) {
        while (true) {
            long longVolatile = s0o.a.getLongVolatile(this, A);
            int i3 = (int) (2097151 & longVolatile);
            long j = (2097152 + longVolatile) & (-2097152);
            if (i3 == i) {
                if (i2 == 0) {
                    Object objC = aVar.c();
                    while (true) {
                        if (objC == w) {
                            i3 = -1;
                            break;
                        }
                        if (objC == null) {
                            i3 = 0;
                            break;
                        }
                        a aVar2 = (a) objC;
                        int iB = aVar2.b();
                        if (iB != 0) {
                            i3 = iB;
                            break;
                        }
                        objC = aVar2.c();
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                u5b u5bVar = this;
                if (s0o.a.compareAndSwapLong(u5bVar, A, longVolatile, j | ((long) i3))) {
                    return;
                } else {
                    this = u5bVar;
                }
            }
        }
    }

    public final boolean o(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.a;
        if (i < i2) {
            int iF = f();
            if (iF == 1 && i2 > 1) {
                f();
            }
            if (iF > 0) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        tf50<a> tf50Var = this.i;
        int iA = tf50Var.a();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < iA; i6++) {
            a aVarB = tf50Var.b(i6);
            if (aVarB != null) {
                iwj0 iwj0Var = aVarB.a;
                iwj0Var.getClass();
                Object objectVolatile = s0o.a.getObjectVolatile(iwj0Var, iwj0.f);
                int iB = iwj0Var.b();
                if (objectVolatile != null) {
                    iB++;
                }
                int iOrdinal = aVarB.c.ordinal();
                if (iOrdinal == 0) {
                    i++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(iB);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (iOrdinal == 1) {
                    i2++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(iB);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (iOrdinal == 2) {
                    i3++;
                } else if (iOrdinal == 3) {
                    i4++;
                    if (iB > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(iB);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (iOrdinal != 4) {
                        uhc.a();
                        return null;
                    }
                    i5++;
                }
            }
        }
        long longVolatile = s0o.a.getLongVolatile(this, z);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.d);
        sb4.append('@');
        sb4.append(x2d.b(this));
        sb4.append("[Pool Size {core = ");
        int i7 = this.a;
        sb4.append(i7);
        sb4.append(", max = ");
        d5d.a(sb4, this.b, "}, Worker States {CPU = ", i, ", blocking = ");
        d5d.a(sb4, i2, ", parked = ", i3, ", dormant = ");
        d5d.a(sb4, i4, ", terminated = ", i5, "}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.e.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & longVolatile));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & longVolatile) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i7 - ((int) ((longVolatile & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }

    public u5b(int i, String str, long j, int i2) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = str;
        if (i >= 1) {
            if (i2 >= i) {
                if (i2 <= 2097150) {
                    if (j > 0) {
                        this.e = new p2l();
                        this.f = new p2l();
                        this.i = new tf50<>((i + 1) * 2);
                        this.controlState$volatile = ((long) i) << 42;
                        return;
                    }
                    kb5.a(d020.a(j, "Idle worker keep alive time ", " must be positive"));
                    throw null;
                }
                kb5.a(pe4.b(i2, "Max pool size ", " should not exceed maximal supported number of threads 2097150"));
                throw null;
            }
            kb5.a(whs.b(i2, i, "Max pool size ", " should be greater than or equals to core pool size "));
            throw null;
        }
        kb5.a(pe4.b(i, "Core pool size ", qUnCRF.uuFhKVT));
        throw null;
    }
}
