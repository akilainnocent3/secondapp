package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class cw9 implements gaj {
    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        a aVar = (a) obj2;
        ((Integer) obj3).getClass();
        ((jh0) obj).getClass();
        d dVarB = androidx.compose.foundation.a.b(j.e(d.a.b, 1.0f), j58.c(0.8f, j58.b), zk40.a);
        Object objY = aVar.y();
        a.C0041a.C0042a c0042a = a.C0041a.a;
        if (objY == c0042a) {
            objY = pr7.a(aVar);
        }
        psw pswVar = (psw) objY;
        Object objY2 = aVar.y();
        if (objY2 == c0042a) {
            objY2 = new dw9();
            aVar.r(objY2);
        }
        g75.a(androidx.compose.foundation.d.b(dVarB, pswVar, null, false, null, (Function0) objY2, 28), aVar, 0);
        return Unit.a;
    }
}
