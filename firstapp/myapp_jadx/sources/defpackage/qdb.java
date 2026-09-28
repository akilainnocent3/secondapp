package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.lobby.remote.models.GameDetails;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class qdb implements Function1 {
    public final /* synthetic */ fgb a;

    public /* synthetic */ qdb(fgb fgbVar) {
        this.a = fgbVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        double dRint;
        xnh0 user;
        Long l = (Long) obj;
        l.getClass();
        fgb fgbVar = this.a;
        l1z l1zVarE1 = fgbVar.e1();
        GameDetails gameDetails = fgbVar.i;
        Double dValueOf = null;
        Integer id = gameDetails != null ? gameDetails.getId() : null;
        String str = (String) ((x5a0) fgbVar.c1().v).getValue();
        SportyGamesManager sportyGamesManager = SportyGamesManager.getInstance();
        String str2 = (sportyGamesManager == null || (user = sportyGamesManager.getUser()) == null) ? null : user.b;
        Context context = fgbVar.getContext();
        if (context != null) {
            Double d = fie.a;
            if (d != null) {
                dRint = d.doubleValue();
            } else {
                Object systemService = context.getSystemService("activity");
                systemService.getClass();
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                ((ActivityManager) systemService).getMemoryInfo(memoryInfo);
                dRint = Math.rint((memoryInfo.totalMem / 1.073741824E9d) * 100.0d) / 100.0d;
                fie.a = Double.valueOf(dRint);
            }
            dValueOf = Double.valueOf(dRint);
        }
        hym.a(l1zVarE1.a, "bet_place_latency", kpu.f(new Pair("latency", l), new Pair(AnalyticsParam.EVENT_PARAM_GAME_ID, id), new Pair(AnalyticsParam.GAMES_RECOMMENDATION_GAME_NAME, str), new Pair("UID", str2), new Pair("RAM", dValueOf), new Pair("user_network_quality", fgbVar.F), new Pair("variant", "Native")), 12);
        return Unit.a;
    }
}
