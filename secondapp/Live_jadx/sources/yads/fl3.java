package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class fl3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f149157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f149158b;

    public fl3(int i10, String str) {
        this.f149157a = str;
        this.f149158b = i10;
    }

    public final String a() {
        return this.f149157a;
    }

    public final int b() {
        return this.f149158b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fl3)) {
            return false;
        }
        fl3 fl3Var = (fl3) obj;
        return kotlin.jvm.internal.m0.g(this.f149157a, fl3Var.f149157a) && this.f149158b == fl3Var.f149158b;
    }

    public final int hashCode() {
        return this.f149158b + (this.f149157a.hashCode() * 31);
    }

    public final String toString() {
        return "ViewSizeKey(adUnitId=" + this.f149157a + ", screenOrientation=" + this.f149158b + gi.j.f86771d;
    }
}
