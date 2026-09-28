package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.home.GetUnreadUseCase", f = "GetUnreadUseCase.kt", l = {87, 89}, m = "getLoyaltyAggregateHint", v = 2)
public final class hgk extends x1b {
    public jgk a;
    public /* synthetic */ Object b;
    public final /* synthetic */ jgk c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hgk(jgk jgkVar, x1b x1bVar) {
        super(x1bVar);
        this.c = jgkVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(this);
    }
}
