package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class rf2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k5 f154942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ua1 f154943b;

    public rf2(k5 k5Var, ua1 ua1Var) {
        this.f154942a = k5Var;
        this.f154943b = ua1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rf2)) {
            return false;
        }
        rf2 rf2Var = (rf2) obj;
        return kotlin.jvm.internal.m0.g(this.f154942a, rf2Var.f154942a) && kotlin.jvm.internal.m0.g(this.f154943b, rf2Var.f154943b);
    }

    public final int hashCode() {
        return this.f154943b.hashCode() + (this.f154942a.hashCode() * 31);
    }

    public final String toString() {
        return "PlayingAdData(playingAdInfo=" + this.f154942a + ", playingVideoAd=" + this.f154943b + gi.j.f86771d;
    }
}
