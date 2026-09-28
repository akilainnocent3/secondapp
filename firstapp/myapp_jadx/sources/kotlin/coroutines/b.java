package kotlin.coroutines;

import defpackage.fae;
import kotlin.coroutines.CoroutineContext.Element;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
@fae
public abstract class b<B extends CoroutineContext.Element, E extends B> implements CoroutineContext.a<E> {
    public final Function1<CoroutineContext.Element, E> a;
    public final CoroutineContext.a<?> b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.coroutines.CoroutineContext$a<?>] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.jvm.functions.Function1<? super kotlin.coroutines.CoroutineContext$Element, ? extends E extends B>, kotlin.jvm.functions.Function1<kotlin.coroutines.CoroutineContext$Element, E extends B>] */
    public b(CoroutineContext.a<B> aVar, Function1<? super CoroutineContext.Element, ? extends E> function1) {
        aVar.getClass();
        this.a = function1;
        this.b = aVar instanceof b ? (CoroutineContext.a<B>) ((b) aVar).b : aVar;
    }
}
