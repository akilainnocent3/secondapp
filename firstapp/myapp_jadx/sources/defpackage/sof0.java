package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class sof0 implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        qof0 qof0Var = (qof0) obj;
        CoroutineContext.Element element = (CoroutineContext.Element) obj2;
        if (qof0Var != null) {
            return qof0Var;
        }
        if (element instanceof qof0) {
            return (qof0) element;
        }
        return null;
    }
}
