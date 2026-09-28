package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.data.repository.ScheduledFootballRepoImpl", f = "ScheduledFootballRepoImpl.kt", l = {104}, m = "getHeadToHeadStats-0E7RQCE", v = 2)
public final class tf70 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ mg70 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tf70(mg70 mg70Var, x1b x1bVar) {
        super(x1bVar);
        this.b = mg70Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objE = this.b.e(null, null, this);
        return objE == y5b.a ? objE : new zi50(objE);
    }
}
