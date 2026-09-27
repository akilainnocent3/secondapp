package com.inmobi.media.ads.network.common.model;

import androidx.annotation.Keep;
import com.inmobi.media.Ue;
import java.util.LinkedList;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
@Keep
public final class AdSet {

    @l
    private String adSetId = "";

    @l
    @Ue
    private final LinkedList<Ad> ads = new LinkedList<>();
    private long expiry = -1;
    private final boolean isPod;
    private boolean isRewarded;
    private final boolean logEnabled;
    private int podSuccessCount;

    @m
    private final String transactionId;

    @l
    public final String getAdSetId() {
        return this.adSetId;
    }

    @l
    public final LinkedList<Ad> getAds() {
        return this.ads;
    }

    public final long getExpiry() {
        return this.expiry;
    }

    public final boolean getLogEnabled() {
        return this.logEnabled;
    }

    public final int getPodSuccessCount() {
        return this.podSuccessCount;
    }

    @m
    public final String getTransactionId() {
        return this.transactionId;
    }

    public final boolean isPod() {
        return this.isPod;
    }

    public final boolean isRewarded() {
        return this.isRewarded;
    }

    public final void setExpiry(long j10) {
        this.expiry = j10;
    }
}
