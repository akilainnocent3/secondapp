package defpackage;

import com.sportygames.common.network.campaign.Campaign;
import com.sportygames.common.network.campaign.CampaignTier;
import com.sportygames.common.network.campaign.CampaignTierCriteria;
import com.sportygames.compose.campaign.models.CampaignTopicResponse;
import com.sportygames.crash.models.bet.BetContainerState;
import com.sportygames.crash.remote.models.MultiplierResponse;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/* JADX INFO: loaded from: classes7.dex */
public final class vs4 {
    public static final /* synthetic */ int a = 0;
    public static final /* synthetic */ int b = 0;
    public static final /* synthetic */ int c = 0;

    public static final CampaignTier a(Campaign campaign, CampaignTopicResponse campaignTopicResponse) {
        Object next;
        Iterator<T> it = campaign.getTiers().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((CampaignTier) next).getTierLevel() == campaignTopicResponse.getTierLevel()) {
                return (CampaignTier) next;
            }
        }
        next = null;
        return (CampaignTier) next;
    }

    public static final CampaignTierCriteria b(Campaign campaign, CampaignTopicResponse campaignTopicResponse) {
        Object obj;
        Object next;
        List<CampaignTierCriteria> criteria;
        Iterator<T> it = campaign.getTiers().iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((CampaignTier) next).getTierLevel() != campaignTopicResponse.getTierLevel());
        CampaignTier campaignTier = (CampaignTier) next;
        if (campaignTier == null || (criteria = campaignTier.getCriteria()) == null) {
            return null;
        }
        for (Object obj2 : criteria) {
            CampaignTierCriteria campaignTierCriteria = (CampaignTierCriteria) obj2;
            if (Intrinsics.g(campaignTierCriteria.getType(), "BET_COUNT") || Intrinsics.g(campaignTierCriteria.getType(), "STAKE_AMOUNT")) {
                obj = obj2;
                break;
            }
        }
        return (CampaignTierCriteria) obj;
    }

    public static void c(ul2 ul2Var, long j, boolean z, int i, Function1 function1) {
        ul2Var.getClass();
        wwd0 wwd0Var = ul2Var.a;
        if (((BetContainerState) wwd0Var.getValue()).getBetPlaced() || ((BetContainerState) wwd0Var.getValue()).getBetInProgress() || !z || ((BetContainerState) wwd0Var.getValue()).getRoundId() != j) {
            return;
        }
        function1.invoke(Integer.valueOf(i));
    }

    public static final double d(MultiplierResponse multiplierResponse, ytw ytwVar, ul2 ul2Var) {
        Double dH;
        Double dH2;
        wwd0 wwd0Var = ul2Var.a;
        ytw<HashMap<Long, Boolean>> ytwVar2 = ul2Var.d;
        double dDoubleValue = 0.0d;
        if (((BetContainerState) wwd0Var.getValue()).getBetPlaced() && Intrinsics.g(multiplierResponse.getMessageType(), "ROUND_ONGOING") && !((BetContainerState) wwd0Var.getValue()).getCashoutInProgress()) {
            x5a0 x5a0Var = (x5a0) ytwVar2;
            if ((!Intrinsics.g(((HashMap) x5a0Var.getValue()).get(Long.valueOf(multiplierResponse.getRoundId())), Boolean.TRUE) || ((HashMap) x5a0Var.getValue()).isEmpty()) && multiplierResponse.getRoundId() == ((BetContainerState) wwd0Var.getValue()).getRoundId()) {
                String currentMultiplier = multiplierResponse.getCurrentMultiplier();
                double dDoubleValue2 = (currentMultiplier == null || (dH2 = b.h(currentMultiplier)) == null) ? 0.0d : ul2Var.O.getValue().doubleValue() * dH2.doubleValue();
                String currentMultiplier2 = multiplierResponse.getCurrentMultiplier();
                if (currentMultiplier2 != null && (dH = b.h(currentMultiplier2)) != null) {
                    dDoubleValue = dH.doubleValue();
                }
                ytwVar.setValue(Double.valueOf(dDoubleValue));
                return dDoubleValue2;
            }
        }
        return 0.0d;
    }
}
