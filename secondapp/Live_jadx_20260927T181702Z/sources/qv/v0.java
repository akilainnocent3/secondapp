package qv;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public class v0<T> extends jv.a<T> implements rr.e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oy.l
    @cs.g
    public final or.f<T> f123042e;

    /* JADX WARN: Multi-variable type inference failed */
    public v0(@oy.l or.j jVar, @oy.l or.f<? super T> fVar) {
        super(jVar, true, true);
        this.f123042e = fVar;
    }

    @Override // jv.a
    public void I1(@oy.m Object obj) {
        or.f<T> fVar = this.f123042e;
        fVar.resumeWith(jv.f0.a(obj, fVar));
    }

    @Override // jv.v2
    public final boolean Z0() {
        return true;
    }

    @Override // rr.e
    @oy.m
    public final rr.e getCallerFrame() {
        or.f<T> fVar = this.f123042e;
        if (fVar instanceof rr.e) {
            return (rr.e) fVar;
        }
        return null;
    }

    @Override // rr.e
    @oy.m
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // jv.v2
    public void k0(@oy.m Object obj) {
        n.d(qr.c.e(this.f123042e), jv.f0.a(obj, this.f123042e));
    }

    public void N1() {
    }
}
