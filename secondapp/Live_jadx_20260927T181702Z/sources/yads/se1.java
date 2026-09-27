package yads;

import com.monetization.ads.nativeads.ExtendedNativeAdView;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class se1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f155395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f155396b = ExtendedNativeAdView.class;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zf0 f155397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ag0 f155398d;

    public se1(int i10, jy jyVar, ag0 ag0Var) {
        this.f155395a = i10;
        this.f155397c = jyVar;
        this.f155398d = ag0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof se1)) {
            return false;
        }
        se1 se1Var = (se1) obj;
        return this.f155395a == se1Var.f155395a && kotlin.jvm.internal.m0.g(this.f155396b, se1Var.f155396b) && kotlin.jvm.internal.m0.g(this.f155397c, se1Var.f155397c) && kotlin.jvm.internal.m0.g(this.f155398d, se1Var.f155398d);
    }

    public final int hashCode() {
        return this.f155398d.hashCode() + ((this.f155397c.hashCode() + ((this.f155396b.hashCode() + (this.f155395a * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "LayoutDesign(layoutId=" + this.f155395a + ", layoutViewClass=" + this.f155396b + ", designComponentBinder=" + this.f155397c + ", designConstraint=" + this.f155398d + gi.j.f86771d;
    }
}
