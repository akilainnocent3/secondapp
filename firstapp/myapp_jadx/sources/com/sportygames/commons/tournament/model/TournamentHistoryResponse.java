package com.sportygames.commons.tournament.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0010J2\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/sportygames/commons/tournament/model/TournamentHistoryResponse;", "", "tournamentId", "", "name", "", "winAmount", "", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Double;)V", "getTournamentId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getName", "()Ljava/lang/String;", "getWinAmount", "()Ljava/lang/Double;", "Ljava/lang/Double;", "component1", "component2", "component3", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Double;)Lcom/sportygames/commons/tournament/model/TournamentHistoryResponse;", "equals", "", "other", "hashCode", "", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TournamentHistoryResponse {
    public static final int $stable = 0;
    private final String name;
    private final Long tournamentId;
    private final Double winAmount;

    public TournamentHistoryResponse(Long l, String str, Double d) {
        this.tournamentId = l;
        this.name = str;
        this.winAmount = d;
    }

    public static /* synthetic */ TournamentHistoryResponse copy$default(TournamentHistoryResponse tournamentHistoryResponse, Long l, String str, Double d, int i, Object obj) {
        if ((i & 1) != 0) {
            l = tournamentHistoryResponse.tournamentId;
        }
        if ((i & 2) != 0) {
            str = tournamentHistoryResponse.name;
        }
        if ((i & 4) != 0) {
            d = tournamentHistoryResponse.winAmount;
        }
        return tournamentHistoryResponse.copy(l, str, d);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getTournamentId() {
        return this.tournamentId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Double getWinAmount() {
        return this.winAmount;
    }

    public final TournamentHistoryResponse copy(Long tournamentId, String name, Double winAmount) {
        return new TournamentHistoryResponse(tournamentId, name, winAmount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TournamentHistoryResponse)) {
            return false;
        }
        TournamentHistoryResponse tournamentHistoryResponse = (TournamentHistoryResponse) other;
        return Intrinsics.g(this.tournamentId, tournamentHistoryResponse.tournamentId) && Intrinsics.g(this.name, tournamentHistoryResponse.name) && Intrinsics.g(this.winAmount, tournamentHistoryResponse.winAmount);
    }

    public final String getName() {
        return this.name;
    }

    public final Long getTournamentId() {
        return this.tournamentId;
    }

    public final Double getWinAmount() {
        return this.winAmount;
    }

    public int hashCode() {
        Long l = this.tournamentId;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Double d = this.winAmount;
        return iHashCode2 + (d != null ? d.hashCode() : 0);
    }

    public String toString() {
        return "TournamentHistoryResponse(tournamentId=" + this.tournamentId + ", name=" + this.name + ", winAmount=" + this.winAmount + ")";
    }
}
