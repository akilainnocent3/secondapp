package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.CollapsibleContentScrollState", f = "LNBetListView.kt", l = {377}, m = "scrollListBy", v = 2)
public final class m38 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ l38 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m38(l38 l38Var, x1b x1bVar) {
        super(x1bVar);
        this.b = l38Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.c(0.0f, this);
    }
}
