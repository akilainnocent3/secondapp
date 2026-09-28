package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import com.sportygames.common.network.campaign.Campaign;
import com.sportygames.common.network.campaign.CampaignTier;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final class q66 implements iaj<gwr, Integer, a, Integer, Unit> {
    public final /* synthetic */ List a;
    public final /* synthetic */ db6 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Campaign f;
    public final /* synthetic */ Function0 i;
    public final /* synthetic */ CampaignTier v;

    public q66(List list, db6 db6Var, boolean z, int i, boolean z2, Campaign campaign, Function0 function0, CampaignTier campaignTier) {
        this.a = list;
        this.b = db6Var;
        this.c = z;
        this.d = i;
        this.e = z2;
        this.f = campaign;
        this.i = function0;
        this.v = campaignTier;
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
            CampaignTier campaignTier = (CampaignTier) this.a.get(iIntValue);
            aVar2.N(-1650033745);
            int tierLevel = campaignTier.getTierLevel();
            d.a aVar3 = d.a.b;
            if (tierLevel == 1) {
                aVar2.N(-1650044441);
                ty0.a(aVar2, j.i(aVar3, fw20.a(R.dimen._8sdp, aVar2)));
            } else {
                aVar2.N(-1661721614);
            }
            aVar2.H();
            int tierLevel2 = campaignTier.getTierLevel();
            int i2 = this.d;
            boolean z = tierLevel2 == i2;
            Campaign campaign = this.f;
            fa6.b(this.b, null, campaignTier, this.c, z, this.e, campaign.getTierIdRecentlyGiftCollected(), this.i, aVar2, 0);
            if (campaignTier.getTierLevel() == i2) {
                aVar2.N(-1649272634);
                int iX = CollectionsKt.X(campaign.getTiers(), this.v);
                if (iX == -1) {
                    iX = 1;
                }
                ty0.a(aVar2, j.i(aVar3, fw20.a(R.dimen._160sdp, aVar2) * iX));
                ty0.a(aVar2, j.i(aVar3, fw20.a(R.dimen._8sdp, aVar2)));
            } else {
                aVar2.N(-1661721614);
            }
            aVar2.H();
            aVar2.H();
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
