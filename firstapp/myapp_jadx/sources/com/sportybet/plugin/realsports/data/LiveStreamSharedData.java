package com.sportybet.plugin.realsports.data;

/* JADX INFO: loaded from: classes7.dex */
public class LiveStreamSharedData {
    private static LiveStreamSharedData instance;
    private LiveStreamData liveStreamData;

    private LiveStreamSharedData() {
    }

    public static LiveStreamSharedData getInstance() {
        LiveStreamSharedData liveStreamSharedData;
        LiveStreamSharedData liveStreamSharedData2 = instance;
        if (liveStreamSharedData2 != null) {
            return liveStreamSharedData2;
        }
        synchronized (LiveStreamSharedData.class) {
            try {
                liveStreamSharedData = instance;
                if (liveStreamSharedData == null) {
                    liveStreamSharedData = new LiveStreamSharedData();
                    instance = liveStreamSharedData;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return liveStreamSharedData;
    }

    public <T extends LiveStreamData> T getLiveStreamData(Class<T> cls) {
        if (cls.isInstance(this.liveStreamData)) {
            return cls.cast(this.liveStreamData);
        }
        return null;
    }

    public void setLiveStreamData(LiveStreamData liveStreamData) {
        this.liveStreamData = liveStreamData;
    }
}
