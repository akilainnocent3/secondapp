package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final class y0i<T> implements myh {
    public final /* synthetic */ dq40<Object> a;

    public y0i(dq40<Object> dq40Var) {
        this.a = dq40Var;
    }

    @Override // defpackage.myh
    public final Object emit(T t, v1b<? super Unit> v1bVar) {
        dq40<Object> dq40Var = this.a;
        if (dq40Var.a == k5y.a) {
            dq40Var.a = t;
            return Unit.a;
        }
        hb5.a("Flow has more than one element");
        return null;
    }
}
