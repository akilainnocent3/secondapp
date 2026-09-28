package com.twilio.voice;

/* JADX INFO: loaded from: classes8.dex */
class MonitorThresholds {
    private int maxDurationConstantAudioInputLevel;
    private int maxDurationConstantAudioOutputLevel;
    private int maxJitterThreshold;
    private int maxPacketsLostFraction;
    private int maxRttThreshold;
    private int minMosScoreThreshhold;

    public static class Builder {
        private int minMosScoreThreshhold = -1;
        private int maxDurationConstantAudioInputLevel = -1;
        private int maxDurationConstantAudioOutputLevel = -1;
        private int maxPacketsLostFraction = -1;
        private int maxJitterThreshold = -1;
        private int maxRttThreshold = -1;

        public Builder audioConstantInputLevelSampleCounter(int i) {
            this.maxDurationConstantAudioInputLevel = i;
            return this;
        }

        public Builder audioConstantOutputLevelSampleCounter(int i) {
            this.maxDurationConstantAudioOutputLevel = i;
            return this;
        }

        public MonitorThresholds build() {
            return new MonitorThresholds(this, 0);
        }

        public Builder jitterThreshold(int i) {
            this.maxJitterThreshold = i;
            return this;
        }

        public Builder mosScoreThreshhold(int i) {
            this.minMosScoreThreshhold = i;
            return this;
        }

        public Builder packetsLostFraction(int i) {
            this.maxPacketsLostFraction = i;
            return this;
        }

        public Builder rttThreshold(int i) {
            this.maxRttThreshold = i;
            return this;
        }
    }

    private MonitorThresholds(Builder builder) {
        this.minMosScoreThreshhold = builder.minMosScoreThreshhold;
        this.maxDurationConstantAudioOutputLevel = builder.maxDurationConstantAudioOutputLevel;
        this.maxDurationConstantAudioInputLevel = builder.maxDurationConstantAudioInputLevel;
        this.maxPacketsLostFraction = builder.maxPacketsLostFraction;
        this.maxJitterThreshold = builder.maxJitterThreshold;
        this.maxRttThreshold = builder.maxRttThreshold;
    }

    public int getMaxDurationConstantAudioInputLevel() {
        return this.maxDurationConstantAudioInputLevel;
    }

    public int getMaxDurationConstantAudioOutputLevel() {
        return this.maxDurationConstantAudioOutputLevel;
    }

    public int getMaxJitterThreshold() {
        return this.maxJitterThreshold;
    }

    public int getMaxPacketsLostFraction() {
        return this.maxPacketsLostFraction;
    }

    public int getMaxRttThreshold() {
        return this.maxRttThreshold;
    }

    public int getMinMosScoreThreshhold() {
        return this.minMosScoreThreshhold;
    }

    public /* synthetic */ MonitorThresholds(Builder builder, int i) {
        this(builder);
    }
}
