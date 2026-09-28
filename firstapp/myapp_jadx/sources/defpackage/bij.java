package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.feature.worldcup.config.domain.model.WorldCupRelatedGame;
import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes7.dex */
public final class bij implements pdd0 {
    public final WorldCupRelatedGame a;
    public final String b = "featuredgames__game__click";

    public bij(WorldCupRelatedGame worldCupRelatedGame) {
        this.a = worldCupRelatedGame;
    }

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        WorldCupRelatedGame worldCupRelatedGame = this.a;
        return kpu.d(new Pair(AnalyticsParam.GAMES_RECOMMENDATION_GAME_NAME, worldCupRelatedGame.getName()), new Pair("game_category", worldCupRelatedGame.getCategory()), new Pair("source", "home_tournament_panel"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bij)) {
            return false;
        }
        bij bijVar = (bij) obj;
        return this.a.equals(bijVar.a) && this.b.equals(bijVar.b);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "GameClick(game=" + this.a + ", name=" + this.b + ")";
    }
}
