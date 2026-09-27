package qv;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class h implements jv.s0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final or.j f122963b;

    public h(@oy.l or.j jVar) {
        this.f122963b = jVar;
    }

    @Override // jv.s0
    @oy.l
    public or.j getCoroutineContext() {
        return this.f122963b;
    }

    @oy.l
    public String toString() {
        return "CoroutineScope(coroutineContext=" + getCoroutineContext() + ')';
    }
}
