package defpackage;

import com.sportygames.common.network.campaign.CampaignsData;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.compose.campaign.models.CampaignTopicResponse;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class veb implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ veb(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String lowerCase;
        Object value;
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                fgb fgbVar = (fgb) obj3;
                String str = (String) obj2;
                CampaignsData campaignsData = (CampaignsData) obj;
                campaignsData.getClass();
                if (Intrinsics.g(campaignsData.getRewardType(), "STACKER_GAME") || Intrinsics.g(campaignsData.getRewardType(), "BONUS_VAULT")) {
                    ((db6) fgbVar.f2.getValue()).A1(campaignsData.getActiveOrPausedCampaignId(), false);
                }
                fgbVar.d1().d.j(new CampaignTopicResponse(campaignsData.getActiveOrPausedCampaignId(), campaignsData.getCampaignStatus(), campaignsData.getUserActivityStatus(), 0, campaignsData.getUser().getId(), campaignsData.getActiveOrPausedCampaignTier().getTierLevel(), campaignsData.isLastCampaignTier(), campaignsData.getTierProgress(), campaignsData.getActiveOrPausedCampaignTier().getId(), "ACTIVITY_INIT", 0L, false, false, 0.0f, 14336, null));
                if ((Intrinsics.g(campaignsData.getCampaignStatus(), "ACTIVE") || Intrinsics.g(campaignsData.getCampaignStatus(), "PAUSED")) && campaignsData.getActiveOrPausedCampaignId() > 0) {
                    fuj fujVarD1 = fgbVar.d1();
                    String strValueOf = String.valueOf(campaignsData.getUser().getId());
                    if (Intrinsics.g(str, "int")) {
                        lowerCase = "br";
                    } else {
                        String country = SportyGamesManager.getInstance().getCountry();
                        if (country == null) {
                            country = "";
                        }
                        lowerCase = country.toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                    }
                    fujVarD1.B1(strValueOf, lowerCase);
                }
                break;
            default:
                Function2 function2 = (Function2) obj2;
                wwd0 wwd0Var = ((weu) obj3).a;
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, (sdu) function2.invoke((sdu) value, obj)));
                break;
        }
        return Unit.a;
    }
}
