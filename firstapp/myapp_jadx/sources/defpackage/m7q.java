package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.lobby.presentation.LNFavoriteUpdateManager", f = "LNFavoriteUpdateManager.kt", l = {122}, m = "processSingleRequest", v = 2)
public final class m7q extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ j7q b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m7q(j7q j7qVar, x1b x1bVar) {
        super(x1bVar);
        this.b = j7qVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, false, this);
    }
}
