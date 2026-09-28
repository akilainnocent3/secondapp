package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class wof0<T> implements qof0<T> {
    public final T a;
    public final ThreadLocal<T> b;
    public final yof0 c;

    public wof0(T t, ThreadLocal<T> threadLocal) {
        this.a = t;
        this.b = threadLocal;
        this.c = new yof0(threadLocal);
    }

    @Override // defpackage.qof0
    public final void H(Object obj) {
        this.b.set(obj);
    }

    @Override // defpackage.qof0
    public final Object a0() {
        ThreadLocal<T> threadLocal = this.b;
        T t = threadLocal.get();
        threadLocal.set(this.a);
        return t;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final <R> R fold(R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return function2.invoke(r, this);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final <E extends CoroutineContext.Element> E get(CoroutineContext.a<E> aVar) {
        if (this.c.equals(aVar)) {
            return this;
        }
        return null;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final CoroutineContext.a<?> getKey() {
        return this.c;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(CoroutineContext.a<?> aVar) {
        return this.c.equals(aVar) ? e.a : this;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return CoroutineContext.Element.a.d(this, coroutineContext);
    }

    public final String toString() {
        return "ThreadLocal(value=" + this.a + ", threadLocal = " + this.b + ')';
    }
}
