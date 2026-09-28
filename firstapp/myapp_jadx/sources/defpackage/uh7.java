package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.security.graylist.presentation.uiprocess.CheckAuditStatusIsNormalUiProcess", f = "CheckAuditStatusIsNormalUiProcess.kt", l = {28}, m = "invoke", v = 2)
public final class uh7 extends x1b {
    public vtw a;
    public vtw b;
    public /* synthetic */ Object c;
    public final /* synthetic */ vh7 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uh7(vh7 vh7Var, x1b x1bVar) {
        super(x1bVar);
        this.d = vh7Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, null, this);
    }
}
