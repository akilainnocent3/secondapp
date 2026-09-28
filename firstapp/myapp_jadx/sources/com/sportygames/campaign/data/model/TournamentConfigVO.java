package com.sportygames.campaign.data.model;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.plugin.webcontainer.caipiao.jsplugin.JsPluginCommon;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b<\b\u0087\b\u0018\u00002\u00020\u0001BÇ\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0011\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u0010=\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010D\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010,J\u0010\u0010E\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010/J\u0011\u0010F\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003J\u0011\u0010G\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0011HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010J\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0002\u00107J\u0010\u0010K\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0002\u00107J\u0010\u0010L\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0002\u00107J\u0010\u0010M\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0002\u00107Jò\u0001\u0010N\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0018HÆ\u0001¢\u0006\u0002\u0010OJ\u0013\u0010P\u001a\u00020\u00182\b\u0010Q\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010R\u001a\u00020\u000fHÖ\u0001J\t\u0010S\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\"R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\"\"\u0004\b&\u0010'R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\"R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\"R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\"R\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010-\u001a\u0004\b+\u0010,R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u00100\u001a\u0004\b.\u0010/R\u0019\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0019\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b3\u00102R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\"R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\"R\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\n\n\u0002\u00108\u001a\u0004\b6\u00107R\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\n\n\u0002\u00108\u001a\u0004\b9\u00107R\u0015\u0010\u001a\u001a\u0004\u0018\u00010\u0018¢\u0006\n\n\u0002\u00108\u001a\u0004\b:\u00107R\u0015\u0010\u001b\u001a\u0004\u0018\u00010\u0018¢\u0006\n\n\u0002\u00108\u001a\u0004\b;\u00107¨\u0006T"}, d2 = {"Lcom/sportygames/campaign/data/model/TournamentConfigVO;", "", AnalyticsParam.EVENT_PARAM_ID, "", "name", "", "countryCode", "currency", AnalyticsParam.EVENT_STATUS, "startTime", "endTime", JsPluginCommon.GAMES_BET_PLACED_GAME_NAME_ARGUMENT, "totalPrize", "", "maxParticipants", "", "prizeInfo", "", "Lcom/sportygames/campaign/data/model/PrizeInfo;", "eligibilityCriteria", "Lcom/sportygames/campaign/data/model/EligibilityCriteria;", "durationTypeStatusEnum", "tournamentTypeEnum", "maxParticipantsReached", "", "active", "activeByTime", "ended", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getName", "()Ljava/lang/String;", "getCountryCode", "getCurrency", "getStatus", "setStatus", "(Ljava/lang/String;)V", "getStartTime", "getEndTime", "getGameName", "getTotalPrize", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getMaxParticipants", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPrizeInfo", "()Ljava/util/List;", "getEligibilityCriteria", "getDurationTypeStatusEnum", "getTournamentTypeEnum", "getMaxParticipantsReached", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getActive", "getActiveByTime", "getEnded", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/sportygames/campaign/data/model/TournamentConfigVO;", "equals", "other", "hashCode", "toString", "campaign_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TournamentConfigVO {
    public static final int $stable = 8;
    private final Boolean active;
    private final Boolean activeByTime;
    private final String countryCode;
    private final String currency;
    private final String durationTypeStatusEnum;
    private final List<EligibilityCriteria> eligibilityCriteria;
    private final String endTime;
    private final Boolean ended;
    private final String gameName;
    private final Long id;
    private final Integer maxParticipants;
    private final Boolean maxParticipantsReached;
    private final String name;
    private final List<PrizeInfo> prizeInfo;
    private final String startTime;
    private String status;
    private final Double totalPrize;
    private final String tournamentTypeEnum;

    public TournamentConfigVO(Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, Double d, Integer num, List<PrizeInfo> list, List<EligibilityCriteria> list2, String str8, String str9, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        this.id = l;
        this.name = str;
        this.countryCode = str2;
        this.currency = str3;
        this.status = str4;
        this.startTime = str5;
        this.endTime = str6;
        this.gameName = str7;
        this.totalPrize = d;
        this.maxParticipants = num;
        this.prizeInfo = list;
        this.eligibilityCriteria = list2;
        this.durationTypeStatusEnum = str8;
        this.tournamentTypeEnum = str9;
        this.maxParticipantsReached = bool;
        this.active = bool2;
        this.activeByTime = bool3;
        this.ended = bool4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TournamentConfigVO copy$default(TournamentConfigVO tournamentConfigVO, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, Double d, Integer num, List list, List list2, String str8, String str9, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, int i, Object obj) {
        Boolean bool5;
        Boolean bool6;
        Long l2 = (i & 1) != 0 ? tournamentConfigVO.id : l;
        String str10 = (i & 2) != 0 ? tournamentConfigVO.name : str;
        String str11 = (i & 4) != 0 ? tournamentConfigVO.countryCode : str2;
        String str12 = (i & 8) != 0 ? tournamentConfigVO.currency : str3;
        String str13 = (i & 16) != 0 ? tournamentConfigVO.status : str4;
        String str14 = (i & 32) != 0 ? tournamentConfigVO.startTime : str5;
        String str15 = (i & 64) != 0 ? tournamentConfigVO.endTime : str6;
        String str16 = (i & 128) != 0 ? tournamentConfigVO.gameName : str7;
        Double d2 = (i & 256) != 0 ? tournamentConfigVO.totalPrize : d;
        Integer num2 = (i & 512) != 0 ? tournamentConfigVO.maxParticipants : num;
        List list3 = (i & 1024) != 0 ? tournamentConfigVO.prizeInfo : list;
        List list4 = (i & 2048) != 0 ? tournamentConfigVO.eligibilityCriteria : list2;
        String str17 = (i & 4096) != 0 ? tournamentConfigVO.durationTypeStatusEnum : str8;
        String str18 = (i & 8192) != 0 ? tournamentConfigVO.tournamentTypeEnum : str9;
        Long l3 = l2;
        Boolean bool7 = (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? tournamentConfigVO.maxParticipantsReached : bool;
        Boolean bool8 = (i & 32768) != 0 ? tournamentConfigVO.active : bool2;
        Boolean bool9 = (i & 65536) != 0 ? tournamentConfigVO.activeByTime : bool3;
        if ((i & 131072) != 0) {
            bool6 = bool9;
            bool5 = tournamentConfigVO.ended;
        } else {
            bool5 = bool4;
            bool6 = bool9;
        }
        return tournamentConfigVO.copy(l3, str10, str11, str12, str13, str14, str15, str16, d2, num2, list3, list4, str17, str18, bool7, bool8, bool6, bool5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Integer getMaxParticipants() {
        return this.maxParticipants;
    }

    public final List<PrizeInfo> component11() {
        return this.prizeInfo;
    }

    public final List<EligibilityCriteria> component12() {
        return this.eligibilityCriteria;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getDurationTypeStatusEnum() {
        return this.durationTypeStatusEnum;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getTournamentTypeEnum() {
        return this.tournamentTypeEnum;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Boolean getMaxParticipantsReached() {
        return this.maxParticipantsReached;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Boolean getActive() {
        return this.active;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final Boolean getActiveByTime() {
        return this.activeByTime;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final Boolean getEnded() {
        return this.ended;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getEndTime() {
        return this.endTime;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getGameName() {
        return this.gameName;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Double getTotalPrize() {
        return this.totalPrize;
    }

    public final TournamentConfigVO copy(Long id, String name, String countryCode, String currency, String status, String startTime, String endTime, String gameName, Double totalPrize, Integer maxParticipants, List<PrizeInfo> prizeInfo, List<EligibilityCriteria> eligibilityCriteria, String durationTypeStatusEnum, String tournamentTypeEnum, Boolean maxParticipantsReached, Boolean active, Boolean activeByTime, Boolean ended) {
        return new TournamentConfigVO(id, name, countryCode, currency, status, startTime, endTime, gameName, totalPrize, maxParticipants, prizeInfo, eligibilityCriteria, durationTypeStatusEnum, tournamentTypeEnum, maxParticipantsReached, active, activeByTime, ended);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TournamentConfigVO)) {
            return false;
        }
        TournamentConfigVO tournamentConfigVO = (TournamentConfigVO) other;
        return Intrinsics.g(this.id, tournamentConfigVO.id) && Intrinsics.g(this.name, tournamentConfigVO.name) && Intrinsics.g(this.countryCode, tournamentConfigVO.countryCode) && Intrinsics.g(this.currency, tournamentConfigVO.currency) && Intrinsics.g(this.status, tournamentConfigVO.status) && Intrinsics.g(this.startTime, tournamentConfigVO.startTime) && Intrinsics.g(this.endTime, tournamentConfigVO.endTime) && Intrinsics.g(this.gameName, tournamentConfigVO.gameName) && Intrinsics.g(this.totalPrize, tournamentConfigVO.totalPrize) && Intrinsics.g(this.maxParticipants, tournamentConfigVO.maxParticipants) && Intrinsics.g(this.prizeInfo, tournamentConfigVO.prizeInfo) && Intrinsics.g(this.eligibilityCriteria, tournamentConfigVO.eligibilityCriteria) && Intrinsics.g(this.durationTypeStatusEnum, tournamentConfigVO.durationTypeStatusEnum) && Intrinsics.g(this.tournamentTypeEnum, tournamentConfigVO.tournamentTypeEnum) && Intrinsics.g(this.maxParticipantsReached, tournamentConfigVO.maxParticipantsReached) && Intrinsics.g(this.active, tournamentConfigVO.active) && Intrinsics.g(this.activeByTime, tournamentConfigVO.activeByTime) && Intrinsics.g(this.ended, tournamentConfigVO.ended);
    }

    public final Boolean getActive() {
        return this.active;
    }

    public final Boolean getActiveByTime() {
        return this.activeByTime;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getDurationTypeStatusEnum() {
        return this.durationTypeStatusEnum;
    }

    public final List<EligibilityCriteria> getEligibilityCriteria() {
        return this.eligibilityCriteria;
    }

    public final String getEndTime() {
        return this.endTime;
    }

    public final Boolean getEnded() {
        return this.ended;
    }

    public final String getGameName() {
        return this.gameName;
    }

    public final Long getId() {
        return this.id;
    }

    public final Integer getMaxParticipants() {
        return this.maxParticipants;
    }

    public final Boolean getMaxParticipantsReached() {
        return this.maxParticipantsReached;
    }

    public final String getName() {
        return this.name;
    }

    public final List<PrizeInfo> getPrizeInfo() {
        return this.prizeInfo;
    }

    public final String getStartTime() {
        return this.startTime;
    }

    public final String getStatus() {
        return this.status;
    }

    public final Double getTotalPrize() {
        return this.totalPrize;
    }

    public final String getTournamentTypeEnum() {
        return this.tournamentTypeEnum;
    }

    public int hashCode() {
        Long l = this.id;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.countryCode;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.currency;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.status;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.startTime;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.endTime;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.gameName;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Double d = this.totalPrize;
        int iHashCode9 = (iHashCode8 + (d == null ? 0 : d.hashCode())) * 31;
        Integer num = this.maxParticipants;
        int iHashCode10 = (iHashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        List<PrizeInfo> list = this.prizeInfo;
        int iHashCode11 = (iHashCode10 + (list == null ? 0 : list.hashCode())) * 31;
        List<EligibilityCriteria> list2 = this.eligibilityCriteria;
        int iHashCode12 = (iHashCode11 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str8 = this.durationTypeStatusEnum;
        int iHashCode13 = (iHashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.tournamentTypeEnum;
        int iHashCode14 = (iHashCode13 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Boolean bool = this.maxParticipantsReached;
        int iHashCode15 = (iHashCode14 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.active;
        int iHashCode16 = (iHashCode15 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.activeByTime;
        int iHashCode17 = (iHashCode16 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.ended;
        return iHashCode17 + (bool4 != null ? bool4.hashCode() : 0);
    }

    public final void setStatus(String str) {
        this.status = str;
    }

    public String toString() {
        return "TournamentConfigVO(id=" + this.id + ", name=" + this.name + ", countryCode=" + this.countryCode + ", currency=" + this.currency + ", status=" + this.status + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", gameName=" + this.gameName + ", totalPrize=" + this.totalPrize + ", maxParticipants=" + this.maxParticipants + ", prizeInfo=" + this.prizeInfo + ", eligibilityCriteria=" + this.eligibilityCriteria + ", durationTypeStatusEnum=" + this.durationTypeStatusEnum + ", tournamentTypeEnum=" + this.tournamentTypeEnum + ", maxParticipantsReached=" + this.maxParticipantsReached + ", active=" + this.active + ", activeByTime=" + this.activeByTime + ", ended=" + this.ended + ')';
    }
}
