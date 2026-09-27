package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class xl3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f157907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f157908b;

    public xl3(int i10, String str) {
        this.f157907a = i10;
        this.f157908b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xl3)) {
            return false;
        }
        xl3 xl3Var = (xl3) obj;
        return this.f157907a == xl3Var.f157907a && kotlin.jvm.internal.m0.g(this.f157908b, xl3Var.f157908b);
    }

    public final int hashCode() {
        int i10 = this.f157907a * 31;
        String str = this.f157908b;
        return i10 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "VisibleAreaResult(area=" + this.f157907a + ", description=" + this.f157908b + gi.j.f86771d;
    }
}
