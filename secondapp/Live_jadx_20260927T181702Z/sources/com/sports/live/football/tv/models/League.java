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
public final class League implements Parcelable {

    @l
    public static final Parcelable.Creator<League> CREATOR = new Creator();

    @fm.c("country")
    @m
    private String country;

    @fm.c("flag")
    @m
    private String flag;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @fm.c("id")
    @m
    private Integer f73567id;

    @fm.c("logo")
    @m
    private String logo;

    @fm.c("name")
    @m
    private String name;

    @fm.c("round")
    @m
    private String round;

    @fm.c("season")
    @m
    private Integer season;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Creator implements Parcelable.Creator<League> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final League createFromParcel(Parcel parcel) {
            m0.p(parcel, "parcel");
            return new League(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final League[] newArray(int i10) {
            return new League[i10];
        }
    }

    public League() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ League copy$default(League league, Integer num, String str, String str2, String str3, String str4, Integer num2, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = league.f73567id;
        }
        if ((i10 & 2) != 0) {
            str = league.name;
        }
        if ((i10 & 4) != 0) {
            str2 = league.country;
        }
        if ((i10 & 8) != 0) {
            str3 = league.logo;
        }
        if ((i10 & 16) != 0) {
            str4 = league.flag;
        }
        if ((i10 & 32) != 0) {
            num2 = league.season;
        }
        if ((i10 & 64) != 0) {
            str5 = league.round;
        }
        Integer num3 = num2;
        String str6 = str5;
        String str7 = str4;
        String str8 = str2;
        return league.copy(num, str, str8, str3, str7, num3, str6);
    }

    @m
    public final Integer component1() {
        return this.f73567id;
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

    @m
    public final String component7() {
        return this.round;
    }

    @l
    public final League copy(@m Integer num, @m String str, @m String str2, @m String str3, @m String str4, @m Integer num2, @m String str5) {
        return new League(num, str, str2, str3, str4, num2, str5);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof League)) {
            return false;
        }
        League league = (League) obj;
        return m0.g(this.f73567id, league.f73567id) && m0.g(this.name, league.name) && m0.g(this.country, league.country) && m0.g(this.logo, league.logo) && m0.g(this.flag, league.flag) && m0.g(this.season, league.season) && m0.g(this.round, league.round);
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
        return this.f73567id;
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
    public final String getRound() {
        return this.round;
    }

    @m
    public final Integer getSeason() {
        return this.season;
    }

    public int hashCode() {
        Integer num = this.f73567id;
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
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str5 = this.round;
        return iHashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    public final void setCountry(@m String str) {
        this.country = str;
    }

    public final void setFlag(@m String str) {
        this.flag = str;
    }

    public final void setId(@m Integer num) {
        this.f73567id = num;
    }

    public final void setLogo(@m String str) {
        this.logo = str;
    }

    public final void setName(@m String str) {
        this.name = str;
    }

    public final void setRound(@m String str) {
        this.round = str;
    }

    public final void setSeason(@m Integer num) {
        this.season = num;
    }

    @l
    public String toString() {
        return "League(id=" + this.f73567id + ", name=" + this.name + ", country=" + this.country + ", logo=" + this.logo + ", flag=" + this.flag + ", season=" + this.season + ", round=" + this.round + j.f86771d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@l Parcel dest, int i10) {
        m0.p(dest, "dest");
        Integer num = this.f73567id;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        dest.writeString(this.name);
        dest.writeString(this.country);
        dest.writeString(this.logo);
        dest.writeString(this.flag);
        Integer num2 = this.season;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num2.intValue());
        }
        dest.writeString(this.round);
    }

    public League(@m Integer num, @m String str, @m String str2, @m String str3, @m String str4, @m Integer num2, @m String str5) {
        this.f73567id = num;
        this.name = str;
        this.country = str2;
        this.logo = str3;
        this.flag = str4;
        this.season = num2;
        this.round = str5;
    }

    public /* synthetic */ League(Integer num, String str, String str2, String str3, String str4, Integer num2, String str5, int i10, x xVar) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? null : str4, (i10 & 32) != 0 ? null : num2, (i10 & 64) != 0 ? null : str5);
    }
}
