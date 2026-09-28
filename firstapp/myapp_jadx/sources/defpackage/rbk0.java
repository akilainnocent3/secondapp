package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.antest.ZaDepositLobbyTestManager", f = "ZaDepositLobbyTestManager.kt", l = {66}, m = "isNonFtdUser", v = 2)
public final class rbk0 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ ubk0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rbk0(ubk0 ubk0Var, x1b x1bVar) {
        super(x1bVar);
        this.b = ubk0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        int i = ubk0.h;
        return this.b.a(false, this);
    }
}
