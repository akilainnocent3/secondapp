package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class qc9 implements gaj {
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
            q330.a(m75Var.b(j.r(d.a.b, 20.0f), ht.a.e), ((lib0) aVar.O(oib0.a)).a0, 2.0f, 0L, 0, 0.0f, aVar, 384, 56);
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
