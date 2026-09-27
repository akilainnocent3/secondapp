package com.fyber.inneractive.sdk.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class x3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Unsafe f47623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class f47624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final w3 f47625c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f47626d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f47627e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f47628f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f47629g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final boolean f47630h;

    /* JADX WARN: Code duplicated, block: B:15:0x0039  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a2 A[PHI: r4
      0x00a2: PHI (r4v20 java.lang.reflect.Field) = (r4v18 java.lang.reflect.Field), (r4v23 java.lang.reflect.Field) binds: [B:39:0x00b2, B:31:0x00a0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x00a4  */
    static {
        Unsafe unsafe;
        w3 v3Var;
        Field declaredField;
        Field field = null;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new s3());
        } catch (Throwable unused) {
            unsafe = null;
        }
        f47623a = unsafe;
        f47624b = d.f47448a;
        Class<?> cls = Long.TYPE;
        boolean zC = c(cls);
        boolean zC2 = c(Integer.TYPE);
        if (unsafe == null) {
            v3Var = null;
        } else if (!d.a()) {
            v3Var = new v3(unsafe);
        } else if (zC) {
            v3Var = new u3(unsafe);
        } else if (zC2) {
            v3Var = new t3(unsafe);
        } else {
            v3Var = null;
        }
        f47625c = v3Var;
        f47626d = v3Var == null ? false : v3Var.b();
        f47627e = v3Var == null ? false : v3Var.a();
        f47628f = a(byte[].class);
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
        if (d.a()) {
            try {
                declaredField = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused2) {
                declaredField = null;
            }
            if (declaredField != null) {
                field = declaredField;
            } else {
                try {
                    declaredField = Buffer.class.getDeclaredField("address");
                } catch (Throwable unused3) {
                    declaredField = null;
                }
                if (declaredField != null && declaredField.getType() == cls) {
                    field = declaredField;
                }
            }
        } else {
            declaredField = Buffer.class.getDeclaredField("address");
            if (declaredField != null) {
                field = declaredField;
            }
        }
        f47629g = (field == null || v3Var == null) ? -1L : v3Var.f47611a.objectFieldOffset(field);
        f47630h = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static int a(Class cls) {
        if (f47627e) {
            return f47625c.f47611a.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static void b(Class cls) {
        if (f47627e) {
            f47625c.f47611a.arrayIndexScale(cls);
        }
    }

    public static int c(Object obj, long j10) {
        return f47625c.f47611a.getInt(obj, j10);
    }

    public static long d(Object obj, long j10) {
        return f47625c.f47611a.getLong(obj, j10);
    }

    public static Object e(Object obj, long j10) {
        return f47625c.f47611a.getObject(obj, j10);
    }

    public static void a(Object obj, long j10, int i10) {
        f47625c.f47611a.putInt(obj, j10, i10);
    }

    public static byte b(Object obj, long j10) {
        return (byte) ((c(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean c(Class cls) {
        if (!d.a()) {
            return false;
        }
        try {
            Class cls2 = f47624b;
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

    public static void b(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        a(obj, j11, ((255 & b10) << i10) | (c(obj, j11) & (~(255 << i10))));
    }

    public static void a(Object obj, long j10, long j11) {
        f47625c.f47611a.putLong(obj, j10, j11);
    }

    public static void a(long j10, Object obj, Object obj2) {
        f47625c.f47611a.putObject(obj, j10, obj2);
    }

    public static byte a(Object obj, long j10) {
        return (byte) ((c(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255);
    }

    public static void a(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int iC = c(obj, j11);
        int i10 = ((~((int) j10)) & 3) << 3;
        a(obj, j11, ((255 & b10) << i10) | (iC & (~(255 << i10))));
    }

    public static void a(Throwable th2) {
        Logger.getLogger(x3.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th2);
    }
}
