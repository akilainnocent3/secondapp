package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class sg3 extends ug3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final be3 f155424a;

    public sg3(be3 be3Var) {
        super(0);
        this.f155424a = be3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sg3) && kotlin.jvm.internal.m0.g(this.f155424a, ((sg3) obj).f155424a);
    }

    public final int hashCode() {
        return this.f155424a.hashCode();
    }

    public final String toString() {
        return "Error(error=" + this.f155424a + gi.j.f86771d;
    }
}
