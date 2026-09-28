package defpackage;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.betsucc.domain.usecase.ShowLoyaltyUnlockedUseCase", f = "ShowLoyaltyUnlockedUseCase.kt", l = {20, 22}, m = "invoke", v = 2)
public final class aa90 extends x1b {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ba90 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa90(ba90 ba90Var, x1b x1bVar) {
        super(x1bVar);
        this.c = ba90Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(this);
    }
}
