package com.sportybet.plugin.realsports.prematch.data;

import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX¦\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lcom/sportybet/plugin/realsports/prematch/data/PreMatchSectionData;", "", "viewType", "", "getViewType", "()I", "selectedMarket", "Lcom/sportybet/plugin/realsports/type/RegularMarketRule;", "getSelectedMarket", "()Lcom/sportybet/plugin/realsports/type/RegularMarketRule;", "setSelectedMarket", "(Lcom/sportybet/plugin/realsports/type/RegularMarketRule;)V", "filteredMarketList", "", "Lcom/sportybet/plugin/realsports/data/Market;", "getFilteredMarketList", "()Ljava/util/List;", "setFilteredMarketList", "(Ljava/util/List;)V", "Companion", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface PreMatchSectionData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final int LIVE_EVENT_IN_PRE_MATCH = 1;
    public static final int PRE_MATCH_EVENT = 2;
    public static final int PRE_MATCH_LOAD_MORE = 3;
    public static final int PRE_MATCH_MARKET_TITLE = 4;
    public static final int TOURNAMENT_TITLE_BAR = 0;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/sportybet/plugin/realsports/prematch/data/PreMatchSectionData$Companion;", "", "<init>", "()V", "TOURNAMENT_TITLE_BAR", "", "LIVE_EVENT_IN_PRE_MATCH", "PRE_MATCH_EVENT", "PRE_MATCH_LOAD_MORE", "PRE_MATCH_MARKET_TITLE", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int LIVE_EVENT_IN_PRE_MATCH = 1;
        public static final int PRE_MATCH_EVENT = 2;
        public static final int PRE_MATCH_LOAD_MORE = 3;
        public static final int PRE_MATCH_MARKET_TITLE = 4;
        public static final int TOURNAMENT_TITLE_BAR = 0;

        private Companion() {
        }
    }

    List<Market> getFilteredMarketList();

    RegularMarketRule getSelectedMarket();

    int getViewType();

    void setFilteredMarketList(List<? extends Market> list);

    void setSelectedMarket(RegularMarketRule regularMarketRule);
}
