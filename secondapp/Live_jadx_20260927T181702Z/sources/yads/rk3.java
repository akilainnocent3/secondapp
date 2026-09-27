package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class rk3 extends kotlin.jvm.internal.o0 implements ds.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wk3 f155001b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rk3(wk3 wk3Var) {
        super(2);
        this.f155001b = wk3Var;
    }

    @Override // ds.p
    public final Object invoke(Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        if (qk3.f154501a[((z90) obj).ordinal()] == 1) {
            this.f155001b.f157425a.invoke(new c90(zBooleanValue));
        }
        return dr.w2.f79517a;
    }
}
