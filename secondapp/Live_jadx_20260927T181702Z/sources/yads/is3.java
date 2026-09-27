package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class is3 extends kotlin.jvm.internal.o0 implements ds.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ms3 f150794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f150795c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public is3(ms3 ms3Var, String str) {
        super(0);
        this.f150794b = ms3Var;
        this.f150795c = str;
    }

    @Override // ds.a
    public final Object invoke() {
        this.f150794b.f152662a.onInstreamAdFailedToLoad(this.f150795c);
        return dr.w2.f79517a;
    }
}
