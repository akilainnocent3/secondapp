package com.sportybet.android.instantwin.newtork.model.response.scheduledfootball;

import com.appsflyer.internal.l;
import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.f87;
import defpackage.g41;
import defpackage.gpp;
import defpackage.hxa;
import defpackage.qjk;
import defpackage.ux5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001BÃ\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0014\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0014\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010:\u001a\u00020\bHÆ\u0003J\t\u0010;\u001a\u00020\bHÆ\u0003J\t\u0010<\u001a\u00020\bHÆ\u0003J\t\u0010=\u001a\u00020\bHÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010?\u001a\u00020\bHÆ\u0003J\t\u0010@\u001a\u00020\u000fHÆ\u0003J\t\u0010A\u001a\u00020\u000fHÆ\u0003J\t\u0010B\u001a\u00020\u000fHÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010D\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014HÆ\u0003J\u0011\u0010E\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0014HÆ\u0003J\u0011\u0010F\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0014HÆ\u0003J\u0011\u0010G\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0014HÆ\u0003Jé\u0001\u0010H\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00142\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00142\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00142\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0014HÆ\u0001J\u0014\u0010I\u001a\u00020J2\b\u0010K\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010L\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010M\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b \u0012\b\b!\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR'\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b \u0012\b\b!\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001fR'\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b \u0012\b\b!\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR'\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b \u0012\b\b!\u0012\u0004\b\b(\u0006¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001fR%\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u0092\u0002\f\b \u0012\b\b!\u0012\u0004\b\b(\u0007¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R%\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004\u0092\u0002\f\b \u0012\b\b!\u0012\u0004\b\b(\t¢\u0006\b\n\u0000\u001a\u0004\b'\u0010&R%\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004\u0092\u0002\f\b \u0012\b\b!\u0012\u0004\b\b(\n¢\u0006\b\n\u0000\u001a\u0004\b(\u0010&R%\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004\u0092\u0002\f\b \u0012\b\b!\u0012\u0004\b\b(\u000b¢\u0006\b\n\u0000\u001a\u0004\b)\u0010&R'\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b \u0012\b\b!\u0012\u0004\b\b(\f¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001fR%\u0010\r\u001a\u00020\b8\u0006X\u0087\u0004\u0092\u0002\f\b \u0012\b\b!\u0012\u0004\b\b(\r¢\u0006\b\n\u0000\u001a\u0004\b+\u0010&R%\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004\u0092\u0002\f\b \u0012\b\b!\u0012\u0004\b\b(\u000e¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R%\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004\u0092\u0002\f\b \u0012\b\b!\u0012\u0004\b\b(\u0010¢\u0006\b\n\u0000\u001a\u0004\b.\u0010-R%\u0010\u0011\u001a\u00020\u000f8\u0006X\u0087\u0004\u0092\u0002\f\b \u0012\b\b!\u0012\u0004\b\b(\u0011¢\u0006\b\n\u0000\u001a\u0004\b/\u0010-R'\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b \u0012\b\b!\u0012\u0004\b\b(\u0012¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001fR-\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00148\u0006X\u0087\u0004\u0092\u0002\f\b \u0012\b\b!\u0012\u0004\b\b(\u0013¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R-\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00148\u0006X\u0087\u0004\u0092\u0002\f\b \u0012\b\b!\u0012\u0004\b\b(\u0016¢\u0006\b\n\u0000\u001a\u0004\b3\u00102R-\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00148\u0006X\u0087\u0004\u0092\u0002\f\b \u0012\b\b!\u0012\u0004\b\b(\u0018¢\u0006\b\n\u0000\u001a\u0004\b4\u00102R-\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00148\u0006X\u0087\u0004\u0092\u0002\f\b \u0012\b\b!\u0012\u0004\b\b(\u001a¢\u0006\b\n\u0000\u001a\u0004\b5\u00102Ê\u0001\f\bO\u0012\b\bP\u0012\u0004\b\u0003\u0010\u0002¨\u0006N"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/scheduledfootball/NetworkScheduledFootballTicket;", "", "ticketId", "", "ticketNumber", "type", "sportId", "totalStake", "", "totalReturn", "wht", "createTime", "giftId", "giftAmount", "giftKind", "", AnalyticsParam.EVENT_STATUS, "flexibleFitSize", "totalOdds", "bets", "", "Lcom/sportybet/android/instantwin/newtork/model/response/scheduledfootball/NetworkScheduledFootballTicketBet;", "events", "Lcom/sportybet/android/instantwin/newtork/model/response/scheduledfootball/NetworkScheduledFootballTicketEvent;", "markets", "Lcom/sportybet/android/instantwin/newtork/model/response/scheduledfootball/NetworkScheduledFootballTicketMarket;", "outcomes", "Lcom/sportybet/android/instantwin/newtork/model/response/scheduledfootball/NetworkScheduledFootballTicketOutcome;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJJLjava/lang/String;JIIILjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getTicketId", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getTicketNumber", "getType", "getSportId", "getTotalStake", "()J", "getTotalReturn", "getWht", "getCreateTime", "getGiftId", "getGiftAmount", "getGiftKind", "()I", "getStatus", "getFlexibleFitSize", "getTotalOdds", "getBets", "()Ljava/util/List;", "getEvents", "getMarkets", "getOutcomes", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "copy", "equals", "", "other", "hashCode", "toString", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkScheduledFootballTicket {
    public static final int $stable = 0;

    @SerializedName("bets")
    private final List<NetworkScheduledFootballTicketBet> bets;

    @SerializedName("createTime")
    private final long createTime;

    @SerializedName("events")
    private final List<NetworkScheduledFootballTicketEvent> events;

    @SerializedName("flexibleFitSize")
    private final int flexibleFitSize;

    @SerializedName("giftAmount")
    private final long giftAmount;

    @SerializedName("giftId")
    private final String giftId;

    @SerializedName("giftKind")
    private final int giftKind;

    @SerializedName("markets")
    private final List<NetworkScheduledFootballTicketMarket> markets;

    @SerializedName("outcomes")
    private final List<NetworkScheduledFootballTicketOutcome> outcomes;

    @SerializedName("sportId")
    private final String sportId;

    @SerializedName(AnalyticsParam.EVENT_STATUS)
    private final int status;

    @SerializedName("ticketId")
    private final String ticketId;

    @SerializedName("ticketNumber")
    private final String ticketNumber;

    @SerializedName("totalOdds")
    private final String totalOdds;

    @SerializedName("totalReturn")
    private final long totalReturn;

    @SerializedName("totalStake")
    private final long totalStake;

    @SerializedName("type")
    private final String type;

    @SerializedName("wht")
    private final long wht;

    public NetworkScheduledFootballTicket(String str, String str2, String str3, String str4, long j, long j2, long j3, long j4, String str5, long j5, int i, int i2, int i3, String str6, List<NetworkScheduledFootballTicketBet> list, List<NetworkScheduledFootballTicketEvent> list2, List<NetworkScheduledFootballTicketMarket> list3, List<NetworkScheduledFootballTicketOutcome> list4) {
        this.ticketId = str;
        this.ticketNumber = str2;
        this.type = str3;
        this.sportId = str4;
        this.totalStake = j;
        this.totalReturn = j2;
        this.wht = j3;
        this.createTime = j4;
        this.giftId = str5;
        this.giftAmount = j5;
        this.giftKind = i;
        this.status = i2;
        this.flexibleFitSize = i3;
        this.totalOdds = str6;
        this.bets = list;
        this.events = list2;
        this.markets = list3;
        this.outcomes = list4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NetworkScheduledFootballTicket copy$default(NetworkScheduledFootballTicket networkScheduledFootballTicket, String str, String str2, String str3, String str4, long j, long j2, long j3, long j4, String str5, long j5, int i, int i2, int i3, String str6, List list, List list2, List list3, List list4, int i4, Object obj) {
        List list5;
        List list6;
        String str7 = (i4 & 1) != 0 ? networkScheduledFootballTicket.ticketId : str;
        String str8 = (i4 & 2) != 0 ? networkScheduledFootballTicket.ticketNumber : str2;
        String str9 = (i4 & 4) != 0 ? networkScheduledFootballTicket.type : str3;
        String str10 = (i4 & 8) != 0 ? networkScheduledFootballTicket.sportId : str4;
        long j6 = (i4 & 16) != 0 ? networkScheduledFootballTicket.totalStake : j;
        long j7 = (i4 & 32) != 0 ? networkScheduledFootballTicket.totalReturn : j2;
        long j8 = (i4 & 64) != 0 ? networkScheduledFootballTicket.wht : j3;
        long j9 = (i4 & 128) != 0 ? networkScheduledFootballTicket.createTime : j4;
        String str11 = (i4 & 256) != 0 ? networkScheduledFootballTicket.giftId : str5;
        String str12 = str7;
        String str13 = str8;
        long j10 = (i4 & 512) != 0 ? networkScheduledFootballTicket.giftAmount : j5;
        int i5 = (i4 & 1024) != 0 ? networkScheduledFootballTicket.giftKind : i;
        long j11 = j10;
        int i6 = (i4 & 2048) != 0 ? networkScheduledFootballTicket.status : i2;
        int i7 = (i4 & 4096) != 0 ? networkScheduledFootballTicket.flexibleFitSize : i3;
        int i8 = i6;
        String str14 = (i4 & 8192) != 0 ? networkScheduledFootballTicket.totalOdds : str6;
        List list7 = (i4 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? networkScheduledFootballTicket.bets : list;
        List list8 = (i4 & 32768) != 0 ? networkScheduledFootballTicket.events : list2;
        List list9 = (i4 & 65536) != 0 ? networkScheduledFootballTicket.markets : list3;
        if ((i4 & 131072) != 0) {
            list6 = list9;
            list5 = networkScheduledFootballTicket.outcomes;
        } else {
            list5 = list4;
            list6 = list9;
        }
        return networkScheduledFootballTicket.copy(str12, str13, str9, str10, j6, j7, j8, j9, str11, j11, i5, i8, i7, str14, list7, list8, list6, list5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTicketId() {
        return this.ticketId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final long getGiftAmount() {
        return this.giftAmount;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getGiftKind() {
        return this.giftKind;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getFlexibleFitSize() {
        return this.flexibleFitSize;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getTotalOdds() {
        return this.totalOdds;
    }

    public final List<NetworkScheduledFootballTicketBet> component15() {
        return this.bets;
    }

    public final List<NetworkScheduledFootballTicketEvent> component16() {
        return this.events;
    }

    public final List<NetworkScheduledFootballTicketMarket> component17() {
        return this.markets;
    }

    public final List<NetworkScheduledFootballTicketOutcome> component18() {
        return this.outcomes;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTicketNumber() {
        return this.ticketNumber;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSportId() {
        return this.sportId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getTotalStake() {
        return this.totalStake;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getTotalReturn() {
        return this.totalReturn;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getWht() {
        return this.wht;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getCreateTime() {
        return this.createTime;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getGiftId() {
        return this.giftId;
    }

    public final NetworkScheduledFootballTicket copy(String ticketId, String ticketNumber, String type, String sportId, long totalStake, long totalReturn, long wht, long createTime, String giftId, long giftAmount, int giftKind, int status, int flexibleFitSize, String totalOdds, List<NetworkScheduledFootballTicketBet> bets, List<NetworkScheduledFootballTicketEvent> events, List<NetworkScheduledFootballTicketMarket> markets, List<NetworkScheduledFootballTicketOutcome> outcomes) {
        return new NetworkScheduledFootballTicket(ticketId, ticketNumber, type, sportId, totalStake, totalReturn, wht, createTime, giftId, giftAmount, giftKind, status, flexibleFitSize, totalOdds, bets, events, markets, outcomes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkScheduledFootballTicket)) {
            return false;
        }
        NetworkScheduledFootballTicket networkScheduledFootballTicket = (NetworkScheduledFootballTicket) other;
        return Intrinsics.g(this.ticketId, networkScheduledFootballTicket.ticketId) && Intrinsics.g(this.ticketNumber, networkScheduledFootballTicket.ticketNumber) && Intrinsics.g(this.type, networkScheduledFootballTicket.type) && Intrinsics.g(this.sportId, networkScheduledFootballTicket.sportId) && this.totalStake == networkScheduledFootballTicket.totalStake && this.totalReturn == networkScheduledFootballTicket.totalReturn && this.wht == networkScheduledFootballTicket.wht && this.createTime == networkScheduledFootballTicket.createTime && Intrinsics.g(this.giftId, networkScheduledFootballTicket.giftId) && this.giftAmount == networkScheduledFootballTicket.giftAmount && this.giftKind == networkScheduledFootballTicket.giftKind && this.status == networkScheduledFootballTicket.status && this.flexibleFitSize == networkScheduledFootballTicket.flexibleFitSize && Intrinsics.g(this.totalOdds, networkScheduledFootballTicket.totalOdds) && Intrinsics.g(this.bets, networkScheduledFootballTicket.bets) && Intrinsics.g(this.events, networkScheduledFootballTicket.events) && Intrinsics.g(this.markets, networkScheduledFootballTicket.markets) && Intrinsics.g(this.outcomes, networkScheduledFootballTicket.outcomes);
    }

    public final List<NetworkScheduledFootballTicketBet> getBets() {
        return this.bets;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final List<NetworkScheduledFootballTicketEvent> getEvents() {
        return this.events;
    }

    public final int getFlexibleFitSize() {
        return this.flexibleFitSize;
    }

    public final long getGiftAmount() {
        return this.giftAmount;
    }

    public final String getGiftId() {
        return this.giftId;
    }

    public final int getGiftKind() {
        return this.giftKind;
    }

    public final List<NetworkScheduledFootballTicketMarket> getMarkets() {
        return this.markets;
    }

    public final List<NetworkScheduledFootballTicketOutcome> getOutcomes() {
        return this.outcomes;
    }

    public final String getSportId() {
        return this.sportId;
    }

    public final int getStatus() {
        return this.status;
    }

    public final String getTicketId() {
        return this.ticketId;
    }

    public final String getTicketNumber() {
        return this.ticketNumber;
    }

    public final String getTotalOdds() {
        return this.totalOdds;
    }

    public final long getTotalReturn() {
        return this.totalReturn;
    }

    public final long getTotalStake() {
        return this.totalStake;
    }

    public final String getType() {
        return this.type;
    }

    public final long getWht() {
        return this.wht;
    }

    public int hashCode() {
        String str = this.ticketId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.ticketNumber;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.type;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.sportId;
        int iA = f87.a(f87.a(f87.a(f87.a((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31, this.totalStake, 31), this.totalReturn, 31), this.wht, 31), this.createTime, 31);
        String str5 = this.giftId;
        int iA2 = gpp.a(this.flexibleFitSize, gpp.a(this.status, gpp.a(this.giftKind, f87.a((iA + (str5 == null ? 0 : str5.hashCode())) * 31, this.giftAmount, 31), 31), 31), 31);
        String str6 = this.totalOdds;
        int iHashCode4 = (iA2 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List<NetworkScheduledFootballTicketBet> list = this.bets;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List<NetworkScheduledFootballTicketEvent> list2 = this.events;
        int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<NetworkScheduledFootballTicketMarket> list3 = this.markets;
        int iHashCode7 = (iHashCode6 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<NetworkScheduledFootballTicketOutcome> list4 = this.outcomes;
        return iHashCode7 + (list4 != null ? list4.hashCode() : 0);
    }

    public String toString() {
        String str = this.ticketId;
        String str2 = this.ticketNumber;
        String str3 = this.type;
        String str4 = this.sportId;
        long j = this.totalStake;
        long j2 = this.totalReturn;
        long j3 = this.wht;
        long j4 = this.createTime;
        String str5 = this.giftId;
        long j5 = this.giftAmount;
        int i = this.giftKind;
        int i2 = this.status;
        int i3 = this.flexibleFitSize;
        String str6 = this.totalOdds;
        List<NetworkScheduledFootballTicketBet> list = this.bets;
        List<NetworkScheduledFootballTicketEvent> list2 = this.events;
        List<NetworkScheduledFootballTicketMarket> list3 = this.markets;
        List<NetworkScheduledFootballTicketOutcome> list4 = this.outcomes;
        StringBuilder sbA = ux5.a("NetworkScheduledFootballTicket(ticketId=", str, ", ticketNumber=", str2, ", type=");
        hxa.c(sbA, str3, ", sportId=", str4, ", totalStake=");
        sbA.append(j);
        g41.a(j2, ", totalReturn=", ", wht=", sbA);
        sbA.append(j3);
        g41.a(j4, ", createTime=", ", giftId=", sbA);
        l.a(j5, str5, ", giftAmount=", sbA);
        sbA.append(", giftKind=");
        sbA.append(i);
        sbA.append(", status=");
        sbA.append(i2);
        sbA.append(", flexibleFitSize=");
        sbA.append(i3);
        sbA.append(", totalOdds=");
        sbA.append(str6);
        qjk.a(", bets=", ", events=", sbA, list, list2);
        qjk.a(", markets=", ", outcomes=", sbA, list3, list4);
        sbA.append(")");
        return sbA.toString();
    }
}
