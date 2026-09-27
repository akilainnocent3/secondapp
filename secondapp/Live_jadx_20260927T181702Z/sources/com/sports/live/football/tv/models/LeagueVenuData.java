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
public final class LeagueVenuData implements Parcelable {

    @l
    public static final Parcelable.Creator<LeagueVenuData> CREATOR = new Creator();

    @fm.c("address")
    @m
    private String address;

    @fm.c("capacity")
    @m
    private Integer capacity;

    @fm.c("city")
    @m
    private String city;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @fm.c("id")
    @m
    private Integer f73571id;

    @fm.c("image")
    @m
    private String image;

    @fm.c("name")
    @m
    private String name;

    @fm.c("surface")
    @m
    private String surface;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Creator implements Parcelable.Creator<LeagueVenuData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LeagueVenuData createFromParcel(Parcel parcel) {
            m0.p(parcel, "parcel");
            return new LeagueVenuData(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LeagueVenuData[] newArray(int i10) {
            return new LeagueVenuData[i10];
        }
    }

    public LeagueVenuData() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ LeagueVenuData copy$default(LeagueVenuData leagueVenuData, Integer num, String str, String str2, String str3, Integer num2, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = leagueVenuData.f73571id;
        }
        if ((i10 & 2) != 0) {
            str = leagueVenuData.name;
        }
        if ((i10 & 4) != 0) {
            str2 = leagueVenuData.address;
        }
        if ((i10 & 8) != 0) {
            str3 = leagueVenuData.city;
        }
        if ((i10 & 16) != 0) {
            num2 = leagueVenuData.capacity;
        }
        if ((i10 & 32) != 0) {
            str4 = leagueVenuData.surface;
        }
        if ((i10 & 64) != 0) {
            str5 = leagueVenuData.image;
        }
        String str6 = str4;
        String str7 = str5;
        Integer num3 = num2;
        String str8 = str2;
        return leagueVenuData.copy(num, str, str8, str3, num3, str6, str7);
    }

    @m
    public final Integer component1() {
        return this.f73571id;
    }

    @m
    public final String component2() {
        return this.name;
    }

    @m
    public final String component3() {
        return this.address;
    }

    @m
    public final String component4() {
        return this.city;
    }

    @m
    public final Integer component5() {
        return this.capacity;
    }

    @m
    public final String component6() {
        return this.surface;
    }

    @m
    public final String component7() {
        return this.image;
    }

    @l
    public final LeagueVenuData copy(@m Integer num, @m String str, @m String str2, @m String str3, @m Integer num2, @m String str4, @m String str5) {
        return new LeagueVenuData(num, str, str2, str3, num2, str4, str5);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeagueVenuData)) {
            return false;
        }
        LeagueVenuData leagueVenuData = (LeagueVenuData) obj;
        return m0.g(this.f73571id, leagueVenuData.f73571id) && m0.g(this.name, leagueVenuData.name) && m0.g(this.address, leagueVenuData.address) && m0.g(this.city, leagueVenuData.city) && m0.g(this.capacity, leagueVenuData.capacity) && m0.g(this.surface, leagueVenuData.surface) && m0.g(this.image, leagueVenuData.image);
    }

    @m
    public final String getAddress() {
        return this.address;
    }

    @m
    public final Integer getCapacity() {
        return this.capacity;
    }

    @m
    public final String getCity() {
        return this.city;
    }

    @m
    public final Integer getId() {
        return this.f73571id;
    }

    @m
    public final String getImage() {
        return this.image;
    }

    @m
    public final String getName() {
        return this.name;
    }

    @m
    public final String getSurface() {
        return this.surface;
    }

    public int hashCode() {
        Integer num = this.f73571id;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.address;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.city;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.capacity;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str4 = this.surface;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.image;
        return iHashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    public final void setAddress(@m String str) {
        this.address = str;
    }

    public final void setCapacity(@m Integer num) {
        this.capacity = num;
    }

    public final void setCity(@m String str) {
        this.city = str;
    }

    public final void setId(@m Integer num) {
        this.f73571id = num;
    }

    public final void setImage(@m String str) {
        this.image = str;
    }

    public final void setName(@m String str) {
        this.name = str;
    }

    public final void setSurface(@m String str) {
        this.surface = str;
    }

    @l
    public String toString() {
        return "LeagueVenuData(id=" + this.f73571id + ", name=" + this.name + ", address=" + this.address + ", city=" + this.city + ", capacity=" + this.capacity + ", surface=" + this.surface + ", image=" + this.image + j.f86771d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@l Parcel dest, int i10) {
        m0.p(dest, "dest");
        Integer num = this.f73571id;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        dest.writeString(this.name);
        dest.writeString(this.address);
        dest.writeString(this.city);
        Integer num2 = this.capacity;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num2.intValue());
        }
        dest.writeString(this.surface);
        dest.writeString(this.image);
    }

    public LeagueVenuData(@m Integer num, @m String str, @m String str2, @m String str3, @m Integer num2, @m String str4, @m String str5) {
        this.f73571id = num;
        this.name = str;
        this.address = str2;
        this.city = str3;
        this.capacity = num2;
        this.surface = str4;
        this.image = str5;
    }

    public /* synthetic */ LeagueVenuData(Integer num, String str, String str2, String str3, Integer num2, String str4, String str5, int i10, x xVar) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? null : num2, (i10 & 32) != 0 ? null : str4, (i10 & 64) != 0 ? null : str5);
    }
}
