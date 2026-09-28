package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.liveoddsboost.data.OddsBoostRepositoryImpl", f = "OddsBoostRepositoryImpl.kt", l = {30}, m = "getOddsBoostFlashRtpRatios", v = 2)
public final class jgy extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ mgy b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jgy(mgy mgyVar, x1b x1bVar) {
        super(x1bVar);
        this.b = mgyVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.e(this);
    }
}
