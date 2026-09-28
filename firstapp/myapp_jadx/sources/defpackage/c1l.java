package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.basepay.viewModel.GlobalDepositViewModel", f = "GlobalDepositViewModel.kt", l = {221}, m = "loadAccountInfoIfNeeded", v = 2)
public final class c1l extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ a1l b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1l(a1l a1lVar, x1b x1bVar) {
        super(x1bVar);
        this.b = a1lVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.z1(this);
    }
}
