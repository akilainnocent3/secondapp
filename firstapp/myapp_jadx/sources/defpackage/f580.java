package defpackage;

import defpackage.f580;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes8.dex */
public abstract class f580<S extends f580<S>> extends doa<S> implements bzx {
    public static final /* synthetic */ AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(f580.class, "cleanedAndPointers$volatile");
    public static final /* synthetic */ long f = s0o.a.objectFieldOffset(f580.class.getDeclaredField("cleanedAndPointers$volatile"));
    private volatile /* synthetic */ int cleanedAndPointers$volatile;
    public final long d;

    public f580(long j, S s, int i) {
        super(s);
        this.d = j;
        this.cleanedAndPointers$volatile = i << 16;
    }

    @Override // defpackage.doa
    public final boolean d() {
        return s0o.a.getIntVolatile(this, f) == g() && c() != null;
    }

    public final boolean f() {
        return e.addAndGet(this, -65536) == g() && c() != null;
    }

    public abstract int g();

    public abstract void h(int i, CoroutineContext coroutineContext);

    public final void i() {
        if (e.incrementAndGet(this) == g()) {
            e();
        }
    }

    public final boolean j() {
        while (true) {
            Unsafe unsafe = s0o.a;
            long j = f;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile == this.g() && this.c() != null) {
                return false;
            }
            f580<S> f580Var = this;
            if (unsafe.compareAndSwapInt(f580Var, j, intVolatile, intVolatile + 65536)) {
                return true;
            }
            this = f580Var;
        }
    }
}
