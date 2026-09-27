package com.sports.live.football.tv.models;

import fm.c;
import gi.j;
import java.util.ArrayList;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class LeaguesData {

    @c("country")
    @m
    private String country;

    @c("flag")
    @m
    private String flag;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @c("id")
    @m
    private Integer f73572id;

    @c("logo")
    @m
    private String logo;

    @c("name")
    @m
    private String name;

    @c("season")
    @m
    private Integer season;

    @l
    @c("standings")
    private ArrayList<ArrayList<Standings>> standings;

    public LeaguesData() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LeaguesData copy$default(LeaguesData leaguesData, Integer num, String str, String str2, String str3, String str4, Integer num2, ArrayList arrayList, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = leaguesData.f73572id;
        }
        if ((i10 & 2) != 0) {
            str = leaguesData.name;
        }
        if ((i10 & 4) != 0) {
            str2 = leaguesData.country;
        }
        if ((i10 & 8) != 0) {
            str3 = leaguesData.logo;
        }
        if ((i10 & 16) != 0) {
            str4 = leaguesData.flag;
        }
        if ((i10 & 32) != 0) {
            num2 = leaguesData.season;
        }
        if ((i10 & 64) != 0) {
            arrayList = leaguesData.standings;
        }
        Integer num3 = num2;
        ArrayList arrayList2 = arrayList;
        String str5 = str4;
        String str6 = str2;
        return leaguesData.copy(num, str, str6, str3, str5, num3, arrayList2);
    }

    @m
    public final Integer component1() {
        return this.f73572id;
    }

    @m
    public final String component2() {
        return this.name;
    }

    @m
    public final String component3() {
        return this.country;
    }

    @m
    public final String component4() {
        return this.logo;
    }

    @m
    public final String component5() {
        return this.flag;
    }

    @m
    public final Integer component6() {
        return this.season;
    }

    @l
    public final ArrayList<ArrayList<Standings>> component7() {
        return this.standings;
    }

    @l
    public final LeaguesData copy(@m Integer num, @m String str, @m String str2, @m String str3, @m String str4, @m Integer num2, @l ArrayList<ArrayList<Standings>> standings) {
        m0.p(standings, "standings");
        return new LeaguesData(num, str, str2, str3, str4, num2, standings);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeaguesData)) {
            return false;
        }
        LeaguesData leaguesData = (LeaguesData) obj;
        return m0.g(this.f73572id, leaguesData.f73572id) && m0.g(this.name, leaguesData.name) && m0.g(this.country, leaguesData.country) && m0.g(this.logo, leaguesData.logo) && m0.g(this.flag, leaguesData.flag) && m0.g(this.season, leaguesData.season) && m0.g(this.standings, leaguesData.standings);
    }

    @m
    public final String getCountry() {
        return this.country;
    }

    @m
    public final String getFlag() {
        return this.flag;
    }

    @m
    public final Integer getId() {
        return this.f73572id;
    }

    @m
    public final String getLogo() {
        return this.logo;
    }

    @m
    public final String getName() {
        return this.name;
    }

    @m
    public final Integer getSeason() {
        return this.season;
    }

    @l
    public final ArrayList<ArrayList<Standings>> getStandings() {
        return this.standings;
    }

    public int hashCode() {
        Integer num = this.f73572id;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.country;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.logo;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.flag;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num2 = this.season;
        return ((iHashCode5 + (num2 != null ? num2.hashCode() : 0)) * 31) + this.standings.hashCode();
    }

    public final void setCountry(@m String str) {
        this.country = str;
    }

    public final void setFlag(@m String str) {
        this.flag = str;
    }

    public final void setId(@m Integer num) {
        this.f73572id = num;
    }

    public final void setLogo(@m String str) {
        this.logo = str;
    }

    public final void setName(@m String str) {
        this.name = str;
    }

    public final void setSeason(@m Integer num) {
        this.season = num;
    }

    public final void setStandings(@l ArrayList<ArrayList<Standings>> arrayList) {
        m0.p(arrayList, "<set-?>");
        this.standings = arrayList;
    }

    @l
    public String toString() {
        return "LeaguesData(id=" + this.f73572id + ", name=" + this.name + ", country=" + this.country + ", logo=" + this.logo + ", flag=" + this.flag + ", season=" + this.season + ", standings=" + this.standings + j.f86771d;
    }

    public LeaguesData(@m Integer num, @m String str, @m String str2, @m String str3, @m String str4, @m Integer num2, @l ArrayList<ArrayList<Standings>> standings) {
        m0.p(standings, "standings");
        this.f73572id = num;
        this.name = str;
        this.country = str2;
        this.logo = str3;
        this.flag = str4;
        this.season = num2;
        this.standings = standings;
    }

    public /* synthetic */ LeaguesData(Integer num, String str, String str2, String str3, String str4, Integer num2, ArrayList arrayList, int i10, x xVar) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? null : str4, (i10 & 32) != 0 ? null : num2, (i10 & 64) != 0 ? new ArrayList() : arrayList);
    }
}
