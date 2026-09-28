package com.sportybet.android.instantwin.newtork.model.response;

import com.google.gson.annotations.SerializedName;
import defpackage.ai50;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.hxa;
import defpackage.mtg0;
import defpackage.qn4;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b<\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BË\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0003\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\b\u0010!\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b#\u0010$J\t\u0010I\u001a\u00020\u0003HÆ\u0003J\u0010\u0010J\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010*J\u0010\u0010K\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010*J\t\u0010L\u001a\u00020\bHÆ\u0003J\t\u0010M\u001a\u00020\bHÆ\u0003J\t\u0010N\u001a\u00020\bHÆ\u0003J\u0010\u0010O\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u00102J\t\u0010P\u001a\u00020\u0003HÆ\u0003J\t\u0010Q\u001a\u00020\bHÆ\u0003J\t\u0010R\u001a\u00020\bHÆ\u0003J\t\u0010S\u001a\u00020\fHÆ\u0003J\u0011\u0010T\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012HÆ\u0003J\u000f\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00150\u0012HÆ\u0003J\t\u0010V\u001a\u00020\u0017HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\t\u0010X\u001a\u00020\u001bHÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u001dHÆ\u0003J\t\u0010Z\u001a\u00020\u0003HÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010 HÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\"HÆ\u0003Jò\u0001\u0010]\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\f2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"HÆ\u0001¢\u0006\u0002\u0010^J\u0014\u0010_\u001a\u00020\u00032\b\u0010`\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010a\u001a\u00020\fHÖ\u0081\u0004J\n\u0010b\u001a\u00020\bHÖ\u0081\u0004R%\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b'\u0012\b\b(\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R)\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u0092\u0002\f\b'\u0012\b\b(\u0012\u0004\b\b(\u0004¢\u0006\n\n\u0002\u0010+\u001a\u0004\b)\u0010*R)\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u0092\u0002\f\b'\u0012\b\b(\u0012\u0004\b\b(\u0006¢\u0006\n\n\u0002\u0010+\u001a\u0004\b,\u0010*R%\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u0092\u0002\f\b'\u0012\b\b(\u0012\u0004\b\b(\u0007¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R%\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004\u0092\u0002\f\b'\u0012\b\b(\u0012\u0004\b\b(\t¢\u0006\b\n\u0000\u001a\u0004\b/\u0010.R%\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004\u0092\u0002\f\b'\u0012\b\b(\u0012\u0004\b\b(\n¢\u0006\b\n\u0000\u001a\u0004\b0\u0010.R)\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004\u0092\u0002\f\b'\u0012\b\b(\u0012\u0004\b\b(\u000b¢\u0006\n\n\u0002\u00103\u001a\u0004\b1\u00102R%\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b'\u0012\b\b(\u0012\u0004\b\b(\r¢\u0006\b\n\u0000\u001a\u0004\b4\u0010&R%\u0010\u000e\u001a\u00020\b8\u0006X\u0087\u0004\u0092\u0002\f\b'\u0012\b\b(\u0012\u0004\b\b(\u000e¢\u0006\b\n\u0000\u001a\u0004\b5\u0010.R%\u0010\u000f\u001a\u00020\b8\u0006X\u0087\u0004\u0092\u0002\f\b'\u0012\b\b(\u0012\u0004\b\b(\u000f¢\u0006\b\n\u0000\u001a\u0004\b6\u0010.R%\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004\u0092\u0002\f\b'\u0012\b\b(\u0012\u0004\b\b(\u0010¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R-\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0006X\u0087\u0004\u0092\u0002\f\b'\u0012\b\b(\u0012\u0004\b\b(\u0011¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R+\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00128\u0006X\u0087\u0004\u0092\u0002\f\b'\u0012\b\b(\u0012\u0004\b\b(\u0014¢\u0006\b\n\u0000\u001a\u0004\b;\u0010:R%\u0010\u0016\u001a\u00020\u00178\u0006X\u0087\u0004\u0092\u0002\f\b'\u0012\b\b(\u0012\u0004\b\b(\u0016¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R'\u0010\u0018\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004\u0092\u0002\f\b'\u0012\b\b(\u0012\u0004\b\b(\u0018¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R%\u0010\u001a\u001a\u00020\u001b8\u0006X\u0087\u0004\u0092\u0002\f\b'\u0012\b\b(\u0012\u0004\b\b(\u001a¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR'\u0010\u001c\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004\u0092\u0002\f\b'\u0012\b\b(\u0012\u0004\b\b(\u001c¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR%\u0010\u001e\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b'\u0012\b\b(\u0012\u0004\b\b(\u001e¢\u0006\b\n\u0000\u001a\u0004\bD\u0010&R'\u0010\u001f\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004\u0092\u0002\f\b'\u0012\b\b(\u0012\u0004\b\b(\u001f¢\u0006\b\n\u0000\u001a\u0004\bE\u0010FR'\u0010!\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004\u0092\u0002\f\b'\u0012\b\b(\u0012\u0004\b\b(!¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HÊ\u0001\f\bd\u0012\b\be\u0012\u0004\b\u0003\u0010\u0000¨\u0006c"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/Sports;", "", "active", "", "bdMinStake", "", "bdMaxStake", "minStake", "", "maxStake", "maxPayout", "keepBetLimit", "", "gift", "sportId", "name", "bonusType", "gameTypes", "", "Lcom/sportybet/android/instantwin/newtork/model/response/InstantWinGameType;", "marketCategories", "Lcom/sportybet/android/instantwin/newtork/model/response/MarketCategory;", "multiBetBonus", "Lcom/sportybet/android/instantwin/newtork/model/response/MultiBetBonus;", "dynamicMultiBetBonus", "Lcom/sportybet/android/instantwin/newtork/model/response/DynamicMultiBetBonus;", "eventListPageDefaultSpecifier", "Lcom/sportybet/android/instantwin/newtork/model/response/EventListPageDefaultSpecifier;", "feature", "Lcom/sportybet/android/instantwin/newtork/model/response/Feature;", "statsEnable", "animationMode", "Lcom/sportybet/android/instantwin/newtork/model/response/SportsAnimationMode;", "speedControllerConfig", "Lcom/sportybet/android/instantwin/newtork/model/response/NetworkSpeedControllerConfig;", "<init>", "(ZLjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;Lcom/sportybet/android/instantwin/newtork/model/response/MultiBetBonus;Lcom/sportybet/android/instantwin/newtork/model/response/DynamicMultiBetBonus;Lcom/sportybet/android/instantwin/newtork/model/response/EventListPageDefaultSpecifier;Lcom/sportybet/android/instantwin/newtork/model/response/Feature;ZLcom/sportybet/android/instantwin/newtork/model/response/SportsAnimationMode;Lcom/sportybet/android/instantwin/newtork/model/response/NetworkSpeedControllerConfig;)V", "getActive", "()Z", "Lcom/google/gson/annotations/SerializedName;", "value", "getBdMinStake", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getBdMaxStake", "getMinStake", "()Ljava/lang/String;", "getMaxStake", "getMaxPayout", "getKeepBetLimit", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getGift", "getSportId", "getName", "getBonusType", "()I", "getGameTypes", "()Ljava/util/List;", "getMarketCategories", "getMultiBetBonus", "()Lcom/sportybet/android/instantwin/newtork/model/response/MultiBetBonus;", "getDynamicMultiBetBonus", "()Lcom/sportybet/android/instantwin/newtork/model/response/DynamicMultiBetBonus;", "getEventListPageDefaultSpecifier", "()Lcom/sportybet/android/instantwin/newtork/model/response/EventListPageDefaultSpecifier;", "getFeature", "()Lcom/sportybet/android/instantwin/newtork/model/response/Feature;", "getStatsEnable", "getAnimationMode", "()Lcom/sportybet/android/instantwin/newtork/model/response/SportsAnimationMode;", "getSpeedControllerConfig", "()Lcom/sportybet/android/instantwin/newtork/model/response/NetworkSpeedControllerConfig;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "copy", "(ZLjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;Lcom/sportybet/android/instantwin/newtork/model/response/MultiBetBonus;Lcom/sportybet/android/instantwin/newtork/model/response/DynamicMultiBetBonus;Lcom/sportybet/android/instantwin/newtork/model/response/EventListPageDefaultSpecifier;Lcom/sportybet/android/instantwin/newtork/model/response/Feature;ZLcom/sportybet/android/instantwin/newtork/model/response/SportsAnimationMode;Lcom/sportybet/android/instantwin/newtork/model/response/NetworkSpeedControllerConfig;)Lcom/sportybet/android/instantwin/newtork/model/response/Sports;", "equals", "other", "hashCode", "toString", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class Sports {
    public static final int $stable = 8;

    @SerializedName("active")
    private final boolean active;

    @SerializedName("animationMode")
    private final SportsAnimationMode animationMode;

    @SerializedName("bdMaxStake")
    private final Long bdMaxStake;

    @SerializedName("bdMinStake")
    private final Long bdMinStake;

    @SerializedName("bonusType")
    private final int bonusType;

    @SerializedName("dynamicMultiBetBonus")
    private final DynamicMultiBetBonus dynamicMultiBetBonus;

    @SerializedName("eventListPageDefaultSpecifier")
    private final EventListPageDefaultSpecifier eventListPageDefaultSpecifier;

    @SerializedName("feature")
    private final Feature feature;

    @SerializedName("gameTypes")
    private final List<InstantWinGameType> gameTypes;

    @SerializedName("gift")
    private final boolean gift;

    @SerializedName("keepBetLimit")
    private final Integer keepBetLimit;

    @SerializedName("marketCategories")
    private final List<MarketCategory> marketCategories;

    @SerializedName("maxPayout")
    private final String maxPayout;

    @SerializedName("maxStake")
    private final String maxStake;

    @SerializedName("minStake")
    private final String minStake;

    @SerializedName("multiBetBonus")
    private final MultiBetBonus multiBetBonus;

    @SerializedName("name")
    private final String name;

    @SerializedName("speedControllerConfig")
    private final NetworkSpeedControllerConfig speedControllerConfig;

    @SerializedName("sportId")
    private final String sportId;

    @SerializedName("statsEnable")
    private final boolean statsEnable;

    public /* synthetic */ Sports(boolean z, Long l, Long l2, String str, String str2, String str3, Integer num, boolean z2, String str4, String str5, int i, List list, List list2, MultiBetBonus multiBetBonus, DynamicMultiBetBonus dynamicMultiBetBonus, EventListPageDefaultSpecifier eventListPageDefaultSpecifier, Feature feature, boolean z3, SportsAnimationMode sportsAnimationMode, NetworkSpeedControllerConfig networkSpeedControllerConfig, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i2 & 2) != 0 ? null : l, (i2 & 4) != 0 ? null : l2, str, str2, str3, num, (i2 & 128) != 0 ? false : z2, str4, str5, i, list, list2, multiBetBonus, dynamicMultiBetBonus, eventListPageDefaultSpecifier, feature, (i2 & 131072) != 0 ? false : z3, sportsAnimationMode, networkSpeedControllerConfig);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Sports copy$default(Sports sports, boolean z, Long l, Long l2, String str, String str2, String str3, Integer num, boolean z2, String str4, String str5, int i, List list, List list2, MultiBetBonus multiBetBonus, DynamicMultiBetBonus dynamicMultiBetBonus, EventListPageDefaultSpecifier eventListPageDefaultSpecifier, Feature feature, boolean z3, SportsAnimationMode sportsAnimationMode, NetworkSpeedControllerConfig networkSpeedControllerConfig, int i2, Object obj) {
        NetworkSpeedControllerConfig networkSpeedControllerConfig2;
        SportsAnimationMode sportsAnimationMode2;
        boolean z4 = (i2 & 1) != 0 ? sports.active : z;
        Long l3 = (i2 & 2) != 0 ? sports.bdMinStake : l;
        Long l4 = (i2 & 4) != 0 ? sports.bdMaxStake : l2;
        String str6 = (i2 & 8) != 0 ? sports.minStake : str;
        String str7 = (i2 & 16) != 0 ? sports.maxStake : str2;
        String str8 = (i2 & 32) != 0 ? sports.maxPayout : str3;
        Integer num2 = (i2 & 64) != 0 ? sports.keepBetLimit : num;
        boolean z5 = (i2 & 128) != 0 ? sports.gift : z2;
        String str9 = (i2 & 256) != 0 ? sports.sportId : str4;
        String str10 = (i2 & 512) != 0 ? sports.name : str5;
        int i3 = (i2 & 1024) != 0 ? sports.bonusType : i;
        List list3 = (i2 & 2048) != 0 ? sports.gameTypes : list;
        List list4 = (i2 & 4096) != 0 ? sports.marketCategories : list2;
        MultiBetBonus multiBetBonus2 = (i2 & 8192) != 0 ? sports.multiBetBonus : multiBetBonus;
        boolean z6 = z4;
        DynamicMultiBetBonus dynamicMultiBetBonus2 = (i2 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? sports.dynamicMultiBetBonus : dynamicMultiBetBonus;
        EventListPageDefaultSpecifier eventListPageDefaultSpecifier2 = (i2 & 32768) != 0 ? sports.eventListPageDefaultSpecifier : eventListPageDefaultSpecifier;
        Feature feature2 = (i2 & 65536) != 0 ? sports.feature : feature;
        boolean z7 = (i2 & 131072) != 0 ? sports.statsEnable : z3;
        SportsAnimationMode sportsAnimationMode3 = (i2 & 262144) != 0 ? sports.animationMode : sportsAnimationMode;
        if ((i2 & 524288) != 0) {
            sportsAnimationMode2 = sportsAnimationMode3;
            networkSpeedControllerConfig2 = sports.speedControllerConfig;
        } else {
            networkSpeedControllerConfig2 = networkSpeedControllerConfig;
            sportsAnimationMode2 = sportsAnimationMode3;
        }
        return sports.copy(z6, l3, l4, str6, str7, str8, num2, z5, str9, str10, i3, list3, list4, multiBetBonus2, dynamicMultiBetBonus2, eventListPageDefaultSpecifier2, feature2, z7, sportsAnimationMode2, networkSpeedControllerConfig2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getActive() {
        return this.active;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getBonusType() {
        return this.bonusType;
    }

    public final List<InstantWinGameType> component12() {
        return this.gameTypes;
    }

    public final List<MarketCategory> component13() {
        return this.marketCategories;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final MultiBetBonus getMultiBetBonus() {
        return this.multiBetBonus;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final DynamicMultiBetBonus getDynamicMultiBetBonus() {
        return this.dynamicMultiBetBonus;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final EventListPageDefaultSpecifier getEventListPageDefaultSpecifier() {
        return this.eventListPageDefaultSpecifier;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final Feature getFeature() {
        return this.feature;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final boolean getStatsEnable() {
        return this.statsEnable;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final SportsAnimationMode getAnimationMode() {
        return this.animationMode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getBdMinStake() {
        return this.bdMinStake;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final NetworkSpeedControllerConfig getSpeedControllerConfig() {
        return this.speedControllerConfig;
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
    public final String getSportId() {
        return this.sportId;
    }

    public final Sports copy(boolean active, Long bdMinStake, Long bdMaxStake, String minStake, String maxStake, String maxPayout, Integer keepBetLimit, boolean gift, String sportId, String name, int bonusType, List<InstantWinGameType> gameTypes, List<MarketCategory> marketCategories, MultiBetBonus multiBetBonus, DynamicMultiBetBonus dynamicMultiBetBonus, EventListPageDefaultSpecifier eventListPageDefaultSpecifier, Feature feature, boolean statsEnable, SportsAnimationMode animationMode, NetworkSpeedControllerConfig speedControllerConfig) {
        qn4.b(minStake, maxStake, maxPayout, sportId, name);
        marketCategories.getClass();
        multiBetBonus.getClass();
        eventListPageDefaultSpecifier.getClass();
        return new Sports(active, bdMinStake, bdMaxStake, minStake, maxStake, maxPayout, keepBetLimit, gift, sportId, name, bonusType, gameTypes, marketCategories, multiBetBonus, dynamicMultiBetBonus, eventListPageDefaultSpecifier, feature, statsEnable, animationMode, speedControllerConfig);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Sports)) {
            return false;
        }
        Sports sports = (Sports) other;
        return this.active == sports.active && Intrinsics.g(this.bdMinStake, sports.bdMinStake) && Intrinsics.g(this.bdMaxStake, sports.bdMaxStake) && Intrinsics.g(this.minStake, sports.minStake) && Intrinsics.g(this.maxStake, sports.maxStake) && Intrinsics.g(this.maxPayout, sports.maxPayout) && Intrinsics.g(this.keepBetLimit, sports.keepBetLimit) && this.gift == sports.gift && Intrinsics.g(this.sportId, sports.sportId) && Intrinsics.g(this.name, sports.name) && this.bonusType == sports.bonusType && Intrinsics.g(this.gameTypes, sports.gameTypes) && Intrinsics.g(this.marketCategories, sports.marketCategories) && Intrinsics.g(this.multiBetBonus, sports.multiBetBonus) && Intrinsics.g(this.dynamicMultiBetBonus, sports.dynamicMultiBetBonus) && Intrinsics.g(this.eventListPageDefaultSpecifier, sports.eventListPageDefaultSpecifier) && Intrinsics.g(this.feature, sports.feature) && this.statsEnable == sports.statsEnable && this.animationMode == sports.animationMode && Intrinsics.g(this.speedControllerConfig, sports.speedControllerConfig);
    }

    public final boolean getActive() {
        return this.active;
    }

    public final SportsAnimationMode getAnimationMode() {
        return this.animationMode;
    }

    public final Long getBdMaxStake() {
        return this.bdMaxStake;
    }

    public final Long getBdMinStake() {
        return this.bdMinStake;
    }

    public final int getBonusType() {
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

    public final List<InstantWinGameType> getGameTypes() {
        return this.gameTypes;
    }

    public final boolean getGift() {
        return this.gift;
    }

    public final Integer getKeepBetLimit() {
        return this.keepBetLimit;
    }

    public final List<MarketCategory> getMarketCategories() {
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

    public final MultiBetBonus getMultiBetBonus() {
        return this.multiBetBonus;
    }

    public final String getName() {
        return this.name;
    }

    public final NetworkSpeedControllerConfig getSpeedControllerConfig() {
        return this.speedControllerConfig;
    }

    public final String getSportId() {
        return this.sportId;
    }

    public final boolean getStatsEnable() {
        return this.statsEnable;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.active) * 31;
        Long l = this.bdMinStake;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.bdMaxStake;
        int iA = gmf0.a(gmf0.a(gmf0.a((iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.minStake), 31, this.maxStake), 31, this.maxPayout);
        Integer num = this.keepBetLimit;
        int iA2 = gpp.a(this.bonusType, gmf0.a(gmf0.a(mtg0.a((iA + (num == null ? 0 : num.hashCode())) * 31, 31, this.gift), 31, this.sportId), 31, this.name), 31);
        List<InstantWinGameType> list = this.gameTypes;
        int iHashCode3 = (this.multiBetBonus.hashCode() + ai50.a((iA2 + (list == null ? 0 : list.hashCode())) * 31, 31, this.marketCategories)) * 31;
        DynamicMultiBetBonus dynamicMultiBetBonus = this.dynamicMultiBetBonus;
        int iHashCode4 = (this.eventListPageDefaultSpecifier.hashCode() + ((iHashCode3 + (dynamicMultiBetBonus == null ? 0 : dynamicMultiBetBonus.hashCode())) * 31)) * 31;
        Feature feature = this.feature;
        int iA3 = mtg0.a((iHashCode4 + (feature == null ? 0 : feature.hashCode())) * 31, 31, this.statsEnable);
        SportsAnimationMode sportsAnimationMode = this.animationMode;
        int iHashCode5 = (iA3 + (sportsAnimationMode == null ? 0 : sportsAnimationMode.hashCode())) * 31;
        NetworkSpeedControllerConfig networkSpeedControllerConfig = this.speedControllerConfig;
        return iHashCode5 + (networkSpeedControllerConfig != null ? networkSpeedControllerConfig.hashCode() : 0);
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
        String str4 = this.sportId;
        String str5 = this.name;
        int i = this.bonusType;
        List<InstantWinGameType> list = this.gameTypes;
        List<MarketCategory> list2 = this.marketCategories;
        MultiBetBonus multiBetBonus = this.multiBetBonus;
        DynamicMultiBetBonus dynamicMultiBetBonus = this.dynamicMultiBetBonus;
        EventListPageDefaultSpecifier eventListPageDefaultSpecifier = this.eventListPageDefaultSpecifier;
        Feature feature = this.feature;
        boolean z3 = this.statsEnable;
        SportsAnimationMode sportsAnimationMode = this.animationMode;
        NetworkSpeedControllerConfig networkSpeedControllerConfig = this.speedControllerConfig;
        StringBuilder sb = new StringBuilder("Sports(active=");
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
        sb.append(", sportId=");
        hxa.c(sb, str4, ", name=", str5, ", bonusType=");
        sb.append(i);
        sb.append(", gameTypes=");
        sb.append(list);
        sb.append(", marketCategories=");
        sb.append(list2);
        sb.append(", multiBetBonus=");
        sb.append(multiBetBonus);
        sb.append(", dynamicMultiBetBonus=");
        sb.append(dynamicMultiBetBonus);
        sb.append(", eventListPageDefaultSpecifier=");
        sb.append(eventListPageDefaultSpecifier);
        sb.append(", feature=");
        sb.append(feature);
        sb.append(", statsEnable=");
        sb.append(z3);
        sb.append(", animationMode=");
        sb.append(sportsAnimationMode);
        sb.append(", speedControllerConfig=");
        sb.append(networkSpeedControllerConfig);
        sb.append(")");
        return sb.toString();
    }

    public Sports(boolean z, Long l, Long l2, String str, String str2, String str3, Integer num, boolean z2, String str4, String str5, int i, List<InstantWinGameType> list, List<MarketCategory> list2, MultiBetBonus multiBetBonus, DynamicMultiBetBonus dynamicMultiBetBonus, EventListPageDefaultSpecifier eventListPageDefaultSpecifier, Feature feature, boolean z3, SportsAnimationMode sportsAnimationMode, NetworkSpeedControllerConfig networkSpeedControllerConfig) {
        qn4.b(str, str2, str3, str4, str5);
        list2.getClass();
        multiBetBonus.getClass();
        eventListPageDefaultSpecifier.getClass();
        this.active = z;
        this.bdMinStake = l;
        this.bdMaxStake = l2;
        this.minStake = str;
        this.maxStake = str2;
        this.maxPayout = str3;
        this.keepBetLimit = num;
        this.gift = z2;
        this.sportId = str4;
        this.name = str5;
        this.bonusType = i;
        this.gameTypes = list;
        this.marketCategories = list2;
        this.multiBetBonus = multiBetBonus;
        this.dynamicMultiBetBonus = dynamicMultiBetBonus;
        this.eventListPageDefaultSpecifier = eventListPageDefaultSpecifier;
        this.feature = feature;
        this.statsEnable = z3;
        this.animationMode = sportsAnimationMode;
        this.speedControllerConfig = networkSpeedControllerConfig;
    }
}
