package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.usecase.ClaimBonusUseCase", f = "ClaimBonusUseCase.kt", l = {30}, m = "shouldShowClaimBonus", v = 2)
public final class ep7 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ fp7 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ep7(fp7 fp7Var, x1b x1bVar) {
        super(x1bVar);
        this.b = fp7Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
