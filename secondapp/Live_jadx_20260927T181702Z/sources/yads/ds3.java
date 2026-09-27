package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ds3 extends kotlin.jvm.internal.o0 implements ds.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gs3 f148344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f148345c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ds3(gs3 gs3Var, String str) {
        super(0);
        this.f148344b = gs3Var;
        this.f148345c = str;
    }

    @Override // ds.a
    public final Object invoke() {
        this.f148344b.f149765a.onError(this.f148345c);
        return dr.w2.f79517a;
    }
}
