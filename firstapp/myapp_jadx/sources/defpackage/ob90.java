package defpackage;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "com.sportybet.android.limits.base.timelimits.viewmodel.ShowTimeLimitsViewModel", f = "ShowTimeLimitsViewModel.kt", l = {79}, m = "asUiState", v = 2)
public final class ob90 extends x1b {
    public Integer a;
    public Integer b;
    public Integer c;
    public Integer d;
    public /* synthetic */ Object e;
    public final /* synthetic */ qb90 f;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ob90(qb90 qb90Var, x1b x1bVar) {
        super(x1bVar);
        this.f = qb90Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.i |= Integer.MIN_VALUE;
        return this.f.z1(null, this);
    }
}
