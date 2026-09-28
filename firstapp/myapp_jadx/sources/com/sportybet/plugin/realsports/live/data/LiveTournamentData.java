package com.sportybet.plugin.realsports.live.data;

import com.sportybet.plugin.realsports.data.Tournament;
import defpackage.mq0;
import defpackage.mvs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u000f¨\u0006\""}, d2 = {"Lcom/sportybet/plugin/realsports/live/data/LiveTournamentData;", "Lcom/sportybet/plugin/realsports/live/data/LiveSectionData;", "Lmvs;", "viewType", "Lcom/sportybet/plugin/realsports/data/Tournament;", "tournament", "", "showBoostSign", "<init>", "(Lmvs;Lcom/sportybet/plugin/realsports/data/Tournament;Z)V", "component1", "()Lmvs;", "component2", "()Lcom/sportybet/plugin/realsports/data/Tournament;", "component3", "()Z", "copy", "(Lmvs;Lcom/sportybet/plugin/realsports/data/Tournament;Z)Lcom/sportybet/plugin/realsports/live/data/LiveTournamentData;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lmvs;", "getViewType", "Lcom/sportybet/plugin/realsports/data/Tournament;", "getTournament", "Z", "getShowBoostSign", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class LiveTournamentData implements LiveSectionData {
    public static final int $stable = 8;
    private final boolean showBoostSign;
    private final Tournament tournament;
    private final mvs viewType;

    public LiveTournamentData(mvs mvsVar, Tournament tournament, boolean z) {
        mvsVar.getClass();
        tournament.getClass();
        this.viewType = mvsVar;
        this.tournament = tournament;
        this.showBoostSign = z;
    }

    public static /* synthetic */ LiveTournamentData copy$default(LiveTournamentData liveTournamentData, mvs mvsVar, Tournament tournament, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            mvsVar = liveTournamentData.viewType;
        }
        if ((i & 2) != 0) {
            tournament = liveTournamentData.tournament;
        }
        if ((i & 4) != 0) {
            z = liveTournamentData.showBoostSign;
        }
        return liveTournamentData.copy(mvsVar, tournament, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final mvs getViewType() {
        return this.viewType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Tournament getTournament() {
        return this.tournament;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getShowBoostSign() {
        return this.showBoostSign;
    }

    public final LiveTournamentData copy(mvs viewType, Tournament tournament, boolean showBoostSign) {
        viewType.getClass();
        tournament.getClass();
        return new LiveTournamentData(viewType, tournament, showBoostSign);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LiveTournamentData)) {
            return false;
        }
        LiveTournamentData liveTournamentData = (LiveTournamentData) other;
        return this.viewType == liveTournamentData.viewType && Intrinsics.g(this.tournament, liveTournamentData.tournament) && this.showBoostSign == liveTournamentData.showBoostSign;
    }

    public final boolean getShowBoostSign() {
        return this.showBoostSign;
    }

    public final Tournament getTournament() {
        return this.tournament;
    }

    @Override // com.sportybet.plugin.realsports.live.data.LiveSectionData
    public mvs getViewType() {
        return this.viewType;
    }

    public int hashCode() {
        return Boolean.hashCode(this.showBoostSign) + ((this.tournament.hashCode() + (this.viewType.hashCode() * 31)) * 31);
    }

    public String toString() {
        mvs mvsVar = this.viewType;
        Tournament tournament = this.tournament;
        boolean z = this.showBoostSign;
        StringBuilder sb = new StringBuilder("LiveTournamentData(viewType=");
        sb.append(mvsVar);
        sb.append(", tournament=");
        sb.append(tournament);
        sb.append(", showBoostSign=");
        return mq0.a(sb, z, ")");
    }
}
