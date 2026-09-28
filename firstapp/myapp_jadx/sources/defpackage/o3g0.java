package defpackage;

import com.appsflyer.internal.x;

/* JADX INFO: loaded from: classes8.dex */
public final class o3g0 {
    public static String a(String str, String str2, String str3, String str4, long j) {
        str2.getClass();
        str3.getClass();
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
