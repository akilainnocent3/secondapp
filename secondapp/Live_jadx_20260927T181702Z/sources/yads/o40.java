package yads;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class o40 implements p40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ka0 f153349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f153350b;

    public o40(ka0 ka0Var, List list) {
        this.f153349a = ka0Var;
        this.f153350b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o40)) {
            return false;
        }
        o40 o40Var = (o40) obj;
        return kotlin.jvm.internal.m0.g(this.f153349a, o40Var.f153349a) && kotlin.jvm.internal.m0.g(this.f153350b, o40Var.f153350b);
    }

    public final int hashCode() {
        ka0 ka0Var = this.f153349a;
        return this.f153350b.hashCode() + ((ka0Var == null ? 0 : ka0Var.hashCode()) * 31);
    }

    public final String toString() {
        return "Waterfall(currency=" + this.f153349a + ", cpmFloors=" + this.f153350b + gi.j.f86771d;
    }
}
