package com.sportybet.plugin.realsports.data;

/* JADX INFO: loaded from: classes7.dex */
public abstract class LiveStreamData {
    public static final float DEFAULT_PLAYER_RATIO = 0.5625f;
    public static final String PLATFORM_BETER = "beter";
    public static final String PLATFORM_BET_RADAR = "betRadar";
    public static final String PLATFORM_IGAME_MEDIA = "igame-media";
    public static final String PLATFORM_NTA = "nigeria-television-authority";
    public static final String PLATFORM_SOCIAL_MEDIA = "social-media";
    public static final String PLATFORM_SPORTY_TV = "sporty-tv";
    public static final String PLATFORM_SPORTY_TV_EPL = "sporty-tv-epl";
    public static final String PLATFORM_TEN_TX = "ten-tx";
    public static final String STREAM_PLATFORM_BET_GENIUS = "bet-genius";
    public String platform;
    public float playerRatio;

    public LiveStreamData(String str, float f) {
        this.platform = str;
        this.playerRatio = f;
    }
}
