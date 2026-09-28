package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.rewardcenter.mission.presentation.LNMissionTabViewModel", f = "LNMissionTabViewModel.kt", l = {275}, m = "toContent", v = 2)
public final class wuq extends x1b {
    public ucn a;
    public /* synthetic */ Object b;
    public final /* synthetic */ tuq c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wuq(tuq tuqVar, x1b x1bVar) {
        super(x1bVar);
        this.c = tuqVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.z1(null, null, null, null, this);
    }
}
