package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ll1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f152043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f152044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f152045c;

    public ll1(int i10, int i11, int i12) {
        this.f152043a = i10;
        this.f152044b = i11;
        this.f152045c = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ll1)) {
            return false;
        }
        ll1 ll1Var = (ll1) obj;
        return this.f152043a == ll1Var.f152043a && this.f152044b == ll1Var.f152044b && this.f152045c == ll1Var.f152045c;
    }

    public final int hashCode() {
        return this.f152045c + nd3.a(this.f152044b, this.f152043a * 31, 31);
    }

    public final String toString() {
        return "MediaFileInfo(width=" + this.f152043a + ", height=" + this.f152044b + ", bitrate=" + this.f152045c + gi.j.f86771d;
    }
}
