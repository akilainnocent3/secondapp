package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class crr implements j350, l5b {
    public final CoroutineContext a;
    public final Function2<v5b, v1b<? super Unit>, Object> b;
    public final j1b c;
    public jvd0 d;

    /* JADX WARN: Multi-variable type inference failed */
    public crr(CoroutineContext coroutineContext, Function2<? super v5b, ? super v1b<? super Unit>, ? extends Object> function2) {
        this.a = coroutineContext;
        this.b = function2;
        this.c = w5b.a(coroutineContext.plus(coroutineContext.get(rma.b) != null ? this : e.a));
    }

    @Override // defpackage.j350
    public final void c() {
        jvd0 jvd0Var = this.d;
        if (jvd0Var != null) {
            CancellationException cancellationException = new CancellationException("Old job was still running!");
            cancellationException.initCause(null);
            jvd0Var.cancel(cancellationException);
        }
        this.d = ej5.c(this.c, null, null, this.b, 3);
    }

    @Override // defpackage.j350
    public final void e() {
        jvd0 jvd0Var = this.d;
        if (jvd0Var != null) {
            jvd0Var.t(new f4s());
        }
        this.d = null;
    }

    @Override // defpackage.j350
    public final void f() {
        jvd0 jvd0Var = this.d;
        if (jvd0Var != null) {
            jvd0Var.t(new f4s());
        }
        this.d = null;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final <R> R fold(R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return function2.invoke(r, this);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final <E extends CoroutineContext.Element> E get(CoroutineContext.a<E> aVar) {
        return (E) CoroutineContext.Element.a.b(this, aVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final CoroutineContext.a<?> getKey() {
        return l5b.a.a;
    }

    @Override // defpackage.l5b
    public final void handleException(CoroutineContext coroutineContext, Throwable th) throws Throwable {
        rma rmaVar = (rma) coroutineContext.get(rma.b);
        if (rmaVar != null) {
            rmaVar.a(th, this);
        }
        l5b l5bVar = (l5b) this.a.get(l5b.a.a);
        if (l5bVar == null) {
            throw th;
        }
        l5bVar.handleException(coroutineContext, th);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(CoroutineContext.a<?> aVar) {
        return CoroutineContext.Element.a.c(this, aVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return CoroutineContext.Element.a.d(this, coroutineContext);
    }
}
