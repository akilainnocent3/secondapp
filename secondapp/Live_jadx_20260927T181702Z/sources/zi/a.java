package zi;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@yi.b
@k
public final class a<T> extends g0<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a<Object> f161611c = new a<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f161612d = 0;

    public static <T> g0<T> s() {
        return f161611c;
    }

    @Override // zi.g0
    public boolean equals(@zq.a Object object) {
        return object == this;
    }

    @Override // zi.g0
    public Set<T> g() {
        return Collections.EMPTY_SET;
    }

    @Override // zi.g0
    public int hashCode() {
        return 2040732332;
    }

    @Override // zi.g0
    public T i() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // zi.g0
    public boolean j() {
        return false;
    }

    @Override // zi.g0
    public T l(T t10) {
        return (T) l0.F(t10, "use Optional.orNull() instead of Optional.or(null)");
    }

    @Override // zi.g0
    public T m(u0<? extends T> u0Var) {
        return (T) l0.F(u0Var.get(), "use Optional.orNull() instead of a Supplier that returns null");
    }

    @Override // zi.g0
    public g0<T> n(g0<? extends T> secondChoice) {
        return (g0) l0.E(secondChoice);
    }

    @Override // zi.g0
    @zq.a
    public T o() {
        return null;
    }

    @Override // zi.g0
    public <V> g0<V> q(t<? super T, V> function) {
        l0.E(function);
        return g0.d();
    }

    public final Object r() {
        return f161611c;
    }

    @Override // zi.g0
    public String toString() {
        return "Optional.absent()";
    }
}
