package com.sportygames.crash.remote.models;

import defpackage.ai50;
import defpackage.gmf0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010 \u001a\u00020\nHÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003JV\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\u0005HÖ\u0001J\t\u0010)\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006*"}, d2 = {"Lcom/sportygames/crash/remote/models/RoundBetResponse;", "", "roundId", "", "totalBet", "", "topBets", "", "Lcom/sportygames/crash/remote/models/TopBets;", "messageType", "", "timeStamp", "bet", "<init>", "(JLjava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/Long;Lcom/sportygames/crash/remote/models/TopBets;)V", "getRoundId", "()J", "getTotalBet", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTopBets", "()Ljava/util/List;", "getMessageType", "()Ljava/lang/String;", "getTimeStamp", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getBet", "()Lcom/sportygames/crash/remote/models/TopBets;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(JLjava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/Long;Lcom/sportygames/crash/remote/models/TopBets;)Lcom/sportygames/crash/remote/models/RoundBetResponse;", "equals", "", "other", "hashCode", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RoundBetResponse {
    public static final int $stable = 8;
    private final TopBets bet;
    private final String messageType;
    private final long roundId;
    private final Long timeStamp;
    private final List<TopBets> topBets;
    private final Integer totalBet;

    public /* synthetic */ RoundBetResponse(long j, Integer num, List list, String str, Long l, TopBets topBets, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? 0 : num, list, str, (i & 16) != 0 ? 0L : l, topBets);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RoundBetResponse copy$default(RoundBetResponse roundBetResponse, long j, Integer num, List list, String str, Long l, TopBets topBets, int i, Object obj) {
        if ((i & 1) != 0) {
            j = roundBetResponse.roundId;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            num = roundBetResponse.totalBet;
        }
        Integer num2 = num;
        if ((i & 4) != 0) {
            list = roundBetResponse.topBets;
        }
        List list2 = list;
        if ((i & 8) != 0) {
            str = roundBetResponse.messageType;
        }
        String str2 = str;
        if ((i & 16) != 0) {
            l = roundBetResponse.timeStamp;
        }
        Long l2 = l;
        if ((i & 32) != 0) {
            topBets = roundBetResponse.bet;
        }
        return roundBetResponse.copy(j2, num2, list2, str2, l2, topBets);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getRoundId() {
        return this.roundId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getTotalBet() {
        return this.totalBet;
    }

    public final List<TopBets> component3() {
        return this.topBets;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMessageType() {
        return this.messageType;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getTimeStamp() {
        return this.timeStamp;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final TopBets getBet() {
        return this.bet;
    }

    public final RoundBetResponse copy(long roundId, Integer totalBet, List<TopBets> topBets, String messageType, Long timeStamp, TopBets bet) {
        topBets.getClass();
        messageType.getClass();
        return new RoundBetResponse(roundId, totalBet, topBets, messageType, timeStamp, bet);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RoundBetResponse)) {
            return false;
        }
        RoundBetResponse roundBetResponse = (RoundBetResponse) other;
        return this.roundId == roundBetResponse.roundId && Intrinsics.g(this.totalBet, roundBetResponse.totalBet) && Intrinsics.g(this.topBets, roundBetResponse.topBets) && Intrinsics.g(this.messageType, roundBetResponse.messageType) && Intrinsics.g(this.timeStamp, roundBetResponse.timeStamp) && Intrinsics.g(this.bet, roundBetResponse.bet);
    }

    public final TopBets getBet() {
        return this.bet;
    }

    public final String getMessageType() {
        return this.messageType;
    }

    public final long getRoundId() {
        return this.roundId;
    }

    public final Long getTimeStamp() {
        return this.timeStamp;
    }

    public final List<TopBets> getTopBets() {
        return this.topBets;
    }

    public final Integer getTotalBet() {
        return this.totalBet;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.roundId) * 31;
        Integer num = this.totalBet;
        int iA = gmf0.a(ai50.a((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.topBets), 31, this.messageType);
        Long l = this.timeStamp;
        int iHashCode2 = (iA + (l == null ? 0 : l.hashCode())) * 31;
        TopBets topBets = this.bet;
        return iHashCode2 + (topBets != null ? topBets.hashCode() : 0);
    }

    public String toString() {
        return "RoundBetResponse(roundId=" + this.roundId + ", totalBet=" + this.totalBet + ", topBets=" + this.topBets + ", messageType=" + this.messageType + ", timeStamp=" + this.timeStamp + ", bet=" + this.bet + ")";
    }

    public RoundBetResponse(long j, Integer num, List<TopBets> list, String str, Long l, TopBets topBets) {
        list.getClass();
        str.getClass();
        this.roundId = j;
        this.totalBet = num;
        this.topBets = list;
        this.messageType = str;
        this.timeStamp = l;
        this.bet = topBets;
    }
}
