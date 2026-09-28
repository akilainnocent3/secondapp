package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ma9 implements gaj {
    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        m75 m75Var = (m75) obj;
        a aVar = (a) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        m75Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= aVar.M(m75Var) ? 4 : 2;
        }
        if (aVar.q(iIntValue & 1, (iIntValue & 19) != 18)) {
            u5r.h(h.h(m75Var.b(d.a.b, ht.a.b), ((cjb0) aVar.O(ejb0.a)).h, 0.0f, 2), aVar, 0);
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
