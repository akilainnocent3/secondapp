package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class az8 implements gaj {
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
            d.a aVar2 = d.a.b;
            d dVarT = j.t(aVar2, 152.0f, 56.0f);
            n54 n54Var = ht.a.a;
            d0b.a.c cVar = d0b.a.c;
            mw90.a("https://s.sporty.net/cms/Vector_6d4dadfa7c.png", "left bg", dVarT, null, n54Var, cVar, null, aVar, 1769910, 1944);
            d dVarE = j.e(j.k(aVar2, 0.0f, 136.0f, 1), 1.0f);
            n54 n54Var2 = ht.a.i;
            mw90.a("https://s.sporty.net/cms/Vector_1_6f4d604c57.png", "right bg", m75Var.b(dVarE, n54Var2), null, n54Var2, cVar, null, aVar, 1769526, 1944);
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
