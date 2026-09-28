package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.handler.speedcontroller.FootballFamilySpeedControllerHandlerImpl", f = "FootballFamilySpeedControllerHandlerImpl.kt", l = {129, 132, 135}, m = "initSpeedControllerEnabled", v = 2)
public final class hhi extends x1b {
    public String a;
    public ztw b;
    public Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ ihi e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hhi(ihi ihiVar, x1b x1bVar) {
        super(x1bVar);
        this.e = ihiVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.d(null, this);
    }
}
