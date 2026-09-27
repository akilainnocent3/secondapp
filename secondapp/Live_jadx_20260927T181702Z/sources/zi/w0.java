package zi;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@yi.b(emulated = true)
@k
public final class w0 {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @yi.e
    public static class a<T> implements u0<T>, Serializable {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final long f161877g = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public transient Object f161878b = new Object();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final u0<T> f161879c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f161880d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @zq.a
        public volatile transient T f161881e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public volatile transient long f161882f;

        public a(u0<T> delegate, long durationNanos) {
            this.f161879c = delegate;
            this.f161880d = durationNanos;
        }

        @yi.c
        @yi.d
        public final void c(ObjectInputStream in2) throws ClassNotFoundException, IOException {
            in2.defaultReadObject();
            this.f161878b = new Object();
        }

        @Override // zi.u0
        @i0
        public T get() {
            long j10 = this.f161882f;
            long jNanoTime = System.nanoTime();
            if (j10 == 0 || jNanoTime - j10 >= 0) {
                synchronized (this.f161878b) {
                    try {
                        if (j10 == this.f161882f) {
                            T t10 = this.f161879c.get();
                            this.f161881e = t10;
                            long j11 = jNanoTime + this.f161880d;
                            if (j11 == 0) {
                                j11 = 1;
                            }
                            this.f161882f = j11;
                            return t10;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            return (T) e0.a(this.f161881e);
        }

        public String toString() {
            return "Suppliers.memoizeWithExpiration(" + this.f161879c + ", " + this.f161880d + ", NANOS)";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @yi.e
    public static class b<T> implements u0<T>, Serializable {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final long f161883f = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public transient Object f161884b = new Object();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final u0<T> f161885c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public volatile transient boolean f161886d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @zq.a
        public transient T f161887e;

        public b(u0<T> delegate) {
            this.f161885c = (u0) l0.E(delegate);
        }

        @yi.c
        @yi.d
        private void c(ObjectInputStream in2) throws ClassNotFoundException, IOException {
            in2.defaultReadObject();
            this.f161884b = new Object();
        }

        @Override // zi.u0
        @i0
        public T get() {
            if (!this.f161886d) {
                synchronized (this.f161884b) {
                    try {
                        if (!this.f161886d) {
                            T t10 = this.f161885c.get();
                            this.f161887e = t10;
                            this.f161886d = true;
                            return t10;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            return (T) e0.a(this.f161887e);
        }

        public String toString() {
            Object obj;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Suppliers.memoize(");
            if (this.f161886d) {
                obj = "<supplier that returned " + this.f161887e + ">";
            } else {
                obj = this.f161885c;
            }
            sb2.append(obj);
            sb2.append(gi.j.f86771d);
            return sb2.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @yi.e
    public static class c<T> implements u0<T> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final u0<Void> f161888e = new u0() { // from class: zi.x0
            @Override // zi.u0
            public final Object get() {
                return w0.c.c();
            }
        };

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f161889b = new Object();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public volatile u0<T> f161890c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @zq.a
        public T f161891d;

        public c(u0<T> delegate) {
            this.f161890c = (u0) l0.E(delegate);
        }

        public static /* synthetic */ Void c() {
            throw new IllegalStateException();
        }

        @Override // zi.u0
        @i0
        public T get() {
            u0<T> u0Var = this.f161890c;
            u0<T> u0Var2 = (u0<T>) f161888e;
            if (u0Var != u0Var2) {
                synchronized (this.f161889b) {
                    try {
                        if (this.f161890c != u0Var2) {
                            T t10 = this.f161890c.get();
                            this.f161891d = t10;
                            this.f161890c = u0Var2;
                            return t10;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            return (T) e0.a(this.f161891d);
        }

        public String toString() {
            Object obj = this.f161890c;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Suppliers.memoize(");
            if (obj == f161888e) {
                obj = "<supplier that returned " + this.f161891d + ">";
            }
            sb2.append(obj);
            sb2.append(gi.j.f86771d);
            return sb2.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class d<F, T> implements u0<T>, Serializable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final long f161892d = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final t<? super F, T> f161893b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final u0<F> f161894c;

        public d(t<? super F, T> function, u0<F> supplier) {
            this.f161893b = (t) l0.E(function);
            this.f161894c = (u0) l0.E(supplier);
        }

        public boolean equals(@zq.a Object obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (this.f161893b.equals(dVar.f161893b) && this.f161894c.equals(dVar.f161894c)) {
                    return true;
                }
            }
            return false;
        }

        @Override // zi.u0
        @i0
        public T get() {
            return this.f161893b.apply(this.f161894c.get());
        }

        public int hashCode() {
            return f0.b(this.f161893b, this.f161894c);
        }

        public String toString() {
            return "Suppliers.compose(" + this.f161893b + ", " + this.f161894c + gi.j.f86771d;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface e<T> extends t<u0<T>, T> {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum f implements e<Object> {
        INSTANCE;

        @Override // zi.t
        @zq.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Object apply(u0<Object> input) {
            return input.get();
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Suppliers.supplierFunction()";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class g<T> implements u0<T>, Serializable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final long f161897c = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @i0
        public final T f161898b;

        public g(@i0 T instance) {
            this.f161898b = instance;
        }

        public boolean equals(@zq.a Object obj) {
            if (obj instanceof g) {
                return f0.a(this.f161898b, ((g) obj).f161898b);
            }
            return false;
        }

        @Override // zi.u0
        @i0
        public T get() {
            return this.f161898b;
        }

        public int hashCode() {
            return f0.b(this.f161898b);
        }

        public String toString() {
            return "Suppliers.ofInstance(" + this.f161898b + gi.j.f86771d;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @yi.d
    public static class h<T> implements u0<T>, Serializable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final long f161899c = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final u0<T> f161900b;

        public h(u0<T> delegate) {
            this.f161900b = (u0) l0.E(delegate);
        }

        @Override // zi.u0
        @i0
        public T get() {
            T t10;
            synchronized (this.f161900b) {
                t10 = this.f161900b.get();
            }
            return t10;
        }

        public String toString() {
            return "Suppliers.synchronizedSupplier(" + this.f161900b + gi.j.f86771d;
        }
    }

    public static <F, T> u0<T> a(t<? super F, T> function, u0<F> supplier) {
        return new d(function, supplier);
    }

    public static <T> u0<T> b(u0<T> delegate) {
        if ((delegate instanceof c) || (delegate instanceof b)) {
            return delegate;
        }
        return delegate instanceof Serializable ? new b(delegate) : new c(delegate);
    }

    public static <T> u0<T> c(u0<T> delegate, long duration, TimeUnit unit) {
        l0.E(delegate);
        l0.t(duration > 0, "duration (%s %s) must be > 0", duration, unit);
        return new a(delegate, unit.toNanos(duration));
    }

    @yi.c
    @yi.d
    @w
    public static <T> u0<T> d(u0<T> delegate, Duration duration) {
        l0.E(delegate);
        l0.u((duration.isNegative() || duration.isZero()) ? false : true, "duration (%s) must be > 0", duration);
        return new a(delegate, z.a(duration));
    }

    public static <T> u0<T> e(@i0 T instance) {
        return new g(instance);
    }

    public static <T> t<u0<T>, T> f() {
        return f.INSTANCE;
    }

    @yi.d
    public static <T> u0<T> g(u0<T> delegate) {
        return new h(delegate);
    }
}
