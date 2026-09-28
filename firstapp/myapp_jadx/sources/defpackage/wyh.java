package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.m;
import java.util.Arrays;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class wyh {
    public static final ytw a(lyh lyhVar, Object obj, s9s s9sVar, s9s.b bVar, CoroutineContext coroutineContext, a aVar, int i) {
        Object[] objArr = {lyhVar, s9sVar, bVar, coroutineContext};
        boolean zA = ((((i & 7168) ^ 3072) > 2048 && aVar.d(bVar.ordinal())) || (i & 3072) == 2048) | aVar.A(s9sVar) | aVar.A(coroutineContext) | aVar.A(lyhVar);
        Object objY = aVar.y();
        Object obj2 = a.C0041a.a;
        if (zA || objY == obj2) {
            Object qyhVar = new qyh(s9sVar, bVar, coroutineContext, lyhVar, null);
            aVar.r(qyhVar);
            objY = qyhVar;
        }
        Function2 function2 = (Function2) objY;
        Object objY2 = aVar.y();
        if (objY2 == obj2) {
            objY2 = m.b(obj);
            aVar.r(objY2);
        }
        ytw ytwVar = (ytw) objY2;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 4);
        boolean zA2 = aVar.A(function2);
        Object objY3 = aVar.y();
        if (zA2 || objY3 == obj2) {
            objY3 = new e6a0(function2, ytwVar, null);
            aVar.r(objY3);
        }
        xvf.h(objArrCopyOf, (Function2) objY3, aVar);
        return ytwVar;
    }

    public static final ytw b(lyh lyhVar, Object obj, a aVar, int i, int i2) {
        s9s.b bVar = s9s.b.c;
        ibs ibsVar = (ibs) aVar.O(ndt.a);
        if ((i2 & 4) != 0) {
            bVar = s9s.b.d;
        }
        e eVar = e.a;
        return a(lyhVar, obj, ibsVar.getLifecycle(), bVar, eVar, aVar, (i & 14) | (((i >> 3) & 8) << 3) | (i & 112) | (i & 7168) | (i & 57344));
    }

    public static final ytw c(uwd0 uwd0Var, a aVar, int i, int i2) {
        s9s.b bVar = s9s.b.e;
        ibs ibsVar = (ibs) aVar.O(ndt.a);
        if ((i2 & 2) != 0) {
            bVar = s9s.b.d;
        }
        e eVar = e.a;
        return a(uwd0Var, uwd0Var.getValue(), ibsVar.getLifecycle(), bVar, eVar, aVar, (i << 3) & 7168);
    }
}
