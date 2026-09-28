package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.data.repository.FootballFamilySpeedControllerRepoImpl", f = "FootballFamilySpeedControllerRepoImpl.kt", l = {50, 54}, m = "recordTooltipDismissed", v = 2)
public final class nhi extends x1b {
    public String a;
    public wm20 b;
    public qhi c;
    public /* synthetic */ Object d;
    public final /* synthetic */ qhi e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nhi(qhi qhiVar, x1b x1bVar) {
        super(x1bVar);
        this.e = qhiVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.d(null, this);
    }
}
