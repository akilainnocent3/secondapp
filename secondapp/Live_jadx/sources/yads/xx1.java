package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class xx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f158040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f158041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f158042c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f158043d;

    public xx1(int i10, int i11, int i12, int i13) {
        this.f158040a = i10;
        this.f158041b = i11;
        this.f158042c = i12;
        this.f158043d = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xx1)) {
            return false;
        }
        xx1 xx1Var = (xx1) obj;
        return this.f158040a == xx1Var.f158040a && this.f158041b == xx1Var.f158041b && this.f158042c == xx1Var.f158042c && this.f158043d == xx1Var.f158043d;
    }

    public final int hashCode() {
        return this.f158043d + nd3.a(this.f158042c, nd3.a(this.f158041b, this.f158040a * 31, 31), 31);
    }

    public final String toString() {
        return "MuteControlResources(mutedResourceId=" + this.f158040a + ", unmutedResourceId=" + this.f158041b + ", mutedContentDescriptionId=" + this.f158042c + ", unmutedContentDescriptionId=" + this.f158043d + gi.j.f86771d;
    }
}
