package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.game.agent.SportyGameAgentImpl", f = "SportyGameAgentImpl.kt", l = {358}, m = "fetchFirstTimeDepositState", v = 2)
public final class job0 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ kob0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public job0(kob0 kob0Var, x1b x1bVar) {
        super(x1bVar);
        this.b = kob0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.n(this);
    }
}
