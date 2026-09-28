package defpackage;

import android.os.Bundle;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportygames.commons.SportyGamesManager;

/* JADX INFO: loaded from: classes7.dex */
public final class wz {
    public static void a(String str, String str2, String... strArr) {
        zj60 bridge;
        str.getClass();
        Bundle bundle = new Bundle();
        String[] strArr2 = hph.a.get(str);
        if (strArr2 != null && strArr2.length == strArr.length) {
            int length = strArr.length;
            for (int i = 0; i < length; i++) {
                bundle.putString(strArr2[i], strArr[i]);
            }
        }
        if (str2 != null) {
            bundle.putString(AnalyticsParam.GAMES_RECOMMENDATION_GAME_NAME, str2);
        } else {
            bundle.putString("user_state", SportyGamesManager.getInstance().getUser() != null ? "logged-in" : "non logged-in");
        }
        SportyGamesManager sportyGamesManager = SportyGamesManager.getInstance();
        if (sportyGamesManager == null || (bridge = sportyGamesManager.getBridge()) == null) {
            return;
        }
        ((bk60) bridge).a(str, bundle);
    }
}
