package com.sportybet.android.instantwin.newtork.model.response.racing;

import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.hxa;
import defpackage.mtg0;
import defpackage.nyf;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003JO\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u001d\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001f\u001a\u00020 HÖ\u0081\u0004J\n\u0010!\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR'\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR'\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR'\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR%\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u0092\u0002\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R'\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\rÊ\u0001\f\b#\u0012\b\b$\u0012\u0004\b\u0003\u0010\u0002¨\u0006\""}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/racing/NetworkInstantRacingEventMarketOutcome;", "", "outcomeId", "", "odds", "probability", "desc", "enable", "", AnalyticsParam.EVENT_PARAM_RESULT, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getOutcomeId", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getOdds", "getProbability", "getDesc", "getEnable", "()Z", "getResult", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkInstantRacingEventMarketOutcome {
    public static final int $stable = 0;

    @SerializedName("desc")
    private final String desc;

    @SerializedName("enable")
    private final boolean enable;

    @SerializedName("odds")
    private final String odds;

    @SerializedName("outcomeId")
    private final String outcomeId;

    @SerializedName("probability")
    private final String probability;

    @SerializedName(AnalyticsParam.EVENT_PARAM_RESULT)
    private final String result;

    public NetworkInstantRacingEventMarketOutcome(String str, String str2, String str3, String str4, boolean z, String str5) {
        this.outcomeId = str;
        this.odds = str2;
        this.probability = str3;
        this.desc = str4;
        this.enable = z;
        this.result = str5;
    }

    public static /* synthetic */ NetworkInstantRacingEventMarketOutcome copy$default(NetworkInstantRacingEventMarketOutcome networkInstantRacingEventMarketOutcome, String str, String str2, String str3, String str4, boolean z, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = networkInstantRacingEventMarketOutcome.outcomeId;
        }
        if ((i & 2) != 0) {
            str2 = networkInstantRacingEventMarketOutcome.odds;
        }
        if ((i & 4) != 0) {
            str3 = networkInstantRacingEventMarketOutcome.probability;
        }
        if ((i & 8) != 0) {
            str4 = networkInstantRacingEventMarketOutcome.desc;
        }
        if ((i & 16) != 0) {
            z = networkInstantRacingEventMarketOutcome.enable;
        }
        if ((i & 32) != 0) {
            str5 = networkInstantRacingEventMarketOutcome.result;
        }
        boolean z2 = z;
        String str6 = str5;
        return networkInstantRacingEventMarketOutcome.copy(str, str2, str3, str4, z2, str6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOutcomeId() {
        return this.outcomeId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOdds() {
        return this.odds;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getProbability() {
        return this.probability;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDesc() {
        return this.desc;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getEnable() {
        return this.enable;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getResult() {
        return this.result;
    }

    public final NetworkInstantRacingEventMarketOutcome copy(String outcomeId, String odds, String probability, String desc, boolean enable, String result) {
        return new NetworkInstantRacingEventMarketOutcome(outcomeId, odds, probability, desc, enable, result);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkInstantRacingEventMarketOutcome)) {
            return false;
        }
        NetworkInstantRacingEventMarketOutcome networkInstantRacingEventMarketOutcome = (NetworkInstantRacingEventMarketOutcome) other;
        return Intrinsics.g(this.outcomeId, networkInstantRacingEventMarketOutcome.outcomeId) && Intrinsics.g(this.odds, networkInstantRacingEventMarketOutcome.odds) && Intrinsics.g(this.probability, networkInstantRacingEventMarketOutcome.probability) && Intrinsics.g(this.desc, networkInstantRacingEventMarketOutcome.desc) && this.enable == networkInstantRacingEventMarketOutcome.enable && Intrinsics.g(this.result, networkInstantRacingEventMarketOutcome.result);
    }

    public final String getDesc() {
        return this.desc;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final String getOdds() {
        return this.odds;
    }

    public final String getOutcomeId() {
        return this.outcomeId;
    }

    public final String getProbability() {
        return this.probability;
    }

    public final String getResult() {
        return this.result;
    }

    public int hashCode() {
        String str = this.outcomeId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.odds;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.probability;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.desc;
        int iA = mtg0.a((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.enable);
        String str5 = this.result;
        return iA + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        String str = this.outcomeId;
        String str2 = this.odds;
        String str3 = this.probability;
        String str4 = this.desc;
        boolean z = this.enable;
        String str5 = this.result;
        StringBuilder sbA = ux5.a("NetworkInstantRacingEventMarketOutcome(outcomeId=", str, ", odds=", str2, ", probability=");
        hxa.c(sbA, str3, ", desc=", str4, ", enable=");
        return nyf.a(", result=", str5, ")", sbA, z);
    }
}
