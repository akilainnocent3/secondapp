package com.sportybet.plugin.realsports.data;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007Ê\u0001\f\b\t\u0012\b\b\n\u0012\u0004\b\u0003\u0010\u0000¨\u0006\b"}, d2 = {"Lcom/sportybet/plugin/realsports/data/LiveStreamDataBeter;", "Lcom/sportybet/plugin/realsports/data/LiveStreamData;", "broadCastUrl", "", "<init>", "(Ljava/lang/String;)V", "getBroadCastUrl", "()Ljava/lang/String;", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class LiveStreamDataBeter extends LiveStreamData {
    public static final int $stable = 8;
    private final String broadCastUrl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveStreamDataBeter(String str) {
        super(LiveStreamData.PLATFORM_BETER, 0.5625f);
        str.getClass();
        this.broadCastUrl = str;
    }

    public final String getBroadCastUrl() {
        return this.broadCastUrl;
    }
}
