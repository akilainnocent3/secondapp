package defpackage;

import androidx.compose.runtime.a;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class bec0 implements iaj<gwr, Integer, a, Integer, Unit> {
    public final /* synthetic */ List a;
    public final /* synthetic */ Function2 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ Function1 e;

    public bec0(List list, Function2 function2, String str, Function1 function1, Function1 function3) {
        this.a = list;
        this.b = function2;
        this.c = str;
        this.d = function1;
        this.e = function3;
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
            tfc0 tfc0Var = (tfc0) this.a.get(iIntValue);
            aVar2.N(-876532870);
            Function2 function2 = this.b;
            boolean zM = aVar2.M(function2);
            String str = this.c;
            boolean zM2 = zM | aVar2.M(str);
            Object objY = aVar2.y();
            if (zM2 || objY == a.C0041a.a) {
                objY = new zdc0(str, function2);
                aVar2.r(objY);
            }
            efc0.a(tfc0Var, (Function1) objY, this.d, this.e, aVar2, 0);
            aVar2.H();
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
