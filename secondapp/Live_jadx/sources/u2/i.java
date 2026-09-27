package u2;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class i<T> extends p0<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f137629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f137630c;

    public i(T t10, int i10, int i11) {
        super(i11, null);
        this.f137629b = t10;
        this.f137630c = i10;
    }

    public final void b() {
        T t10 = this.f137629b;
        if ((t10 != null ? t10.hashCode() : 0) != this.f137630c) {
            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
        }
    }

    public final int c() {
        return this.f137630c;
    }

    public final T d() {
        return this.f137629b;
    }
}
