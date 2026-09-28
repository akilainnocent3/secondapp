package defpackage;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.roomcache.cacheio.EventCacheIO", f = "EventCacheIO.kt", l = {127}, m = "getCacheFavoriteMarketIds-0E7RQCE", v = 2)
public final class amg extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ kmg b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amg(kmg kmgVar, x1b x1bVar) {
        super(x1bVar);
        this.b = kmgVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objE = this.b.e(0, this, null);
        return objE == y5b.a ? objE : new zi50(objE);
    }
}
