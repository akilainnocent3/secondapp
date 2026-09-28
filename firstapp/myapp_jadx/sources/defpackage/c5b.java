package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.c;
import kotlin.coroutines.d;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class c5b implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineContext coroutineContext = (CoroutineContext) obj;
        CoroutineContext.Element element = (CoroutineContext.Element) obj2;
        coroutineContext.getClass();
        element.getClass();
        CoroutineContext coroutineContextMinusKey = coroutineContext.minusKey(element.getKey());
        e eVar = e.a;
        if (coroutineContextMinusKey == eVar) {
            return element;
        }
        d.a aVar = d.n;
        d dVar = (d) coroutineContextMinusKey.get(aVar);
        if (dVar == null) {
            return new c(element, coroutineContextMinusKey);
        }
        CoroutineContext coroutineContextMinusKey2 = coroutineContextMinusKey.minusKey(aVar);
        return coroutineContextMinusKey2 == eVar ? new c(dVar, element) : new c(dVar, new c(element, coroutineContextMinusKey2));
    }
}
