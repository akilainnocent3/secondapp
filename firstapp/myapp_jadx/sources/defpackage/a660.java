package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportygames.rush.view.RushFragment", f = "RushFragment.kt", l = {2916}, m = "resetCarAndCoeff", v = 1)
public final class a660 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ l560 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a660(l560 l560Var, x1b x1bVar) {
        super(x1bVar);
        this.b = l560Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.X0(this);
    }
}
