package nc;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class i<R> implements g<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j.a f116436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j<R> f116437b;

    public i(j.a aVar) {
        this.f116436a = aVar;
    }

    @Override // nc.g
    public f<R> a(tb.a aVar, boolean z10) {
        if (aVar == tb.a.MEMORY_CACHE || !z10) {
            return e.b();
        }
        if (this.f116437b == null) {
            this.f116437b = new j<>(this.f116436a);
        }
        return this.f116437b;
    }
}
