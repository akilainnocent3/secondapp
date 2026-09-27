package com.sports.live.football.tv.models;

import android.os.Parcel;
import android.os.Parcelable;
import gi.j;
import iv.c;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@c
public final class TeamPlayersData implements Parcelable {

    @l
    public static final Parcelable.Creator<TeamPlayersData> CREATOR = new Creator();

    @l
    @fm.c("players")
    private ArrayList<Players> players;

    @fm.c("team")
    @m
    private Team team;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Creator implements Parcelable.Creator<TeamPlayersData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TeamPlayersData createFromParcel(Parcel parcel) {
            m0.p(parcel, "parcel");
            Team teamCreateFromParcel = parcel.readInt() == 0 ? null : Team.CREATOR.createFromParcel(parcel);
            int i10 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 != i10; i11++) {
                arrayList.add(Players.CREATOR.createFromParcel(parcel));
            }
            return new TeamPlayersData(teamCreateFromParcel, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TeamPlayersData[] newArray(int i10) {
            return new TeamPlayersData[i10];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TeamPlayersData() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TeamPlayersData copy$default(TeamPlayersData teamPlayersData, Team team, ArrayList arrayList, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            team = teamPlayersData.team;
        }
        if ((i10 & 2) != 0) {
            arrayList = teamPlayersData.players;
        }
        return teamPlayersData.copy(team, arrayList);
    }

    @m
    public final Team component1() {
        return this.team;
    }

    @l
    public final ArrayList<Players> component2() {
        return this.players;
    }

    @l
    public final TeamPlayersData copy(@m Team team, @l ArrayList<Players> players) {
        m0.p(players, "players");
        return new TeamPlayersData(team, players);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TeamPlayersData)) {
            return false;
        }
        TeamPlayersData teamPlayersData = (TeamPlayersData) obj;
        return m0.g(this.team, teamPlayersData.team) && m0.g(this.players, teamPlayersData.players);
    }

    @l
    public final ArrayList<Players> getPlayers() {
        return this.players;
    }

    @m
    public final Team getTeam() {
        return this.team;
    }

    public int hashCode() {
        Team team = this.team;
        return ((team == null ? 0 : team.hashCode()) * 31) + this.players.hashCode();
    }

    public final void setPlayers(@l ArrayList<Players> arrayList) {
        m0.p(arrayList, "<set-?>");
        this.players = arrayList;
    }

    public final void setTeam(@m Team team) {
        this.team = team;
    }

    @l
    public String toString() {
        return "TeamPlayersData(team=" + this.team + ", players=" + this.players + j.f86771d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@l Parcel dest, int i10) {
        m0.p(dest, "dest");
        Team team = this.team;
        if (team == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            team.writeToParcel(dest, i10);
        }
        ArrayList<Players> arrayList = this.players;
        dest.writeInt(arrayList.size());
        Iterator<Players> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, i10);
        }
    }

    public TeamPlayersData(@m Team team, @l ArrayList<Players> players) {
        m0.p(players, "players");
        this.team = team;
        this.players = players;
    }

    public /* synthetic */ TeamPlayersData(Team team, ArrayList arrayList, int i10, x xVar) {
        this((i10 & 1) != 0 ? new Team(null, null, null, 7, null) : team, (i10 & 2) != 0 ? new ArrayList() : arrayList);
    }
}
