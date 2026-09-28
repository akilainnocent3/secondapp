package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.account.register.presentation.br.BrRegistrationSuccessfulViewModel", f = "BrRegistrationSuccessfulViewModel.kt", l = {113, 118}, m = "loadRegistrationLoyaltyContent", v = 2)
public final class g95 extends x1b {
    public boolean a;
    public qlw b;
    public /* synthetic */ Object c;
    public final /* synthetic */ d95 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g95(d95 d95Var, x1b x1bVar) {
        super(x1bVar);
        this.d = d95Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        int i = d95.B;
        return this.d.z1(false, this);
    }
}
