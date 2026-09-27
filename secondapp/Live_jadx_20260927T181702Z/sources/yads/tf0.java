package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class tf0 extends kotlin.jvm.internal.o0 implements ds.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jv.n f155870b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tf0(jv.p pVar) {
        super(1);
        this.f155870b = pVar;
    }

    @Override // ds.l
    public final Object invoke(Object obj) {
        Throwable th2 = (Throwable) obj;
        if (this.f155870b.isActive()) {
            jv.n nVar = this.f155870b;
            dr.i1.a aVar = dr.i1.f79460c;
            nVar.resumeWith(dr.i1.b(dr.j1.a(th2)));
        }
        return dr.w2.f79517a;
    }
}
