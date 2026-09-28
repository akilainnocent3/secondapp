package com.sportybet.plugin.realsports.data;

import android.net.Uri;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.b6c;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u000bHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007Ê\u0001\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0017"}, d2 = {"Lcom/sportybet/plugin/realsports/data/LiveStreamDataBetGenius;", "Lcom/sportybet/plugin/realsports/data/LiveStreamData;", "enableScreenProtection", "", "<init>", "(Z)V", "getEnableScreenProtection", "()Z", "getUri", "Landroid/net/Uri;", "countryCode", "", AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, "deviceId", "host", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class LiveStreamDataBetGenius extends LiveStreamData {
    public static final int $stable = 8;
    private final boolean enableScreenProtection;

    public LiveStreamDataBetGenius(boolean z) {
        super(LiveStreamData.STREAM_PLATFORM_BET_GENIUS, 0.5625f);
        this.enableScreenProtection = z;
    }

    public static /* synthetic */ LiveStreamDataBetGenius copy$default(LiveStreamDataBetGenius liveStreamDataBetGenius, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = liveStreamDataBetGenius.enableScreenProtection;
        }
        return liveStreamDataBetGenius.copy(z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getEnableScreenProtection() {
        return this.enableScreenProtection;
    }

    public final LiveStreamDataBetGenius copy(boolean enableScreenProtection) {
        return new LiveStreamDataBetGenius(enableScreenProtection);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof LiveStreamDataBetGenius) && this.enableScreenProtection == ((LiveStreamDataBetGenius) other).enableScreenProtection;
    }

    public final boolean getEnableScreenProtection() {
        return this.enableScreenProtection;
    }

    public final Uri getUri(String countryCode, String eventId, String deviceId, String host) {
        countryCode.getClass();
        eventId.getClass();
        deviceId.getClass();
        host.getClass();
        Uri uriBuild = new Uri.Builder().scheme("https").authority(host).appendPath(countryCode).appendPath("wv").appendPath(AnalyticsParam.SOCIAL_ACTION_TYPE_MEDIA).appendPath(LiveStreamData.STREAM_PLATFORM_BET_GENIUS).appendQueryParameter(AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, eventId).appendQueryParameter("deviceId", deviceId).build();
        uriBuild.getClass();
        return uriBuild;
    }

    public int hashCode() {
        return Boolean.hashCode(this.enableScreenProtection);
    }

    public String toString() {
        return b6c.a("LiveStreamDataBetGenius(enableScreenProtection=", ")", this.enableScreenProtection);
    }
}
