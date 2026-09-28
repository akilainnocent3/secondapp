package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.stp.domain.GetClabeBankAccountsUseCase", f = "GetClabeBankAccountsUseCase.kt", l = {13}, m = "invoke-gIAlu-s", v = 2)
public final class h4k extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ i4k b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4k(i4k i4kVar, x1b x1bVar) {
        super(x1bVar);
        this.b = i4kVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objA = this.b.a(0, this);
        return objA == y5b.a ? objA : new zi50(objA);
    }
}
