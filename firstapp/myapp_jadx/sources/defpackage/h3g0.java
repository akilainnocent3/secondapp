package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sporty.android.core.model.patron.KYCBannerItem;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.crash.remote.models.Topics;

/* JADX INFO: loaded from: classes7.dex */
public final class h3g0 implements tzm {
    @Override // defpackage.tzm
    public final String b(brb brbVar, String str, String str2) {
        brbVar.getClass();
        str.getClass();
        str2.getClass();
        switch (brbVar.ordinal()) {
            case 0:
                Topics topics = Topics.INSTANCE;
                String country = SportyGamesManager.getInstance().getCountry();
                if (country == null) {
                    country = "";
                }
                return topics.getTopics("multiplier", country, "");
            case 1:
                return Topics.INSTANCE.getTopics("room1_info", str, "");
            case 2:
                return Topics.INSTANCE.getTopics("round_bet", str, str2);
            case 3:
                Topics topics2 = Topics.INSTANCE;
                String country2 = SportyGamesManager.getInstance().getCountry();
                if (country2 == null) {
                    country2 = "";
                }
                return topics2.getTopics("lastRoundMultiplier", country2, "");
            case 4:
                Topics topics3 = Topics.INSTANCE;
                String country3 = SportyGamesManager.getInstance().getCountry();
                return topics3.getTopics("round_info", country3 != null ? country3 : "", null);
            case 5:
                Topics topics4 = Topics.INSTANCE;
                String country4 = SportyGamesManager.getInstance().getCountry();
                if (country4 == null) {
                    country4 = "";
                }
                return topics4.getTopics(AnalyticsParam.EVENT_PARAM_EXCEPTION, country4, "");
            case 6:
                return Topics.INSTANCE.getTopics("rain_claim_response", str, str2);
            case 7:
                return Topics.INSTANCE.sendCashOut();
            case 8:
                return Topics.INSTANCE.sendPlaceBet();
            case 9:
                return Topics.INSTANCE.sendClaimRain();
            case 10:
                return Topics.INSTANCE.sendCancelBet();
            case 11:
                return "/queue/bet/over-under";
            case 12:
                return "/queue/bet/range";
            case 13:
                return "/queue/cashout/over-under";
            case 14:
                return "/queue/cashout/range";
            case 15:
                return "/queue/lost-bets";
            case 16:
                return Topics.INSTANCE.getTopics("level_config_updates_app", str, "");
            case 17:
                return Topics.INSTANCE.getTopics("user_level_progress_app", str, "");
            case 18:
                return Topics.INSTANCE.getTopics("bonus_top_wins", str, str2);
            case 19:
                return Topics.INSTANCE.getVipTopics("last_hero_standing", str);
            case 20:
                return Topics.INSTANCE.getVipTopics("last_hero_standing_winner", str);
            case 21:
                return Topics.INSTANCE.getVipTopics("turbo_progress", str);
            case 22:
                return Topics.INSTANCE.getVipTopics("vip_stakesafe", str);
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                return "/queue/settle";
            case 24:
                return Topics.INSTANCE.getVipTopics("vip_status", str);
            case KYCBannerItem.STATUS_DEPRECATE /* 25 */:
                return Topics.INSTANCE.getVipTopics("vip_feature", str);
            default:
                return "";
        }
    }
}
