package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class ao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a03 f146875a;

    public ao(a03 a03Var) {
        this.f146875a = a03Var;
    }

    public final a03 a() {
        return this.f146875a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ao) && kotlin.jvm.internal.m0.g(((ao) obj).f146875a, this.f146875a);
    }

    public final int hashCode() {
        return this.f146875a.hashCode();
    }

    public final String toString() {
        return this.f146875a.toString();
    }
}
