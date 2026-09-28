package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.pixBtg.domain.PixDepositStatusPollingUseCase", f = "PixDepositStatusPollingUseCase.kt", l = {49, 53}, m = "pollUntilFinalStatus-8Mi8wO0", v = 2)
public final class ce10 extends x1b {
    public String a;
    public long b;
    public long c;
    public /* synthetic */ Object d;
    public final /* synthetic */ yd10 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ce10(yd10 yd10Var, x1b x1bVar) {
        super(x1bVar);
        this.e = yd10Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.c(0L, this, null);
    }
}
