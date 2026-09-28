package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.account.resetpassword.presentation.ResetPasswordViewModel", f = "ResetPasswordViewModel.kt", l = {214, 216}, m = "show2FAPromptIfNeed", v = 2)
public final class nd50 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ kd50 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nd50(kd50 kd50Var, x1b x1bVar) {
        super(x1bVar);
        this.b = kd50Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        int i = kd50.G;
        return this.b.A1(this);
    }
}
