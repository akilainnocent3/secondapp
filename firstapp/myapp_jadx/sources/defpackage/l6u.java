package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.lobby.data.repo.LuckyNumberRepository", f = "LuckyNumberRepository.kt", l = {246}, m = "ensureLobbyEnabled", v = 2)
public final class l6u extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ i6u b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6u(i6u i6uVar, x1b x1bVar) {
        super(x1bVar);
        this.b = i6uVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(this);
    }
}
