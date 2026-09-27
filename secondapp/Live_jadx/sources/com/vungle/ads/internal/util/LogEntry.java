package com.vungle.ads.internal.util;

import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class LogEntry {

    @m
    private String adSource;

    @m
    private Boolean adoEnabled;

    @m
    private String creativeId;

    @m
    private String eventId;

    @m
    private String mediationName;

    @m
    private Boolean partialDownloadEnabled;

    @m
    private String placementRefId;

    @m
    private String vmVersion;

    private final int hashCode(String str) {
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!m0.g(LogEntry.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        m0.n(obj, "null cannot be cast to non-null type com.vungle.ads.internal.util.LogEntry");
        LogEntry logEntry = (LogEntry) obj;
        return m0.g(this.placementRefId, logEntry.placementRefId) && m0.g(this.creativeId, logEntry.creativeId) && m0.g(this.eventId, logEntry.eventId) && m0.g(this.adSource, logEntry.adSource) && m0.g(this.mediationName, logEntry.mediationName) && m0.g(this.vmVersion, logEntry.vmVersion) && m0.g(this.partialDownloadEnabled, logEntry.partialDownloadEnabled) && m0.g(this.adoEnabled, logEntry.adoEnabled);
    }

    @m
    public final String getAdSource$vungle_ads_release() {
        return this.adSource;
    }

    @m
    public final Boolean getAdoEnabled$vungle_ads_release() {
        return this.adoEnabled;
    }

    @m
    public final String getCreativeId$vungle_ads_release() {
        return this.creativeId;
    }

    @m
    public final String getEventId$vungle_ads_release() {
        return this.eventId;
    }

    @m
    public final String getMediationName$vungle_ads_release() {
        return this.mediationName;
    }

    @m
    public final Boolean getPartialDownloadEnabled$vungle_ads_release() {
        return this.partialDownloadEnabled;
    }

    @m
    public final String getPlacementRefId$vungle_ads_release() {
        return this.placementRefId;
    }

    @m
    public final String getVmVersion$vungle_ads_release() {
        return this.vmVersion;
    }

    public final void setAdSource$vungle_ads_release(@m String str) {
        this.adSource = str;
    }

    public final void setAdoEnabled$vungle_ads_release(@m Boolean bool) {
        this.adoEnabled = bool;
    }

    public final void setCreativeId$vungle_ads_release(@m String str) {
        this.creativeId = str;
    }

    public final void setEventId$vungle_ads_release(@m String str) {
        this.eventId = str;
    }

    public final void setMediationName$vungle_ads_release(@m String str) {
        this.mediationName = str;
    }

    public final void setPartialDownloadEnabled$vungle_ads_release(@m Boolean bool) {
        this.partialDownloadEnabled = bool;
    }

    public final void setPlacementRefId$vungle_ads_release(@m String str) {
        this.placementRefId = str;
    }

    public final void setVmVersion$vungle_ads_release(@m String str) {
        this.vmVersion = str;
    }

    @l
    public String toString() {
        return "LogEntry(placementRefId=" + this.placementRefId + ", creativeId=" + this.creativeId + ", eventId=" + this.eventId + ", adSource=" + this.adSource + ", mediationName=" + this.mediationName + ", vmVersion=" + this.vmVersion + ", partialDownloadEnabled=" + this.partialDownloadEnabled + ", adoEnabled=" + this.adoEnabled + ')';
    }

    public int hashCode() {
        int iHashCode = ((((((((((hashCode(this.placementRefId) * 31) + hashCode(this.creativeId)) * 31) + hashCode(this.eventId)) * 31) + hashCode(this.adSource)) * 31) + hashCode(this.mediationName)) * 31) + hashCode(this.vmVersion)) * 31;
        Boolean bool = this.partialDownloadEnabled;
        int iHashCode2 = (iHashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.adoEnabled;
        return iHashCode2 + (bool2 != null ? bool2.hashCode() : 0);
    }
}
