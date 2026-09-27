package yads;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class oc3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nz0 f153440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f153441b;

    public oc3(lz0 lz0Var, Map map) {
        this.f153440a = lz0Var;
        this.f153441b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oc3)) {
            return false;
        }
        oc3 oc3Var = (oc3) obj;
        return kotlin.jvm.internal.m0.g(this.f153440a, oc3Var.f153440a) && kotlin.jvm.internal.m0.g(this.f153441b, oc3Var.f153441b);
    }

    public final int hashCode() {
        return this.f153441b.hashCode() + (this.f153440a.hashCode() * 31);
    }

    public final String toString() {
        return "VastRequestConfig(getVastRequest=" + this.f153440a + ", parameters=" + this.f153441b + gi.j.f86771d;
    }
}
