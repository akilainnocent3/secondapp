package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class lz0 implements nz0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f152226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f152227b;

    public lz0(String str, String str2) {
        this.f152226a = str;
        this.f152227b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lz0)) {
            return false;
        }
        lz0 lz0Var = (lz0) obj;
        return kotlin.jvm.internal.m0.g(this.f152226a, lz0Var.f152226a) && kotlin.jvm.internal.m0.g(this.f152227b, lz0Var.f152227b);
    }

    public final int hashCode() {
        return this.f152227b.hashCode() + (this.f152226a.hashCode() * 31);
    }

    public final String toString() {
        return "AdUnitId(pageId=" + this.f152226a + ", impId=" + this.f152227b + gi.j.f86771d;
    }
}
