package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;

/* JADX INFO: loaded from: classes8.dex */
public final class a77<T> extends z67<T, T> {
    public a77(int i, int i2, pb5 pb5Var, lyh lyhVar, CoroutineContext coroutineContext) {
        super((i2 & 4) != 0 ? -3 : i, (i2 & 8) != 0 ? pb5.a : pb5Var, lyhVar, (i2 & 2) != 0 ? e.a : coroutineContext);
    }

    @Override // defpackage.u67
    public final u67<T> i(CoroutineContext coroutineContext, int i, pb5 pb5Var) {
        return new a77(i, pb5Var, this.d, coroutineContext);
    }

    @Override // defpackage.u67
    public final lyh<T> j() {
        return (lyh<T>) this.d;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // defpackage.z67
    public final Object l(myh<? super T> myhVar, v1b<? super Unit> v1bVar) {
        Object objCollect = this.d.collect((myh<? super S>) myhVar, v1bVar);
        return objCollect == y5b.a ? objCollect : Unit.a;
    }
}
