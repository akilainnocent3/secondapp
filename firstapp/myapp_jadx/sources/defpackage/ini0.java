package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class ini0 implements iaj<gwr, Integer, a, Integer, Unit> {
    public final /* synthetic */ List a;
    public final /* synthetic */ ucn b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ Function1 i;

    public ini0(List list, ucn ucnVar, Function1 function1, Function1 function2, Function1 function3, Function0 function0, Function1 function4) {
        this.a = list;
        this.b = ucnVar;
        this.c = function1;
        this.d = function2;
        this.e = function3;
        this.f = function0;
        this.i = function4;
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
            aVar2.N(760047920);
            d dVarH = g3w.h(j.g(d.a.b, 1.0f), "mission_card_" + kwvVar.a);
            boolean zContains = this.b.contains(Integer.valueOf(kwvVar.a));
            Function1 function1 = this.c;
            boolean zM = aVar2.M(function1) | aVar2.A(kwvVar);
            Object objY = aVar2.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (zM || objY == c0042a) {
                objY = new eni0(function1, kwvVar);
                aVar2.r(objY);
            }
            Function0 function0 = (Function0) objY;
            Function1 function2 = this.d;
            boolean zM2 = aVar2.M(function2) | aVar2.A(kwvVar);
            Object objY2 = aVar2.y();
            if (zM2 || objY2 == c0042a) {
                objY2 = new fni0(function2, kwvVar);
                aVar2.r(objY2);
            }
            axt.a(dVarH, kwvVar, zContains, function0, (Function0) objY2, this.e, this.f, this.i, aVar2, 0);
            aVar2.H();
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
