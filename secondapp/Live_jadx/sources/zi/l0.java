package zi;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@yi.b
@k
public final class l0 {
    public static void A(boolean expression, String errorMessageTemplate, @zq.a Object p10, @zq.a Object p11, @zq.a Object p12, @zq.a Object p13) {
        if (!expression) {
            throw new IllegalArgumentException(t0.e(errorMessageTemplate, p10, p11, p12, p13));
        }
    }

    public static void A0(boolean expression, String errorMessageTemplate, @zq.a Object p10, long p11) {
        if (!expression) {
            throw new IllegalStateException(t0.e(errorMessageTemplate, p10, Long.valueOf(p11)));
        }
    }

    public static void B(boolean expression, String errorMessageTemplate, @zq.a Object... errorMessageArgs) {
        if (!expression) {
            throw new IllegalArgumentException(t0.e(errorMessageTemplate, errorMessageArgs));
        }
    }

    public static void B0(boolean expression, String errorMessageTemplate, @zq.a Object p10, @zq.a Object p11) {
        if (!expression) {
            throw new IllegalStateException(t0.e(errorMessageTemplate, p10, p11));
        }
    }

    @qj.a
    public static int C(int index, int size) {
        return D(index, size, "index");
    }

    public static void C0(boolean expression, String errorMessageTemplate, @zq.a Object p10, @zq.a Object p11, @zq.a Object p12) {
        if (!expression) {
            throw new IllegalStateException(t0.e(errorMessageTemplate, p10, p11, p12));
        }
    }

