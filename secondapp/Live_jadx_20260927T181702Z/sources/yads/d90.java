package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class d90 implements g90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y90 f148101a;

    public d90(y90 y90Var) {
        this.f148101a = y90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d90) && kotlin.jvm.internal.m0.g(this.f148101a, ((d90) obj).f148101a);
    }

    public final int hashCode() {
        return this.f148101a.hashCode();
    }

    public final String toString() {
        return "OnMediationNetworkClick(uiUnit=" + this.f148101a + gi.j.f86771d;
    }
}
