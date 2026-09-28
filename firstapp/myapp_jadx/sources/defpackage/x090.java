package defpackage;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.android.share.manager.ShareImageProviderImpl", f = "ShareImageProviderImpl.kt", l = {162, 71, 173}, m = "generateShareImages", v = 2)
public final class x090 extends x1b {
    public b190 a;
    public u090.a b;
    public tuw c;
    public Throwable d;
    public tuw e;
    public /* synthetic */ Object f;
    public final /* synthetic */ u090 i;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x090(u090 u090Var, x1b x1bVar) {
        super(x1bVar);
        this.i = u090Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.v |= Integer.MIN_VALUE;
        return this.i.a(null, this);
    }
}