    @qj.a
    public static int D(int index, int size, String desc) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(a(index, size, desc));
        }
        return index;
    }

    public static void D0(boolean expression, String errorMessageTemplate, @zq.a Object p10, @zq.a Object p11, @zq.a Object p12, @zq.a Object p13) {
        if (!expression) {
            throw new IllegalStateException(t0.e(errorMessageTemplate, p10, p11, p12, p13));
        }
    }

    @qj.a
    public static <T> T E(@zq.a T reference) {
        reference.getClass();
        return reference;
    }

    public static void E0(boolean expression, @zq.a String errorMessageTemplate, @zq.a Object... errorMessageArgs) {
        if (!expression) {
            throw new IllegalStateException(t0.e(errorMessageTemplate, errorMessageArgs));
        }
    }

    @qj.a
    public static <T> T F(@zq.a T reference, @zq.a Object errorMessage) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(String.valueOf(errorMessage));
    }

    @qj.a
    public static <T> T G(@zq.a T reference, String errorMessageTemplate, char p10) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(t0.e(errorMessageTemplate, Character.valueOf(p10)));
    }

    @qj.a
    public static <T> T H(@zq.a T reference, String errorMessageTemplate, char p10, char p11) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(t0.e(errorMessageTemplate, Character.valueOf(p10), Character.valueOf(p11)));
    }

    @qj.a
    public static <T> T I(@zq.a T reference, String errorMessageTemplate, char p10, int p11) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(t0.e(errorMessageTemplate, Character.valueOf(p10), Integer.valueOf(p11)));
    }

    @qj.a
    public static <T> T J(@zq.a T reference, String errorMessageTemplate, char p10, long p11) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(t0.e(errorMessageTemplate, Character.valueOf(p10), Long.valueOf(p11)));
    }

    @qj.a
    public static <T> T K(@zq.a T reference, String errorMessageTemplate, char p10, @zq.a Object p11) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(t0.e(errorMessageTemplate, Character.valueOf(p10), p11));
    }

    @qj.a
    public static <T> T L(@zq.a T reference, String errorMessageTemplate, int p10) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(t0.e(errorMessageTemplate, Integer.valueOf(p10)));
    }

    @qj.a
    public static <T> T M(@zq.a T reference, String errorMessageTemplate, int p10, char p11) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(t0.e(errorMessageTemplate, Integer.valueOf(p10), Character.valueOf(p11)));
    }

    @qj.a
    public static <T> T N(@zq.a T reference, String errorMessageTemplate, int p10, int p11) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(t0.e(errorMessageTemplate, Integer.valueOf(p10), Integer.valueOf(p11)));
    }

    @qj.a
    public static <T> T O(@zq.a T reference, String errorMessageTemplate, int p10, long p11) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(t0.e(errorMessageTemplate, Integer.valueOf(p10), Long.valueOf(p11)));
    }

    @qj.a
    public static <T> T P(@zq.a T reference, String errorMessageTemplate, int p10, @zq.a Object p11) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(t0.e(errorMessageTemplate, Integer.valueOf(p10), p11));
    }

    @qj.a
    public static <T> T Q(@zq.a T reference, String errorMessageTemplate, long p10) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(t0.e(errorMessageTemplate, Long.valueOf(p10)));
    }

    @qj.a
    public static <T> T R(@zq.a T reference, String errorMessageTemplate, long p10, char p11) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(t0.e(errorMessageTemplate, Long.valueOf(p10), Character.valueOf(p11)));
    }

    @qj.a
    public static <T> T S(@zq.a T reference, String errorMessageTemplate, long p10, int p11) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(t0.e(errorMessageTemplate, Long.valueOf(p10), Integer.valueOf(p11)));
    }

    @qj.a
    public static <T> T T(@zq.a T reference, String errorMessageTemplate, long p10, long p11) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(t0.e(errorMessageTemplate, Long.valueOf(p10), Long.valueOf(p11)));
    }

    @qj.a
    public static <T> T U(@zq.a T reference, String errorMessageTemplate, long p10, @zq.a Object p11) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(t0.e(errorMessageTemplate, Long.valueOf(p10), p11));
    }

    @qj.a
    public static <T> T V(@zq.a T reference, String errorMessageTemplate, @zq.a Object p10) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(t0.e(errorMessageTemplate, p10));
    }

    @qj.a
    public static <T> T W(@zq.a T reference, String errorMessageTemplate, @zq.a Object p10, char p11) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(t0.e(errorMessageTemplate, p10, Character.valueOf(p11)));
    }

    @qj.a
    public static <T> T X(@zq.a T reference, String errorMessageTemplate, @zq.a Object p10, int p11) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(t0.e(errorMessageTemplate, p10, Integer.valueOf(p11)));
    }

    @qj.a
    public static <T> T Y(@zq.a T reference, String errorMessageTemplate, @zq.a Object p10, long p11) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(t0.e(errorMessageTemplate, p10, Long.valueOf(p11)));
    }

    @qj.a
    public static <T> T Z(@zq.a T reference, String errorMessageTemplate, @zq.a Object p10, @zq.a Object p11) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(t0.e(errorMessageTemplate, p10, p11));
    }

    public static String a(int index, int size, String desc) {
        if (index < 0) {
            return t0.e("%s (%s) must not be negative", desc, Integer.valueOf(index));
        }
        if (size >= 0) {
            return t0.e("%s (%s) must be less than size (%s)", desc, Integer.valueOf(index), Integer.valueOf(size));
        }
        throw new IllegalArgumentException("negative size: " + size);
    }

    @qj.a
    public static <T> T a0(@zq.a T reference, String errorMessageTemplate, @zq.a Object p10, @zq.a Object p11, @zq.a Object p12) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(t0.e(errorMessageTemplate, p10, p11, p12));
    }

    public static String b(int index, int size, String desc) {
        if (index < 0) {
            return t0.e("%s (%s) must not be negative", desc, Integer.valueOf(index));
        }
        if (size >= 0) {
            return t0.e("%s (%s) must not be greater than size (%s)", desc, Integer.valueOf(index), Integer.valueOf(size));
        }
        throw new IllegalArgumentException("negative size: " + size);
    }

    @qj.a
    public static <T> T b0(@zq.a T reference, String errorMessageTemplate, @zq.a Object p10, @zq.a Object p11, @zq.a Object p12, @zq.a Object p13) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(t0.e(errorMessageTemplate, p10, p11, p12, p13));
    }

    public static String c(int start, int end, int size) {
        if (start < 0 || start > size) {
            return b(start, size, "start index");
        }
        return (end < 0 || end > size) ? b(end, size, "end index") : t0.e("end index (%s) must not be less than start index (%s)", Integer.valueOf(end), Integer.valueOf(start));
    }

    @qj.a
    public static <T> T c0(@zq.a T reference, String errorMessageTemplate, @zq.a Object... errorMessageArgs) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(t0.e(errorMessageTemplate, errorMessageArgs));
    }

    public static void d(boolean expression) {
        if (!expression) {
            throw new IllegalArgumentException();
        }
    }

    @qj.a
    public static int d0(int index, int size) {
        return e0(index, size, "index");
    }

    public static void e(boolean expression, @zq.a Object errorMessage) {
        if (!expression) {
            throw new IllegalArgumentException(String.valueOf(errorMessage));
        }
    }

    @qj.a
    public static int e0(int index, int size, String desc) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(b(index, size, desc));
        }
        return index;
    }

    public static void f(boolean expression, String errorMessageTemplate, char p10) {
        if (!expression) {
            throw new IllegalArgumentException(t0.e(errorMessageTemplate, Character.valueOf(p10)));
        }
    }

    public static void f0(int start, int end, int size) {
        if (start < 0 || end < start || end > size) {
            throw new IndexOutOfBoundsException(c(start, end, size));
        }
    }

    public static void g(boolean expression, String errorMessageTemplate, char p10, char p11) {
        if (!expression) {
            throw new IllegalArgumentException(t0.e(errorMessageTemplate, Character.valueOf(p10), Character.valueOf(p11)));
        }
    }

    public static void g0(boolean expression) {
        if (!expression) {
            throw new IllegalStateException();
        }
    }

    public static void h(boolean expression, String errorMessageTemplate, char p10, int p11) {
        if (!expression) {
            throw new IllegalArgumentException(t0.e(errorMessageTemplate, Character.valueOf(p10), Integer.valueOf(p11)));
        }
    }

    public static void h0(boolean expression, @zq.a Object errorMessage) {
        if (!expression) {
            throw new IllegalStateException(String.valueOf(errorMessage));
        }
    }

    public static void i(boolean expression, String errorMessageTemplate, char p10, long p11) {
        if (!expression) {
            throw new IllegalArgumentException(t0.e(errorMessageTemplate, Character.valueOf(p10), Long.valueOf(p11)));
        }
    }

    public static void i0(boolean expression, String errorMessageTemplate, char p10) {
        if (!expression) {
            throw new IllegalStateException(t0.e(errorMessageTemplate, Character.valueOf(p10)));
        }
    }

    public static void j(boolean expression, String errorMessageTemplate, char p10, @zq.a Object p11) {
        if (!expression) {
            throw new IllegalArgumentException(t0.e(errorMessageTemplate, Character.valueOf(p10), p11));
        }
    }

    public static void j0(boolean expression, String errorMessageTemplate, char p10, char p11) {
        if (!expression) {
            throw new IllegalStateException(t0.e(errorMessageTemplate, Character.valueOf(p10), Character.valueOf(p11)));
        }
    }

    public static void k(boolean expression, String errorMessageTemplate, int p10) {
        if (!expression) {
            throw new IllegalArgumentException(t0.e(errorMessageTemplate, Integer.valueOf(p10)));
        }
    }

    public static void k0(boolean expression, String errorMessageTemplate, char p10, int p11) {
        if (!expression) {
            throw new IllegalStateException(t0.e(errorMessageTemplate, Character.valueOf(p10), Integer.valueOf(p11)));
        }
    }

    public static void l(boolean expression, String errorMessageTemplate, int p10, char p11) {
        if (!expression) {
            throw new IllegalArgumentException(t0.e(errorMessageTemplate, Integer.valueOf(p10), Character.valueOf(p11)));
        }
    }

    public static void l0(boolean expression, String errorMessageTemplate, char p10, long p11) {
        if (!expression) {
            throw new IllegalStateException(t0.e(errorMessageTemplate, Character.valueOf(p10), Long.valueOf(p11)));
        }
    }

    public static void m(boolean expression, String errorMessageTemplate, int p10, int p11) {
        if (!expression) {
            throw new IllegalArgumentException(t0.e(errorMessageTemplate, Integer.valueOf(p10), Integer.valueOf(p11)));
        }
    }

    public static void m0(boolean expression, String errorMessageTemplate, char p10, @zq.a Object p11) {
        if (!expression) {
            throw new IllegalStateException(t0.e(errorMessageTemplate, Character.valueOf(p10), p11));
        }
    }

    public static void n(boolean expression, String errorMessageTemplate, int p10, long p11) {
        if (!expression) {
            throw new IllegalArgumentException(t0.e(errorMessageTemplate, Integer.valueOf(p10), Long.valueOf(p11)));
        }
    }

    public static void n0(boolean expression, String errorMessageTemplate, int p10) {
        if (!expression) {
            throw new IllegalStateException(t0.e(errorMessageTemplate, Integer.valueOf(p10)));
        }
    }

    public static void o(boolean expression, String errorMessageTemplate, int p10, @zq.a Object p11) {
        if (!expression) {
            throw new IllegalArgumentException(t0.e(errorMessageTemplate, Integer.valueOf(p10), p11));
        }
    }

    public static void o0(boolean expression, String errorMessageTemplate, int p10, char p11) {
        if (!expression) {
            throw new IllegalStateException(t0.e(errorMessageTemplate, Integer.valueOf(p10), Character.valueOf(p11)));
        }
    }

    public static void p(boolean expression, String errorMessageTemplate, long p10) {
        if (!expression) {
            throw new IllegalArgumentException(t0.e(errorMessageTemplate, Long.valueOf(p10)));
        }
    }

    public static void p0(boolean expression, String errorMessageTemplate, int p10, int p11) {
        if (!expression) {
            throw new IllegalStateException(t0.e(errorMessageTemplate, Integer.valueOf(p10), Integer.valueOf(p11)));
        }
    }

    public static void q(boolean expression, String errorMessageTemplate, long p10, char p11) {
        if (!expression) {
            throw new IllegalArgumentException(t0.e(errorMessageTemplate, Long.valueOf(p10), Character.valueOf(p11)));
        }
    }

    public static void q0(boolean expression, String errorMessageTemplate, int p10, long p11) {
        if (!expression) {
            throw new IllegalStateException(t0.e(errorMessageTemplate, Integer.valueOf(p10), Long.valueOf(p11)));
        }
    }

    public static void r(boolean expression, String errorMessageTemplate, long p10, int p11) {
        if (!expression) {
            throw new IllegalArgumentException(t0.e(errorMessageTemplate, Long.valueOf(p10), Integer.valueOf(p11)));
        }
    }

    public static void r0(boolean expression, String errorMessageTemplate, int p10, @zq.a Object p11) {
        if (!expression) {
            throw new IllegalStateException(t0.e(errorMessageTemplate, Integer.valueOf(p10), p11));
        }
    }

    public static void s(boolean expression, String errorMessageTemplate, long p10, long p11) {
        if (!expression) {
            throw new IllegalArgumentException(t0.e(errorMessageTemplate, Long.valueOf(p10), Long.valueOf(p11)));
        }
    }

    public static void s0(boolean expression, String errorMessageTemplate, long p10) {
        if (!expression) {
            throw new IllegalStateException(t0.e(errorMessageTemplate, Long.valueOf(p10)));
        }
    }

    public static void t(boolean expression, String errorMessageTemplate, long p10, @zq.a Object p11) {
        if (!expression) {
            throw new IllegalArgumentException(t0.e(errorMessageTemplate, Long.valueOf(p10), p11));
        }
    }

    public static void t0(boolean expression, String errorMessageTemplate, long p10, char p11) {
        if (!expression) {
            throw new IllegalStateException(t0.e(errorMessageTemplate, Long.valueOf(p10), Character.valueOf(p11)));
        }
    }

    public static void u(boolean expression, String errorMessageTemplate, @zq.a Object p10) {
        if (!expression) {
            throw new IllegalArgumentException(t0.e(errorMessageTemplate, p10));
        }
    }

    public static void u0(boolean expression, String errorMessageTemplate, long p10, int p11) {
        if (!expression) {
            throw new IllegalStateException(t0.e(errorMessageTemplate, Long.valueOf(p10), Integer.valueOf(p11)));
        }
    }

    public static void v(boolean expression, String errorMessageTemplate, @zq.a Object p10, char p11) {
        if (!expression) {
            throw new IllegalArgumentException(t0.e(errorMessageTemplate, p10, Character.valueOf(p11)));
        }
    }

    public static void v0(boolean expression, String errorMessageTemplate, long p10, long p11) {
        if (!expression) {
            throw new IllegalStateException(t0.e(errorMessageTemplate, Long.valueOf(p10), Long.valueOf(p11)));
        }
    }

    public static void w(boolean expression, String errorMessageTemplate, @zq.a Object p10, int p11) {
        if (!expression) {
            throw new IllegalArgumentException(t0.e(errorMessageTemplate, p10, Integer.valueOf(p11)));
        }
    }

    public static void w0(boolean expression, String errorMessageTemplate, long p10, @zq.a Object p11) {
        if (!expression) {
            throw new IllegalStateException(t0.e(errorMessageTemplate, Long.valueOf(p10), p11));
        }
    }

    public static void x(boolean expression, String errorMessageTemplate, @zq.a Object p10, long p11) {
        if (!expression) {
            throw new IllegalArgumentException(t0.e(errorMessageTemplate, p10, Long.valueOf(p11)));
        }
    }

    public static void x0(boolean expression, String errorMessageTemplate, @zq.a Object p10) {
        if (!expression) {
            throw new IllegalStateException(t0.e(errorMessageTemplate, p10));
        }
    }

    public static void y(boolean expression, @zq.a String errorMessageTemplate, @zq.a Object p10, @zq.a Object p11) {
        if (!expression) {
            throw new IllegalArgumentException(t0.e(errorMessageTemplate, p10, p11));
        }
    }

    public static void y0(boolean expression, String errorMessageTemplate, @zq.a Object p10, char p11) {
        if (!expression) {
            throw new IllegalStateException(t0.e(errorMessageTemplate, p10, Character.valueOf(p11)));
        }
    }

    public static void z(boolean expression, String errorMessageTemplate, @zq.a Object p10, @zq.a Object p11, @zq.a Object p12) {
        if (!expression) {
            throw new IllegalArgumentException(t0.e(errorMessageTemplate, p10, p11, p12));
        }
    }

    public static void z0(boolean expression, String errorMessageTemplate, @zq.a Object p10, int p11) {
        if (!expression) {
            throw new IllegalStateException(t0.e(errorMessageTemplate, p10, Integer.valueOf(p11)));
        }
    }
}
