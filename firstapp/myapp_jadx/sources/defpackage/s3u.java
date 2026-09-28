package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.loyalty.home.LoyaltyViewModel", f = "LoyaltyViewModel.kt", l = {1860}, m = "getCurrentDobBenefitStatus", v = 2)
public final class s3u extends x1b {
    public krf0 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ b3u c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3u(b3u b3uVar, x1b x1bVar) {
        super(x1bVar);
        this.c = b3uVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.F1(null, null, this);
    }
}
