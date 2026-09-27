package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class tr3 extends kotlin.jvm.internal.o0 implements ds.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wr3 f156029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f156030c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tr3(wr3 wr3Var, String str) {
        super(0);
        this.f156029b = wr3Var;
        this.f156030c = str;
    }

    @Override // ds.a
    public final Object invoke() {
        this.f156029b.f157491a.onInstreamAdBreakError(this.f156030c);
        return dr.w2.f79517a;
    }
}
