package defpackage;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.virtualgame.VirtualGameViewModel", f = "VirtualGameViewModel.kt", l = {29}, m = "getVirtualInHouseGamePromotionBanner", v = 2)
public final class ifi0 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ jfi0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ifi0(jfi0 jfi0Var, x1b x1bVar) {
        super(x1bVar);
        this.b = jfi0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.x1(this);
    }
}
