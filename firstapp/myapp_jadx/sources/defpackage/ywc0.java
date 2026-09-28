package defpackage;

import androidx.compose.runtime.a;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class ywc0 implements iaj<gwr, Integer, a, Integer, Unit> {
    public final /* synthetic */ List a;
    public final /* synthetic */ Function2 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ Function2 e;
    public final /* synthetic */ Function2 f;

    public ywc0(List list, Function2 function2, String str, Function1 function1, Function2 function3, Function2 function4) {
        this.a = list;
        this.b = function2;
        this.c = str;
        this.d = function1;
        this.e = function3;
        this.f = function4;
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
            vyc0 vyc0Var = (vyc0) this.a.get(iIntValue);
            aVar2.N(1575065414);
            Function2 function2 = this.b;
            boolean zM = aVar2.M(function2);
            String str = this.c;
            boolean zM2 = zM | aVar2.M(str);
            Object objY = aVar2.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (zM2 || objY == c0042a) {
                objY = new vwc0(str, function2);
                aVar2.r(objY);
            }
            Function1 function1 = (Function1) objY;
            Function2 function3 = this.f;
            boolean zM3 = aVar2.M(function3) | aVar2.M(str);
            Object objY2 = aVar2.y();
            if (zM3 || objY2 == c0042a) {
                objY2 = new wwc0(str, function3);
                aVar2.r(objY2);
            }
            fyc0.a(vyc0Var, function1, this.d, this.e, (Function1) objY2, aVar2, 0);
            aVar2.H();
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
