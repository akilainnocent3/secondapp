package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class tof0 implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        dpf0 dpf0Var = (dpf0) obj;
        CoroutineContext.Element element = (CoroutineContext.Element) obj2;
        if (element instanceof qof0) {
            qof0<Object> qof0Var = (qof0) element;
            CoroutineContext coroutineContext = dpf0Var.a;
            Object objA0 = qof0Var.a0();
            Object[] objArr = dpf0Var.b;
            int i = dpf0Var.d;
            objArr[i] = objA0;
            qof0<Object>[] qof0VarArr = dpf0Var.c;
            dpf0Var.d = i + 1;
            qof0VarArr[i] = qof0Var;
        }
        return dpf0Var;
    }
}
