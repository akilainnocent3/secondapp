package com.twilio.voice;

/* JADX INFO: loaded from: classes8.dex */
public class OpusCodec extends AudioCodec {
    static int DEFAULT_BITRATE = 0;
    static int MAX_BITRATE = 510000;
    static int MIN_BITRATE = 6000;
    public static final String NAME = "opus";
    private int maxAverageBitrate;
    private boolean useDtx;

    public OpusCodec(int i, boolean z) {
        super(NAME);
        this.maxAverageBitrate = DEFAULT_BITRATE;
        this.useDtx = false;
        if (i >= MIN_BITRATE && i <= MAX_BITRATE) {
            this.maxAverageBitrate = i;
        }
        this.useDtx = z;
    }

    public int getMaxAverageBitrate() {
        return this.maxAverageBitrate;
    }

    public boolean isDtxEnabled() {
        return this.useDtx;
    }

    public OpusCodec(int i) {
        super(NAME);
        this.maxAverageBitrate = DEFAULT_BITRATE;
        this.useDtx = false;
        if (i < MIN_BITRATE || i > MAX_BITRATE) {
            return;
        }
        this.maxAverageBitrate = i;
    }

    public OpusCodec() {
        super(NAME);
        this.maxAverageBitrate = DEFAULT_BITRATE;
        this.useDtx = false;
    }
}
