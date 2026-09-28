package com.sportybet.plugin.realsports.data;

/* JADX INFO: loaded from: classes7.dex */
public class LiveStreamDataBetRadar extends LiveStreamData {
    public String streamSingleBitRate;

    public LiveStreamDataBetRadar(String str) {
        super(LiveStreamData.PLATFORM_BET_RADAR, 0.5625f);
        this.streamSingleBitRate = str;
    }
}
