package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class yyr implements gaj<gwr, a, Integer, Unit> {
    public final /* synthetic */ op8 a;
    public final /* synthetic */ int b;

    public yyr(int i, op8 op8Var) {
        this.a = op8Var;
        this.b = i;
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
            this.a.d(gwrVar2, Integer.valueOf(this.b), aVar2, Integer.valueOf(iIntValue & 14));
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
