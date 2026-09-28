package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.liveoddsboost.domain.OddsBoostConfigurationManagerImpl", f = "OddsBoostConfigurationManagerImpl.kt", l = {52}, m = "refreshFlashBoostConfig", v = 2)
public final class vfy extends x1b {
    public wfy a;
    public /* synthetic */ Object b;
    public final /* synthetic */ wfy c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vfy(wfy wfyVar, x1b x1bVar) {
        super(x1bVar);
        this.c = wfyVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.d(this);
    }
}
