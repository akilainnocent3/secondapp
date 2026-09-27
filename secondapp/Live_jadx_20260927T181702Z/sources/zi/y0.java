package zi;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@yi.b(emulated = true)
@k
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @yi.c
    @yi.d
    public static final String f161901a = "sun.misc.JavaLangAccess";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @yi.e
    @yi.c
    @yi.d
    public static final String f161902b = "sun.misc.SharedSecrets";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @zq.a
    @yi.c
    @yi.d
    public static final Object f161903c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @zq.a
    @yi.c
    @yi.d
    public static final Method f161904d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @zq.a
    @yi.c
    @yi.d
    public static final Method f161905e;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends AbstractList<StackTraceElement> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Throwable f161906b;

        public a(final Throwable val$t) {
            this.f161906b = val$t;
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public StackTraceElement get(int n10) {
            Method method = y0.f161904d;
            Objects.requireNonNull(method);
            Object obj = y0.f161903c;
            Objects.requireNonNull(obj);
            return (StackTraceElement) y0.m(method, obj, this.f161906b, Integer.valueOf(n10));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            Method method = y0.f161905e;
            Objects.requireNonNull(method);
            Object obj = y0.f161903c;
            Objects.requireNonNull(obj);
            return ((Integer) y0.m(method, obj, this.f161906b)).intValue();
        }
    }

    static {
        Object objH = h();
        f161903c = objH;
        f161904d = objH == null ? null : g();
        f161905e = objH != null ? k(objH) : null;
    }

    public static List<Throwable> e(Throwable throwable) {
        l0.E(throwable);
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(throwable);
        boolean z10 = false;
        Throwable cause = throwable;
        while (true) {
            throwable = throwable.getCause();
            if (throwable == null) {
                return Collections.unmodifiableList(arrayList);
            }
            arrayList.add(throwable);
            if (throwable == cause) {
                throw new IllegalArgumentException("Loop in causal chain detected.", throwable);
            }
            if (z10) {
                cause = cause.getCause();
            }
            z10 = !z10;
        }
    }

    @zq.a
    @yi.c
    public static <X extends Throwable> X f(Throwable throwable, Class<X> expectedCauseType) {
        try {
            return expectedCauseType.cast(throwable.getCause());
        } catch (ClassCastException e10) {
            e10.initCause(throwable);
            throw e10;
        }
    }

    @zq.a
    @yi.c
    @yi.d
    public static Method g() {
        return i("getStackTraceElement", Throwable.class, Integer.TYPE);
    }

    @zq.a
    @yi.c
    @yi.d
    public static Object h() {
        try {
            return Class.forName(f161902b, false, null).getMethod("getJavaLangAccess", null).invoke(null, null);
        } catch (ThreadDeath e10) {
            throw e10;
        } catch (Throwable unused) {
            return null;
        }
    }

    @yi.c
    @yi.d
    @zq.a
    public static Method i(String name, Class<?>... parameterTypes) throws ThreadDeath {
        try {
            return Class.forName(f161901a, false, null).getMethod(name, parameterTypes);
        } catch (ThreadDeath e10) {
            throw e10;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Throwable j(Throwable throwable) {
        boolean z10 = false;
        Throwable cause = throwable;
        while (true) {
            Throwable cause2 = throwable.getCause();
            if (cause2 == null) {
                return throwable;
            }
            if (cause2 == cause) {
                throw new IllegalArgumentException("Loop in causal chain detected.", cause2);
            }
            if (z10) {
                cause = cause.getCause();
            }
            z10 = !z10;
            throwable = cause2;
        }
    }

    @zq.a
    @yi.c
    @yi.d
    public static Method k(Object jla) {
        try {
            Method methodI = i("getStackTraceDepth", Throwable.class);
            if (methodI == null) {
                return null;
            }
            methodI.invoke(jla, new Throwable());
            return methodI;
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
            return null;
        }
    }

    @yi.c
    public static String l(Throwable throwable) {
        StringWriter stringWriter = new StringWriter();
        throwable.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    @yi.c
    @yi.d
    public static Object m(Method method, Object receiver, Object... params) {
        try {
            return method.invoke(receiver, params);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InvocationTargetException e11) {
            throw q(e11.getCause());
        }
    }

    @yi.c
    @yi.d
    public static List<StackTraceElement> n(Throwable t10) {
        l0.E(t10);
        return new a(t10);
    }

    @yi.c
    @Deprecated
    @yi.d
    public static List<StackTraceElement> o(Throwable throwable) {
        return p() ? n(throwable) : Collections.unmodifiableList(Arrays.asList(throwable.getStackTrace()));
    }

    @yi.c
    @Deprecated
    @yi.d
    public static boolean p() {
        return (f161904d == null || f161905e == null) ? false : true;
    }

    @yi.c
    @Deprecated
    @yi.d
    @qj.a
    public static RuntimeException q(Throwable throwable) {
        w(throwable);
        throw new RuntimeException(throwable);
    }

    @yi.c
    @Deprecated
    @yi.d
    public static <X extends Throwable> void r(@zq.a Throwable throwable, Class<X> declaredType) throws Throwable {
        if (throwable != null) {
            v(throwable, declaredType);
        }
    }

    @yi.c
    @Deprecated
    @yi.d
    public static void s(@zq.a Throwable throwable) {
        if (throwable != null) {
            w(throwable);
        }
    }

    @yi.c
    @Deprecated
    @yi.d
    public static <X extends Throwable> void t(@zq.a Throwable throwable, Class<X> declaredType) throws Throwable {
        r(throwable, declaredType);
        s(throwable);
    }

    @yi.c
    @Deprecated
    @yi.d
    public static <X1 extends Throwable, X2 extends Throwable> void u(@zq.a Throwable throwable, Class<X1> declaredType1, Class<X2> declaredType2) throws Throwable {
        l0.E(declaredType2);
        r(throwable, declaredType1);
        t(throwable, declaredType2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X extends java.lang.Throwable */
    @yi.c
    public static <X extends Throwable> void v(Throwable throwable, Class<X> declaredType) throws Throwable {
        l0.E(throwable);
        if (declaredType.isInstance(throwable)) {
            throw declaredType.cast(throwable);
        }
    }

    public static void w(Throwable throwable) {
        l0.E(throwable);
        if (throwable instanceof RuntimeException) {
            throw ((RuntimeException) throwable);
        }
        if (throwable instanceof Error) {
            throw ((Error) throwable);
        }
    }
}
