package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.lobby.data.repo.LuckyNumberRepository", f = "LuckyNumberRepository.kt", l = {195}, m = "createApiTimeGap", v = 2)
public final class k6u extends x1b {
    public Long a;
    public /* synthetic */ Object b;
    public final /* synthetic */ i6u c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6u(i6u i6uVar, x1b x1bVar) {
        super(x1bVar);
        this.c = i6uVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(0L, 0L, this);
    }
}
