package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.loyalty.domain.usecase.GetDobBenefitCardItemUseCase", f = "GetDobBenefitCardItemUseCase.kt", l = {90}, m = "getCachedOrFetchDobData", v = 2)
public final class q5k extends x1b {
    public t5k a;
    public /* synthetic */ Object b;
    public final /* synthetic */ t5k c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q5k(t5k t5kVar, x1b x1bVar) {
        super(x1bVar);
        this.c = t5kVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(this);
    }
}
