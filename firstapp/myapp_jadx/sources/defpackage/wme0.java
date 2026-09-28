package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class wme0 implements iaj<gwr, Integer, a, Integer, Unit> {
    public final /* synthetic */ List a;
    public final /* synthetic */ Function1 b;

    public wme0(List list, Function1 function1) {
        this.a = list;
        this.b = function1;
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
            aoe0.a aVar3 = (aoe0.a) this.a.get(iIntValue);
            aVar2.N(369593259);
            zme0.c(d.a.b, aVar3, this.b, aVar2, 6);
            ac8.f(0, 1, aVar2, null);
            aVar2.H();
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
