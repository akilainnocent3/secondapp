package com.sports.live.football.tv.models;

import android.os.Parcel;
import android.os.Parcelable;
import gi.j;
import gp.e;
import iv.c;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@c
public final class LeagueTeamsData implements Parcelable {

    @l
    public static final Parcelable.Creator<LeagueTeamsData> CREATOR = new Creator();

    @fm.c(e.f87280s)
    @m
    private String code;

    @fm.c("country")
    @m
    private String country;

    @fm.c("founded")
    @m
    private Integer founded;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @fm.c("id")
    @m
    private Integer f73570id;

    @fm.c("logo")
    @m
    private String logo;

    @fm.c("name")
    @m
    private String name;

    @fm.c("national")
    @m
    private Boolean national;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Creator implements Parcelable.Creator<LeagueTeamsData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LeagueTeamsData createFromParcel(Parcel parcel) {
            m0.p(parcel, "parcel");
            Boolean boolValueOf = null;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new LeagueTeamsData(numValueOf, string, string2, string3, numValueOf2, boolValueOf, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LeagueTeamsData[] newArray(int i10) {
            return new LeagueTeamsData[i10];
        }
    }

    public LeagueTeamsData() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ LeagueTeamsData copy$default(LeagueTeamsData leagueTeamsData, Integer num, String str, String str2, String str3, Integer num2, Boolean bool, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = leagueTeamsData.f73570id;
        }
        if ((i10 & 2) != 0) {
            str = leagueTeamsData.name;
        }
        if ((i10 & 4) != 0) {
            str2 = leagueTeamsData.code;
        }
        if ((i10 & 8) != 0) {
            str3 = leagueTeamsData.country;
        }
        if ((i10 & 16) != 0) {
            num2 = leagueTeamsData.founded;
        }
        if ((i10 & 32) != 0) {
            bool = leagueTeamsData.national;
        }
        if ((i10 & 64) != 0) {
            str4 = leagueTeamsData.logo;
        }
        Boolean bool2 = bool;
        String str5 = str4;
        Integer num3 = num2;
        String str6 = str2;
        return leagueTeamsData.copy(num, str, str6, str3, num3, bool2, str5);
    }

    @m
    public final Integer component1() {
        return this.f73570id;
    }

    @m
    public final String component2() {
        return this.name;
    }

    @m
    public final String component3() {
        return this.code;
    }

    @m
    public final String component4() {
        return this.country;
    }

    @m
    public final Integer component5() {
        return this.founded;
    }

    @m
    public final Boolean component6() {
        return this.national;
    }

    @m
    public final String component7() {
        return this.logo;
    }

    @l
    public final LeagueTeamsData copy(@m Integer num, @m String str, @m String str2, @m String str3, @m Integer num2, @m Boolean bool, @m String str4) {
        return new LeagueTeamsData(num, str, str2, str3, num2, bool, str4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeagueTeamsData)) {
            return false;
        }
        LeagueTeamsData leagueTeamsData = (LeagueTeamsData) obj;
        return m0.g(this.f73570id, leagueTeamsData.f73570id) && m0.g(this.name, leagueTeamsData.name) && m0.g(this.code, leagueTeamsData.code) && m0.g(this.country, leagueTeamsData.country) && m0.g(this.founded, leagueTeamsData.founded) && m0.g(this.national, leagueTeamsData.national) && m0.g(this.logo, leagueTeamsData.logo);
    }

    @m
    public final String getCode() {
        return this.code;
    }

    @m
    public final String getCountry() {
        return this.country;
    }

    @m
    public final Integer getFounded() {
        return this.founded;
    }

    @m
    public final Integer getId() {
        return this.f73570id;
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
    public final Boolean getNational() {
        return this.national;
    }

    public int hashCode() {
        Integer num = this.f73570id;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.code;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.country;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.founded;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.national;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.logo;
        return iHashCode6 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setCode(@m String str) {
        this.code = str;
    }

    public final void setCountry(@m String str) {
        this.country = str;
    }

    public final void setFounded(@m Integer num) {
        this.founded = num;
    }

    public final void setId(@m Integer num) {
        this.f73570id = num;
    }

    public final void setLogo(@m String str) {
        this.logo = str;
    }

    public final void setName(@m String str) {
        this.name = str;
    }

    public final void setNational(@m Boolean bool) {
        this.national = bool;
    }

    @l
    public String toString() {
        return "LeagueTeamsData(id=" + this.f73570id + ", name=" + this.name + ", code=" + this.code + ", country=" + this.country + ", founded=" + this.founded + ", national=" + this.national + ", logo=" + this.logo + j.f86771d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@l Parcel dest, int i10) {
        m0.p(dest, "dest");
        Integer num = this.f73570id;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        dest.writeString(this.name);
        dest.writeString(this.code);
        dest.writeString(this.country);
        Integer num2 = this.founded;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num2.intValue());
        }
        Boolean bool = this.national;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        dest.writeString(this.logo);
    }

    public LeagueTeamsData(@m Integer num, @m String str, @m String str2, @m String str3, @m Integer num2, @m Boolean bool, @m String str4) {
        this.f73570id = num;
        this.name = str;
        this.code = str2;
        this.country = str3;
        this.founded = num2;
        this.national = bool;
        this.logo = str4;
    }

    public /* synthetic */ LeagueTeamsData(Integer num, String str, String str2, String str3, Integer num2, Boolean bool, String str4, int i10, x xVar) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? null : num2, (i10 & 32) != 0 ? null : bool, (i10 & 64) != 0 ? null : str4);
    }
}
