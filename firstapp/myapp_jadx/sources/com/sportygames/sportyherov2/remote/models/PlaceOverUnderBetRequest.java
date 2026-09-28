package com.sportygames.sportyherov2.remote.models;

import com.appsflyer.internal.m;
import com.sportygames.commons.models.GPSData;
import defpackage.em5;
import defpackage.f78;
import defpackage.f87;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.lsv;
import defpackage.mtg0;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b,\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0006HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\tHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00102\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010!J\u0010\u00103\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010!J\t\u00104\u001a\u00020\u000fHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u0010\u00106\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010*J\u0086\u0001\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u00108J\u0013\u00109\u001a\u00020\u000f2\b\u0010:\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010;\u001a\u00020\u0006HÖ\u0001J\t\u0010<\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u001fR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0015\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010$\u001a\u0004\b%\u0010!R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010&R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010+\u001a\u0004\b)\u0010*¨\u0006="}, d2 = {"Lcom/sportygames/sportyherov2/remote/models/PlaceOverUnderBetRequest;", "", "betAmount", "", "betType", "betIndex", "", "currency", "roundId", "", "giftId", "giftAmount", "", "targetCoefficient", "isCampaignUser", "", "gpsData", "Lcom/sportygames/commons/models/GPSData;", "ouFlag", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;JLjava/lang/String;Ljava/lang/Double;Ljava/lang/Double;ZLcom/sportygames/commons/models/GPSData;Ljava/lang/Boolean;)V", "getBetAmount", "()Ljava/lang/String;", "getBetType", "getBetIndex", "()I", "getCurrency", "getRoundId", "()J", "getGiftId", "setGiftId", "(Ljava/lang/String;)V", "getGiftAmount", "()Ljava/lang/Double;", "setGiftAmount", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getTargetCoefficient", "()Z", "getGpsData", "()Lcom/sportygames/commons/models/GPSData;", "getOuFlag", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;JLjava/lang/String;Ljava/lang/Double;Ljava/lang/Double;ZLcom/sportygames/commons/models/GPSData;Ljava/lang/Boolean;)Lcom/sportygames/sportyherov2/remote/models/PlaceOverUnderBetRequest;", "equals", "other", "hashCode", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PlaceOverUnderBetRequest {
    public static final int $stable = 8;
    private final String betAmount;
    private final int betIndex;
    private final String betType;
    private final String currency;
    private Double giftAmount;
    private String giftId;
    private final GPSData gpsData;
    private final boolean isCampaignUser;
    private final Boolean ouFlag;
    private final long roundId;
    private final Double targetCoefficient;

    public /* synthetic */ PlaceOverUnderBetRequest(String str, String str2, int i, String str3, long j, String str4, Double d, Double d2, boolean z, GPSData gPSData, Boolean bool, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i, str3, j, str4, d, d2, (i2 & 256) != 0 ? false : z, (i2 & 512) != 0 ? null : gPSData, (i2 & 1024) != 0 ? null : bool);
    }

    public static /* synthetic */ PlaceOverUnderBetRequest copy$default(PlaceOverUnderBetRequest placeOverUnderBetRequest, String str, String str2, int i, String str3, long j, String str4, Double d, Double d2, boolean z, GPSData gPSData, Boolean bool, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = placeOverUnderBetRequest.betAmount;
        }
        if ((i2 & 2) != 0) {
            str2 = placeOverUnderBetRequest.betType;
        }
        if ((i2 & 4) != 0) {
            i = placeOverUnderBetRequest.betIndex;
        }
        if ((i2 & 8) != 0) {
            str3 = placeOverUnderBetRequest.currency;
        }
        if ((i2 & 16) != 0) {
            j = placeOverUnderBetRequest.roundId;
        }
        if ((i2 & 32) != 0) {
            str4 = placeOverUnderBetRequest.giftId;
        }
        if ((i2 & 64) != 0) {
            d = placeOverUnderBetRequest.giftAmount;
        }
        if ((i2 & 128) != 0) {
            d2 = placeOverUnderBetRequest.targetCoefficient;
        }
        if ((i2 & 256) != 0) {
            z = placeOverUnderBetRequest.isCampaignUser;
        }
        if ((i2 & 512) != 0) {
            gPSData = placeOverUnderBetRequest.gpsData;
        }
        if ((i2 & 1024) != 0) {
            bool = placeOverUnderBetRequest.ouFlag;
        }
        GPSData gPSData2 = gPSData;
        Boolean bool2 = bool;
        long j2 = j;
        int i3 = i;
        String str5 = str3;
        return placeOverUnderBetRequest.copy(str, str2, i3, str5, j2, str4, d, d2, z, gPSData2, bool2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBetAmount() {
        return this.betAmount;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final GPSData getGpsData() {
        return this.gpsData;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Boolean getOuFlag() {
        return this.ouFlag;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBetType() {
        return this.betType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getBetIndex() {
        return this.betIndex;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getRoundId() {
        return this.roundId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getGiftId() {
        return this.giftId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Double getGiftAmount() {
        return this.giftAmount;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Double getTargetCoefficient() {
        return this.targetCoefficient;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getIsCampaignUser() {
        return this.isCampaignUser;
    }

    public final PlaceOverUnderBetRequest copy(String betAmount, String betType, int betIndex, String currency, long roundId, String giftId, Double giftAmount, Double targetCoefficient, boolean isCampaignUser, GPSData gpsData, Boolean ouFlag) {
        betAmount.getClass();
        betType.getClass();
        currency.getClass();
        return new PlaceOverUnderBetRequest(betAmount, betType, betIndex, currency, roundId, giftId, giftAmount, targetCoefficient, isCampaignUser, gpsData, ouFlag);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlaceOverUnderBetRequest)) {
            return false;
        }
        PlaceOverUnderBetRequest placeOverUnderBetRequest = (PlaceOverUnderBetRequest) other;
        return Intrinsics.g(this.betAmount, placeOverUnderBetRequest.betAmount) && Intrinsics.g(this.betType, placeOverUnderBetRequest.betType) && this.betIndex == placeOverUnderBetRequest.betIndex && Intrinsics.g(this.currency, placeOverUnderBetRequest.currency) && this.roundId == placeOverUnderBetRequest.roundId && Intrinsics.g(this.giftId, placeOverUnderBetRequest.giftId) && Intrinsics.g(this.giftAmount, placeOverUnderBetRequest.giftAmount) && Intrinsics.g(this.targetCoefficient, placeOverUnderBetRequest.targetCoefficient) && this.isCampaignUser == placeOverUnderBetRequest.isCampaignUser && Intrinsics.g(this.gpsData, placeOverUnderBetRequest.gpsData) && Intrinsics.g(this.ouFlag, placeOverUnderBetRequest.ouFlag);
    }

    public final String getBetAmount() {
        return this.betAmount;
    }

    public final int getBetIndex() {
        return this.betIndex;
    }

    public final String getBetType() {
        return this.betType;
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

    public final Boolean getOuFlag() {
        return this.ouFlag;
    }

    public final long getRoundId() {
        return this.roundId;
    }

    public final Double getTargetCoefficient() {
        return this.targetCoefficient;
    }

    public int hashCode() {
        int iA = f87.a(gmf0.a(gpp.a(this.betIndex, gmf0.a(this.betAmount.hashCode() * 31, 31, this.betType), 31), 31, this.currency), this.roundId, 31);
        String str = this.giftId;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        Double d = this.giftAmount;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.targetCoefficient;
        int iA2 = mtg0.a((iHashCode2 + (d2 == null ? 0 : d2.hashCode())) * 31, 31, this.isCampaignUser);
        GPSData gPSData = this.gpsData;
        int iHashCode3 = (iA2 + (gPSData == null ? 0 : gPSData.hashCode())) * 31;
        Boolean bool = this.ouFlag;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
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
        String str2 = this.betType;
        int i = this.betIndex;
        String str3 = this.currency;
        long j = this.roundId;
        String str4 = this.giftId;
        Double d = this.giftAmount;
        Double d2 = this.targetCoefficient;
        boolean z = this.isCampaignUser;
        GPSData gPSData = this.gpsData;
        Boolean bool = this.ouFlag;
        StringBuilder sbA = ux5.a("PlaceOverUnderBetRequest(betAmount=", str, ", betType=", str2, ", betIndex=");
        f78.b(i, ", currency=", str3, ", roundId=", sbA);
        em5.a(j, ", giftId=", str4, sbA);
        lsv.a(d, d2, ", giftAmount=", ", targetCoefficient=", sbA);
        sbA.append(", isCampaignUser=");
        sbA.append(z);
        sbA.append(", gpsData=");
        sbA.append(gPSData);
        sbA.append(", ouFlag=");
        sbA.append(bool);
        sbA.append(")");
        return sbA.toString();
    }

    public PlaceOverUnderBetRequest(String str, String str2, int i, String str3, long j, String str4, Double d, Double d2, boolean z, GPSData gPSData, Boolean bool) {
        m.a(str, str2, str3);
        this.betAmount = str;
        this.betType = str2;
        this.betIndex = i;
        this.currency = str3;
        this.roundId = j;
        this.giftId = str4;
        this.giftAmount = d;
        this.targetCoefficient = d2;
        this.isCampaignUser = z;
        this.gpsData = gPSData;
        this.ouFlag = bool;
    }
}
