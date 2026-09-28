package defpackage;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {544}, m = "decrementCollector")
public final class brc extends x1b {
    public yqc a;
    public tuw b;
    public /* synthetic */ Object c;
    public final /* synthetic */ yqc<Object> d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public brc(yqc yqcVar, x1b x1bVar) {
        super(x1bVar);
        this.d = yqcVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(this);
    }
}
