package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.antest.ZaDepositLobbyTestManager", f = "ZaDepositLobbyTestManager.kt", l = {55}, m = "isRegisteredAfterCutoff", v = 2)
public final class sbk0 extends x1b {
    public long a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ubk0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sbk0(ubk0 ubk0Var, x1b x1bVar) {
        super(x1bVar);
        this.c = ubk0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        int i = ubk0.h;
        return this.c.b(this);
    }
}
