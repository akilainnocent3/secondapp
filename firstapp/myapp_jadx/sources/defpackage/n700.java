package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.common.data.datastore.PaymentDataStoreImpl", f = "PaymentDataStoreImpl.kt", l = {183}, m = "setSportyBankHintRemainCount", v = 2)
public final class n700 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ d700 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n700(d700 d700Var, x1b x1bVar) {
        super(x1bVar);
        this.b = d700Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.o(0, this);
    }
}
