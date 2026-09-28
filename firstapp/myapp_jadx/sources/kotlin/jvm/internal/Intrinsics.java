package kotlin.jvm.internal;

import defpackage.asp;
import defpackage.tug;
import defpackage.ux5;
import defpackage.wga;
import defpackage.xdh0;
import defpackage.yk10;
import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public class Intrinsics {

    public static class a {
    }

    public static boolean a(double d, Double d2) {
        return d2 != null && d == d2.doubleValue();
    }

    public static boolean b(float f, Float f2) {
        return f2 != null && f == f2.floatValue();
    }

    public static boolean c(Double d, double d2) {
        return d != null && d.doubleValue() == d2;
    }

    public static void checkNotNullExpressionValue(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(yk10.a(str, " must not be null"));
        j(nullPointerException, Intrinsics.class.getName());
        throw nullPointerException;
    }

    public static void checkNotNullParameter(Object obj, String str) {
        if (obj != null) {
            return;
        }
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = Intrinsics.class.getName();
        int i = 0;
        while (!stackTrace[i].getClassName().equals(name)) {
            i++;
        }
        while (stackTrace[i].getClassName().equals(name)) {
            i++;
        }
        StackTraceElement stackTraceElement = stackTrace[i];
        StringBuilder sbA = ux5.a("Parameter specified as non-null is null: method ", stackTraceElement.getClassName(), ".", stackTraceElement.getMethodName(), ", parameter ");
        sbA.append(str);
        NullPointerException nullPointerException = new NullPointerException(sbA.toString());
        j(nullPointerException, Intrinsics.class.getName());
        throw nullPointerException;
    }

    public static boolean d(Double d, Double d2) {
        if (d == null) {
            return d2 == null;
        }
        return d2 != null && d.doubleValue() == d2.doubleValue();
    }

    public static boolean e(Float f, float f2) {
        return f != null && f.floatValue() == f2;
    }

    public static boolean f(Float f, Float f2) {
        if (f == null) {
            return f2 == null;
        }
        return f2 != null && f.floatValue() == f2.floatValue();
    }

    public static boolean g(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static int h(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    public static int i(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    public static void j(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
    }

    public static String k(Object obj, String str) {
        return wga.a(obj, str);
    }

    public static void l() {
        asp aspVar = new asp();
        j(aspVar, Intrinsics.class.getName());
        throw aspVar;
    }

    public static void m() {
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static void n(String str) {
        xdh0 xdh0Var = new xdh0(tug.a("lateinit property ", str, " has not been initialized"));
        j(xdh0Var, Intrinsics.class.getName());
        throw xdh0Var;
    }
}
