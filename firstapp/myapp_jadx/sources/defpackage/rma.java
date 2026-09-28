package defpackage;

import androidx.compose.runtime.b;
import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class rma implements qma, u1z, CoroutineContext.Element {
    public static final a b = new a();
    public final b a;

    public static final class a implements CoroutineContext.a<rma> {
        public final String toString() {
            return "CompositionErrorContext";
        }
    }

    public rma(b bVar) {
        this.a = bVar;
    }

    @Override // defpackage.qma
    public final boolean a(Throwable th, Object obj) {
        return nka.b(th, new i81(1, this, obj));
    }

    @Override // defpackage.u1z
    public final List<mka> b(Integer num) {
        return this.a.m0();
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
        return b;
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
