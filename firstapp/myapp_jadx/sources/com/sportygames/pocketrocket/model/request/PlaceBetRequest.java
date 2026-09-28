package com.sportygames.pocketrocket.model.request;

import com.appsflyer.internal.l;
import com.appsflyer.internal.m;
import com.sportygames.commons.models.GPSData;
import defpackage.f87;
import defpackage.gmf0;
import defpackage.mtg0;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0007HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u0010*\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001cJ\t\u0010+\u001a\u00020\rHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u000fHÆ\u0003Jp\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u0010.J\u0013\u0010/\u001a\u00020\r2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u000202HÖ\u0001J\t\u00103\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b \u0010\u001cR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010!R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u00064"}, d2 = {"Lcom/sportygames/pocketrocket/model/request/PlaceBetRequest;", "", "betAmount", "", "rocketType", "currency", "roundId", "", "giftId", "giftAmount", "", "autoCashoutAt", "isCampaignUser", "", "gpsData", "Lcom/sportygames/commons/models/GPSData;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/Double;Ljava/lang/Double;ZLcom/sportygames/commons/models/GPSData;)V", "getBetAmount", "()Ljava/lang/String;", "getRocketType", "getCurrency", "getRoundId", "()J", "getGiftId", "setGiftId", "(Ljava/lang/String;)V", "getGiftAmount", "()Ljava/lang/Double;", "setGiftAmount", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getAutoCashoutAt", "()Z", "getGpsData", "()Lcom/sportygames/commons/models/GPSData;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/Double;Ljava/lang/Double;ZLcom/sportygames/commons/models/GPSData;)Lcom/sportygames/pocketrocket/model/request/PlaceBetRequest;", "equals", "other", "hashCode", "", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PlaceBetRequest {
    public static final int $stable = 8;
    private final Double autoCashoutAt;
    private final String betAmount;
    private final String currency;
    private Double giftAmount;
    private String giftId;
    private final GPSData gpsData;
    private final boolean isCampaignUser;
    private final String rocketType;
    private final long roundId;

    public /* synthetic */ PlaceBetRequest(String str, String str2, String str3, long j, String str4, Double d, Double d2, boolean z, GPSData gPSData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, j, str4, d, d2, (i & 128) != 0 ? false : z, (i & 256) != 0 ? null : gPSData);
    }

    public static /* synthetic */ PlaceBetRequest copy$default(PlaceBetRequest placeBetRequest, String str, String str2, String str3, long j, String str4, Double d, Double d2, boolean z, GPSData gPSData, int i, Object obj) {
        if ((i & 1) != 0) {
            str = placeBetRequest.betAmount;
        }
        if ((i & 2) != 0) {
            str2 = placeBetRequest.rocketType;
        }
        if ((i & 4) != 0) {
            str3 = placeBetRequest.currency;
        }
        if ((i & 8) != 0) {
            j = placeBetRequest.roundId;
        }
        if ((i & 16) != 0) {
            str4 = placeBetRequest.giftId;
        }
        if ((i & 32) != 0) {
            d = placeBetRequest.giftAmount;
        }
        if ((i & 64) != 0) {
            d2 = placeBetRequest.autoCashoutAt;
        }
        if ((i & 128) != 0) {
            z = placeBetRequest.isCampaignUser;
        }
        if ((i & 256) != 0) {
            gPSData = placeBetRequest.gpsData;
        }
        GPSData gPSData2 = gPSData;
        Double d3 = d2;
        String str5 = str4;
        long j2 = j;
        String str6 = str3;
        return placeBetRequest.copy(str, str2, str6, j2, str5, d, d3, z, gPSData2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBetAmount() {
        return this.betAmount;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRocketType() {
        return this.rocketType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getRoundId() {
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
    public final Double getAutoCashoutAt() {
        return this.autoCashoutAt;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getIsCampaignUser() {
        return this.isCampaignUser;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final GPSData getGpsData() {
        return this.gpsData;
    }

    public final PlaceBetRequest copy(String betAmount, String rocketType, String currency, long roundId, String giftId, Double giftAmount, Double autoCashoutAt, boolean isCampaignUser, GPSData gpsData) {
        betAmount.getClass();
        rocketType.getClass();
        currency.getClass();
        return new PlaceBetRequest(betAmount, rocketType, currency, roundId, giftId, giftAmount, autoCashoutAt, isCampaignUser, gpsData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlaceBetRequest)) {
            return false;
        }
        PlaceBetRequest placeBetRequest = (PlaceBetRequest) other;
        return Intrinsics.g(this.betAmount, placeBetRequest.betAmount) && Intrinsics.g(this.rocketType, placeBetRequest.rocketType) && Intrinsics.g(this.currency, placeBetRequest.currency) && this.roundId == placeBetRequest.roundId && Intrinsics.g(this.giftId, placeBetRequest.giftId) && Intrinsics.g(this.giftAmount, placeBetRequest.giftAmount) && Intrinsics.g(this.autoCashoutAt, placeBetRequest.autoCashoutAt) && this.isCampaignUser == placeBetRequest.isCampaignUser && Intrinsics.g(this.gpsData, placeBetRequest.gpsData);
    }

    public final Double getAutoCashoutAt() {
        return this.autoCashoutAt;
    }

    public final String getBetAmount() {
        return this.betAmount;
    }

    public final String getCurrency() {
        return this.currency;
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

    public final String getRocketType() {
        return this.rocketType;
    }

    public final long getRoundId() {
        return this.roundId;
    }

    public int hashCode() {
        int iA = f87.a(gmf0.a(gmf0.a(this.betAmount.hashCode() * 31, 31, this.rocketType), 31, this.currency), this.roundId, 31);
        String str = this.giftId;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        Double d = this.giftAmount;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.autoCashoutAt;
        int iA2 = mtg0.a((iHashCode2 + (d2 == null ? 0 : d2.hashCode())) * 31, 31, this.isCampaignUser);
        GPSData gPSData = this.gpsData;
        return iA2 + (gPSData != null ? gPSData.hashCode() : 0);
    }

    public final boolean isCampaignUser() {
        return this.isCampaignUser;
    }

    public final void setGiftAmount(Double d) {
        this.giftAmount = d;
    }

    public final void setGiftId(String str) {
        this.giftId = str;
    }

    public String toString() {
        String str = this.betAmount;
        String str2 = this.rocketType;
        String str3 = this.currency;
        long j = this.roundId;
        String str4 = this.giftId;
        Double d = this.giftAmount;
        Double d2 = this.autoCashoutAt;
        boolean z = this.isCampaignUser;
        GPSData gPSData = this.gpsData;
        StringBuilder sbA = ux5.a("PlaceBetRequest(betAmount=", str, ", rocketType=", str2, ", currency=");
        l.a(j, str3, ", roundId=", sbA);
        sbA.append(", giftId=");
        sbA.append(str4);
        sbA.append(", giftAmount=");
        sbA.append(d);
        sbA.append(", autoCashoutAt=");
        sbA.append(d2);
        sbA.append(", isCampaignUser=");
        sbA.append(z);
        sbA.append(", gpsData=");
        sbA.append(gPSData);
        sbA.append(")");
        return sbA.toString();
    }

    public PlaceBetRequest(String str, String str2, String str3, long j, String str4, Double d, Double d2, boolean z, GPSData gPSData) {
        m.a(str, str2, str3);
        this.betAmount = str;
        this.rocketType = str2;
        this.currency = str3;
        this.roundId = j;
        this.giftId = str4;
        this.giftAmount = d;
        this.autoCashoutAt = d2;
        this.isCampaignUser = z;
        this.gpsData = gPSData;
    }
}
