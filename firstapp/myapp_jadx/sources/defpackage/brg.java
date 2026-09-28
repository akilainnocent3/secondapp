package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsParam;

/* JADX INFO: loaded from: classes7.dex */
public enum brg {
    FEATURED_MATCH("home_featured_match"),
    LIVE_PANEL("home_live"),
    HIGHLIGHTS("home_highlights"),
    TODAY("home_today"),
    PRE_MATCH_EVENT_DETAILS("event_details_pre_match"),
    LIVE_EVENT_DETAILS("event_details_live"),
    LIVE_PAGE("live_page"),
    SPORTS_PAGE("sports_page"),
    TOURNAMENT_HOME_PANEL("home_tournament_panel"),
    TOURNAMENT_PAGE("tournament_page"),
    TOURNAMENT_PRE_MATCH("tournament_pre_match"),
    TOURNAMENT_GAMES("tournament_games"),
    TOURNAMENT_LIVE("tournament_live"),
    TOURNAMENT_FAVOURITE_TEAM("tournament_favourite_team"),
    /* JADX INFO: Fake field, exist only in values array */
    SEARCH(AnalyticsParam.SEARCH_KEYWORD);

    public final String a;

    brg(String str) {
        this.a = str;
    }
}
