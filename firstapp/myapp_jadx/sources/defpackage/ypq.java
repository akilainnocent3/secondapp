package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.lobby.presentation.LNLobbyViewModel", f = "LNLobbyViewModel.kt", l = {353, 362, 363, 366, 369, 373, 375}, m = "initWhenConfigLoaded", v = 2)
public final class ypq extends x1b {
    public kmq a;
    public Object b;
    public /* synthetic */ Object c;
    public final /* synthetic */ spq d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ypq(spq spqVar, x1b x1bVar) {
        super(x1bVar);
        this.d = spqVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.x1(null, this);
    }
}
