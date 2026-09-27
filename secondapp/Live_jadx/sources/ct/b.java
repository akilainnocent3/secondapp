package ct;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public static final b f77064a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.m
    public static a f77065b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.m
        public final Method f77066a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oy.m
        public final Method f77067b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @oy.m
        public final Method f77068c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @oy.m
        public final Method f77069d;

        public a(@oy.m Method method, @oy.m Method method2, @oy.m Method method3, @oy.m Method method4) {
            this.f77066a = method;
            this.f77067b = method2;
            this.f77068c = method3;
            this.f77069d = method4;
        }

        @oy.m
        public final Method a() {
            return this.f77067b;
        }

        @oy.m
        public final Method b() {
            return this.f77069d;
        }

        @oy.m
        public final Method c() {
            return this.f77068c;
        }

        @oy.m
        public final Method d() {
            return this.f77066a;
        }
    }

    public final a a() {
        try {
            return new a(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null));
        } catch (NoSuchMethodException unused) {
            return new a(null, null, null, null);
        }
    }

    public final a b() {
        a aVar = f77065b;
        if (aVar != null) {
            return aVar;
        }
        a aVarA = a();
        f77065b = aVarA;
        return aVarA;
    }

    @oy.m
    public final Class<?>[] c(@oy.l Class<?> clazz) throws IllegalAccessException, InvocationTargetException {
        m0.p(clazz, "clazz");
        Method methodA = b().a();
        if (methodA == null) {
            return null;
        }
        Object objInvoke = methodA.invoke(clazz, null);
        m0.n(objInvoke, "null cannot be cast to non-null type kotlin.Array<java.lang.Class<*>>");
        return (Class[]) objInvoke;
    }

    @oy.m
    public final Object[] d(@oy.l Class<?> clazz) {
        m0.p(clazz, "clazz");
        Method methodB = b().b();
        if (methodB == null) {
            return null;
        }
        return (Object[]) methodB.invoke(clazz, null);
    }

    @oy.m
    public final Boolean e(@oy.l Class<?> clazz) throws IllegalAccessException, InvocationTargetException {
        m0.p(clazz, "clazz");
        Method methodC = b().c();
        if (methodC == null) {
            return null;
        }
        Object objInvoke = methodC.invoke(clazz, null);
        m0.n(objInvoke, "null cannot be cast to non-null type kotlin.Boolean");
        return (Boolean) objInvoke;
    }

    @oy.m
    public final Boolean f(@oy.l Class<?> clazz) throws IllegalAccessException, InvocationTargetException {
        m0.p(clazz, "clazz");
        Method methodD = b().d();
        if (methodD == null) {
            return null;
        }
        Object objInvoke = methodD.invoke(clazz, null);
        m0.n(objInvoke, "null cannot be cast to non-null type kotlin.Boolean");
        return (Boolean) objInvoke;
    }
}
