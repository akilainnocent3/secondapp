package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.account.register.presentation.br.BrRegistrationSuccessfulViewModel", f = "BrRegistrationSuccessfulViewModel.kt", l = {254}, m = "progressLabel", v = 2)
public final class k95 extends x1b {
    public yvv a;
    public /* synthetic */ Object b;
    public final /* synthetic */ d95 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k95(d95 d95Var, x1b x1bVar) {
        super(x1bVar);
        this.c = d95Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        int i = d95.B;
        return this.c.A1(null, null, 0.0d, this);
    }
}
