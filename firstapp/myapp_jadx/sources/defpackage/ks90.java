package defpackage;

import androidx.compose.runtime.a;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class ks90 implements iaj<gwr, Integer, a, Integer, Unit> {
    public final /* synthetic */ List a;
    public final /* synthetic */ Function1 b;

    public ks90(List list, Function1 function1) {
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
            br90 br90Var = (br90) this.a.get(iIntValue);
            aVar2.N(1853540553);
            Function1 function1 = this.b;
            boolean zM = aVar2.M(function1);
            Object objY = aVar2.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (zM || objY == c0042a) {
                objY = new gs90(function1);
                aVar2.r(objY);
            }
            Function1 function2 = (Function1) objY;
            boolean zM2 = aVar2.M(function1);
            Object objY2 = aVar2.y();
            if (zM2 || objY2 == c0042a) {
                objY2 = new hs90(function1);
                aVar2.r(objY2);
            }
            Function0 function0 = (Function0) objY2;
            boolean zM3 = aVar2.M(function1);
            Object objY3 = aVar2.y();
            if (zM3 || objY3 == c0042a) {
                objY3 = new is90(function1);
                aVar2.r(objY3);
            }
            ar90.a(br90Var, function2, function0, (Function1) objY3, aVar2, 8);
            aVar2.H();
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
