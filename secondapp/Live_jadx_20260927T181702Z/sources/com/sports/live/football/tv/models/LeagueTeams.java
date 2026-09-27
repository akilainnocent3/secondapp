package com.sports.live.football.tv.models;

import android.os.Parcel;
import android.os.Parcelable;
import gi.j;
import iv.c;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@c
public final class LeagueTeams implements Parcelable {

    @l
    public static final Parcelable.Creator<LeagueTeams> CREATOR = new Creator();

    @fm.c("team")
    @m
    private LeagueTeamsData team;

    @fm.c("venue")
    @m
    private LeagueVenuData venue;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Creator implements Parcelable.Creator<LeagueTeams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LeagueTeams createFromParcel(Parcel parcel) {
            m0.p(parcel, "parcel");
            return new LeagueTeams(parcel.readInt() == 0 ? null : LeagueTeamsData.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? LeagueVenuData.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LeagueTeams[] newArray(int i10) {
            return new LeagueTeams[i10];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LeagueTeams() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ LeagueTeams copy$default(LeagueTeams leagueTeams, LeagueTeamsData leagueTeamsData, LeagueVenuData leagueVenuData, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            leagueTeamsData = leagueTeams.team;
        }
        if ((i10 & 2) != 0) {
            leagueVenuData = leagueTeams.venue;
        }
        return leagueTeams.copy(leagueTeamsData, leagueVenuData);
    }

    @m
    public final LeagueTeamsData component1() {
        return this.team;
    }

    @m
    public final LeagueVenuData component2() {
        return this.venue;
    }

    @l
    public final LeagueTeams copy(@m LeagueTeamsData leagueTeamsData, @m LeagueVenuData leagueVenuData) {
        return new LeagueTeams(leagueTeamsData, leagueVenuData);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeagueTeams)) {
            return false;
        }
        LeagueTeams leagueTeams = (LeagueTeams) obj;
        return m0.g(this.team, leagueTeams.team) && m0.g(this.venue, leagueTeams.venue);
    }

    @m
    public final LeagueTeamsData getTeam() {
        return this.team;
    }

    @m
    public final LeagueVenuData getVenue() {
        return this.venue;
    }

    public int hashCode() {
        LeagueTeamsData leagueTeamsData = this.team;
        int iHashCode = (leagueTeamsData == null ? 0 : leagueTeamsData.hashCode()) * 31;
        LeagueVenuData leagueVenuData = this.venue;
        return iHashCode + (leagueVenuData != null ? leagueVenuData.hashCode() : 0);
    }

    public final void setTeam(@m LeagueTeamsData leagueTeamsData) {
        this.team = leagueTeamsData;
    }

    public final void setVenue(@m LeagueVenuData leagueVenuData) {
        this.venue = leagueVenuData;
    }

    @l
    public String toString() {
        return "LeagueTeams(team=" + this.team + ", venue=" + this.venue + j.f86771d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@l Parcel dest, int i10) {
        m0.p(dest, "dest");
        LeagueTeamsData leagueTeamsData = this.team;
        if (leagueTeamsData == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            leagueTeamsData.writeToParcel(dest, i10);
        }
        LeagueVenuData leagueVenuData = this.venue;
        if (leagueVenuData == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            leagueVenuData.writeToParcel(dest, i10);
        }
    }

    public LeagueTeams(@m LeagueTeamsData leagueTeamsData, @m LeagueVenuData leagueVenuData) {
        this.team = leagueTeamsData;
        this.venue = leagueVenuData;
    }

    public /* synthetic */ LeagueTeams(LeagueTeamsData leagueTeamsData, LeagueVenuData leagueVenuData, int i10, x xVar) {
        this((i10 & 1) != 0 ? new LeagueTeamsData(null, null, null, null, null, null, null, 127, null) : leagueTeamsData, (i10 & 2) != 0 ? new LeagueVenuData(null, null, null, null, null, null, null, 127, null) : leagueVenuData);
    }
}
