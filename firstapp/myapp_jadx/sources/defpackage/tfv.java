package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.profile.me.providers.MeScreenRowsProvider", f = "MeScreenRowsProvider.kt", l = {447}, m = "fetchDailyStreakInfo", v = 2)
public final class tfv extends x1b {
    public dq40 a;
    public wwd0 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ qfv d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tfv(qfv qfvVar, x1b x1bVar) {
        super(x1bVar);
        this.d = qfvVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(this);
    }
}
