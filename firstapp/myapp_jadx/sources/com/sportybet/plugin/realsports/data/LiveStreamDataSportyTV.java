package com.sportybet.plugin.realsports.data;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fÊ\u0001\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\u0003\u0010\u0000¨\u0006\r"}, d2 = {"Lcom/sportybet/plugin/realsports/data/LiveStreamDataSportyTV;", "Lcom/sportybet/plugin/realsports/data/LiveStreamData;", "url", "", "playInDotCom", "", "isEPL", "<init>", "(Ljava/lang/String;ZZ)V", "getUrl", "()Ljava/lang/String;", "getPlayInDotCom", "()Z", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class LiveStreamDataSportyTV extends LiveStreamData {
    public static final int $stable = 8;
    private final boolean playInDotCom;
    private final String url;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveStreamDataSportyTV(String str, boolean z, boolean z2) {
        super(z2 ? LiveStreamData.PLATFORM_SPORTY_TV_EPL : LiveStreamData.PLATFORM_SPORTY_TV, 0.5625f);
        str.getClass();
        this.url = str;
        this.playInDotCom = z;
    }

    public final boolean getPlayInDotCom() {
        return this.playInDotCom;
    }

    public final String getUrl() {
        return this.url;
    }
}
