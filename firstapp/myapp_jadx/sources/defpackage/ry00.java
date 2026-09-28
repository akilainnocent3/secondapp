package defpackage;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.piggybash.presentation.viewmodel.PiggyBashViewModel", f = "PiggyBashViewModel.kt", l = {343, 349}, m = "validateAndContinue", v = 1)
public final class ry00 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ vx00 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ry00(vx00 vx00Var, x1b x1bVar) {
        super(x1bVar);
        this.b = vx00Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.H1(this);
    }
}
