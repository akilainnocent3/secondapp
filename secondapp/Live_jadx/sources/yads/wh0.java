package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class wh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xh0 f157386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f157387b;

    public wh0(xh0 xh0Var, String str) {
        this.f157386a = xh0Var;
        this.f157387b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wh0)) {
            return false;
        }
        wh0 wh0Var = (wh0) obj;
        return this.f157386a == wh0Var.f157386a && kotlin.jvm.internal.m0.g(this.f157387b, wh0Var.f157387b);
    }

    public final int hashCode() {
        return this.f157387b.hashCode() + (this.f157386a.hashCode() * 31);
    }

    public final String toString() {
        return "DivKitAsset(type=" + this.f157386a + ", assetName=" + this.f157387b + gi.j.f86771d;
    }
}
