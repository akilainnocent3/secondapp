package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.profile.me.presentation.mappers.LoyaltyStateMapper", f = "LoyaltyStateMapper.kt", l = {237, 242}, m = "calculatePotentialReward", v = 2)
public final class nyt extends x1b {
    public String a;
    public /* synthetic */ Object b;
    public final /* synthetic */ syt c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nyt(syt sytVar, x1b x1bVar) {
        super(x1bVar);
        this.c = sytVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
