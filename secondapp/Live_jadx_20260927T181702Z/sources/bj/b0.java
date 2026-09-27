package bj;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Random;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@yi.c
@i
public abstract class b0 extends Number {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ThreadLocal<int[]> f21490e = new ThreadLocal<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Random f21491f = new Random();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f21492g = Runtime.getRuntime().availableProcessors();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Unsafe f21493h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final long f21494i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final long f21495j;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @zq.a
    public volatile transient b[] f21496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile transient long f21497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile transient int f21498d;

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
        public static final Unsafe f21499p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final long f21500q;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public volatile long f21501a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile long f21502b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public volatile long f21503c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public volatile long f21504d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public volatile long f21505e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public volatile long f21506f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public volatile long f21507g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public volatile long f21508h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public volatile long f21509i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public volatile long f21510j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public volatile long f21511k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public volatile long f21512l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public volatile long f21513m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public volatile long f21514n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public volatile long f21515o;

        static {
            try {
                Unsafe unsafeK = b0.k();
                f21499p = unsafeK;
                f21500q = unsafeK.objectFieldOffset(b.class.getDeclaredField("h"));
            } catch (Exception e10) {
                throw new Error(e10);
            }
        }

        public b(long x10) {
            this.f21508h = x10;
        }

        public final boolean a(long cmp, long val) {
            return f21499p.compareAndSwapLong(this, f21500q, cmp, val);
        }
    }

    static {
        try {
            Unsafe unsafeK = k();
            f21493h = unsafeK;
            f21494i = unsafeK.objectFieldOffset(b0.class.getDeclaredField("c"));
            f21495j = unsafeK.objectFieldOffset(b0.class.getDeclaredField("d"));
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
        return f21493h.compareAndSwapLong(this, f21494i, cmp, val);
    }

    public final boolean i() {
        return f21493h.compareAndSwapInt(this, f21495j, 0, 1);
    }

    public abstract long j(long currentValue, long newValue);

    public final void l(long initialValue) {
        b[] bVarArr = this.f21496b;
        this.f21497c = initialValue;
        if (bVarArr != null) {
            for (b bVar : bVarArr) {
                if (bVar != null) {
                    bVar.f21508h = initialValue;
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
            f21490e.set(iArr);
            iNextInt = f21491f.nextInt();
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
            b[] bVarArr = this.f21496b;
            if (bVarArr != null && (length = bVarArr.length) > 0) {
                b bVar = bVarArr[(length - 1) & i10];
                if (bVar == null) {
                    if (this.f21498d == 0) {
                        b bVar2 = new b(x10);
                        if (this.f21498d == 0 && i()) {
                            try {
                                b[] bVarArr2 = this.f21496b;
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
                                this.f21498d = 0;
                                if (z11) {
                                    return;
                                }
                            } catch (Throwable th2) {
                                this.f21498d = 0;
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
                        long j10 = bVar.f21508h;
                        if (bVar.a(j10, j(j10, x10))) {
                            return;
                        }
                        if (length >= f21492g || this.f21496b != bVarArr) {
                            z12 = false;
                        } else if (!z12) {
                            z12 = true;
                        } else if (this.f21498d == 0 && i()) {
                            try {
                                if (this.f21496b == bVarArr) {
                                    b[] bVarArr3 = new b[length << 1];
                                    for (int i14 = 0; i14 < length; i14++) {
                                        bVarArr3[i14] = bVarArr[i14];
                                    }
                                    this.f21496b = bVarArr3;
                                }
                                this.f21498d = 0;
                                z12 = false;
                            } catch (Throwable th3) {
                                this.f21498d = 0;
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
            } else if (this.f21498d == 0 && this.f21496b == bVarArr && i()) {
                try {
                    if (this.f21496b == bVarArr) {
                        b[] bVarArr4 = new b[2];
                        bVarArr4[i10 & 1] = new b(x10);
                        this.f21496b = bVarArr4;
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.f21498d = 0;
                    if (z10) {
                        return;
                    }
                } catch (Throwable th4) {
                    this.f21498d = 0;
                    throw th4;
                }
            } else {
                long j11 = this.f21497c;
                if (h(j11, j(j11, x10))) {
                    return;
                }
            }
        }
    }
}
