package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.welcomereward.WelcomeRewardViewModel", f = "WelcomeRewardViewModel.kt", l = {615, 232, 240, 242, 247}, m = "handleBannerHide", v = 2)
public final class h5j0 extends x1b {
    public String a;
    public Object b;
    public w4j0 c;
    public long d;
    public long e;
    public /* synthetic */ Object f;
    public final /* synthetic */ w4j0 i;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5j0(w4j0 w4j0Var, x1b x1bVar) {
        super(x1bVar);
        this.i = w4j0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.v |= Integer.MIN_VALUE;
        return this.i.z1(0L, this, null);
    }
}
