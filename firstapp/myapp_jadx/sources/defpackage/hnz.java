package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class hnz<T> implements myh {
    public final /* synthetic */ enz<Object, Object> a;
    public final /* synthetic */ kxs b;

    public hnz(enz<Object, Object> enzVar, kxs kxsVar) {
        this.a = enzVar;
        this.b = kxsVar;
    }

    @Override // defpackage.myh
    public final Object emit(Object obj, v1b v1bVar) throws Throwable {
        Object objD = this.a.d(this.b, (p1k) obj, v1bVar);
        return objD == y5b.a ? objD : Unit.a;
    }
}
