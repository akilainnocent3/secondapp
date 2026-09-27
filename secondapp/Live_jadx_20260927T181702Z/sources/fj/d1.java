package fj;

import cj.y5;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@h0
public final class d1<E> extends y5<E> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zi.u0<Boolean> f84563c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set<E> f84564d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final zi.u0<String> f84565e;

    public d1(Set<E> delegate, zi.u0<Boolean> validator, zi.u0<String> errorMessage) {
        this.f84564d = delegate;
        this.f84563c = validator;
        this.f84565e = errorMessage;
    }

    public static final <E> d1<E> h2(Set<E> delegate, zi.u0<Boolean> validator, zi.u0<String> errorMessage) {
        return new d1<>((Set) zi.l0.E(delegate), (zi.u0) zi.l0.E(validator), (zi.u0) zi.l0.E(errorMessage));
    }

    @Override // cj.y5, cj.f5, cj.w5
    public Set<E> g2() {
        i2();
        return this.f84564d;
    }

    @Override // cj.y5, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.f84564d.hashCode();
    }

    public final void i2() {
        if (!this.f84563c.get().booleanValue()) {
            throw new IllegalStateException(this.f84565e.get());
        }
    }
}
