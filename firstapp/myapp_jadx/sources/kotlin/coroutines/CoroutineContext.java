package kotlin.coroutines;

import defpackage.c5b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/coroutines/CoroutineContext;", "", "a", "Element", "kotlin-stdlib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface CoroutineContext {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/coroutines/CoroutineContext$Element;", "Lkotlin/coroutines/CoroutineContext;", "kotlin-stdlib"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public interface Element extends CoroutineContext {

        public static final class a {
            public static <R> R a(Element element, R r, Function2<? super R, ? super Element, ? extends R> function2) {
                function2.getClass();
                return function2.invoke(r, element);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static <E extends Element> E b(Element element, a<E> aVar) {
                aVar.getClass();
                if (Intrinsics.g(element.getKey(), aVar)) {
                    return element;
                }
                return null;
            }

            public static CoroutineContext c(Element element, a<?> aVar) {
                aVar.getClass();
                return Intrinsics.g(element.getKey(), aVar) ? e.a : element;
            }

            public static CoroutineContext d(Element element, CoroutineContext coroutineContext) {
                coroutineContext.getClass();
                return coroutineContext == e.a ? element : (CoroutineContext) coroutineContext.fold(element, new c5b());
            }
        }

        a<?> getKey();
    }

    public interface a<E extends Element> {
    }

    <R> R fold(R r, Function2<? super R, ? super Element, ? extends R> function2);

    <E extends Element> E get(a<E> aVar);

    CoroutineContext minusKey(a<?> aVar);

    CoroutineContext plus(CoroutineContext coroutineContext);
}
