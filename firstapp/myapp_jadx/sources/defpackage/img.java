package defpackage;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.roomcache.cacheio.EventCacheIO", f = "EventCacheIO.kt", l = {65}, m = "insertCacheMarketGroups-BWLJW6A", v = 2)
public final class img extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ kmg b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public img(kmg kmgVar, x1b x1bVar) {
        super(x1bVar);
        this.b = kmgVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objJ = this.b.j(null, 0, null, this);
        return objJ == y5b.a ? objJ : new zi50(objJ);
    }
}
