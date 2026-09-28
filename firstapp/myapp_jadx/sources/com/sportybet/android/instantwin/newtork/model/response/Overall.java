package com.sportybet.android.instantwin.newtork.model.response;

import com.google.gson.annotations.SerializedName;
import defpackage.gmf0;
import defpackage.hxa;
import defpackage.mq0;
import defpackage.mtg0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B§\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u00109\u001a\u00020\u0003HÆ\u0003J\u0010\u0010:\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\"J\u0010\u0010;\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\"J\t\u0010<\u001a\u00020\bHÆ\u0003J\t\u0010=\u001a\u00020\bHÆ\u0003J\t\u0010>\u001a\u00020\bHÆ\u0003J\u0010\u0010?\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010*J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\u0010\u0010A\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010*J\u0011\u0010B\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\t\u0010F\u001a\u00020\u0019HÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003Jº\u0001\u0010H\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010IJ\u0014\u0010J\u001a\u00020\u00032\b\u0010K\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010L\u001a\u00020\fHÖ\u0081\u0004J\n\u0010M\u001a\u00020\bHÖ\u0081\u0004R%\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u001f\u0012\b\b \u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR)\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u001f\u0012\b\b \u0012\u0004\b\b(\u0004¢\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R)\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u001f\u0012\b\b \u0012\u0004\b\b(\u0006¢\u0006\n\n\u0002\u0010#\u001a\u0004\b$\u0010\"R%\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u0092\u0002\f\b\u001f\u0012\b\b \u0012\u0004\b\b(\u0007¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R%\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004\u0092\u0002\f\b\u001f\u0012\b\b \u0012\u0004\b\b(\t¢\u0006\b\n\u0000\u001a\u0004\b'\u0010&R%\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004\u0092\u0002\f\b\u001f\u0012\b\b \u0012\u0004\b\b(\n¢\u0006\b\n\u0000\u001a\u0004\b(\u0010&R)\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004\u0092\u0002\f\b\u001f\u0012\b\b \u0012\u0004\b\b(\u000b¢\u0006\n\n\u0002\u0010+\u001a\u0004\b)\u0010*R%\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u001f\u0012\b\b \u0012\u0004\b\b(\r¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001eR)\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004\u0092\u0002\f\b\u001f\u0012\b\b \u0012\u0004\b\b(\u000e¢\u0006\n\n\u0002\u0010+\u001a\u0004\b-\u0010*R-\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006X\u0087\u0004\u0092\u0002\f\b\u001f\u0012\b\b \u0012\u0004\b\b(\u000f¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R'\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004\u0092\u0002\f\b\u001f\u0012\b\b \u0012\u0004\b\b(\u0012¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R'\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004\u0092\u0002\f\b\u001f\u0012\b\b \u0012\u0004\b\b(\u0014¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R'\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004\u0092\u0002\f\b\u001f\u0012\b\b \u0012\u0004\b\b(\u0016¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R%\u0010\u0018\u001a\u00020\u00198\u0006X\u0087\u0004\u0092\u0002\f\b\u001f\u0012\b\b \u0012\u0004\b\b(\u0018¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R%\u0010\u001a\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u001f\u0012\b\b \u0012\u0004\b\b(\u001a¢\u0006\b\n\u0000\u001a\u0004\b8\u0010\u001eÊ\u0001\f\bO\u0012\b\bP\u0012\u0004\b\u0003\u0010\u0000¨\u0006N"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/Overall;", "", "active", "", "bdMinStake", "", "bdMaxStake", "minStake", "", "maxStake", "maxPayout", "keepBetLimit", "", "gift", "bonusType", "sports", "", "Lcom/sportybet/android/instantwin/newtork/model/response/Sport;", "multiBetBonus", "Lcom/sportybet/android/instantwin/newtork/model/response/MultiBetBonus;", "dynamicMultiBetBonus", "Lcom/sportybet/android/instantwin/newtork/model/response/DynamicMultiBetBonus;", "feature", "Lcom/sportybet/android/instantwin/newtork/model/response/Feature;", "eventListPageDefaultSpecifier", "Lcom/sportybet/android/instantwin/newtork/model/response/EventListPageDefaultSpecifier;", "statsEnabled", "<init>", "(ZLjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZLjava/lang/Integer;Ljava/util/List;Lcom/sportybet/android/instantwin/newtork/model/response/MultiBetBonus;Lcom/sportybet/android/instantwin/newtork/model/response/DynamicMultiBetBonus;Lcom/sportybet/android/instantwin/newtork/model/response/Feature;Lcom/sportybet/android/instantwin/newtork/model/response/EventListPageDefaultSpecifier;Z)V", "getActive", "()Z", "Lcom/google/gson/annotations/SerializedName;", "value", "getBdMinStake", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getBdMaxStake", "getMinStake", "()Ljava/lang/String;", "getMaxStake", "getMaxPayout", "getKeepBetLimit", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getGift", "getBonusType", "getSports", "()Ljava/util/List;", "getMultiBetBonus", "()Lcom/sportybet/android/instantwin/newtork/model/response/MultiBetBonus;", "getDynamicMultiBetBonus", "()Lcom/sportybet/android/instantwin/newtork/model/response/DynamicMultiBetBonus;", "getFeature", "()Lcom/sportybet/android/instantwin/newtork/model/response/Feature;", "getEventListPageDefaultSpecifier", "()Lcom/sportybet/android/instantwin/newtork/model/response/EventListPageDefaultSpecifier;", "getStatsEnabled", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "(ZLjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZLjava/lang/Integer;Ljava/util/List;Lcom/sportybet/android/instantwin/newtork/model/response/MultiBetBonus;Lcom/sportybet/android/instantwin/newtork/model/response/DynamicMultiBetBonus;Lcom/sportybet/android/instantwin/newtork/model/response/Feature;Lcom/sportybet/android/instantwin/newtork/model/response/EventListPageDefaultSpecifier;Z)Lcom/sportybet/android/instantwin/newtork/model/response/Overall;", "equals", "other", "hashCode", "toString", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class Overall {
    public static final int $stable = 8;

    @SerializedName("active")
    private final boolean active;

    @SerializedName("bdMaxStake")
    private final Long bdMaxStake;

    @SerializedName("bdMinStake")
    private final Long bdMinStake;

    @SerializedName("bonusType")
    private final Integer bonusType;

    @SerializedName("dynamicMultiBetBonus")
    private final DynamicMultiBetBonus dynamicMultiBetBonus;

    @SerializedName("eventListPageDefaultSpecifier")
    private final EventListPageDefaultSpecifier eventListPageDefaultSpecifier;

    @SerializedName("feature")
    private final Feature feature;

    @SerializedName("gift")
    private final boolean gift;

    @SerializedName("keepBetLimit")
    private final Integer keepBetLimit;

    @SerializedName("maxPayout")
    private final String maxPayout;

    @SerializedName("maxStake")
    private final String maxStake;

    @SerializedName("minStake")
    private final String minStake;

    @SerializedName("multiBetBonus")
    private final MultiBetBonus multiBetBonus;

    @SerializedName("sports")
    private final List<Sport> sports;

    @SerializedName("statsEnabled")
    private final boolean statsEnabled;

    public /* synthetic */ Overall(boolean z, Long l, Long l2, String str, String str2, String str3, Integer num, boolean z2, Integer num2, List list, MultiBetBonus multiBetBonus, DynamicMultiBetBonus dynamicMultiBetBonus, Feature feature, EventListPageDefaultSpecifier eventListPageDefaultSpecifier, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : l2, str, str2, str3, num, (i & 128) != 0 ? false : z2, (i & 256) != 0 ? null : num2, (i & 512) != 0 ? null : list, (i & 1024) != 0 ? null : multiBetBonus, (i & 2048) != 0 ? null : dynamicMultiBetBonus, (i & 4096) != 0 ? null : feature, eventListPageDefaultSpecifier, (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? false : z3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getActive() {
        return this.active;
    }

    public final List<Sport> component10() {
        return this.sports;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final MultiBetBonus getMultiBetBonus() {
        return this.multiBetBonus;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final DynamicMultiBetBonus getDynamicMultiBetBonus() {
        return this.dynamicMultiBetBonus;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Feature getFeature() {
        return this.feature;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final EventListPageDefaultSpecifier getEventListPageDefaultSpecifier() {
        return this.eventListPageDefaultSpecifier;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final boolean getStatsEnabled() {
        return this.statsEnabled;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getBdMinStake() {
        return this.bdMinStake;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getBdMaxStake() {
        return this.bdMaxStake;
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
    public final Integer getKeepBetLimit() {
        return this.keepBetLimit;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getGift() {
        return this.gift;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Integer getBonusType() {
        return this.bonusType;
    }

    public final Overall copy(boolean active, Long bdMinStake, Long bdMaxStake, String minStake, String maxStake, String maxPayout, Integer keepBetLimit, boolean gift, Integer bonusType, List<Sport> sports, MultiBetBonus multiBetBonus, DynamicMultiBetBonus dynamicMultiBetBonus, Feature feature, EventListPageDefaultSpecifier eventListPageDefaultSpecifier, boolean statsEnabled) {
        minStake.getClass();
        maxStake.getClass();
        maxPayout.getClass();
        eventListPageDefaultSpecifier.getClass();
        return new Overall(active, bdMinStake, bdMaxStake, minStake, maxStake, maxPayout, keepBetLimit, gift, bonusType, sports, multiBetBonus, dynamicMultiBetBonus, feature, eventListPageDefaultSpecifier, statsEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Overall)) {
            return false;
        }
        Overall overall = (Overall) other;
        return this.active == overall.active && Intrinsics.g(this.bdMinStake, overall.bdMinStake) && Intrinsics.g(this.bdMaxStake, overall.bdMaxStake) && Intrinsics.g(this.minStake, overall.minStake) && Intrinsics.g(this.maxStake, overall.maxStake) && Intrinsics.g(this.maxPayout, overall.maxPayout) && Intrinsics.g(this.keepBetLimit, overall.keepBetLimit) && this.gift == overall.gift && Intrinsics.g(this.bonusType, overall.bonusType) && Intrinsics.g(this.sports, overall.sports) && Intrinsics.g(this.multiBetBonus, overall.multiBetBonus) && Intrinsics.g(this.dynamicMultiBetBonus, overall.dynamicMultiBetBonus) && Intrinsics.g(this.feature, overall.feature) && Intrinsics.g(this.eventListPageDefaultSpecifier, overall.eventListPageDefaultSpecifier) && this.statsEnabled == overall.statsEnabled;
    }

    public final boolean getActive() {
        return this.active;
    }

    public final Long getBdMaxStake() {
        return this.bdMaxStake;
    }

    public final Long getBdMinStake() {
        return this.bdMinStake;
    }

    public final Integer getBonusType() {
        return this.bonusType;
    }

    public final DynamicMultiBetBonus getDynamicMultiBetBonus() {
        return this.dynamicMultiBetBonus;
    }

    public final EventListPageDefaultSpecifier getEventListPageDefaultSpecifier() {
        return this.eventListPageDefaultSpecifier;
    }

    public final Feature getFeature() {
        return this.feature;
    }

    public final boolean getGift() {
        return this.gift;
    }

    public final Integer getKeepBetLimit() {
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

    public final MultiBetBonus getMultiBetBonus() {
        return this.multiBetBonus;
    }

    public final List<Sport> getSports() {
        return this.sports;
    }

    public final boolean getStatsEnabled() {
        return this.statsEnabled;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.active) * 31;
        Long l = this.bdMinStake;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.bdMaxStake;
        int iA = gmf0.a(gmf0.a(gmf0.a((iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.minStake), 31, this.maxStake), 31, this.maxPayout);
        Integer num = this.keepBetLimit;
        int iA2 = mtg0.a((iA + (num == null ? 0 : num.hashCode())) * 31, 31, this.gift);
        Integer num2 = this.bonusType;
        int iHashCode3 = (iA2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<Sport> list = this.sports;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        MultiBetBonus multiBetBonus = this.multiBetBonus;
        int iHashCode5 = (iHashCode4 + (multiBetBonus == null ? 0 : multiBetBonus.hashCode())) * 31;
        DynamicMultiBetBonus dynamicMultiBetBonus = this.dynamicMultiBetBonus;
        int iHashCode6 = (iHashCode5 + (dynamicMultiBetBonus == null ? 0 : dynamicMultiBetBonus.hashCode())) * 31;
        Feature feature = this.feature;
        int iHashCode7 = feature != null ? feature.hashCode() : 0;
        return Boolean.hashCode(this.statsEnabled) + ((this.eventListPageDefaultSpecifier.hashCode() + ((iHashCode6 + iHashCode7) * 31)) * 31);
    }

    public String toString() {
        boolean z = this.active;
        Long l = this.bdMinStake;
        Long l2 = this.bdMaxStake;
        String str = this.minStake;
        String str2 = this.maxStake;
        String str3 = this.maxPayout;
        Integer num = this.keepBetLimit;
        boolean z2 = this.gift;
        Integer num2 = this.bonusType;
        List<Sport> list = this.sports;
        MultiBetBonus multiBetBonus = this.multiBetBonus;
        DynamicMultiBetBonus dynamicMultiBetBonus = this.dynamicMultiBetBonus;
        Feature feature = this.feature;
        EventListPageDefaultSpecifier eventListPageDefaultSpecifier = this.eventListPageDefaultSpecifier;
        boolean z3 = this.statsEnabled;
        StringBuilder sb = new StringBuilder("Overall(active=");
        sb.append(z);
        sb.append(", bdMinStake=");
        sb.append(l);
        sb.append(", bdMaxStake=");
        sb.append(l2);
        sb.append(", minStake=");
        sb.append(str);
        sb.append(", maxStake=");
        hxa.c(sb, str2, ", maxPayout=", str3, ", keepBetLimit=");
        sb.append(num);
        sb.append(", gift=");
        sb.append(z2);
        sb.append(", bonusType=");
        sb.append(num2);
        sb.append(", sports=");
        sb.append(list);
        sb.append(", multiBetBonus=");
        sb.append(multiBetBonus);
        sb.append(", dynamicMultiBetBonus=");
        sb.append(dynamicMultiBetBonus);
        sb.append(", feature=");
        sb.append(feature);
        sb.append(", eventListPageDefaultSpecifier=");
        sb.append(eventListPageDefaultSpecifier);
        sb.append(", statsEnabled=");
        return mq0.a(sb, z3, ")");
    }

    public Overall(boolean z, Long l, Long l2, String str, String str2, String str3, Integer num, boolean z2, Integer num2, List<Sport> list, MultiBetBonus multiBetBonus, DynamicMultiBetBonus dynamicMultiBetBonus, Feature feature, EventListPageDefaultSpecifier eventListPageDefaultSpecifier, boolean z3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        eventListPageDefaultSpecifier.getClass();
        this.active = z;
        this.bdMinStake = l;
        this.bdMaxStake = l2;
        this.minStake = str;
        this.maxStake = str2;
        this.maxPayout = str3;
        this.keepBetLimit = num;
        this.gift = z2;
        this.bonusType = num2;
        this.sports = list;
        this.multiBetBonus = multiBetBonus;
        this.dynamicMultiBetBonus = dynamicMultiBetBonus;
        this.feature = feature;
        this.eventListPageDefaultSpecifier = eventListPageDefaultSpecifier;
        this.statsEnabled = z3;
    }
}
