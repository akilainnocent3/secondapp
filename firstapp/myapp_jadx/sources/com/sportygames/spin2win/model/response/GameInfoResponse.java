package com.sportygames.spin2win.model.response;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0017\u0010\u000f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u0005HÆ\u0003J2\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u001f\u0010\u0004\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/sportygames/spin2win/model/response/GameInfoResponse;", "", "roundId", "", "statListByCategory", "", "", "<init>", "(Ljava/lang/Long;Ljava/util/List;)V", "getRoundId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getStatListByCategory", "()Ljava/util/List;", "component1", "component2", "copy", "(Ljava/lang/Long;Ljava/util/List;)Lcom/sportygames/spin2win/model/response/GameInfoResponse;", "equals", "", "other", "hashCode", "", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class GameInfoResponse {
    public static final int $stable = 8;
    private final Long roundId;
    private final List<List<String>> statListByCategory;

    /* JADX WARN: Multi-variable type inference failed */
    public GameInfoResponse(Long l, List<? extends List<String>> list) {
        this.roundId = l;
        this.statListByCategory = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GameInfoResponse copy$default(GameInfoResponse gameInfoResponse, Long l, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            l = gameInfoResponse.roundId;
        }
        if ((i & 2) != 0) {
            list = gameInfoResponse.statListByCategory;
        }
        return gameInfoResponse.copy(l, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getRoundId() {
        return this.roundId;
    }

    public final List<List<String>> component2() {
        return this.statListByCategory;
    }

    public final GameInfoResponse copy(Long roundId, List<? extends List<String>> statListByCategory) {
        return new GameInfoResponse(roundId, statListByCategory);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GameInfoResponse)) {
            return false;
        }
        GameInfoResponse gameInfoResponse = (GameInfoResponse) other;
        return Intrinsics.g(this.roundId, gameInfoResponse.roundId) && Intrinsics.g(this.statListByCategory, gameInfoResponse.statListByCategory);
    }

    public final Long getRoundId() {
        return this.roundId;
    }

    public final List<List<String>> getStatListByCategory() {
        return this.statListByCategory;
    }

    public int hashCode() {
        Long l = this.roundId;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        List<List<String>> list = this.statListByCategory;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "GameInfoResponse(roundId=" + this.roundId + ", statListByCategory=" + this.statListByCategory + ")";
    }
}
