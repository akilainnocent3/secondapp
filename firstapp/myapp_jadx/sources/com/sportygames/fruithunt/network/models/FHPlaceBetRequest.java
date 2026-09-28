package com.sportygames.fruithunt.network.models;

import com.sportygames.commons.models.GPSData;
import defpackage.mtg0;
import defpackage.ry4;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0016J\t\u0010\"\u001a\u00020\u000bHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\rHÆ\u0003J`\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010%J\u0013\u0010&\u001a\u00020\u000b2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u001aR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006+"}, d2 = {"Lcom/sportygames/fruithunt/network/models/FHPlaceBetRequest;", "", "currency", "", "fruitGeneratedId", "", "stakeAmount", "", "giftId", "giftAmount", "isCampaignUser", "", "gpsData", "Lcom/sportygames/commons/models/GPSData;", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;ZLcom/sportygames/commons/models/GPSData;)V", "getCurrency", "()Ljava/lang/String;", "getFruitGeneratedId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getStakeAmount", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getGiftId", "getGiftAmount", "()Z", "getGpsData", "()Lcom/sportygames/commons/models/GPSData;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;ZLcom/sportygames/commons/models/GPSData;)Lcom/sportygames/fruithunt/network/models/FHPlaceBetRequest;", "equals", "other", "hashCode", "", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FHPlaceBetRequest {
    public static final int $stable = 8;
    private final String currency;
    private final Long fruitGeneratedId;
    private final Double giftAmount;
    private final String giftId;
    private final GPSData gpsData;
    private final boolean isCampaignUser;
    private final Double stakeAmount;

    public /* synthetic */ FHPlaceBetRequest(String str, Long l, Double d, String str2, Double d2, boolean z, GPSData gPSData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, l, d, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : d2, (i & 32) != 0 ? false : z, (i & 64) != 0 ? null : gPSData);
    }

    public static /* synthetic */ FHPlaceBetRequest copy$default(FHPlaceBetRequest fHPlaceBetRequest, String str, Long l, Double d, String str2, Double d2, boolean z, GPSData gPSData, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fHPlaceBetRequest.currency;
        }
        if ((i & 2) != 0) {
            l = fHPlaceBetRequest.fruitGeneratedId;
        }
        if ((i & 4) != 0) {
            d = fHPlaceBetRequest.stakeAmount;
        }
        if ((i & 8) != 0) {
            str2 = fHPlaceBetRequest.giftId;
        }
        if ((i & 16) != 0) {
            d2 = fHPlaceBetRequest.giftAmount;
        }
        if ((i & 32) != 0) {
            z = fHPlaceBetRequest.isCampaignUser;
        }
        if ((i & 64) != 0) {
            gPSData = fHPlaceBetRequest.gpsData;
        }
        boolean z2 = z;
        GPSData gPSData2 = gPSData;
        Double d3 = d2;
        Double d4 = d;
        return fHPlaceBetRequest.copy(str, l, d4, str2, d3, z2, gPSData2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getFruitGeneratedId() {
        return this.fruitGeneratedId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Double getStakeAmount() {
        return this.stakeAmount;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getGiftId() {
        return this.giftId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Double getGiftAmount() {
        return this.giftAmount;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsCampaignUser() {
        return this.isCampaignUser;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final GPSData getGpsData() {
        return this.gpsData;
    }

    public final FHPlaceBetRequest copy(String currency, Long fruitGeneratedId, Double stakeAmount, String giftId, Double giftAmount, boolean isCampaignUser, GPSData gpsData) {
        return new FHPlaceBetRequest(currency, fruitGeneratedId, stakeAmount, giftId, giftAmount, isCampaignUser, gpsData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FHPlaceBetRequest)) {
            return false;
        }
        FHPlaceBetRequest fHPlaceBetRequest = (FHPlaceBetRequest) other;
        return Intrinsics.g(this.currency, fHPlaceBetRequest.currency) && Intrinsics.g(this.fruitGeneratedId, fHPlaceBetRequest.fruitGeneratedId) && Intrinsics.g(this.stakeAmount, fHPlaceBetRequest.stakeAmount) && Intrinsics.g(this.giftId, fHPlaceBetRequest.giftId) && Intrinsics.g(this.giftAmount, fHPlaceBetRequest.giftAmount) && this.isCampaignUser == fHPlaceBetRequest.isCampaignUser && Intrinsics.g(this.gpsData, fHPlaceBetRequest.gpsData);
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final Long getFruitGeneratedId() {
        return this.fruitGeneratedId;
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

    public final Double getStakeAmount() {
        return this.stakeAmount;
    }

    public int hashCode() {
        String str = this.currency;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.fruitGeneratedId;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Double d = this.stakeAmount;
        int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        String str2 = this.giftId;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d2 = this.giftAmount;
        int iA = mtg0.a((iHashCode4 + (d2 == null ? 0 : d2.hashCode())) * 31, 31, this.isCampaignUser);
        GPSData gPSData = this.gpsData;
        return iA + (gPSData != null ? gPSData.hashCode() : 0);
    }

    public final boolean isCampaignUser() {
        return this.isCampaignUser;
    }

    public String toString() {
        String str = this.currency;
        Long l = this.fruitGeneratedId;
        Double d = this.stakeAmount;
        String str2 = this.giftId;
        Double d2 = this.giftAmount;
        boolean z = this.isCampaignUser;
        GPSData gPSData = this.gpsData;
        StringBuilder sb = new StringBuilder("FHPlaceBetRequest(currency=");
        sb.append(str);
        sb.append(", fruitGeneratedId=");
        sb.append(l);
        sb.append(", stakeAmount=");
        ry4.a(d, ", giftId=", str2, ", giftAmount=", sb);
        sb.append(d2);
        sb.append(", isCampaignUser=");
        sb.append(z);
        sb.append(", gpsData=");
        sb.append(gPSData);
        sb.append(")");
        return sb.toString();
    }

    public FHPlaceBetRequest(String str, Long l, Double d, String str2, Double d2, boolean z, GPSData gPSData) {
        this.currency = str;
        this.fruitGeneratedId = l;
        this.stakeAmount = d;
        this.giftId = str2;
        this.giftAmount = d2;
        this.isCampaignUser = z;
        this.gpsData = gPSData;
    }
}
