package com.sportybet.plugin.realsports.data;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class SwipeBetPreferenceRequest {
    public List<String> preferredLeagues;
    public List<String> preferredMarkets;
    public SwipeBetOddsFilterRequest preferredOdds;

    public static class Builder {
        private SwipeBetPreferenceRequest swipeBetPreferenceRequest = new SwipeBetPreferenceRequest();

        public SwipeBetPreferenceRequest build() {
            return this.swipeBetPreferenceRequest;
        }

        public Builder setLeagues(List<String> list) {
            this.swipeBetPreferenceRequest.preferredLeagues = list;
            return this;
        }

        public Builder setMarkets(List<String> list) {
            this.swipeBetPreferenceRequest.preferredMarkets = list;
            return this;
        }

        public Builder setOddsFilter(SwipeBetOddsFilterRequest swipeBetOddsFilterRequest) {
            this.swipeBetPreferenceRequest.preferredOdds = swipeBetOddsFilterRequest;
            return this;
        }
    }
}
