package com.sportygames.vip.data;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/sportygames/vip/data/TopWinsLastWeekResponse;", "", "lastWeekTopWins", "", "Lcom/sportygames/vip/data/EliteLastWeekWinnerItem;", "userLastWeekCoefficient", "Lcom/sportygames/vip/data/UserLastWeekCoefficient;", "<init>", "(Ljava/util/List;Lcom/sportygames/vip/data/UserLastWeekCoefficient;)V", "getLastWeekTopWins", "()Ljava/util/List;", "getUserLastWeekCoefficient", "()Lcom/sportygames/vip/data/UserLastWeekCoefficient;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "vip_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TopWinsLastWeekResponse {
    public static final int $stable = 8;
    private final List<EliteLastWeekWinnerItem> lastWeekTopWins;
    private final UserLastWeekCoefficient userLastWeekCoefficient;

    public TopWinsLastWeekResponse(List<EliteLastWeekWinnerItem> list, UserLastWeekCoefficient userLastWeekCoefficient) {
        this.lastWeekTopWins = list;
        this.userLastWeekCoefficient = userLastWeekCoefficient;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TopWinsLastWeekResponse copy$default(TopWinsLastWeekResponse topWinsLastWeekResponse, List list, UserLastWeekCoefficient userLastWeekCoefficient, int i, Object obj) {
        if ((i & 1) != 0) {
            list = topWinsLastWeekResponse.lastWeekTopWins;
        }
        if ((i & 2) != 0) {
            userLastWeekCoefficient = topWinsLastWeekResponse.userLastWeekCoefficient;
        }
        return topWinsLastWeekResponse.copy(list, userLastWeekCoefficient);
    }

    public final List<EliteLastWeekWinnerItem> component1() {
        return this.lastWeekTopWins;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final UserLastWeekCoefficient getUserLastWeekCoefficient() {
        return this.userLastWeekCoefficient;
    }

    public final TopWinsLastWeekResponse copy(List<EliteLastWeekWinnerItem> lastWeekTopWins, UserLastWeekCoefficient userLastWeekCoefficient) {
        return new TopWinsLastWeekResponse(lastWeekTopWins, userLastWeekCoefficient);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TopWinsLastWeekResponse)) {
            return false;
        }
        TopWinsLastWeekResponse topWinsLastWeekResponse = (TopWinsLastWeekResponse) other;
        return Intrinsics.g(this.lastWeekTopWins, topWinsLastWeekResponse.lastWeekTopWins) && Intrinsics.g(this.userLastWeekCoefficient, topWinsLastWeekResponse.userLastWeekCoefficient);
    }

    public final List<EliteLastWeekWinnerItem> getLastWeekTopWins() {
        return this.lastWeekTopWins;
    }

    public final UserLastWeekCoefficient getUserLastWeekCoefficient() {
        return this.userLastWeekCoefficient;
    }

    public int hashCode() {
        List<EliteLastWeekWinnerItem> list = this.lastWeekTopWins;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        UserLastWeekCoefficient userLastWeekCoefficient = this.userLastWeekCoefficient;
        return iHashCode + (userLastWeekCoefficient != null ? userLastWeekCoefficient.hashCode() : 0);
    }

    public String toString() {
        return "TopWinsLastWeekResponse(lastWeekTopWins=" + this.lastWeekTopWins + ", userLastWeekCoefficient=" + this.userLastWeekCoefficient + ')';
    }
}
