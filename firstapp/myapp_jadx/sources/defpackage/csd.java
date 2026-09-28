package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.ugpay.data.DepositBountyConfigRepositoryImpl", f = "DepositBountyConfigRepositoryImpl.kt", l = {136}, m = "refresh", v = 2)
public final class csd extends x1b {
    public dsd a;
    public /* synthetic */ Object b;
    public final /* synthetic */ dsd c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csd(dsd dsdVar, x1b x1bVar) {
        super(x1bVar);
        this.c = dsdVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(this);
    }
}
