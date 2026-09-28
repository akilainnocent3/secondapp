package defpackage;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 4, 0}, xi = 49, xs = "kotlin/coroutines/intrinsics/IntrinsicsKt")
public class yzo {
    /* JADX WARN: Multi-variable type inference failed */
    public static v1b a(v1b v1bVar, v1b v1bVar2, Function2 function2) {
        function2.getClass();
        if (function2 instanceof pz1) {
            return ((pz1) function2).create(v1bVar, v1bVar2);
        }
        CoroutineContext context = v1bVar2.getContext();
        return context == e.a ? new uzo(v1bVar2, v1bVar, function2) : new vzo(v1bVar2, context, function2, v1bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> v1b<T> b(v1b<? super T> v1bVar) {
        v1b<T> v1bVar2;
        v1bVar.getClass();
        x1b x1bVar = v1bVar instanceof x1b ? (x1b) v1bVar : null;
        return (x1bVar == null || (v1bVar2 = (v1b<T>) x1bVar.intercepted()) == null) ? v1bVar : v1bVar2;
    }

    public static Object c(v1b v1bVar, Object obj, Function2 function2) {
        function2.getClass();
        CoroutineContext context = v1bVar.getContext();
        z5b wzoVar = context == e.a ? new wzo(v1bVar) : new xzo(v1bVar, context);
        y8h0.d(2, function2);
        return function2.invoke(obj, wzoVar);
    }
}
