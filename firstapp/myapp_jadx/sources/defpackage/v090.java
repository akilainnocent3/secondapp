package defpackage;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.android.share.manager.ShareImageProviderImpl", f = "ShareImageProviderImpl.kt", l = {87, 91}, m = "fetchMxImages", v = 2)
public final class v090 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ u090 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v090(u090 u090Var, x1b x1bVar) {
        super(x1bVar);
        this.b = u090Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(null, this);
    }
}
