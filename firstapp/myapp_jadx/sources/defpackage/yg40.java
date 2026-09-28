package defpackage;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.betslip.recentcode.repo.RecentCodeRepoImpl", f = "RecentCodeRepoImpl.kt", l = {49, 50}, m = "getRecentBookingCodes", v = 2)
public final class yg40 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ xg40 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yg40(xg40 xg40Var, x1b x1bVar) {
        super(x1bVar);
        this.b = xg40Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
