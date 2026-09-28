package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class o99 implements iaj {
    @Override // defpackage.iaj
    public final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
        qcn qcnVar = (qcn) obj2;
        a aVar = (a) obj3;
        int iIntValue = ((Integer) obj4).intValue();
        ((pf0) obj).getClass();
        qcnVar.getClass();
        if ((iIntValue & 48) == 0) {
            iIntValue |= aVar.M(qcnVar) ? 32 : 16;
        }
        int i = 0;
        if (aVar.q(iIntValue & 1, (iIntValue & 145) != 144)) {
            d dVarG = j.g(d.a.b, 1.0f);
            kw0.i iVar = new kw0.i(4.0f, true, new hw0());
            boolean z = (iIntValue & 112) == 32;
            Object objY = aVar.y();
            if (z || objY == a.C0041a.a) {
                objY = new p99(qcnVar, i);
                aVar.r(objY);
            }
            aur.b(dVarG, null, null, iVar, null, null, false, null, (Function1) objY, aVar, 24582, 494);
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
