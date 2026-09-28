package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.dedicatedteampage.article.data.repository.NewsRepositoryImpl", f = "NewsRepositoryImpl.kt", l = {18}, m = "getVideoDetail-gIAlu-s", v = 2)
public final class mrx extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ nrx b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mrx(nrx nrxVar, x1b x1bVar) {
        super(x1bVar);
        this.b = nrxVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objB = this.b.b(null, this);
        return objB == y5b.a ? objB : new zi50(objB);
    }
}
