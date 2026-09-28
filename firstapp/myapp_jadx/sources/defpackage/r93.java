package defpackage;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.betsucc.presentation.viewmodel.BetSuccessViewModel", f = "BetSuccessViewModel.kt", l = {167}, m = "shouldShowNotificationDialog", v = 2)
public final class r93 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ u93 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r93(u93 u93Var, x1b x1bVar) {
        super(x1bVar);
        this.b = u93Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.z1(this);
    }
}
