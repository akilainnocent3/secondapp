package defpackage;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "com.sportybet.android.loyalty.LoyaltyUseCase", f = "LoyaltyUseCase.kt", l = {159}, m = "updateLoyaltyAggregateData", v = 2)
public final class r2u extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ u2u b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2u(u2u u2uVar, x1b x1bVar) {
        super(x1bVar);
        this.b = u2uVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(this);
    }
}
