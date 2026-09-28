package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final class z0i implements myh<Object> {
    public final /* synthetic */ dq40 a;

    public z0i(dq40 dq40Var) {
        this.a = dq40Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, toe0] */
    @Override // defpackage.myh
    public final Object emit(Object obj, v1b<? super Unit> v1bVar) {
        dq40 dq40Var = this.a;
        T t = dq40Var.a;
        ?? r1 = k5y.a;
        if (t == r1) {
            dq40Var.a = obj;
            return Unit.a;
        }
        dq40Var.a = r1;
        throw new t1(this);
    }
}
