package yads;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class u5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v5 f156276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f156277b;

    public u5(v5 v5Var, Map map) {
        this.f156276a = v5Var;
        this.f156277b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u5)) {
            return false;
        }
        u5 u5Var = (u5) obj;
        return this.f156276a == u5Var.f156276a && kotlin.jvm.internal.m0.g(this.f156277b, u5Var.f156277b);
    }

    public final int hashCode() {
        return this.f156277b.hashCode() + (this.f156276a.hashCode() * 31);
    }

    public final String toString() {
        return "AdLoadingPhase(adLoadingPhaseType=" + this.f156276a + ", reportParameters=" + this.f156277b + gi.j.f86771d;
    }
}
