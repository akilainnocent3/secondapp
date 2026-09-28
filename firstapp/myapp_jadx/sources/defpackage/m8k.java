package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.usecase.GetMaxPendingDepositsUseCase", f = "GetMaxPendingDepositsUseCase.kt", l = {24}, m = "invoke", v = 2)
public final class m8k extends x1b {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ n8k c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m8k(n8k n8kVar, x1b x1bVar) {
        super(x1bVar);
        this.c = n8kVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(0, 0, this);
    }
}
