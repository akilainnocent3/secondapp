package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.basepay.viewModel.GlobalWithdrawViewModel", f = "GlobalWithdrawViewModel.kt", l = {178}, m = "loadAccountInfoIfNeeded", v = 2)
public final class l3l extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ h3l b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3l(h3l h3lVar, x1b x1bVar) {
        super(x1bVar);
        this.b = h3lVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.y1(this);
    }
}
