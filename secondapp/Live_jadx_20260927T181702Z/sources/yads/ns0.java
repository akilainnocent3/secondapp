package yads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ns0 extends ut0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v22 f153131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v9 f153132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f153133c;

    public ns0(v22 v22Var, v9 v9Var, ArrayList arrayList) {
        super(0);
        this.f153131a = v22Var;
        this.f153132b = v9Var;
        this.f153133c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ns0)) {
            return false;
        }
        ns0 ns0Var = (ns0) obj;
        return kotlin.jvm.internal.m0.g(this.f153131a, ns0Var.f153131a) && kotlin.jvm.internal.m0.g(this.f153132b, ns0Var.f153132b) && kotlin.jvm.internal.m0.g(this.f153133c, ns0Var.f153133c);
    }

    public final int hashCode() {
        return this.f153133c.hashCode() + ((this.f153132b.hashCode() + (this.f153131a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "FeedItem(sliderAd=" + this.f153131a + ", adResponse=" + this.f153132b + ", preloadedDivKitDesigns=" + this.f153133c + gi.j.f86771d;
    }
}
