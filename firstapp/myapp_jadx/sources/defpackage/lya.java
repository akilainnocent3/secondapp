package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.account.register.domain.ConsumePendingReferralCodeUseCase", f = "ConsumePendingReferralCodeUseCase.kt", l = {10, 11}, m = "invoke", v = 2)
public final class lya extends x1b {
    public String a;
    public /* synthetic */ Object b;
    public final /* synthetic */ mya c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lya(mya myaVar, x1b x1bVar) {
        super(x1bVar);
        this.c = myaVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(this);
    }
}
