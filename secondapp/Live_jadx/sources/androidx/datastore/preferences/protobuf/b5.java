package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class b5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Unsafe f9612a = T();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class<?> f9613b = androidx.datastore.preferences.protobuf.e.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f9614c = s(Long.TYPE);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f9615d = s(Integer.TYPE);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f9616e = P();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f9617f = w0();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f9618g = v0();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final long f9619h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final long f9620i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final long f9621j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final long f9622k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final long f9623l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final long f9624m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final long f9625n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final long f9626o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final long f9627p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final long f9628q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final long f9629r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final long f9630s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final long f9631t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final long f9632u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f9633v = 8;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f9634w = 7;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f9635x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final boolean f9636y;

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
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final long f9637b = -1;

        public b(Unsafe unsafe) {
            super(unsafe);
        }

        public static int C(long address) {
            return (int) address;
        }

        @Override // androidx.datastore.preferences.protobuf.b5.e
        public boolean B() {
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.b5.e
        public void c(long srcOffset, byte[] target, long targetIndex, long length) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.b5.e
        public void d(byte[] src, long srcIndex, long targetOffset, long length) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.b5.e
        public boolean e(Object target, long offset) {
            return b5.f9636y ? b5.y(target, offset) : b5.z(target, offset);
        }

        @Override // androidx.datastore.preferences.protobuf.b5.e
        public byte f(long address) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.b5.e
        public byte g(Object target, long offset) {
            return b5.f9636y ? b5.D(target, offset) : b5.E(target, offset);
        }

        @Override // androidx.datastore.preferences.protobuf.b5.e
        public double h(Object target, long offset) {
            return Double.longBitsToDouble(m(target, offset));
        }

        @Override // androidx.datastore.preferences.protobuf.b5.e
        public float i(Object target, long offset) {
            return Float.intBitsToFloat(k(target, offset));
        }

        @Override // androidx.datastore.preferences.protobuf.b5.e
        public int j(long address) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.b5.e
        public long l(long address) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.b5.e
        public Object o(Field field) {
            try {
                return field.get(null);
            } catch (IllegalAccessException unused) {
                return null;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.b5.e
        public void q(Object target, long offset, boolean value) {
            if (b5.f9636y) {
                b5.c0(target, offset, value);
            } else {
                b5.d0(target, offset, value);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.b5.e
        public void r(long address, byte value) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.b5.e
        public void s(Object target, long offset, byte value) {
            if (b5.f9636y) {
                b5.h0(target, offset, value);
            } else {
                b5.i0(target, offset, value);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.b5.e
        public void t(Object target, long offset, double value) {
            y(target, offset, Double.doubleToLongBits(value));
        }

        @Override // androidx.datastore.preferences.protobuf.b5.e
        public void u(Object target, long offset, float value) {
            w(target, offset, Float.floatToIntBits(value));
        }

        @Override // androidx.datastore.preferences.protobuf.b5.e
        public void v(long address, int value) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.b5.e
        public void x(long address, long value) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c extends e {
        public c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.b5.e
        public boolean B() {
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.b5.e
        public void c(long srcOffset, byte[] target, long targetIndex, long length) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.b5.e
        public void d(byte[] src, long srcIndex, long targetOffset, long length) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.b5.e
        public boolean e(Object target, long offset) {
            return b5.f9636y ? b5.y(target, offset) : b5.z(target, offset);
        }

        @Override // androidx.datastore.preferences.protobuf.b5.e
        public byte f(long address) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.b5.e
        public byte g(Object target, long offset) {
            return b5.f9636y ? b5.D(target, offset) : b5.E(target, offset);
        }

        @Override // androidx.datastore.preferences.protobuf.b5.e
        public double h(Object target, long offset) {
            return Double.longBitsToDouble(m(target, offset));
        }

        @Override // androidx.datastore.preferences.protobuf.b5.e
        public float i(Object target, long offset) {
            return Float.intBitsToFloat(k(target, offset));
        }

        @Override // androidx.datastore.preferences.protobuf.b5.e
        public int j(long address) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.b5.e
        public long l(long address) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.b5.e
        public Object o(Field field) {
            try {
                return field.get(null);
            } catch (IllegalAccessException unused) {
                return null;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.b5.e
        public void q(Object target, long offset, boolean value) {
            if (b5.f9636y) {
                b5.c0(target, offset, value);
            } else {
                b5.d0(target, offset, value);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.b5.e
        public void r(long address, byte value) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.b5.e
        public void s(Object target, long offset, byte value) {
            if (b5.f9636y) {
                b5.h0(target, offset, value);
            } else {
                b5.i0(target, offset, value);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.b5.e
        public void t(Object target, long offset, double value) {
            y(target, offset, Double.doubleToLongBits(value));
        }

        @Override // androidx.datastore.preferences.protobuf.b5.e
        public void u(Object target, long offset, float value) {
            w(target, offset, Float.floatToIntBits(value));
        }

        @Override // androidx.datastore.preferences.protobuf.b5.e
        public void v(long address, int value) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.b5.e
        public void x(long address, long value) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class d extends e {
        public d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.b5.e
        public boolean A() {
            if (!super.A()) {
                return false;
            }
            try {
                Class<?> cls = this.f9638a.getClass();
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getByte", Object.class, cls2);
                cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
                cls.getMethod("getBoolean", Object.class, cls2);
                cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
                cls.getMethod("getFloat", Object.class, cls2);
                cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
                cls.getMethod("getDouble", Object.class, cls2);
                cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
                return true;
            } catch (Throwable th2) {
                b5.X(th2);
                return false;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.b5.e
        public boolean B() {
            if (!super.B()) {
                return false;
            }
            try {
                Class<?> cls = this.f9638a.getClass();
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getByte", cls2);
                cls.getMethod("putByte", cls2, Byte.TYPE);
                cls.getMethod("getInt", cls2);
                cls.getMethod("putInt", cls2, Integer.TYPE);
                cls.getMethod("getLong", cls2);
                cls.getMethod("putLong", cls2, cls2);
                cls.getMethod("copyMemory", cls2, cls2, cls2);
                cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                return true;
            } catch (Throwable th2) {
                b5.X(th2);
                return false;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.b5.e
        public void c(long srcOffset, byte[] target, long targetIndex, long length) {
            this.f9638a.copyMemory((Object) null, srcOffset, target, b5.f9619h + targetIndex, length);
        }

        @Override // androidx.datastore.preferences.protobuf.b5.e
        public void d(byte[] src, long srcIndex, long targetOffset, long length) {
            this.f9638a.copyMemory(src, b5.f9619h + srcIndex, (Object) null, targetOffset, length);
        }

        @Override // androidx.datastore.preferences.protobuf.b5.e
        public boolean e(Object target, long offset) {
            return this.f9638a.getBoolean(target, offset);
        }

        @Override // androidx.datastore.preferences.protobuf.b5.e
        public byte f(long address) {
            return this.f9638a.getByte(address);
        }

        @Override // androidx.datastore.preferences.protobuf.b5.e
        public byte g(Object target, long offset) {
            return this.f9638a.getByte(target, offset);
        }

        @Override // androidx.datastore.preferences.protobuf.b5.e
        public double h(Object target, long offset) {
            return this.f9638a.getDouble(target, offset);
        }

        @Override // androidx.datastore.preferences.protobuf.b5.e
        public float i(Object target, long offset) {
            return this.f9638a.getFloat(target, offset);
        }

        @Override // androidx.datastore.preferences.protobuf.b5.e
        public int j(long address) {
            return this.f9638a.getInt(address);
        }

        @Override // androidx.datastore.preferences.protobuf.b5.e
        public long l(long address) {
            return this.f9638a.getLong(address);
        }

        @Override // androidx.datastore.preferences.protobuf.b5.e
        public Object o(Field field) {
            return n(this.f9638a.staticFieldBase(field), this.f9638a.staticFieldOffset(field));
        }

        @Override // androidx.datastore.preferences.protobuf.b5.e
        public void q(Object target, long offset, boolean value) {
            this.f9638a.putBoolean(target, offset, value);
        }

        @Override // androidx.datastore.preferences.protobuf.b5.e
        public void r(long address, byte value) {
            this.f9638a.putByte(address, value);
        }

        @Override // androidx.datastore.preferences.protobuf.b5.e
        public void s(Object target, long offset, byte value) {
            this.f9638a.putByte(target, offset, value);
        }

        @Override // androidx.datastore.preferences.protobuf.b5.e
        public void t(Object target, long offset, double value) {
            this.f9638a.putDouble(target, offset, value);
        }

        @Override // androidx.datastore.preferences.protobuf.b5.e
        public void u(Object target, long offset, float value) {
            this.f9638a.putFloat(target, offset, value);
        }

        @Override // androidx.datastore.preferences.protobuf.b5.e
        public void v(long address, int value) {
            this.f9638a.putInt(address, value);
        }

        @Override // androidx.datastore.preferences.protobuf.b5.e
        public void x(long address, long value) {
            this.f9638a.putLong(address, value);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Unsafe f9638a;

        public e(Unsafe unsafe) {
            this.f9638a = unsafe;
        }

        public boolean A() {
            Unsafe unsafe = this.f9638a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("arrayBaseOffset", Class.class);
                cls.getMethod("arrayIndexScale", Class.class);
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getInt", Object.class, cls2);
                cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
                cls.getMethod("getLong", Object.class, cls2);
                cls.getMethod("putLong", Object.class, cls2, cls2);
                cls.getMethod("getObject", Object.class, cls2);
                cls.getMethod("putObject", Object.class, cls2, Object.class);
                return true;
            } catch (Throwable th2) {
                b5.X(th2);
                return false;
            }
        }

        public boolean B() {
            Unsafe unsafe = this.f9638a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return b5.o() != null;
            } catch (Throwable th2) {
                b5.X(th2);
                return false;
            }
        }

        public final int a(Class<?> clazz) {
            return this.f9638a.arrayBaseOffset(clazz);
        }

        public final int b(Class<?> clazz) {
            return this.f9638a.arrayIndexScale(clazz);
        }

        public abstract void c(long srcOffset, byte[] target, long targetIndex, long length);

        public abstract void d(byte[] src, long srcIndex, long targetOffset, long length);

        public abstract boolean e(Object target, long offset);

        public abstract byte f(long address);

        public abstract byte g(Object target, long offset);

        public abstract double h(Object target, long offset);

        public abstract float i(Object target, long offset);

        public abstract int j(long address);

        public final int k(Object target, long offset) {
            return this.f9638a.getInt(target, offset);
        }

        public abstract long l(long address);

        public final long m(Object target, long offset) {
            return this.f9638a.getLong(target, offset);
        }

        public final Object n(Object target, long offset) {
            return this.f9638a.getObject(target, offset);
        }

        public abstract Object o(Field field);

        public final long p(Field field) {
            return this.f9638a.objectFieldOffset(field);
        }

        public abstract void q(Object target, long offset, boolean value);

        public abstract void r(long address, byte value);

        public abstract void s(Object target, long offset, byte value);

        public abstract void t(Object target, long offset, double value);

        public abstract void u(Object target, long offset, float value);

        public abstract void v(long address, int value);

        public final void w(Object target, long offset, int value) {
            this.f9638a.putInt(target, offset, value);
        }

        public abstract void x(long address, long value);

        public final void y(Object target, long offset, long value) {
            this.f9638a.putLong(target, offset, value);
        }

        public final void z(Object target, long offset, Object value) {
            this.f9638a.putObject(target, offset, value);
        }
    }

    static {
        long jM = m(byte[].class);
        f9619h = jM;
        f9620i = m(boolean[].class);
        f9621j = n(boolean[].class);
        f9622k = m(int[].class);
        f9623l = n(int[].class);
        f9624m = m(long[].class);
        f9625n = n(long[].class);
        f9626o = m(float[].class);
        f9627p = n(float[].class);
        f9628q = m(double[].class);
        f9629r = n(double[].class);
        f9630s = m(Object[].class);
        f9631t = n(Object[].class);
        f9632u = u(o());
        f9635x = (int) (jM & 7);
        f9636y = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static byte A(long address) {
        return f9616e.f(address);
    }

    public static byte B(Object target, long offset) {
        return f9616e.g(target, offset);
    }

    public static byte C(byte[] target, long index) {
        return f9616e.g(target, f9619h + index);
    }

    public static byte D(Object target, long offset) {
        return (byte) ((K(target, (-4) & offset) >>> ((int) (((~offset) & 3) << 3))) & 255);
    }

    public static byte E(Object target, long offset) {
        return (byte) ((K(target, (-4) & offset) >>> ((int) ((offset & 3) << 3))) & 255);
    }

    public static double F(Object target, long offset) {
        return f9616e.h(target, offset);
    }

    public static double G(double[] target, long index) {
        return f9616e.h(target, f9628q + (index * f9629r));
    }

    public static float H(Object target, long offset) {
        return f9616e.i(target, offset);
    }

    public static float I(float[] target, long index) {
        return f9616e.i(target, f9626o + (index * f9627p));
    }

    public static int J(long address) {
        return f9616e.j(address);
    }

    public static int K(Object target, long offset) {
        return f9616e.k(target, offset);
    }

    public static int L(int[] target, long index) {
        return f9616e.k(target, f9622k + (index * f9623l));
    }

    public static long M(long address) {
        return f9616e.l(address);
    }

    public static long N(Object target, long offset) {
        return f9616e.m(target, offset);
    }

    public static long O(long[] target, long index) {
        return f9616e.m(target, f9624m + (index * f9625n));
    }

    public static e P() {
        Unsafe unsafe = f9612a;
        if (unsafe == null) {
            return null;
        }
        if (!androidx.datastore.preferences.protobuf.e.c()) {
            return new d(unsafe);
        }
        if (f9614c) {
            return new c(unsafe);
        }
        if (f9615d) {
            return new b(unsafe);
        }
        return null;
    }

    public static Object Q(Object target, long offset) {
        return f9616e.n(target, offset);
    }

    public static Object R(Object[] target, long index) {
        return f9616e.n(target, f9630s + (index * f9631t));
    }

    public static Object S(Field field) {
        return f9616e.o(field);
    }

    public static Unsafe T() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean U() {
        return f9618g;
    }

    public static boolean V() {
        return f9617f;
    }

    public static boolean W() {
        return f9614c;
    }

    public static void X(Throwable e10) {
        Logger.getLogger(b5.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + e10);
    }

    public static int Y(byte[] left, int leftOff, byte[] right, int rightOff, int length) {
        if (leftOff < 0 || rightOff < 0 || length < 0 || leftOff + length > left.length || rightOff + length > right.length) {
            throw new IndexOutOfBoundsException();
        }
        int i10 = 0;
        if (f9618g) {
            for (int i11 = (f9635x + leftOff) & 7; i10 < length && (i11 & 7) != 0; i11++) {
                if (left[leftOff + i10] != right[rightOff + i10]) {
                    return i10;
                }
                i10++;
            }
            int i12 = ((length - i10) & (-8)) + i10;
            while (i10 < i12) {
                long j10 = f9619h;
                long j11 = i10;
                long jN = N(left, ((long) leftOff) + j10 + j11);
                long jN2 = N(right, j10 + ((long) rightOff) + j11);
                if (jN != jN2) {
                    return i10 + v(jN, jN2);
                }
                i10 += 8;
            }
        }
        while (i10 < length) {
            if (left[leftOff + i10] != right[rightOff + i10]) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static long Z(Field field) {
        return f9616e.p(field);
    }

    public static void a0(Object target, long offset, boolean value) {
        f9616e.q(target, offset, value);
    }

    public static void b0(boolean[] target, long index, boolean value) {
        f9616e.q(target, f9620i + (index * f9621j), value);
    }

    public static void c0(Object obj, long j10, boolean z10) {
        h0(obj, j10, z10 ? (byte) 1 : (byte) 0);
    }

    public static void d0(Object obj, long j10, boolean z10) {
        i0(obj, j10, z10 ? (byte) 1 : (byte) 0);
    }

    public static void e0(long address, byte value) {
        f9616e.r(address, value);
    }

    public static void f0(Object target, long offset, byte value) {
        f9616e.s(target, offset, value);
    }

    public static void g0(byte[] target, long index, byte value) {
        f9616e.s(target, f9619h + index, value);
    }

    public static void h0(Object target, long offset, byte value) {
        long j10 = (-4) & offset;
        int iK = K(target, j10);
        int i10 = ((~((int) offset)) & 3) << 3;
        o0(target, j10, ((255 & value) << i10) | (iK & (~(255 << i10))));
    }

    public static void i0(Object target, long offset, byte value) {
        long j10 = (-4) & offset;
        int i10 = (((int) offset) & 3) << 3;
        o0(target, j10, ((255 & value) << i10) | (K(target, j10) & (~(255 << i10))));
    }

    public static void j0(Object target, long offset, double value) {
        f9616e.t(target, offset, value);
    }

    public static long k(ByteBuffer buffer) {
        return f9616e.m(buffer, f9632u);
    }

    public static void k0(double[] target, long index, double value) {
        f9616e.t(target, f9628q + (index * f9629r), value);
    }

    public static <T> T l(Class<T> cls) {
        try {
            return (T) f9612a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static void l0(Object target, long offset, float value) {
        f9616e.u(target, offset, value);
    }

    public static int m(Class<?> clazz) {
        if (f9618g) {
            return f9616e.a(clazz);
        }
        return -1;
    }

    public static void m0(float[] target, long index, float value) {
        f9616e.u(target, f9626o + (index * f9627p), value);
    }

    public static int n(Class<?> clazz) {
        if (f9618g) {
            return f9616e.b(clazz);
        }
        return -1;
    }

    public static void n0(long address, int value) {
        f9616e.v(address, value);
    }

    public static Field o() {
        Field fieldT;
        if (androidx.datastore.preferences.protobuf.e.c() && (fieldT = t(Buffer.class, "effectiveDirectAddress")) != null) {
            return fieldT;
        }
        Field fieldT2 = t(Buffer.class, "address");
        if (fieldT2 == null || fieldT2.getType() != Long.TYPE) {
            return null;
        }
        return fieldT2;
    }

    public static void o0(Object target, long offset, int value) {
        f9616e.w(target, offset, value);
    }

    public static void p(long srcOffset, byte[] target, long targetIndex, long length) {
        f9616e.c(srcOffset, target, targetIndex, length);
    }

    public static void p0(int[] target, long index, int value) {
        f9616e.w(target, f9622k + (index * f9623l), value);
    }

    public static void q(byte[] src, long srcIndex, long targetOffset, long length) {
        f9616e.d(src, srcIndex, targetOffset, length);
    }

    public static void q0(long address, long value) {
        f9616e.x(address, value);
    }

    public static void r(byte[] src, long srcIndex, byte[] target, long targetIndex, long length) {
        System.arraycopy(src, (int) srcIndex, target, (int) targetIndex, (int) length);
    }

    public static void r0(Object target, long offset, long value) {
        f9616e.y(target, offset, value);
    }

    public static boolean s(Class<?> addressClass) {
        if (!androidx.datastore.preferences.protobuf.e.c()) {
            return false;
        }
        try {
            Class<?> cls = f9613b;
            Class<?> cls2 = Boolean.TYPE;
            cls.getMethod("peekLong", addressClass, cls2);
            cls.getMethod("pokeLong", addressClass, Long.TYPE, cls2);
            Class<?> cls3 = Integer.TYPE;
            cls.getMethod("pokeInt", addressClass, cls3, cls2);
            cls.getMethod("peekInt", addressClass, cls2);
            cls.getMethod("pokeByte", addressClass, Byte.TYPE);
            cls.getMethod("peekByte", addressClass);
            cls.getMethod("pokeByteArray", addressClass, byte[].class, cls3, cls3);
            cls.getMethod("peekByteArray", addressClass, byte[].class, cls3, cls3);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void s0(long[] target, long index, long value) {
        f9616e.y(target, f9624m + (index * f9625n), value);
    }

    public static Field t(Class<?> clazz, String fieldName) {
        try {
            return clazz.getDeclaredField(fieldName);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void t0(Object target, long offset, Object value) {
        f9616e.z(target, offset, value);
    }

    public static long u(Field field) {
        e eVar;
        if (field == null || (eVar = f9616e) == null) {
            return -1L;
        }
        return eVar.p(field);
    }

    public static void u0(Object[] target, long index, Object value) {
        f9616e.z(target, f9630s + (index * f9631t), value);
    }

    public static int v(long left, long right) {
        return (f9636y ? Long.numberOfLeadingZeros(left ^ right) : Long.numberOfTrailingZeros(left ^ right)) >> 3;
    }

    public static boolean v0() {
        e eVar = f9616e;
        if (eVar == null) {
            return false;
        }
        return eVar.A();
    }

    public static boolean w(Object target, long offset) {
        return f9616e.e(target, offset);
    }

    public static boolean w0() {
        e eVar = f9616e;
        if (eVar == null) {
            return false;
        }
        return eVar.B();
    }

    public static boolean x(boolean[] target, long index) {
        return f9616e.e(target, f9620i + (index * f9621j));
    }

    public static boolean y(Object target, long offset) {
        return D(target, offset) != 0;
    }

    public static boolean z(Object target, long offset) {
        return E(target, offset) != 0;
    }
}
