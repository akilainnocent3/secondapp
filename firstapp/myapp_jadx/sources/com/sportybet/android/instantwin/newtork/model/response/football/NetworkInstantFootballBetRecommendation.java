package com.sportybet.android.instantwin.newtork.model.response.football;

import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.pe4;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\n\u001a\u00020\u000bJ\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u000e\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004R%\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007Ê\u0001\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0013"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/football/NetworkInstantFootballBetRecommendation;", "", AnalyticsParam.EVENT_STATUS, "", "<init>", "(I)V", "getStatus", "()I", "Lcom/google/gson/annotations/SerializedName;", "value", "isEnabled", "", "component1", "copy", "equals", "other", "hashCode", "toString", "", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkInstantFootballBetRecommendation {
    public static final int $stable = 0;

    @SerializedName(AnalyticsParam.EVENT_STATUS)
    private final int status;

    public NetworkInstantFootballBetRecommendation(int i) {
        this.status = i;
    }

    public static /* synthetic */ NetworkInstantFootballBetRecommendation copy$default(NetworkInstantFootballBetRecommendation networkInstantFootballBetRecommendation, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = networkInstantFootballBetRecommendation.status;
        }
        return networkInstantFootballBetRecommendation.copy(i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    public final NetworkInstantFootballBetRecommendation copy(int status) {
        return new NetworkInstantFootballBetRecommendation(status);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof NetworkInstantFootballBetRecommendation) && this.status == ((NetworkInstantFootballBetRecommendation) other).status;
    }

    public final int getStatus() {
        return this.status;
    }

    public int hashCode() {
        return Integer.hashCode(this.status);
    }

    public final boolean isEnabled() {
        return this.status == 1;
    }

    public String toString() {
        return pe4.b(this.status, "NetworkInstantFootballBetRecommendation(status=", ")");
    }
}
