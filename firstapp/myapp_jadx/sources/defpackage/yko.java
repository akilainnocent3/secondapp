package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.data.repository.InstantWinRepoImpl", f = "InstantWinRepoImpl.kt", l = {69}, m = "getSportConfig-0E7RQCE", v = 2)
public final class yko extends x1b {
    public String a;
    public fko b;
    public /* synthetic */ Object c;
    public final /* synthetic */ fko d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yko(fko fkoVar, x1b x1bVar) {
        super(x1bVar);
        this.d = fkoVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        Object objG = this.d.G(null, false, this);
        return objG == y5b.a ? objG : new zi50(objG);
    }
}
