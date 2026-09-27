package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ks3 extends kotlin.jvm.internal.o0 implements ds.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ms3 f151671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qr3 f151672c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ks3(ms3 ms3Var, qr3 qr3Var) {
        super(0);
        this.f151671b = ms3Var;
        this.f151672c = qr3Var;
    }

    @Override // ds.a
    public final Object invoke() {
        this.f151671b.f152662a.onInstreamAdLoaded(this.f151672c);
        return dr.w2.f79517a;
    }
}
