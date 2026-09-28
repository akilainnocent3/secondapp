package com.sporty.android.core.model.loyalty;

import com.appsflyer.internal.x;
import defpackage.ai50;
import defpackage.f87;
import defpackage.lsv;
import defpackage.qjk;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b?\b\u0086\b\u0018\u00002\u00020\u0001Bï\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0010\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0010\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0010\u0012\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0010\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0010\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b#\u0010$J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\t\u0010G\u001a\u00020\u0005HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010I\u001a\u00020\bHÆ\u0003J\u0010\u0010J\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010-J\u0010\u0010K\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u00100J\t\u0010L\u001a\u00020\u000eHÆ\u0003J\u000f\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010HÆ\u0003J\u000f\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010HÆ\u0003J\u000f\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010HÆ\u0003J\u000f\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00140\u0010HÆ\u0003J\u0011\u0010Q\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0010HÆ\u0003J\u0011\u0010R\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0010HÆ\u0003J\u0011\u0010S\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0010HÆ\u0003J\u0010\u0010T\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010-J\u0010\u0010U\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010-J\u0010\u0010V\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0002\u0010?J\u0010\u0010W\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0002\u0010?J\u000f\u0010X\u001a\b\u0012\u0004\u0012\u00020!0\u0010HÆ\u0003J\u0010\u0010Y\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010DJ\u009c\u0002\u0010Z\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00102\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00102\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00102\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00102\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00102\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00102\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00102\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u00102\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010[J\u0014\u0010\\\u001a\u00020\u001e2\b\u0010]\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010^\u001a\u00020\fHÖ\u0081\u0004J\n\u0010_\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010&R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010.\u001a\u0004\b,\u0010-R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u00101\u001a\u0004\b/\u00100R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010¢\u0006\b\n\u0000\u001a\u0004\b6\u00105R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010¢\u0006\b\n\u0000\u001a\u0004\b7\u00105R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0010¢\u0006\b\n\u0000\u001a\u0004\b8\u00105R\u0019\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b9\u00105R\u0019\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b:\u00105R\u0019\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b;\u00105R\u0015\u0010\u001b\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010.\u001a\u0004\b<\u0010-R\u0015\u0010\u001c\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010.\u001a\u0004\b=\u0010-R\u0015\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\n\n\u0002\u0010@\u001a\u0004\b>\u0010?R\u0015\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\n\n\u0002\u0010@\u001a\u0004\bA\u0010?R\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0010¢\u0006\b\n\u0000\u001a\u0004\bB\u00105R\u0015\u0010\"\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010E\u001a\u0004\bC\u0010D¨\u0006`"}, d2 = {"Lcom/sporty/android/core/model/loyalty/MissionCriteria;", "", "url", "", "lastParticipationTime", "", "participationDuration", "betCategory", "Lcom/sporty/android/core/model/loyalty/MissionBetCategory;", "betTotal", "", "placeTotal", "", "betInSpecificRealSportType", "Lcom/sporty/android/core/model/loyalty/RealSportType;", "betInSpecificRealSportTypeSportIdList", "", "betInSpecificTournamentList", "betInSpecificMarketList", "betTypeList", "Lcom/sporty/android/core/model/loyalty/BetType;", "betBuilderTypeList", "Lcom/sporty/android/core/model/loyalty/BetBuilderType;", "upTypeList", "Lcom/sporty/android/core/model/loyalty/UpType;", "earlyGoalsTypeList", "Lcom/sporty/android/core/model/loyalty/EarlyGoalsType;", "minStake", "minTotalOdd", "giftUsage", "", "cashOut", "rewardList", "Lcom/sporty/android/core/model/loyalty/MissionRewardDto;", "purchasePayTotal", "<init>", "(Ljava/lang/String;JLjava/lang/String;Lcom/sporty/android/core/model/loyalty/MissionBetCategory;Ljava/lang/Double;Ljava/lang/Integer;Lcom/sporty/android/core/model/loyalty/RealSportType;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Long;)V", "getUrl", "()Ljava/lang/String;", "getLastParticipationTime", "()J", "getParticipationDuration", "getBetCategory", "()Lcom/sporty/android/core/model/loyalty/MissionBetCategory;", "getBetTotal", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getPlaceTotal", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBetInSpecificRealSportType", "()Lcom/sporty/android/core/model/loyalty/RealSportType;", "getBetInSpecificRealSportTypeSportIdList", "()Ljava/util/List;", "getBetInSpecificTournamentList", "getBetInSpecificMarketList", "getBetTypeList", "getBetBuilderTypeList", "getUpTypeList", "getEarlyGoalsTypeList", "getMinStake", "getMinTotalOdd", "getGiftUsage", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCashOut", "getRewardList", "getPurchasePayTotal", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "copy", "(Ljava/lang/String;JLjava/lang/String;Lcom/sporty/android/core/model/loyalty/MissionBetCategory;Ljava/lang/Double;Ljava/lang/Integer;Lcom/sporty/android/core/model/loyalty/RealSportType;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Long;)Lcom/sporty/android/core/model/loyalty/MissionCriteria;", "equals", "other", "hashCode", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class MissionCriteria {
    private final List<BetBuilderType> betBuilderTypeList;
    private final MissionBetCategory betCategory;
    private final List<String> betInSpecificMarketList;
    private final RealSportType betInSpecificRealSportType;
    private final List<String> betInSpecificRealSportTypeSportIdList;
    private final List<String> betInSpecificTournamentList;
    private final Double betTotal;
    private final List<BetType> betTypeList;
    private final Boolean cashOut;
    private final List<EarlyGoalsType> earlyGoalsTypeList;
    private final Boolean giftUsage;
    private final long lastParticipationTime;
    private final Double minStake;
    private final Double minTotalOdd;
    private final String participationDuration;
    private final Integer placeTotal;
    private final Long purchasePayTotal;
    private final List<MissionRewardDto> rewardList;
    private final List<UpType> upTypeList;
    private final String url;

    /* JADX WARN: Multi-variable type inference failed */
    public MissionCriteria(String str, long j, String str2, MissionBetCategory missionBetCategory, Double d, Integer num, RealSportType realSportType, List<String> list, List<String> list2, List<String> list3, List<? extends BetType> list4, List<? extends BetBuilderType> list5, List<? extends UpType> list6, List<? extends EarlyGoalsType> list7, Double d2, Double d3, Boolean bool, Boolean bool2, List<MissionRewardDto> list8, Long l) {
        str.getClass();
        missionBetCategory.getClass();
        realSportType.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        list8.getClass();
        this.url = str;
        this.lastParticipationTime = j;
        this.participationDuration = str2;
        this.betCategory = missionBetCategory;
        this.betTotal = d;
        this.placeTotal = num;
        this.betInSpecificRealSportType = realSportType;
        this.betInSpecificRealSportTypeSportIdList = list;
        this.betInSpecificTournamentList = list2;
        this.betInSpecificMarketList = list3;
        this.betTypeList = list4;
        this.betBuilderTypeList = list5;
        this.upTypeList = list6;
        this.earlyGoalsTypeList = list7;
        this.minStake = d2;
        this.minTotalOdd = d3;
        this.giftUsage = bool;
        this.cashOut = bool2;
        this.rewardList = list8;
        this.purchasePayTotal = l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MissionCriteria copy$default(MissionCriteria missionCriteria, String str, long j, String str2, MissionBetCategory missionBetCategory, Double d, Integer num, RealSportType realSportType, List list, List list2, List list3, List list4, List list5, List list6, List list7, Double d2, Double d3, Boolean bool, Boolean bool2, List list8, Long l, int i, Object obj) {
        Long l2;
        List list9;
        String str3 = (i & 1) != 0 ? missionCriteria.url : str;
        long j2 = (i & 2) != 0 ? missionCriteria.lastParticipationTime : j;
        String str4 = (i & 4) != 0 ? missionCriteria.participationDuration : str2;
        MissionBetCategory missionBetCategory2 = (i & 8) != 0 ? missionCriteria.betCategory : missionBetCategory;
        Double d4 = (i & 16) != 0 ? missionCriteria.betTotal : d;
        Integer num2 = (i & 32) != 0 ? missionCriteria.placeTotal : num;
        RealSportType realSportType2 = (i & 64) != 0 ? missionCriteria.betInSpecificRealSportType : realSportType;
        List list10 = (i & 128) != 0 ? missionCriteria.betInSpecificRealSportTypeSportIdList : list;
        List list11 = (i & 256) != 0 ? missionCriteria.betInSpecificTournamentList : list2;
        List list12 = (i & 512) != 0 ? missionCriteria.betInSpecificMarketList : list3;
        List list13 = (i & 1024) != 0 ? missionCriteria.betTypeList : list4;
        List list14 = (i & 2048) != 0 ? missionCriteria.betBuilderTypeList : list5;
        List list15 = (i & 4096) != 0 ? missionCriteria.upTypeList : list6;
        String str5 = str3;
        List list16 = (i & 8192) != 0 ? missionCriteria.earlyGoalsTypeList : list7;
        Double d5 = (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? missionCriteria.minStake : d2;
        Double d6 = (i & 32768) != 0 ? missionCriteria.minTotalOdd : d3;
        Boolean bool3 = (i & 65536) != 0 ? missionCriteria.giftUsage : bool;
        Boolean bool4 = (i & 131072) != 0 ? missionCriteria.cashOut : bool2;
        List list17 = (i & 262144) != 0 ? missionCriteria.rewardList : list8;
        if ((i & 524288) != 0) {
            list9 = list17;
            l2 = missionCriteria.purchasePayTotal;
        } else {
            l2 = l;
            list9 = list17;
        }
        return missionCriteria.copy(str5, j2, str4, missionBetCategory2, d4, num2, realSportType2, list10, list11, list12, list13, list14, list15, list16, d5, d6, bool3, bool4, list9, l2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public final List<String> component10() {
        return this.betInSpecificMarketList;
    }

    public final List<BetType> component11() {
        return this.betTypeList;
    }

    public final List<BetBuilderType> component12() {
        return this.betBuilderTypeList;
    }

    public final List<UpType> component13() {
        return this.upTypeList;
    }

    public final List<EarlyGoalsType> component14() {
        return this.earlyGoalsTypeList;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Double getMinStake() {
        return this.minStake;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Double getMinTotalOdd() {
        return this.minTotalOdd;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final Boolean getGiftUsage() {
        return this.giftUsage;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final Boolean getCashOut() {
        return this.cashOut;
    }

    public final List<MissionRewardDto> component19() {
        return this.rewardList;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getLastParticipationTime() {
        return this.lastParticipationTime;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final Long getPurchasePayTotal() {
        return this.purchasePayTotal;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getParticipationDuration() {
        return this.participationDuration;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final MissionBetCategory getBetCategory() {
        return this.betCategory;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Double getBetTotal() {
        return this.betTotal;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getPlaceTotal() {
        return this.placeTotal;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final RealSportType getBetInSpecificRealSportType() {
        return this.betInSpecificRealSportType;
    }

    public final List<String> component8() {
        return this.betInSpecificRealSportTypeSportIdList;
    }

    public final List<String> component9() {
        return this.betInSpecificTournamentList;
    }

    public final MissionCriteria copy(String url, long lastParticipationTime, String participationDuration, MissionBetCategory betCategory, Double betTotal, Integer placeTotal, RealSportType betInSpecificRealSportType, List<String> betInSpecificRealSportTypeSportIdList, List<String> betInSpecificTournamentList, List<String> betInSpecificMarketList, List<? extends BetType> betTypeList, List<? extends BetBuilderType> betBuilderTypeList, List<? extends UpType> upTypeList, List<? extends EarlyGoalsType> earlyGoalsTypeList, Double minStake, Double minTotalOdd, Boolean giftUsage, Boolean cashOut, List<MissionRewardDto> rewardList, Long purchasePayTotal) {
        url.getClass();
        betCategory.getClass();
        betInSpecificRealSportType.getClass();
        betInSpecificRealSportTypeSportIdList.getClass();
        betInSpecificTournamentList.getClass();
        betInSpecificMarketList.getClass();
        betTypeList.getClass();
        rewardList.getClass();
        return new MissionCriteria(url, lastParticipationTime, participationDuration, betCategory, betTotal, placeTotal, betInSpecificRealSportType, betInSpecificRealSportTypeSportIdList, betInSpecificTournamentList, betInSpecificMarketList, betTypeList, betBuilderTypeList, upTypeList, earlyGoalsTypeList, minStake, minTotalOdd, giftUsage, cashOut, rewardList, purchasePayTotal);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MissionCriteria)) {
            return false;
        }
        MissionCriteria missionCriteria = (MissionCriteria) other;
        return Intrinsics.g(this.url, missionCriteria.url) && this.lastParticipationTime == missionCriteria.lastParticipationTime && Intrinsics.g(this.participationDuration, missionCriteria.participationDuration) && this.betCategory == missionCriteria.betCategory && Intrinsics.g(this.betTotal, missionCriteria.betTotal) && Intrinsics.g(this.placeTotal, missionCriteria.placeTotal) && this.betInSpecificRealSportType == missionCriteria.betInSpecificRealSportType && Intrinsics.g(this.betInSpecificRealSportTypeSportIdList, missionCriteria.betInSpecificRealSportTypeSportIdList) && Intrinsics.g(this.betInSpecificTournamentList, missionCriteria.betInSpecificTournamentList) && Intrinsics.g(this.betInSpecificMarketList, missionCriteria.betInSpecificMarketList) && Intrinsics.g(this.betTypeList, missionCriteria.betTypeList) && Intrinsics.g(this.betBuilderTypeList, missionCriteria.betBuilderTypeList) && Intrinsics.g(this.upTypeList, missionCriteria.upTypeList) && Intrinsics.g(this.earlyGoalsTypeList, missionCriteria.earlyGoalsTypeList) && Intrinsics.g(this.minStake, missionCriteria.minStake) && Intrinsics.g(this.minTotalOdd, missionCriteria.minTotalOdd) && Intrinsics.g(this.giftUsage, missionCriteria.giftUsage) && Intrinsics.g(this.cashOut, missionCriteria.cashOut) && Intrinsics.g(this.rewardList, missionCriteria.rewardList) && Intrinsics.g(this.purchasePayTotal, missionCriteria.purchasePayTotal);
    }

    public final List<BetBuilderType> getBetBuilderTypeList() {
        return this.betBuilderTypeList;
    }

    public final MissionBetCategory getBetCategory() {
        return this.betCategory;
    }

    public final List<String> getBetInSpecificMarketList() {
        return this.betInSpecificMarketList;
    }

    public final RealSportType getBetInSpecificRealSportType() {
        return this.betInSpecificRealSportType;
    }

    public final List<String> getBetInSpecificRealSportTypeSportIdList() {
        return this.betInSpecificRealSportTypeSportIdList;
    }

    public final List<String> getBetInSpecificTournamentList() {
        return this.betInSpecificTournamentList;
    }

    public final Double getBetTotal() {
        return this.betTotal;
    }

    public final List<BetType> getBetTypeList() {
        return this.betTypeList;
    }

    public final Boolean getCashOut() {
        return this.cashOut;
    }

    public final List<EarlyGoalsType> getEarlyGoalsTypeList() {
        return this.earlyGoalsTypeList;
    }

    public final Boolean getGiftUsage() {
        return this.giftUsage;
    }

    public final long getLastParticipationTime() {
        return this.lastParticipationTime;
    }

    public final Double getMinStake() {
        return this.minStake;
    }

    public final Double getMinTotalOdd() {
        return this.minTotalOdd;
    }

    public final String getParticipationDuration() {
        return this.participationDuration;
    }

    public final Integer getPlaceTotal() {
        return this.placeTotal;
    }

    public final Long getPurchasePayTotal() {
        return this.purchasePayTotal;
    }

    public final List<MissionRewardDto> getRewardList() {
        return this.rewardList;
    }

    public final List<UpType> getUpTypeList() {
        return this.upTypeList;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iA = f87.a(this.url.hashCode() * 31, this.lastParticipationTime, 31);
        String str = this.participationDuration;
        int iHashCode = (this.betCategory.hashCode() + ((iA + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        Double d = this.betTotal;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        Integer num = this.placeTotal;
        int iA2 = ai50.a(ai50.a(ai50.a(ai50.a((this.betInSpecificRealSportType.hashCode() + ((iHashCode2 + (num == null ? 0 : num.hashCode())) * 31)) * 31, 31, this.betInSpecificRealSportTypeSportIdList), 31, this.betInSpecificTournamentList), 31, this.betInSpecificMarketList), 31, this.betTypeList);
        List<BetBuilderType> list = this.betBuilderTypeList;
        int iHashCode3 = (iA2 + (list == null ? 0 : list.hashCode())) * 31;
        List<UpType> list2 = this.upTypeList;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<EarlyGoalsType> list3 = this.earlyGoalsTypeList;
        int iHashCode5 = (iHashCode4 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Double d2 = this.minStake;
        int iHashCode6 = (iHashCode5 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.minTotalOdd;
        int iHashCode7 = (iHashCode6 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Boolean bool = this.giftUsage;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.cashOut;
        int iA3 = ai50.a((iHashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31, 31, this.rewardList);
        Long l = this.purchasePayTotal;
        return iA3 + (l != null ? l.hashCode() : 0);
    }

    public String toString() {
        String str = this.url;
        long j = this.lastParticipationTime;
        String str2 = this.participationDuration;
        MissionBetCategory missionBetCategory = this.betCategory;
        Double d = this.betTotal;
        Integer num = this.placeTotal;
        RealSportType realSportType = this.betInSpecificRealSportType;
        List<String> list = this.betInSpecificRealSportTypeSportIdList;
        List<String> list2 = this.betInSpecificTournamentList;
        List<String> list3 = this.betInSpecificMarketList;
        List<BetType> list4 = this.betTypeList;
        List<BetBuilderType> list5 = this.betBuilderTypeList;
        List<UpType> list6 = this.upTypeList;
        List<EarlyGoalsType> list7 = this.earlyGoalsTypeList;
        Double d2 = this.minStake;
        Double d3 = this.minTotalOdd;
        Boolean bool = this.giftUsage;
        Boolean bool2 = this.cashOut;
        List<MissionRewardDto> list8 = this.rewardList;
        Long l = this.purchasePayTotal;
        StringBuilder sbA = x.a(j, "MissionCriteria(url=", str, ", lastParticipationTime=");
        sbA.append(", participationDuration=");
        sbA.append(str2);
        sbA.append(", betCategory=");
        sbA.append(missionBetCategory);
        sbA.append(", betTotal=");
        sbA.append(d);
        sbA.append(", placeTotal=");
        sbA.append(num);
        sbA.append(", betInSpecificRealSportType=");
        sbA.append(realSportType);
        sbA.append(", betInSpecificRealSportTypeSportIdList=");
        sbA.append(list);
        qjk.a(", betInSpecificTournamentList=", ", betInSpecificMarketList=", sbA, list2, list3);
        qjk.a(", betTypeList=", ", betBuilderTypeList=", sbA, list4, list5);
        qjk.a(", upTypeList=", ", earlyGoalsTypeList=", sbA, list6, list7);
        lsv.a(d2, d3, ", minStake=", ", minTotalOdd=", sbA);
        sbA.append(", giftUsage=");
        sbA.append(bool);
        sbA.append(", cashOut=");
        sbA.append(bool2);
        sbA.append(", rewardList=");
        sbA.append(list8);
        sbA.append(", purchasePayTotal=");
        sbA.append(l);
        sbA.append(")");
        return sbA.toString();
    }

    public /* synthetic */ MissionCriteria(String str, long j, String str2, MissionBetCategory missionBetCategory, Double d, Integer num, RealSportType realSportType, List list, List list2, List list3, List list4, List list5, List list6, List list7, Double d2, Double d3, Boolean bool, Boolean bool2, List list8, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, str2, missionBetCategory, d, num, realSportType, list, list2, list3, list4, list5, list6, list7, d2, d3, bool, bool2, list8, (i & 524288) != 0 ? null : l);
    }
}
