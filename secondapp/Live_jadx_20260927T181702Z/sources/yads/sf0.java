package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class sf0 extends kotlin.jvm.internal.o0 implements ds.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jv.n f155407b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sf0(jv.p pVar) {
        super(0);
        this.f155407b = pVar;
    }

    @Override // ds.a
    public final Object invoke() {
        if (this.f155407b.isActive()) {
            jv.n nVar = this.f155407b;
            dr.i1.a aVar = dr.i1.f79460c;
            nVar.resumeWith(dr.i1.b(dr.i1.a(dr.i1.b(dr.w2.f79517a))));
        }
        return dr.w2.f79517a;
    }
}
