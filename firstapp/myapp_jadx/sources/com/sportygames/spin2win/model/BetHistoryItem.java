package com.sportygames.spin2win.model;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportygames.commons.models.BetHistoryBase;
import defpackage.lsv;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b+\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\t\u00100\u001a\u00020\u0003HÆ\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u00102\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u00103\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u00104\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010#J\u000b\u00105\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0010\u00107\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u00108\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u00109\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0011\u0010:\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003J\t\u0010;\u001a\u00020\u0014HÆ\u0003J \u0001\u0010<\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u0014HÆ\u0001¢\u0006\u0002\u0010=J\u0013\u0010>\u001a\u00020\u00142\b\u0010?\u001a\u0004\u0018\u00010@HÖ\u0003J\t\u0010A\u001a\u00020\tHÖ\u0001J\t\u0010B\u001a\u00020\u000bHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010 \u001a\u0004\b!\u0010\u001fR\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b'\u0010&R\u0015\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010 \u001a\u0004\b(\u0010\u001fR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010 \u001a\u0004\b)\u0010\u001fR\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010 \u001a\u0004\b*\u0010\u001fR\u0019\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u001a\u0010\u0013\u001a\u00020\u0014X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010-\"\u0004\b.\u0010/¨\u0006C"}, d2 = {"Lcom/sportygames/spin2win/model/BetHistoryItem;", "Lcom/sportygames/commons/models/BetHistoryBase;", AnalyticsParam.EVENT_PARAM_ID, "", "roundId", "totalStake", "", "totalPayout", "houseDraw", "", "ticketId", "", "startTime", "giftAmount", "actualPaidAmount", "actualPayoutAmount", "individualBetDetailsList", "", "Lcom/sportygames/spin2win/model/IndividualBetDetails;", "isExpanded", "", "<init>", "(JLjava/lang/Long;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/List;Z)V", "getId", "()J", "setId", "(J)V", "getRoundId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getTotalStake", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getTotalPayout", "getHouseDraw", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTicketId", "()Ljava/lang/String;", "getStartTime", "getGiftAmount", "getActualPaidAmount", "getActualPayoutAmount", "getIndividualBetDetailsList", "()Ljava/util/List;", "()Z", "setExpanded", "(Z)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(JLjava/lang/Long;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/List;Z)Lcom/sportygames/spin2win/model/BetHistoryItem;", "equals", "other", "", "hashCode", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BetHistoryItem implements BetHistoryBase {
    public static final int $stable = 8;
    private final Double actualPaidAmount;
    private final Double actualPayoutAmount;
    private final Double giftAmount;
    private final Integer houseDraw;
    private long id;
    private final List<IndividualBetDetails> individualBetDetailsList;
    private boolean isExpanded;
    private final Long roundId;
    private final String startTime;
    private final String ticketId;
    private final Double totalPayout;
    private final Double totalStake;

    public BetHistoryItem(long j, Long l, Double d, Double d2, Integer num, String str, String str2, Double d3, Double d4, Double d5, List<IndividualBetDetails> list, boolean z) {
        this.id = j;
        this.roundId = l;
        this.totalStake = d;
        this.totalPayout = d2;
        this.houseDraw = num;
        this.ticketId = str;
        this.startTime = str2;
        this.giftAmount = d3;
        this.actualPaidAmount = d4;
        this.actualPayoutAmount = d5;
        this.individualBetDetailsList = list;
        this.isExpanded = z;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Double getActualPayoutAmount() {
        return this.actualPayoutAmount;
    }

    public final List<IndividualBetDetails> component11() {
        return this.individualBetDetailsList;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final boolean getIsExpanded() {
        return this.isExpanded;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getRoundId() {
        return this.roundId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Double getTotalStake() {
        return this.totalStake;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Double getTotalPayout() {
        return this.totalPayout;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getHouseDraw() {
        return this.houseDraw;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTicketId() {
        return this.ticketId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Double getGiftAmount() {
        return this.giftAmount;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Double getActualPaidAmount() {
        return this.actualPaidAmount;
    }

    public final BetHistoryItem copy(long id, Long roundId, Double totalStake, Double totalPayout, Integer houseDraw, String ticketId, String startTime, Double giftAmount, Double actualPaidAmount, Double actualPayoutAmount, List<IndividualBetDetails> individualBetDetailsList, boolean isExpanded) {
        return new BetHistoryItem(id, roundId, totalStake, totalPayout, houseDraw, ticketId, startTime, giftAmount, actualPaidAmount, actualPayoutAmount, individualBetDetailsList, isExpanded);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BetHistoryItem)) {
            return false;
        }
        BetHistoryItem betHistoryItem = (BetHistoryItem) other;
        return this.id == betHistoryItem.id && Intrinsics.g(this.roundId, betHistoryItem.roundId) && Intrinsics.g(this.totalStake, betHistoryItem.totalStake) && Intrinsics.g(this.totalPayout, betHistoryItem.totalPayout) && Intrinsics.g(this.houseDraw, betHistoryItem.houseDraw) && Intrinsics.g(this.ticketId, betHistoryItem.ticketId) && Intrinsics.g(this.startTime, betHistoryItem.startTime) && Intrinsics.g(this.giftAmount, betHistoryItem.giftAmount) && Intrinsics.g(this.actualPaidAmount, betHistoryItem.actualPaidAmount) && Intrinsics.g(this.actualPayoutAmount, betHistoryItem.actualPayoutAmount) && Intrinsics.g(this.individualBetDetailsList, betHistoryItem.individualBetDetailsList) && this.isExpanded == betHistoryItem.isExpanded;
    }

    public final Double getActualPaidAmount() {
        return this.actualPaidAmount;
    }

    public final Double getActualPayoutAmount() {
        return this.actualPayoutAmount;
    }

    public final Double getGiftAmount() {
        return this.giftAmount;
    }

    public final Integer getHouseDraw() {
        return this.houseDraw;
    }

    @Override // com.sportygames.commons.models.BetHistoryBase
    public long getId() {
        return this.id;
    }

    public final List<IndividualBetDetails> getIndividualBetDetailsList() {
        return this.individualBetDetailsList;
    }

    public final Long getRoundId() {
        return this.roundId;
    }

    public final String getStartTime() {
        return this.startTime;
    }

    public final String getTicketId() {
        return this.ticketId;
    }

    public final Double getTotalPayout() {
        return this.totalPayout;
    }

    public final Double getTotalStake() {
        return this.totalStake;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.id) * 31;
        Long l = this.roundId;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Double d = this.totalStake;
        int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.totalPayout;
        int iHashCode4 = (iHashCode3 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Integer num = this.houseDraw;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.ticketId;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.startTime;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d3 = this.giftAmount;
        int iHashCode8 = (iHashCode7 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.actualPaidAmount;
        int iHashCode9 = (iHashCode8 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Double d5 = this.actualPayoutAmount;
        int iHashCode10 = (iHashCode9 + (d5 == null ? 0 : d5.hashCode())) * 31;
        List<IndividualBetDetails> list = this.individualBetDetailsList;
        return Boolean.hashCode(this.isExpanded) + ((iHashCode10 + (list != null ? list.hashCode() : 0)) * 31);
    }

    @Override // com.sportygames.commons.models.BetHistoryBase
    public boolean isExpanded() {
        return this.isExpanded;
    }

    @Override // com.sportygames.commons.models.BetHistoryBase
    public void setExpanded(boolean z) {
        this.isExpanded = z;
    }

    public void setId(long j) {
        this.id = j;
    }

    public String toString() {
        long j = this.id;
        Long l = this.roundId;
        Double d = this.totalStake;
        Double d2 = this.totalPayout;
        Integer num = this.houseDraw;
        String str = this.ticketId;
        String str2 = this.startTime;
        Double d3 = this.giftAmount;
        Double d4 = this.actualPaidAmount;
        Double d5 = this.actualPayoutAmount;
        List<IndividualBetDetails> list = this.individualBetDetailsList;
        boolean z = this.isExpanded;
        StringBuilder sb = new StringBuilder("BetHistoryItem(id=");
        sb.append(j);
        sb.append(", roundId=");
        sb.append(l);
        lsv.a(d, d2, ", totalStake=", ", totalPayout=", sb);
        sb.append(", houseDraw=");
        sb.append(num);
        sb.append(", ticketId=");
        sb.append(str);
        sb.append(", startTime=");
        sb.append(str2);
        sb.append(", giftAmount=");
        sb.append(d3);
        lsv.a(d4, d5, ", actualPaidAmount=", ", actualPayoutAmount=", sb);
        sb.append(", individualBetDetailsList=");
        sb.append(list);
        sb.append(", isExpanded=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }
}
