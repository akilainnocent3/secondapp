package com.sportygames.crash.remote.models;

import com.sportygames.commons.models.GPSData;
import defpackage.em5;
import defpackage.f78;
import defpackage.f87;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.lsv;
import defpackage.ml5;
import defpackage.mtg0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b0\b\u0087\b\u0018\u0000 @2\u00020\u0001:\u0001@B}\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0005HÆ\u0003J\t\u00100\u001a\u00020\u0005HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\tHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00104\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\"J\u0010\u00105\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\"J\t\u00106\u001a\u00020\u000fHÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010+J\u0010\u00109\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010+J\u0092\u0001\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000fHÂ\u0001¢\u0006\u0002\u0010;J\u0013\u0010<\u001a\u00020\u000f2\b\u0010=\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010>\u001a\u00020\u0005HÖ\u0001J\t\u0010?\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0017\"\u0004\b\u001f\u0010 R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0015\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010%\u001a\u0004\b&\u0010\"R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010'R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010,\u001a\u0004\b*\u0010+R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010,\u001a\u0004\b-\u0010+¨\u0006A"}, d2 = {"Lcom/sportygames/crash/remote/models/PlaceBetRequest;", "", "betAmount", "", "betCategoryType", "", "betIndex", "currency", "roundId", "", "giftId", "giftAmount", "", "autoCashoutAt", "isCampaignUser", "", "gpsData", "Lcom/sportygames/commons/models/GPSData;", "turboBonusUsed", "stakeSafeUsed", "<init>", "(Ljava/lang/String;IILjava/lang/String;JLjava/lang/String;Ljava/lang/Double;Ljava/lang/Double;ZLcom/sportygames/commons/models/GPSData;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getBetAmount", "()Ljava/lang/String;", "getBetCategoryType", "()I", "getBetIndex", "getCurrency", "getRoundId", "()J", "getGiftId", "setGiftId", "(Ljava/lang/String;)V", "getGiftAmount", "()Ljava/lang/Double;", "setGiftAmount", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getAutoCashoutAt", "()Z", "getGpsData", "()Lcom/sportygames/commons/models/GPSData;", "getTurboBonusUsed", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getStakeSafeUsed", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/String;IILjava/lang/String;JLjava/lang/String;Ljava/lang/Double;Ljava/lang/Double;ZLcom/sportygames/commons/models/GPSData;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/sportygames/crash/remote/models/PlaceBetRequest;", "equals", "other", "hashCode", "toString", "Companion", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PlaceBetRequest {
    private final Double autoCashoutAt;
    private final String betAmount;
    private final int betCategoryType;
    private final int betIndex;
    private final String currency;
    private Double giftAmount;
    private String giftId;
    private final GPSData gpsData;
    private final boolean isCampaignUser;
    private final long roundId;
    private final Boolean stakeSafeUsed;
    private final Boolean turboBonusUsed;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0083\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/sportygames/crash/remote/models/PlaceBetRequest$Companion;", "", "<init>", "()V", "createOrNull", "Lcom/sportygames/crash/remote/models/PlaceBetRequest;", "betAmount", "", "betCategoryType", "", "betIndex", "currency", "roundId", "", "giftId", "giftAmount", "", "autoCashoutAt", "isCampaignUser", "", "gpsData", "Lcom/sportygames/commons/models/GPSData;", "turboBonusUsed", "stakeSafeUsed", "(Ljava/lang/String;IILjava/lang/String;JLjava/lang/String;Ljava/lang/Double;Ljava/lang/Double;ZLcom/sportygames/commons/models/GPSData;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/sportygames/crash/remote/models/PlaceBetRequest;", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PlaceBetRequest createOrNull(String betAmount, int betCategoryType, int betIndex, String currency, long roundId, String giftId, Double giftAmount, Double autoCashoutAt, boolean isCampaignUser, GPSData gpsData, Boolean turboBonusUsed, Boolean stakeSafeUsed) {
            betAmount.getClass();
            if (currency == null || StringsKt.U(currency)) {
                return null;
            }
            return new PlaceBetRequest(betAmount, betCategoryType, betIndex, currency, roundId, giftId, giftAmount, autoCashoutAt, isCampaignUser, gpsData, turboBonusUsed, stakeSafeUsed, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ PlaceBetRequest(String str, int i, int i2, String str2, long j, String str3, Double d, Double d2, boolean z, GPSData gPSData, Boolean bool, Boolean bool2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i2, str2, j, str3, d, d2, (i3 & 256) != 0 ? false : z, (i3 & 512) != 0 ? null : gPSData, (i3 & 1024) != 0 ? null : bool, (i3 & 2048) != 0 ? null : bool2);
    }

    private final PlaceBetRequest copy(String betAmount, int betCategoryType, int betIndex, String currency, long roundId, String giftId, Double giftAmount, Double autoCashoutAt, boolean isCampaignUser, GPSData gpsData, Boolean turboBonusUsed, Boolean stakeSafeUsed) {
        return new PlaceBetRequest(betAmount, betCategoryType, betIndex, currency, roundId, giftId, giftAmount, autoCashoutAt, isCampaignUser, gpsData, turboBonusUsed, stakeSafeUsed);
    }

    public static /* synthetic */ PlaceBetRequest copy$default(PlaceBetRequest placeBetRequest, String str, int i, int i2, String str2, long j, String str3, Double d, Double d2, boolean z, GPSData gPSData, Boolean bool, Boolean bool2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = placeBetRequest.betAmount;
        }
        return placeBetRequest.copy(str, (i3 & 2) != 0 ? placeBetRequest.betCategoryType : i, (i3 & 4) != 0 ? placeBetRequest.betIndex : i2, (i3 & 8) != 0 ? placeBetRequest.currency : str2, (i3 & 16) != 0 ? placeBetRequest.roundId : j, (i3 & 32) != 0 ? placeBetRequest.giftId : str3, (i3 & 64) != 0 ? placeBetRequest.giftAmount : d, (i3 & 128) != 0 ? placeBetRequest.autoCashoutAt : d2, (i3 & 256) != 0 ? placeBetRequest.isCampaignUser : z, (i3 & 512) != 0 ? placeBetRequest.gpsData : gPSData, (i3 & 1024) != 0 ? placeBetRequest.turboBonusUsed : bool, (i3 & 2048) != 0 ? placeBetRequest.stakeSafeUsed : bool2);
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
    public final Boolean getTurboBonusUsed() {
        return this.turboBonusUsed;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Boolean getStakeSafeUsed() {
        return this.stakeSafeUsed;
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

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlaceBetRequest)) {
            return false;
        }
        PlaceBetRequest placeBetRequest = (PlaceBetRequest) other;
        return Intrinsics.g(this.betAmount, placeBetRequest.betAmount) && this.betCategoryType == placeBetRequest.betCategoryType && this.betIndex == placeBetRequest.betIndex && Intrinsics.g(this.currency, placeBetRequest.currency) && this.roundId == placeBetRequest.roundId && Intrinsics.g(this.giftId, placeBetRequest.giftId) && Intrinsics.g(this.giftAmount, placeBetRequest.giftAmount) && Intrinsics.g(this.autoCashoutAt, placeBetRequest.autoCashoutAt) && this.isCampaignUser == placeBetRequest.isCampaignUser && Intrinsics.g(this.gpsData, placeBetRequest.gpsData) && Intrinsics.g(this.turboBonusUsed, placeBetRequest.turboBonusUsed) && Intrinsics.g(this.stakeSafeUsed, placeBetRequest.stakeSafeUsed);
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

    public final GPSData getGpsData() {
        return this.gpsData;
    }

    public final long getRoundId() {
        return this.roundId;
    }

    public final Boolean getStakeSafeUsed() {
        return this.stakeSafeUsed;
    }

    public final Boolean getTurboBonusUsed() {
        return this.turboBonusUsed;
    }

    public int hashCode() {
        int iA = f87.a(gmf0.a(gpp.a(this.betIndex, gpp.a(this.betCategoryType, this.betAmount.hashCode() * 31, 31), 31), 31, this.currency), this.roundId, 31);
        String str = this.giftId;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        Double d = this.giftAmount;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.autoCashoutAt;
        int iA2 = mtg0.a((iHashCode2 + (d2 == null ? 0 : d2.hashCode())) * 31, 31, this.isCampaignUser);
        GPSData gPSData = this.gpsData;
        int iHashCode3 = (iA2 + (gPSData == null ? 0 : gPSData.hashCode())) * 31;
        Boolean bool = this.turboBonusUsed;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.stakeSafeUsed;
        return iHashCode4 + (bool2 != null ? bool2.hashCode() : 0);
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
        GPSData gPSData = this.gpsData;
        Boolean bool = this.turboBonusUsed;
        Boolean bool2 = this.stakeSafeUsed;
        StringBuilder sbA = ml5.a(i, "PlaceBetRequest(betAmount=", str, ", betCategoryType=", ", betIndex=");
        f78.b(i2, ", currency=", str2, ", roundId=", sbA);
        em5.a(j, ", giftId=", str3, sbA);
        lsv.a(d, d2, ", giftAmount=", ", autoCashoutAt=", sbA);
        sbA.append(", isCampaignUser=");
        sbA.append(z);
        sbA.append(", gpsData=");
        sbA.append(gPSData);
        sbA.append(", turboBonusUsed=");
        sbA.append(bool);
        sbA.append(", stakeSafeUsed=");
        sbA.append(bool2);
        sbA.append(")");
        return sbA.toString();
    }

    private PlaceBetRequest(String str, int i, int i2, String str2, long j, String str3, Double d, Double d2, boolean z, GPSData gPSData, Boolean bool, Boolean bool2) {
        this.betAmount = str;
        this.betCategoryType = i;
        this.betIndex = i2;
        this.currency = str2;
        this.roundId = j;
        this.giftId = str3;
        this.giftAmount = d;
        this.autoCashoutAt = d2;
        this.isCampaignUser = z;
        this.gpsData = gPSData;
        this.turboBonusUsed = bool;
        this.stakeSafeUsed = bool2;
    }

    public /* synthetic */ PlaceBetRequest(String str, int i, int i2, String str2, long j, String str3, Double d, Double d2, boolean z, GPSData gPSData, Boolean bool, Boolean bool2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i2, str2, j, str3, d, d2, z, gPSData, bool, bool2);
    }
}
