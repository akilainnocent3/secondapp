package defpackage;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.piggybash.data.datasource.PiggyBashWebSocketDataSource", f = "PiggyBashWebSocketDataSource.kt", l = {181}, m = "isConnected", v = 1)
public final class az00 extends x1b {
    public tuw a;
    public /* synthetic */ Object b;
    public final /* synthetic */ bz00 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public az00(bz00 bz00Var, x1b x1bVar) {
        super(x1bVar);
        this.c = bz00Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.f(this);
    }
}
