package dr;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@cs.h
@l1(version = "1.3")
public final class i1<T> implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public static final a f79460c = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.m
    public final Object f79461b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
            this();
        }

        @cs.j(name = "failure")
        @ur.f
        public final <T> Object a(Throwable exception) {
            kotlin.jvm.internal.m0.p(exception, "exception");
            return i1.b(j1.a(exception));
        }

        @cs.j(name = "success")
        @ur.f
        public final <T> Object b(T t10) {
            return i1.b(t10);
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oy.l
        @cs.g
        public final Throwable f79462b;

        public b(@oy.l Throwable exception) {
            kotlin.jvm.internal.m0.p(exception, "exception");
            this.f79462b = exception;
        }

        public boolean equals(@oy.m Object obj) {
            return (obj instanceof b) && kotlin.jvm.internal.m0.g(this.f79462b, ((b) obj).f79462b);
        }

        public int hashCode() {
            return this.f79462b.hashCode();
        }

        @oy.l
        public String toString() {
            return "Failure(" + this.f79462b + ')';
        }
    }

    @f1
    public /* synthetic */ i1(Object obj) {
        this.f79461b = obj;
    }

    public static final /* synthetic */ i1 a(Object obj) {
        return new i1(obj);
    }

    public static boolean c(Object obj, Object obj2) {
        return (obj2 instanceof i1) && kotlin.jvm.internal.m0.g(obj, ((i1) obj2).l());
    }

    public static final boolean d(Object obj, Object obj2) {
        return kotlin.jvm.internal.m0.g(obj, obj2);
    }

    @oy.m
    public static final Throwable e(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).f79462b;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ur.f
    public static final T f(Object obj) {
        if (i(obj)) {
            return null;
        }
        return obj;
    }

    public static int h(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean i(Object obj) {
        return obj instanceof b;
    }

    public static final boolean j(Object obj) {
        return !(obj instanceof b);
    }

    @oy.l
    public static String k(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).toString();
        }
        return "Success(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f79461b, obj);
    }

    public int hashCode() {
        return h(this.f79461b);
    }

    public final /* synthetic */ Object l() {
        return this.f79461b;
    }

    @oy.l
    public String toString() {
        return k(this.f79461b);
    }

    @f1
    public static /* synthetic */ void g() {
    }

    @f1
    @oy.l
    public static <T> Object b(@oy.m Object obj) {
        return obj;
    }
}
