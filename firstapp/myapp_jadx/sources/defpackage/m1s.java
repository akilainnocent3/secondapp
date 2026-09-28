package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.loyalty.impl.challenge.data.repository.LeaderboardPagingSource", f = "LeaderboardPagingSource.kt", l = {19}, m = "load", v = 2)
public final class m1s extends x1b {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ n1s c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1s(n1s n1sVar, x1b x1bVar) {
        super(x1bVar);
        this.c = n1sVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.d(null, this);
    }
}
