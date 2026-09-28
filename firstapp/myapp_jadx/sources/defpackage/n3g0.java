package defpackage;

import com.appsflyer.internal.x;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportygames.commons.SportyGamesManager;

/* JADX INFO: loaded from: classes7.dex */
public final class n3g0 {
    public static String a(String str, String str2, String str3, String str4, String str5) {
        str2.getClass();
        str3.getClass();
        str4.getClass();
        int iHashCode = str.hashCode();
        if (iHashCode == -1128525059) {
            return !str.equals("rain_status") ? "" : tx5.a("/topic/rain-", str5, "-", str4, "-status");
        }
        if (iHashCode == -139919088) {
            return !str.equals("campaign") ? "" : tx5.a("/topic/", str2, "-user-", str4, "-campaign-activity");
        }
        if (iHashCode != 3492756 || !str.equals("rain")) {
            return "";
        }
        StringBuilder sbA = ux5.a("/topic/rain-", str2, "-", str3, "-");
        sbA.append(str4);
        return sbA.toString();
    }

    public static String b(String str, String str2, String str3) {
        str2.getClass();
        switch (str.hashCode()) {
            case -1530406791:
                if (str.equals("lastRoundMultiplier")) {
                    return (k3g0.a("int") || k3g0.a("mx") || k3g0.a("cm") || k3g0.a("mz") || k3g0.a("cd")) ? "/topic/lastRoundMultiplier-app" : tug.a("/topic/", str2, "-lastRoundMultiplier-app");
                }
                return "/topic/(countryCode)-multiplier-app";
            case -146262849:
                if (str.equals("round_info")) {
                    return (k3g0.a("int") || k3g0.a("mx") || k3g0.a("cm") || k3g0.a("mz") || k3g0.a("cd")) ? "/topic/round-app" : tug.a("/topic/", str2, "-round-app");
                }
                return "/topic/(countryCode)-multiplier-app";
            case -65813353:
                return !str.equals("room1_info") ? "/topic/(countryCode)-multiplier-app" : tx5.a("/topic/", str2, "-user-", SportyGamesManager.getInstance().getUserId(), "-info-app");
            case -4725152:
                return !str.equals("round_bet") ? "/topic/(countryCode)-multiplier-app" : tx5.a("/topic/country-", str2, "-currency-", str3, "-round-bet-app");
            case 761049175:
                return !str.equals("fbg_threshold") ? "/topic/(countryCode)-multiplier-app" : tug.a("/topic/country-", str2, "-change-fbg-threshold");
            case 1265073601:
                if (str.equals("multiplier")) {
                    return (k3g0.a("int") || k3g0.a("mx") || k3g0.a("cm") || k3g0.a("mz") || k3g0.a("cd")) ? "/topic/multiplier-app" : tug.a("/topic/", str2, "-multiplier-app");
                }
                return "/topic/(countryCode)-multiplier-app";
            case 1417029871:
                if (!str.equals("rain_claim_response")) {
                    return "/topic/(countryCode)-multiplier-app";
                }
                String userId = SportyGamesManager.getInstance().getUserId();
                StringBuilder sbA = ux5.a("/topic/rain-claim-response-country-", str2, "-currency-", str3, "-user-");
                sbA.append(userId);
                return sbA.toString();
            case 1481625679:
                if (!str.equals(AnalyticsParam.EVENT_PARAM_EXCEPTION)) {
                    return "/topic/(countryCode)-multiplier-app";
                }
                String userId2 = SportyGamesManager.getInstance().getUserId();
                return (k3g0.a("int") || k3g0.a("mx") || k3g0.a("cm") || k3g0.a("mz") || k3g0.a("cd")) ? tug.a("/topic/user-", userId2, "-biz-exception-app") : tx5.a("/topic/user-", userId2, "-country-", str2, "-biz-exception-app");
            default:
                return "/topic/(countryCode)-multiplier-app";
        }
    }

    public static String c(String str, String str2, String str3, String str4, long j) {
        str2.getClass();
        switch (str.hashCode()) {
            case -642181155:
                return !str.equals("rank_data") ? "" : pr0.a(x.a(j, "/topic/", str2, "-tournament-"), "-user-", str3, "-rank-data");
            case 485517100:
                if (!str.equals("leaderboard_data")) {
                    return "";
                }
                StringBuilder sbA = x.a(j, "/topic/", str2, "-tournament-");
                sbA.append("-leaderboard-data-app");
                return sbA.toString();
            case 1123192132:
                return !str.equals("tournament_info") ? "" : uf80.a(ux5.a("/topic/", str2, "-gameBizId-", str4, "-user-"), str3, "-tournament-info");
            case 1642539784:
                return !str.equals("tournament_status") ? "" : tug.a("/topic/", str2, "-tournament-status");
            default:
                return "";
        }
    }
}
