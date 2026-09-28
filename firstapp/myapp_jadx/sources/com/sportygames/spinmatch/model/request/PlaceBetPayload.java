package com.sportygames.spinmatch.model.request;

import com.sportygames.commons.models.GPSData;
import defpackage.gmf0;
import defpackage.k800;
import defpackage.mtg0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001.BQ\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010$\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0019J\t\u0010%\u001a\u00020\u000bHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u000eHÆ\u0003Jb\u0010'\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u0010(J\u0013\u0010)\u001a\u00020\u000b2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\n\u0010\u0019R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u001bR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006/"}, d2 = {"Lcom/sportygames/spinmatch/model/request/PlaceBetPayload;", "", "individualBetRequestList", "", "Lcom/sportygames/spinmatch/model/request/PlaceBetPayload$IndividualBetRequestList;", "currency", "", "giftId", "giftAmount", "", "isFreeSpin", "", "isCampaignUser", "gpsData", "Lcom/sportygames/commons/models/GPSData;", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Boolean;ZLcom/sportygames/commons/models/GPSData;)V", "getIndividualBetRequestList", "()Ljava/util/List;", "getCurrency", "()Ljava/lang/String;", "getGiftId", "getGiftAmount", "()Ljava/lang/Double;", "Ljava/lang/Double;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "()Z", "getGpsData", "()Lcom/sportygames/commons/models/GPSData;", "setGpsData", "(Lcom/sportygames/commons/models/GPSData;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Boolean;ZLcom/sportygames/commons/models/GPSData;)Lcom/sportygames/spinmatch/model/request/PlaceBetPayload;", "equals", "other", "hashCode", "", "toString", "IndividualBetRequestList", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PlaceBetPayload {
    public static final int $stable = 8;
    private final String currency;
    private final Double giftAmount;
    private final String giftId;
    private GPSData gpsData;
    private final List<IndividualBetRequestList> individualBetRequestList;
    private final boolean isCampaignUser;
    private final Boolean isFreeSpin;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/sportygames/spinmatch/model/request/PlaceBetPayload$IndividualBetRequestList;", "", "betConfigId", "", "stakeAmount", "", "<init>", "(Ljava/lang/String;D)V", "getBetConfigId", "()Ljava/lang/String;", "getStakeAmount", "()D", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class IndividualBetRequestList {
        public static final int $stable = 0;
        private final String betConfigId;
        private final double stakeAmount;

        public IndividualBetRequestList(String str, double d) {
            str.getClass();
            this.betConfigId = str;
            this.stakeAmount = d;
        }

        public static /* synthetic */ IndividualBetRequestList copy$default(IndividualBetRequestList individualBetRequestList, String str, double d, int i, Object obj) {
            if ((i & 1) != 0) {
                str = individualBetRequestList.betConfigId;
            }
            if ((i & 2) != 0) {
                d = individualBetRequestList.stakeAmount;
            }
            return individualBetRequestList.copy(str, d);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getBetConfigId() {
            return this.betConfigId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final double getStakeAmount() {
            return this.stakeAmount;
        }

        public final IndividualBetRequestList copy(String betConfigId, double stakeAmount) {
            betConfigId.getClass();
            return new IndividualBetRequestList(betConfigId, stakeAmount);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IndividualBetRequestList)) {
                return false;
            }
            IndividualBetRequestList individualBetRequestList = (IndividualBetRequestList) other;
            return Intrinsics.g(this.betConfigId, individualBetRequestList.betConfigId) && Double.compare(this.stakeAmount, individualBetRequestList.stakeAmount) == 0;
        }

        public final String getBetConfigId() {
            return this.betConfigId;
        }

        public final double getStakeAmount() {
            return this.stakeAmount;
        }

        public int hashCode() {
            return Double.hashCode(this.stakeAmount) + (this.betConfigId.hashCode() * 31);
        }

        public String toString() {
            return "IndividualBetRequestList(betConfigId=" + this.betConfigId + ", stakeAmount=" + this.stakeAmount + ")";
        }
    }

    public /* synthetic */ PlaceBetPayload(List list, String str, String str2, Double d, Boolean bool, boolean z, GPSData gPSData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, str, str2, d, bool, (i & 32) != 0 ? false : z, (i & 64) != 0 ? null : gPSData);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PlaceBetPayload copy$default(PlaceBetPayload placeBetPayload, List list, String str, String str2, Double d, Boolean bool, boolean z, GPSData gPSData, int i, Object obj) {
        if ((i & 1) != 0) {
            list = placeBetPayload.individualBetRequestList;
        }
        if ((i & 2) != 0) {
            str = placeBetPayload.currency;
        }
        if ((i & 4) != 0) {
            str2 = placeBetPayload.giftId;
        }
        if ((i & 8) != 0) {
            d = placeBetPayload.giftAmount;
        }
        if ((i & 16) != 0) {
            bool = placeBetPayload.isFreeSpin;
        }
        if ((i & 32) != 0) {
            z = placeBetPayload.isCampaignUser;
        }
        if ((i & 64) != 0) {
            gPSData = placeBetPayload.gpsData;
        }
        boolean z2 = z;
        GPSData gPSData2 = gPSData;
        Boolean bool2 = bool;
        String str3 = str2;
        return placeBetPayload.copy(list, str, str3, d, bool2, z2, gPSData2);
    }

    public final List<IndividualBetRequestList> component1() {
        return this.individualBetRequestList;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getGiftId() {
        return this.giftId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Double getGiftAmount() {
        return this.giftAmount;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getIsFreeSpin() {
        return this.isFreeSpin;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsCampaignUser() {
        return this.isCampaignUser;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final GPSData getGpsData() {
        return this.gpsData;
    }

    public final PlaceBetPayload copy(List<IndividualBetRequestList> individualBetRequestList, String currency, String giftId, Double giftAmount, Boolean isFreeSpin, boolean isCampaignUser, GPSData gpsData) {
        individualBetRequestList.getClass();
        currency.getClass();
        return new PlaceBetPayload(individualBetRequestList, currency, giftId, giftAmount, isFreeSpin, isCampaignUser, gpsData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlaceBetPayload)) {
            return false;
        }
        PlaceBetPayload placeBetPayload = (PlaceBetPayload) other;
        return Intrinsics.g(this.individualBetRequestList, placeBetPayload.individualBetRequestList) && Intrinsics.g(this.currency, placeBetPayload.currency) && Intrinsics.g(this.giftId, placeBetPayload.giftId) && Intrinsics.g(this.giftAmount, placeBetPayload.giftAmount) && Intrinsics.g(this.isFreeSpin, placeBetPayload.isFreeSpin) && this.isCampaignUser == placeBetPayload.isCampaignUser && Intrinsics.g(this.gpsData, placeBetPayload.gpsData);
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

    public final List<IndividualBetRequestList> getIndividualBetRequestList() {
        return this.individualBetRequestList;
    }

    public int hashCode() {
        int iA = gmf0.a(this.individualBetRequestList.hashCode() * 31, 31, this.currency);
        String str = this.giftId;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        Double d = this.giftAmount;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        Boolean bool = this.isFreeSpin;
        int iA2 = mtg0.a((iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.isCampaignUser);
        GPSData gPSData = this.gpsData;
        return iA2 + (gPSData != null ? gPSData.hashCode() : 0);
    }

    public final boolean isCampaignUser() {
        return this.isCampaignUser;
    }

    public final Boolean isFreeSpin() {
        return this.isFreeSpin;
    }

    public final void setGpsData(GPSData gPSData) {
        this.gpsData = gPSData;
    }

    public String toString() {
        List<IndividualBetRequestList> list = this.individualBetRequestList;
        String str = this.currency;
        String str2 = this.giftId;
        Double d = this.giftAmount;
        Boolean bool = this.isFreeSpin;
        boolean z = this.isCampaignUser;
        GPSData gPSData = this.gpsData;
        StringBuilder sb = new StringBuilder("PlaceBetPayload(individualBetRequestList=");
        sb.append(list);
        sb.append(", currency=");
        sb.append(str);
        sb.append(", giftId=");
        k800.a(d, str2, ", giftAmount=", ", isFreeSpin=", sb);
        sb.append(bool);
        sb.append(", isCampaignUser=");
        sb.append(z);
        sb.append(", gpsData=");
        sb.append(gPSData);
        sb.append(")");
        return sb.toString();
    }

    public PlaceBetPayload(List<IndividualBetRequestList> list, String str, String str2, Double d, Boolean bool, boolean z, GPSData gPSData) {
        list.getClass();
        str.getClass();
        this.individualBetRequestList = list;
        this.currency = str;
        this.giftId = str2;
        this.giftAmount = d;
        this.isFreeSpin = bool;
        this.isCampaignUser = z;
        this.gpsData = gPSData;
    }
}
