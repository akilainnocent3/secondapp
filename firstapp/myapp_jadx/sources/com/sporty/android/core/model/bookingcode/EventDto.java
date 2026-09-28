package com.sporty.android.core.model.bookingcode;

import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.ai50;
import defpackage.gfs;
import defpackage.hxa;
import defpackage.m2g;
import defpackage.rg2;
import defpackage.ux5;
import defpackage.w03;
import defpackage.x03;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b6\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bó\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\f\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001d\u0010\u001eJ\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010A\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010&J\u0010\u0010B\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010)J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00030\fHÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000f\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00150\fHÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010M\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0002\u00108J\u0010\u0010N\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0002\u00108J\u000b\u0010O\u001a\u0004\u0018\u00010\u001bHÆ\u0003J\u0010\u0010P\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0002\u00108Jú\u0001\u0010Q\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\f2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0018HÆ\u0001¢\u0006\u0002\u0010RJ\u0014\u0010S\u001a\u00020\u00182\b\u0010T\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010U\u001a\u00020\tHÖ\u0081\u0004J\n\u0010V\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b!\u0012\b\b\"\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R'\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b!\u0012\b\b\"\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010 R'\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b!\u0012\b\b\"\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010 R)\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u0092\u0002\f\b!\u0012\b\b\"\u0012\u0004\b\b(\u0006¢\u0006\n\n\u0002\u0010'\u001a\u0004\b%\u0010&R)\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u0092\u0002\f\b!\u0012\b\b\"\u0012\u0004\b\b(\b¢\u0006\n\n\u0002\u0010*\u001a\u0004\b(\u0010)R'\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b!\u0012\b\b\"\u0012\u0004\b\b(\n¢\u0006\b\n\u0000\u001a\u0004\b+\u0010 R+\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f8\u0006X\u0087\u0004\u0092\u0002\f\b!\u0012\b\b\"\u0012\u0004\b\b(\u000b¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R'\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b!\u0012\b\b\"\u0012\u0004\b\b(\r¢\u0006\b\n\u0000\u001a\u0004\b.\u0010 R'\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b!\u0012\b\b\"\u0012\u0004\b\b(\u000e¢\u0006\b\n\u0000\u001a\u0004\b/\u0010 R'\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b!\u0012\b\b\"\u0012\u0004\b\b(\u000f¢\u0006\b\n\u0000\u001a\u0004\b0\u0010 R'\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b!\u0012\b\b\"\u0012\u0004\b\b(\u0010¢\u0006\b\n\u0000\u001a\u0004\b1\u0010 R'\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b!\u0012\b\b\"\u0012\u0004\b\b(\u0011¢\u0006\b\n\u0000\u001a\u0004\b2\u0010 R'\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004\u0092\u0002\f\b!\u0012\b\b\"\u0012\u0004\b\b(\u0012¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R+\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\f8\u0006X\u0087\u0004\u0092\u0002\f\b!\u0012\b\b\"\u0012\u0004\b\b(\u0014¢\u0006\b\n\u0000\u001a\u0004\b5\u0010-R'\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b!\u0012\b\b\"\u0012\u0004\b\b(\u0016¢\u0006\b\n\u0000\u001a\u0004\b6\u0010 R)\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004\u0092\u0002\f\b!\u0012\b\b\"\u0012\u0004\b\b(\u0017¢\u0006\n\n\u0002\u00109\u001a\u0004\b7\u00108R)\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004\u0092\u0002\f\b!\u0012\b\b\"\u0012\u0004\b\b(\u0019¢\u0006\n\n\u0002\u00109\u001a\u0004\b:\u00108R'\u0010\u001a\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004\u0092\u0002\f\b!\u0012\b\b\"\u0012\u0004\b\b(\u001a¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R)\u0010\u001c\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004\u0092\u0002\f\b!\u0012\b\b\"\u0012\u0004\b\b(\u001c¢\u0006\n\n\u0002\u00109\u001a\u0004\b=\u00108Ê\u0001\u0002\bX¨\u0006W"}, d2 = {"Lcom/sporty/android/core/model/bookingcode/EventDto;", "", AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, "", "gameId", "productStatus", "estimateStartTime", "", AnalyticsParam.EVENT_STATUS, "", "setScore", "gameScore", "", "period", "matchStatus", "playedSeconds", "homeTeamName", "awayTeamName", "sport", "Lcom/sporty/android/core/model/bookingcode/SportDto;", "markets", "Lcom/sporty/android/core/model/bookingcode/MarketDto;", "bookingStatus", "bgEvent", "", "matchTrackerNotAllowed", "eventSource", "Lcom/sporty/android/core/model/bookingcode/EventSourceDto;", "banned", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sporty/android/core/model/bookingcode/SportDto;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/sporty/android/core/model/bookingcode/EventSourceDto;Ljava/lang/Boolean;)V", "getEventId", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getGameId", "getProductStatus", "getEstimateStartTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getStatus", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSetScore", "getGameScore", "()Ljava/util/List;", "getPeriod", "getMatchStatus", "getPlayedSeconds", "getHomeTeamName", "getAwayTeamName", "getSport", "()Lcom/sporty/android/core/model/bookingcode/SportDto;", "getMarkets", "getBookingStatus", "getBgEvent", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMatchTrackerNotAllowed", "getEventSource", "()Lcom/sporty/android/core/model/bookingcode/EventSourceDto;", "getBanned", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sporty/android/core/model/bookingcode/SportDto;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/sporty/android/core/model/bookingcode/EventSourceDto;Ljava/lang/Boolean;)Lcom/sporty/android/core/model/bookingcode/EventDto;", "equals", "other", "hashCode", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class EventDto {

    @SerializedName("awayTeamName")
    private final String awayTeamName;

    @SerializedName("banned")
    private final Boolean banned;

    @SerializedName("bgEvent")
    private final Boolean bgEvent;

    @SerializedName("bookingStatus")
    private final String bookingStatus;

    @SerializedName("estimateStartTime")
    private final Long estimateStartTime;

    @SerializedName(AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID)
    private final String eventId;

    @SerializedName("eventSource")
    private final EventSourceDto eventSource;

    @SerializedName("gameId")
    private final String gameId;

    @SerializedName("gameScore")
    private final List<String> gameScore;

    @SerializedName("homeTeamName")
    private final String homeTeamName;

    @SerializedName("markets")
    private final List<MarketDto> markets;

    @SerializedName("matchStatus")
    private final String matchStatus;

    @SerializedName("matchTrackerNotAllowed")
    private final Boolean matchTrackerNotAllowed;

    @SerializedName("period")
    private final String period;

    @SerializedName("playedSeconds")
    private final String playedSeconds;

    @SerializedName("productStatus")
    private final String productStatus;

    @SerializedName("setScore")
    private final String setScore;

    @SerializedName("sport")
    private final SportDto sport;

    @SerializedName(AnalyticsParam.EVENT_STATUS)
    private final Integer status;

    public EventDto(String str, String str2, String str3, Long l, Integer num, String str4, List list, String str5, String str6, String str7, String str8, String str9, SportDto sportDto, List list2, String str10, Boolean bool, Boolean bool2, EventSourceDto eventSourceDto, Boolean bool3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? m2g.a : list, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : str6, (i & 512) != 0 ? null : str7, (i & 1024) != 0 ? null : str8, (i & 2048) != 0 ? null : str9, (i & 4096) != 0 ? null : sportDto, (i & 8192) != 0 ? m2g.a : list2, (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : str10, (i & 32768) != 0 ? null : bool, (i & 65536) != 0 ? null : bool2, (i & 131072) != 0 ? null : eventSourceDto, (i & 262144) != 0 ? null : bool3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EventDto copy$default(EventDto eventDto, String str, String str2, String str3, Long l, Integer num, String str4, List list, String str5, String str6, String str7, String str8, String str9, SportDto sportDto, List list2, String str10, Boolean bool, Boolean bool2, EventSourceDto eventSourceDto, Boolean bool3, int i, Object obj) {
        Boolean bool4;
        EventSourceDto eventSourceDto2;
        String str11 = (i & 1) != 0 ? eventDto.eventId : str;
        String str12 = (i & 2) != 0 ? eventDto.gameId : str2;
        String str13 = (i & 4) != 0 ? eventDto.productStatus : str3;
        Long l2 = (i & 8) != 0 ? eventDto.estimateStartTime : l;
        Integer num2 = (i & 16) != 0 ? eventDto.status : num;
        String str14 = (i & 32) != 0 ? eventDto.setScore : str4;
        List list3 = (i & 64) != 0 ? eventDto.gameScore : list;
        String str15 = (i & 128) != 0 ? eventDto.period : str5;
        String str16 = (i & 256) != 0 ? eventDto.matchStatus : str6;
        String str17 = (i & 512) != 0 ? eventDto.playedSeconds : str7;
        String str18 = (i & 1024) != 0 ? eventDto.homeTeamName : str8;
        String str19 = (i & 2048) != 0 ? eventDto.awayTeamName : str9;
        SportDto sportDto2 = (i & 4096) != 0 ? eventDto.sport : sportDto;
        List list4 = (i & 8192) != 0 ? eventDto.markets : list2;
        String str20 = str11;
        String str21 = (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? eventDto.bookingStatus : str10;
        Boolean bool5 = (i & 32768) != 0 ? eventDto.bgEvent : bool;
        Boolean bool6 = (i & 65536) != 0 ? eventDto.matchTrackerNotAllowed : bool2;
        EventSourceDto eventSourceDto3 = (i & 131072) != 0 ? eventDto.eventSource : eventSourceDto;
        if ((i & 262144) != 0) {
            eventSourceDto2 = eventSourceDto3;
            bool4 = eventDto.banned;
        } else {
            bool4 = bool3;
            eventSourceDto2 = eventSourceDto3;
        }
        return eventDto.copy(str20, str12, str13, l2, num2, str14, list3, str15, str16, str17, str18, str19, sportDto2, list4, str21, bool5, bool6, eventSourceDto2, bool4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEventId() {
        return this.eventId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getPlayedSeconds() {
        return this.playedSeconds;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getHomeTeamName() {
        return this.homeTeamName;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getAwayTeamName() {
        return this.awayTeamName;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final SportDto getSport() {
        return this.sport;
    }

    public final List<MarketDto> component14() {
        return this.markets;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getBookingStatus() {
        return this.bookingStatus;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Boolean getBgEvent() {
        return this.bgEvent;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final Boolean getMatchTrackerNotAllowed() {
        return this.matchTrackerNotAllowed;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final EventSourceDto getEventSource() {
        return this.eventSource;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final Boolean getBanned() {
        return this.banned;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getGameId() {
        return this.gameId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getProductStatus() {
        return this.productStatus;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getEstimateStartTime() {
        return this.estimateStartTime;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSetScore() {
        return this.setScore;
    }

    public final List<String> component7() {
        return this.gameScore;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getPeriod() {
        return this.period;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getMatchStatus() {
        return this.matchStatus;
    }

    public final EventDto copy(String eventId, String gameId, String productStatus, Long estimateStartTime, Integer status, String setScore, List<String> gameScore, String period, String matchStatus, String playedSeconds, String homeTeamName, String awayTeamName, SportDto sport, List<MarketDto> markets, String bookingStatus, Boolean bgEvent, Boolean matchTrackerNotAllowed, EventSourceDto eventSource, Boolean banned) {
        gameScore.getClass();
        markets.getClass();
        return new EventDto(eventId, gameId, productStatus, estimateStartTime, status, setScore, gameScore, period, matchStatus, playedSeconds, homeTeamName, awayTeamName, sport, markets, bookingStatus, bgEvent, matchTrackerNotAllowed, eventSource, banned);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventDto)) {
            return false;
        }
        EventDto eventDto = (EventDto) other;
        return Intrinsics.g(this.eventId, eventDto.eventId) && Intrinsics.g(this.gameId, eventDto.gameId) && Intrinsics.g(this.productStatus, eventDto.productStatus) && Intrinsics.g(this.estimateStartTime, eventDto.estimateStartTime) && Intrinsics.g(this.status, eventDto.status) && Intrinsics.g(this.setScore, eventDto.setScore) && Intrinsics.g(this.gameScore, eventDto.gameScore) && Intrinsics.g(this.period, eventDto.period) && Intrinsics.g(this.matchStatus, eventDto.matchStatus) && Intrinsics.g(this.playedSeconds, eventDto.playedSeconds) && Intrinsics.g(this.homeTeamName, eventDto.homeTeamName) && Intrinsics.g(this.awayTeamName, eventDto.awayTeamName) && Intrinsics.g(this.sport, eventDto.sport) && Intrinsics.g(this.markets, eventDto.markets) && Intrinsics.g(this.bookingStatus, eventDto.bookingStatus) && Intrinsics.g(this.bgEvent, eventDto.bgEvent) && Intrinsics.g(this.matchTrackerNotAllowed, eventDto.matchTrackerNotAllowed) && Intrinsics.g(this.eventSource, eventDto.eventSource) && Intrinsics.g(this.banned, eventDto.banned);
    }

    public final String getAwayTeamName() {
        return this.awayTeamName;
    }

    public final Boolean getBanned() {
        return this.banned;
    }

    public final Boolean getBgEvent() {
        return this.bgEvent;
    }

    public final String getBookingStatus() {
        return this.bookingStatus;
    }

    public final Long getEstimateStartTime() {
        return this.estimateStartTime;
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final EventSourceDto getEventSource() {
        return this.eventSource;
    }

    public final String getGameId() {
        return this.gameId;
    }

    public final List<String> getGameScore() {
        return this.gameScore;
    }

    public final String getHomeTeamName() {
        return this.homeTeamName;
    }

    public final List<MarketDto> getMarkets() {
        return this.markets;
    }

    public final String getMatchStatus() {
        return this.matchStatus;
    }

    public final Boolean getMatchTrackerNotAllowed() {
        return this.matchTrackerNotAllowed;
    }

    public final String getPeriod() {
        return this.period;
    }

    public final String getPlayedSeconds() {
        return this.playedSeconds;
    }

    public final String getProductStatus() {
        return this.productStatus;
    }

    public final String getSetScore() {
        return this.setScore;
    }

    public final SportDto getSport() {
        return this.sport;
    }

    public final Integer getStatus() {
        return this.status;
    }

    public int hashCode() {
        String str = this.eventId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.gameId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.productStatus;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.estimateStartTime;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.status;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.setScore;
        int iA = ai50.a((iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.gameScore);
        String str5 = this.period;
        int iHashCode6 = (iA + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.matchStatus;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.playedSeconds;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.homeTeamName;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.awayTeamName;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        SportDto sportDto = this.sport;
        int iA2 = ai50.a((iHashCode10 + (sportDto == null ? 0 : sportDto.hashCode())) * 31, 31, this.markets);
        String str10 = this.bookingStatus;
        int iHashCode11 = (iA2 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Boolean bool = this.bgEvent;
        int iHashCode12 = (iHashCode11 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.matchTrackerNotAllowed;
        int iHashCode13 = (iHashCode12 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        EventSourceDto eventSourceDto = this.eventSource;
        int iHashCode14 = (iHashCode13 + (eventSourceDto == null ? 0 : eventSourceDto.hashCode())) * 31;
        Boolean bool3 = this.banned;
        return iHashCode14 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public String toString() {
        String str = this.eventId;
        String str2 = this.gameId;
        String str3 = this.productStatus;
        Long l = this.estimateStartTime;
        Integer num = this.status;
        String str4 = this.setScore;
        List<String> list = this.gameScore;
        String str5 = this.period;
        String str6 = this.matchStatus;
        String str7 = this.playedSeconds;
        String str8 = this.homeTeamName;
        String str9 = this.awayTeamName;
        SportDto sportDto = this.sport;
        List<MarketDto> list2 = this.markets;
        String str10 = this.bookingStatus;
        Boolean bool = this.bgEvent;
        Boolean bool2 = this.matchTrackerNotAllowed;
        EventSourceDto eventSourceDto = this.eventSource;
        Boolean bool3 = this.banned;
        StringBuilder sbA = ux5.a("EventDto(eventId=", str, ", gameId=", str2, ", productStatus=");
        sbA.append(str3);
        sbA.append(", estimateStartTime=");
        sbA.append(l);
        sbA.append(", status=");
        w03.a(num, ", setScore=", str4, ", gameScore=", sbA);
        gfs.a(", period=", str5, ", matchStatus=", sbA, list);
        hxa.c(sbA, str6, ", playedSeconds=", str7, ", homeTeamName=");
        hxa.c(sbA, str8, ", awayTeamName=", str9, ", sport=");
        sbA.append(sportDto);
        sbA.append(", markets=");
        sbA.append(list2);
        sbA.append(", bookingStatus=");
        x03.a(sbA, str10, ", bgEvent=", bool, ", matchTrackerNotAllowed=");
        sbA.append(bool2);
        sbA.append(", eventSource=");
        sbA.append(eventSourceDto);
        sbA.append(", banned=");
        return rg2.a(sbA, bool3, ")");
    }

    public EventDto(String str, String str2, String str3, Long l, Integer num, String str4, List<String> list, String str5, String str6, String str7, String str8, String str9, SportDto sportDto, List<MarketDto> list2, String str10, Boolean bool, Boolean bool2, EventSourceDto eventSourceDto, Boolean bool3) {
        list.getClass();
        list2.getClass();
        this.eventId = str;
        this.gameId = str2;
        this.productStatus = str3;
        this.estimateStartTime = l;
        this.status = num;
        this.setScore = str4;
        this.gameScore = list;
        this.period = str5;
        this.matchStatus = str6;
        this.playedSeconds = str7;
        this.homeTeamName = str8;
        this.awayTeamName = str9;
        this.sport = sportDto;
        this.markets = list2;
        this.bookingStatus = str10;
        this.bgEvent = bool;
        this.matchTrackerNotAllowed = bool2;
        this.eventSource = eventSourceDto;
        this.banned = bool3;
    }

    public EventDto() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524287, null);
    }
}
