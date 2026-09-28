package com.sportybet.plugin.realsports.data;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class SwipeBetPreferenceVO {
    List<String> leagues;
    List<String> markets;
    SwipeBetOddsFilterRequest oddsFilter;

    public static class Builder {
        private SwipeBetPreferenceVO swipeBetPreferenceVO = new SwipeBetPreferenceVO();

        public SwipeBetPreferenceVO build() {
            return this.swipeBetPreferenceVO;
        }

        public Builder setLeagues(List<String> list) {
            this.swipeBetPreferenceVO.leagues = list;
            return this;
        }

        public Builder setMarkets(List<String> list) {
            this.swipeBetPreferenceVO.markets = list;
            return this;
        }

        public Builder setOddsFilter(SwipeBetOddsFilterRequest swipeBetOddsFilterRequest) {
            this.swipeBetPreferenceVO.oddsFilter = swipeBetOddsFilterRequest;
            return this;
        }
    }
}
