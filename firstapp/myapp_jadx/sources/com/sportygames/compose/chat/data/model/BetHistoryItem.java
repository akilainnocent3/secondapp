package com.sportygames.compose.chat.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.gmf0;
import defpackage.j26;
import defpackage.nrg0;
import defpackage.qn4;
import defpackage.vnk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\bM\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bã\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\t\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0016\u001a\u00020\t\u0012\u0006\u0010\u0017\u001a\u00020\u0005\u0012\u0006\u0010\u0018\u001a\u00020\t\u0012\u0006\u0010\u0019\u001a\u00020\u0005\u0012\u0006\u0010\u001a\u001a\u00020\u0005\u0012\u0006\u0010\u001b\u001a\u00020\t\u0012\u0006\u0010\u001c\u001a\u00020\u0005¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0005HÆ\u0003J\t\u0010>\u001a\u00020\u0005HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010@\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010&J\u000b\u0010A\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010B\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010&J\u0010\u0010C\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010&J\u0010\u0010D\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010&J\u000b\u0010E\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010F\u001a\u00020\tHÆ\u0003J\t\u0010G\u001a\u00020\tHÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010I\u001a\u00020\u0005HÆ\u0003J\t\u0010J\u001a\u00020\tHÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010M\u001a\u00020\tHÆ\u0003J\t\u0010N\u001a\u00020\u0005HÆ\u0003J\t\u0010O\u001a\u00020\tHÆ\u0003J\t\u0010P\u001a\u00020\u0005HÆ\u0003J\t\u0010Q\u001a\u00020\u0005HÆ\u0003J\t\u0010R\u001a\u00020\tHÆ\u0003J\t\u0010S\u001a\u00020\u0005HÆ\u0003J\u0092\u0002\u0010T\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\t2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0016\u001a\u00020\t2\b\b\u0002\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001b\u001a\u00020\t2\b\b\u0002\u0010\u001c\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010UJ\u0006\u0010V\u001a\u00020WJ\u0013\u0010X\u001a\u00020Y2\b\u0010Z\u001a\u0004\u0018\u00010[HÖ\u0003J\t\u0010\\\u001a\u00020WHÖ\u0001J\t\u0010]\u001a\u00020\u0005HÖ\u0001J\u0016\u0010^\u001a\u00020_2\u0006\u0010`\u001a\u00020a2\u0006\u0010b\u001a\u00020WR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\"R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010'\u001a\u0004\b%\u0010&R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\"R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010'\u001a\u0004\b)\u0010&R\u0015\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010'\u001a\u0004\b*\u0010&R\u0015\u0010\r\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010'\u001a\u0004\b+\u0010&R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\"R\u0011\u0010\u000f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\u0010\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b/\u0010.R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\"R\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\"R\u0011\u0010\u0013\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b2\u0010.R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\"R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\"R\u0011\u0010\u0016\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b5\u0010.R\u0011\u0010\u0017\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\"R\u0011\u0010\u0018\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b7\u0010.R\u0011\u0010\u0019\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b8\u0010\"R\u0011\u0010\u001a\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b9\u0010\"R\u0011\u0010\u001b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b:\u0010.R\u0011\u0010\u001c\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b;\u0010\"¨\u0006c"}, d2 = {"Lcom/sportygames/compose/chat/data/model/BetHistoryItem;", "Landroid/os/Parcelable;", AnalyticsParam.EVENT_PARAM_ID, "", "userId", "", "roundId", "roomId", "cashoutCoefficient", "", "sideBetType", "targetCoefficient", "startCoefficient", "endCoefficient", "cashoutCoefficientStr", "actualCreditedAmount", "actualDebitedAmount", "userPick", "currency", "houseCoefficient", "houseCoefficientStr", "decision", "giftAmount", "ticketStatus", "payoutAmount", "ticketId", "createdAt", "stakeAmount", "betIndex", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;DDLjava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;DLjava/lang/String;DLjava/lang/String;Ljava/lang/String;DLjava/lang/String;)V", "getId", "()J", "getUserId", "()Ljava/lang/String;", "getRoundId", "getRoomId", "getCashoutCoefficient", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getSideBetType", "getTargetCoefficient", "getStartCoefficient", "getEndCoefficient", "getCashoutCoefficientStr", "getActualCreditedAmount", "()D", "getActualDebitedAmount", "getUserPick", "getCurrency", "getHouseCoefficient", "getHouseCoefficientStr", "getDecision", "getGiftAmount", "getTicketStatus", "getPayoutAmount", "getTicketId", "getCreatedAt", "getStakeAmount", "getBetIndex", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "copy", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;DDLjava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;DLjava/lang/String;DLjava/lang/String;Ljava/lang/String;DLjava/lang/String;)Lcom/sportygames/compose/chat/data/model/BetHistoryItem;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "compose-chat_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BetHistoryItem implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<BetHistoryItem> CREATOR = new a();
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
    private final double payoutAmount;
    private final String roomId;
    private final String roundId;
    private final String sideBetType;
    private final double stakeAmount;
    private final Double startCoefficient;
    private final Double targetCoefficient;
    private final String ticketId;
    private final String ticketStatus;
    private final String userId;
    private final String userPick;

    public static final class a implements Parcelable.Creator<BetHistoryItem> {
        @Override // android.os.Parcelable.Creator
        public final BetHistoryItem createFromParcel(Parcel parcel) {
            Double dValueOf;
            Double dValueOf2;
            parcel.getClass();
            long j = parcel.readLong();
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
            return new BetHistoryItem(j, string, string2, string3, dValueOf, string4, dValueOf3, dValueOf4, dValueOf2, parcel.readString(), parcel.readDouble(), parcel.readDouble(), parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readString(), parcel.readDouble(), parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BetHistoryItem[] newArray(int i) {
            return new BetHistoryItem[i];
        }
    }

    public BetHistoryItem(long j, String str, String str2, String str3, Double d, String str4, Double d2, Double d3, Double d4, String str5, double d5, double d6, String str6, String str7, double d7, String str8, String str9, double d8, String str10, double d9, String str11, String str12, double d10, String str13) {
        qn4.b(str, str2, str7, str10, str11);
        str12.getClass();
        str13.getClass();
        this.id = j;
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
        this.ticketStatus = str10;
        this.payoutAmount = d9;
        this.ticketId = str11;
        this.createdAt = str12;
        this.stakeAmount = d10;
        this.betIndex = str13;
    }

    public static /* synthetic */ BetHistoryItem copy$default(BetHistoryItem betHistoryItem, long j, String str, String str2, String str3, Double d, String str4, Double d2, Double d3, Double d4, String str5, double d5, double d6, String str6, String str7, double d7, String str8, String str9, double d8, String str10, double d9, String str11, String str12, double d10, String str13, int i, Object obj) {
        String str14;
        double d11;
        long j2 = (i & 1) != 0 ? betHistoryItem.id : j;
        String str15 = (i & 2) != 0 ? betHistoryItem.userId : str;
        String str16 = (i & 4) != 0 ? betHistoryItem.roundId : str2;
        String str17 = (i & 8) != 0 ? betHistoryItem.roomId : str3;
        Double d12 = (i & 16) != 0 ? betHistoryItem.cashoutCoefficient : d;
        String str18 = (i & 32) != 0 ? betHistoryItem.sideBetType : str4;
        Double d13 = (i & 64) != 0 ? betHistoryItem.targetCoefficient : d2;
        Double d14 = (i & 128) != 0 ? betHistoryItem.startCoefficient : d3;
        Double d15 = (i & 256) != 0 ? betHistoryItem.endCoefficient : d4;
        String str19 = (i & 512) != 0 ? betHistoryItem.cashoutCoefficientStr : str5;
        double d16 = (i & 1024) != 0 ? betHistoryItem.actualCreditedAmount : d5;
        double d17 = (i & 2048) != 0 ? betHistoryItem.actualDebitedAmount : d6;
        String str20 = (i & 4096) != 0 ? betHistoryItem.userPick : str6;
        String str21 = (i & 8192) != 0 ? betHistoryItem.currency : str7;
        String str22 = str20;
        double d18 = (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? betHistoryItem.houseCoefficient : d7;
        String str23 = (i & 32768) != 0 ? betHistoryItem.houseCoefficientStr : str8;
        String str24 = (i & 65536) != 0 ? betHistoryItem.decision : str9;
        double d19 = (i & 131072) != 0 ? betHistoryItem.giftAmount : d8;
        String str25 = (i & 262144) != 0 ? betHistoryItem.ticketStatus : str10;
        double d20 = (i & 524288) != 0 ? betHistoryItem.payoutAmount : d9;
        String str26 = (i & 1048576) != 0 ? betHistoryItem.ticketId : str11;
        String str27 = (i & 2097152) != 0 ? betHistoryItem.createdAt : str12;
        double d21 = (i & 4194304) != 0 ? betHistoryItem.stakeAmount : d10;
        if ((i & 8388608) != 0) {
            d11 = d21;
            str14 = betHistoryItem.betIndex;
        } else {
            str14 = str13;
            d11 = d21;
        }
        return betHistoryItem.copy(j2, str15, str16, str17, d12, str18, d13, d14, d15, str19, d16, d17, str22, str21, d18, str23, str24, d19, str25, d20, str26, str27, d11, str14);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getCashoutCoefficientStr() {
        return this.cashoutCoefficientStr;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final double getActualCreditedAmount() {
        return this.actualCreditedAmount;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final double getActualDebitedAmount() {
        return this.actualDebitedAmount;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getUserPick() {
        return this.userPick;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final double getHouseCoefficient() {
        return this.houseCoefficient;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getHouseCoefficientStr() {
        return this.houseCoefficientStr;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getDecision() {
        return this.decision;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final double getGiftAmount() {
        return this.giftAmount;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getTicketStatus() {
        return this.ticketStatus;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final double getPayoutAmount() {
        return this.payoutAmount;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getTicketId() {
        return this.ticketId;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final double getStakeAmount() {
        return this.stakeAmount;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getBetIndex() {
        return this.betIndex;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRoundId() {
        return this.roundId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getRoomId() {
        return this.roomId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Double getCashoutCoefficient() {
        return this.cashoutCoefficient;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSideBetType() {
        return this.sideBetType;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Double getTargetCoefficient() {
        return this.targetCoefficient;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Double getStartCoefficient() {
        return this.startCoefficient;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Double getEndCoefficient() {
        return this.endCoefficient;
    }

    public final BetHistoryItem copy(long id, String userId, String roundId, String roomId, Double cashoutCoefficient, String sideBetType, Double targetCoefficient, Double startCoefficient, Double endCoefficient, String cashoutCoefficientStr, double actualCreditedAmount, double actualDebitedAmount, String userPick, String currency, double houseCoefficient, String houseCoefficientStr, String decision, double giftAmount, String ticketStatus, double payoutAmount, String ticketId, String createdAt, double stakeAmount, String betIndex) {
        qn4.b(userId, roundId, currency, ticketStatus, ticketId);
        createdAt.getClass();
        betIndex.getClass();
        return new BetHistoryItem(id, userId, roundId, roomId, cashoutCoefficient, sideBetType, targetCoefficient, startCoefficient, endCoefficient, cashoutCoefficientStr, actualCreditedAmount, actualDebitedAmount, userPick, currency, houseCoefficient, houseCoefficientStr, decision, giftAmount, ticketStatus, payoutAmount, ticketId, createdAt, stakeAmount, betIndex);
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
        return this.id == betHistoryItem.id && Intrinsics.g(this.userId, betHistoryItem.userId) && Intrinsics.g(this.roundId, betHistoryItem.roundId) && Intrinsics.g(this.roomId, betHistoryItem.roomId) && Intrinsics.g(this.cashoutCoefficient, betHistoryItem.cashoutCoefficient) && Intrinsics.g(this.sideBetType, betHistoryItem.sideBetType) && Intrinsics.g(this.targetCoefficient, betHistoryItem.targetCoefficient) && Intrinsics.g(this.startCoefficient, betHistoryItem.startCoefficient) && Intrinsics.g(this.endCoefficient, betHistoryItem.endCoefficient) && Intrinsics.g(this.cashoutCoefficientStr, betHistoryItem.cashoutCoefficientStr) && Double.compare(this.actualCreditedAmount, betHistoryItem.actualCreditedAmount) == 0 && Double.compare(this.actualDebitedAmount, betHistoryItem.actualDebitedAmount) == 0 && Intrinsics.g(this.userPick, betHistoryItem.userPick) && Intrinsics.g(this.currency, betHistoryItem.currency) && Double.compare(this.houseCoefficient, betHistoryItem.houseCoefficient) == 0 && Intrinsics.g(this.houseCoefficientStr, betHistoryItem.houseCoefficientStr) && Intrinsics.g(this.decision, betHistoryItem.decision) && Double.compare(this.giftAmount, betHistoryItem.giftAmount) == 0 && Intrinsics.g(this.ticketStatus, betHistoryItem.ticketStatus) && Double.compare(this.payoutAmount, betHistoryItem.payoutAmount) == 0 && Intrinsics.g(this.ticketId, betHistoryItem.ticketId) && Intrinsics.g(this.createdAt, betHistoryItem.createdAt) && Double.compare(this.stakeAmount, betHistoryItem.stakeAmount) == 0 && Intrinsics.g(this.betIndex, betHistoryItem.betIndex);
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

    public final long getId() {
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

    public final String getTicketStatus() {
        return this.ticketStatus;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUserPick() {
        return this.userPick;
    }

    public int hashCode() {
        int iA = gmf0.a(gmf0.a(Long.hashCode(this.id) * 31, 31, this.userId), 31, this.roundId);
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
        return this.betIndex.hashCode() + nrg0.a(gmf0.a(gmf0.a(nrg0.a(gmf0.a(nrg0.a((iHashCode7 + (str6 != null ? str6.hashCode() : 0)) * 31, 31, this.giftAmount), 31, this.ticketStatus), 31, this.payoutAmount), 31, this.ticketId), 31, this.createdAt), 31, this.stakeAmount);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BetHistoryItem(id=");
        sb.append(this.id);
        sb.append(", userId=");
        sb.append(this.userId);
        sb.append(", roundId=");
        sb.append(this.roundId);
        sb.append(", roomId=");
        sb.append(this.roomId);
        sb.append(", cashoutCoefficient=");
        sb.append(this.cashoutCoefficient);
        sb.append(", sideBetType=");
        sb.append(this.sideBetType);
        sb.append(", targetCoefficient=");
        sb.append(this.targetCoefficient);
        sb.append(", startCoefficient=");
        sb.append(this.startCoefficient);
        sb.append(", endCoefficient=");
        sb.append(this.endCoefficient);
        sb.append(", cashoutCoefficientStr=");
        sb.append(this.cashoutCoefficientStr);
        sb.append(", actualCreditedAmount=");
        sb.append(this.actualCreditedAmount);
        sb.append(", actualDebitedAmount=");
        sb.append(this.actualDebitedAmount);
        sb.append(", userPick=");
        sb.append(this.userPick);
        sb.append(", currency=");
        sb.append(this.currency);
        sb.append(", houseCoefficient=");
        sb.append(this.houseCoefficient);
        sb.append(", houseCoefficientStr=");
        sb.append(this.houseCoefficientStr);
        sb.append(", decision=");
        sb.append(this.decision);
        sb.append(", giftAmount=");
        sb.append(this.giftAmount);
        sb.append(", ticketStatus=");
        sb.append(this.ticketStatus);
        sb.append(", payoutAmount=");
        sb.append(this.payoutAmount);
        sb.append(", ticketId=");
        sb.append(this.ticketId);
        sb.append(", createdAt=");
        sb.append(this.createdAt);
        sb.append(", stakeAmount=");
        sb.append(this.stakeAmount);
        sb.append(", betIndex=");
        return j26.a(sb, this.betIndex, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeLong(this.id);
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
        dest.writeString(this.ticketStatus);
        dest.writeDouble(this.payoutAmount);
        dest.writeString(this.ticketId);
        dest.writeString(this.createdAt);
        dest.writeDouble(this.stakeAmount);
        dest.writeString(this.betIndex);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ BetHistoryItem(long j, String str, String str2, String str3, Double d, String str4, Double d2, Double d3, Double d4, String str5, double d5, double d6, String str6, String str7, double d7, String str8, String str9, double d8, String str10, double d9, String str11, String str12, double d10, String str13, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Double dValueOf = Double.valueOf(0.0d);
        this(j, str, str2, str3, (i & 16) != 0 ? dValueOf : d, str4, (i & 64) != 0 ? dValueOf : d2, (i & 128) != 0 ? dValueOf : d3, (i & 256) != 0 ? dValueOf : d4, str5, d5, d6, str6, str7, d7, str8, str9, d8, str10, d9, str11, str12, d10, str13);
    }
}
