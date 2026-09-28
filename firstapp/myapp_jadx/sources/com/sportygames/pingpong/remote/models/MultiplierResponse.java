package com.sportygames.pingpong.remote.models;

import com.appsflyer.internal.b0;
import defpackage.gmf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b.\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\u0010\u0010(\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010)\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u0010*\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u0010+\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010!J\u0010\u0010.\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u0010/\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u00100\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u008e\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u00102J\u0013\u00103\u001a\u00020\u00072\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u00020\tHÖ\u0001J\t\u00106\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001d\u0010\u001bR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001e\u0010\u001bR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0015\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b#\u0010\u001bR\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b$\u0010\u0018R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b%\u0010\u001b¨\u00067"}, d2 = {"Lcom/sportygames/pingpong/remote/models/MultiplierResponse;", "", "roundId", "", "multiplier", "", "hasEnded", "", "millisLeft", "", "hitter", "totalMillis", "messageType", "timeStamp", "currentServer", "netPointFlag", "winner", "<init>", "(JLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "getRoundId", "()J", "getMultiplier", "()Ljava/lang/String;", "getHasEnded", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMillisLeft", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getHitter", "getTotalMillis", "getMessageType", "getTimeStamp", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCurrentServer", "getNetPointFlag", "getWinner", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(JLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;)Lcom/sportygames/pingpong/remote/models/MultiplierResponse;", "equals", "other", "hashCode", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MultiplierResponse {
    public static final int $stable = 0;
    private final Integer currentServer;
    private final Boolean hasEnded;
    private final Integer hitter;
    private final String messageType;
    private final Integer millisLeft;
    private final String multiplier;
    private final Boolean netPointFlag;
    private final long roundId;
    private final Long timeStamp;
    private final Integer totalMillis;
    private final Integer winner;

    public MultiplierResponse(long j, String str, Boolean bool, Integer num, Integer num2, Integer num3, String str2, Long l, Integer num4, Boolean bool2, Integer num5) {
        str.getClass();
        this.roundId = j;
        this.multiplier = str;
        this.hasEnded = bool;
        this.millisLeft = num;
        this.hitter = num2;
        this.totalMillis = num3;
        this.messageType = str2;
        this.timeStamp = l;
        this.currentServer = num4;
        this.netPointFlag = bool2;
        this.winner = num5;
    }

    public static /* synthetic */ MultiplierResponse copy$default(MultiplierResponse multiplierResponse, long j, String str, Boolean bool, Integer num, Integer num2, Integer num3, String str2, Long l, Integer num4, Boolean bool2, Integer num5, int i, Object obj) {
        if ((i & 1) != 0) {
            j = multiplierResponse.roundId;
        }
        return multiplierResponse.copy(j, (i & 2) != 0 ? multiplierResponse.multiplier : str, (i & 4) != 0 ? multiplierResponse.hasEnded : bool, (i & 8) != 0 ? multiplierResponse.millisLeft : num, (i & 16) != 0 ? multiplierResponse.hitter : num2, (i & 32) != 0 ? multiplierResponse.totalMillis : num3, (i & 64) != 0 ? multiplierResponse.messageType : str2, (i & 128) != 0 ? multiplierResponse.timeStamp : l, (i & 256) != 0 ? multiplierResponse.currentServer : num4, (i & 512) != 0 ? multiplierResponse.netPointFlag : bool2, (i & 1024) != 0 ? multiplierResponse.winner : num5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getRoundId() {
        return this.roundId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Boolean getNetPointFlag() {
        return this.netPointFlag;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Integer getWinner() {
        return this.winner;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMultiplier() {
        return this.multiplier;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getHasEnded() {
        return this.hasEnded;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getMillisLeft() {
        return this.millisLeft;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getHitter() {
        return this.hitter;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getTotalMillis() {
        return this.totalMillis;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getMessageType() {
        return this.messageType;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Long getTimeStamp() {
        return this.timeStamp;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Integer getCurrentServer() {
        return this.currentServer;
    }

    public final MultiplierResponse copy(long roundId, String multiplier, Boolean hasEnded, Integer millisLeft, Integer hitter, Integer totalMillis, String messageType, Long timeStamp, Integer currentServer, Boolean netPointFlag, Integer winner) {
        multiplier.getClass();
        return new MultiplierResponse(roundId, multiplier, hasEnded, millisLeft, hitter, totalMillis, messageType, timeStamp, currentServer, netPointFlag, winner);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MultiplierResponse)) {
            return false;
        }
        MultiplierResponse multiplierResponse = (MultiplierResponse) other;
        return this.roundId == multiplierResponse.roundId && Intrinsics.g(this.multiplier, multiplierResponse.multiplier) && Intrinsics.g(this.hasEnded, multiplierResponse.hasEnded) && Intrinsics.g(this.millisLeft, multiplierResponse.millisLeft) && Intrinsics.g(this.hitter, multiplierResponse.hitter) && Intrinsics.g(this.totalMillis, multiplierResponse.totalMillis) && Intrinsics.g(this.messageType, multiplierResponse.messageType) && Intrinsics.g(this.timeStamp, multiplierResponse.timeStamp) && Intrinsics.g(this.currentServer, multiplierResponse.currentServer) && Intrinsics.g(this.netPointFlag, multiplierResponse.netPointFlag) && Intrinsics.g(this.winner, multiplierResponse.winner);
    }

    public final Integer getCurrentServer() {
        return this.currentServer;
    }

    public final Boolean getHasEnded() {
        return this.hasEnded;
    }

    public final Integer getHitter() {
        return this.hitter;
    }

    public final String getMessageType() {
        return this.messageType;
    }

    public final Integer getMillisLeft() {
        return this.millisLeft;
    }

    public final String getMultiplier() {
        return this.multiplier;
    }

    public final Boolean getNetPointFlag() {
        return this.netPointFlag;
    }

    public final long getRoundId() {
        return this.roundId;
    }

    public final Long getTimeStamp() {
        return this.timeStamp;
    }

    public final Integer getTotalMillis() {
        return this.totalMillis;
    }

    public final Integer getWinner() {
        return this.winner;
    }

    public int hashCode() {
        int iA = gmf0.a(Long.hashCode(this.roundId) * 31, 31, this.multiplier);
        Boolean bool = this.hasEnded;
        int iHashCode = (iA + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.millisLeft;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.hitter;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.totalMillis;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str = this.messageType;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.timeStamp;
        int iHashCode6 = (iHashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num4 = this.currentServer;
        int iHashCode7 = (iHashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Boolean bool2 = this.netPointFlag;
        int iHashCode8 = (iHashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num5 = this.winner;
        return iHashCode8 + (num5 != null ? num5.hashCode() : 0);
    }

    public String toString() {
        long j = this.roundId;
        String str = this.multiplier;
        Boolean bool = this.hasEnded;
        Integer num = this.millisLeft;
        Integer num2 = this.hitter;
        Integer num3 = this.totalMillis;
        String str2 = this.messageType;
        Long l = this.timeStamp;
        Integer num4 = this.currentServer;
        Boolean bool2 = this.netPointFlag;
        Integer num5 = this.winner;
        StringBuilder sbA = b0.a(j, "MultiplierResponse(roundId=", ", multiplier=", str);
        sbA.append(", hasEnded=");
        sbA.append(bool);
        sbA.append(", millisLeft=");
        sbA.append(num);
        sbA.append(", hitter=");
        sbA.append(num2);
        sbA.append(", totalMillis=");
        sbA.append(num3);
        sbA.append(", messageType=");
        sbA.append(str2);
        sbA.append(", timeStamp=");
        sbA.append(l);
        sbA.append(", currentServer=");
        sbA.append(num4);
        sbA.append(", netPointFlag=");
        sbA.append(bool2);
        sbA.append(", winner=");
        sbA.append(num5);
        sbA.append(")");
        return sbA.toString();
    }
}
