package ov;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class b0<T> implements or.f<T>, rr.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final or.f<T> f119853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public final or.j f119854c;

    /* JADX WARN: Multi-variable type inference failed */
    public b0(@oy.l or.f<? super T> fVar, @oy.l or.j jVar) {
        this.f119853b = fVar;
        this.f119854c = jVar;
    }

    @Override // rr.e
    @oy.m
    public rr.e getCallerFrame() {
        or.f<T> fVar = this.f119853b;
        if (fVar instanceof rr.e) {
            return (rr.e) fVar;
        }
        return null;
    }

    @Override // or.f
    @oy.l
    public or.j getContext() {
        return this.f119854c;
    }

    @Override // rr.e
    @oy.m
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // or.f
    public void resumeWith(@oy.l Object obj) {
        this.f119853b.resumeWith(obj);
    }
}
