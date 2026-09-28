package com.sportygames.redblack.remote.models;

import defpackage.ai50;
import defpackage.f87;
import defpackage.gpp;
import defpackage.hib0;
import defpackage.nrg0;
import defpackage.v9d;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b%\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001d\u0010,\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007HÆ\u0003J\t\u0010-\u001a\u00020\tHÆ\u0003J\t\u0010.\u001a\u00020\u0006HÆ\u0003J\t\u0010/\u001a\u00020\u0006HÆ\u0003J\t\u00100\u001a\u00020\rHÆ\u0003J\t\u00101\u001a\u00020\u0006HÆ\u0003J\u000f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010HÆ\u0003J\u000f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00130\u0010HÆ\u0003J\u0085\u0001\u00104\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u001c\b\u0002\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0010HÆ\u0001J\u0013\u00105\u001a\u00020\u00132\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00107\u001a\u00020\rHÖ\u0001J\t\u00108\u001a\u000209HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R.\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0011\u0010\u000e\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b'\u0010!R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0010¢\u0006\b\n\u0000\u001a\u0004\b*\u0010)¨\u0006:"}, d2 = {"Lcom/sportygames/redblack/remote/models/RoundInitializeResponse;", "", "betAmountVO", "Lcom/sportygames/redblack/remote/models/BetAmountVO;", "betChipList", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "roundId", "", "totalRoundPayouts", "totalRoundWinnings", "turnId", "", "userBalance", "userHistory", "", "Lcom/sportygames/redblack/remote/models/UserCard;", "userWinStatusHistory", "", "<init>", "(Lcom/sportygames/redblack/remote/models/BetAmountVO;Ljava/util/ArrayList;JDDIDLjava/util/List;Ljava/util/List;)V", "getBetAmountVO", "()Lcom/sportygames/redblack/remote/models/BetAmountVO;", "setBetAmountVO", "(Lcom/sportygames/redblack/remote/models/BetAmountVO;)V", "getBetChipList", "()Ljava/util/ArrayList;", "setBetChipList", "(Ljava/util/ArrayList;)V", "getRoundId", "()J", "getTotalRoundPayouts", "()D", "getTotalRoundWinnings", "getTurnId", "()I", "setTurnId", "(I)V", "getUserBalance", "getUserHistory", "()Ljava/util/List;", "getUserWinStatusHistory", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RoundInitializeResponse {
    public static final int $stable = 8;
    private BetAmountVO betAmountVO;
    private ArrayList<Double> betChipList;
    private final long roundId;
    private final double totalRoundPayouts;
    private final double totalRoundWinnings;
    private int turnId;
    private final double userBalance;
    private final List<UserCard> userHistory;
    private final List<Boolean> userWinStatusHistory;

    public /* synthetic */ RoundInitializeResponse(BetAmountVO betAmountVO, ArrayList arrayList, long j, double d, double d2, int i, double d3, List list, List list2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(betAmountVO, arrayList, j, d, d2, (i2 & 32) != 0 ? 0 : i, d3, list, list2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RoundInitializeResponse copy$default(RoundInitializeResponse roundInitializeResponse, BetAmountVO betAmountVO, ArrayList arrayList, long j, double d, double d2, int i, double d3, List list, List list2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            betAmountVO = roundInitializeResponse.betAmountVO;
        }
        return roundInitializeResponse.copy(betAmountVO, (i2 & 2) != 0 ? roundInitializeResponse.betChipList : arrayList, (i2 & 4) != 0 ? roundInitializeResponse.roundId : j, (i2 & 8) != 0 ? roundInitializeResponse.totalRoundPayouts : d, (i2 & 16) != 0 ? roundInitializeResponse.totalRoundWinnings : d2, (i2 & 32) != 0 ? roundInitializeResponse.turnId : i, (i2 & 64) != 0 ? roundInitializeResponse.userBalance : d3, (i2 & 128) != 0 ? roundInitializeResponse.userHistory : list, (i2 & 256) != 0 ? roundInitializeResponse.userWinStatusHistory : list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BetAmountVO getBetAmountVO() {
        return this.betAmountVO;
    }

    public final ArrayList<Double> component2() {
        return this.betChipList;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getRoundId() {
        return this.roundId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getTotalRoundPayouts() {
        return this.totalRoundPayouts;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final double getTotalRoundWinnings() {
        return this.totalRoundWinnings;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getTurnId() {
        return this.turnId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final double getUserBalance() {
        return this.userBalance;
    }

    public final List<UserCard> component8() {
        return this.userHistory;
    }

    public final List<Boolean> component9() {
        return this.userWinStatusHistory;
    }

    public final RoundInitializeResponse copy(BetAmountVO betAmountVO, ArrayList<Double> betChipList, long roundId, double totalRoundPayouts, double totalRoundWinnings, int turnId, double userBalance, List<UserCard> userHistory, List<Boolean> userWinStatusHistory) {
        userHistory.getClass();
        userWinStatusHistory.getClass();
        return new RoundInitializeResponse(betAmountVO, betChipList, roundId, totalRoundPayouts, totalRoundWinnings, turnId, userBalance, userHistory, userWinStatusHistory);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RoundInitializeResponse)) {
            return false;
        }
        RoundInitializeResponse roundInitializeResponse = (RoundInitializeResponse) other;
        return Intrinsics.g(this.betAmountVO, roundInitializeResponse.betAmountVO) && Intrinsics.g(this.betChipList, roundInitializeResponse.betChipList) && this.roundId == roundInitializeResponse.roundId && Double.compare(this.totalRoundPayouts, roundInitializeResponse.totalRoundPayouts) == 0 && Double.compare(this.totalRoundWinnings, roundInitializeResponse.totalRoundWinnings) == 0 && this.turnId == roundInitializeResponse.turnId && Double.compare(this.userBalance, roundInitializeResponse.userBalance) == 0 && Intrinsics.g(this.userHistory, roundInitializeResponse.userHistory) && Intrinsics.g(this.userWinStatusHistory, roundInitializeResponse.userWinStatusHistory);
    }

    public final BetAmountVO getBetAmountVO() {
        return this.betAmountVO;
    }

    public final ArrayList<Double> getBetChipList() {
        return this.betChipList;
    }

    public final long getRoundId() {
        return this.roundId;
    }

    public final double getTotalRoundPayouts() {
        return this.totalRoundPayouts;
    }

    public final double getTotalRoundWinnings() {
        return this.totalRoundWinnings;
    }

    public final int getTurnId() {
        return this.turnId;
    }

    public final double getUserBalance() {
        return this.userBalance;
    }

    public final List<UserCard> getUserHistory() {
        return this.userHistory;
    }

    public final List<Boolean> getUserWinStatusHistory() {
        return this.userWinStatusHistory;
    }

    public int hashCode() {
        BetAmountVO betAmountVO = this.betAmountVO;
        int iHashCode = (betAmountVO == null ? 0 : betAmountVO.hashCode()) * 31;
        ArrayList<Double> arrayList = this.betChipList;
        return this.userWinStatusHistory.hashCode() + ai50.a(nrg0.a(gpp.a(this.turnId, nrg0.a(nrg0.a(f87.a((iHashCode + (arrayList != null ? arrayList.hashCode() : 0)) * 31, this.roundId, 31), 31, this.totalRoundPayouts), 31, this.totalRoundWinnings), 31), 31, this.userBalance), 31, this.userHistory);
    }

    public final void setBetAmountVO(BetAmountVO betAmountVO) {
        this.betAmountVO = betAmountVO;
    }

    public final void setBetChipList(ArrayList<Double> arrayList) {
        this.betChipList = arrayList;
    }

    public final void setTurnId(int i) {
        this.turnId = i;
    }

    public String toString() {
        BetAmountVO betAmountVO = this.betAmountVO;
        ArrayList<Double> arrayList = this.betChipList;
        long j = this.roundId;
        double d = this.totalRoundPayouts;
        double d2 = this.totalRoundWinnings;
        int i = this.turnId;
        double d3 = this.userBalance;
        List<UserCard> list = this.userHistory;
        List<Boolean> list2 = this.userWinStatusHistory;
        StringBuilder sb = new StringBuilder("RoundInitializeResponse(betAmountVO=");
        sb.append(betAmountVO);
        sb.append(", betChipList=");
        sb.append(arrayList);
        sb.append(", roundId=");
        sb.append(j);
        hib0.b(d, ", totalRoundPayouts=", ", totalRoundWinnings=", sb);
        sb.append(d2);
        sb.append(", turnId=");
        sb.append(i);
        hib0.b(d3, ", userBalance=", ", userHistory=", sb);
        return v9d.a(", userWinStatusHistory=", ")", sb, list, list2);
    }

    public RoundInitializeResponse(BetAmountVO betAmountVO, ArrayList<Double> arrayList, long j, double d, double d2, int i, double d3, List<UserCard> list, List<Boolean> list2) {
        list.getClass();
        list2.getClass();
        this.betAmountVO = betAmountVO;
        this.betChipList = arrayList;
        this.roundId = j;
        this.totalRoundPayouts = d;
        this.totalRoundWinnings = d2;
        this.turnId = i;
        this.userBalance = d3;
        this.userHistory = list;
        this.userWinStatusHistory = list2;
    }
}
