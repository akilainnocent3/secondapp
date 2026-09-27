package jv;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class i3 extends u2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @oy.l
    public final or.f<dr.w2> f100812f;

    /* JADX WARN: Multi-variable type inference failed */
    public i3(@oy.l or.f<? super dr.w2> fVar) {
        this.f100812f = fVar;
    }

    @Override // jv.u2
    public boolean D() {
        return false;
    }

    @Override // jv.u2
    public void E(@oy.m Throwable th2) {
        or.f<dr.w2> fVar = this.f100812f;
        dr.i1.a aVar = dr.i1.f79460c;
        fVar.resumeWith(dr.i1.b(dr.w2.f79517a));
    }
}
