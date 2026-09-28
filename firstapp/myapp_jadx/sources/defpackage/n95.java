package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.m;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class n95 {
    public static final /* synthetic */ int a = 0;

    public static final ytw a(lyh lyhVar, Object obj, CoroutineContext coroutineContext, a aVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            coroutineContext = e.a;
        }
        boolean zA = aVar.A(coroutineContext) | aVar.A(lyhVar);
        Object objY = aVar.y();
        Object obj2 = a.C0041a.a;
        if (zA || objY == obj2) {
            objY = new f6a0(coroutineContext, lyhVar, null);
            aVar.r(objY);
        }
        Function2 function2 = (Function2) objY;
        Object objY2 = aVar.y();
        if (objY2 == obj2) {
            objY2 = m.b(obj);
            aVar.r(objY2);
        }
        ytw ytwVar = (ytw) objY2;
        boolean zA2 = aVar.A(function2);
        Object objY3 = aVar.y();
        if (zA2 || objY3 == obj2) {
            objY3 = new d6a0(function2, ytwVar, null);
            aVar.r(objY3);
        }
        xvf.g(lyhVar, coroutineContext, (Function2) objY3, aVar);
        return ytwVar;
    }

    public static final ytw b(uwd0 uwd0Var, a aVar) {
        return a(uwd0Var, uwd0Var.getValue(), e.a, aVar, 0, 0);
    }

    public static final or60 c(Function0 function0) {
        return new or60(new i6a0(function0, null));
    }
}
