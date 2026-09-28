package com.sportygames.pingpong.remote.models;

import com.appsflyer.internal.m;
import defpackage.f78;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.mq0;
import defpackage.s27;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b#\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0006HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010(\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u0010)\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001cJ\t\u0010*\u001a\u00020\u000eHÆ\u0003Jn\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001¢\u0006\u0002\u0010,J\u0013\u0010-\u001a\u00020\u000e2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u00020\u0006HÖ\u0001J\t\u00100\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0012\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0015\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b \u0010\u001cR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010!¨\u00061"}, d2 = {"Lcom/sportygames/pingpong/remote/models/PlaceOverUnderBetRequest;", "", "betAmount", "", "betType", "betIndex", "", "currency", "roundId", "giftId", "giftAmount", "", "targetCoefficient", "isCampaignUser", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Z)V", "getBetAmount", "()Ljava/lang/String;", "getBetType", "getBetIndex", "()I", "getCurrency", "getRoundId", "getGiftId", "setGiftId", "(Ljava/lang/String;)V", "getGiftAmount", "()Ljava/lang/Double;", "setGiftAmount", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getTargetCoefficient", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Z)Lcom/sportygames/pingpong/remote/models/PlaceOverUnderBetRequest;", "equals", "other", "hashCode", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PlaceOverUnderBetRequest {
    public static final int $stable = 8;
    private final String betAmount;
    private final int betIndex;
    private final String betType;
    private final String currency;
    private Double giftAmount;
    private String giftId;
    private final boolean isCampaignUser;
    private final int roundId;
    private final Double targetCoefficient;

    public /* synthetic */ PlaceOverUnderBetRequest(String str, String str2, int i, String str3, int i2, String str4, Double d, Double d2, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i, str3, i2, str4, d, d2, (i3 & 256) != 0 ? false : z);
    }

    public static /* synthetic */ PlaceOverUnderBetRequest copy$default(PlaceOverUnderBetRequest placeOverUnderBetRequest, String str, String str2, int i, String str3, int i2, String str4, Double d, Double d2, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = placeOverUnderBetRequest.betAmount;
        }
        if ((i3 & 2) != 0) {
            str2 = placeOverUnderBetRequest.betType;
        }
        if ((i3 & 4) != 0) {
            i = placeOverUnderBetRequest.betIndex;
        }
        if ((i3 & 8) != 0) {
            str3 = placeOverUnderBetRequest.currency;
        }
        if ((i3 & 16) != 0) {
            i2 = placeOverUnderBetRequest.roundId;
        }
        if ((i3 & 32) != 0) {
            str4 = placeOverUnderBetRequest.giftId;
        }
        if ((i3 & 64) != 0) {
            d = placeOverUnderBetRequest.giftAmount;
        }
        if ((i3 & 128) != 0) {
            d2 = placeOverUnderBetRequest.targetCoefficient;
        }
        if ((i3 & 256) != 0) {
            z = placeOverUnderBetRequest.isCampaignUser;
        }
        Double d3 = d2;
        boolean z2 = z;
        String str5 = str4;
        Double d4 = d;
        int i4 = i2;
        int i5 = i;
        return placeOverUnderBetRequest.copy(str, str2, i5, str3, i4, str5, d4, d3, z2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBetAmount() {
        return this.betAmount;
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
    public final int getRoundId() {
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

    public final PlaceOverUnderBetRequest copy(String betAmount, String betType, int betIndex, String currency, int roundId, String giftId, Double giftAmount, Double targetCoefficient, boolean isCampaignUser) {
        betAmount.getClass();
        betType.getClass();
        currency.getClass();
        return new PlaceOverUnderBetRequest(betAmount, betType, betIndex, currency, roundId, giftId, giftAmount, targetCoefficient, isCampaignUser);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlaceOverUnderBetRequest)) {
            return false;
        }
        PlaceOverUnderBetRequest placeOverUnderBetRequest = (PlaceOverUnderBetRequest) other;
        return Intrinsics.g(this.betAmount, placeOverUnderBetRequest.betAmount) && Intrinsics.g(this.betType, placeOverUnderBetRequest.betType) && this.betIndex == placeOverUnderBetRequest.betIndex && Intrinsics.g(this.currency, placeOverUnderBetRequest.currency) && this.roundId == placeOverUnderBetRequest.roundId && Intrinsics.g(this.giftId, placeOverUnderBetRequest.giftId) && Intrinsics.g(this.giftAmount, placeOverUnderBetRequest.giftAmount) && Intrinsics.g(this.targetCoefficient, placeOverUnderBetRequest.targetCoefficient) && this.isCampaignUser == placeOverUnderBetRequest.isCampaignUser;
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

    public final int getRoundId() {
        return this.roundId;
    }

    public final Double getTargetCoefficient() {
        return this.targetCoefficient;
    }

    public int hashCode() {
        int iA = gpp.a(this.roundId, gmf0.a(gpp.a(this.betIndex, gmf0.a(this.betAmount.hashCode() * 31, 31, this.betType), 31), 31, this.currency), 31);
        String str = this.giftId;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        Double d = this.giftAmount;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.targetCoefficient;
        return Boolean.hashCode(this.isCampaignUser) + ((iHashCode2 + (d2 != null ? d2.hashCode() : 0)) * 31);
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
        int i2 = this.roundId;
        String str4 = this.giftId;
        Double d = this.giftAmount;
        Double d2 = this.targetCoefficient;
        boolean z = this.isCampaignUser;
        StringBuilder sbA = ux5.a("PlaceOverUnderBetRequest(betAmount=", str, ", betType=", str2, ", betIndex=");
        f78.b(i, ", currency=", str3, ", roundId=", sbA);
        f78.b(i2, ", giftId=", str4, ", giftAmount=", sbA);
        s27.a(d, d2, ", targetCoefficient=", ", isCampaignUser=", sbA);
        return mq0.a(sbA, z, ")");
    }

    public PlaceOverUnderBetRequest(String str, String str2, int i, String str3, int i2, String str4, Double d, Double d2, boolean z) {
        m.a(str, str2, str3);
        this.betAmount = str;
        this.betType = str2;
        this.betIndex = i;
        this.currency = str3;
        this.roundId = i2;
        this.giftId = str4;
        this.giftAmount = d;
        this.targetCoefficient = d2;
        this.isCampaignUser = z;
    }
}
