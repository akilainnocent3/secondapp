package com.twilio.voice;

/* JADX INFO: loaded from: classes8.dex */
public class LocalAudioTrackStats extends LocalTrackStats {
    public final int audioLevel;
    public final int jitter;

    public LocalAudioTrackStats(String str, int i, String str2, String str3, double d, long j, int i2, long j2, int i3, int i4) {
        super(str, i, str2, str3, d, j, i2, j2);
        this.audioLevel = i3;
        this.jitter = i4;
    }
}
