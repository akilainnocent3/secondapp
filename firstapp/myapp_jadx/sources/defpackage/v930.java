package defpackage;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode", f = "PullToRefresh.kt", l = {384}, m = "animateToHidden")
public final class v930 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ x930 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v930(x930 x930Var, x1b x1bVar) {
        super(x1bVar);
        this.b = x930Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.s2(this);
    }
}
