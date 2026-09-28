package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes8.dex */
public final class wet<E> {
    public static final toe0 e;
    public static final /* synthetic */ long f;
    public static final /* synthetic */ long g;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;
    public final int a;
    public final boolean b;
    public final int c;
    public final /* synthetic */ AtomicReferenceArray d;

    public static final class a {
        public final int a;

        public a(int i) {
            this.a = i;
        }
    }

    static {
        Unsafe unsafe = s0o.a;
        f = unsafe.objectFieldOffset(wet.class.getDeclaredField("_next$volatile"));
        g = unsafe.objectFieldOffset(wet.class.getDeclaredField("_state$volatile"));
        e = new toe0("REMOVE_FROZEN");
    }

    public wet(int i, boolean z) {
        this.a = i;
        this.b = z;
        int i2 = i - 1;
        this.c = i2;
        this.d = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            ib5.a("Check failed.");
            throw null;
        }
        if ((i & i2) == 0) {
            return;
        }
        ib5.a("Check failed.");
        throw null;
    }

    public final int a(E e2) {
        wet<E> wetVar = this;
        while (true) {
            Unsafe unsafe = s0o.a;
            long j = g;
            long longVolatile = unsafe.getLongVolatile(wetVar, j);
            if ((3458764513820540928L & longVolatile) != 0) {
                return (2305843009213693952L & longVolatile) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & longVolatile);
            int i2 = (int) ((1152921503533105152L & longVolatile) >> 30);
            int i3 = wetVar.c;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            boolean z = wetVar.b;
            AtomicReferenceArray atomicReferenceArray = wetVar.d;
            if (z || atomicReferenceArray.get(i2 & i3) == null) {
                if (unsafe.compareAndSwapLong(wetVar, g, longVolatile, ((-1152921503533105153L) & longVolatile) | (((long) ((i2 + 1) & 1073741823)) << 30))) {
                    atomicReferenceArray.set(i2 & i3, e2);
                    wet<E> wetVarC = this;
                    while ((s0o.a.getLongVolatile(wetVarC, j) & 1152921504606846976L) != 0) {
                        wetVarC = wetVarC.c();
                        AtomicReferenceArray atomicReferenceArray2 = wetVarC.d;
                        int i4 = wetVarC.c & i2;
                        Object obj = atomicReferenceArray2.get(i4);
                        if ((obj instanceof a) && ((a) obj).a == i2) {
                            atomicReferenceArray2.set(i4, e2);
                        } else {
                            wetVarC = null;
                        }
                        if (wetVarC == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
                wetVar = this;
            } else {
                int i5 = wetVar.a;
                if (i5 < 1024 || ((i2 - i) & 1073741823) > (i5 >> 1)) {
                    return 1;
                }
            }
        }
    }

    public final boolean b() {
        while (true) {
            long longVolatile = s0o.a.getLongVolatile(this, g);
            if ((longVolatile & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & longVolatile) != 0) {
                return false;
            }
            wet<E> wetVar = this;
            if (s0o.a.compareAndSwapLong(wetVar, g, longVolatile, longVolatile | 2305843009213693952L)) {
                return true;
            }
            this = wetVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final wet<E> c() {
        Unsafe unsafe;
        long j;
        long longVolatile;
        long j2;
        Unsafe unsafe2;
        do {
            unsafe = s0o.a;
            j = g;
            longVolatile = unsafe.getLongVolatile(this, j);
            if ((longVolatile & 1152921504606846976L) != 0) {
                j2 = longVolatile;
                break;
            }
            j2 = 1152921504606846976L | longVolatile;
        } while (!unsafe.compareAndSwapLong(this, j, longVolatile, j2));
        while (true) {
            Unsafe unsafe3 = s0o.a;
            long j3 = f;
            wet<E> wetVar = (wet) unsafe3.getObjectVolatile(this, j3);
            if (wetVar != null) {
                return wetVar;
            }
            wet wetVar2 = new wet(this.a * 2, this.b);
            int i = (int) (1073741823 & j2);
            int i2 = (int) ((1152921503533105152L & j2) >> 30);
            while (true) {
                int i3 = this.c;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                Object aVar = this.d.get(i4);
                if (aVar == null) {
                    aVar = new a(i);
                }
                wetVar2.d.set(wetVar2.c & i, aVar);
                i++;
            }
            s0o.a.putLongVolatile(wetVar2, g, j2 & (-1152921504606846977L));
            do {
                unsafe2 = s0o.a;
                if (unsafe2.compareAndSwapObject(this, f, (Object) null, wetVar2)) {
                    break;
                }
            } while (unsafe2.getObjectVolatile(this, j3) == null);
        }
    }

    public final Object d() {
        wet<E> wetVarC = this;
        while (true) {
            Unsafe unsafe = s0o.a;
            long j = g;
            long longVolatile = unsafe.getLongVolatile(wetVarC, j);
            if ((longVolatile & 1152921504606846976L) != 0) {
                return e;
            }
            int i = (int) (longVolatile & 1073741823);
            int i2 = wetVarC.c;
            int i3 = ((int) ((1152921503533105152L & longVolatile) >> 30)) & i2;
            int i4 = i2 & i;
            if (i3 != i4) {
                AtomicReferenceArray atomicReferenceArray = wetVarC.d;
                Object obj = atomicReferenceArray.get(i4);
                boolean z = wetVarC.b;
                if (obj == null) {
                    if (z) {
                    }
                } else if (!(obj instanceof a)) {
                    long j2 = (i + 1) & 1073741823;
                    if (unsafe.compareAndSwapLong(wetVarC, j, longVolatile, (longVolatile & (-1073741824)) | j2)) {
                        atomicReferenceArray.set(i4, null);
                        return obj;
                    }
                    wetVarC = this;
                    if (z) {
                        while (true) {
                            Unsafe unsafe2 = s0o.a;
                            long j3 = g;
                            long longVolatile2 = unsafe2.getLongVolatile(wetVarC, j3);
                            int i5 = (int) (longVolatile2 & 1073741823);
                            if ((longVolatile2 & 1152921504606846976L) != 0) {
                                wetVarC = wetVarC.c();
                            } else {
                                if (unsafe2.compareAndSwapLong(wetVarC, j3, longVolatile2, (longVolatile2 & (-1073741824)) | j2)) {
                                    wetVarC.d.set(wetVarC.c & i5, null);
                                    wetVarC = null;
                                } else {
                                    continue;
                                }
                            }
                            if (wetVarC == null) {
                                return obj;
                            }
                        }
                    }
                }
            }
            return null;
        }
    }
}
