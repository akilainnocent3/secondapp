package com.sportygames.crash.remote.models;

import com.appsflyer.internal.b0;
import com.sportygames.commons.models.GPSData;
import defpackage.f87;
import defpackage.g41;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.k800;
import defpackage.mtg0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b'\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0007HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010 J\u0010\u0010/\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010 J\t\u00100\u001a\u00020\u000fHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0011HÆ\u0003Jz\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0002\u00103J\u0013\u00104\u001a\u00020\u000f2\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u00020\u0007HÖ\u0001J\t\u00107\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u001eR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010#\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0015\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010#\u001a\u0004\b$\u0010 R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010%R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u00068"}, d2 = {"Lcom/sportygames/crash/remote/models/CancelBetRequest;", "", "betId", "", "betAmount", "", "betIndex", "", "currency", "roundId", "giftId", "giftAmount", "", "autoCashoutAt", "isCampaignUser", "", "gpsData", "Lcom/sportygames/commons/models/GPSData;", "<init>", "(JLjava/lang/String;ILjava/lang/String;JLjava/lang/String;Ljava/lang/Double;Ljava/lang/Double;ZLcom/sportygames/commons/models/GPSData;)V", "getBetId", "()J", "getBetAmount", "()Ljava/lang/String;", "getBetIndex", "()I", "getCurrency", "getRoundId", "getGiftId", "setGiftId", "(Ljava/lang/String;)V", "getGiftAmount", "()Ljava/lang/Double;", "setGiftAmount", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getAutoCashoutAt", "()Z", "getGpsData", "()Lcom/sportygames/commons/models/GPSData;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(JLjava/lang/String;ILjava/lang/String;JLjava/lang/String;Ljava/lang/Double;Ljava/lang/Double;ZLcom/sportygames/commons/models/GPSData;)Lcom/sportygames/crash/remote/models/CancelBetRequest;", "equals", "other", "hashCode", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CancelBetRequest {
    public static final int $stable = 8;
    private final Double autoCashoutAt;
    private final String betAmount;
    private final long betId;
    private final int betIndex;
    private final String currency;
    private Double giftAmount;
    private String giftId;
    private final GPSData gpsData;
    private final boolean isCampaignUser;
    private final long roundId;

    public /* synthetic */ CancelBetRequest(long j, String str, int i, String str2, long j2, String str3, Double d, Double d2, boolean z, GPSData gPSData, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, i, str2, j2, str3, d, d2, (i2 & 256) != 0 ? false : z, (i2 & 512) != 0 ? null : gPSData);
    }

    public static /* synthetic */ CancelBetRequest copy$default(CancelBetRequest cancelBetRequest, long j, String str, int i, String str2, long j2, String str3, Double d, Double d2, boolean z, GPSData gPSData, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = cancelBetRequest.betId;
        }
        return cancelBetRequest.copy(j, (i2 & 2) != 0 ? cancelBetRequest.betAmount : str, (i2 & 4) != 0 ? cancelBetRequest.betIndex : i, (i2 & 8) != 0 ? cancelBetRequest.currency : str2, (i2 & 16) != 0 ? cancelBetRequest.roundId : j2, (i2 & 32) != 0 ? cancelBetRequest.giftId : str3, (i2 & 64) != 0 ? cancelBetRequest.giftAmount : d, (i2 & 128) != 0 ? cancelBetRequest.autoCashoutAt : d2, (i2 & 256) != 0 ? cancelBetRequest.isCampaignUser : z, (i2 & 512) != 0 ? cancelBetRequest.gpsData : gPSData);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getBetId() {
        return this.betId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final GPSData getGpsData() {
        return this.gpsData;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBetAmount() {
        return this.betAmount;
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
    public final Double getAutoCashoutAt() {
        return this.autoCashoutAt;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getIsCampaignUser() {
        return this.isCampaignUser;
    }

    public final CancelBetRequest copy(long betId, String betAmount, int betIndex, String currency, long roundId, String giftId, Double giftAmount, Double autoCashoutAt, boolean isCampaignUser, GPSData gpsData) {
        betAmount.getClass();
        currency.getClass();
        return new CancelBetRequest(betId, betAmount, betIndex, currency, roundId, giftId, giftAmount, autoCashoutAt, isCampaignUser, gpsData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CancelBetRequest)) {
            return false;
        }
        CancelBetRequest cancelBetRequest = (CancelBetRequest) other;
        return this.betId == cancelBetRequest.betId && Intrinsics.g(this.betAmount, cancelBetRequest.betAmount) && this.betIndex == cancelBetRequest.betIndex && Intrinsics.g(this.currency, cancelBetRequest.currency) && this.roundId == cancelBetRequest.roundId && Intrinsics.g(this.giftId, cancelBetRequest.giftId) && Intrinsics.g(this.giftAmount, cancelBetRequest.giftAmount) && Intrinsics.g(this.autoCashoutAt, cancelBetRequest.autoCashoutAt) && this.isCampaignUser == cancelBetRequest.isCampaignUser && Intrinsics.g(this.gpsData, cancelBetRequest.gpsData);
    }

    public final Double getAutoCashoutAt() {
        return this.autoCashoutAt;
    }

    public final String getBetAmount() {
        return this.betAmount;
    }

    public final long getBetId() {
        return this.betId;
    }

    public final int getBetIndex() {
        return this.betIndex;
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

    public final long getRoundId() {
        return this.roundId;
    }

    public int hashCode() {
        int iA = f87.a(gmf0.a(gpp.a(this.betIndex, gmf0.a(Long.hashCode(this.betId) * 31, 31, this.betAmount), 31), 31, this.currency), this.roundId, 31);
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
        long j = this.betId;
        String str = this.betAmount;
        int i = this.betIndex;
        String str2 = this.currency;
        long j2 = this.roundId;
        String str3 = this.giftId;
        Double d = this.giftAmount;
        Double d2 = this.autoCashoutAt;
        boolean z = this.isCampaignUser;
        GPSData gPSData = this.gpsData;
        StringBuilder sbA = b0.a(j, "CancelBetRequest(betId=", ", betAmount=", str);
        sbA.append(", betIndex=");
        sbA.append(i);
        sbA.append(", currency=");
        sbA.append(str2);
        g41.a(j2, ", roundId=", ", giftId=", sbA);
        k800.a(d, str3, ", giftAmount=", ", autoCashoutAt=", sbA);
        sbA.append(d2);
        sbA.append(", isCampaignUser=");
        sbA.append(z);
        sbA.append(", gpsData=");
        sbA.append(gPSData);
        sbA.append(")");
        return sbA.toString();
    }

    public CancelBetRequest(long j, String str, int i, String str2, long j2, String str3, Double d, Double d2, boolean z, GPSData gPSData) {
        str.getClass();
        str2.getClass();
        this.betId = j;
        this.betAmount = str;
        this.betIndex = i;
        this.currency = str2;
        this.roundId = j2;
        this.giftId = str3;
        this.giftAmount = d;
        this.autoCashoutAt = d2;
        this.isCampaignUser = z;
        this.gpsData = gPSData;
    }
}
