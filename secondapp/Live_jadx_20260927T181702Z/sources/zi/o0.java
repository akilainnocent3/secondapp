package zi;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@yi.b
@k
public final class o0<T> extends g0<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f161786d = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final T f161787c;

    public o0(T reference) {
        this.f161787c = reference;
    }

    @Override // zi.g0
    public boolean equals(@zq.a Object object) {
        if (object instanceof o0) {
            return this.f161787c.equals(((o0) object).f161787c);
        }
        return false;
    }

    @Override // zi.g0
    public Set<T> g() {
        return Collections.singleton(this.f161787c);
    }

    @Override // zi.g0
    public int hashCode() {
        return this.f161787c.hashCode() + 1502476572;
    }

    @Override // zi.g0
    public T i() {
        return this.f161787c;
    }

    @Override // zi.g0
    public boolean j() {
        return true;
    }

    @Override // zi.g0
    public T l(T defaultValue) {
        l0.F(defaultValue, "use Optional.orNull() instead of Optional.or(null)");
        return this.f161787c;
    }

    @Override // zi.g0
    public T m(u0<? extends T> supplier) {
        l0.E(supplier);
        return this.f161787c;
    }

    @Override // zi.g0
    public g0<T> n(g0<? extends T> secondChoice) {
        l0.E(secondChoice);
        return this;
    }

    @Override // zi.g0
    public T o() {
        return this.f161787c;
    }

    @Override // zi.g0
    public <V> g0<V> q(t<? super T, V> tVar) {
        return new o0(l0.F(tVar.apply(this.f161787c), "the Function passed to Optional.transform() must not return null."));
    }

    @Override // zi.g0
    public String toString() {
        return "Optional.of(" + this.f161787c + gi.j.f86771d;
    }
}
