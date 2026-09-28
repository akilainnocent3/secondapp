package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class mtq implements iaj<gwr, Integer, a, Integer, Unit> {
    public final /* synthetic */ List a;
    public final /* synthetic */ cuq.d b;
    public final /* synthetic */ Function1 c;

    public mtq(List list, cuq.d dVar, Function1 function1) {
        this.a = list;
        this.b = dVar;
        this.c = function1;
    }

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
            kwv kwvVar = (kwv) this.a.get(iIntValue);
            aVar2.N(1886075209);
            gwrVar2.getClass();
            d dVarH = g3w.h(j.g(gwrVar2.c(d.a.b, yi0.e(300, 0, null, 6), yi0.d(0.0f, 200.0f, null, 5), yi0.e(300, 0, null, 6)), 1.0f), "mission_card_" + kwvVar.a);
            boolean zContains = this.b.b.contains(Integer.valueOf(kwvVar.a));
            Function1 function1 = this.c;
            boolean zM = aVar2.M(function1) | aVar2.A(kwvVar);
            Object objY = aVar2.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (zM || objY == c0042a) {
                objY = new ftq(function1, kwvVar);
                aVar2.r(objY);
            }
            Function0 function0 = (Function0) objY;
            boolean zM2 = aVar2.M(function1) | aVar2.A(kwvVar);
            Object objY2 = aVar2.y();
            if (zM2 || objY2 == c0042a) {
                objY2 = new gtq(function1, kwvVar);
                aVar2.r(objY2);
            }
            Function0 function2 = (Function0) objY2;
            boolean zM3 = aVar2.M(function1) | aVar2.A(kwvVar);
            Object objY3 = aVar2.y();
            if (zM3 || objY3 == c0042a) {
                objY3 = new htq(function1, kwvVar);
                aVar2.r(objY3);
            }
            Function1 function3 = (Function1) objY3;
            boolean zM4 = aVar2.M(function1);
            Object objY4 = aVar2.y();
            if (zM4 || objY4 == c0042a) {
                objY4 = new itq(function1);
                aVar2.r(objY4);
            }
            Function0 function4 = (Function0) objY4;
            boolean zM5 = aVar2.M(function1);
            Object objY5 = aVar2.y();
            if (zM5 || objY5 == c0042a) {
                objY5 = new jtq(function1);
                aVar2.r(objY5);
            }
            axt.a(dVarH, kwvVar, zContains, function0, function2, function3, function4, (Function1) objY5, aVar2, 0);
            aVar2.H();
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
