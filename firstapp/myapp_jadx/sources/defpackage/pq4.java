package defpackage;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.bonuscup.presentation.BonusCupViewModel", f = "BonusCupViewModel.kt", l = {285}, m = "waitForLoadingAnimationCompletion", v = 1)
public final class pq4 extends x1b {
    public dm8 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ qq4 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pq4(qq4 qq4Var, x1b x1bVar) {
        super(x1bVar);
        this.c = qq4Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.B1(this);
    }
}
