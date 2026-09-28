package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.data.repository.FootballFamilySpeedControllerRepoImpl", f = "FootballFamilySpeedControllerRepoImpl.kt", l = {20, 24}, m = "recordLastSelectedSpeedOptionId", v = 2)
public final class lhi extends x1b {
    public String a;
    public String b;
    public wm20 c;
    public qhi d;
    public /* synthetic */ Object e;
    public final /* synthetic */ qhi f;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lhi(qhi qhiVar, x1b x1bVar) {
        super(x1bVar);
        this.f = qhiVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.i |= Integer.MIN_VALUE;
        return this.f.b(null, null, this);
    }
}
