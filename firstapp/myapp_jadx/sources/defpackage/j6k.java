package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.basepay.usecase.GetFirstDepositStatusUseCase", f = "GetFirstDepositStatusUseCase.kt", l = {11}, m = "invoke", v = 2)
public final class j6k extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ k6k b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6k(k6k k6kVar, x1b x1bVar) {
        super(x1bVar);
        this.b = k6kVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
