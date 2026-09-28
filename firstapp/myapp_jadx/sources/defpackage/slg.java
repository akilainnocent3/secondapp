package defpackage;

import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.roomcache.cacheio.EventCacheIO", f = "EventCacheIO.kt", l = {HttpStatusCodesKt.HTTP_PROCESSING}, m = "deleteCacheBetBuilderMarkets-gIAlu-s", v = 2)
public final class slg extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ kmg b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public slg(kmg kmgVar, x1b x1bVar) {
        super(x1bVar);
        this.b = kmgVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objA = this.b.a(null, this);
        return objA == y5b.a ? objA : new zi50(objA);
    }
}
