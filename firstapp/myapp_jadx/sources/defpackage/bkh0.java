package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.lobby.domain.usecase.UpdateLotteryUseCase", f = "UpdateLotteryUseCase.kt", l = {94}, m = "updateLottery", v = 2)
public final class bkh0 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ xjh0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bkh0(xjh0 xjh0Var, x1b x1bVar) {
        super(x1bVar);
        this.b = xjh0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(null, this);
    }
}
