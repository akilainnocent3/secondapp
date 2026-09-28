package com.sporty.android.chat.data;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.hxa;
import defpackage.oie;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b5\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B÷\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00107\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010 J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010D\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010/J\u0010\u0010E\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010 J\u0010\u0010F\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010 J\u0010\u0010G\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010 Jþ\u0001\u0010H\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010IJ\u0014\u0010J\u001a\u00020K2\b\u0010L\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010M\u001a\u00020\u0007HÖ\u0081\u0004J\n\u0010N\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001cR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001cR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001cR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001cR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001cR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001cR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001cR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001cR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001cR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001cR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001cR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001cR\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\n\n\u0002\u00100\u001a\u0004\b.\u0010/R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010!\u001a\u0004\b1\u0010 R\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010!\u001a\u0004\b2\u0010 R\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010!\u001a\u0004\b3\u0010 Ê\u0001\u0002\bP¨\u0006O"}, d2 = {"Lcom/sporty/android/chat/data/CodeChatSelectionDto;", "", AnalyticsParam.EVENT_PARAM_ID, "", AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, "sportId", "product", "", "marketId", "marketDesc", "outcomeId", "outcomeDesc", "odds", "home", "away", "categoryId", "tournamentId", "tournamentIcon", "homeTeamIcon", "awayTeamIcon", "startTime", "", AnalyticsParam.EVENT_STATUS, "eventStatus", "settleType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getId", "()Ljava/lang/String;", "getEventId", "getSportId", "getProduct", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMarketId", "getMarketDesc", "getOutcomeId", "getOutcomeDesc", "getOdds", "getHome", "getAway", "getCategoryId", "getTournamentId", "getTournamentIcon", "getHomeTeamIcon", "getAwayTeamIcon", "getStartTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getStatus", "getEventStatus", "getSettleType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/sporty/android/chat/data/CodeChatSelectionDto;", "equals", "", "other", "hashCode", "toString", "sportychat", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class CodeChatSelectionDto {
    private final String away;
    private final String awayTeamIcon;
    private final String categoryId;
    private final String eventId;
    private final Integer eventStatus;
    private final String home;
    private final String homeTeamIcon;
    private final String id;
    private final String marketDesc;
    private final String marketId;
    private final String odds;
    private final String outcomeDesc;
    private final String outcomeId;
    private final Integer product;
    private final Integer settleType;
    private final String sportId;
    private final Long startTime;
    private final Integer status;
    private final String tournamentIcon;
    private final String tournamentId;

    public /* synthetic */ CodeChatSelectionDto(String str, String str2, String str3, Integer num, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, Long l, Integer num2, Integer num3, Integer num4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : str9, (i & 1024) != 0 ? null : str10, (i & 2048) != 0 ? null : str11, (i & 4096) != 0 ? null : str12, (i & 8192) != 0 ? null : str13, (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : str14, (i & 32768) != 0 ? null : str15, (i & 65536) != 0 ? null : l, (i & 131072) != 0 ? null : num2, (i & 262144) != 0 ? null : num3, (i & 524288) != 0 ? null : num4);
    }

    public static /* synthetic */ CodeChatSelectionDto copy$default(CodeChatSelectionDto codeChatSelectionDto, String str, String str2, String str3, Integer num, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, Long l, Integer num2, Integer num3, Integer num4, int i, Object obj) {
        Integer num5;
        Integer num6;
        String str16 = (i & 1) != 0 ? codeChatSelectionDto.id : str;
        String str17 = (i & 2) != 0 ? codeChatSelectionDto.eventId : str2;
        String str18 = (i & 4) != 0 ? codeChatSelectionDto.sportId : str3;
        Integer num7 = (i & 8) != 0 ? codeChatSelectionDto.product : num;
        String str19 = (i & 16) != 0 ? codeChatSelectionDto.marketId : str4;
        String str20 = (i & 32) != 0 ? codeChatSelectionDto.marketDesc : str5;
        String str21 = (i & 64) != 0 ? codeChatSelectionDto.outcomeId : str6;
        String str22 = (i & 128) != 0 ? codeChatSelectionDto.outcomeDesc : str7;
        String str23 = (i & 256) != 0 ? codeChatSelectionDto.odds : str8;
        String str24 = (i & 512) != 0 ? codeChatSelectionDto.home : str9;
        String str25 = (i & 1024) != 0 ? codeChatSelectionDto.away : str10;
        String str26 = (i & 2048) != 0 ? codeChatSelectionDto.categoryId : str11;
        String str27 = (i & 4096) != 0 ? codeChatSelectionDto.tournamentId : str12;
        String str28 = (i & 8192) != 0 ? codeChatSelectionDto.tournamentIcon : str13;
        String str29 = str16;
        String str30 = (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? codeChatSelectionDto.homeTeamIcon : str14;
        String str31 = (i & 32768) != 0 ? codeChatSelectionDto.awayTeamIcon : str15;
        Long l2 = (i & 65536) != 0 ? codeChatSelectionDto.startTime : l;
        Integer num8 = (i & 131072) != 0 ? codeChatSelectionDto.status : num2;
        Integer num9 = (i & 262144) != 0 ? codeChatSelectionDto.eventStatus : num3;
        if ((i & 524288) != 0) {
            num6 = num9;
            num5 = codeChatSelectionDto.settleType;
        } else {
            num5 = num4;
            num6 = num9;
        }
        return codeChatSelectionDto.copy(str29, str17, str18, num7, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str30, str31, l2, num8, num6, num5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getHome() {
        return this.home;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getAway() {
        return this.away;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getCategoryId() {
        return this.categoryId;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getTournamentId() {
        return this.tournamentId;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getTournamentIcon() {
        return this.tournamentIcon;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getHomeTeamIcon() {
        return this.homeTeamIcon;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getAwayTeamIcon() {
        return this.awayTeamIcon;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final Long getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final Integer getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final Integer getEventStatus() {
        return this.eventStatus;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEventId() {
        return this.eventId;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final Integer getSettleType() {
        return this.settleType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSportId() {
        return this.sportId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getProduct() {
        return this.product;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getMarketId() {
        return this.marketId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getMarketDesc() {
        return this.marketDesc;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getOutcomeId() {
        return this.outcomeId;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getOutcomeDesc() {
        return this.outcomeDesc;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getOdds() {
        return this.odds;
    }

    public final CodeChatSelectionDto copy(String id, String eventId, String sportId, Integer product, String marketId, String marketDesc, String outcomeId, String outcomeDesc, String odds, String home, String away, String categoryId, String tournamentId, String tournamentIcon, String homeTeamIcon, String awayTeamIcon, Long startTime, Integer status, Integer eventStatus, Integer settleType) {
        return new CodeChatSelectionDto(id, eventId, sportId, product, marketId, marketDesc, outcomeId, outcomeDesc, odds, home, away, categoryId, tournamentId, tournamentIcon, homeTeamIcon, awayTeamIcon, startTime, status, eventStatus, settleType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CodeChatSelectionDto)) {
            return false;
        }
        CodeChatSelectionDto codeChatSelectionDto = (CodeChatSelectionDto) other;
        return Intrinsics.g(this.id, codeChatSelectionDto.id) && Intrinsics.g(this.eventId, codeChatSelectionDto.eventId) && Intrinsics.g(this.sportId, codeChatSelectionDto.sportId) && Intrinsics.g(this.product, codeChatSelectionDto.product) && Intrinsics.g(this.marketId, codeChatSelectionDto.marketId) && Intrinsics.g(this.marketDesc, codeChatSelectionDto.marketDesc) && Intrinsics.g(this.outcomeId, codeChatSelectionDto.outcomeId) && Intrinsics.g(this.outcomeDesc, codeChatSelectionDto.outcomeDesc) && Intrinsics.g(this.odds, codeChatSelectionDto.odds) && Intrinsics.g(this.home, codeChatSelectionDto.home) && Intrinsics.g(this.away, codeChatSelectionDto.away) && Intrinsics.g(this.categoryId, codeChatSelectionDto.categoryId) && Intrinsics.g(this.tournamentId, codeChatSelectionDto.tournamentId) && Intrinsics.g(this.tournamentIcon, codeChatSelectionDto.tournamentIcon) && Intrinsics.g(this.homeTeamIcon, codeChatSelectionDto.homeTeamIcon) && Intrinsics.g(this.awayTeamIcon, codeChatSelectionDto.awayTeamIcon) && Intrinsics.g(this.startTime, codeChatSelectionDto.startTime) && Intrinsics.g(this.status, codeChatSelectionDto.status) && Intrinsics.g(this.eventStatus, codeChatSelectionDto.eventStatus) && Intrinsics.g(this.settleType, codeChatSelectionDto.settleType);
    }

    public final String getAway() {
        return this.away;
    }

    public final String getAwayTeamIcon() {
        return this.awayTeamIcon;
    }

    public final String getCategoryId() {
        return this.categoryId;
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final Integer getEventStatus() {
        return this.eventStatus;
    }

    public final String getHome() {
        return this.home;
    }

    public final String getHomeTeamIcon() {
        return this.homeTeamIcon;
    }

    public final String getId() {
        return this.id;
    }

    public final String getMarketDesc() {
        return this.marketDesc;
    }

    public final String getMarketId() {
        return this.marketId;
    }

    public final String getOdds() {
        return this.odds;
    }

    public final String getOutcomeDesc() {
        return this.outcomeDesc;
    }

    public final String getOutcomeId() {
        return this.outcomeId;
    }

    public final Integer getProduct() {
        return this.product;
    }

    public final Integer getSettleType() {
        return this.settleType;
    }

    public final String getSportId() {
        return this.sportId;
    }

    public final Long getStartTime() {
        return this.startTime;
    }

    public final Integer getStatus() {
        return this.status;
    }

    public final String getTournamentIcon() {
        return this.tournamentIcon;
    }

    public final String getTournamentId() {
        return this.tournamentId;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.eventId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sportId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.product;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.marketId;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.marketDesc;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.outcomeId;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.outcomeDesc;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.odds;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.home;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.away;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.categoryId;
        int iHashCode12 = (iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.tournamentId;
        int iHashCode13 = (iHashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.tournamentIcon;
        int iHashCode14 = (iHashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.homeTeamIcon;
        int iHashCode15 = (iHashCode14 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.awayTeamIcon;
        int iHashCode16 = (iHashCode15 + (str15 == null ? 0 : str15.hashCode())) * 31;
        Long l = this.startTime;
        int iHashCode17 = (iHashCode16 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num2 = this.status;
        int iHashCode18 = (iHashCode17 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.eventStatus;
        int iHashCode19 = (iHashCode18 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.settleType;
        return iHashCode19 + (num4 != null ? num4.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.eventId;
        String str3 = this.sportId;
        Integer num = this.product;
        String str4 = this.marketId;
        String str5 = this.marketDesc;
        String str6 = this.outcomeId;
        String str7 = this.outcomeDesc;
        String str8 = this.odds;
        String str9 = this.home;
        String str10 = this.away;
        String str11 = this.categoryId;
        String str12 = this.tournamentId;
        String str13 = this.tournamentIcon;
        String str14 = this.homeTeamIcon;
        String str15 = this.awayTeamIcon;
        Long l = this.startTime;
        Integer num2 = this.status;
        Integer num3 = this.eventStatus;
        Integer num4 = this.settleType;
        StringBuilder sbA = ux5.a("CodeChatSelectionDto(id=", str, ", eventId=", str2, ", sportId=");
        oie.a(num, str3, ", product=", ", marketId=", sbA);
        hxa.c(sbA, str4, ", marketDesc=", str5, ", outcomeId=");
        hxa.c(sbA, str6, ", outcomeDesc=", str7, ", odds=");
        hxa.c(sbA, str8, ", home=", str9, ", away=");
        hxa.c(sbA, str10, ", categoryId=", str11, ", tournamentId=");
        hxa.c(sbA, str12, ", tournamentIcon=", str13, ", homeTeamIcon=");
        hxa.c(sbA, str14, ", awayTeamIcon=", str15, ", startTime=");
        sbA.append(l);
        sbA.append(", status=");
        sbA.append(num2);
        sbA.append(", eventStatus=");
        sbA.append(num3);
        sbA.append(", settleType=");
        sbA.append(num4);
        sbA.append(")");
        return sbA.toString();
    }

    public CodeChatSelectionDto(String str, String str2, String str3, Integer num, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, Long l, Integer num2, Integer num3, Integer num4) {
        this.id = str;
        this.eventId = str2;
        this.sportId = str3;
        this.product = num;
        this.marketId = str4;
        this.marketDesc = str5;
        this.outcomeId = str6;
        this.outcomeDesc = str7;
        this.odds = str8;
        this.home = str9;
        this.away = str10;
        this.categoryId = str11;
        this.tournamentId = str12;
        this.tournamentIcon = str13;
        this.homeTeamIcon = str14;
        this.awayTeamIcon = str15;
        this.startTime = l;
        this.status = num2;
        this.eventStatus = num3;
        this.settleType = num4;
    }

    public CodeChatSelectionDto() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048575, null);
    }
}
