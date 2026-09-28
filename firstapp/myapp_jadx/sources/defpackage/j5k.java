package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.usecase.GetDepositHistoryStatusUseCase", f = "GetDepositHistoryStatusUseCase.kt", l = {14}, m = "invoke-IoAF18A", v = 2)
public final class j5k extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ k5k b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5k(k5k k5kVar, x1b x1bVar) {
        super(x1bVar);
        this.b = k5kVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objA = this.b.a(this);
        return objA == y5b.a ? objA : new zi50(objA);
    }
}
