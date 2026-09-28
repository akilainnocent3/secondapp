package com.sportybet.android.instantwin.newtork.model.response.racing;

import com.google.gson.annotations.SerializedName;
import defpackage.f87;
import defpackage.g41;
import defpackage.gpp;
import defpackage.hxa;
import defpackage.mtg0;
import defpackage.qjk;
import defpackage.to10;
import defpackage.u8;
import defpackage.ux5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001BÕ\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0010\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0012\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0012\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0012\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010>\u001a\u00020\bHÆ\u0003J\t\u0010?\u001a\u00020\bHÆ\u0003J\t\u0010@\u001a\u00020\bHÆ\u0003J\t\u0010A\u001a\u00020\bHÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010D\u001a\u00020\bHÆ\u0003J\t\u0010E\u001a\u00020\u0010HÆ\u0003J\u0011\u0010F\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012HÆ\u0003J\t\u0010G\u001a\u00020\u0010HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010I\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0012HÆ\u0003J\u0011\u0010J\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0012HÆ\u0003J\u0011\u0010K\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0012HÆ\u0003J\t\u0010L\u001a\u00020\u001dHÆ\u0003J\t\u0010M\u001a\u00020\u001dHÆ\u0003Jÿ\u0001\u0010N\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00102\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00122\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00122\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00122\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001dHÆ\u0001J\u0014\u0010O\u001a\u00020\u001d2\b\u0010P\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010Q\u001a\u00020\u0010HÖ\u0081\u0004J\n\u0010R\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b#\u0012\b\b$\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R'\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b#\u0012\b\b$\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\"R'\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b#\u0012\b\b$\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\"R'\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b#\u0012\b\b$\u0012\u0004\b\b(\u0006¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\"R%\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u0092\u0002\f\b#\u0012\b\b$\u0012\u0004\b\b(\u0007¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R%\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004\u0092\u0002\f\b#\u0012\b\b$\u0012\u0004\b\b(\t¢\u0006\b\n\u0000\u001a\u0004\b*\u0010)R%\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004\u0092\u0002\f\b#\u0012\b\b$\u0012\u0004\b\b(\n¢\u0006\b\n\u0000\u001a\u0004\b+\u0010)R%\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004\u0092\u0002\f\b#\u0012\b\b$\u0012\u0004\b\b(\u000b¢\u0006\b\n\u0000\u001a\u0004\b,\u0010)R'\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b#\u0012\b\b$\u0012\u0004\b\b(\f¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\"R'\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b#\u0012\b\b$\u0012\u0004\b\b(\r¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\"R%\u0010\u000e\u001a\u00020\b8\u0006X\u0087\u0004\u0092\u0002\f\b#\u0012\b\b$\u0012\u0004\b\b(\u000e¢\u0006\b\n\u0000\u001a\u0004\b/\u0010)R%\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004\u0092\u0002\f\b#\u0012\b\b$\u0012\u0004\b\b(\u000f¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R-\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0006X\u0087\u0004\u0092\u0002\f\b#\u0012\b\b$\u0012\u0004\b\b(\u0011¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R%\u0010\u0014\u001a\u00020\u00108\u0006X\u0087\u0004\u0092\u0002\f\b#\u0012\b\b$\u0012\u0004\b\b(\u0014¢\u0006\b\n\u0000\u001a\u0004\b4\u00101R'\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b#\u0012\b\b$\u0012\u0004\b\b(\u0015¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\"R-\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00128\u0006X\u0087\u0004\u0092\u0002\f\b#\u0012\b\b$\u0012\u0004\b\b(\u0016¢\u0006\b\n\u0000\u001a\u0004\b6\u00103R-\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00128\u0006X\u0087\u0004\u0092\u0002\f\b#\u0012\b\b$\u0012\u0004\b\b(\u0018¢\u0006\b\n\u0000\u001a\u0004\b7\u00103R-\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00128\u0006X\u0087\u0004\u0092\u0002\f\b#\u0012\b\b$\u0012\u0004\b\b(\u001a¢\u0006\b\n\u0000\u001a\u0004\b8\u00103R%\u0010\u001c\u001a\u00020\u001d8\u0006X\u0087\u0004\u0092\u0002\f\b#\u0012\b\b$\u0012\u0004\b\b(\u001c¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u00109R%\u0010\u001e\u001a\u00020\u001d8\u0006X\u0087\u0004\u0092\u0002\f\b#\u0012\b\b$\u0012\u0004\b\b(\u001e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u00109Ê\u0001\f\bT\u0012\b\bU\u0012\u0004\b\u0003\u0010\u0002¨\u0006S"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/racing/NetworkInstantRacingTicket;", "", "ticketId", "", "ticketNumber", "type", "sportId", "totalStake", "", "totalReturn", "wht", "createTime", "roundId", "giftId", "giftAmount", "giftKind", "", "bets", "", "Lcom/sportybet/android/instantwin/newtork/model/response/racing/NetworkInstantRacingTicketBet;", "flexibleFitSize", "totalOdds", "events", "Lcom/sportybet/android/instantwin/newtork/model/response/racing/NetworkInstantRacingTicketEvent;", "markets", "Lcom/sportybet/android/instantwin/newtork/model/response/racing/NetworkInstantRacingTicketMarket;", "outcomes", "Lcom/sportybet/android/instantwin/newtork/model/response/racing/NetworkInstantRacingTicketOutcome;", "isSettled", "", "isWin", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJJLjava/lang/String;Ljava/lang/String;JILjava/util/List;ILjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZZ)V", "getTicketId", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getTicketNumber", "getType", "getSportId", "getTotalStake", "()J", "getTotalReturn", "getWht", "getCreateTime", "getRoundId", "getGiftId", "getGiftAmount", "getGiftKind", "()I", "getBets", "()Ljava/util/List;", "getFlexibleFitSize", "getTotalOdds", "getEvents", "getMarkets", "getOutcomes", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "copy", "equals", "other", "hashCode", "toString", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkInstantRacingTicket {
    public static final int $stable = 0;

    @SerializedName("bets")
    private final List<NetworkInstantRacingTicketBet> bets;

    @SerializedName("createTime")
    private final long createTime;

    @SerializedName("events")
    private final List<NetworkInstantRacingTicketEvent> events;

    @SerializedName("flexibleFitSize")
    private final int flexibleFitSize;

    @SerializedName("giftAmount")
    private final long giftAmount;

    @SerializedName("giftId")
    private final String giftId;

    @SerializedName("giftKind")
    private final int giftKind;

    @SerializedName("isSettled")
    private final boolean isSettled;

    @SerializedName("isWin")
    private final boolean isWin;

    @SerializedName("markets")
    private final List<NetworkInstantRacingTicketMarket> markets;

    @SerializedName("outcomes")
    private final List<NetworkInstantRacingTicketOutcome> outcomes;

    @SerializedName("roundId")
    private final String roundId;

    @SerializedName("sportId")
    private final String sportId;

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

    public NetworkInstantRacingTicket(String str, String str2, String str3, String str4, long j, long j2, long j3, long j4, String str5, String str6, long j5, int i, List<NetworkInstantRacingTicketBet> list, int i2, String str7, List<NetworkInstantRacingTicketEvent> list2, List<NetworkInstantRacingTicketMarket> list3, List<NetworkInstantRacingTicketOutcome> list4, boolean z, boolean z2) {
        this.ticketId = str;
        this.ticketNumber = str2;
        this.type = str3;
        this.sportId = str4;
        this.totalStake = j;
        this.totalReturn = j2;
        this.wht = j3;
        this.createTime = j4;
        this.roundId = str5;
        this.giftId = str6;
        this.giftAmount = j5;
        this.giftKind = i;
        this.bets = list;
        this.flexibleFitSize = i2;
        this.totalOdds = str7;
        this.events = list2;
        this.markets = list3;
        this.outcomes = list4;
        this.isSettled = z;
        this.isWin = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NetworkInstantRacingTicket copy$default(NetworkInstantRacingTicket networkInstantRacingTicket, String str, String str2, String str3, String str4, long j, long j2, long j3, long j4, String str5, String str6, long j5, int i, List list, int i2, String str7, List list2, List list3, List list4, boolean z, boolean z2, int i3, Object obj) {
        boolean z3;
        boolean z4;
        String str8 = (i3 & 1) != 0 ? networkInstantRacingTicket.ticketId : str;
        String str9 = (i3 & 2) != 0 ? networkInstantRacingTicket.ticketNumber : str2;
        String str10 = (i3 & 4) != 0 ? networkInstantRacingTicket.type : str3;
        String str11 = (i3 & 8) != 0 ? networkInstantRacingTicket.sportId : str4;
        long j6 = (i3 & 16) != 0 ? networkInstantRacingTicket.totalStake : j;
        long j7 = (i3 & 32) != 0 ? networkInstantRacingTicket.totalReturn : j2;
        long j8 = (i3 & 64) != 0 ? networkInstantRacingTicket.wht : j3;
        long j9 = (i3 & 128) != 0 ? networkInstantRacingTicket.createTime : j4;
        String str12 = (i3 & 256) != 0 ? networkInstantRacingTicket.roundId : str5;
        String str13 = (i3 & 512) != 0 ? networkInstantRacingTicket.giftId : str6;
        String str14 = str8;
        String str15 = str9;
        long j10 = (i3 & 1024) != 0 ? networkInstantRacingTicket.giftAmount : j5;
        int i4 = (i3 & 2048) != 0 ? networkInstantRacingTicket.giftKind : i;
        List list5 = (i3 & 4096) != 0 ? networkInstantRacingTicket.bets : list;
        int i5 = i4;
        int i6 = (i3 & 8192) != 0 ? networkInstantRacingTicket.flexibleFitSize : i2;
        String str16 = (i3 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? networkInstantRacingTicket.totalOdds : str7;
        List list6 = (i3 & 32768) != 0 ? networkInstantRacingTicket.events : list2;
        List list7 = (i3 & 65536) != 0 ? networkInstantRacingTicket.markets : list3;
        List list8 = (i3 & 131072) != 0 ? networkInstantRacingTicket.outcomes : list4;
        boolean z5 = (i3 & 262144) != 0 ? networkInstantRacingTicket.isSettled : z;
        if ((i3 & 524288) != 0) {
            z4 = z5;
            z3 = networkInstantRacingTicket.isWin;
        } else {
            z3 = z2;
            z4 = z5;
        }
        return networkInstantRacingTicket.copy(str14, str15, str10, str11, j6, j7, j8, j9, str12, str13, j10, i5, list5, i6, str16, list6, list7, list8, z4, z3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTicketId() {
        return this.ticketId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getGiftId() {
        return this.giftId;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final long getGiftAmount() {
        return this.giftAmount;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getGiftKind() {
        return this.giftKind;
    }

    public final List<NetworkInstantRacingTicketBet> component13() {
        return this.bets;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getFlexibleFitSize() {
        return this.flexibleFitSize;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getTotalOdds() {
        return this.totalOdds;
    }

    public final List<NetworkInstantRacingTicketEvent> component16() {
        return this.events;
    }

    public final List<NetworkInstantRacingTicketMarket> component17() {
        return this.markets;
    }

    public final List<NetworkInstantRacingTicketOutcome> component18() {
        return this.outcomes;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final boolean getIsSettled() {
        return this.isSettled;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTicketNumber() {
        return this.ticketNumber;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final boolean getIsWin() {
        return this.isWin;
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
    public final String getRoundId() {
        return this.roundId;
    }

    public final NetworkInstantRacingTicket copy(String ticketId, String ticketNumber, String type, String sportId, long totalStake, long totalReturn, long wht, long createTime, String roundId, String giftId, long giftAmount, int giftKind, List<NetworkInstantRacingTicketBet> bets, int flexibleFitSize, String totalOdds, List<NetworkInstantRacingTicketEvent> events, List<NetworkInstantRacingTicketMarket> markets, List<NetworkInstantRacingTicketOutcome> outcomes, boolean isSettled, boolean isWin) {
        return new NetworkInstantRacingTicket(ticketId, ticketNumber, type, sportId, totalStake, totalReturn, wht, createTime, roundId, giftId, giftAmount, giftKind, bets, flexibleFitSize, totalOdds, events, markets, outcomes, isSettled, isWin);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkInstantRacingTicket)) {
            return false;
        }
        NetworkInstantRacingTicket networkInstantRacingTicket = (NetworkInstantRacingTicket) other;
        return Intrinsics.g(this.ticketId, networkInstantRacingTicket.ticketId) && Intrinsics.g(this.ticketNumber, networkInstantRacingTicket.ticketNumber) && Intrinsics.g(this.type, networkInstantRacingTicket.type) && Intrinsics.g(this.sportId, networkInstantRacingTicket.sportId) && this.totalStake == networkInstantRacingTicket.totalStake && this.totalReturn == networkInstantRacingTicket.totalReturn && this.wht == networkInstantRacingTicket.wht && this.createTime == networkInstantRacingTicket.createTime && Intrinsics.g(this.roundId, networkInstantRacingTicket.roundId) && Intrinsics.g(this.giftId, networkInstantRacingTicket.giftId) && this.giftAmount == networkInstantRacingTicket.giftAmount && this.giftKind == networkInstantRacingTicket.giftKind && Intrinsics.g(this.bets, networkInstantRacingTicket.bets) && this.flexibleFitSize == networkInstantRacingTicket.flexibleFitSize && Intrinsics.g(this.totalOdds, networkInstantRacingTicket.totalOdds) && Intrinsics.g(this.events, networkInstantRacingTicket.events) && Intrinsics.g(this.markets, networkInstantRacingTicket.markets) && Intrinsics.g(this.outcomes, networkInstantRacingTicket.outcomes) && this.isSettled == networkInstantRacingTicket.isSettled && this.isWin == networkInstantRacingTicket.isWin;
    }

    public final List<NetworkInstantRacingTicketBet> getBets() {
        return this.bets;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final List<NetworkInstantRacingTicketEvent> getEvents() {
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

    public final List<NetworkInstantRacingTicketMarket> getMarkets() {
        return this.markets;
    }

    public final List<NetworkInstantRacingTicketOutcome> getOutcomes() {
        return this.outcomes;
    }

    public final String getRoundId() {
        return this.roundId;
    }

    public final String getSportId() {
        return this.sportId;
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
        String str5 = this.roundId;
        int iHashCode4 = (iA + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.giftId;
        int iA2 = gpp.a(this.giftKind, f87.a((iHashCode4 + (str6 == null ? 0 : str6.hashCode())) * 31, this.giftAmount, 31), 31);
        List<NetworkInstantRacingTicketBet> list = this.bets;
        int iA3 = gpp.a(this.flexibleFitSize, (iA2 + (list == null ? 0 : list.hashCode())) * 31, 31);
        String str7 = this.totalOdds;
        int iHashCode5 = (iA3 + (str7 == null ? 0 : str7.hashCode())) * 31;
        List<NetworkInstantRacingTicketEvent> list2 = this.events;
        int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<NetworkInstantRacingTicketMarket> list3 = this.markets;
        int iHashCode7 = (iHashCode6 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<NetworkInstantRacingTicketOutcome> list4 = this.outcomes;
        return Boolean.hashCode(this.isWin) + mtg0.a((iHashCode7 + (list4 != null ? list4.hashCode() : 0)) * 31, 31, this.isSettled);
    }

    public final boolean isSettled() {
        return this.isSettled;
    }

    public final boolean isWin() {
        return this.isWin;
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
        String str5 = this.roundId;
        String str6 = this.giftId;
        long j5 = this.giftAmount;
        int i = this.giftKind;
        List<NetworkInstantRacingTicketBet> list = this.bets;
        int i2 = this.flexibleFitSize;
        String str7 = this.totalOdds;
        List<NetworkInstantRacingTicketEvent> list2 = this.events;
        List<NetworkInstantRacingTicketMarket> list3 = this.markets;
        List<NetworkInstantRacingTicketOutcome> list4 = this.outcomes;
        boolean z = this.isSettled;
        boolean z2 = this.isWin;
        StringBuilder sbA = ux5.a("NetworkInstantRacingTicket(ticketId=", str, ", ticketNumber=", str2, ", type=");
        hxa.c(sbA, str3, ", sportId=", str4, ", totalStake=");
        sbA.append(j);
        g41.a(j2, ", totalReturn=", ", wht=", sbA);
        sbA.append(j3);
        g41.a(j4, ", createTime=", ", roundId=", sbA);
        hxa.c(sbA, str5, ", giftId=", str6, ", giftAmount=");
        to10.a(sbA, j5, ", giftKind=", i);
        sbA.append(", bets=");
        sbA.append(list);
        sbA.append(", flexibleFitSize=");
        sbA.append(i2);
        sbA.append(", totalOdds=");
        sbA.append(str7);
        sbA.append(", events=");
        sbA.append(list2);
        qjk.a(", markets=", ", outcomes=", sbA, list3, list4);
        u8.a(", isSettled=", ", isWin=", sbA, z, z2);
        sbA.append(")");
        return sbA.toString();
    }
}
