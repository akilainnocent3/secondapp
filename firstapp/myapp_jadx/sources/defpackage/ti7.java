package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.account.resetpassword.domain.usecase.CheckIsPasswordResetForcedUseCase", f = "CheckIsPasswordResetForcedUseCase.kt", l = {10}, m = "invoke", v = 2)
public final class ti7 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ ui7 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ti7(ui7 ui7Var, x1b x1bVar) {
        super(x1bVar);
        this.b = ui7Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
