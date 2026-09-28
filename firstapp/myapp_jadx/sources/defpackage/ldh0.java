package defpackage;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;

/* JADX INFO: loaded from: classes8.dex */
public final class ldh0<T> extends vn70<T> {
    public final ThreadLocal<Pair<CoroutineContext, Object>> f;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public ldh0(v1b v1bVar, CoroutineContext coroutineContext) {
        ndh0 ndh0Var = ndh0.a;
        super(v1bVar, coroutineContext.get(ndh0Var) == null ? coroutineContext.plus(ndh0Var) : coroutineContext);
        this.f = new ThreadLocal<>();
        if (v1bVar.getContext().get(d.n) instanceof k5b) {
            return;
        }
        Object objC = uof0.c(coroutineContext, null);
        uof0.a(coroutineContext, objC);
        r0(coroutineContext, objC);
    }

    @Override // defpackage.vn70
    public final void o0() {
        q0();
    }

    @Override // defpackage.vn70, defpackage.m9p
    public final void p(Object obj) {
        q0();
        Object objA = gn8.a(obj);
        v1b<T> v1bVar = this.e;
        CoroutineContext context = v1bVar.getContext();
        Object objC = uof0.c(context, null);
        ldh0<?> ldh0VarC = objC != uof0.a ? g5b.c(v1bVar, context, objC) : null;
        try {
            v1bVar.resumeWith(objA);
            Unit unit = Unit.a;
        } finally {
            if (ldh0VarC == null || ldh0VarC.p0()) {
                uof0.a(context, objC);
            }
        }
    }

    public final boolean p0() {
        boolean z = this.threadLocalIsSet && this.f.get() == null;
        this.f.remove();
        return !z;
    }

    public final void q0() {
        if (this.threadLocalIsSet) {
            Pair<CoroutineContext, Object> pair = this.f.get();
            if (pair != null) {
                uof0.a(pair.a, pair.b);
            }
            this.f.remove();
        }
    }

    public final void r0(CoroutineContext coroutineContext, Object obj) {
        this.threadLocalIsSet = true;
        this.f.set(new Pair<>(coroutineContext, obj));
    }
}
