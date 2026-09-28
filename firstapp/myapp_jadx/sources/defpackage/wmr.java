package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.data.repository.LastFocusedTabRepoImpl", f = "LastFocusedTabRepoImpl.kt", l = {55, 59}, m = "recordLastFocusedMarketGroupId", v = 2)
public final class wmr extends x1b {
    public String a;
    public String b;
    public wm20 c;
    public Object d;
    public /* synthetic */ Object e;
    public final /* synthetic */ ymr f;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wmr(ymr ymrVar, x1b x1bVar) {
        super(x1bVar);
        this.f = ymrVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.i |= Integer.MIN_VALUE;
        return this.f.c(null, null, this);
    }
}
