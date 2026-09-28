package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.timeAlert.uc.SaveTimeAlertUseCase", f = "SaveTimeAlertUseCase.kt", l = {12, 13}, m = "invoke", v = 2)
public final class zs60 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ sh20 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zs60(sh20 sh20Var, x1b x1bVar) {
        super(x1bVar);
        this.b = sh20Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, this);
    }
}
