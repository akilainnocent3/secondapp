package mj;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import zi.l0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@d
public abstract class n<T> extends m<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TypeVariable<?> f107551b;

    public n() {
        Type typeD = d();
        l0.u(typeD instanceof TypeVariable, "%s should be a type variable.", typeD);
        this.f107551b = (TypeVariable) typeD;
    }

    public final boolean equals(@zq.a Object o10) {
        if (o10 instanceof n) {
            return this.f107551b.equals(((n) o10).f107551b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f107551b.hashCode();
    }

    public String toString() {
        return this.f107551b.toString();
    }
}
