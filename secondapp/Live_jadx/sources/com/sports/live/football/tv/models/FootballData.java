package com.sports.live.football.tv.models;

import gi.j;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class FootballData {

    @l
    private String date;
    private int league_id;
    private int player_id;
    private int season;
    private int season_id;

    @m
    private String token;

    public FootballData(@m String str, int i10, int i11, int i12, int i13, @l String date) {
        m0.p(date, "date");
        this.token = str;
        this.league_id = i10;
        this.season_id = i11;
        this.player_id = i12;
        this.season = i13;
        this.date = date;
    }

    public static /* synthetic */ FootballData copy$default(FootballData footballData, String str, int i10, int i11, int i12, int i13, String str2, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = footballData.token;
        }
        if ((i14 & 2) != 0) {
            i10 = footballData.league_id;
        }
        if ((i14 & 4) != 0) {
            i11 = footballData.season_id;
        }
        if ((i14 & 8) != 0) {
            i12 = footballData.player_id;
        }
        if ((i14 & 16) != 0) {
            i13 = footballData.season;
        }
        if ((i14 & 32) != 0) {
            str2 = footballData.date;
        }
        int i15 = i13;
        String str3 = str2;
        return footballData.copy(str, i10, i11, i12, i15, str3);
    }

    @m
    public final String component1() {
        return this.token;
    }

    public final int component2() {
        return this.league_id;
    }

    public final int component3() {
        return this.season_id;
    }

    public final int component4() {
        return this.player_id;
    }

    public final int component5() {
        return this.season;
    }

    @l
    public final String component6() {
        return this.date;
    }

    @l
    public final FootballData copy(@m String str, int i10, int i11, int i12, int i13, @l String date) {
        m0.p(date, "date");
        return new FootballData(str, i10, i11, i12, i13, date);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FootballData)) {
            return false;
        }
        FootballData footballData = (FootballData) obj;
        return m0.g(this.token, footballData.token) && this.league_id == footballData.league_id && this.season_id == footballData.season_id && this.player_id == footballData.player_id && this.season == footballData.season && m0.g(this.date, footballData.date);
    }

    @l
    public final String getDate() {
        return this.date;
    }

    public final int getLeague_id() {
        return this.league_id;
    }

    public final int getPlayer_id() {
        return this.player_id;
    }

    public final int getSeason() {
        return this.season;
    }

    public final int getSeason_id() {
        return this.season_id;
    }

    @m
    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        String str = this.token;
        return ((((((((((str == null ? 0 : str.hashCode()) * 31) + this.league_id) * 31) + this.season_id) * 31) + this.player_id) * 31) + this.season) * 31) + this.date.hashCode();
    }

    public final void setDate(@l String str) {
        m0.p(str, "<set-?>");
        this.date = str;
    }

    public final void setLeague_id(int i10) {
        this.league_id = i10;
    }

    public final void setPlayer_id(int i10) {
        this.player_id = i10;
    }

    public final void setSeason(int i10) {
        this.season = i10;
    }

    public final void setSeason_id(int i10) {
        this.season_id = i10;
    }

    public final void setToken(@m String str) {
        this.token = str;
    }

    @l
    public String toString() {
        return "FootballData(token=" + this.token + ", league_id=" + this.league_id + ", season_id=" + this.season_id + ", player_id=" + this.player_id + ", season=" + this.season + ", date=" + this.date + j.f86771d;
    }

    public /* synthetic */ FootballData(String str, int i10, int i11, int i12, int i13, String str2, int i14, x xVar) {
        this(str, (i14 & 2) != 0 ? 0 : i10, (i14 & 4) != 0 ? 0 : i11, (i14 & 8) != 0 ? 0 : i12, (i14 & 16) != 0 ? 0 : i13, (i14 & 32) != 0 ? "" : str2);
    }
}
