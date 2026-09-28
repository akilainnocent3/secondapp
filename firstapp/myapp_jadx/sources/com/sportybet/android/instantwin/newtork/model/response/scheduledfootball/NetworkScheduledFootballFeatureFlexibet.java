package com.sportybet.android.instantwin.newtork.model.response.scheduledfootball;

import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.dy5;
import defpackage.gpp;
import defpackage.tvh;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0014\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u001cHÖ\u0081\u0004R%\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR%\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR%\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u0092\u0002\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R%\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004\u0092\u0002\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010Ê\u0001\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u001d"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/scheduledfootball/NetworkScheduledFootballFeatureFlexibet;", "", AnalyticsParam.EVENT_STATUS, "", "display", "oddsKey", "", "flexibleMinOdds", "<init>", "(IIFF)V", "getStatus", "()I", "Lcom/google/gson/annotations/SerializedName;", "value", "getDisplay", "getOddsKey", "()F", "getFlexibleMinOdds", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkScheduledFootballFeatureFlexibet {
    public static final int $stable = 0;

    @SerializedName("display")
    private final int display;

    @SerializedName("flexibleMinOdds")
    private final float flexibleMinOdds;

    @SerializedName("oddsKey")
    private final float oddsKey;

    @SerializedName(AnalyticsParam.EVENT_STATUS)
    private final int status;

    public NetworkScheduledFootballFeatureFlexibet(int i, int i2, float f, float f2) {
        this.status = i;
        this.display = i2;
        this.oddsKey = f;
        this.flexibleMinOdds = f2;
    }

    public static /* synthetic */ NetworkScheduledFootballFeatureFlexibet copy$default(NetworkScheduledFootballFeatureFlexibet networkScheduledFootballFeatureFlexibet, int i, int i2, float f, float f2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = networkScheduledFootballFeatureFlexibet.status;
        }
        if ((i3 & 2) != 0) {
            i2 = networkScheduledFootballFeatureFlexibet.display;
        }
        if ((i3 & 4) != 0) {
            f = networkScheduledFootballFeatureFlexibet.oddsKey;
        }
        if ((i3 & 8) != 0) {
            f2 = networkScheduledFootballFeatureFlexibet.flexibleMinOdds;
        }
        return networkScheduledFootballFeatureFlexibet.copy(i, i2, f, f2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getDisplay() {
        return this.display;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getOddsKey() {
        return this.oddsKey;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getFlexibleMinOdds() {
        return this.flexibleMinOdds;
    }

    public final NetworkScheduledFootballFeatureFlexibet copy(int status, int display, float oddsKey, float flexibleMinOdds) {
        return new NetworkScheduledFootballFeatureFlexibet(status, display, oddsKey, flexibleMinOdds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkScheduledFootballFeatureFlexibet)) {
            return false;
        }
        NetworkScheduledFootballFeatureFlexibet networkScheduledFootballFeatureFlexibet = (NetworkScheduledFootballFeatureFlexibet) other;
        return this.status == networkScheduledFootballFeatureFlexibet.status && this.display == networkScheduledFootballFeatureFlexibet.display && Float.compare(this.oddsKey, networkScheduledFootballFeatureFlexibet.oddsKey) == 0 && Float.compare(this.flexibleMinOdds, networkScheduledFootballFeatureFlexibet.flexibleMinOdds) == 0;
    }

    public final int getDisplay() {
        return this.display;
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
        return Float.hashCode(this.flexibleMinOdds) + tvh.a(this.oddsKey, gpp.a(this.display, Integer.hashCode(this.status) * 31, 31), 31);
    }

    public String toString() {
        int i = this.status;
        int i2 = this.display;
        float f = this.oddsKey;
        float f2 = this.flexibleMinOdds;
        StringBuilder sbA = dy5.a("NetworkScheduledFootballFeatureFlexibet(status=", i, i2, ", display=", ", oddsKey=");
        sbA.append(f);
        sbA.append(", flexibleMinOdds=");
        sbA.append(f2);
        sbA.append(")");
        return sbA.toString();
    }
}
