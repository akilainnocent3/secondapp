package qs;

import java.lang.ref.SoftReference;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class i0 {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a<T> extends c<T> implements ds.a<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ds.a<T> f122637c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public volatile SoftReference<Object> f122638d;

        public a(@oy.m T t10, @oy.l ds.a<T> aVar) {
            if (aVar == null) {
                h(0);
            }
            this.f122638d = null;
            this.f122637c = aVar;
            if (t10 != null) {
                this.f122638d = new SoftReference<>(a(t10));
            }
        }

        public static /* synthetic */ void h(int i10) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal", "<init>"));
        }

        @Override // qs.i0.c, ds.a
        public T invoke() {
            Object obj;
            SoftReference<Object> softReference = this.f122638d;
            if (softReference != null && (obj = softReference.get()) != null) {
                return g(obj);
            }
            T tInvoke = this.f122637c.invoke();
            this.f122638d = new SoftReference<>(a(tInvoke));
            return tInvoke;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b<T> extends c<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ds.a<T> f122639c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public volatile Object f122640d;

        public b(@oy.l ds.a<T> aVar) {
            if (aVar == null) {
                h(0);
            }
            this.f122640d = null;
            this.f122639c = aVar;
        }

        private static /* synthetic */ void h(int i10) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties$LazyVal", "<init>"));
        }

        @Override // qs.i0.c, ds.a
        public T invoke() {
            Object obj = this.f122640d;
            if (obj != null) {
                return g(obj);
            }
            T tInvoke = this.f122639c.invoke();
            this.f122640d = a(tInvoke);
            return tInvoke;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class c<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Object f122641b = new a();

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static class a {
        }

        public Object a(T t10) {
            return t10 == null ? f122641b : t10;
        }

        public final T d(Object obj, Object obj2) {
            return invoke();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public T g(Object obj) {
            if (obj == f122641b) {
                return null;
            }
            return obj;
        }

        public abstract T invoke();
    }

    public static /* synthetic */ void a(int i10) {
        Object[] objArr = new Object[3];
        objArr[0] = "initializer";
        objArr[1] = "kotlin/reflect/jvm/internal/ReflectProperties";
        if (i10 == 1 || i10 == 2) {
            objArr[2] = "lazySoft";
        } else {
            objArr[2] = "lazy";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @oy.l
    public static <T> b<T> b(@oy.l ds.a<T> aVar) {
        if (aVar == null) {
            a(0);
        }
        return new b<>(aVar);
    }

    @oy.l
    public static <T> a<T> c(@oy.l ds.a<T> aVar) {
        if (aVar == null) {
            a(2);
        }
        return d(null, aVar);
    }

    @oy.l
    public static <T> a<T> d(@oy.m T t10, @oy.l ds.a<T> aVar) {
        if (aVar == null) {
            a(1);
        }
        return new a<>(t10, aVar);
    }
}
