package com.sportybet.android.instantwin.newtork.model.response.scheduledfootball;

import com.google.gson.annotations.SerializedName;
import defpackage.cwz;
import defpackage.f87;
import defpackage.g41;
import defpackage.gpp;
import defpackage.hxa;
import defpackage.mtg0;
import defpackage.uts;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B£\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0010\u0012\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u00108\u001a\u00020\tHÆ\u0003J\t\u00109\u001a\u00020\tHÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0010HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\t\u0010A\u001a\u00020\u0010HÆ\u0003J\u0017\u0010B\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0017HÆ\u0003J\t\u0010C\u001a\u00020\u0003HÆ\u0003JÅ\u0001\u0010D\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00102\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u0003HÆ\u0001J\u0014\u0010E\u001a\u00020\u00032\b\u0010F\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010G\u001a\u00020\u0010HÖ\u0081\u0004J\n\u0010H\u001a\u00020\u0006HÖ\u0081\u0004R%\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR%\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR'\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u0092\u0002\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R'\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u0092\u0002\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u0007¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R%\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004\u0092\u0002\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R%\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004\u0092\u0002\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\n¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R'\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u0092\u0002\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u000b¢\u0006\b\n\u0000\u001a\u0004\b&\u0010!R'\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u0092\u0002\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\f¢\u0006\b\n\u0000\u001a\u0004\b'\u0010!R'\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u0092\u0002\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\r¢\u0006\b\n\u0000\u001a\u0004\b(\u0010!R%\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u000e¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001cR%\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004\u0092\u0002\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u000f¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R'\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004\u0092\u0002\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u0011¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R'\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004\u0092\u0002\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u0013¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R%\u0010\u0015\u001a\u00020\u00108\u0006X\u0087\u0004\u0092\u0002\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u0015¢\u0006\b\n\u0000\u001a\u0004\b0\u0010+R3\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00178\u0006X\u0087\u0004\u0092\u0002\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u0016¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R%\u0010\u0018\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u0018¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001cÊ\u0001\f\bJ\u0012\b\bK\u0012\u0004\b\u0003\u0010\u0000¨\u0006I"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/scheduledfootball/NetworkScheduledFootballConfig;", "", "overallActive", "", "active", "sportId", "", "name", "bdMinStake", "", "bdMaxStake", "minStake", "maxStake", "maxPayout", "gift", "bonusType", "", "dynamicMultiBetBonus", "Lcom/sportybet/android/instantwin/newtork/model/response/scheduledfootball/NetworkScheduledFootballDynamicMultiBetBonus;", "feature", "Lcom/sportybet/android/instantwin/newtork/model/response/scheduledfootball/NetworkScheduledFootballFeature;", "keepBetLimit", "eventListPageDefaultSpecifier", "", "statsEnable", "<init>", "(ZZLjava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILcom/sportybet/android/instantwin/newtork/model/response/scheduledfootball/NetworkScheduledFootballDynamicMultiBetBonus;Lcom/sportybet/android/instantwin/newtork/model/response/scheduledfootball/NetworkScheduledFootballFeature;ILjava/util/Map;Z)V", "getOverallActive", "()Z", "Lcom/google/gson/annotations/SerializedName;", "value", "getActive", "getSportId", "()Ljava/lang/String;", "getName", "getBdMinStake", "()J", "getBdMaxStake", "getMinStake", "getMaxStake", "getMaxPayout", "getGift", "getBonusType", "()I", "getDynamicMultiBetBonus", "()Lcom/sportybet/android/instantwin/newtork/model/response/scheduledfootball/NetworkScheduledFootballDynamicMultiBetBonus;", "getFeature", "()Lcom/sportybet/android/instantwin/newtork/model/response/scheduledfootball/NetworkScheduledFootballFeature;", "getKeepBetLimit", "getEventListPageDefaultSpecifier", "()Ljava/util/Map;", "getStatsEnable", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "equals", "other", "hashCode", "toString", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkScheduledFootballConfig {
    public static final int $stable = NetworkScheduledFootballFeature.$stable | NetworkScheduledFootballDynamicMultiBetBonus.$stable;

    @SerializedName("active")
    private final boolean active;

    @SerializedName("bdMaxStake")
    private final long bdMaxStake;

    @SerializedName("bdMinStake")
    private final long bdMinStake;

    @SerializedName("bonusType")
    private final int bonusType;

    @SerializedName("dynamicMultiBetBonus")
    private final NetworkScheduledFootballDynamicMultiBetBonus dynamicMultiBetBonus;

    @SerializedName("eventListPageDefaultSpecifier")
    private final Map<String, String> eventListPageDefaultSpecifier;

    @SerializedName("feature")
    private final NetworkScheduledFootballFeature feature;

    @SerializedName("gift")
    private final boolean gift;

    @SerializedName("keepBetLimit")
    private final int keepBetLimit;

    @SerializedName("maxPayout")
    private final String maxPayout;

    @SerializedName("maxStake")
    private final String maxStake;

    @SerializedName("minStake")
    private final String minStake;

    @SerializedName("name")
    private final String name;

    @SerializedName("overallActive")
    private final boolean overallActive;

    @SerializedName("sportId")
    private final String sportId;

    @SerializedName("statsEnable")
    private final boolean statsEnable;

    public NetworkScheduledFootballConfig(boolean z, boolean z2, String str, String str2, long j, long j2, String str3, String str4, String str5, boolean z3, int i, NetworkScheduledFootballDynamicMultiBetBonus networkScheduledFootballDynamicMultiBetBonus, NetworkScheduledFootballFeature networkScheduledFootballFeature, int i2, Map<String, String> map, boolean z4) {
        this.overallActive = z;
        this.active = z2;
        this.sportId = str;
        this.name = str2;
        this.bdMinStake = j;
        this.bdMaxStake = j2;
        this.minStake = str3;
        this.maxStake = str4;
        this.maxPayout = str5;
        this.gift = z3;
        this.bonusType = i;
        this.dynamicMultiBetBonus = networkScheduledFootballDynamicMultiBetBonus;
        this.feature = networkScheduledFootballFeature;
        this.keepBetLimit = i2;
        this.eventListPageDefaultSpecifier = map;
        this.statsEnable = z4;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getOverallActive() {
        return this.overallActive;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getGift() {
        return this.gift;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getBonusType() {
        return this.bonusType;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final NetworkScheduledFootballDynamicMultiBetBonus getDynamicMultiBetBonus() {
        return this.dynamicMultiBetBonus;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final NetworkScheduledFootballFeature getFeature() {
        return this.feature;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getKeepBetLimit() {
        return this.keepBetLimit;
    }

    public final Map<String, String> component15() {
        return this.eventListPageDefaultSpecifier;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final boolean getStatsEnable() {
        return this.statsEnable;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getActive() {
        return this.active;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSportId() {
        return this.sportId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getBdMinStake() {
        return this.bdMinStake;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getBdMaxStake() {
        return this.bdMaxStake;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getMinStake() {
        return this.minStake;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getMaxStake() {
        return this.maxStake;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getMaxPayout() {
        return this.maxPayout;
    }

    public final NetworkScheduledFootballConfig copy(boolean overallActive, boolean active, String sportId, String name, long bdMinStake, long bdMaxStake, String minStake, String maxStake, String maxPayout, boolean gift, int bonusType, NetworkScheduledFootballDynamicMultiBetBonus dynamicMultiBetBonus, NetworkScheduledFootballFeature feature, int keepBetLimit, Map<String, String> eventListPageDefaultSpecifier, boolean statsEnable) {
        return new NetworkScheduledFootballConfig(overallActive, active, sportId, name, bdMinStake, bdMaxStake, minStake, maxStake, maxPayout, gift, bonusType, dynamicMultiBetBonus, feature, keepBetLimit, eventListPageDefaultSpecifier, statsEnable);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkScheduledFootballConfig)) {
            return false;
        }
        NetworkScheduledFootballConfig networkScheduledFootballConfig = (NetworkScheduledFootballConfig) other;
        return this.overallActive == networkScheduledFootballConfig.overallActive && this.active == networkScheduledFootballConfig.active && Intrinsics.g(this.sportId, networkScheduledFootballConfig.sportId) && Intrinsics.g(this.name, networkScheduledFootballConfig.name) && this.bdMinStake == networkScheduledFootballConfig.bdMinStake && this.bdMaxStake == networkScheduledFootballConfig.bdMaxStake && Intrinsics.g(this.minStake, networkScheduledFootballConfig.minStake) && Intrinsics.g(this.maxStake, networkScheduledFootballConfig.maxStake) && Intrinsics.g(this.maxPayout, networkScheduledFootballConfig.maxPayout) && this.gift == networkScheduledFootballConfig.gift && this.bonusType == networkScheduledFootballConfig.bonusType && Intrinsics.g(this.dynamicMultiBetBonus, networkScheduledFootballConfig.dynamicMultiBetBonus) && Intrinsics.g(this.feature, networkScheduledFootballConfig.feature) && this.keepBetLimit == networkScheduledFootballConfig.keepBetLimit && Intrinsics.g(this.eventListPageDefaultSpecifier, networkScheduledFootballConfig.eventListPageDefaultSpecifier) && this.statsEnable == networkScheduledFootballConfig.statsEnable;
    }

    public final boolean getActive() {
        return this.active;
    }

    public final long getBdMaxStake() {
        return this.bdMaxStake;
    }

    public final long getBdMinStake() {
        return this.bdMinStake;
    }

    public final int getBonusType() {
        return this.bonusType;
    }

    public final NetworkScheduledFootballDynamicMultiBetBonus getDynamicMultiBetBonus() {
        return this.dynamicMultiBetBonus;
    }

    public final Map<String, String> getEventListPageDefaultSpecifier() {
        return this.eventListPageDefaultSpecifier;
    }

    public final NetworkScheduledFootballFeature getFeature() {
        return this.feature;
    }

    public final boolean getGift() {
        return this.gift;
    }

    public final int getKeepBetLimit() {
        return this.keepBetLimit;
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

    public final boolean getOverallActive() {
        return this.overallActive;
    }

    public final String getSportId() {
        return this.sportId;
    }

    public final boolean getStatsEnable() {
        return this.statsEnable;
    }

    public int hashCode() {
        int iA = mtg0.a(Boolean.hashCode(this.overallActive) * 31, 31, this.active);
        String str = this.sportId;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.name;
        int iA2 = f87.a(f87.a((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, this.bdMinStake, 31), this.bdMaxStake, 31);
        String str3 = this.minStake;
        int iHashCode2 = (iA2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.maxStake;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.maxPayout;
        int iA3 = gpp.a(this.bonusType, mtg0.a((iHashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.gift), 31);
        NetworkScheduledFootballDynamicMultiBetBonus networkScheduledFootballDynamicMultiBetBonus = this.dynamicMultiBetBonus;
        int iHashCode4 = (iA3 + (networkScheduledFootballDynamicMultiBetBonus == null ? 0 : networkScheduledFootballDynamicMultiBetBonus.hashCode())) * 31;
        NetworkScheduledFootballFeature networkScheduledFootballFeature = this.feature;
        int iA4 = gpp.a(this.keepBetLimit, (iHashCode4 + (networkScheduledFootballFeature == null ? 0 : networkScheduledFootballFeature.hashCode())) * 31, 31);
        Map<String, String> map = this.eventListPageDefaultSpecifier;
        return Boolean.hashCode(this.statsEnable) + ((iA4 + (map != null ? map.hashCode() : 0)) * 31);
    }

    public String toString() {
        boolean z = this.overallActive;
        boolean z2 = this.active;
        String str = this.sportId;
        String str2 = this.name;
        long j = this.bdMinStake;
        long j2 = this.bdMaxStake;
        String str3 = this.minStake;
        String str4 = this.maxStake;
        String str5 = this.maxPayout;
        boolean z3 = this.gift;
        int i = this.bonusType;
        NetworkScheduledFootballDynamicMultiBetBonus networkScheduledFootballDynamicMultiBetBonus = this.dynamicMultiBetBonus;
        NetworkScheduledFootballFeature networkScheduledFootballFeature = this.feature;
        int i2 = this.keepBetLimit;
        Map<String, String> map = this.eventListPageDefaultSpecifier;
        boolean z4 = this.statsEnable;
        StringBuilder sbA = cwz.a("NetworkScheduledFootballConfig(overallActive=", ", active=", ", sportId=", z, z2);
        hxa.c(sbA, str, ", name=", str2, ", bdMinStake=");
        sbA.append(j);
        g41.a(j2, ", bdMaxStake=", ", minStake=", sbA);
        hxa.c(sbA, str3, ", maxStake=", str4, ", maxPayout=");
        uts.b(str5, ", gift=", ", bonusType=", sbA, z3);
        sbA.append(i);
        sbA.append(", dynamicMultiBetBonus=");
        sbA.append(networkScheduledFootballDynamicMultiBetBonus);
        sbA.append(", feature=");
        sbA.append(networkScheduledFootballFeature);
        sbA.append(", keepBetLimit=");
        sbA.append(i2);
        sbA.append(", eventListPageDefaultSpecifier=");
        sbA.append(map);
        sbA.append(", statsEnable=");
        sbA.append(z4);
        sbA.append(")");
        return sbA.toString();
    }
}
