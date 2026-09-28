package defpackage;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {348}, m = "writeData$datastore_core_release")
public final class qrc extends x1b {
    public bq40 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ yqc<Object> c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qrc(yqc yqcVar, x1b x1bVar) {
        super(x1bVar);
        this.c = yqcVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.h(null, false, this);
    }
}
