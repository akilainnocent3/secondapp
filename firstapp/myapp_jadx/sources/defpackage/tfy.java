package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.liveoddsboost.domain.OddsBoostConfigurationManagerImpl", f = "OddsBoostConfigurationManagerImpl.kt", l = {38}, m = "refreshBoostRtpRatios", v = 2)
public final class tfy extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ wfy b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tfy(wfy wfyVar, x1b x1bVar) {
        super(x1bVar);
        this.b = wfyVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.l(this);
    }
}
