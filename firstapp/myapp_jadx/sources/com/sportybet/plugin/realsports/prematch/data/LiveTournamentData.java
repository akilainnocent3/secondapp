package com.sportybet.plugin.realsports.prematch.data;

import com.sportybet.plugin.realsports.data.Tournament;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\n\"\u0004\b\u000b\u0010\fÊ\u0001\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0016"}, d2 = {"Lcom/sportybet/plugin/realsports/prematch/data/LiveTournamentData;", "", "tournament", "Lcom/sportybet/plugin/realsports/data/Tournament;", "isExpanded", "", "<init>", "(Lcom/sportybet/plugin/realsports/data/Tournament;Z)V", "getTournament", "()Lcom/sportybet/plugin/realsports/data/Tournament;", "()Z", "setExpanded", "(Z)V", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class LiveTournamentData {
    public static final int $stable = 8;
    private boolean isExpanded;
    private final Tournament tournament;

    public LiveTournamentData(Tournament tournament, boolean z) {
        tournament.getClass();
        this.tournament = tournament;
        this.isExpanded = z;
    }

    public static /* synthetic */ LiveTournamentData copy$default(LiveTournamentData liveTournamentData, Tournament tournament, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            tournament = liveTournamentData.tournament;
        }
        if ((i & 2) != 0) {
            z = liveTournamentData.isExpanded;
        }
        return liveTournamentData.copy(tournament, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Tournament getTournament() {
        return this.tournament;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsExpanded() {
        return this.isExpanded;
    }

    public final LiveTournamentData copy(Tournament tournament, boolean isExpanded) {
        tournament.getClass();
        return new LiveTournamentData(tournament, isExpanded);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LiveTournamentData)) {
            return false;
        }
        LiveTournamentData liveTournamentData = (LiveTournamentData) other;
        return Intrinsics.g(this.tournament, liveTournamentData.tournament) && this.isExpanded == liveTournamentData.isExpanded;
    }

    public final Tournament getTournament() {
        return this.tournament;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isExpanded) + (this.tournament.hashCode() * 31);
    }

    public final boolean isExpanded() {
        return this.isExpanded;
    }

    public final void setExpanded(boolean z) {
        this.isExpanded = z;
    }

    public String toString() {
        return "LiveTournamentData(tournament=" + this.tournament + ", isExpanded=" + this.isExpanded + ")";
    }
}
