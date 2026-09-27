package yads;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class v70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f156801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m50 f156802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u80 f156803c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b40 f156804d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d50 f156805e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t50 f156806f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u70 f156807g;

    public v70(List list, m50 m50Var, u80 u80Var, b40 b40Var, d50 d50Var, t50 t50Var, u70 u70Var) {
        this.f156801a = list;
        this.f156802b = m50Var;
        this.f156803c = u80Var;
        this.f156804d = b40Var;
        this.f156805e = d50Var;
        this.f156806f = t50Var;
        this.f156807g = u70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v70)) {
            return false;
        }
        v70 v70Var = (v70) obj;
        return kotlin.jvm.internal.m0.g(this.f156801a, v70Var.f156801a) && kotlin.jvm.internal.m0.g(this.f156802b, v70Var.f156802b) && kotlin.jvm.internal.m0.g(this.f156803c, v70Var.f156803c) && kotlin.jvm.internal.m0.g(this.f156804d, v70Var.f156804d) && kotlin.jvm.internal.m0.g(this.f156805e, v70Var.f156805e) && kotlin.jvm.internal.m0.g(this.f156806f, v70Var.f156806f) && kotlin.jvm.internal.m0.g(this.f156807g, v70Var.f156807g);
    }

    public final int hashCode() {
        return this.f156807g.hashCode() + ((this.f156806f.hashCode() + eb.a(this.f156805e.f148074a, (this.f156804d.hashCode() + ((this.f156803c.hashCode() + ((this.f156802b.hashCode() + (this.f156801a.hashCode() * 31)) * 31)) * 31)) * 31, 31)) * 31);
    }

    public final String toString() {
        return "DebugPanelFeedData(alertsData=" + this.f156801a + ", appData=" + this.f156802b + ", sdkIntegrationData=" + this.f156803c + ", adNetworkSettingsData=" + this.f156804d + ", adaptersData=" + this.f156805e + ", consentsData=" + this.f156806f + ", debugErrorIndicatorData=" + this.f156807g + gi.j.f86771d;
    }
}
