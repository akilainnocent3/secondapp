package com.sportygames.vip.data;

import defpackage.o8i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/sportygames/vip/data/LastHeroStandingListResponse;", "", "cashoutCoefficient", "", "winners", "", "Lcom/sportygames/vip/data/LastHeroStandingWinner;", "<init>", "(DLjava/util/List;)V", "getCashoutCoefficient", "()D", "getWinners", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "vip_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LastHeroStandingListResponse {
    public static final int $stable = 8;
    private final double cashoutCoefficient;
    private final List<LastHeroStandingWinner> winners;

    public LastHeroStandingListResponse(double d, List<LastHeroStandingWinner> list) {
        list.getClass();
        this.cashoutCoefficient = d;
        this.winners = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LastHeroStandingListResponse copy$default(LastHeroStandingListResponse lastHeroStandingListResponse, double d, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            d = lastHeroStandingListResponse.cashoutCoefficient;
        }
        if ((i & 2) != 0) {
            list = lastHeroStandingListResponse.winners;
        }
        return lastHeroStandingListResponse.copy(d, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getCashoutCoefficient() {
        return this.cashoutCoefficient;
    }

    public final List<LastHeroStandingWinner> component2() {
        return this.winners;
    }

    public final LastHeroStandingListResponse copy(double cashoutCoefficient, List<LastHeroStandingWinner> winners) {
        winners.getClass();
        return new LastHeroStandingListResponse(cashoutCoefficient, winners);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LastHeroStandingListResponse)) {
            return false;
        }
        LastHeroStandingListResponse lastHeroStandingListResponse = (LastHeroStandingListResponse) other;
        return Double.compare(this.cashoutCoefficient, lastHeroStandingListResponse.cashoutCoefficient) == 0 && Intrinsics.g(this.winners, lastHeroStandingListResponse.winners);
    }

    public final double getCashoutCoefficient() {
        return this.cashoutCoefficient;
    }

    public final List<LastHeroStandingWinner> getWinners() {
        return this.winners;
    }

    public int hashCode() {
        return this.winners.hashCode() + (Double.hashCode(this.cashoutCoefficient) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LastHeroStandingListResponse(cashoutCoefficient=");
        sb.append(this.cashoutCoefficient);
        sb.append(", winners=");
        return o8i.a(sb, this.winners, ')');
    }
}
