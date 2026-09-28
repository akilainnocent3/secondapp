package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.uiprocess.DepositUiProcess", f = "DepositUiProcess.kt", l = {442, 449, 459, 467}, m = "processConfirmCompleted", v = 2)
public final class u8e extends x1b {
    public ssa a;
    public /* synthetic */ Object b;
    public final /* synthetic */ f9e c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u8e(f9e f9eVar, x1b x1bVar) {
        super(x1bVar);
        this.c = f9eVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(null, this);
    }
}
