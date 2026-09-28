package defpackage;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode", f = "PullToRefresh.kt", l = {345}, m = "onRelease")
public final class y930 extends x1b {
    public float a;
    public /* synthetic */ Object b;
    public final /* synthetic */ x930 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y930(x930 x930Var, x1b x1bVar) {
        super(x1bVar);
        this.c = x930Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.w2(0.0f, this);
    }
}
