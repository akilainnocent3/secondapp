package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class oj1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f153511b;

    public oj1(String str, float f10) {
        this.f153510a = str;
        this.f153511b = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oj1)) {
            return false;
        }
        oj1 oj1Var = (oj1) obj;
        return kotlin.jvm.internal.m0.g(this.f153510a, oj1Var.f153510a) && Float.compare(this.f153511b, oj1Var.f153511b) == 0;
    }

    public final int hashCode() {
        String str = this.f153510a;
        return Float.floatToIntBits(this.f153511b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "Media(htmlContent=" + this.f153510a + ", aspectRatio=" + this.f153511b + gi.j.f86771d;
    }
}
