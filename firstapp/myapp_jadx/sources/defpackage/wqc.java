package defpackage;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1$api$1", f = "DataStoreImpl.kt", l = {544, 447, 449}, m = "updateData")
public final class wqc extends x1b {
    public Object a;
    public Object b;
    public Object c;
    public dq40 d;
    public yqc e;
    public /* synthetic */ Object f;
    public final /* synthetic */ xqc.a i;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wqc(xqc.a aVar, x1b x1bVar) {
        super(x1bVar);
        this.i = aVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.v |= Integer.MIN_VALUE;
        return this.i.a(null, this);
    }
}
