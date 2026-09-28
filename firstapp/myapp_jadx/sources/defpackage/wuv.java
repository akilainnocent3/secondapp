package defpackage;

import androidx.compose.runtime.a;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class wuv implements iaj<gwr, Integer, a, Integer, Unit> {
    public final /* synthetic */ List a;
    public final /* synthetic */ v0u b;
    public final /* synthetic */ az3 c;
    public final /* synthetic */ ytw d;

    public wuv(List list, v0u v0uVar, az3 az3Var, ytw ytwVar) {
        this.a = list;
        this.b = v0uVar;
        this.c = az3Var;
        this.d = ytwVar;
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
            cuv cuvVar = (cuv) this.a.get(iIntValue);
            aVar2.N(1589228533);
            Object objY = aVar2.y();
            if (objY == a.C0041a.a) {
                objY = new uuv(this.d);
                aVar2.r(objY);
            }
            xuv.b(cuvVar, this.b, this.c, (Function1) objY, aVar2, 3072);
            aVar2.H();
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
