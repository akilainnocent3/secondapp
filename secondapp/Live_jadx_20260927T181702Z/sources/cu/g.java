package cu;

import kotlin.jvm.internal.m0;
import ou.g0;
import ws.i0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public abstract class g<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f77122a;

    public g(T t10) {
        this.f77122a = t10;
    }

    @oy.l
    public abstract g0 a(@oy.l i0 i0Var);

    public T b() {
        return this.f77122a;
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        T tB = b();
        g gVar = obj instanceof g ? (g) obj : null;
        return m0.g(tB, gVar != null ? gVar.b() : null);
    }

    public int hashCode() {
        T tB = b();
        if (tB != null) {
            return tB.hashCode();
        }
        return 0;
    }

    @oy.l
    public String toString() {
        return String.valueOf(b());
    }
}
