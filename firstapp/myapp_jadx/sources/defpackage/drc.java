package defpackage;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {237, 243, 246}, m = "handleUpdate")
public final class drc extends x1b {
    public Object a;
    public yqc b;
    public dm8 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ yqc<Object> e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drc(yqc yqcVar, x1b x1bVar) {
        super(x1bVar);
        this.e = yqcVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.c(null, this);
    }
}
