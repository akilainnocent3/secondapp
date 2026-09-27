package com.sports.live.football.tv.models;

import fm.c;
import gi.j;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class LeagueStandings {

    @c("league")
    @m
    private LeaguesData league;

    /* JADX WARN: Multi-variable type inference failed */
    public LeagueStandings() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ LeagueStandings copy$default(LeagueStandings leagueStandings, LeaguesData leaguesData, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            leaguesData = leagueStandings.league;
        }
        return leagueStandings.copy(leaguesData);
    }

    @m
    public final LeaguesData component1() {
        return this.league;
    }

    @l
    public final LeagueStandings copy(@m LeaguesData leaguesData) {
        return new LeagueStandings(leaguesData);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LeagueStandings) && m0.g(this.league, ((LeagueStandings) obj).league);
    }

    @m
    public final LeaguesData getLeague() {
        return this.league;
    }

    public int hashCode() {
        LeaguesData leaguesData = this.league;
        if (leaguesData == null) {
            return 0;
        }
        return leaguesData.hashCode();
    }

    public final void setLeague(@m LeaguesData leaguesData) {
        this.league = leaguesData;
    }

    @l
    public String toString() {
        return "LeagueStandings(league=" + this.league + j.f86771d;
    }

    public LeagueStandings(@m LeaguesData leaguesData) {
        this.league = leaguesData;
    }

    public /* synthetic */ LeagueStandings(LeaguesData leaguesData, int i10, x xVar) {
        this((i10 & 1) != 0 ? new LeaguesData(null, null, null, null, null, null, null, 127, null) : leaguesData);
    }
}
