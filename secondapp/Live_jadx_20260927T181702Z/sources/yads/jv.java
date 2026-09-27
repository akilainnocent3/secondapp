package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class jv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f151268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f151269b;

    public jv(int i10, String str) {
        this.f151268a = str;
        this.f151269b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jv)) {
            return false;
        }
        jv jvVar = (jv) obj;
        return kotlin.jvm.internal.m0.g(this.f151268a, jvVar.f151268a) && this.f151269b == jvVar.f151269b;
    }

    public final int hashCode() {
        return this.f151269b + (this.f151268a.hashCode() * 31);
    }

    public final String toString() {
        return "ClickQrcode(url=" + this.f151268a + ", sizeInPx=" + this.f151269b + gi.j.f86771d;
    }
}
