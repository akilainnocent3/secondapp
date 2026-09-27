package k8;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public final j8.p f102113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final String f102114b;

    public q0(@oy.l j8.p buyer, @oy.l String name) {
        kotlin.jvm.internal.m0.p(buyer, "buyer");
        kotlin.jvm.internal.m0.p(name, "name");
        this.f102113a = buyer;
        this.f102114b = name;
    }

    @oy.l
    public final j8.p a() {
        return this.f102113a;
    }

    @oy.l
    public final String b() {
        return this.f102114b;
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return kotlin.jvm.internal.m0.g(this.f102113a, q0Var.f102113a) && kotlin.jvm.internal.m0.g(this.f102114b, q0Var.f102114b);
    }

    public int hashCode() {
        return (this.f102113a.hashCode() * 31) + this.f102114b.hashCode();
    }

    @oy.l
    public String toString() {
        return "LeaveCustomAudience: buyer=" + this.f102113a + ", name=" + this.f102114b;
    }
}
