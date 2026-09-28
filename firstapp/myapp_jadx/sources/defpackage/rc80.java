package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final class rc80<T> implements myh<T> {
    public final ec80<T> a;

    /* JADX WARN: Multi-variable type inference failed */
    public rc80(ec80<? super T> ec80Var) {
        this.a = ec80Var;
    }

    @Override // defpackage.myh
    public final Object emit(T t, v1b<? super Unit> v1bVar) {
        Object objJ = this.a.j(v1bVar, t);
        return objJ == y5b.a ? objJ : Unit.a;
    }
}
