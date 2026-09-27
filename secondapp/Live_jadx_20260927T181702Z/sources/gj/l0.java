package gj;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Random;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@k
@yi.c
public abstract class l0 extends Number {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ThreadLocal<int[]> f86877e = new ThreadLocal<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Random f86878f = new Random();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f86879g = Runtime.getRuntime().availableProcessors();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Unsafe f86880h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final long f86881i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final long f86882j;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @zq.a
    public volatile transient b[] f86883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile transient long f86884c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile transient int f86885d;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements PrivilegedExceptionAction<Unsafe> {
        @Override // java.security.PrivilegedExceptionAction
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unsafe run() throws Exception {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            throw new NoSuchFieldError("the Unsafe");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final Unsafe f86886p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final long f86887q;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public volatile long f86888a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile long f86889b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public volatile long f86890c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public volatile long f86891d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public volatile long f86892e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public volatile long f86893f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public volatile long f86894g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public volatile long f86895h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public volatile long f86896i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public volatile long f86897j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public volatile long f86898k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public volatile long f86899l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public volatile long f86900m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public volatile long f86901n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public volatile long f86902o;

        static {
            try {
                Unsafe unsafeK = l0.k();
                f86886p = unsafeK;
                f86887q = unsafeK.objectFieldOffset(b.class.getDeclaredField("h"));
            } catch (Exception e10) {
                throw new Error(e10);
            }
        }

        public b(long x10) {
            this.f86895h = x10;
        }

        public final boolean a(long cmp, long val) {
            return f86886p.compareAndSwapLong(this, f86887q, cmp, val);
        }
    }

    static {
        try {
            Unsafe unsafeK = k();
            f86880h = unsafeK;
            f86881i = unsafeK.objectFieldOffset(l0.class.getDeclaredField("c"));
            f86882j = unsafeK.objectFieldOffset(l0.class.getDeclaredField("d"));
        } catch (Exception e10) {
            throw new Error(e10);
        }
    }

    public static Unsafe k() {
        try {
            try {
                return Unsafe.getUnsafe();
            } catch (PrivilegedActionException e10) {
                throw new RuntimeException("Could not initialize intrinsics", e10.getCause());
            }
        } catch (SecurityException unused) {
            return (Unsafe) AccessController.doPrivileged(new a());
        }
    }

    public final boolean h(long cmp, long val) {
        return f86880h.compareAndSwapLong(this, f86881i, cmp, val);
    }

    public final boolean i() {
        return f86880h.compareAndSwapInt(this, f86882j, 0, 1);
    }

    public abstract long j(long currentValue, long newValue);

    public final void l(long initialValue) {
        b[] bVarArr = this.f86883b;
        this.f86884c = initialValue;
        if (bVarArr != null) {
            for (b bVar : bVarArr) {
                if (bVar != null) {
                    bVar.f86895h = initialValue;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0058  */
    public final void m(long x10, @zq.a int[] hc2, boolean wasUncontended) {
        int iNextInt;
        int[] iArr;
        boolean z10;
        int length;
        boolean z11;
        int length2;
        if (hc2 == null) {
            iArr = new int[1];
            f86877e.set(iArr);
            iNextInt = f86878f.nextInt();
            if (iNextInt == 0) {
                iNextInt = 1;
            }
            iArr[0] = iNextInt;
        } else {
            iNextInt = hc2[0];
            iArr = hc2;
        }
        boolean z12 = false;
        int i10 = iNextInt;
        boolean z13 = wasUncontended;
        while (true) {
            b[] bVarArr = this.f86883b;
            if (bVarArr != null && (length = bVarArr.length) > 0) {
                b bVar = bVarArr[(length - 1) & i10];
                if (bVar == null) {
                    if (this.f86885d == 0) {
                        b bVar2 = new b(x10);
                        if (this.f86885d == 0 && i()) {
                            try {
                                b[] bVarArr2 = this.f86883b;
                                if (bVarArr2 == null || (length2 = bVarArr2.length) <= 0) {
                                    z11 = false;
                                } else {
                                    int i11 = (length2 - 1) & i10;
                                    if (bVarArr2[i11] == null) {
                                        bVarArr2[i11] = bVar2;
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                }
                                this.f86885d = 0;
                                if (z11) {
                                    return;
                                }
                            } catch (Throwable th2) {
                                this.f86885d = 0;
                                throw th2;
                            }
                        }
                    }
                    z12 = false;
                    int i12 = i10 ^ (i10 << 13);
                    int i13 = i12 ^ (i12 >>> 17);
                    i10 = i13 ^ (i13 << 5);
                    iArr[0] = i10;
                } else {
                    if (z13) {
                        long j10 = bVar.f86895h;
                        if (bVar.a(j10, j(j10, x10))) {
                            return;
                        }
                        if (length >= f86879g || this.f86883b != bVarArr) {
                            z12 = false;
                        } else if (!z12) {
                            z12 = true;
                        } else if (this.f86885d == 0 && i()) {
                            try {
                                if (this.f86883b == bVarArr) {
                                    b[] bVarArr3 = new b[length << 1];
                                    for (int i14 = 0; i14 < length; i14++) {
                                        bVarArr3[i14] = bVarArr[i14];
                                    }
                                    this.f86883b = bVarArr3;
                                }
                                this.f86885d = 0;
                                z12 = false;
                            } catch (Throwable th3) {
                                this.f86885d = 0;
                                throw th3;
                            }
                        }
                    } else {
                        z13 = true;
                    }
                    int i15 = i10 ^ (i10 << 13);
                    int i16 = i15 ^ (i15 >>> 17);
                    i10 = i16 ^ (i16 << 5);
                    iArr[0] = i10;
                }
            } else if (this.f86885d == 0 && this.f86883b == bVarArr && i()) {
                try {
                    if (this.f86883b == bVarArr) {
                        b[] bVarArr4 = new b[2];
                        bVarArr4[i10 & 1] = new b(x10);
                        this.f86883b = bVarArr4;
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.f86885d = 0;
                    if (z10) {
                        return;
                    }
                } catch (Throwable th4) {
                    this.f86885d = 0;
                    throw th4;
                }
            } else {
                long j11 = this.f86884c;
                if (h(j11, j(j11, x10))) {
                    return;
                }
            }
        }
    }
}
