package com.startapp.sdk.internal;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class xi {
    private static final int DEFAULT_MAX_END_CARDS = 2;

    @Nullable
    private String admtag;

    @Nullable
    private String campaign_id;

    @Nullable
    private String endcard;

    @Nullable
    private Integer maxEndCards = 2;

    @Nullable
    private String partnerName;

    @Nullable
    private String partnerResponse;
    private boolean recordHops;
    private boolean skipFailed;

    @Nullable
    private Long skipafter;

    @Nullable
    private Long skipmin;

    @Nullable
    private String ttl_sec;

    @Nullable
    private String vasttag;

    @Nullable
    public String getAdmTag() {
        return this.admtag;
    }

    @Nullable
    public String getCampaignId() {
        return this.campaign_id;
    }

    @Nullable
    public String getEndCard() {
        return this.endcard;
    }

    @Nullable
    public Integer getMaxEndCards() {
        return this.maxEndCards;
    }

    @Nullable
    public String getPartnerName() {
        return this.partnerName;
    }

    @Nullable
    public String getPartnerResponse() {
        return this.partnerResponse;
    }

    @Nullable
    public Long getSkipafter() {
        return this.skipafter;
    }

    @Nullable
    public Long getSkipmin() {
        return this.skipmin;
    }

    @Nullable
    public String getTtlSec() {
        return this.ttl_sec;
    }

    @Nullable
    public String getVastTag() {
        return this.vasttag;
    }

    public boolean isRecordHops() {
        return this.recordHops;
    }

    public boolean isSkipFailed() {
        return this.skipFailed;
    }
}
