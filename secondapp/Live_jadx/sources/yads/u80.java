package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class u80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f156310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w80 f156311b;

    public u80(String str, w80 w80Var) {
        this.f156310a = str;
        this.f156311b = w80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u80)) {
            return false;
        }
        u80 u80Var = (u80) obj;
        return kotlin.jvm.internal.m0.g(this.f156310a, u80Var.f156310a) && kotlin.jvm.internal.m0.g(this.f156311b, u80Var.f156311b);
    }

    public final int hashCode() {
        return this.f156311b.hashCode() + (this.f156310a.hashCode() * 31);
    }

    public final String toString() {
        return "DebugPanelSdkIntegrationData(sdkVersion=" + this.f156310a + ", sdkIntegrationStatusData=" + this.f156311b + gi.j.f86771d;
    }
}
