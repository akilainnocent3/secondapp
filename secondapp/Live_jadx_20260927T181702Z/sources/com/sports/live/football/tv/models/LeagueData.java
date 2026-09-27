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
public final class LeagueData implements Parcelable {

    @l
    public static final Parcelable.Creator<LeagueData> CREATOR = new Creator();

    @fm.c("country")
    @m
    private String country;

    @fm.c("country_code")
    @m
    private String countryCode;

    @fm.c("country_flag")
    @m
    private String countryFlag;

    @fm.c("created_at")
    @m
    private String createdAt;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @fm.c("id")
    @m
    private Integer f73568id;

    @fm.c("league_id")
    @m
    private Integer leagueId;

    @fm.c("league_type")
    @m
    private String leagueType;

    @fm.c("logo")
    @m
    private String logo;

    @fm.c("name")
    @m
    private String name;

    @fm.c("updated_at")
    @m
    private String updatedAt;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Creator implements Parcelable.Creator<LeagueData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LeagueData createFromParcel(Parcel parcel) {
            m0.p(parcel, "parcel");
            return new LeagueData(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LeagueData[] newArray(int i10) {
            return new LeagueData[i10];
        }
    }

    public LeagueData() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    public static /* synthetic */ LeagueData copy$default(LeagueData leagueData, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = leagueData.f73568id;
        }
        if ((i10 & 2) != 0) {
            num2 = leagueData.leagueId;
        }
        if ((i10 & 4) != 0) {
            str = leagueData.name;
        }
        if ((i10 & 8) != 0) {
            str2 = leagueData.leagueType;
        }
        if ((i10 & 16) != 0) {
            str3 = leagueData.logo;
        }
        if ((i10 & 32) != 0) {
            str4 = leagueData.country;
        }
        if ((i10 & 64) != 0) {
            str5 = leagueData.countryCode;
        }
        if ((i10 & 128) != 0) {
            str6 = leagueData.countryFlag;
        }
        if ((i10 & 256) != 0) {
            str7 = leagueData.createdAt;
        }
        if ((i10 & 512) != 0) {
            str8 = leagueData.updatedAt;
        }
        String str9 = str7;
        String str10 = str8;
        String str11 = str5;
        String str12 = str6;
        String str13 = str3;
        String str14 = str4;
        return leagueData.copy(num, num2, str, str2, str13, str14, str11, str12, str9, str10);
    }

    @m
    public final Integer component1() {
        return this.f73568id;
    }

    @m
    public final String component10() {
        return this.updatedAt;
    }

    @m
    public final Integer component2() {
        return this.leagueId;
    }

    @m
    public final String component3() {
        return this.name;
    }

    @m
    public final String component4() {
        return this.leagueType;
    }

    @m
    public final String component5() {
        return this.logo;
    }

    @m
    public final String component6() {
        return this.country;
    }

    @m
    public final String component7() {
        return this.countryCode;
    }

    @m
    public final String component8() {
        return this.countryFlag;
    }

    @m
    public final String component9() {
        return this.createdAt;
    }

    @l
    public final LeagueData copy(@m Integer num, @m Integer num2, @m String str, @m String str2, @m String str3, @m String str4, @m String str5, @m String str6, @m String str7, @m String str8) {
        return new LeagueData(num, num2, str, str2, str3, str4, str5, str6, str7, str8);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeagueData)) {
            return false;
        }
        LeagueData leagueData = (LeagueData) obj;
        return m0.g(this.f73568id, leagueData.f73568id) && m0.g(this.leagueId, leagueData.leagueId) && m0.g(this.name, leagueData.name) && m0.g(this.leagueType, leagueData.leagueType) && m0.g(this.logo, leagueData.logo) && m0.g(this.country, leagueData.country) && m0.g(this.countryCode, leagueData.countryCode) && m0.g(this.countryFlag, leagueData.countryFlag) && m0.g(this.createdAt, leagueData.createdAt) && m0.g(this.updatedAt, leagueData.updatedAt);
    }

    @m
    public final String getCountry() {
        return this.country;
    }

    @m
    public final String getCountryCode() {
        return this.countryCode;
    }

    @m
    public final String getCountryFlag() {
        return this.countryFlag;
    }

    @m
    public final String getCreatedAt() {
        return this.createdAt;
    }

    @m
    public final Integer getId() {
        return this.f73568id;
    }

    @m
    public final Integer getLeagueId() {
        return this.leagueId;
    }

    @m
    public final String getLeagueType() {
        return this.leagueType;
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
    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        Integer num = this.f73568id;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.leagueId;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.name;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.leagueType;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.logo;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.country;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.countryCode;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.countryFlag;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.createdAt;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.updatedAt;
        return iHashCode9 + (str8 != null ? str8.hashCode() : 0);
    }

    public final void setCountry(@m String str) {
        this.country = str;
    }

    public final void setCountryCode(@m String str) {
        this.countryCode = str;
    }

    public final void setCountryFlag(@m String str) {
        this.countryFlag = str;
    }

    public final void setCreatedAt(@m String str) {
        this.createdAt = str;
    }

    public final void setId(@m Integer num) {
        this.f73568id = num;
    }

    public final void setLeagueId(@m Integer num) {
        this.leagueId = num;
    }

    public final void setLeagueType(@m String str) {
        this.leagueType = str;
    }

    public final void setLogo(@m String str) {
        this.logo = str;
    }

    public final void setName(@m String str) {
        this.name = str;
    }

    public final void setUpdatedAt(@m String str) {
        this.updatedAt = str;
    }

    @l
    public String toString() {
        return "LeagueData(id=" + this.f73568id + ", leagueId=" + this.leagueId + ", name=" + this.name + ", leagueType=" + this.leagueType + ", logo=" + this.logo + ", country=" + this.country + ", countryCode=" + this.countryCode + ", countryFlag=" + this.countryFlag + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + j.f86771d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@l Parcel dest, int i10) {
        m0.p(dest, "dest");
        Integer num = this.f73568id;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        Integer num2 = this.leagueId;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num2.intValue());
        }
        dest.writeString(this.name);
        dest.writeString(this.leagueType);
        dest.writeString(this.logo);
        dest.writeString(this.country);
        dest.writeString(this.countryCode);
        dest.writeString(this.countryFlag);
        dest.writeString(this.createdAt);
        dest.writeString(this.updatedAt);
    }

    public LeagueData(@m Integer num, @m Integer num2, @m String str, @m String str2, @m String str3, @m String str4, @m String str5, @m String str6, @m String str7, @m String str8) {
        this.f73568id = num;
        this.leagueId = num2;
        this.name = str;
        this.leagueType = str2;
        this.logo = str3;
        this.country = str4;
        this.countryCode = str5;
        this.countryFlag = str6;
        this.createdAt = str7;
        this.updatedAt = str8;
    }

    public /* synthetic */ LeagueData(Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i10, x xVar) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : num2, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? null : str3, (i10 & 32) != 0 ? null : str4, (i10 & 64) != 0 ? null : str5, (i10 & 128) != 0 ? null : str6, (i10 & 256) != 0 ? null : str7, (i10 & 512) != 0 ? null : str8);
    }
}
