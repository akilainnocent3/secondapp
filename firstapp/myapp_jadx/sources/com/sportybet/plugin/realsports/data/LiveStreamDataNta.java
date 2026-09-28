package com.sportybet.plugin.realsports.data;

/* JADX INFO: loaded from: classes7.dex */
public class LiveStreamDataNta extends LiveStreamData {
    public boolean playInDotCom;
    public String url;

    public LiveStreamDataNta(String str, boolean z) {
        super(LiveStreamData.PLATFORM_NTA, 0.5625f);
        this.url = str;
        this.playInDotCom = z;
    }
}
