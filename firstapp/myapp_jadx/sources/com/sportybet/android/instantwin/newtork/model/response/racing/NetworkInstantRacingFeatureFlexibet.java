package com.sportybet.android.instantwin.newtork.model.response.racing;

import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.tvh;
import defpackage.wi1;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004R%\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR%\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR%\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eÊ\u0001\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u001a"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/racing/NetworkInstantRacingFeatureFlexibet;", "", AnalyticsParam.EVENT_STATUS, "", "oddsKey", "", "flexibleMinOdds", "<init>", "(IFF)V", "getStatus", "()I", "Lcom/google/gson/annotations/SerializedName;", "value", "getOddsKey", "()F", "getFlexibleMinOdds", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkInstantRacingFeatureFlexibet {
    public static final int $stable = 0;

    @SerializedName("flexibleMinOdds")
    private final float flexibleMinOdds;

    @SerializedName("oddsKey")
    private final float oddsKey;

    @SerializedName(AnalyticsParam.EVENT_STATUS)
    private final int status;

    public NetworkInstantRacingFeatureFlexibet(int i, float f, float f2) {
        this.status = i;
        this.oddsKey = f;
        this.flexibleMinOdds = f2;
    }

    public static /* synthetic */ NetworkInstantRacingFeatureFlexibet copy$default(NetworkInstantRacingFeatureFlexibet networkInstantRacingFeatureFlexibet, int i, float f, float f2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = networkInstantRacingFeatureFlexibet.status;
        }
        if ((i2 & 2) != 0) {
            f = networkInstantRacingFeatureFlexibet.oddsKey;
        }
        if ((i2 & 4) != 0) {
            f2 = networkInstantRacingFeatureFlexibet.flexibleMinOdds;
        }
        return networkInstantRacingFeatureFlexibet.copy(i, f, f2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getOddsKey() {
        return this.oddsKey;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getFlexibleMinOdds() {
        return this.flexibleMinOdds;
    }

    public final NetworkInstantRacingFeatureFlexibet copy(int status, float oddsKey, float flexibleMinOdds) {
        return new NetworkInstantRacingFeatureFlexibet(status, oddsKey, flexibleMinOdds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkInstantRacingFeatureFlexibet)) {
            return false;
        }
        NetworkInstantRacingFeatureFlexibet networkInstantRacingFeatureFlexibet = (NetworkInstantRacingFeatureFlexibet) other;
        return this.status == networkInstantRacingFeatureFlexibet.status && Float.compare(this.oddsKey, networkInstantRacingFeatureFlexibet.oddsKey) == 0 && Float.compare(this.flexibleMinOdds, networkInstantRacingFeatureFlexibet.flexibleMinOdds) == 0;
    }

    public final float getFlexibleMinOdds() {
        return this.flexibleMinOdds;
    }

    public final float getOddsKey() {
        return this.oddsKey;
    }

    public final int getStatus() {
        return this.status;
    }

    public int hashCode() {
        return Float.hashCode(this.flexibleMinOdds) + tvh.a(this.oddsKey, Integer.hashCode(this.status) * 31, 31);
    }

    public String toString() {
        int i = this.status;
        float f = this.oddsKey;
        float f2 = this.flexibleMinOdds;
        StringBuilder sb = new StringBuilder("NetworkInstantRacingFeatureFlexibet(status=");
        sb.append(i);
        sb.append(", oddsKey=");
        sb.append(f);
        sb.append(", flexibleMinOdds=");
        return wi1.a(f2, ")", sb);
    }
}
