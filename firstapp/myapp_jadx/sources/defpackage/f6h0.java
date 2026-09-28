package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.transaction.data.repository.TxLastDayRangeSettingRepositoryImpl", f = "TxLastDayRangeSettingRepositoryImpl.kt", l = {29}, m = "getSetting", v = 2)
public final class f6h0 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ g6h0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f6h0(g6h0 g6h0Var, x1b x1bVar) {
        super(x1bVar);
        this.b = g6h0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
