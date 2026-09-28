package defpackage;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.piggybash.data.repository.lobby.LobbyRepository", f = "LobbyRepository.kt", l = {88}, m = "validate", v = 1)
public final class t1t extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ v1t b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1t(v1t v1tVar, x1b x1bVar) {
        super(x1bVar);
        this.b = v1tVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
