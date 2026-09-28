package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.welcomereward.presentation.mapper.WelcomeRewardUiStateMapper", f = "WelcomeRewardUiStateMapper.kt", l = {56}, m = "mapBannerState", v = 2)
public final class p4j0 extends x1b {
    public int a;
    public int b;
    public int c;
    public int d;
    public float e;
    public /* synthetic */ Object f;
    public final /* synthetic */ n4j0 i;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4j0(n4j0 n4j0Var, x1b x1bVar) {
        super(x1bVar);
        this.i = n4j0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.v |= Integer.MIN_VALUE;
        return this.i.d(null, this);
    }
}
