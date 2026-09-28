package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.stp.spei.withdraw.SpeiByStpWithdrawViewModel", f = "SpeiByStpWithdrawViewModel.kt", l = {377}, m = "processWithdrawal", v = 2)
public final class hxa0 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ zwa0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hxa0(zwa0 zwa0Var, x1b x1bVar) {
        super(x1bVar);
        this.b = zwa0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.z1(null, this);
    }
}
