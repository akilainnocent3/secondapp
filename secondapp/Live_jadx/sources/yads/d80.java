package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class d80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f148092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f148093b;

    public d80(String str, String str2) {
        this.f148092a = str;
        this.f148093b = str2;
    }

    public final String a() {
        return this.f148092a;
    }

    public final String b() {
        return this.f148093b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d80)) {
            return false;
        }
        d80 d80Var = (d80) obj;
        return kotlin.jvm.internal.m0.g(this.f148092a, d80Var.f148092a) && kotlin.jvm.internal.m0.g(this.f148093b, d80Var.f148093b);
    }

    public final int hashCode() {
        return this.f148093b.hashCode() + (this.f148092a.hashCode() * 31);
    }

    public final String toString() {
        return "DebugPanelMediationAdapterParameterData(name=" + this.f148092a + ", value=" + this.f148093b + gi.j.f86771d;
    }
}
