package defpackage;

import androidx.compose.runtime.a;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final class ly70 implements iaj<gwr, Integer, a, Integer, Unit> {
    public final /* synthetic */ List a;
    public final /* synthetic */ ved b;
    public final /* synthetic */ v5b c;

    public ly70(List list, ved vedVar, v5b v5bVar) {
        this.a = list;
        this.b = vedVar;
        this.c = v5bVar;
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
        boolean z = true;
        if (aVar2.q(i & 1, (i & 147) != 146)) {
            vt70 vt70Var = (vt70) this.a.get(iIntValue);
            aVar2.N(686458227);
            ved vedVar = this.b;
            boolean z2 = vedVar.k() == iIntValue;
            v5b v5bVar = this.c;
            boolean zA = aVar2.A(v5bVar) | aVar2.M(vedVar);
            if ((((i & 112) ^ 48) <= 32 || !aVar2.d(iIntValue)) && (i & 48) != 32) {
                z = false;
            }
            boolean z3 = zA | z;
            Object objY = aVar2.y();
            if (z3 || objY == a.C0041a.a) {
                objY = new jy70(v5bVar, vedVar, iIntValue);
                aVar2.r(objY);
            }
            my70.a(vt70Var, z2, (Function0) objY, aVar2, 0);
            aVar2.H();
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
