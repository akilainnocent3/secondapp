package jv;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class n2 extends u2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @oy.l
    public final ds.l<Throwable, dr.w2> f100844f;

    /* JADX WARN: Multi-variable type inference failed */
    public n2(@oy.l ds.l<? super Throwable, dr.w2> lVar) {
        this.f100844f = lVar;
    }

    @Override // jv.u2
    public boolean D() {
        return false;
    }

    @Override // jv.u2
    public void E(@oy.m Throwable th2) {
        this.f100844f.invoke(th2);
    }
}
