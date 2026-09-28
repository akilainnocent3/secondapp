package com.sportybet.android.instantwin.newtork.model.response.penalty;

import com.google.gson.annotations.SerializedName;
import defpackage.hxa;
import defpackage.mtg0;
import defpackage.t160;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u0011\u0010(\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u000fHÆ\u0003Jw\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\u00032\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\u0014\u0010+\u001a\u00020\u00032\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010-\u001a\u00020.HÖ\u0081\u0004J\n\u0010/\u001a\u00020\u0005HÖ\u0081\u0004R%\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R'\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R'\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R'\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R'\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R'\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R%\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R-\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006X\u0087\u0004\u0092\u0002\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR'\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004\u0092\u0002\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 Ê\u0001\f\b1\u0012\b\b2\u0012\u0004\b\u0003\u0010\u0000¨\u00060"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/penalty/NetworkSportyPenaltySportConfig;", "", "active", "", "sportId", "", "name", "minStake", "maxStake", "maxPayout", "gift", "marketCategories", "", "Lcom/sportybet/android/instantwin/newtork/model/response/penalty/NetworkSportyPenaltyMarketCategory;", "feature", "Lcom/sportybet/android/instantwin/newtork/model/response/penalty/NetworkSportyPenaltyFeature;", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Lcom/sportybet/android/instantwin/newtork/model/response/penalty/NetworkSportyPenaltyFeature;)V", "getActive", "()Z", "Lcom/google/gson/annotations/SerializedName;", "value", "getSportId", "()Ljava/lang/String;", "getName", "getMinStake", "getMaxStake", "getMaxPayout", "getGift", "getMarketCategories", "()Ljava/util/List;", "getFeature", "()Lcom/sportybet/android/instantwin/newtork/model/response/penalty/NetworkSportyPenaltyFeature;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkSportyPenaltySportConfig {
    public static final int $stable = NetworkSportyPenaltyFeature.$stable;

    @SerializedName("active")
    private final boolean active;

    @SerializedName("feature")
    private final NetworkSportyPenaltyFeature feature;

    @SerializedName("gift")
    private final boolean gift;

    @SerializedName("marketCategories")
    private final List<NetworkSportyPenaltyMarketCategory> marketCategories;

    @SerializedName("maxPayout")
    private final String maxPayout;

    @SerializedName("maxStake")
    private final String maxStake;

    @SerializedName("minStake")
    private final String minStake;

    @SerializedName("name")
    private final String name;

    @SerializedName("sportId")
    private final String sportId;

    public NetworkSportyPenaltySportConfig(boolean z, String str, String str2, String str3, String str4, String str5, boolean z2, List<NetworkSportyPenaltyMarketCategory> list, NetworkSportyPenaltyFeature networkSportyPenaltyFeature) {
        this.active = z;
        this.sportId = str;
        this.name = str2;
        this.minStake = str3;
        this.maxStake = str4;
        this.maxPayout = str5;
        this.gift = z2;
        this.marketCategories = list;
        this.feature = networkSportyPenaltyFeature;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NetworkSportyPenaltySportConfig copy$default(NetworkSportyPenaltySportConfig networkSportyPenaltySportConfig, boolean z, String str, String str2, String str3, String str4, String str5, boolean z2, List list, NetworkSportyPenaltyFeature networkSportyPenaltyFeature, int i, Object obj) {
        if ((i & 1) != 0) {
            z = networkSportyPenaltySportConfig.active;
        }
        if ((i & 2) != 0) {
            str = networkSportyPenaltySportConfig.sportId;
        }
        if ((i & 4) != 0) {
            str2 = networkSportyPenaltySportConfig.name;
        }
        if ((i & 8) != 0) {
            str3 = networkSportyPenaltySportConfig.minStake;
        }
        if ((i & 16) != 0) {
            str4 = networkSportyPenaltySportConfig.maxStake;
        }
        if ((i & 32) != 0) {
            str5 = networkSportyPenaltySportConfig.maxPayout;
        }
        if ((i & 64) != 0) {
            z2 = networkSportyPenaltySportConfig.gift;
        }
        if ((i & 128) != 0) {
            list = networkSportyPenaltySportConfig.marketCategories;
        }
        if ((i & 256) != 0) {
            networkSportyPenaltyFeature = networkSportyPenaltySportConfig.feature;
        }
        List list2 = list;
        NetworkSportyPenaltyFeature networkSportyPenaltyFeature2 = networkSportyPenaltyFeature;
        String str6 = str5;
        boolean z3 = z2;
        String str7 = str4;
        String str8 = str2;
        return networkSportyPenaltySportConfig.copy(z, str, str8, str3, str7, str6, z3, list2, networkSportyPenaltyFeature2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getActive() {
        return this.active;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSportId() {
        return this.sportId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMinStake() {
        return this.minStake;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getMaxStake() {
        return this.maxStake;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getMaxPayout() {
        return this.maxPayout;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getGift() {
        return this.gift;
    }

    public final List<NetworkSportyPenaltyMarketCategory> component8() {
        return this.marketCategories;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final NetworkSportyPenaltyFeature getFeature() {
        return this.feature;
    }

    public final NetworkSportyPenaltySportConfig copy(boolean active, String sportId, String name, String minStake, String maxStake, String maxPayout, boolean gift, List<NetworkSportyPenaltyMarketCategory> marketCategories, NetworkSportyPenaltyFeature feature) {
        return new NetworkSportyPenaltySportConfig(active, sportId, name, minStake, maxStake, maxPayout, gift, marketCategories, feature);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkSportyPenaltySportConfig)) {
            return false;
        }
        NetworkSportyPenaltySportConfig networkSportyPenaltySportConfig = (NetworkSportyPenaltySportConfig) other;
        return this.active == networkSportyPenaltySportConfig.active && Intrinsics.g(this.sportId, networkSportyPenaltySportConfig.sportId) && Intrinsics.g(this.name, networkSportyPenaltySportConfig.name) && Intrinsics.g(this.minStake, networkSportyPenaltySportConfig.minStake) && Intrinsics.g(this.maxStake, networkSportyPenaltySportConfig.maxStake) && Intrinsics.g(this.maxPayout, networkSportyPenaltySportConfig.maxPayout) && this.gift == networkSportyPenaltySportConfig.gift && Intrinsics.g(this.marketCategories, networkSportyPenaltySportConfig.marketCategories) && Intrinsics.g(this.feature, networkSportyPenaltySportConfig.feature);
    }

    public final boolean getActive() {
        return this.active;
    }

    public final NetworkSportyPenaltyFeature getFeature() {
        return this.feature;
    }

    public final boolean getGift() {
        return this.gift;
    }

    public final List<NetworkSportyPenaltyMarketCategory> getMarketCategories() {
        return this.marketCategories;
    }

    public final String getMaxPayout() {
        return this.maxPayout;
    }

    public final String getMaxStake() {
        return this.maxStake;
    }

    public final String getMinStake() {
        return this.minStake;
    }

    public final String getName() {
        return this.name;
    }

    public final String getSportId() {
        return this.sportId;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.active) * 31;
        String str = this.sportId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.name;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.minStake;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.maxStake;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.maxPayout;
        int iA = mtg0.a((iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.gift);
        List<NetworkSportyPenaltyMarketCategory> list = this.marketCategories;
        int iHashCode6 = (iA + (list == null ? 0 : list.hashCode())) * 31;
        NetworkSportyPenaltyFeature networkSportyPenaltyFeature = this.feature;
        return iHashCode6 + (networkSportyPenaltyFeature != null ? networkSportyPenaltyFeature.hashCode() : 0);
    }

    public String toString() {
        boolean z = this.active;
        String str = this.sportId;
        String str2 = this.name;
        String str3 = this.minStake;
        String str4 = this.maxStake;
        String str5 = this.maxPayout;
        boolean z2 = this.gift;
        List<NetworkSportyPenaltyMarketCategory> list = this.marketCategories;
        NetworkSportyPenaltyFeature networkSportyPenaltyFeature = this.feature;
        StringBuilder sbA = t160.a("NetworkSportyPenaltySportConfig(active=", ", sportId=", str, ", name=", z);
        hxa.c(sbA, str2, ", minStake=", str3, ", maxStake=");
        hxa.c(sbA, str4, ", maxPayout=", str5, ", gift=");
        sbA.append(z2);
        sbA.append(", marketCategories=");
        sbA.append(list);
        sbA.append(", feature=");
        sbA.append(networkSportyPenaltyFeature);
        sbA.append(")");
        return sbA.toString();
    }
}
