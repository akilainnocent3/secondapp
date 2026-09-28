package com.sportygames.pocketrocket.model.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.plugin.realsports.home.featuredsection.lAly.lTGEJfVytU;
import com.sportygames.commons.models.BetHistoryBase;
import defpackage.fwv;
import defpackage.gmf0;
import defpackage.hib0;
import defpackage.hxa;
import defpackage.mtg0;
import defpackage.nrg0;
import defpackage.nrz;
import defpackage.qn4;
import defpackage.u4;
import defpackage.ux5;
import defpackage.vnk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b.\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u009b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\t\u00102\u001a\u00020\u0004HÆ\u0003J\t\u00103\u001a\u00020\u0004HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u00106\u001a\u00020\tHÆ\u0003J\u0010\u00107\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\"J\t\u00108\u001a\u00020\u0004HÆ\u0003J\t\u00109\u001a\u00020\tHÆ\u0003J\t\u0010:\u001a\u00020\tHÆ\u0003J\t\u0010;\u001a\u00020\tHÆ\u0003J\t\u0010<\u001a\u00020\tHÆ\u0003J\t\u0010=\u001a\u00020\tHÆ\u0003J\t\u0010>\u001a\u00020\u0004HÆ\u0003J\t\u0010?\u001a\u00020\u0004HÆ\u0003J\t\u0010@\u001a\u00020\u0004HÆ\u0003J\t\u0010A\u001a\u00020\u0015HÆ\u0003J\t\u0010B\u001a\u00020\u0017HÆ\u0003J¾\u0001\u0010C\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0017HÆ\u0001¢\u0006\u0002\u0010DJ\u0006\u0010E\u001a\u00020FJ\u0013\u0010G\u001a\u00020\u00152\b\u0010H\u001a\u0004\u0018\u00010IHÖ\u0003J\t\u0010J\u001a\u00020FHÖ\u0001J\t\u0010K\u001a\u00020\u0004HÖ\u0001J\u0016\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020FR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0015\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001bR\u0011\u0010\f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b%\u0010 R\u0011\u0010\r\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b&\u0010 R\u0011\u0010\u000e\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b'\u0010 R\u0011\u0010\u000f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b(\u0010 R\u0011\u0010\u0010\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b)\u0010 R\u0011\u0010\u0011\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001bR\u0011\u0010\u0012\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001bR\u0011\u0010\u0013\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001bR\u001a\u0010\u0014\u001a\u00020\u0015X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010-\"\u0004\b.\u0010/R\u0014\u0010\u0016\u001a\u00020\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101¨\u0006Q"}, d2 = {"Lcom/sportygames/pocketrocket/model/response/BetHistoryItem;", "Landroid/os/Parcelable;", "Lcom/sportygames/commons/models/BetHistoryBase;", "betId", "", "roundId", "roundStatus", "rocketType", "houseCoefficient", "", "cashoutCoefficient", "currency", "stakeAmount", "giftAmount", "payoutAmount", "actualStakeAmount", "actualPayoutAmount", "ticketId", "ticketStatus", "startTime", "isExpanded", "", AnalyticsParam.EVENT_PARAM_ID, "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/Double;Ljava/lang/String;DDDDDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJ)V", "getBetId", "()Ljava/lang/String;", "getRoundId", "getRoundStatus", "getRocketType", "getHouseCoefficient", "()D", "getCashoutCoefficient", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getCurrency", "getStakeAmount", "getGiftAmount", "getPayoutAmount", "getActualStakeAmount", "getActualPayoutAmount", "getTicketId", "getTicketStatus", "getStartTime", "()Z", "setExpanded", "(Z)V", "getId", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/Double;Ljava/lang/String;DDDDDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJ)Lcom/sportygames/pocketrocket/model/response/BetHistoryItem;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BetHistoryItem implements Parcelable, BetHistoryBase {
    private final double actualPayoutAmount;
    private final double actualStakeAmount;
    private final String betId;
    private final Double cashoutCoefficient;
    private final String currency;
    private final double giftAmount;
    private final double houseCoefficient;
    private final long id;
    private boolean isExpanded;
    private final double payoutAmount;
    private final String rocketType;
    private final String roundId;
    private final String roundStatus;
    private final double stakeAmount;
    private final String startTime;
    private final String ticketId;
    private final String ticketStatus;
    public static final Parcelable.Creator<BetHistoryItem> CREATOR = new Creator();
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BetHistoryItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BetHistoryItem createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new BetHistoryItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readString(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readLong());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BetHistoryItem[] newArray(int i) {
            return new BetHistoryItem[i];
        }
    }

    public /* synthetic */ BetHistoryItem(String str, String str2, String str3, String str4, double d, Double d2, String str5, double d3, double d4, double d5, double d6, double d7, String str6, String str7, String str8, boolean z, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, d, (i & 32) != 0 ? Double.valueOf(0.0d) : d2, str5, d3, d4, d5, (i & 1024) != 0 ? 0.0d : d6, (i & 2048) != 0 ? 0.0d : d7, str6, str7, str8, z, j);
    }

    public static /* synthetic */ BetHistoryItem copy$default(BetHistoryItem betHistoryItem, String str, String str2, String str3, String str4, double d, Double d2, String str5, double d3, double d4, double d5, double d6, double d7, String str6, String str7, String str8, boolean z, long j, int i, Object obj) {
        long j2;
        boolean z2;
        String str9;
        String str10 = (i & 1) != 0 ? betHistoryItem.betId : str;
        String str11 = (i & 2) != 0 ? betHistoryItem.roundId : str2;
        String str12 = (i & 4) != 0 ? betHistoryItem.roundStatus : str3;
        String str13 = (i & 8) != 0 ? betHistoryItem.rocketType : str4;
        double d8 = (i & 16) != 0 ? betHistoryItem.houseCoefficient : d;
        Double d9 = (i & 32) != 0 ? betHistoryItem.cashoutCoefficient : d2;
        String str14 = (i & 64) != 0 ? betHistoryItem.currency : str5;
        double d10 = (i & 128) != 0 ? betHistoryItem.stakeAmount : d3;
        double d11 = (i & 256) != 0 ? betHistoryItem.giftAmount : d4;
        double d12 = (i & 512) != 0 ? betHistoryItem.payoutAmount : d5;
        String str15 = str10;
        String str16 = str11;
        double d13 = (i & 1024) != 0 ? betHistoryItem.actualStakeAmount : d6;
        double d14 = (i & 2048) != 0 ? betHistoryItem.actualPayoutAmount : d7;
        String str17 = (i & 4096) != 0 ? betHistoryItem.ticketId : str6;
        String str18 = (i & 8192) != 0 ? betHistoryItem.ticketStatus : str7;
        String str19 = str17;
        String str20 = (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? betHistoryItem.startTime : str8;
        boolean z3 = (i & 32768) != 0 ? betHistoryItem.isExpanded : z;
        if ((i & 65536) != 0) {
            str9 = str20;
            z2 = z3;
            j2 = betHistoryItem.id;
        } else {
            j2 = j;
            z2 = z3;
            str9 = str20;
        }
        return betHistoryItem.copy(str15, str16, str12, str13, d8, d9, str14, d10, d11, d12, d13, d14, str19, str18, str9, z2, j2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBetId() {
        return this.betId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final double getPayoutAmount() {
        return this.payoutAmount;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final double getActualStakeAmount() {
        return this.actualStakeAmount;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final double getActualPayoutAmount() {
        return this.actualPayoutAmount;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getTicketId() {
        return this.ticketId;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getTicketStatus() {
        return this.ticketStatus;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final boolean getIsExpanded() {
        return this.isExpanded;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRoundId() {
        return this.roundId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRoundStatus() {
        return this.roundStatus;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getRocketType() {
        return this.rocketType;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final double getHouseCoefficient() {
        return this.houseCoefficient;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Double getCashoutCoefficient() {
        return this.cashoutCoefficient;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final double getStakeAmount() {
        return this.stakeAmount;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final double getGiftAmount() {
        return this.giftAmount;
    }

    public final BetHistoryItem copy(String betId, String roundId, String roundStatus, String rocketType, double houseCoefficient, Double cashoutCoefficient, String currency, double stakeAmount, double giftAmount, double payoutAmount, double actualStakeAmount, double actualPayoutAmount, String ticketId, String ticketStatus, String startTime, boolean isExpanded, long id) {
        qn4.b(betId, roundId, currency, ticketId, ticketStatus);
        startTime.getClass();
        return new BetHistoryItem(betId, roundId, roundStatus, rocketType, houseCoefficient, cashoutCoefficient, currency, stakeAmount, giftAmount, payoutAmount, actualStakeAmount, actualPayoutAmount, ticketId, ticketStatus, startTime, isExpanded, id);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BetHistoryItem)) {
            return false;
        }
        BetHistoryItem betHistoryItem = (BetHistoryItem) other;
        return Intrinsics.g(this.betId, betHistoryItem.betId) && Intrinsics.g(this.roundId, betHistoryItem.roundId) && Intrinsics.g(this.roundStatus, betHistoryItem.roundStatus) && Intrinsics.g(this.rocketType, betHistoryItem.rocketType) && Double.compare(this.houseCoefficient, betHistoryItem.houseCoefficient) == 0 && Intrinsics.g(this.cashoutCoefficient, betHistoryItem.cashoutCoefficient) && Intrinsics.g(this.currency, betHistoryItem.currency) && Double.compare(this.stakeAmount, betHistoryItem.stakeAmount) == 0 && Double.compare(this.giftAmount, betHistoryItem.giftAmount) == 0 && Double.compare(this.payoutAmount, betHistoryItem.payoutAmount) == 0 && Double.compare(this.actualStakeAmount, betHistoryItem.actualStakeAmount) == 0 && Double.compare(this.actualPayoutAmount, betHistoryItem.actualPayoutAmount) == 0 && Intrinsics.g(this.ticketId, betHistoryItem.ticketId) && Intrinsics.g(this.ticketStatus, betHistoryItem.ticketStatus) && Intrinsics.g(this.startTime, betHistoryItem.startTime) && this.isExpanded == betHistoryItem.isExpanded && this.id == betHistoryItem.id;
    }

    public final double getActualPayoutAmount() {
        return this.actualPayoutAmount;
    }

    public final double getActualStakeAmount() {
        return this.actualStakeAmount;
    }

    public final String getBetId() {
        return this.betId;
    }

    public final Double getCashoutCoefficient() {
        return this.cashoutCoefficient;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final double getGiftAmount() {
        return this.giftAmount;
    }

    public final double getHouseCoefficient() {
        return this.houseCoefficient;
    }

    @Override // com.sportygames.commons.models.BetHistoryBase
    public long getId() {
        return this.id;
    }

    public final double getPayoutAmount() {
        return this.payoutAmount;
    }

    public final String getRocketType() {
        return this.rocketType;
    }

    public final String getRoundId() {
        return this.roundId;
    }

    public final String getRoundStatus() {
        return this.roundStatus;
    }

    public final double getStakeAmount() {
        return this.stakeAmount;
    }

    public final String getStartTime() {
        return this.startTime;
    }

    public final String getTicketId() {
        return this.ticketId;
    }

    public final String getTicketStatus() {
        return this.ticketStatus;
    }

    public int hashCode() {
        int iA = gmf0.a(this.betId.hashCode() * 31, 31, this.roundId);
        String str = this.roundStatus;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.rocketType;
        int iA2 = nrg0.a((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.houseCoefficient);
        Double d = this.cashoutCoefficient;
        return Long.hashCode(this.id) + mtg0.a(gmf0.a(gmf0.a(gmf0.a(nrg0.a(nrg0.a(nrg0.a(nrg0.a(nrg0.a(gmf0.a((iA2 + (d != null ? d.hashCode() : 0)) * 31, 31, this.currency), 31, this.stakeAmount), 31, this.giftAmount), 31, this.payoutAmount), 31, this.actualStakeAmount), 31, this.actualPayoutAmount), 31, this.ticketId), 31, this.ticketStatus), 31, this.startTime), 31, this.isExpanded);
    }

    @Override // com.sportygames.commons.models.BetHistoryBase
    public boolean isExpanded() {
        return this.isExpanded;
    }

    @Override // com.sportygames.commons.models.BetHistoryBase
    public void setExpanded(boolean z) {
        this.isExpanded = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.betId);
        dest.writeString(this.roundId);
        dest.writeString(this.roundStatus);
        dest.writeString(this.rocketType);
        dest.writeDouble(this.houseCoefficient);
        Double d = this.cashoutCoefficient;
        if (d == null) {
            dest.writeInt(0);
        } else {
            vnk.a(dest, 1, d);
        }
        dest.writeString(this.currency);
        dest.writeDouble(this.stakeAmount);
        dest.writeDouble(this.giftAmount);
        dest.writeDouble(this.payoutAmount);
        dest.writeDouble(this.actualStakeAmount);
        dest.writeDouble(this.actualPayoutAmount);
        dest.writeString(this.ticketId);
        dest.writeString(this.ticketStatus);
        dest.writeString(this.startTime);
        dest.writeInt(this.isExpanded ? 1 : 0);
        dest.writeLong(this.id);
    }

    public String toString() {
        String str = this.betId;
        String str2 = this.roundId;
        String str3 = this.roundStatus;
        String str4 = this.rocketType;
        double d = this.houseCoefficient;
        Double d2 = this.cashoutCoefficient;
        String str5 = this.currency;
        double d3 = this.stakeAmount;
        double d4 = this.giftAmount;
        double d5 = this.payoutAmount;
        double d6 = this.actualStakeAmount;
        double d7 = this.actualPayoutAmount;
        String str6 = this.ticketId;
        String str7 = this.ticketStatus;
        String str8 = this.startTime;
        boolean z = this.isExpanded;
        long j = this.id;
        StringBuilder sbA = ux5.a("BetHistoryItem(betId=", str, ", roundId=", str2, ", roundStatus=");
        hxa.c(sbA, str3, ", rocketType=", str4, ", houseCoefficient=");
        sbA.append(d);
        sbA.append(", cashoutCoefficient=");
        sbA.append(d2);
        u4.a(sbA, ", currency=", str5, ", stakeAmount=");
        sbA.append(d3);
        hib0.b(d4, ", giftAmount=", ", payoutAmount=", sbA);
        sbA.append(d5);
        hib0.b(d6, lTGEJfVytU.oemoUClxcqEWhQf, ", actualPayoutAmount=", sbA);
        fwv.a(d7, ", ticketId=", str6, sbA);
        hxa.c(sbA, ", ticketStatus=", str7, ", startTime=", str8);
        sbA.append(", isExpanded=");
        sbA.append(z);
        sbA.append(", id=");
        return nrz.a(j, ")", sbA);
    }

    public BetHistoryItem(String str, String str2, String str3, String str4, double d, Double d2, String str5, double d3, double d4, double d5, double d6, double d7, String str6, String str7, String str8, boolean z, long j) {
        qn4.b(str, str2, str5, str6, str7);
        str8.getClass();
        this.betId = str;
        this.roundId = str2;
        this.roundStatus = str3;
        this.rocketType = str4;
        this.houseCoefficient = d;
        this.cashoutCoefficient = d2;
        this.currency = str5;
        this.stakeAmount = d3;
        this.giftAmount = d4;
        this.payoutAmount = d5;
        this.actualStakeAmount = d6;
        this.actualPayoutAmount = d7;
        this.ticketId = str6;
        this.ticketStatus = str7;
        this.startTime = str8;
        this.isExpanded = z;
        this.id = j;
    }
}
