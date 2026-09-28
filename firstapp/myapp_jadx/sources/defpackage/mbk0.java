package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.debugscreen.impl.zadepositlobby.ZaDepositLobbyDebugViewModel", f = "ZaDepositLobbyDebugViewModel.kt", l = {79}, m = "isNonFtdUser", v = 2)
public final class mbk0 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ jbk0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mbk0(jbk0 jbk0Var, x1b x1bVar) {
        super(x1bVar);
        this.b = jbk0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.x1(this);
    }
}
