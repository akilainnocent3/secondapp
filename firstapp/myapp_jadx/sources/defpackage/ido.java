package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.data.repository.InstantWinBetslipCacheRepoImpl", f = "InstantWinBetslipCacheRepoImpl.kt", l = {50, 57, 59, 67, 68}, m = "getSelectionsForRound", v = 2)
public final class ido extends x1b {
    public String a;
    public String b;
    public Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ hdo e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ido(hdo hdoVar, x1b x1bVar) {
        super(x1bVar);
        this.e = hdoVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.b(null, null, this);
    }
}
