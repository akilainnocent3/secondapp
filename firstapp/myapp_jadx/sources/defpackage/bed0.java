package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.sportytv.repository.SportyTvDataStoreImpl", f = "SportyTvDataStoreImpl.kt", l = {52}, m = "setNotificationToggle", v = 2)
public final class bed0 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ ded0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bed0(ded0 ded0Var, x1b x1bVar) {
        super(x1bVar);
        this.b = ded0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(false, this);
    }
}
