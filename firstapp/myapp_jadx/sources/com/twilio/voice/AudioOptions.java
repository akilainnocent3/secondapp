package com.twilio.voice;

import androidx.recyclerview.widget.r;
import defpackage.rr1;

/* JADX INFO: loaded from: classes8.dex */
public class AudioOptions {
    private final int audioJitterBufferMaxPackets;
    private final int audioJitterBufferMinDelayMs;
    private final boolean autoGainControl;
    private final boolean echoCancellation;
    private final boolean highpassFilter;
    private final boolean noiseSuppression;

    public static final class Builder {
        private boolean echoCancellation = true;
        private boolean autoGainControl = true;
        private boolean noiseSuppression = true;
        private boolean highpassFilter = true;
        private int audioJitterBufferMaxPackets = r.d.DEFAULT_DRAG_ANIMATION_DURATION;
        private int audioJitterBufferMinDelayMs = 0;

        public Builder audioJitterBufferMaxPackets(int i) {
            if (i < 20) {
                i = 20;
            }
            this.audioJitterBufferMaxPackets = i;
            return this;
        }

        public Builder audioJitterBufferMinDelayMs(int i) {
            if (i < 0) {
                i = 0;
            }
            this.audioJitterBufferMinDelayMs = i;
            return this;
        }

        public Builder autoGainControl(boolean z) {
            this.autoGainControl = z;
            return this;
        }

        public AudioOptions build() {
            return new AudioOptions(this, 0);
        }

        public Builder echoCancellation(boolean z) {
            this.echoCancellation = z;
            return this;
        }

        public Builder highpassFilter(boolean z) {
            this.highpassFilter = z;
            return this;
        }

        public Builder noiseSuppression(boolean z) {
            this.noiseSuppression = z;
            return this;
        }
    }

    private AudioOptions(Builder builder) {
        this.echoCancellation = builder.echoCancellation;
        this.autoGainControl = builder.autoGainControl;
        this.noiseSuppression = builder.noiseSuppression;
        this.highpassFilter = builder.highpassFilter;
        this.audioJitterBufferMaxPackets = builder.audioJitterBufferMaxPackets;
        this.audioJitterBufferMinDelayMs = builder.audioJitterBufferMinDelayMs;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof AudioOptions)) {
            AudioOptions audioOptions = (AudioOptions) obj;
            if (this.echoCancellation == audioOptions.echoCancellation && this.autoGainControl == audioOptions.autoGainControl && this.noiseSuppression == audioOptions.noiseSuppression && this.highpassFilter == audioOptions.highpassFilter && this.audioJitterBufferMaxPackets == audioOptions.audioJitterBufferMaxPackets && this.audioJitterBufferMinDelayMs == audioOptions.audioJitterBufferMinDelayMs) {
                return true;
            }
        }
        return false;
    }

    public int getAudioJitterBufferMaxPackets() {
        return this.audioJitterBufferMaxPackets;
    }

    public int getAudioJitterBufferMinDelayMs() {
        return this.audioJitterBufferMinDelayMs;
    }

    public boolean isAutoGainControlEnabled() {
        return this.autoGainControl;
    }

    public boolean isEchoCancellationEnabled() {
        return this.echoCancellation;
    }

    public boolean isHighpassFilterEnabled() {
        return this.highpassFilter;
    }

    public boolean isNoiseSuppressionEnabled() {
        return this.noiseSuppression;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioOptions{echoCancellation=");
        sb.append(this.echoCancellation);
        sb.append(", autoGainControl=");
        sb.append(this.autoGainControl);
        sb.append(", noiseSuppression=");
        sb.append(this.noiseSuppression);
        sb.append(", highpassFilter=");
        sb.append(this.highpassFilter);
        sb.append(", audioJitterBufferMaxPackets=");
        sb.append(this.audioJitterBufferMaxPackets);
        sb.append(", audioJitterBufferMinDelayMs=");
        return rr1.b(sb, this.audioJitterBufferMinDelayMs, '}');
    }

    public /* synthetic */ AudioOptions(Builder builder, int i) {
        this(builder);
    }
}
