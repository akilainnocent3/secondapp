package com.sportygames.redblack.remote.models;

import defpackage.f87;
import defpackage.nl;
import defpackage.to10;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u0019\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J\t\u0010\u0019\u001a\u00020\u000bHÆ\u0003JA\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u000bHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR!\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006!"}, d2 = {"Lcom/sportygames/redblack/remote/models/FetchBetAmountResponse;", "", "betAmountVO", "Lcom/sportygames/redblack/remote/models/BetAmountVO;", "betChipList", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "roundId", "", "turnId", "", "<init>", "(Lcom/sportygames/redblack/remote/models/BetAmountVO;Ljava/util/ArrayList;JI)V", "getBetAmountVO", "()Lcom/sportygames/redblack/remote/models/BetAmountVO;", "getBetChipList", "()Ljava/util/ArrayList;", "getRoundId", "()J", "getTurnId", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FetchBetAmountResponse {
    public static final int $stable = 8;
    private final BetAmountVO betAmountVO;
    private final ArrayList<Double> betChipList;
    private final long roundId;
    private final int turnId;

    public FetchBetAmountResponse(BetAmountVO betAmountVO, ArrayList<Double> arrayList, long j, int i) {
        betAmountVO.getClass();
        arrayList.getClass();
        this.betAmountVO = betAmountVO;
        this.betChipList = arrayList;
        this.roundId = j;
        this.turnId = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FetchBetAmountResponse copy$default(FetchBetAmountResponse fetchBetAmountResponse, BetAmountVO betAmountVO, ArrayList arrayList, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            betAmountVO = fetchBetAmountResponse.betAmountVO;
        }
        if ((i2 & 2) != 0) {
            arrayList = fetchBetAmountResponse.betChipList;
        }
        if ((i2 & 4) != 0) {
            j = fetchBetAmountResponse.roundId;
        }
        if ((i2 & 8) != 0) {
            i = fetchBetAmountResponse.turnId;
        }
        int i3 = i;
        return fetchBetAmountResponse.copy(betAmountVO, arrayList, j, i3);
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
    public final int getTurnId() {
        return this.turnId;
    }

    public final FetchBetAmountResponse copy(BetAmountVO betAmountVO, ArrayList<Double> betChipList, long roundId, int turnId) {
        betAmountVO.getClass();
        betChipList.getClass();
        return new FetchBetAmountResponse(betAmountVO, betChipList, roundId, turnId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FetchBetAmountResponse)) {
            return false;
        }
        FetchBetAmountResponse fetchBetAmountResponse = (FetchBetAmountResponse) other;
        return Intrinsics.g(this.betAmountVO, fetchBetAmountResponse.betAmountVO) && Intrinsics.g(this.betChipList, fetchBetAmountResponse.betChipList) && this.roundId == fetchBetAmountResponse.roundId && this.turnId == fetchBetAmountResponse.turnId;
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

    public final int getTurnId() {
        return this.turnId;
    }

    public int hashCode() {
        return Integer.hashCode(this.turnId) + f87.a(nl.a(this.betChipList, this.betAmountVO.hashCode() * 31, 31), this.roundId, 31);
    }

    public String toString() {
        BetAmountVO betAmountVO = this.betAmountVO;
        ArrayList<Double> arrayList = this.betChipList;
        long j = this.roundId;
        int i = this.turnId;
        StringBuilder sb = new StringBuilder("FetchBetAmountResponse(betAmountVO=");
        sb.append(betAmountVO);
        sb.append(", betChipList=");
        sb.append(arrayList);
        sb.append(", roundId=");
        to10.a(sb, j, ", turnId=", i);
        sb.append(")");
        return sb.toString();
    }
}
