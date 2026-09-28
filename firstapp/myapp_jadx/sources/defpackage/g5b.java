package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class g5b {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
    public static final CoroutineContext a(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, final boolean z) {
        Boolean bool = Boolean.FALSE;
        boolean zBooleanValue = ((Boolean) coroutineContext.fold(bool, new d5b())).booleanValue();
        boolean zBooleanValue2 = ((Boolean) coroutineContext2.fold(bool, new d5b())).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return coroutineContext.plus(coroutineContext2);
        }
        final dq40 dq40Var = new dq40();
        dq40Var.a = coroutineContext2;
        e eVar = e.a;
        CoroutineContext coroutineContext3 = (CoroutineContext) coroutineContext.fold(eVar, new Function2() { // from class: e5b
            /* JADX WARN: Type inference failed for: r3v3, types: [T, kotlin.coroutines.CoroutineContext] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                CoroutineContext coroutineContext4 = (CoroutineContext) obj;
                CoroutineContext.Element element = (CoroutineContext.Element) obj2;
                if (!(element instanceof e3b)) {
                    return coroutineContext4.plus(element);
                }
                dq40 dq40Var2 = dq40Var;
                if (((CoroutineContext) dq40Var2.a).get(element.getKey()) == null) {
                    return coroutineContext4.plus(z ? ((e3b) element).o() : (e3b) element);
                }
                dq40Var2.a = ((CoroutineContext) dq40Var2.a).minusKey(element.getKey());
                return coroutineContext4.plus(((e3b) element).V());
            }
        });
        if (zBooleanValue2) {
            dq40Var.a = ((CoroutineContext) dq40Var.a).fold(eVar, new f5b());
        }
        return coroutineContext3.plus((CoroutineContext) dq40Var.a);
    }

    public static final CoroutineContext b(v5b v5bVar, CoroutineContext coroutineContext) {
        CoroutineContext coroutineContextA = a(v5bVar.getCoroutineContext(), coroutineContext, true);
        pfd pfdVar = fse.a;
        return (coroutineContextA == pfdVar || coroutineContextA.get(d.n) != null) ? coroutineContextA : coroutineContextA.plus(pfdVar);
    }

    public static final ldh0<?> c(v1b<?> v1bVar, CoroutineContext coroutineContext, Object obj) {
        ldh0<?> ldh0Var = null;
        if ((v1bVar instanceof z5b) && coroutineContext.get(ndh0.a) != null) {
            z5b callerFrame = (z5b) v1bVar;
            while (!(callerFrame instanceof ase) && (callerFrame = callerFrame.getCallerFrame()) != null) {
                if (callerFrame instanceof ldh0) {
                    ldh0Var = (ldh0) callerFrame;
                    break;
                }
            }
            if (ldh0Var != null) {
                ldh0Var.r0(coroutineContext, obj);
            }
        }
        return ldh0Var;
    }
}
