package defpackage;

import androidx.compose.runtime.a;
import com.sportygames.crash.remote.models.TopBets;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final class qqb0 implements iaj<gwr, Integer, a, Integer, Unit> {
    public final /* synthetic */ List a;
    public final /* synthetic */ gw2 b;

    public qqb0(List list, gw2 gw2Var) {
        this.a = list;
        this.b = gw2Var;
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
            TopBets topBets = (TopBets) this.a.get(iIntValue);
            aVar2.N(-1935041125);
            lqb0.a(topBets, this.b, aVar2, 0);
            aVar2.H();
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
