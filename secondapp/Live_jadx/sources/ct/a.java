package ct;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public static final a f77059a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.m
    public static C0750a f77060b;

    /* JADX INFO: renamed from: ct.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class C0750a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.m
        public final Method f77061a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oy.m
        public final Method f77062b;

        public C0750a(@oy.m Method method, @oy.m Method method2) {
            this.f77061a = method;
            this.f77062b = method2;
        }

        @oy.m
        public final Method a() {
            return this.f77062b;
        }

        @oy.m
        public final Method b() {
            return this.f77061a;
        }
    }

    public final C0750a a(Object obj) {
        Class<?> cls = obj.getClass();
        try {
            return new C0750a(cls.getMethod("getType", null), cls.getMethod("getAccessor", null));
        } catch (NoSuchMethodException unused) {
            return new C0750a(null, null);
        }
    }

    public final C0750a b(Object obj) {
        C0750a c0750a = f77060b;
        if (c0750a != null) {
            return c0750a;
        }
        C0750a c0750aA = a(obj);
        f77060b = c0750aA;
        return c0750aA;
    }

    @oy.m
    public final Method c(@oy.l Object recordComponent) throws IllegalAccessException, InvocationTargetException {
        m0.p(recordComponent, "recordComponent");
        Method methodA = b(recordComponent).a();
        if (methodA == null) {
            return null;
        }
        Object objInvoke = methodA.invoke(recordComponent, null);
        m0.n(objInvoke, "null cannot be cast to non-null type java.lang.reflect.Method");
        return (Method) objInvoke;
    }

    @oy.m
    public final Class<?> d(@oy.l Object recordComponent) throws IllegalAccessException, InvocationTargetException {
        m0.p(recordComponent, "recordComponent");
        Method methodB = b(recordComponent).b();
        if (methodB == null) {
            return null;
        }
        Object objInvoke = methodB.invoke(recordComponent, null);
        m0.n(objInvoke, "null cannot be cast to non-null type java.lang.Class<*>");
        return (Class) objInvoke;
    }
}
