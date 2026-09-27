package gj;

import java.lang.reflect.Field;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@k
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f86941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ boolean f86942b = false;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class b implements c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f86943b = new a("INSTANCE", 0);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ b[] f86944c = d();

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public final enum a extends b {
            public a(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal);
            }

            @Override // gj.z.c
            public long a(byte[] source, int offset) {
                return lj.n.k(source[offset + 7], source[offset + 6], source[offset + 5], source[offset + 4], source[offset + 3], source[offset + 2], source[offset + 1], source[offset]);
            }

            @Override // gj.z.c
            public void b(byte[] sink, int offset, long value) {
                long j10 = 255;
                for (int i10 = 0; i10 < 8; i10++) {
                    sink[offset + i10] = (byte) ((value & j10) >> (i10 * 8));
                    j10 <<= 8;
                }
            }
        }

        public b(String $enum$name, int $enum$ordinal) {
            super($enum$name, $enum$ordinal);
        }

        public static /* synthetic */ b[] d() {
            return new b[]{f86943b};
        }

        public static b valueOf(String name) {
            return (b) Enum.valueOf(b.class, name);
        }

        public static b[] values() {
            return (b[]) f86944c.clone();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface c {
        long a(byte[] array, int offset);

        void b(byte[] array, int offset, long value);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class d implements c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Unsafe f86947d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f86948e;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f86945b = new a("UNSAFE_LITTLE_ENDIAN", 0);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f86946c = new b("UNSAFE_BIG_ENDIAN", 1);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ d[] f86949f = g();

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public final enum a extends d {
            public a(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal);
            }

            @Override // gj.z.c
            public long a(byte[] array, int offset) {
                return d.f86947d.getLong(array, ((long) offset) + ((long) d.f86948e));
            }

            @Override // gj.z.c
            public void b(byte[] array, int offset, long value) {
                d.f86947d.putLong(array, ((long) offset) + ((long) d.f86948e), value);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public final enum b extends d {
            public b(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal);
            }

            @Override // gj.z.c
            public long a(byte[] array, int offset) {
                return Long.reverseBytes(d.f86947d.getLong(array, ((long) offset) + ((long) d.f86948e)));
            }

            @Override // gj.z.c
            public void b(byte[] array, int offset, long value) {
                d.f86947d.putLong(array, ((long) offset) + ((long) d.f86948e), Long.reverseBytes(value));
            }
        }

        static {
            Unsafe unsafeJ = j();
            f86947d = unsafeJ;
            f86948e = unsafeJ.arrayBaseOffset(byte[].class);
            if (unsafeJ.arrayIndexScale(byte[].class) != 1) {
                throw new AssertionError();
            }
        }

        public d(String $enum$name, int $enum$ordinal) {
            super($enum$name, $enum$ordinal);
        }

        public static /* synthetic */ d[] g() {
            return new d[]{f86945b, f86946c};
        }

        public static Unsafe j() {
            try {
                try {
                    return Unsafe.getUnsafe();
                } catch (PrivilegedActionException e10) {
                    throw new RuntimeException("Could not initialize intrinsics", e10.getCause());
                }
            } catch (SecurityException unused) {
                return (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction() { // from class: gj.a0
                    @Override // java.security.PrivilegedExceptionAction
                    public final Object run() {
                        return z.d.k();
                    }
                });
            }
        }

        public static /* synthetic */ Unsafe k() throws Exception {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            throw new NoSuchFieldError("the Unsafe");
        }

        public static d valueOf(String name) {
            return (d) Enum.valueOf(d.class, name);
        }

        public static d[] values() {
            return (d[]) f86949f.clone();
        }
    }

    static {
        c cVar = b.f86943b;
        try {
            if ("amd64".equals(System.getProperty("os.arch"))) {
                cVar = ByteOrder.nativeOrder().equals(ByteOrder.LITTLE_ENDIAN) ? d.f86945b : d.f86946c;
            }
        } catch (Throwable unused) {
        }
        f86941a = cVar;
    }

    public static int a(byte[] source, int offset) {
        return ((source[offset + 3] & 255) << 24) | (source[offset] & 255) | ((source[offset + 1] & 255) << 8) | ((source[offset + 2] & 255) << 16);
    }

    public static long b(byte[] input, int offset) {
        return f86941a.a(input, offset);
    }

    public static long c(byte[] input, int offset, int length) {
        int iMin = Math.min(length, 8);
        long j10 = 0;
        for (int i10 = 0; i10 < iMin; i10++) {
            j10 |= (((long) input[offset + i10]) & 255) << (i10 * 8);
        }
        return j10;
    }

    public static void d(byte[] sink, int offset, long value) {
        f86941a.b(sink, offset, value);
    }

    public static boolean e() {
        return f86941a instanceof d;
    }
}
