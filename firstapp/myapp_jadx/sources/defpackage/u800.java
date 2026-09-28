package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.paymentproviders.PaymentProvidersDelegate", f = "PaymentProvidersDelegate.kt", l = {76}, m = "refreshAvailableChannel", v = 2)
public final class u800 extends x1b {
    public f600 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ v800 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u800(v800 v800Var, x1b x1bVar) {
        super(x1bVar);
        this.c = v800Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(null, this);
    }
}
