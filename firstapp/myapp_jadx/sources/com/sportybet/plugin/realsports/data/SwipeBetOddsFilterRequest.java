package com.sportybet.plugin.realsports.data;

/* JADX INFO: loaded from: classes7.dex */
public class SwipeBetOddsFilterRequest {
    boolean isMax;
    double max;
    double min;

    public static class Builder {
        private SwipeBetOddsFilterRequest oddsFilterParam = new SwipeBetOddsFilterRequest();

        public SwipeBetOddsFilterRequest build() {
            return this.oddsFilterParam;
        }

        public Builder setIsMax(boolean z) {
            this.oddsFilterParam.isMax = z;
            return this;
        }

        public Builder setMax(double d) {
            this.oddsFilterParam.max = d;
            return this;
        }

        public Builder setMin(double d) {
            this.oddsFilterParam.min = d;
            return this;
        }
    }
}
