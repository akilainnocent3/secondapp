package com.sportygames.pingpong.remote.models;

import com.appsflyer.internal.m;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.k800;
import defpackage.uf80;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0015J\t\u0010$\u001a\u00020\nHÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001bJ\t\u0010&\u001a\u00020\nHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jp\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010)J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020\nHÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0011¨\u0006/"}, d2 = {"Lcom/sportygames/pingpong/remote/models/PlaceBetResponse;", "", "userPick", "", "nickName", "userId", "stakeAmount", "", "giftAmount", "betIndex", "", "betId", "roomId", "roundId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;ILjava/lang/Integer;ILjava/lang/String;)V", "getUserPick", "()Ljava/lang/String;", "getNickName", "getUserId", "getStakeAmount", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getGiftAmount", "getBetIndex", "()I", "getBetId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRoomId", "getRoundId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;ILjava/lang/Integer;ILjava/lang/String;)Lcom/sportygames/pingpong/remote/models/PlaceBetResponse;", "equals", "", "other", "hashCode", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PlaceBetResponse {
    public static final int $stable = 0;
    private final Integer betId;
    private final int betIndex;
    private final Double giftAmount;
    private final String nickName;
    private final int roomId;
    private final String roundId;
    private final Double stakeAmount;
    private final String userId;
    private final String userPick;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PlaceBetResponse(String str, String str2, String str3, Double d, Double d2, int i, Integer num, int i2, String str4, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        Double dValueOf = Double.valueOf(0.0d);
        this(str, str2, str3, (i3 & 8) != 0 ? dValueOf : d, (i3 & 16) != 0 ? dValueOf : d2, i, num, i2, (i3 & 256) != 0 ? "" : str4);
    }

    public static /* synthetic */ PlaceBetResponse copy$default(PlaceBetResponse placeBetResponse, String str, String str2, String str3, Double d, Double d2, int i, Integer num, int i2, String str4, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = placeBetResponse.userPick;
        }
        if ((i3 & 2) != 0) {
            str2 = placeBetResponse.nickName;
        }
        if ((i3 & 4) != 0) {
            str3 = placeBetResponse.userId;
        }
        if ((i3 & 8) != 0) {
            d = placeBetResponse.stakeAmount;
        }
        if ((i3 & 16) != 0) {
            d2 = placeBetResponse.giftAmount;
        }
        if ((i3 & 32) != 0) {
            i = placeBetResponse.betIndex;
        }
        if ((i3 & 64) != 0) {
            num = placeBetResponse.betId;
        }
        if ((i3 & 128) != 0) {
            i2 = placeBetResponse.roomId;
        }
        if ((i3 & 256) != 0) {
            str4 = placeBetResponse.roundId;
        }
        int i4 = i2;
        String str5 = str4;
        int i5 = i;
        Integer num2 = num;
        Double d3 = d2;
        String str6 = str3;
        return placeBetResponse.copy(str, str2, str6, d, d3, i5, num2, i4, str5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserPick() {
        return this.userPick;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNickName() {
        return this.nickName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Double getStakeAmount() {
        return this.stakeAmount;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Double getGiftAmount() {
        return this.giftAmount;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getBetIndex() {
        return this.betIndex;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getBetId() {
        return this.betId;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getRoomId() {
        return this.roomId;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getRoundId() {
        return this.roundId;
    }

    public final PlaceBetResponse copy(String userPick, String nickName, String userId, Double stakeAmount, Double giftAmount, int betIndex, Integer betId, int roomId, String roundId) {
        userPick.getClass();
        nickName.getClass();
        userId.getClass();
        return new PlaceBetResponse(userPick, nickName, userId, stakeAmount, giftAmount, betIndex, betId, roomId, roundId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlaceBetResponse)) {
            return false;
        }
        PlaceBetResponse placeBetResponse = (PlaceBetResponse) other;
        return Intrinsics.g(this.userPick, placeBetResponse.userPick) && Intrinsics.g(this.nickName, placeBetResponse.nickName) && Intrinsics.g(this.userId, placeBetResponse.userId) && Intrinsics.g(this.stakeAmount, placeBetResponse.stakeAmount) && Intrinsics.g(this.giftAmount, placeBetResponse.giftAmount) && this.betIndex == placeBetResponse.betIndex && Intrinsics.g(this.betId, placeBetResponse.betId) && this.roomId == placeBetResponse.roomId && Intrinsics.g(this.roundId, placeBetResponse.roundId);
    }

    public final Integer getBetId() {
        return this.betId;
    }

    public final int getBetIndex() {
        return this.betIndex;
    }

    public final Double getGiftAmount() {
        return this.giftAmount;
    }

    public final String getNickName() {
        return this.nickName;
    }

    public final int getRoomId() {
        return this.roomId;
    }

    public final String getRoundId() {
        return this.roundId;
    }

    public final Double getStakeAmount() {
        return this.stakeAmount;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUserPick() {
        return this.userPick;
    }

    public int hashCode() {
        int iA = gmf0.a(gmf0.a(this.userPick.hashCode() * 31, 31, this.nickName), 31, this.userId);
        Double d = this.stakeAmount;
        int iHashCode = (iA + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.giftAmount;
        int iA2 = gpp.a(this.betIndex, (iHashCode + (d2 == null ? 0 : d2.hashCode())) * 31, 31);
        Integer num = this.betId;
        int iA3 = gpp.a(this.roomId, (iA2 + (num == null ? 0 : num.hashCode())) * 31, 31);
        String str = this.roundId;
        return iA3 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        String str = this.userPick;
        String str2 = this.nickName;
        String str3 = this.userId;
        Double d = this.stakeAmount;
        Double d2 = this.giftAmount;
        int i = this.betIndex;
        Integer num = this.betId;
        int i2 = this.roomId;
        String str4 = this.roundId;
        StringBuilder sbA = ux5.a("PlaceBetResponse(userPick=", str, ", nickName=", str2, ", userId=");
        k800.a(d, str3, ", stakeAmount=", ", giftAmount=", sbA);
        sbA.append(d2);
        sbA.append(", betIndex=");
        sbA.append(i);
        sbA.append(", betId=");
        sbA.append(num);
        sbA.append(", roomId=");
        sbA.append(i2);
        sbA.append(", roundId=");
        return uf80.a(sbA, str4, ")");
    }

    public PlaceBetResponse(String str, String str2, String str3, Double d, Double d2, int i, Integer num, int i2, String str4) {
        m.a(str, str2, str3);
        this.userPick = str;
        this.nickName = str2;
        this.userId = str3;
        this.stakeAmount = d;
        this.giftAmount = d2;
        this.betIndex = i;
        this.betId = num;
        this.roomId = i2;
        this.roundId = str4;
    }
}
