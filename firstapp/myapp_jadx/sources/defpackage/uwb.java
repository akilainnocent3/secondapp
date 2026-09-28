package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.stp.domain.CreateClabeBankAccountUseCase", f = "CreateClabeBankAccountUseCase.kt", l = {13}, m = "invoke-0E7RQCE", v = 2)
public final class uwb extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ vwb b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uwb(vwb vwbVar, x1b x1bVar) {
        super(x1bVar);
        this.b = vwbVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objA = this.b.a(null, null, this);
        return objA == y5b.a ? objA : new zi50(objA);
    }
}
