package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public abstract class z67<S, T> extends u67<T> {
    public final lyh<S> d;

    public z67(int i, pb5 pb5Var, lyh lyhVar, CoroutineContext coroutineContext) {
        super(coroutineContext, i, pb5Var);
        this.d = lyhVar;
    }

    @Override // defpackage.u67, defpackage.lyh
    public final Object collect(myh<? super T> myhVar, v1b<? super Unit> v1bVar) {
        if (this.b == -3) {
            CoroutineContext context = v1bVar.getContext();
            Boolean bool = Boolean.FALSE;
            d5b d5bVar = new d5b();
            CoroutineContext coroutineContext = this.a;
            CoroutineContext coroutineContextPlus = !((Boolean) coroutineContext.fold(bool, d5bVar)).booleanValue() ? context.plus(coroutineContext) : g5b.a(context, coroutineContext, false);
            if (Intrinsics.g(coroutineContextPlus, context)) {
                Object objL = l(myhVar, v1bVar);
                return objL == y5b.a ? objL : Unit.a;
            }
            d.a aVar = d.n;
            if (Intrinsics.g(coroutineContextPlus.get(aVar), context.get(aVar))) {
                CoroutineContext context2 = v1bVar.getContext();
                if (!(myhVar instanceof rc80) && !(myhVar instanceof gyx)) {
                    myhVar = new kdh0(myhVar, context2);
                }
                Object objA = ly60.a(coroutineContextPlus, myhVar, uof0.b(coroutineContextPlus), new y67(this, null), v1bVar);
                return objA == y5b.a ? objA : Unit.a;
            }
        }
        Object objCollect = super.collect(myhVar, v1bVar);
        return objCollect == y5b.a ? objCollect : Unit.a;
    }

    @Override // defpackage.u67
    public final Object f(ez20<? super T> ez20Var, v1b<? super Unit> v1bVar) {
        Object objL = l(new rc80(ez20Var), v1bVar);
        return objL == y5b.a ? objL : Unit.a;
    }

    public abstract Object l(myh<? super T> myhVar, v1b<? super Unit> v1bVar);

    @Override // defpackage.u67
    public final String toString() {
        return this.d + " -> " + super.toString();
    }
}
