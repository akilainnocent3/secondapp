package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class fu8 implements gaj {
    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        x0g0 x0g0Var = (x0g0) obj;
        a aVar = (a) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        x0g0Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= (iIntValue & 8) == 0 ? aVar.M(x0g0Var) : aVar.A(x0g0Var) ? 4 : 2;
        }
        if (aVar.q(iIntValue & 1, (iIntValue & 19) != 18)) {
            float f = i0g0.a;
            zhd zhdVar = new zhd(jc1.a(12.0f, 12.0f));
            qyd0 qyd0Var = oib0.a;
            long j = ((lib0) aVar.O(qyd0Var)).t0;
            long j2 = ((lib0) aVar.O(qyd0Var)).o;
            qyd0 qyd0Var2 = ajb0.a;
            r0g0.a(x0g0Var, null, zhdVar, 0.0f, j060.d(0.0f, ((zib0) aVar.O(qyd0Var2)).d, ((zib0) aVar.O(qyd0Var2)).d, ((zib0) aVar.O(qyd0Var2)).d), j2, j, ju8.a, aVar, (iIntValue & 14) | 805306368, 197);
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
