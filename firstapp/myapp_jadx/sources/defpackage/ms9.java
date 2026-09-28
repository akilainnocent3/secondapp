package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ms9 implements gaj {
    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        a aVar = (a) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((d) obj).getClass();
        if (aVar.q(iIntValue & 1, (iIntValue & 17) != 16)) {
            d dVarH = g3w.h(j.g(d.a.b, 1.0f), "skip");
            Object objY = aVar.y();
            if (objY == a.C0041a.a) {
                objY = new xr9();
                aVar.r(objY);
            }
            ddd0.a(dVarH, false, null, null, null, false, null, null, (Function0) objY, ns9.k, aVar, 905969670, 254);
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
