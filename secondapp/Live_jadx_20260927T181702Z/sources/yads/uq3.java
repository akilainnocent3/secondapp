package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class uq3 extends kotlin.jvm.internal.o0 implements ds.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wq3 f156558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f156559c = "Cannot load bidder token. Token generation failed";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uq3(wq3 wq3Var) {
        super(0);
        this.f156558b = wq3Var;
    }

    @Override // ds.a
    public final Object invoke() {
        this.f156558b.f157483a.onBidderTokenFailedToLoad(this.f156559c);
        return dr.w2.f79517a;
    }
}
