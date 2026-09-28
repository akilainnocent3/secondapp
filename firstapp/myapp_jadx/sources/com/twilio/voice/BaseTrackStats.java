package com.twilio.voice;

/* JADX INFO: loaded from: classes8.dex */
public abstract class BaseTrackStats {
    public final String codec;
    public final int packetsLost;
    public final String ssrc;
    public final double timestamp;
    public final String trackId;

    public BaseTrackStats(String str, int i, String str2, String str3, double d) {
        this.trackId = str;
        this.packetsLost = i;
        this.codec = str2;
        this.ssrc = str3;
        this.timestamp = d;
    }
}
