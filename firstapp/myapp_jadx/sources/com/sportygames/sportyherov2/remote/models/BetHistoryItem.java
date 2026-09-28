package com.sportygames.sportyherov2.remote.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.appsflyer.internal.w;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportygames.commons.models.BetHistoryBase;
import defpackage.f87;
import defpackage.fwv;
import defpackage.g41;
import defpackage.gmf0;
import defpackage.hib0;
import defpackage.hxa;
import defpackage.k800;
import defpackage.nrg0;
import defpackage.qn4;
import defpackage.s27;
import defpackage.u4;
import defpackage.ux5;
import defpackage.vnk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b<\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002Bã\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0015\u001a\u00020\b\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\b\u0012\u0006\u0010\u0019\u001a\u00020\u0004\u0012\u0006\u0010\u001a\u001a\u00020\u0004\u0012\u0006\u0010\u001b\u001a\u00020\b\u0012\u0006\u0010\u001c\u001a\u00020\u0004\u0012\u0006\u0010\u001d\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\t\u0010@\u001a\u00020\u0004HÆ\u0003J\t\u0010A\u001a\u00020\u0004HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0010\u0010C\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010&J\u000b\u0010D\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0010\u0010E\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010&J\u0010\u0010F\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010&J\u0010\u0010G\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010&J\u000b\u0010H\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010I\u001a\u00020\bHÆ\u0003J\t\u0010J\u001a\u00020\bHÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010L\u001a\u00020\u0004HÆ\u0003J\t\u0010M\u001a\u00020\bHÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010P\u001a\u00020\bHÆ\u0003J\t\u0010Q\u001a\u00020\u0017HÆ\u0003J\t\u0010R\u001a\u00020\bHÆ\u0003J\t\u0010S\u001a\u00020\u0004HÆ\u0003J\t\u0010T\u001a\u00020\u0004HÆ\u0003J\t\u0010U\u001a\u00020\bHÆ\u0003J\t\u0010V\u001a\u00020\u0004HÆ\u0003J\t\u0010W\u001a\u00020\u001eHÆ\u0003J\u0092\u0002\u0010X\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\b2\b\b\u0002\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u00042\b\b\u0002\u0010\u001b\u001a\u00020\b2\b\b\u0002\u0010\u001c\u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\u001eHÆ\u0001¢\u0006\u0002\u0010YJ\u0006\u0010Z\u001a\u00020[J\u0013\u0010\\\u001a\u00020\u001e2\b\u0010]\u001a\u0004\u0018\u00010^HÖ\u0003J\t\u0010_\u001a\u00020[HÖ\u0001J\t\u0010`\u001a\u00020\u0004HÖ\u0001J\u0016\u0010a\u001a\u00020b2\u0006\u0010c\u001a\u00020d2\u0006\u0010e\u001a\u00020[R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\"R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010'\u001a\u0004\b%\u0010&R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\"R\u0015\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010'\u001a\u0004\b)\u0010&R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010'\u001a\u0004\b*\u0010&R\u0015\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010'\u001a\u0004\b+\u0010&R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\"R\u0011\u0010\u000e\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\u000f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b/\u0010.R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\"R\u0011\u0010\u0011\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\"R\u0011\u0010\u0012\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b2\u0010.R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\"R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\"R\u0011\u0010\u0015\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b5\u0010.R\u0014\u0010\u0016\u001a\u00020\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0011\u0010\u0018\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b8\u0010.R\u0011\u0010\u0019\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010\"R\u0011\u0010\u001a\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010\"R\u0011\u0010\u001b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b;\u0010.R\u0011\u0010\u001c\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010\"R\u001a\u0010\u001d\u001a\u00020\u001eX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010=\"\u0004\b>\u0010?¨\u0006f"}, d2 = {"Lcom/sportygames/sportyherov2/remote/models/BetHistoryItem;", "Landroid/os/Parcelable;", "Lcom/sportygames/commons/models/BetHistoryBase;", "userId", "", "roundId", "roomId", "cashoutCoefficient", "", "sideBetType", "targetCoefficient", "startCoefficient", "endCoefficient", "cashoutCoefficientStr", "actualCreditedAmount", "actualDebitedAmount", "userPick", "currency", "houseCoefficient", "houseCoefficientStr", "decision", "giftAmount", AnalyticsParam.EVENT_PARAM_ID, "", "payoutAmount", "ticketId", "createdAt", "stakeAmount", "betIndex", "isExpanded", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;DDLjava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;DJDLjava/lang/String;Ljava/lang/String;DLjava/lang/String;Z)V", "getUserId", "()Ljava/lang/String;", "getRoundId", "getRoomId", "getCashoutCoefficient", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getSideBetType", "getTargetCoefficient", "getStartCoefficient", "getEndCoefficient", "getCashoutCoefficientStr", "getActualCreditedAmount", "()D", "getActualDebitedAmount", "getUserPick", "getCurrency", "getHouseCoefficient", "getHouseCoefficientStr", "getDecision", "getGiftAmount", "getId", "()J", "getPayoutAmount", "getTicketId", "getCreatedAt", "getStakeAmount", "getBetIndex", "()Z", "setExpanded", "(Z)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;DDLjava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;DJDLjava/lang/String;Ljava/lang/String;DLjava/lang/String;Z)Lcom/sportygames/sportyherov2/remote/models/BetHistoryItem;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BetHistoryItem implements Parcelable, BetHistoryBase {
    private final double actualCreditedAmount;
    private final double actualDebitedAmount;
    private final String betIndex;
    private final Double cashoutCoefficient;
    private final String cashoutCoefficientStr;
    private final String createdAt;
    private final String currency;
    private final String decision;
    private final Double endCoefficient;
    private final double giftAmount;
    private final double houseCoefficient;
    private final String houseCoefficientStr;
    private final long id;
    private boolean isExpanded;
    private final double payoutAmount;
    private final String roomId;
    private final String roundId;
    private final String sideBetType;
    private final double stakeAmount;
    private final Double startCoefficient;
    private final Double targetCoefficient;
    private final String ticketId;
    private final String userId;
    private final String userPick;
    public static final Parcelable.Creator<BetHistoryItem> CREATOR = new Creator();
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BetHistoryItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BetHistoryItem createFromParcel(Parcel parcel) {
            Double dValueOf;
            Double dValueOf2;
            parcel.getClass();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                dValueOf = null;
                dValueOf2 = null;
            } else {
                dValueOf = Double.valueOf(parcel.readDouble());
                dValueOf2 = null;
            }
            String string4 = parcel.readString();
            Double dValueOf3 = parcel.readInt() == 0 ? dValueOf2 : Double.valueOf(parcel.readDouble());
            Double dValueOf4 = parcel.readInt() == 0 ? dValueOf2 : Double.valueOf(parcel.readDouble());
            if (parcel.readInt() != 0) {
                dValueOf2 = Double.valueOf(parcel.readDouble());
            }
            return new BetHistoryItem(string, string2, string3, dValueOf, string4, dValueOf3, dValueOf4, dValueOf2, parcel.readString(), parcel.readDouble(), parcel.readDouble(), parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readLong(), parcel.readDouble(), parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BetHistoryItem[] newArray(int i) {
            return new BetHistoryItem[i];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ BetHistoryItem(String str, String str2, String str3, Double d, String str4, Double d2, Double d3, Double d4, String str5, double d5, double d6, String str6, String str7, double d7, String str8, String str9, double d8, long j, double d9, String str10, String str11, double d10, String str12, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Double dValueOf = Double.valueOf(0.0d);
        this(str, str2, str3, (i & 8) != 0 ? dValueOf : d, str4, (i & 32) != 0 ? dValueOf : d2, (i & 64) != 0 ? dValueOf : d3, (i & 128) != 0 ? dValueOf : d4, str5, d5, d6, str6, str7, d7, str8, str9, d8, j, d9, str10, str11, d10, str12, z);
    }

    public static /* synthetic */ BetHistoryItem copy$default(BetHistoryItem betHistoryItem, String str, String str2, String str3, Double d, String str4, Double d2, Double d3, Double d4, String str5, double d5, double d6, String str6, String str7, double d7, String str8, String str9, double d8, long j, double d9, String str10, String str11, double d10, String str12, boolean z, int i, Object obj) {
        String str13 = (i & 1) != 0 ? betHistoryItem.userId : str;
        String str14 = (i & 2) != 0 ? betHistoryItem.roundId : str2;
        String str15 = (i & 4) != 0 ? betHistoryItem.roomId : str3;
        Double d11 = (i & 8) != 0 ? betHistoryItem.cashoutCoefficient : d;
        String str16 = (i & 16) != 0 ? betHistoryItem.sideBetType : str4;
        Double d12 = (i & 32) != 0 ? betHistoryItem.targetCoefficient : d2;
        Double d13 = (i & 64) != 0 ? betHistoryItem.startCoefficient : d3;
        Double d14 = (i & 128) != 0 ? betHistoryItem.endCoefficient : d4;
        String str17 = (i & 256) != 0 ? betHistoryItem.cashoutCoefficientStr : str5;
        double d15 = (i & 512) != 0 ? betHistoryItem.actualCreditedAmount : d5;
        double d16 = (i & 1024) != 0 ? betHistoryItem.actualDebitedAmount : d6;
        String str18 = (i & 2048) != 0 ? betHistoryItem.userPick : str6;
        String str19 = str13;
        String str20 = (i & 4096) != 0 ? betHistoryItem.currency : str7;
        String str21 = str14;
        double d17 = (i & 8192) != 0 ? betHistoryItem.houseCoefficient : d7;
        String str22 = (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? betHistoryItem.houseCoefficientStr : str8;
        return betHistoryItem.copy(str19, str21, str15, d11, str16, d12, d13, d14, str17, d15, d16, str18, str20, d17, str22, (32768 & i) != 0 ? betHistoryItem.decision : str9, (i & 65536) != 0 ? betHistoryItem.giftAmount : d8, (i & 131072) != 0 ? betHistoryItem.id : j, (i & 262144) != 0 ? betHistoryItem.payoutAmount : d9, (i & 524288) != 0 ? betHistoryItem.ticketId : str10, (i & 1048576) != 0 ? betHistoryItem.createdAt : str11, (i & 2097152) != 0 ? betHistoryItem.stakeAmount : d10, (i & 4194304) != 0 ? betHistoryItem.betIndex : str12, (i & 8388608) != 0 ? betHistoryItem.isExpanded : z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final double getActualCreditedAmount() {
        return this.actualCreditedAmount;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final double getActualDebitedAmount() {
        return this.actualDebitedAmount;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getUserPick() {
        return this.userPick;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final double getHouseCoefficient() {
        return this.houseCoefficient;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getHouseCoefficientStr() {
        return this.houseCoefficientStr;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getDecision() {
        return this.decision;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final double getGiftAmount() {
        return this.giftAmount;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final double getPayoutAmount() {
        return this.payoutAmount;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRoundId() {
        return this.roundId;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getTicketId() {
        return this.ticketId;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final double getStakeAmount() {
        return this.stakeAmount;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getBetIndex() {
        return this.betIndex;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final boolean getIsExpanded() {
        return this.isExpanded;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRoomId() {
        return this.roomId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Double getCashoutCoefficient() {
        return this.cashoutCoefficient;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSideBetType() {
        return this.sideBetType;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Double getTargetCoefficient() {
        return this.targetCoefficient;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Double getStartCoefficient() {
        return this.startCoefficient;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Double getEndCoefficient() {
        return this.endCoefficient;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getCashoutCoefficientStr() {
        return this.cashoutCoefficientStr;
    }

    public final BetHistoryItem copy(String userId, String roundId, String roomId, Double cashoutCoefficient, String sideBetType, Double targetCoefficient, Double startCoefficient, Double endCoefficient, String cashoutCoefficientStr, double actualCreditedAmount, double actualDebitedAmount, String userPick, String currency, double houseCoefficient, String houseCoefficientStr, String decision, double giftAmount, long id, double payoutAmount, String ticketId, String createdAt, double stakeAmount, String betIndex, boolean isExpanded) {
        qn4.b(userId, roundId, currency, ticketId, createdAt);
        betIndex.getClass();
        return new BetHistoryItem(userId, roundId, roomId, cashoutCoefficient, sideBetType, targetCoefficient, startCoefficient, endCoefficient, cashoutCoefficientStr, actualCreditedAmount, actualDebitedAmount, userPick, currency, houseCoefficient, houseCoefficientStr, decision, giftAmount, id, payoutAmount, ticketId, createdAt, stakeAmount, betIndex, isExpanded);
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
        return Intrinsics.g(this.userId, betHistoryItem.userId) && Intrinsics.g(this.roundId, betHistoryItem.roundId) && Intrinsics.g(this.roomId, betHistoryItem.roomId) && Intrinsics.g(this.cashoutCoefficient, betHistoryItem.cashoutCoefficient) && Intrinsics.g(this.sideBetType, betHistoryItem.sideBetType) && Intrinsics.g(this.targetCoefficient, betHistoryItem.targetCoefficient) && Intrinsics.g(this.startCoefficient, betHistoryItem.startCoefficient) && Intrinsics.g(this.endCoefficient, betHistoryItem.endCoefficient) && Intrinsics.g(this.cashoutCoefficientStr, betHistoryItem.cashoutCoefficientStr) && Double.compare(this.actualCreditedAmount, betHistoryItem.actualCreditedAmount) == 0 && Double.compare(this.actualDebitedAmount, betHistoryItem.actualDebitedAmount) == 0 && Intrinsics.g(this.userPick, betHistoryItem.userPick) && Intrinsics.g(this.currency, betHistoryItem.currency) && Double.compare(this.houseCoefficient, betHistoryItem.houseCoefficient) == 0 && Intrinsics.g(this.houseCoefficientStr, betHistoryItem.houseCoefficientStr) && Intrinsics.g(this.decision, betHistoryItem.decision) && Double.compare(this.giftAmount, betHistoryItem.giftAmount) == 0 && this.id == betHistoryItem.id && Double.compare(this.payoutAmount, betHistoryItem.payoutAmount) == 0 && Intrinsics.g(this.ticketId, betHistoryItem.ticketId) && Intrinsics.g(this.createdAt, betHistoryItem.createdAt) && Double.compare(this.stakeAmount, betHistoryItem.stakeAmount) == 0 && Intrinsics.g(this.betIndex, betHistoryItem.betIndex) && this.isExpanded == betHistoryItem.isExpanded;
    }

    public final double getActualCreditedAmount() {
        return this.actualCreditedAmount;
    }

    public final double getActualDebitedAmount() {
        return this.actualDebitedAmount;
    }

    public final String getBetIndex() {
        return this.betIndex;
    }

    public final Double getCashoutCoefficient() {
        return this.cashoutCoefficient;
    }

    public final String getCashoutCoefficientStr() {
        return this.cashoutCoefficientStr;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getDecision() {
        return this.decision;
    }

    public final Double getEndCoefficient() {
        return this.endCoefficient;
    }

    public final double getGiftAmount() {
        return this.giftAmount;
    }

    public final double getHouseCoefficient() {
        return this.houseCoefficient;
    }

    public final String getHouseCoefficientStr() {
        return this.houseCoefficientStr;
    }

    @Override // com.sportygames.commons.models.BetHistoryBase
    public long getId() {
        return this.id;
    }

    public final double getPayoutAmount() {
        return this.payoutAmount;
    }

    public final String getRoomId() {
        return this.roomId;
    }

    public final String getRoundId() {
        return this.roundId;
    }

    public final String getSideBetType() {
        return this.sideBetType;
    }

    public final double getStakeAmount() {
        return this.stakeAmount;
    }

    public final Double getStartCoefficient() {
        return this.startCoefficient;
    }

    public final Double getTargetCoefficient() {
        return this.targetCoefficient;
    }

    public final String getTicketId() {
        return this.ticketId;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUserPick() {
        return this.userPick;
    }

    public int hashCode() {
        int iA = gmf0.a(this.userId.hashCode() * 31, 31, this.roundId);
        String str = this.roomId;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        Double d = this.cashoutCoefficient;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        String str2 = this.sideBetType;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d2 = this.targetCoefficient;
        int iHashCode4 = (iHashCode3 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.startCoefficient;
        int iHashCode5 = (iHashCode4 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.endCoefficient;
        int iHashCode6 = (iHashCode5 + (d4 == null ? 0 : d4.hashCode())) * 31;
        String str3 = this.cashoutCoefficientStr;
        int iA2 = nrg0.a(nrg0.a((iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.actualCreditedAmount), 31, this.actualDebitedAmount);
        String str4 = this.userPick;
        int iA3 = nrg0.a(gmf0.a((iA2 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.currency), 31, this.houseCoefficient);
        String str5 = this.houseCoefficientStr;
        int iHashCode7 = (iA3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.decision;
        return Boolean.hashCode(this.isExpanded) + gmf0.a(nrg0.a(gmf0.a(gmf0.a(nrg0.a(f87.a(nrg0.a((iHashCode7 + (str6 != null ? str6.hashCode() : 0)) * 31, 31, this.giftAmount), this.id, 31), 31, this.payoutAmount), 31, this.ticketId), 31, this.createdAt), 31, this.stakeAmount), 31, this.betIndex);
    }

    @Override // com.sportygames.commons.models.BetHistoryBase
    public boolean isExpanded() {
        return this.isExpanded;
    }

    @Override // com.sportygames.commons.models.BetHistoryBase
    public void setExpanded(boolean z) {
        this.isExpanded = z;
    }

    public String toString() {
        String str = this.userId;
        String str2 = this.roundId;
        String str3 = this.roomId;
        Double d = this.cashoutCoefficient;
        String str4 = this.sideBetType;
        Double d2 = this.targetCoefficient;
        Double d3 = this.startCoefficient;
        Double d4 = this.endCoefficient;
        String str5 = this.cashoutCoefficientStr;
        double d5 = this.actualCreditedAmount;
        double d6 = this.actualDebitedAmount;
        String str6 = this.userPick;
        String str7 = this.currency;
        double d7 = this.houseCoefficient;
        String str8 = this.houseCoefficientStr;
        String str9 = this.decision;
        double d8 = this.giftAmount;
        long j = this.id;
        double d9 = this.payoutAmount;
        String str10 = this.ticketId;
        String str11 = this.createdAt;
        double d10 = this.stakeAmount;
        String str12 = this.betIndex;
        boolean z = this.isExpanded;
        StringBuilder sbA = ux5.a("BetHistoryItem(userId=", str, ", roundId=", str2, ", roomId=");
        k800.a(d, str3, ", cashoutCoefficient=", ", sideBetType=", sbA);
        k800.a(d2, str4, ", targetCoefficient=", ", startCoefficient=", sbA);
        s27.a(d3, d4, ", endCoefficient=", ", cashoutCoefficientStr=", sbA);
        sbA.append(str5);
        sbA.append(", actualCreditedAmount=");
        sbA.append(d5);
        hib0.b(d6, ", actualDebitedAmount=", ", userPick=", sbA);
        hxa.c(sbA, str6, ", currency=", str7, ", houseCoefficient=");
        fwv.a(d7, ", houseCoefficientStr=", str8, sbA);
        u4.a(sbA, ", decision=", str9, ", giftAmount=");
        sbA.append(d8);
        g41.a(j, ", id=", ", payoutAmount=", sbA);
        fwv.a(d9, ", ticketId=", str10, sbA);
        u4.a(sbA, ", createdAt=", str11, ", stakeAmount=");
        fwv.a(d10, ", betIndex=", str12, sbA);
        return w.a(sbA, ", isExpanded=", z, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.userId);
        dest.writeString(this.roundId);
        dest.writeString(this.roomId);
        Double d = this.cashoutCoefficient;
        if (d == null) {
            dest.writeInt(0);
        } else {
            vnk.a(dest, 1, d);
        }
        dest.writeString(this.sideBetType);
        Double d2 = this.targetCoefficient;
        if (d2 == null) {
            dest.writeInt(0);
        } else {
            vnk.a(dest, 1, d2);
        }
        Double d3 = this.startCoefficient;
        if (d3 == null) {
            dest.writeInt(0);
        } else {
            vnk.a(dest, 1, d3);
        }
        Double d4 = this.endCoefficient;
        if (d4 == null) {
            dest.writeInt(0);
        } else {
            vnk.a(dest, 1, d4);
        }
        dest.writeString(this.cashoutCoefficientStr);
        dest.writeDouble(this.actualCreditedAmount);
        dest.writeDouble(this.actualDebitedAmount);
        dest.writeString(this.userPick);
        dest.writeString(this.currency);
        dest.writeDouble(this.houseCoefficient);
        dest.writeString(this.houseCoefficientStr);
        dest.writeString(this.decision);
        dest.writeDouble(this.giftAmount);
        dest.writeLong(this.id);
        dest.writeDouble(this.payoutAmount);
        dest.writeString(this.ticketId);
        dest.writeString(this.createdAt);
        dest.writeDouble(this.stakeAmount);
        dest.writeString(this.betIndex);
        dest.writeInt(this.isExpanded ? 1 : 0);
    }

    public BetHistoryItem(String str, String str2, String str3, Double d, String str4, Double d2, Double d3, Double d4, String str5, double d5, double d6, String str6, String str7, double d7, String str8, String str9, double d8, long j, double d9, String str10, String str11, double d10, String str12, boolean z) {
        qn4.b(str, str2, str7, str10, str11);
        str12.getClass();
        this.userId = str;
        this.roundId = str2;
        this.roomId = str3;
        this.cashoutCoefficient = d;
        this.sideBetType = str4;
        this.targetCoefficient = d2;
        this.startCoefficient = d3;
        this.endCoefficient = d4;
        this.cashoutCoefficientStr = str5;
        this.actualCreditedAmount = d5;
        this.actualDebitedAmount = d6;
        this.userPick = str6;
        this.currency = str7;
        this.houseCoefficient = d7;
        this.houseCoefficientStr = str8;
        this.decision = str9;
        this.giftAmount = d8;
        this.id = j;
        this.payoutAmount = d9;
        this.ticketId = str10;
        this.createdAt = str11;
        this.stakeAmount = d10;
        this.betIndex = str12;
        this.isExpanded = z;
    }
}
