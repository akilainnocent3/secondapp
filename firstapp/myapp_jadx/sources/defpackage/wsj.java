package defpackage;

import com.sportygames.compose.campaign.models.CampaignTopicResponse;
import com.sportygames.pocketrocket.component.PrUserBet;
import com.sportygames.pocketrocket.model.response.BetDetails;
import fuj.c;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class wsj implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wsj(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CampaignTopicResponse campaignTopicResponse;
        int i = this.a;
        boolean z = true;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                fuj fujVar = (fuj) obj2;
                f1e0 f1e0Var = (f1e0) obj;
                f1e0Var.getClass();
                String str = f1e0Var.c;
                if (str != null) {
                    try {
                        campaignTopicResponse = (CampaignTopicResponse) new eal().e(str, CampaignTopicResponse.class);
                    } catch (Exception e) {
                        e.printStackTrace();
                        campaignTopicResponse = null;
                    }
                    break;
                } else {
                    campaignTopicResponse = null;
                }
                try {
                    CampaignTopicResponse campaignTopicResponseD = fujVar.d.d();
                    int tierLevel = campaignTopicResponseD != null ? campaignTopicResponseD.getTierLevel() : 0;
                    if (campaignTopicResponse != null) {
                        campaignTopicResponse.setTierUpgraded((tierLevel == 0 || tierLevel == campaignTopicResponse.getTierLevel()) ? false : true);
                    }
                    CampaignTopicResponse campaignTopicResponseD2 = fujVar.d.d();
                    boolean z2 = campaignTopicResponseD2 != null && campaignTopicResponseD2.isLastCampaignTier() && Intrinsics.g(campaignTopicResponseD2.getUserActivityStatus(), "ACTIVE");
                    boolean z3 = campaignTopicResponse != null && campaignTopicResponse.isLastCampaignTier() && Intrinsics.g(campaignTopicResponse.getUserActivityStatus(), "ACTIVE");
                    if (z2 || !z3) {
                        z = false;
                    }
                    if (campaignTopicResponse != null) {
                        campaignTopicResponse.setCampaignCompletedJustNow(z);
                    }
                    break;
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                try {
                    CampaignTopicResponse campaignTopicResponseD3 = fujVar.d.d();
                    float tierProgress = campaignTopicResponseD3 != null ? campaignTopicResponseD3.getTierProgress() : 0.0f;
                    if (campaignTopicResponse != null) {
                        campaignTopicResponse.setLastProgress(tierProgress);
                    }
                    break;
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
                fujVar.d.j(campaignTopicResponse);
                if (campaignTopicResponse != null) {
                    ej5.c(o8i0.d(fujVar), null, null, fujVar.new c(campaignTopicResponse, null), 3);
                }
                return Unit.a;
            default:
                BetDetails betDetails = (BetDetails) obj;
                int i2 = PrUserBet.i;
                betDetails.getClass();
                List<BetDetails> list = ((PrUserBet) obj2).d;
                if (list == null || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        if (((BetDetails) it.next()).getBetId() == betDetails.getBetId()) {
                        }
                    }
                    z = false;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }
}
