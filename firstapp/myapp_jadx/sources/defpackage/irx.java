package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.dedicatedteampage.article.data.repository.NewsRemoteDataSource", f = "NewsRemoteDataSource.kt", l = {16}, m = "getVideoDetail-gIAlu-s", v = 2)
public final class irx extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ jrx b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public irx(jrx jrxVar, x1b x1bVar) {
        super(x1bVar);
        this.b = jrxVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objB = this.b.b(null, this);
        return objB == y5b.a ? objB : new zi50(objB);
    }
}
