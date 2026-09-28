package com.sportybet.plugin.realsports.data;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class LiveStreamDataSocialMedia extends LiveStreamData {
    public boolean firstShown;
    public List<SocialMediaStreamData> items;

    public LiveStreamDataSocialMedia(List<SocialMediaStreamData> list, boolean z) {
        super(LiveStreamData.PLATFORM_SOCIAL_MEDIA, 0.5625f);
        this.items = list;
        this.firstShown = z;
    }
}
