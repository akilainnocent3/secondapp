package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportygames.commons.SportyGamesManager;
import kotlin.Pair;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class cgb {
    public static void a(l1z l1zVar, String str, String str2, String str3) {
        hym.a(l1zVar.a, "game_play__multiple__requests", kpu.f(new Pair(AnalyticsParam.GAMES_RECOMMENDATION_GAME_NAME, str), new Pair("multiple_requests_case_api", str2), new Pair("multiple_requests_data", str3), new Pair(AnalyticsParam.EVENT_PARAM_USER_ID, SportyGamesManager.getInstance().getUserId())), 12);
    }
}
