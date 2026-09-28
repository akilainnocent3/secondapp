package com.sportygames.pocketrocket.model.response;

import com.appsflyer.internal.b0;
import defpackage.gmf0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0015J\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u000bHÆ\u0003JV\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\bHÖ\u0001J\t\u0010'\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006("}, d2 = {"Lcom/sportygames/pocketrocket/model/response/RoundBetResponse;", "", "roundId", "", "userId", "", "messageType", "totalBetCount", "", "topBets", "", "Lcom/sportygames/pocketrocket/model/response/BetDetails;", "bet", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Lcom/sportygames/pocketrocket/model/response/BetDetails;)V", "getRoundId", "()J", "getUserId", "()Ljava/lang/String;", "getMessageType", "getTotalBetCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTopBets", "()Ljava/util/List;", "getBet", "()Lcom/sportygames/pocketrocket/model/response/BetDetails;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Lcom/sportygames/pocketrocket/model/response/BetDetails;)Lcom/sportygames/pocketrocket/model/response/RoundBetResponse;", "equals", "", "other", "hashCode", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RoundBetResponse {
    public static final int $stable = 8;
    private final BetDetails bet;
    private final String messageType;
    private final long roundId;
    private final List<BetDetails> topBets;
    private final Integer totalBetCount;
    private final String userId;

    public RoundBetResponse(long j, String str, String str2, Integer num, List<BetDetails> list, BetDetails betDetails) {
        str.getClass();
        str2.getClass();
        this.roundId = j;
        this.userId = str;
        this.messageType = str2;
        this.totalBetCount = num;
        this.topBets = list;
        this.bet = betDetails;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RoundBetResponse copy$default(RoundBetResponse roundBetResponse, long j, String str, String str2, Integer num, List list, BetDetails betDetails, int i, Object obj) {
        if ((i & 1) != 0) {
            j = roundBetResponse.roundId;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = roundBetResponse.userId;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            str2 = roundBetResponse.messageType;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            num = roundBetResponse.totalBetCount;
        }
        Integer num2 = num;
        if ((i & 16) != 0) {
            list = roundBetResponse.topBets;
        }
        List list2 = list;
        if ((i & 32) != 0) {
            betDetails = roundBetResponse.bet;
        }
        return roundBetResponse.copy(j2, str3, str4, num2, list2, betDetails);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getRoundId() {
        return this.roundId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMessageType() {
        return this.messageType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getTotalBetCount() {
        return this.totalBetCount;
    }

    public final List<BetDetails> component5() {
        return this.topBets;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BetDetails getBet() {
        return this.bet;
    }

    public final RoundBetResponse copy(long roundId, String userId, String messageType, Integer totalBetCount, List<BetDetails> topBets, BetDetails bet) {
        userId.getClass();
        messageType.getClass();
        return new RoundBetResponse(roundId, userId, messageType, totalBetCount, topBets, bet);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RoundBetResponse)) {
            return false;
        }
        RoundBetResponse roundBetResponse = (RoundBetResponse) other;
        return this.roundId == roundBetResponse.roundId && Intrinsics.g(this.userId, roundBetResponse.userId) && Intrinsics.g(this.messageType, roundBetResponse.messageType) && Intrinsics.g(this.totalBetCount, roundBetResponse.totalBetCount) && Intrinsics.g(this.topBets, roundBetResponse.topBets) && Intrinsics.g(this.bet, roundBetResponse.bet);
    }

    public final BetDetails getBet() {
        return this.bet;
    }

    public final String getMessageType() {
        return this.messageType;
    }

    public final long getRoundId() {
        return this.roundId;
    }

    public final List<BetDetails> getTopBets() {
        return this.topBets;
    }

    public final Integer getTotalBetCount() {
        return this.totalBetCount;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int iA = gmf0.a(gmf0.a(Long.hashCode(this.roundId) * 31, 31, this.userId), 31, this.messageType);
        Integer num = this.totalBetCount;
        int iHashCode = (iA + (num == null ? 0 : num.hashCode())) * 31;
        List<BetDetails> list = this.topBets;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        BetDetails betDetails = this.bet;
        return iHashCode2 + (betDetails != null ? betDetails.hashCode() : 0);
    }

    public String toString() {
        long j = this.roundId;
        String str = this.userId;
        String str2 = this.messageType;
        Integer num = this.totalBetCount;
        List<BetDetails> list = this.topBets;
        BetDetails betDetails = this.bet;
        StringBuilder sbA = b0.a(j, "RoundBetResponse(roundId=", ", userId=", str);
        sbA.append(", messageType=");
        sbA.append(str2);
        sbA.append(", totalBetCount=");
        sbA.append(num);
        sbA.append(", topBets=");
        sbA.append(list);
        sbA.append(", bet=");
        sbA.append(betDetails);
        sbA.append(")");
        return sbA.toString();
    }

    public /* synthetic */ RoundBetResponse(long j, String str, String str2, Integer num, List list, BetDetails betDetails, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, str2, (i & 8) != 0 ? 0 : num, list, betDetails);
    }
}
