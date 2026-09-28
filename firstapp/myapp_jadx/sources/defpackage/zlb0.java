package defpackage;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.multilevel.sportycar.views.SportyCarFragment", f = "SportyCarFragment.kt", l = {266, 271, 277}, m = "applyLevelMultiplierSpinesSuspend", v = 1)
public final class zlb0 extends x1b {
    public int a;
    public int b;
    public ylb0.b c;
    public ylb0.a d;
    public ylb0.a e;
    public /* synthetic */ Object f;
    public final /* synthetic */ ylb0 i;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zlb0(ylb0 ylb0Var, x1b x1bVar) {
        super(x1bVar);
        this.i = ylb0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.v |= Integer.MIN_VALUE;
        return this.i.u3(0, null, this);
    }
}
