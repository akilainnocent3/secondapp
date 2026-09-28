package com.twilio.voice;

/* JADX INFO: loaded from: classes8.dex */
public abstract class LocalTrackStats extends BaseTrackStats {
    public final long bytesSent;
    public final int packetsSent;
    public final long roundTripTime;

    public LocalTrackStats(String str, int i, String str2, String str3, double d, long j, int i2, long j2) {
        super(str, i, str2, str3, d);
        this.bytesSent = j;
        this.packetsSent = i2;
        this.roundTripTime = j2;
    }
}
