package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.m;
import java.io.Serializable;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class bl50 {
    public static final ytw a(Serializable serializable, Object obj, Function2 function2, a aVar, int i) {
        Object objY = aVar.y();
        a.C0041a.C0042a c0042a = a.C0041a.a;
        if (objY == c0042a) {
            objY = m.b(serializable);
            aVar.r(objY);
        }
        ytw ytwVar = (ytw) objY;
        boolean zA = aVar.A(function2);
        Object objY2 = aVar.y();
        if (zA || objY2 == c0042a) {
            objY2 = new c6a0(function2, ytwVar, null);
            aVar.r(objY2);
        }
        xvf.e(aVar, obj, (Function2) objY2);
        return ytwVar;
    }
}
