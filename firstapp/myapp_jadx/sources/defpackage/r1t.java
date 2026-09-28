package defpackage;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.piggybash.data.repository.lobby.LobbyRepository", f = "LobbyRepository.kt", l = {56}, m = "joinRoom", v = 1)
public final class r1t extends x1b {
    public long a;
    public /* synthetic */ Object b;
    public final /* synthetic */ v1t c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1t(v1t v1tVar, x1b x1bVar) {
        super(x1bVar);
        this.c = v1tVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.k(0.0d, 0L, this);
    }
}
