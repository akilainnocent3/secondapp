package defpackage;

import androidx.compose.foundation.layout.c;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class w99 implements iaj {
    @Override // defpackage.iaj
    public final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
        String str = (String) obj2;
        a aVar = (a) obj3;
        int iIntValue = ((Integer) obj4).intValue();
        ((pf0) obj).getClass();
        str.getClass();
        if ((iIntValue & 48) == 0) {
            iIntValue |= aVar.M(str) ? 32 : 16;
        }
        if (aVar.q(iIntValue & 1, (iIntValue & 145) != 144)) {
            d dVarJ = h.j(d.a.b, 8.0f, 16.0f, 8.0f, 0.0f, 8);
            qyd0 qyd0Var = oib0.a;
            mw90.a(str, "banner", d35.a(ls7.a(c.a(j.g(androidx.compose.foundation.a.b(dVarJ, ((lib0) aVar.O(qyd0Var)).m0, zk40.a), 1.0f), 2.9913044f), j060.c(8.0f)), 1.0f, ((lib0) aVar.O(qyd0Var)).A, j060.c(8.0f)), null, null, d0b.a.a, null, aVar, ((iIntValue >> 3) & 14) | 1572912, 1976);
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
