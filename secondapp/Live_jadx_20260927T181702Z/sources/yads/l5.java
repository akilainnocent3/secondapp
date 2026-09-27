package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class l5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f151867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f151868b;

    public l5(int i10, int i11) {
        this.f151867a = i10;
        this.f151868b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l5)) {
            return false;
        }
        l5 l5Var = (l5) obj;
        return this.f151867a == l5Var.f151867a && this.f151868b == l5Var.f151868b;
    }

    public final int hashCode() {
        return this.f151868b + (this.f151867a * 31);
    }

    public final String toString() {
        return "AdInfo(adGroupIndex=" + this.f151867a + ", adIndexInAdGroup=" + this.f151868b + gi.j.f86771d;
    }
}
