package com.twilio.voice;

/* JADX INFO: loaded from: classes8.dex */
public class RemoteAudioTrackStats extends RemoteTrackStats {
    public final int audioLevel;
    public final int jitter;
    public final float mos;

    public RemoteAudioTrackStats(String str, int i, String str2, String str3, double d, long j, int i2, int i3, int i4, float f) {
        super(str, i, str2, str3, d, j, i2);
        this.audioLevel = i3;
        this.jitter = i4;
        this.mos = f;
    }
}
