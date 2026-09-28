package com.sportygames.rush.model.request;

import com.appsflyer.internal.m;
import com.sportygames.commons.models.GPSData;
import defpackage.gmf0;
import defpackage.hxa;
import defpackage.mtg0;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0015J\t\u0010\u001f\u001a\u00020\nHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\fHÆ\u0003JZ\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020\n2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006("}, d2 = {"Lcom/sportygames/rush/model/request/PlaceBetPayload;", "", "cashoutAt", "", "stakeAmount", "currency", "giftId", "giftAmount", "", "isCampaignUser", "", "gpsData", "Lcom/sportygames/commons/models/GPSData;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;ZLcom/sportygames/commons/models/GPSData;)V", "getCashoutAt", "()Ljava/lang/String;", "getStakeAmount", "getCurrency", "getGiftId", "getGiftAmount", "()Ljava/lang/Double;", "Ljava/lang/Double;", "()Z", "getGpsData", "()Lcom/sportygames/commons/models/GPSData;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;ZLcom/sportygames/commons/models/GPSData;)Lcom/sportygames/rush/model/request/PlaceBetPayload;", "equals", "other", "hashCode", "", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PlaceBetPayload {
    public static final int $stable = 8;
    private final String cashoutAt;
    private final String currency;
    private final Double giftAmount;
    private final String giftId;
    private final GPSData gpsData;
    private final boolean isCampaignUser;
    private final String stakeAmount;

    public /* synthetic */ PlaceBetPayload(String str, String str2, String str3, String str4, Double d, boolean z, GPSData gPSData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, d, (i & 32) != 0 ? false : z, (i & 64) != 0 ? null : gPSData);
    }

    public static /* synthetic */ PlaceBetPayload copy$default(PlaceBetPayload placeBetPayload, String str, String str2, String str3, String str4, Double d, boolean z, GPSData gPSData, int i, Object obj) {
        if ((i & 1) != 0) {
            str = placeBetPayload.cashoutAt;
        }
        if ((i & 2) != 0) {
            str2 = placeBetPayload.stakeAmount;
        }
        if ((i & 4) != 0) {
            str3 = placeBetPayload.currency;
        }
        if ((i & 8) != 0) {
            str4 = placeBetPayload.giftId;
        }
        if ((i & 16) != 0) {
            d = placeBetPayload.giftAmount;
        }
        if ((i & 32) != 0) {
            z = placeBetPayload.isCampaignUser;
        }
        if ((i & 64) != 0) {
            gPSData = placeBetPayload.gpsData;
        }
        boolean z2 = z;
        GPSData gPSData2 = gPSData;
        Double d2 = d;
        String str5 = str3;
        return placeBetPayload.copy(str, str2, str5, str4, d2, z2, gPSData2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCashoutAt() {
        return this.cashoutAt;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStakeAmount() {
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

    public final PlaceBetPayload copy(String cashoutAt, String stakeAmount, String currency, String giftId, Double giftAmount, boolean isCampaignUser, GPSData gpsData) {
        cashoutAt.getClass();
        stakeAmount.getClass();
        currency.getClass();
        return new PlaceBetPayload(cashoutAt, stakeAmount, currency, giftId, giftAmount, isCampaignUser, gpsData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlaceBetPayload)) {
            return false;
        }
        PlaceBetPayload placeBetPayload = (PlaceBetPayload) other;
        return Intrinsics.g(this.cashoutAt, placeBetPayload.cashoutAt) && Intrinsics.g(this.stakeAmount, placeBetPayload.stakeAmount) && Intrinsics.g(this.currency, placeBetPayload.currency) && Intrinsics.g(this.giftId, placeBetPayload.giftId) && Intrinsics.g(this.giftAmount, placeBetPayload.giftAmount) && this.isCampaignUser == placeBetPayload.isCampaignUser && Intrinsics.g(this.gpsData, placeBetPayload.gpsData);
    }

    public final String getCashoutAt() {
        return this.cashoutAt;
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

    public final String getStakeAmount() {
        return this.stakeAmount;
    }

    public int hashCode() {
        int iA = gmf0.a(gmf0.a(this.cashoutAt.hashCode() * 31, 31, this.stakeAmount), 31, this.currency);
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

    public String toString() {
        String str = this.cashoutAt;
        String str2 = this.stakeAmount;
        String str3 = this.currency;
        String str4 = this.giftId;
        Double d = this.giftAmount;
        boolean z = this.isCampaignUser;
        GPSData gPSData = this.gpsData;
        StringBuilder sbA = ux5.a("PlaceBetPayload(cashoutAt=", str, ", stakeAmount=", str2, ", currency=");
        hxa.c(sbA, str3, ", giftId=", str4, ", giftAmount=");
        sbA.append(d);
        sbA.append(", isCampaignUser=");
        sbA.append(z);
        sbA.append(", gpsData=");
        sbA.append(gPSData);
        sbA.append(")");
        return sbA.toString();
    }

    public PlaceBetPayload(String str, String str2, String str3, String str4, Double d, boolean z, GPSData gPSData) {
        m.a(str, str2, str3);
        this.cashoutAt = str;
        this.stakeAmount = str2;
        this.currency = str3;
        this.giftId = str4;
        this.giftAmount = d;
        this.isCampaignUser = z;
        this.gpsData = gPSData;
    }
}
