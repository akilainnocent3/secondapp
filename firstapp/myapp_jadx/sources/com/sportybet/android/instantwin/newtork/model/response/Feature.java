package com.sportybet.android.instantwin.newtork.model.response;

import com.google.gson.annotations.SerializedName;
import com.sportybet.android.instantwin.newtork.model.response.football.NetworkInstantFootballBetRecommendation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003J9\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0014\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001e\u001a\u00020\u001fHÖ\u0081\u0004J\n\u0010 \u001a\u00020!HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR'\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R'\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u0092\u0002\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R'\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u0092\u0002\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015Ê\u0001\f\b#\u0012\b\b$\u0012\u0004\b\u0003\u0010\u0000¨\u0006\""}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/Feature;", "", "flexibet", "Lcom/sportybet/android/instantwin/newtork/model/response/FlexBetApiData;", "onecut", "Lcom/sportybet/android/instantwin/newtork/model/response/OneCutBetApiData;", "oddsFilter", "Lcom/sportybet/android/instantwin/newtork/model/response/OddsFilterData;", "betRecommendation", "Lcom/sportybet/android/instantwin/newtork/model/response/football/NetworkInstantFootballBetRecommendation;", "<init>", "(Lcom/sportybet/android/instantwin/newtork/model/response/FlexBetApiData;Lcom/sportybet/android/instantwin/newtork/model/response/OneCutBetApiData;Lcom/sportybet/android/instantwin/newtork/model/response/OddsFilterData;Lcom/sportybet/android/instantwin/newtork/model/response/football/NetworkInstantFootballBetRecommendation;)V", "getFlexibet", "()Lcom/sportybet/android/instantwin/newtork/model/response/FlexBetApiData;", "Lcom/google/gson/annotations/SerializedName;", "value", "getOnecut", "()Lcom/sportybet/android/instantwin/newtork/model/response/OneCutBetApiData;", "getOddsFilter", "()Lcom/sportybet/android/instantwin/newtork/model/response/OddsFilterData;", "getBetRecommendation", "()Lcom/sportybet/android/instantwin/newtork/model/response/football/NetworkInstantFootballBetRecommendation;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class Feature {
    public static final int $stable = ((NetworkInstantFootballBetRecommendation.$stable | OddsFilterData.$stable) | OneCutBetApiData.$stable) | FlexBetApiData.$stable;

    @SerializedName("betRecommendation")
    private final NetworkInstantFootballBetRecommendation betRecommendation;

    @SerializedName("flexibet")
    private final FlexBetApiData flexibet;

    @SerializedName("oddsFilter")
    private final OddsFilterData oddsFilter;

    @SerializedName("onecut")
    private final OneCutBetApiData onecut;

    public Feature(FlexBetApiData flexBetApiData, OneCutBetApiData oneCutBetApiData, OddsFilterData oddsFilterData, NetworkInstantFootballBetRecommendation networkInstantFootballBetRecommendation) {
        this.flexibet = flexBetApiData;
        this.onecut = oneCutBetApiData;
        this.oddsFilter = oddsFilterData;
        this.betRecommendation = networkInstantFootballBetRecommendation;
    }

    public static /* synthetic */ Feature copy$default(Feature feature, FlexBetApiData flexBetApiData, OneCutBetApiData oneCutBetApiData, OddsFilterData oddsFilterData, NetworkInstantFootballBetRecommendation networkInstantFootballBetRecommendation, int i, Object obj) {
        if ((i & 1) != 0) {
            flexBetApiData = feature.flexibet;
        }
        if ((i & 2) != 0) {
            oneCutBetApiData = feature.onecut;
        }
        if ((i & 4) != 0) {
            oddsFilterData = feature.oddsFilter;
        }
        if ((i & 8) != 0) {
            networkInstantFootballBetRecommendation = feature.betRecommendation;
        }
        return feature.copy(flexBetApiData, oneCutBetApiData, oddsFilterData, networkInstantFootballBetRecommendation);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final FlexBetApiData getFlexibet() {
        return this.flexibet;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final OneCutBetApiData getOnecut() {
        return this.onecut;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final OddsFilterData getOddsFilter() {
        return this.oddsFilter;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final NetworkInstantFootballBetRecommendation getBetRecommendation() {
        return this.betRecommendation;
    }

    public final Feature copy(FlexBetApiData flexibet, OneCutBetApiData onecut, OddsFilterData oddsFilter, NetworkInstantFootballBetRecommendation betRecommendation) {
        return new Feature(flexibet, onecut, oddsFilter, betRecommendation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Feature)) {
            return false;
        }
        Feature feature = (Feature) other;
        return Intrinsics.g(this.flexibet, feature.flexibet) && Intrinsics.g(this.onecut, feature.onecut) && Intrinsics.g(this.oddsFilter, feature.oddsFilter) && Intrinsics.g(this.betRecommendation, feature.betRecommendation);
    }

    public final NetworkInstantFootballBetRecommendation getBetRecommendation() {
        return this.betRecommendation;
    }

    public final FlexBetApiData getFlexibet() {
        return this.flexibet;
    }

    public final OddsFilterData getOddsFilter() {
        return this.oddsFilter;
    }

    public final OneCutBetApiData getOnecut() {
        return this.onecut;
    }

    public int hashCode() {
        FlexBetApiData flexBetApiData = this.flexibet;
        int iHashCode = (flexBetApiData == null ? 0 : flexBetApiData.hashCode()) * 31;
        OneCutBetApiData oneCutBetApiData = this.onecut;
        int iHashCode2 = (iHashCode + (oneCutBetApiData == null ? 0 : oneCutBetApiData.hashCode())) * 31;
        OddsFilterData oddsFilterData = this.oddsFilter;
        int iHashCode3 = (iHashCode2 + (oddsFilterData == null ? 0 : oddsFilterData.hashCode())) * 31;
        NetworkInstantFootballBetRecommendation networkInstantFootballBetRecommendation = this.betRecommendation;
        return iHashCode3 + (networkInstantFootballBetRecommendation != null ? networkInstantFootballBetRecommendation.hashCode() : 0);
    }

    public String toString() {
        return "Feature(flexibet=" + this.flexibet + ", onecut=" + this.onecut + ", oddsFilter=" + this.oddsFilter + ", betRecommendation=" + this.betRecommendation + ")";
    }
}
