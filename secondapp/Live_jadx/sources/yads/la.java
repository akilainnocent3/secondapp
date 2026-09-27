package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class la {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f151908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f151909b;

    public la(int i10, int i11) {
        this.f151908a = i10;
        this.f151909b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof la)) {
            return false;
        }
        la laVar = (la) obj;
        return this.f151908a == laVar.f151908a && this.f151909b == laVar.f151909b;
    }

    public final int hashCode() {
        return this.f151909b + (this.f151908a * 31);
    }

    public final String toString() {
        return "AdSize(width=" + this.f151908a + ", height=" + this.f151909b + gi.j.f86771d;
    }
}
