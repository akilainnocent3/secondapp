package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class vq3 extends kotlin.jvm.internal.o0 implements ds.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wq3 f157065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f157066c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vq3(wq3 wq3Var, String str) {
        super(0);
        this.f157065b = wq3Var;
        this.f157066c = str;
    }

    @Override // ds.a
    public final Object invoke() {
        this.f157065b.f157483a.onBidderTokenLoaded(this.f157066c);
        return dr.w2.f79517a;
    }
}
