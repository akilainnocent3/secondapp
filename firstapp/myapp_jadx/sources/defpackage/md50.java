package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.passwordentry.impl.presentation.ResetPasswordViewModel", f = "ResetPasswordViewModel.kt", l = {125}, m = "resetPassword", v = 2)
public final class md50 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ rd50 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public md50(rd50 rd50Var, x1b x1bVar) {
        super(x1bVar);
        this.b = rd50Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.y1(null, this);
    }
}
