package defpackage;

import androidx.compose.runtime.a;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class yba0 implements iaj<gwr, Integer, a, Integer, Unit> {
    public final /* synthetic */ List a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ Function2 c;

    public yba0(List list, Function1 function1, Function2 function2) {
        this.a = list;
        this.b = function1;
        this.c = function2;
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
            d9a0 d9a0Var = (d9a0) this.a.get(iIntValue);
            aVar2.N(1465765887);
            iba0.a(new umz(16.0f, 8.0f, 16.0f, 8.0f), d9a0Var.a, d9a0Var.b, d9a0Var.c, d9a0Var.d, d9a0Var.g, d9a0Var.e, d9a0Var.f, this.b, this.c, aVar2, 6);
            aVar2.H();
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
