package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class guk implements iaj<gwr, Integer, a, Integer, Unit> {
    public final /* synthetic */ List a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ ovk d;

    public guk(List list, Function1 function1, Function1 function2, ovk ovkVar) {
        this.a = list;
        this.b = function1;
        this.c = function2;
        this.d = ovkVar;
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
            eok eokVar = (eok) this.a.get(iIntValue);
            aVar2.N(-1971395360);
            gvk.d(eokVar, this.b, this.c, aVar2, 0);
            if (iIntValue != b.j(this.d.b)) {
                aVar2.N(-1971154150);
                ty0.a(aVar2, j.i(d.a.b, 8.0f));
                aVar2.H();
            } else {
                aVar2.N(-1971087841);
                aVar2.H();
            }
            aVar2.H();
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
