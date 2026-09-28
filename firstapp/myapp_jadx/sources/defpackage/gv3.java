package defpackage;

import androidx.compose.runtime.a;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class gv3 implements iaj<gwr, Integer, a, Integer, Unit> {
    public final /* synthetic */ List a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ Function2 d;
    public final /* synthetic */ Function2 e;
    public final /* synthetic */ Function1 f;
    public final /* synthetic */ Function1 i;
    public final /* synthetic */ Function2 v;

    public gv3(List list, Function1 function1, Function1 function2, Function2 function3, Function2 function4, Function1 function5, Function1 function6, Function2 function7) {
        this.a = list;
        this.b = function1;
        this.c = function2;
        this.d = function3;
        this.e = function4;
        this.f = function5;
        this.i = function6;
        this.v = function7;
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
            ov3 ov3Var = (ov3) this.a.get(iIntValue);
            aVar2.N(2027868538);
            nv3.a(ov3Var, this.b, this.c, this.d, this.e, this.f, this.i, this.v, aVar2, 8);
            aVar2.H();
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
