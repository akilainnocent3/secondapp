package defpackage;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.piggybash.presentation.viewmodel.PiggyBashViewModel", f = "PiggyBashViewModel.kt", l = {558, 559, 560, 562}, m = "onRoundFinishedWithNavigation", v = 1)
public final class ny00 extends x1b {
    public ap20 a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ vx00 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ny00(vx00 vx00Var, x1b x1bVar) {
        super(x1bVar);
        this.d = vx00Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.D1(null, this);
    }
}
