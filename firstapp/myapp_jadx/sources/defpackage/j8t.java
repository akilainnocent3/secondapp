package defpackage;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.compose.lobbyv2.remote.LobbyV2Repository", f = "LobbyV2Repository.kt", l = {154, 159, 162, 167, 170}, m = "getSearchResult", v = 1)
public final class j8t extends x1b {
    public String a;
    public boolean b;
    public boolean c;
    public /* synthetic */ Object d;
    public final /* synthetic */ r8t e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j8t(r8t r8tVar, x1b x1bVar) {
        super(x1bVar);
        this.e = r8tVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.e(null, null, false, false, this);
    }
}
