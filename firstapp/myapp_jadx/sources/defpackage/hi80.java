package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.passwordentry.impl.presentation.SetPasswordViewModel", f = "SetPasswordViewModel.kt", l = {139}, m = "registerComplete", v = 2)
public final class hi80 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ ii80 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hi80(ii80 ii80Var, x1b x1bVar) {
        super(x1bVar);
        this.b = ii80Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.x1(this);
    }
}
