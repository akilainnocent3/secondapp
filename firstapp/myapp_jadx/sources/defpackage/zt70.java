package defpackage;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.search.datastore.SearchDataStoreImpl", f = "SearchDataStoreImpl.kt", l = {18}, m = "updateSearchHistory", v = 2)
public final class zt70 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ bu70 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zt70(bu70 bu70Var, x1b x1bVar) {
        super(x1bVar);
        this.b = bu70Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, this);
    }
}
