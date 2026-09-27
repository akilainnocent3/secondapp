package zj;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class g<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f161925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set<k0<? super T>> f161926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set<w> f161927c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f161928d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f161929e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l<T> f161930f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Set<Class<?>> f161931g;

    public static <T> b<T> f(Class<T> cls) {
        return new b<>(cls, new Class[0]);
    }

    @SafeVarargs
    public static <T> b<T> g(Class<T> cls, Class<? super T>... clsArr) {
        return new b<>(cls, clsArr);
    }

    public static <T> b<T> h(k0<T> k0Var) {
        return new b<>(k0Var, new k0[0]);
    }

    @SafeVarargs
    public static <T> b<T> i(k0<T> k0Var, k0<? super T>... k0VarArr) {
        return new b<>(k0Var, k0VarArr);
    }

    public static <T> g<T> o(final T t10, Class<T> cls) {
        return q(cls).f(new l() { // from class: zj.d
            @Override // zj.l
            public final Object a(i iVar) {
                return g.d(t10, iVar);
            }
        }).d();
    }

    public static <T> g<T> p(final T t10, k0<T> k0Var) {
        return r(k0Var).f(new l() { // from class: zj.c
            @Override // zj.l
            public final Object a(i iVar) {
                return g.e(t10, iVar);
            }
        }).d();
    }

    public static <T> b<T> q(Class<T> cls) {
        return f(cls).g();
    }

    public static <T> b<T> r(k0<T> k0Var) {
        return h(k0Var).g();
    }

    @Deprecated
    public static <T> g<T> w(Class<T> cls, final T t10) {
        return f(cls).f(new l() { // from class: zj.e
            @Override // zj.l
            public final Object a(i iVar) {
                return g.b(t10, iVar);
            }
        }).d();
    }

    @SafeVarargs
    public static <T> g<T> x(final T t10, Class<T> cls, Class<? super T>... clsArr) {
        return g(cls, clsArr).f(new l() { // from class: zj.f
            @Override // zj.l
            public final Object a(i iVar) {
                return g.a(t10, iVar);
            }
        }).d();
    }

    @SafeVarargs
    public static <T> g<T> y(final T t10, k0<T> k0Var, k0<? super T>... k0VarArr) {
        return i(k0Var, k0VarArr).f(new l() { // from class: zj.b
            @Override // zj.l
            public final Object a(i iVar) {
                return g.c(t10, iVar);
            }
        }).d();
    }

    public Set<w> j() {
        return this.f161927c;
    }

    public l<T> k() {
        return this.f161930f;
    }

    @Nullable
    public String l() {
        return this.f161925a;
    }

    public Set<k0<? super T>> m() {
        return this.f161926b;
    }

    public Set<Class<?>> n() {
        return this.f161931g;
    }

    public boolean s() {
        return this.f161928d == 1;
    }

    public boolean t() {
        return this.f161928d == 2;
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f161926b.toArray()) + ">{" + this.f161928d + ", type=" + this.f161929e + ", deps=" + Arrays.toString(this.f161927c.toArray()) + "}";
    }

    public boolean u() {
        return this.f161928d == 0;
    }

    public boolean v() {
        return this.f161929e == 0;
    }

    public g<T> z(l<T> lVar) {
        return new g<>(this.f161925a, this.f161926b, this.f161927c, this.f161928d, this.f161929e, lVar, this.f161931g);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f161932a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Set<k0<? super T>> f161933b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Set<w> f161934c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f161935d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f161936e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public l<T> f161937f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Set<Class<?>> f161938g;

        @qj.a
        public b<T> b(w wVar) {
            j0.c(wVar, "Null dependency");
            k(wVar.d());
            this.f161934c.add(wVar);
            return this;
        }

        @qj.a
        public b<T> c() {
            return j(1);
        }

        public g<T> d() {
            j0.d(this.f161937f != null, "Missing required property: factory.");
            return new g<>(this.f161932a, new HashSet(this.f161933b), new HashSet(this.f161934c), this.f161935d, this.f161936e, this.f161937f, this.f161938g);
        }

        @qj.a
        public b<T> e() {
            return j(2);
        }

        @qj.a
        public b<T> f(l<T> lVar) {
            this.f161937f = (l) j0.c(lVar, "Null factory");
            return this;
        }

        @qj.a
        public final b<T> g() {
            this.f161936e = 1;
            return this;
        }

        public b<T> h(@NonNull String str) {
            this.f161932a = str;
            return this;
        }

        @qj.a
        public b<T> i(Class<?> cls) {
            this.f161938g.add(cls);
            return this;
        }

        @qj.a
        public final b<T> j(int i10) {
            j0.d(this.f161935d == 0, "Instantiation type has already been set.");
            this.f161935d = i10;
            return this;
        }

        public final void k(k0<?> k0Var) {
            j0.a(!this.f161933b.contains(k0Var), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        @SafeVarargs
        public b(Class<T> cls, Class<? super T>... clsArr) {
            this.f161932a = null;
            HashSet hashSet = new HashSet();
            this.f161933b = hashSet;
            this.f161934c = new HashSet();
            this.f161935d = 0;
            this.f161936e = 0;
            this.f161938g = new HashSet();
            j0.c(cls, "Null interface");
            hashSet.add(k0.b(cls));
            for (Class<? super T> cls2 : clsArr) {
                j0.c(cls2, "Null interface");
                this.f161933b.add(k0.b(cls2));
            }
        }

        @SafeVarargs
        public b(k0<T> k0Var, k0<? super T>... k0VarArr) {
            this.f161932a = null;
            HashSet hashSet = new HashSet();
            this.f161933b = hashSet;
            this.f161934c = new HashSet();
            this.f161935d = 0;
            this.f161936e = 0;
            this.f161938g = new HashSet();
            j0.c(k0Var, "Null interface");
            hashSet.add(k0Var);
            for (k0<? super T> k0Var2 : k0VarArr) {
                j0.c(k0Var2, "Null interface");
            }
            Collections.addAll(this.f161933b, k0VarArr);
        }
    }

    public g(@Nullable String str, Set<k0<? super T>> set, Set<w> set2, int i10, int i11, l<T> lVar, Set<Class<?>> set3) {
        this.f161925a = str;
        this.f161926b = Collections.unmodifiableSet(set);
        this.f161927c = Collections.unmodifiableSet(set2);
        this.f161928d = i10;
        this.f161929e = i11;
        this.f161930f = lVar;
        this.f161931g = Collections.unmodifiableSet(set3);
    }

    public static /* synthetic */ Object a(Object obj, i iVar) {
        return obj;
    }

    public static /* synthetic */ Object b(Object obj, i iVar) {
        return obj;
    }

    public static /* synthetic */ Object c(Object obj, i iVar) {
        return obj;
    }

    public static /* synthetic */ Object d(Object obj, i iVar) {
        return obj;
    }

    public static /* synthetic */ Object e(Object obj, i iVar) {
        return obj;
    }
}
