package defpackage;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.mission.ShowMissionViewModel", f = "ShowMissionViewModel.kt", l = {188}, m = "verifyResetMissionReportStateAndGetMissionId", v = 2)
public final class va90 extends x1b {
    public ltv.a a;
    public /* synthetic */ Object b;
    public final /* synthetic */ sa90 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public va90(sa90 sa90Var, x1b x1bVar) {
        super(x1bVar);
        this.c = sa90Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.A1(this);
    }
}
