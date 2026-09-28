package com.sportygames.spindabottle.remote.models;

import com.sportygames.commons.models.GPSData;
import defpackage.gmf0;
import defpackage.hxa;
import defpackage.mtg0;
import defpackage.nrg0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0016J\t\u0010\"\u001a\u00020\nHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\fHÆ\u0003JZ\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010%J\u0013\u0010&\u001a\u00020\n2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0018R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006+"}, d2 = {"Lcom/sportygames/spindabottle/remote/models/PlaceBetRequest;", "", "userPick", "", "stakeAmount", "", "currency", "giftId", "giftAmount", "isCampaignUser", "", "gpsData", "Lcom/sportygames/commons/models/GPSData;", "<init>", "(Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/Double;ZLcom/sportygames/commons/models/GPSData;)V", "getUserPick", "()Ljava/lang/String;", "getStakeAmount", "()D", "getCurrency", "getGiftId", "getGiftAmount", "()Ljava/lang/Double;", "Ljava/lang/Double;", "()Z", "getGpsData", "()Lcom/sportygames/commons/models/GPSData;", "setGpsData", "(Lcom/sportygames/commons/models/GPSData;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/Double;ZLcom/sportygames/commons/models/GPSData;)Lcom/sportygames/spindabottle/remote/models/PlaceBetRequest;", "equals", "other", "hashCode", "", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PlaceBetRequest {
    public static final int $stable = 8;
    private final String currency;
    private final Double giftAmount;
    private final String giftId;
    private GPSData gpsData;
    private final boolean isCampaignUser;
    private final double stakeAmount;
    private final String userPick;

    public /* synthetic */ PlaceBetRequest(String str, double d, String str2, String str3, Double d2, boolean z, GPSData gPSData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, d, str2, str3, d2, (i & 32) != 0 ? false : z, (i & 64) != 0 ? null : gPSData);
    }

    public static /* synthetic */ PlaceBetRequest copy$default(PlaceBetRequest placeBetRequest, String str, double d, String str2, String str3, Double d2, boolean z, GPSData gPSData, int i, Object obj) {
        if ((i & 1) != 0) {
            str = placeBetRequest.userPick;
        }
        if ((i & 2) != 0) {
            d = placeBetRequest.stakeAmount;
        }
        if ((i & 4) != 0) {
            str2 = placeBetRequest.currency;
        }
        if ((i & 8) != 0) {
            str3 = placeBetRequest.giftId;
        }
        if ((i & 16) != 0) {
            d2 = placeBetRequest.giftAmount;
        }
        if ((i & 32) != 0) {
            z = placeBetRequest.isCampaignUser;
        }
        if ((i & 64) != 0) {
            gPSData = placeBetRequest.gpsData;
        }
        GPSData gPSData2 = gPSData;
        Double d3 = d2;
        String str4 = str2;
        return placeBetRequest.copy(str, d, str4, str3, d3, z, gPSData2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserPick() {
        return this.userPick;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getStakeAmount() {
        return this.stakeAmount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCurrency() {
        return this.currency;
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

    public final PlaceBetRequest copy(String userPick, double stakeAmount, String currency, String giftId, Double giftAmount, boolean isCampaignUser, GPSData gpsData) {
        userPick.getClass();
        currency.getClass();
        return new PlaceBetRequest(userPick, stakeAmount, currency, giftId, giftAmount, isCampaignUser, gpsData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlaceBetRequest)) {
            return false;
        }
        PlaceBetRequest placeBetRequest = (PlaceBetRequest) other;
        return Intrinsics.g(this.userPick, placeBetRequest.userPick) && Double.compare(this.stakeAmount, placeBetRequest.stakeAmount) == 0 && Intrinsics.g(this.currency, placeBetRequest.currency) && Intrinsics.g(this.giftId, placeBetRequest.giftId) && Intrinsics.g(this.giftAmount, placeBetRequest.giftAmount) && this.isCampaignUser == placeBetRequest.isCampaignUser && Intrinsics.g(this.gpsData, placeBetRequest.gpsData);
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

    public final double getStakeAmount() {
        return this.stakeAmount;
    }

    public final String getUserPick() {
        return this.userPick;
    }

    public int hashCode() {
        int iA = gmf0.a(nrg0.a(this.userPick.hashCode() * 31, 31, this.stakeAmount), 31, this.currency);
        String str = this.giftId;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        Double d = this.giftAmount;
        int iA2 = mtg0.a((iHashCode + (d == null ? 0 : d.hashCode())) * 31, 31, this.isCampaignUser);
        GPSData gPSData = this.gpsData;
        return iA2 + (gPSData != null ? gPSData.hashCode() : 0);
    }

    public final boolean isCampaignUser() {
        return this.isCampaignUser;
    }

    public final void setGpsData(GPSData gPSData) {
        this.gpsData = gPSData;
    }

    public String toString() {
        String str = this.userPick;
        double d = this.stakeAmount;
        String str2 = this.currency;
        String str3 = this.giftId;
        Double d2 = this.giftAmount;
        boolean z = this.isCampaignUser;
        GPSData gPSData = this.gpsData;
        StringBuilder sb = new StringBuilder("PlaceBetRequest(userPick=");
        sb.append(str);
        sb.append(", stakeAmount=");
        sb.append(d);
        hxa.c(sb, ", currency=", str2, ", giftId=", str3);
        sb.append(", giftAmount=");
        sb.append(d2);
        sb.append(", isCampaignUser=");
        sb.append(z);
        sb.append(", gpsData=");
        sb.append(gPSData);
        sb.append(")");
        return sb.toString();
    }

    public PlaceBetRequest(String str, double d, String str2, String str3, Double d2, boolean z, GPSData gPSData) {
        str.getClass();
        str2.getClass();
        this.userPick = str;
        this.stakeAmount = d;
        this.currency = str2;
        this.giftId = str3;
        this.giftAmount = d2;
        this.isCampaignUser = z;
        this.gpsData = gPSData;
    }
}
