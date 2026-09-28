package defpackage;

import com.sportybet.plugin.sportypicks.domain.model.Kjqv.DZsoPoBl;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.luBk.Chyeyik;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes4.dex */
public final class chh0 {
    public static final Unsafe a;
    public static final Class<?> b;
    public static final d c;
    public static final boolean d;
    public static final boolean e;
    public static final long f;
    public static final boolean g;

    public static final class a extends d {
        @Override // chh0.d
        public final boolean a(Object obj, long j) {
            if (chh0.g) {
                return chh0.f(obj, j) != 0;
            }
            return chh0.g(obj, j) != 0;
        }

        @Override // chh0.d
        public final byte b(Object obj, long j) {
            return chh0.g ? chh0.f(obj, j) : chh0.g(obj, j);
        }

        @Override // chh0.d
        public final double c(Object obj, long j) {
            return Double.longBitsToDouble(this.a.getLong(obj, j));
        }

        @Override // chh0.d
        public final float d(Object obj, long j) {
            return Float.intBitsToFloat(this.a.getInt(obj, j));
        }

        @Override // chh0.d
        public final void e(Object obj, long j, boolean z) {
            if (chh0.g) {
                chh0.m(obj, j, z ? (byte) 1 : (byte) 0);
            } else {
                chh0.n(obj, j, z ? (byte) 1 : (byte) 0);
            }
        }

        @Override // chh0.d
        public final void f(Object obj, long j, byte b) {
            if (chh0.g) {
                chh0.m(obj, j, b);
            } else {
                chh0.n(obj, j, b);
            }
        }

        @Override // chh0.d
        public final void g(Object obj, long j, double d) {
            this.a.putLong(obj, j, Double.doubleToLongBits(d));
        }

        @Override // chh0.d
        public final void h(Object obj, long j, float f) {
            this.a.putInt(obj, j, Float.floatToIntBits(f));
        }

        @Override // chh0.d
        public final boolean j() {
            return false;
        }
    }

    public static final class b extends d {
        @Override // chh0.d
        public final boolean a(Object obj, long j) {
            if (chh0.g) {
                return chh0.f(obj, j) != 0;
            }
            return chh0.g(obj, j) != 0;
        }

        @Override // chh0.d
        public final byte b(Object obj, long j) {
            return chh0.g ? chh0.f(obj, j) : chh0.g(obj, j);
        }

        @Override // chh0.d
        public final double c(Object obj, long j) {
            return Double.longBitsToDouble(this.a.getLong(obj, j));
        }

        @Override // chh0.d
        public final float d(Object obj, long j) {
            return Float.intBitsToFloat(this.a.getInt(obj, j));
        }

        @Override // chh0.d
        public final void e(Object obj, long j, boolean z) {
            if (chh0.g) {
                chh0.m(obj, j, z ? (byte) 1 : (byte) 0);
            } else {
                chh0.n(obj, j, z ? (byte) 1 : (byte) 0);
            }
        }

        @Override // chh0.d
        public final void f(Object obj, long j, byte b) {
            if (chh0.g) {
                chh0.m(obj, j, b);
            } else {
                chh0.n(obj, j, b);
            }
        }

        @Override // chh0.d
        public final void g(Object obj, long j, double d) {
            this.a.putLong(obj, j, Double.doubleToLongBits(d));
        }

        @Override // chh0.d
        public final void h(Object obj, long j, float f) {
            this.a.putInt(obj, j, Float.floatToIntBits(f));
        }

        @Override // chh0.d
        public final boolean j() {
            return false;
        }
    }

    public static final class c extends d {
        @Override // chh0.d
        public final boolean a(Object obj, long j) {
            return this.a.getBoolean(obj, j);
        }

        @Override // chh0.d
        public final byte b(Object obj, long j) {
            return this.a.getByte(obj, j);
        }

        @Override // chh0.d
        public final double c(Object obj, long j) {
            return this.a.getDouble(obj, j);
        }

        @Override // chh0.d
        public final float d(Object obj, long j) {
            return this.a.getFloat(obj, j);
        }

        @Override // chh0.d
        public final void e(Object obj, long j, boolean z) {
            this.a.putBoolean(obj, j, z);
        }

        @Override // chh0.d
        public final void f(Object obj, long j, byte b) {
            this.a.putByte(obj, j, b);
        }

        @Override // chh0.d
        public final void g(Object obj, long j, double d) {
            this.a.putDouble(obj, j, d);
        }

        @Override // chh0.d
        public final void h(Object obj, long j, float f) {
            this.a.putFloat(obj, j, f);
        }

        @Override // chh0.d
        public final boolean i() {
            if (!super.i()) {
                return false;
            }
            try {
                Class<?> cls = this.a.getClass();
                Class cls2 = Long.TYPE;
                cls.getMethod("getByte", Object.class, cls2);
                cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
                cls.getMethod("getBoolean", Object.class, cls2);
                cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
                cls.getMethod("getFloat", Object.class, cls2);
                cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
                cls.getMethod("getDouble", Object.class, cls2);
                cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
                return true;
            } catch (Throwable th) {
                chh0.k(th);
                return false;
            }
        }

