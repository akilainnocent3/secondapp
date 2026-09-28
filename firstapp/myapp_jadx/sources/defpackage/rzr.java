package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class rzr implements gaj<gwr, a, Integer, Unit> {
    public final /* synthetic */ op8 a;

    public rzr(op8 op8Var) {
        this.a = op8Var;
    }

    @Override // defpackage.gaj
    public final Unit invoke(gwr gwrVar, a aVar, Integer num) {
        gwr gwrVar2 = gwrVar;
        a aVar2 = aVar;
        int iIntValue = num.intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= aVar2.M(gwrVar2) ? 4 : 2;
        }
        if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
            this.a.d(gwrVar2, 0, aVar2, Integer.valueOf((iIntValue & 14) | 48));
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
