package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class sf2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l5 f155408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ua1 f155409b;

    public sf2(l5 l5Var, ua1 ua1Var) {
        this.f155408a = l5Var;
        this.f155409b = ua1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sf2)) {
            return false;
        }
        sf2 sf2Var = (sf2) obj;
        return kotlin.jvm.internal.m0.g(this.f155408a, sf2Var.f155408a) && kotlin.jvm.internal.m0.g(this.f155409b, sf2Var.f155409b);
    }

    public final int hashCode() {
        return this.f155409b.hashCode() + (this.f155408a.hashCode() * 31);
    }

    public final String toString() {
        return "PlayingAdData(playingAdInfo=" + this.f155408a + ", playingVideoAd=" + this.f155409b + gi.j.f86771d;
    }
}
