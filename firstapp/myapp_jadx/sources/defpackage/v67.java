package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public class v67<T> extends u67<T> {
    public final Function2<ez20<? super T>, v1b<? super Unit>, Object> d;

    /* JADX WARN: Multi-variable type inference failed */
    public v67(Function2<? super ez20<? super T>, ? super v1b<? super Unit>, ? extends Object> function2, CoroutineContext coroutineContext, int i, pb5 pb5Var) {
        super(coroutineContext, i, pb5Var);
        this.d = function2;
    }

    @Override // defpackage.u67
    public Object f(ez20<? super T> ez20Var, v1b<? super Unit> v1bVar) {
        Object objInvoke = this.d.invoke(ez20Var, v1bVar);
        return objInvoke == y5b.a ? objInvoke : Unit.a;
    }

    @Override // defpackage.u67
    public u67<T> i(CoroutineContext coroutineContext, int i, pb5 pb5Var) {
        return new v67(this.d, coroutineContext, i, pb5Var);
    }

    @Override // defpackage.u67
    public final String toString() {
        return "block[" + this.d + "] -> " + super.toString();
    }
}
