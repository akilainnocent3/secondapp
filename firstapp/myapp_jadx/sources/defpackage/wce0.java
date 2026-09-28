package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.account.latam.common.domain.SubmitLatamEmailRegisterUseCase", f = "SubmitLatamEmailRegisterUseCase.kt", l = {57}, m = "invoke", v = 2)
public final class wce0 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ vce0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wce0(vce0 vce0Var, x1b x1bVar) {
        super(x1bVar);
        this.b = vce0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, null, null, null, null, null, null, this);
    }
}
