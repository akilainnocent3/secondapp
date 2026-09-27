package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class gw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fw f149800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f149801b;

    public gw(fw fwVar, String str) {
        this.f149800a = fwVar;
        this.f149801b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gw)) {
            return false;
        }
        gw gwVar = (gw) obj;
        return this.f149800a == gwVar.f149800a && kotlin.jvm.internal.m0.g(this.f149801b, gwVar.f149801b);
    }

    public final int hashCode() {
        int iHashCode = this.f149800a.hashCode() * 31;
        String str = this.f149801b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "CloseButtonValue(type=" + this.f149800a + ", text=" + this.f149801b + gi.j.f86771d;
    }
}
