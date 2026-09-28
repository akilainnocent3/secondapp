package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.uiprocess.DepositUiProcess", f = "DepositUiProcess.kt", l = {249, 272, 281, 291}, m = "processNameConfirm", v = 2)
public final class x8e extends x1b {
    public ssa a;
    public String b;
    public ncx c;
    public /* synthetic */ Object d;
    public final /* synthetic */ f9e e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x8e(f9e f9eVar, x1b x1bVar) {
        super(x1bVar);
        this.e = f9eVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.f(null, this);
    }
}
