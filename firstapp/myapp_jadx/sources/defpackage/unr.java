package defpackage;

import androidx.compose.runtime.a;
import com.sportygames.vip.data.LastHeroStandingListResponse;
import com.sportygames.vip.data.LastHeroStandingWinner;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes8.dex */
public final class unr implements iaj<gwr, Integer, a, Integer, Unit> {
    public final /* synthetic */ List a;

    public unr(List list) {
        this.a = list;
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
            LastHeroStandingListResponse lastHeroStandingListResponse = (LastHeroStandingListResponse) this.a.get(iIntValue);
            aVar2.N(594517132);
            if (lastHeroStandingListResponse.getWinners().size() > 1) {
                aVar2.N(594524726);
                vnr.h(lastHeroStandingListResponse, null, iIntValue % 2 == 0, aVar2, 0);
                aVar2.H();
            } else {
                aVar2.N(594899640);
                LastHeroStandingWinner lastHeroStandingWinner = (LastHeroStandingWinner) CollectionsKt.firstOrNull(lastHeroStandingListResponse.getWinners());
                if (lastHeroStandingWinner == null) {
                    aVar2.N(594899639);
                    aVar2.H();
                } else {
                    aVar2.N(594899640);
                    vnr.f(lastHeroStandingWinner, lastHeroStandingListResponse.getCashoutCoefficient(), iIntValue % 2 == 0, null, aVar2, 0);
                    aVar2.H();
                    Unit unit = Unit.a;
                }
                aVar2.H();
            }
            aVar2.H();
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
