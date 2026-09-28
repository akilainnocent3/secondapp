package defpackage;

import com.sportygames.common.network.campaign.CampaignsData;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.compose.campaign.models.CampaignTopicResponse;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ia6 implements Function1 {
    public final /* synthetic */ db6 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ fuj c;
    public final /* synthetic */ ibs d;
    public final /* synthetic */ bq40 e;

    public /* synthetic */ ia6(db6 db6Var, boolean z, fuj fujVar, ibs ibsVar, bq40 bq40Var) {
        this.a = db6Var;
        this.b = z;
        this.c = fujVar;
        this.d = ibsVar;
        this.e = bq40Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ssw<bbs.a> sswVar;
        final CampaignsData campaignsData = (CampaignsData) obj;
        campaignsData.getClass();
        boolean zG = Intrinsics.g(campaignsData.getRewardType(), "STACKER_GAME");
        db6 db6Var = this.a;
        boolean zG2 = Intrinsics.g(db6Var.i, "BONUS_VAULT");
        if ((this.b && zG) || zG2) {
            db6Var.A1(campaignsData.getActiveOrPausedCampaignId(), false);
        }
        CampaignTopicResponse campaignTopicResponse = new CampaignTopicResponse(campaignsData.getActiveOrPausedCampaignId(), campaignsData.getCampaignStatus(), campaignsData.getUserActivityStatus(), 0, campaignsData.getUser().getId(), campaignsData.getActiveOrPausedCampaignTier().getTierLevel(), campaignsData.isLastCampaignTier(), campaignsData.getTierProgress(), campaignsData.getActiveOrPausedCampaignTier().getId(), "ACTIVITY_INIT", 0L, false, false, 0.0f, 14336, null);
        final fuj fujVar = this.c;
        if (fujVar != null) {
            fujVar.d.j(campaignTopicResponse);
        }
        if (fujVar != null && fujVar.A && ((Intrinsics.g(campaignsData.getCampaignStatus(), "ACTIVE") || Intrinsics.g(campaignsData.getCampaignStatus(), "PAUSED")) && campaignsData.getActiveOrPausedCampaignId() > 0)) {
            String country = SportyGamesManager.getInstance().getCountry();
            if (country == null) {
                country = "";
            }
            String lowerCase = country.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            String strValueOf = String.valueOf(campaignsData.getUser().getId());
            if (lowerCase.equals("int")) {
                lowerCase = "br";
            }
            fujVar.B1(strValueOf, lowerCase);
        }
        if (fujVar != null) {
            fujVar.d.j(campaignTopicResponse);
        }
        if ((Intrinsics.g(campaignsData.getCampaignStatus(), "ACTIVE") || Intrinsics.g(campaignsData.getCampaignStatus(), "PAUSED")) && campaignsData.getActiveOrPausedCampaignId() > 0 && fujVar != null && (sswVar = fujVar.e) != null) {
            final bq40 bq40Var = this.e;
            sswVar.f(this.d, new ra6.a(new Function1() { // from class: ka6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    CampaignsData campaignsData2 = campaignsData;
                    bbs.a aVar = (bbs.a) obj2;
                    try {
                        bbs.a aVar2 = bbs.a.a;
                        bq40 bq40Var2 = bq40Var;
                        fuj fujVar2 = fujVar;
                        if (aVar == aVar2) {
                            bq40Var2.a = 0;
                            String country2 = SportyGamesManager.getInstance().getCountry();
                            if (country2 == null) {
                                country2 = "";
                            }
                            String lowerCase2 = country2.toLowerCase(Locale.ROOT);
                            lowerCase2.getClass();
                            String strValueOf2 = String.valueOf(campaignsData2.getUser().getId());
                            if (lowerCase2.equals("int")) {
                                lowerCase2 = "br";
                            }
                            fujVar2.B1(strValueOf2, lowerCase2);
                        } else if (bq40Var2.a <= 3) {
                            fujVar2.x1();
                            bq40Var2.a++;
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    return Unit.a;
                }
            }));
        }
        return Unit.a;
    }
}
