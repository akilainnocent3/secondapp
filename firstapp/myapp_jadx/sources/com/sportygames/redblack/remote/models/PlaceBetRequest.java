package com.sportygames.redblack.remote.models;

import com.sportygames.commons.models.GPSData;
import com.sportygames.redblack.remote.models.enums.BetCardDecision;
import defpackage.k800;
import defpackage.mtg0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u0010\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0016J\t\u0010)\u001a\u00020\u0007HÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001dJ\u000b\u0010+\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0016J\t\u0010-\u001a\u00020\u000eHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0010HÆ\u0003Jh\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0002\u00100J\u0013\u00101\u001a\u00020\u000e2\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u00020\u0003HÖ\u0001J\t\u00104\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b!\u0010\u0016R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\"R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u00065"}, d2 = {"Lcom/sportygames/redblack/remote/models/PlaceBetRequest;", "", "turnId", "", "betAmount", "", "decision", "Lcom/sportygames/redblack/remote/models/enums/BetCardDecision;", "roundId", "", "giftId", "", "giftAmount", "isCampaignUser", "", "gpsData", "Lcom/sportygames/commons/models/GPSData;", "<init>", "(ILjava/lang/Double;Lcom/sportygames/redblack/remote/models/enums/BetCardDecision;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Double;ZLcom/sportygames/commons/models/GPSData;)V", "getTurnId", "()I", "getBetAmount", "()Ljava/lang/Double;", "setBetAmount", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getDecision", "()Lcom/sportygames/redblack/remote/models/enums/BetCardDecision;", "getRoundId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getGiftId", "()Ljava/lang/String;", "getGiftAmount", "()Z", "getGpsData", "()Lcom/sportygames/commons/models/GPSData;", "setGpsData", "(Lcom/sportygames/commons/models/GPSData;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(ILjava/lang/Double;Lcom/sportygames/redblack/remote/models/enums/BetCardDecision;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Double;ZLcom/sportygames/commons/models/GPSData;)Lcom/sportygames/redblack/remote/models/PlaceBetRequest;", "equals", "other", "hashCode", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PlaceBetRequest {
    public static final int $stable = 8;
    private Double betAmount;
    private final BetCardDecision decision;
    private final Double giftAmount;
    private final String giftId;
    private GPSData gpsData;
    private final boolean isCampaignUser;
    private final Long roundId;
    private final int turnId;

    public /* synthetic */ PlaceBetRequest(int i, Double d, BetCardDecision betCardDecision, Long l, String str, Double d2, boolean z, GPSData gPSData, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, d, betCardDecision, l, str, d2, (i2 & 64) != 0 ? false : z, (i2 & 128) != 0 ? null : gPSData);
    }

    public static /* synthetic */ PlaceBetRequest copy$default(PlaceBetRequest placeBetRequest, int i, Double d, BetCardDecision betCardDecision, Long l, String str, Double d2, boolean z, GPSData gPSData, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = placeBetRequest.turnId;
        }
        if ((i2 & 2) != 0) {
            d = placeBetRequest.betAmount;
        }
        if ((i2 & 4) != 0) {
            betCardDecision = placeBetRequest.decision;
        }
        if ((i2 & 8) != 0) {
            l = placeBetRequest.roundId;
        }
        if ((i2 & 16) != 0) {
            str = placeBetRequest.giftId;
        }
        if ((i2 & 32) != 0) {
            d2 = placeBetRequest.giftAmount;
        }
        if ((i2 & 64) != 0) {
            z = placeBetRequest.isCampaignUser;
        }
        if ((i2 & 128) != 0) {
            gPSData = placeBetRequest.gpsData;
        }
        boolean z2 = z;
        GPSData gPSData2 = gPSData;
        String str2 = str;
        Double d3 = d2;
        return placeBetRequest.copy(i, d, betCardDecision, l, str2, d3, z2, gPSData2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getTurnId() {
        return this.turnId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Double getBetAmount() {
        return this.betAmount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BetCardDecision getDecision() {
        return this.decision;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getRoundId() {
        return this.roundId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getGiftId() {
        return this.giftId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Double getGiftAmount() {
        return this.giftAmount;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIsCampaignUser() {
        return this.isCampaignUser;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final GPSData getGpsData() {
        return this.gpsData;
    }

    public final PlaceBetRequest copy(int turnId, Double betAmount, BetCardDecision decision, Long roundId, String giftId, Double giftAmount, boolean isCampaignUser, GPSData gpsData) {
        decision.getClass();
        return new PlaceBetRequest(turnId, betAmount, decision, roundId, giftId, giftAmount, isCampaignUser, gpsData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlaceBetRequest)) {
            return false;
        }
        PlaceBetRequest placeBetRequest = (PlaceBetRequest) other;
        return this.turnId == placeBetRequest.turnId && Intrinsics.g(this.betAmount, placeBetRequest.betAmount) && this.decision == placeBetRequest.decision && Intrinsics.g(this.roundId, placeBetRequest.roundId) && Intrinsics.g(this.giftId, placeBetRequest.giftId) && Intrinsics.g(this.giftAmount, placeBetRequest.giftAmount) && this.isCampaignUser == placeBetRequest.isCampaignUser && Intrinsics.g(this.gpsData, placeBetRequest.gpsData);
    }

    public final Double getBetAmount() {
        return this.betAmount;
    }

    public final BetCardDecision getDecision() {
        return this.decision;
    }

    public final Double getGiftAmount() {
        return this.giftAmount;
    }

    public final String getGiftId() {
        return this.giftId;
    }

    public final GPSData getGpsData() {
        return this.gpsData;
    }

    public final Long getRoundId() {
        return this.roundId;
    }

    public final int getTurnId() {
        return this.turnId;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.turnId) * 31;
        Double d = this.betAmount;
        int iHashCode2 = (this.decision.hashCode() + ((iHashCode + (d == null ? 0 : d.hashCode())) * 31)) * 31;
        Long l = this.roundId;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.giftId;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Double d2 = this.giftAmount;
        int iA = mtg0.a((iHashCode4 + (d2 == null ? 0 : d2.hashCode())) * 31, 31, this.isCampaignUser);
        GPSData gPSData = this.gpsData;
        return iA + (gPSData != null ? gPSData.hashCode() : 0);
    }

    public final boolean isCampaignUser() {
        return this.isCampaignUser;
    }

    public final void setBetAmount(Double d) {
        this.betAmount = d;
    }

    public final void setGpsData(GPSData gPSData) {
        this.gpsData = gPSData;
    }

    public String toString() {
        int i = this.turnId;
        Double d = this.betAmount;
        BetCardDecision betCardDecision = this.decision;
        Long l = this.roundId;
        String str = this.giftId;
        Double d2 = this.giftAmount;
        boolean z = this.isCampaignUser;
        GPSData gPSData = this.gpsData;
        StringBuilder sb = new StringBuilder("PlaceBetRequest(turnId=");
        sb.append(i);
        sb.append(", betAmount=");
        sb.append(d);
        sb.append(", decision=");
        sb.append(betCardDecision);
        sb.append(", roundId=");
        sb.append(l);
        sb.append(", giftId=");
        k800.a(d2, str, ", giftAmount=", ", isCampaignUser=", sb);
        sb.append(z);
        sb.append(", gpsData=");
        sb.append(gPSData);
        sb.append(")");
        return sb.toString();
    }

    public PlaceBetRequest(int i, Double d, BetCardDecision betCardDecision, Long l, String str, Double d2, boolean z, GPSData gPSData) {
        betCardDecision.getClass();
        this.turnId = i;
        this.betAmount = d;
        this.decision = betCardDecision;
        this.roundId = l;
        this.giftId = str;
        this.giftAmount = d2;
        this.isCampaignUser = z;
        this.gpsData = gPSData;
    }
}
