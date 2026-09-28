package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {365, 366, 368, 369, 380, 384}, m = "readDataOrHandleCorruption")
public final class hrc extends x1b {
    public Object a;
    public Object b;
    public Serializable c;
    public dq40 d;
    public boolean e;
    public int f;
    public /* synthetic */ Object i;
    public final /* synthetic */ yqc<Object> v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hrc(yqc yqcVar, x1b x1bVar) {
        super(x1bVar);
        this.v = yqcVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.g(false, this);
    }
}
