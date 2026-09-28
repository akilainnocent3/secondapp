package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.loyalty.impl.bettingstreak.data.repository.BettingStreakRepositoryImpl", f = "BettingStreakRepositoryImpl.kt", l = {38}, m = "getBettingStreakMetric", v = 2)
public final class h34 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ n34 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h34(n34 n34Var, x1b x1bVar) {
        super(x1bVar);
        this.b = n34Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.c(this);
    }
}
