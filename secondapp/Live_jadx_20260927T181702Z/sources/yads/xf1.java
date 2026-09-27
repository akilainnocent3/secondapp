package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class xf1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v22 f157839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v9 f157840b;

    public xf1(v22 v22Var, v9 v9Var) {
        this.f157839a = v22Var;
        this.f157840b = v9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xf1)) {
            return false;
        }
        xf1 xf1Var = (xf1) obj;
        return kotlin.jvm.internal.m0.g(this.f157839a, xf1Var.f157839a) && kotlin.jvm.internal.m0.g(this.f157840b, xf1Var.f157840b);
    }

    public final int hashCode() {
        return this.f157840b.hashCode() + (this.f157839a.hashCode() * 31);
    }

    public final String toString() {
        return "LoadedFeedItem(sliderAd=" + this.f157839a + ", adResponse=" + this.f157840b + gi.j.f86771d;
    }
}
