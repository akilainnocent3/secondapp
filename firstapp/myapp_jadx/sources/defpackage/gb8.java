package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.ugpay.data.CommonChannelRepositoryImpl", f = "CommonChannelRepositoryImpl.kt", l = {91, 94, 99}, m = "getCurrentChannels", v = 2)
public final class gb8 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ cb8 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gb8(cb8 cb8Var, x1b x1bVar) {
        super(x1bVar);
        this.b = cb8Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
