package defpackage;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.multilevel.sportycar.views.SportyCarFragment", f = "SportyCarFragment.kt", l = {1983}, m = "applySpineSingleDataSuspend", v = 1)
public final class amb0 extends x1b {
    public ytw a;
    public ytw b;
    public ytw c;
    public boolean d;
    public /* synthetic */ Object e;
    public final /* synthetic */ ylb0 f;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amb0(ylb0 ylb0Var, x1b x1bVar) {
        super(x1bVar);
        this.f = ylb0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.i |= Integer.MIN_VALUE;
        return this.f.v3(null, null, null, null, null, null, false, this);
    }
}
