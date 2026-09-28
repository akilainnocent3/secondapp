package com.sportybet.plugin.myfavorite.util;

import androidx.transition.nfj.CaBJCMnsV;
import com.sporty.android.core.model.tracking.AnalyticsParam;

/* JADX INFO: loaded from: classes2.dex */
public enum MyFavoriteTypeEnum {
    NONE("none"),
    SPORT("sport"),
    LEAGUE(AnalyticsParam.LEAGUE_PARAM_LEAGUE),
    TEAM("team"),
    SEARCH_TEAM(CaBJCMnsV.mQfOEKr),
    ACTION_BAR_SEARCH_TEAM("action_bar_search_team"),
    MARKET(AnalyticsParam.MARKET_PARAM_MARKET),
    MY_ODDS_RANGE("my_odds_range"),
    DEFAULT_STAKE("default_stake"),
    QUICK_ADD_STAKE("quick_add_stake"),
    STAKE("stake");

    private String code;

    MyFavoriteTypeEnum(String str) {
        this.code = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.code;
    }
}
