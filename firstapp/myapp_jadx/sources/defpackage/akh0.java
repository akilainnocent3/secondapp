package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.lobby.domain.usecase.UpdateLotteryUseCase", f = "UpdateLotteryUseCase.kt", l = {84, 88}, m = "refreshLotteryUntilSuccess", v = 2)
public final class akh0 extends x1b {
    public a390 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ xjh0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akh0(xjh0 xjh0Var, x1b x1bVar) {
        super(x1bVar);
        this.c = xjh0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
