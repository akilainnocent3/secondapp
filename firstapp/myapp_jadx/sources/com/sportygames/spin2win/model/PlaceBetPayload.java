package com.sportygames.spin2win.model;

import com.appsflyer.internal.x;
import com.sportygames.commons.models.GPSData;
import defpackage.ai50;
import defpackage.f87;
import defpackage.m2g;
import defpackage.mtg0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0018J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\t\u0010&\u001a\u00020\rHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000fHÆ\u0003J`\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u0010)J\u0013\u0010*\u001a\u00020\r2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u001cR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006/"}, d2 = {"Lcom/sportygames/spin2win/model/PlaceBetPayload;", "", "currency", "", "roundId", "", "giftId", "giftAmount", "", "individualBetRequestList", "", "Lcom/sportygames/spin2win/model/IndividualBetRequest;", "isCampaignUser", "", "gpsData", "Lcom/sportygames/commons/models/GPSData;", "<init>", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/Double;Ljava/util/List;ZLcom/sportygames/commons/models/GPSData;)V", "getCurrency", "()Ljava/lang/String;", "getRoundId", "()J", "getGiftId", "getGiftAmount", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getIndividualBetRequestList", "()Ljava/util/List;", "()Z", "getGpsData", "()Lcom/sportygames/commons/models/GPSData;", "setGpsData", "(Lcom/sportygames/commons/models/GPSData;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/Double;Ljava/util/List;ZLcom/sportygames/commons/models/GPSData;)Lcom/sportygames/spin2win/model/PlaceBetPayload;", "equals", "other", "hashCode", "", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PlaceBetPayload {
    public static final int $stable = 8;
    private final String currency;
    private final Double giftAmount;
    private final String giftId;
    private GPSData gpsData;
    private final List<IndividualBetRequest> individualBetRequestList;
    private final boolean isCampaignUser;
    private final long roundId;

    public PlaceBetPayload(String str, long j, String str2, Double d, List list, boolean z, GPSData gPSData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, str2, d, (i & 16) != 0 ? m2g.a : list, (i & 32) != 0 ? false : z, (i & 64) != 0 ? null : gPSData);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PlaceBetPayload copy$default(PlaceBetPayload placeBetPayload, String str, long j, String str2, Double d, List list, boolean z, GPSData gPSData, int i, Object obj) {
        if ((i & 1) != 0) {
            str = placeBetPayload.currency;
        }
        if ((i & 2) != 0) {
            j = placeBetPayload.roundId;
        }
        if ((i & 4) != 0) {
            str2 = placeBetPayload.giftId;
        }
        if ((i & 8) != 0) {
            d = placeBetPayload.giftAmount;
        }
        if ((i & 16) != 0) {
            list = placeBetPayload.individualBetRequestList;
        }
        if ((i & 32) != 0) {
            z = placeBetPayload.isCampaignUser;
        }
        if ((i & 64) != 0) {
            gPSData = placeBetPayload.gpsData;
        }
        GPSData gPSData2 = gPSData;
        List list2 = list;
        String str3 = str2;
        return placeBetPayload.copy(str, j, str3, d, list2, z, gPSData2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getRoundId() {
        return this.roundId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getGiftId() {
        return this.giftId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Double getGiftAmount() {
        return this.giftAmount;
    }

    public final List<IndividualBetRequest> component5() {
        return this.individualBetRequestList;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsCampaignUser() {
        return this.isCampaignUser;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final GPSData getGpsData() {
        return this.gpsData;
    }

    public final PlaceBetPayload copy(String currency, long roundId, String giftId, Double giftAmount, List<IndividualBetRequest> individualBetRequestList, boolean isCampaignUser, GPSData gpsData) {
        currency.getClass();
        individualBetRequestList.getClass();
        return new PlaceBetPayload(currency, roundId, giftId, giftAmount, individualBetRequestList, isCampaignUser, gpsData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlaceBetPayload)) {
            return false;
        }
        PlaceBetPayload placeBetPayload = (PlaceBetPayload) other;
        return Intrinsics.g(this.currency, placeBetPayload.currency) && this.roundId == placeBetPayload.roundId && Intrinsics.g(this.giftId, placeBetPayload.giftId) && Intrinsics.g(this.giftAmount, placeBetPayload.giftAmount) && Intrinsics.g(this.individualBetRequestList, placeBetPayload.individualBetRequestList) && this.isCampaignUser == placeBetPayload.isCampaignUser && Intrinsics.g(this.gpsData, placeBetPayload.gpsData);
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

    public final List<IndividualBetRequest> getIndividualBetRequestList() {
        return this.individualBetRequestList;
    }

    public final long getRoundId() {
        return this.roundId;
    }

    public int hashCode() {
        int iA = f87.a(this.currency.hashCode() * 31, this.roundId, 31);
        String str = this.giftId;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        Double d = this.giftAmount;
        int iA2 = mtg0.a(ai50.a((iHashCode + (d == null ? 0 : d.hashCode())) * 31, 31, this.individualBetRequestList), 31, this.isCampaignUser);
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
        String str = this.currency;
        long j = this.roundId;
        String str2 = this.giftId;
        Double d = this.giftAmount;
        List<IndividualBetRequest> list = this.individualBetRequestList;
        boolean z = this.isCampaignUser;
        GPSData gPSData = this.gpsData;
        StringBuilder sbA = x.a(j, "PlaceBetPayload(currency=", str, ", roundId=");
        sbA.append(", giftId=");
        sbA.append(str2);
        sbA.append(", giftAmount=");
        sbA.append(d);
        sbA.append(", individualBetRequestList=");
        sbA.append(list);
        sbA.append(", isCampaignUser=");
        sbA.append(z);
        sbA.append(", gpsData=");
        sbA.append(gPSData);
        sbA.append(")");
        return sbA.toString();
    }

    public PlaceBetPayload(String str, long j, String str2, Double d, List<IndividualBetRequest> list, boolean z, GPSData gPSData) {
        str.getClass();
        list.getClass();
        this.currency = str;
        this.roundId = j;
        this.giftId = str2;
        this.giftAmount = d;
        this.individualBetRequestList = list;
        this.isCampaignUser = z;
        this.gpsData = gPSData;
    }
}
