package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportygames.commons.SportyGamesManager;

/* JADX INFO: loaded from: classes7.dex */
public final class l3g0 {
    public static String a(String str, String str2, String str3) {
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
            case 1265073601:
                if (str.equals("multiplier")) {
                    return (k3g0.a("int") || k3g0.a("mx") || k3g0.a("cm") || k3g0.a("mz") || k3g0.a("cd")) ? "/topic/multiplier-app" : tug.a("/topic/", str2, "-multiplier-app");
                }
                return "/topic/(countryCode)-multiplier-app";
            case 1481625679:
                if (!str.equals(AnalyticsParam.EVENT_PARAM_EXCEPTION)) {
                    return "/topic/(countryCode)-multiplier-app";
                }
                String userId = SportyGamesManager.getInstance().getUserId();
                return (k3g0.a("int") || k3g0.a("mx") || k3g0.a("cm") || k3g0.a("mz") || k3g0.a("cd")) ? tug.a("/topic/user-", userId, "-biz-exception-app") : tx5.a("/topic/user-", userId, "-country-", str2, "-biz-exception-app");
            default:
                return "/topic/(countryCode)-multiplier-app";
        }
    }
}
