package com.sportygames.pingpong.remote.models;

import com.appsflyer.internal.w;
import defpackage.em5;
import defpackage.f78;
import defpackage.f87;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.lsv;
import defpackage.ml5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b$\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\tHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0010\u0010+\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u001eJ\t\u0010,\u001a\u00020\u000fHÆ\u0003Jn\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001¢\u0006\u0002\u0010.J\u0013\u0010/\u001a\u00020\u000f2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u00020\u0005HÖ\u0001J\t\u00102\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010!\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0015\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\"\u0010\u001eR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010#¨\u00063"}, d2 = {"Lcom/sportygames/pingpong/remote/models/PlaceBetRequest;", "", "betAmount", "", "betCategoryType", "", "betIndex", "currency", "roundId", "", "giftId", "giftAmount", "", "autoCashoutAt", "isCampaignUser", "", "<init>", "(Ljava/lang/String;IILjava/lang/String;JLjava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Z)V", "getBetAmount", "()Ljava/lang/String;", "getBetCategoryType", "()I", "getBetIndex", "getCurrency", "getRoundId", "()J", "getGiftId", "setGiftId", "(Ljava/lang/String;)V", "getGiftAmount", "()Ljava/lang/Double;", "setGiftAmount", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getAutoCashoutAt", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;IILjava/lang/String;JLjava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Z)Lcom/sportygames/pingpong/remote/models/PlaceBetRequest;", "equals", "other", "hashCode", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PlaceBetRequest {
    public static final int $stable = 8;
    private final Double autoCashoutAt;
    private final String betAmount;
    private final int betCategoryType;
    private final int betIndex;
    private final String currency;
    private Double giftAmount;
    private String giftId;
    private final boolean isCampaignUser;
    private final long roundId;

    public /* synthetic */ PlaceBetRequest(String str, int i, int i2, String str2, long j, String str3, Double d, Double d2, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i2, str2, j, str3, d, d2, (i3 & 256) != 0 ? false : z);
    }

    public static /* synthetic */ PlaceBetRequest copy$default(PlaceBetRequest placeBetRequest, String str, int i, int i2, String str2, long j, String str3, Double d, Double d2, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = placeBetRequest.betAmount;
        }
        if ((i3 & 2) != 0) {
            i = placeBetRequest.betCategoryType;
        }
        if ((i3 & 4) != 0) {
            i2 = placeBetRequest.betIndex;
        }
        if ((i3 & 8) != 0) {
            str2 = placeBetRequest.currency;
        }
        if ((i3 & 16) != 0) {
            j = placeBetRequest.roundId;
        }
        if ((i3 & 32) != 0) {
            str3 = placeBetRequest.giftId;
        }
        if ((i3 & 64) != 0) {
            d = placeBetRequest.giftAmount;
        }
        if ((i3 & 128) != 0) {
            d2 = placeBetRequest.autoCashoutAt;
        }
        if ((i3 & 256) != 0) {
            z = placeBetRequest.isCampaignUser;
        }
        long j2 = j;
        int i4 = i2;
        String str4 = str2;
        return placeBetRequest.copy(str, i, i4, str4, j2, str3, d, d2, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBetAmount() {
        return this.betAmount;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getBetCategoryType() {
        return this.betCategoryType;
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

    public final PlaceBetRequest copy(String betAmount, int betCategoryType, int betIndex, String currency, long roundId, String giftId, Double giftAmount, Double autoCashoutAt, boolean isCampaignUser) {
        betAmount.getClass();
        currency.getClass();
        return new PlaceBetRequest(betAmount, betCategoryType, betIndex, currency, roundId, giftId, giftAmount, autoCashoutAt, isCampaignUser);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlaceBetRequest)) {
            return false;
        }
        PlaceBetRequest placeBetRequest = (PlaceBetRequest) other;
        return Intrinsics.g(this.betAmount, placeBetRequest.betAmount) && this.betCategoryType == placeBetRequest.betCategoryType && this.betIndex == placeBetRequest.betIndex && Intrinsics.g(this.currency, placeBetRequest.currency) && this.roundId == placeBetRequest.roundId && Intrinsics.g(this.giftId, placeBetRequest.giftId) && Intrinsics.g(this.giftAmount, placeBetRequest.giftAmount) && Intrinsics.g(this.autoCashoutAt, placeBetRequest.autoCashoutAt) && this.isCampaignUser == placeBetRequest.isCampaignUser;
    }

    public final Double getAutoCashoutAt() {
        return this.autoCashoutAt;
    }

    public final String getBetAmount() {
        return this.betAmount;
    }

    public final int getBetCategoryType() {
        return this.betCategoryType;
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

    public final long getRoundId() {
        return this.roundId;
    }

    public int hashCode() {
        int iA = f87.a(gmf0.a(gpp.a(this.betIndex, gpp.a(this.betCategoryType, this.betAmount.hashCode() * 31, 31), 31), 31, this.currency), this.roundId, 31);
        String str = this.giftId;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        Double d = this.giftAmount;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.autoCashoutAt;
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
        int i = this.betCategoryType;
        int i2 = this.betIndex;
        String str2 = this.currency;
        long j = this.roundId;
        String str3 = this.giftId;
        Double d = this.giftAmount;
        Double d2 = this.autoCashoutAt;
        boolean z = this.isCampaignUser;
        StringBuilder sbA = ml5.a(i, "PlaceBetRequest(betAmount=", str, ", betCategoryType=", ", betIndex=");
        f78.b(i2, ", currency=", str2, ", roundId=", sbA);
        em5.a(j, ", giftId=", str3, sbA);
        lsv.a(d, d2, ", giftAmount=", ", autoCashoutAt=", sbA);
        return w.a(sbA, ", isCampaignUser=", z, ")");
    }

    public PlaceBetRequest(String str, int i, int i2, String str2, long j, String str3, Double d, Double d2, boolean z) {
        str.getClass();
        str2.getClass();
        this.betAmount = str;
        this.betCategoryType = i;
        this.betIndex = i2;
        this.currency = str2;
        this.roundId = j;
        this.giftId = str3;
        this.giftAmount = d;
        this.autoCashoutAt = d2;
        this.isCampaignUser = z;
    }
}
