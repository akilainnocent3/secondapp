package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class oo3 implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f153578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ko3 f153579c;

    public oo3(int i10, ko3 ko3Var) {
        this.f153578b = i10;
        this.f153579c = ko3Var;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f153578b, ((oo3) obj).f153578b);
    }
}