        @Override // chh0.d
        public final boolean j() {
            Unsafe unsafe = this.a;
            if (unsafe != null) {
                try {
                    Class<?> cls = unsafe.getClass();
                    cls.getMethod("objectFieldOffset", Field.class);
                    Class cls2 = Long.TYPE;
                    cls.getMethod("getLong", Object.class, cls2);
                    if (chh0.c() != null) {
                        try {
                            Class<?> cls3 = unsafe.getClass();
                            cls3.getMethod("getByte", cls2);
                            cls3.getMethod("putByte", cls2, Byte.TYPE);
                            cls3.getMethod("getInt", cls2);
                            cls3.getMethod(Chyeyik.KDbyTUErfAct, cls2, Integer.TYPE);
                            cls3.getMethod("getLong", cls2);
                            cls3.getMethod("putLong", cls2, cls2);
                            cls3.getMethod("copyMemory", cls2, cls2, cls2);
                            cls3.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                            return true;
                        } catch (Throwable th) {
                            chh0.k(th);
                            return false;
                        }
                    }
                } catch (Throwable th2) {
                    chh0.k(th2);
                }
            }
            return false;
        }
    }

    public static abstract class d {
        public final Unsafe a;

        public d(Unsafe unsafe) {
            this.a = unsafe;
        }

        public abstract boolean a(Object obj, long j);

        public abstract byte b(Object obj, long j);

        public abstract double c(Object obj, long j);

        public abstract float d(Object obj, long j);

        public abstract void e(Object obj, long j, boolean z);

        public abstract void f(Object obj, long j, byte b);

        public abstract void g(Object obj, long j, double d);

        public abstract void h(Object obj, long j, float f);

        public boolean i() {
            Unsafe unsafe = this.a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("arrayBaseOffset", Class.class);
                cls.getMethod("arrayIndexScale", Class.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getInt", Object.class, cls2);
                cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
                cls.getMethod("getLong", Object.class, cls2);
                cls.getMethod("putLong", Object.class, cls2, cls2);
                cls.getMethod("getObject", Object.class, cls2);
                cls.getMethod("putObject", Object.class, cls2, Object.class);
                return true;
            } catch (Throwable th) {
                chh0.k(th);
                return false;
            }
        }

        public abstract boolean j();
    }

    static {
        Unsafe unsafe;
        d cVar = null;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new zgh0());
        } catch (Throwable unused) {
            unsafe = null;
        }
        a = unsafe;
        b = o20.a;
        boolean zD = d(Long.TYPE);
        boolean zD2 = d(Integer.TYPE);
        if (unsafe != null) {
            if (!o20.a()) {
                cVar = new c(unsafe);
            } else if (zD) {
                cVar = new b(unsafe);
            } else if (zD2) {
                cVar = new a(unsafe);
            }
        }
        c = cVar;
        d = cVar == null ? false : cVar.j();
        e = cVar == null ? false : cVar.i();
        f = a(byte[].class);
        a(boolean[].class);
        b(boolean[].class);
        a(int[].class);
        b(int[].class);
        a(long[].class);
        b(long[].class);
        a(float[].class);
        b(float[].class);
        a(double[].class);
        b(double[].class);
        a(Object[].class);
        b(Object[].class);
        Field fieldC = c();
        if (fieldC != null && cVar != null) {
            cVar.a.objectFieldOffset(fieldC);
        }
        g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static int a(Class<?> cls) {
        if (e) {
            return c.a.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static void b(Class cls) {
        if (e) {
            c.a.arrayIndexScale(cls);
        }
    }

    public static Field c() {
        Field declaredField;
        Field declaredField2;
        if (o20.a()) {
            try {
                declaredField2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                declaredField2 = null;
            }
            if (declaredField2 != null) {
                return declaredField2;
            }
        }
        try {
            declaredField = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField = null;
        }
        if (declaredField == null || declaredField.getType() != Long.TYPE) {
            return null;
        }
        return declaredField;
    }

    public static boolean d(Class<?> cls) {
        if (!o20.a()) {
            return false;
        }
        try {
            Class<?> cls2 = b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static byte e(byte[] bArr, long j) {
        return c.b(bArr, f + j);
    }

    public static byte f(Object obj, long j) {
        return (byte) ((h(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    public static byte g(Object obj, long j) {
        return (byte) ((h(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255);
    }

    public static int h(Object obj, long j) {
        return c.a.getInt(obj, j);
    }

    public static long i(Object obj, long j) {
        return c.a.getLong(obj, j);
    }

    public static Object j(Object obj, long j) {
        return c.a.getObject(obj, j);
    }

    public static void l(byte[] bArr, long j, byte b2) {
        c.f(bArr, f + j, b2);
    }

    public static void m(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        int iH = h(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        o(obj, j2, ((255 & b2) << i) | (iH & (~(255 << i))));
    }

    public static void n(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        o(obj, j2, ((255 & b2) << i) | (h(obj, j2) & (~(255 << i))));
    }

    public static void o(Object obj, long j, int i) {
        c.a.putInt(obj, j, i);
    }

    public static void p(Object obj, long j, long j2) {
        c.a.putLong(obj, j, j2);
    }

    public static void q(Object obj, long j, Object obj2) {
        c.a.putObject(obj, j, obj2);
    }

    public static void k(Throwable th) {
        Logger.getLogger(chh0.class.getName()).log(Level.WARNING, DZsoPoBl.qPIgJEqilYJ + th);
    }
}
