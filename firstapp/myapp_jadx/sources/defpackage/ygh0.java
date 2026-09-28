package defpackage;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes8.dex */
public final class ygh0 extends c5 {
    public final long b;
    public final long c;
    public final long d;

    public static final class a {
        public static final Unsafe a;

        static {
            Unsafe unsafe = null;
            try {
                Field declaredField = Unsafe.class.getDeclaredField("theUnsafe");
                declaredField.setAccessible(true);
                unsafe = (Unsafe) declaredField.get(null);
            } catch (Throwable unused) {
            }
            a = unsafe;
        }
    }

    public ygh0(long j, long j2, long j3) {
        this.b = j;
        this.c = j2;
        this.d = j3;
    }

    public static long c(Class cls, String str) {
        try {
            Unsafe unsafe = a.a;
            if (unsafe == null) {
                return -1L;
            }
            Field declaredField = String.class.getDeclaredField(str);
            if (cls.isAssignableFrom(declaredField.getType())) {
                return unsafe.objectFieldOffset(declaredField);
            }
            return -1L;
        } catch (Exception unused) {
            return -1L;
        }
    }
}
