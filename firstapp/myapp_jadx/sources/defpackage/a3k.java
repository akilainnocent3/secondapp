package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.usecase.GetAvailablePaymentChannelsUseCase", f = "GetAvailablePaymentChannelsUseCase.kt", l = {16}, m = "invoke-gIAlu-s", v = 2)
public final class a3k extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ b3k b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3k(b3k b3kVar, x1b x1bVar) {
        super(x1bVar);
        this.b = b3kVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objA = this.b.a(null, this);
        return objA == y5b.a ? objA : new zi50(objA);
    }
}
