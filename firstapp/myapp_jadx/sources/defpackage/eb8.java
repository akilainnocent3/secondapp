package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.ugpay.data.CommonChannelRepositoryImpl", f = "CommonChannelRepositoryImpl.kt", l = {58}, m = "getChannelsByChannelName", v = 2)
public final class eb8 extends x1b {
    public String a;
    public /* synthetic */ Object b;
    public final /* synthetic */ cb8 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eb8(cb8 cb8Var, x1b x1bVar) {
        super(x1bVar);
        this.c = cb8Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(null, this);
    }
}
