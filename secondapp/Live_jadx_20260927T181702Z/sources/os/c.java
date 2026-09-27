package os;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s1;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@s1({"SMAP\nKAnnotatedElements.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KAnnotatedElements.kt\nkotlin/reflect/full/Java8RepeatableContainerLoader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,102:1\n1#2:103\n*E\n"})
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public static final c f119546a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @m
    public static a f119547b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @m
        public final Class<? extends Annotation> f119548a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @m
        public final Method f119549b;

        public a(@m Class<? extends Annotation> cls, @m Method method) {
            this.f119548a = cls;
            this.f119549b = method;
        }

        @m
        public final Class<? extends Annotation> a() {
            return this.f119548a;
        }

        @m
        public final Method b() {
            return this.f119549b;
        }
    }

    public final a a() {
        try {
            Class<?> cls = Class.forName("java.lang.annotation.Repeatable");
            m0.n(cls, "null cannot be cast to non-null type java.lang.Class<out kotlin.Annotation>");
            return new a(cls, cls.getMethod("value", null));
        } catch (ClassNotFoundException unused) {
            return new a(null, null);
        }
    }

    @m
    public final Class<? extends Annotation> b(@oy.l Class<? extends Annotation> klass) throws IllegalAccessException, InvocationTargetException {
        Annotation annotation;
        Method methodB;
        m0.p(klass, "klass");
        a aVarA = f119547b;
        if (aVarA == null) {
            synchronized (this) {
                aVarA = f119547b;
                if (aVarA == null) {
                    aVarA = f119546a.a();
                    f119547b = aVarA;
                }
            }
        }
        Class clsA = aVarA.a();
        if (clsA == null || (annotation = klass.getAnnotation(clsA)) == null || (methodB = aVarA.b()) == null) {
            return null;
        }
        Object objInvoke = methodB.invoke(annotation, null);
        m0.n(objInvoke, "null cannot be cast to non-null type java.lang.Class<out kotlin.Annotation>");
        return (Class) objInvoke;
    }
}
