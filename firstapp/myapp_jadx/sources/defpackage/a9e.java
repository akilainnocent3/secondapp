package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.uiprocess.DepositUiProcess", f = "DepositUiProcess.kt", l = {384, 392, 399, 402}, m = "processVerifyInWebView", v = 2)
public final class a9e extends x1b {
    public String a;
    public Object b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ f9e e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a9e(f9e f9eVar, x1b x1bVar) {
        super(x1bVar);
        this.e = f9eVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.i(0, this, null, null);
    }
}
