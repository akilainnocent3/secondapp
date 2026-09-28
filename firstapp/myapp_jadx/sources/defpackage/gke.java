package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final class gke implements iaj<gwr, Integer, a, Integer, Unit> {
    public final /* synthetic */ qcn a;
    public final /* synthetic */ Function1 b;

    public gke(qcn qcnVar, Function1 function1) {
        this.a = qcnVar;
        this.b = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iaj
    public final Unit d(gwr gwrVar, Integer num, a aVar, Integer num2) {
        int i;
        gwr gwrVar2 = gwrVar;
        int iIntValue = num.intValue();
        a aVar2 = aVar;
        int iIntValue2 = num2.intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (aVar2.M(gwrVar2) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= aVar2.d(iIntValue) ? 32 : 16;
        }
        if (aVar2.q(i & 1, (i & 147) != 146)) {
            fp20 fp20Var = (fp20) this.a.get(iIntValue);
            aVar2.N(804739911);
            String str = fp20Var.i;
            if (str == null) {
                str = "";
            }
            String str2 = fp20Var.b;
            if (str2 == null) {
                str2 = "";
            }
            d dVarI = j.i(d.a.b, 64.0f);
            Function1 function1 = this.b;
            boolean zM = aVar2.M(function1) | aVar2.A(fp20Var);
            Object objY = aVar2.y();
            if (zM || objY == a.C0041a.a) {
                objY = new cke(function1, fp20Var);
                aVar2.r(objY);
            }
            mw90.a(str, str2, androidx.compose.foundation.d.d(dVarI, false, null, null, (Function0) objY, 15), null, null, d0b.a.c, null, aVar2, 1572864, 1976);
            aVar2.H();
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
