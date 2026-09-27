package ws;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public abstract class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public final String f143787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f143788b;

    public p1(@oy.l String name, boolean z10) {
        kotlin.jvm.internal.m0.p(name, "name");
        this.f143787a = name;
        this.f143788b = z10;
    }

    @oy.m
    public Integer a(@oy.l p1 visibility) {
        kotlin.jvm.internal.m0.p(visibility, "visibility");
        return o1.f143775a.a(this, visibility);
    }

    @oy.l
    public String b() {
        return this.f143787a;
    }

    public final boolean c() {
        return this.f143788b;
    }

    @oy.l
    public final String toString() {
        return b();
    }

    @oy.l
    public p1 d() {
        return this;
    }
}
