package yads;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class w80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v80 f157233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f157234b;

    public w80(v80 v80Var, List list) {
        this.f157233a = v80Var;
        this.f157234b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w80)) {
            return false;
        }
        w80 w80Var = (w80) obj;
        return this.f157233a == w80Var.f157233a && kotlin.jvm.internal.m0.g(this.f157234b, w80Var.f157234b);
    }

    public final int hashCode() {
        int iHashCode = this.f157233a.hashCode() * 31;
        List list = this.f157234b;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "DebugPanelSdkIntegrationStatusData(status=" + this.f157233a + ", messages=" + this.f157234b + gi.j.f86771d;
    }
}
