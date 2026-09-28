package defpackage;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.stacker.domain.usecase.prize.ClaimPrizeUseCase", f = "ClaimPrizeUseCase.kt", l = {16, 17, 18}, m = "invoke", v = 1)
public final class ip7 extends x1b {
    public long a;
    public /* synthetic */ Object b;
    public final /* synthetic */ jp7 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ip7(jp7 jp7Var, x1b x1bVar) {
        super(x1bVar);
        this.c = jp7Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(this);
    }
}
