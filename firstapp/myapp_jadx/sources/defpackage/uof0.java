package defpackage;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes8.dex */
public final class uof0 {
    public static final toe0 a = new toe0("NO_THREAD_ELEMENTS");
    public static final rof0 b = new rof0();
    public static final sof0 c = new sof0();
    public static final tof0 d = new tof0();

    public static final void a(CoroutineContext coroutineContext, Object obj) {
        if (obj == a) {
            return;
        }
        if (!(obj instanceof dpf0)) {
            Object objFold = coroutineContext.fold(null, c);
            objFold.getClass();
            ((qof0) objFold).H(obj);
            return;
        }
        dpf0 dpf0Var = (dpf0) obj;
        qof0<Object>[] qof0VarArr = dpf0Var.c;
        int length = qof0VarArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            qof0<Object> qof0Var = qof0VarArr[length];
            qof0Var.getClass();
            qof0Var.H(dpf0Var.b[length]);
            if (i < 0) {
                return;
            } else {
                length = i;
            }
        }
    }

    public static final Object b(CoroutineContext coroutineContext) {
        Object objFold = coroutineContext.fold(0, b);
        objFold.getClass();
        return objFold;
    }

    public static final Object c(CoroutineContext coroutineContext, Object obj) {
        if (obj == null) {
            obj = b(coroutineContext);
        }
        if (obj == 0) {
            return a;
        }
        return obj instanceof Integer ? coroutineContext.fold(new dpf0(((Number) obj).intValue(), coroutineContext), d) : ((qof0) obj).a0();
    }
}
