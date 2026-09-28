package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.ugpay.data.DepositBountyConfigRepositoryImpl", f = "DepositBountyConfigRepositoryImpl.kt", l = {129}, m = "getDepositBountyConfigs", v = 2)
public final class bsd extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ dsd b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bsd(dsd dsdVar, x1b x1bVar) {
        super(x1bVar);
        this.b = dsdVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
