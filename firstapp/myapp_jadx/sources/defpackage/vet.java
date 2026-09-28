package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes8.dex */
public class vet<E> {
    public static final /* synthetic */ long a = s0o.a.objectFieldOffset(vet.class.getDeclaredField("_cur$volatile"));
    private volatile /* synthetic */ Object _cur$volatile = new wet(8, false);

    public final boolean a(Runnable runnable) {
        vet<E> vetVar;
        while (true) {
            Unsafe unsafe = s0o.a;
            long j = a;
            wet wetVar = (wet) unsafe.getObjectVolatile(this, j);
            int iA = wetVar.a(runnable);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                wet<E> wetVarC = wetVar.c();
                while (true) {
                    Unsafe unsafe2 = s0o.a;
                    vetVar = this;
                    if (unsafe2.compareAndSwapObject(vetVar, a, wetVar, wetVarC) || unsafe2.getObjectVolatile(vetVar, j) != wetVar) {
                        break;
                    }
                    this = vetVar;
                }
            } else {
                if (iA == 2) {
                    return false;
                }
                vetVar = this;
            }
            this = vetVar;
        }
    }

    public final void b() {
        vet<E> vetVar;
        while (true) {
            Unsafe unsafe = s0o.a;
            long j = a;
            wet wetVar = (wet) unsafe.getObjectVolatile(this, j);
            if (wetVar.b()) {
                return;
            }
            wet<E> wetVarC = wetVar.c();
            while (true) {
                vetVar = this;
                if (s0o.a.compareAndSwapObject(vetVar, a, wetVar, wetVarC) || s0o.a.getObjectVolatile(vetVar, j) != wetVar) {
                    break;
                } else {
                    this = vetVar;
                }
            }
            this = vetVar;
        }
    }

    public final int c() {
        wet wetVar = (wet) s0o.a.getObjectVolatile(this, a);
        wetVar.getClass();
        long longVolatile = s0o.a.getLongVolatile(wetVar, wet.g);
        return 1073741823 & (((int) ((longVolatile & 1152921503533105152L) >> 30)) - ((int) (1073741823 & longVolatile)));
    }

    public final E d() {
        vet<E> vetVar;
        while (true) {
            Unsafe unsafe = s0o.a;
            long j = a;
            wet wetVar = (wet) unsafe.getObjectVolatile(this, j);
            E e = (E) wetVar.d();
            if (e != wet.e) {
                return e;
            }
            wet<E> wetVarC = wetVar.c();
            while (true) {
                vetVar = this;
                if (s0o.a.compareAndSwapObject(vetVar, a, wetVar, wetVarC) || s0o.a.getObjectVolatile(vetVar, j) != wetVar) {
                    break;
                }
                this = vetVar;
            }
            this = vetVar;
        }
    }
}
