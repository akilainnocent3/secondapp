package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ya9 implements iaj {
    @Override // defpackage.iaj
    public final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
        hgr hgrVar = (hgr) obj2;
        a aVar = (a) obj3;
        int iIntValue = ((Integer) obj4).intValue();
        ((pf0) obj).getClass();
        hgrVar.getClass();
        if ((iIntValue & 48) == 0) {
            iIntValue |= (iIntValue & 64) == 0 ? aVar.M(hgrVar) : aVar.A(hgrVar) ? 32 : 16;
        }
        if (aVar.q(iIntValue & 1, (iIntValue & 145) != 144)) {
            jhr.i(j.g(d.a.b, 1.0f), hgrVar.a, hgrVar.b, aVar, 6);
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
