package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.sportypin.SportyPinRepoImpl", f = "SportyPinRepoImpl.kt", l = {17, 19, 30}, m = "getPINStatus", v = 2)
public final class o8d0 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ p8d0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o8d0(p8d0 p8d0Var, x1b x1bVar) {
        super(x1bVar);
        this.b = p8d0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, this);
    }
}
