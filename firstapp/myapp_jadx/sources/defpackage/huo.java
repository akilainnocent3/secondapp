package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.uiprocess.InsufficientFundsUiProcess", f = "InsufficientFundsUiProcess.kt", l = {38}, m = "invoke", v = 2)
public final class huo extends x1b {
    public kuo a;
    public m67 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ iuo d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public huo(iuo iuoVar, x1b x1bVar) {
        super(x1bVar);
        this.d = iuoVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, null, this);
    }
}
