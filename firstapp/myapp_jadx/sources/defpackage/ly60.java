package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes8.dex */
public final class ly60 implements y2b {
    public static final ly60 a = new ly60();
    public static final /* synthetic */ int b = 0;

    public static final Object a(CoroutineContext coroutineContext, Object obj, Object obj2, Function2 function2, v1b v1bVar) {
        Object objC = uof0.c(coroutineContext, obj2);
        try {
            bld0 bld0Var = new bld0(v1bVar, coroutineContext);
            y8h0.d(2, function2);
            Object objInvoke = function2.invoke(obj, bld0Var);
            uof0.a(coroutineContext, objC);
            if (objInvoke == y5b.a) {
                v1bVar.getClass();
            }
            return objInvoke;
        } catch (Throwable th) {
            uof0.a(coroutineContext, objC);
            throw th;
        }
    }

    @Override // defpackage.y2b
    public Object convert(Object obj) {
        return Boolean.valueOf(((ResponseBody) obj).string());
    }
}
