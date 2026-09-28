package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes8.dex */
public final class iwj0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b;
    public static final /* synthetic */ AtomicIntegerFieldUpdater c;
    public static final /* synthetic */ long d;
    public static final /* synthetic */ long e;
    public static final /* synthetic */ long f;
    public static final /* synthetic */ long g;
    public final AtomicReferenceArray<n5f0> a = new AtomicReferenceArray<>(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    static {
        Unsafe unsafe = s0o.a;
        f = unsafe.objectFieldOffset(iwj0.class.getDeclaredField("lastScheduledTask$volatile"));
        b = AtomicIntegerFieldUpdater.newUpdater(iwj0.class, "producerIndex$volatile");
        g = unsafe.objectFieldOffset(iwj0.class.getDeclaredField("producerIndex$volatile"));
        e = unsafe.objectFieldOffset(iwj0.class.getDeclaredField("consumerIndex$volatile"));
        c = AtomicIntegerFieldUpdater.newUpdater(iwj0.class, "blockingTasksInBuffer$volatile");
        d = unsafe.objectFieldOffset(iwj0.class.getDeclaredField("blockingTasksInBuffer$volatile"));
    }

    public final n5f0 a(n5f0 n5f0Var) {
        if (b() == 127) {
            return n5f0Var;
        }
        if (n5f0Var.b) {
            c.incrementAndGet(this);
        }
        int intVolatile = s0o.a.getIntVolatile(this, g) & 127;
        while (true) {
            AtomicReferenceArray<n5f0> atomicReferenceArray = this.a;
            if (atomicReferenceArray.get(intVolatile) == null) {
                atomicReferenceArray.lazySet(intVolatile, n5f0Var);
                b.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    public final int b() {
        return s0o.a.getIntVolatile(this, g) - s0o.a.getIntVolatile(this, e);
    }

    public final n5f0 c() {
        n5f0 andSet;
        while (true) {
            Unsafe unsafe = s0o.a;
            long j = e;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile - unsafe.getIntVolatile(this, g) == 0) {
                return null;
            }
            int i = intVolatile & 127;
            iwj0 iwj0Var = this;
            if (unsafe.compareAndSwapInt(iwj0Var, j, intVolatile, intVolatile + 1) && (andSet = iwj0Var.a.getAndSet(i, null)) != null) {
                if (andSet.b) {
                    c.decrementAndGet(iwj0Var);
                }
                return andSet;
            }
            this = iwj0Var;
        }
    }

    public final n5f0 d(int i, boolean z) {
        int i2 = i & 127;
        AtomicReferenceArray<n5f0> atomicReferenceArray = this.a;
        n5f0 n5f0Var = atomicReferenceArray.get(i2);
        if (n5f0Var != null && n5f0Var.b == z) {
            while (!atomicReferenceArray.compareAndSet(i2, n5f0Var, null)) {
                if (atomicReferenceArray.get(i2) != n5f0Var) {
                }
            }
            if (z) {
                c.decrementAndGet(this);
            }
            return n5f0Var;
        }
        return null;
    }
}
