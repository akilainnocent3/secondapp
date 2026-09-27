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
public final class PlayerData implements Parcelable {

    @l
    public static final Parcelable.Creator<PlayerData> CREATOR = new Creator();

    @fm.c("age")
    @m
    private Integer age;

    @fm.c("birth")
    @m
    private Birth birth;

    @fm.c("firstname")
    @m
    private String firstname;

    @fm.c("height")
    @m
    private String height;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @fm.c("id")
    @m
    private Integer f73574id;

    @fm.c("injured")
    @m
    private Boolean injured;

    @fm.c("lastname")
    @m
    private String lastname;

    @fm.c("name")
    @m
    private String name;

    @fm.c("nationality")
    @m
    private String nationality;

    @fm.c("photo")
    @m
    private String photo;

    @fm.c("weight")
    @m
    private String weight;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Creator implements Parcelable.Creator<PlayerData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlayerData createFromParcel(Parcel parcel) {
            m0.p(parcel, "parcel");
            Boolean boolValueOf = null;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Birth birthCreateFromParcel = parcel.readInt() == 0 ? null : Birth.CREATOR.createFromParcel(parcel);
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new PlayerData(numValueOf, string, string2, string3, numValueOf2, birthCreateFromParcel, string4, string5, string6, boolValueOf, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlayerData[] newArray(int i10) {
            return new PlayerData[i10];
        }
    }

    public PlayerData() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    public static /* synthetic */ PlayerData copy$default(PlayerData playerData, Integer num, String str, String str2, String str3, Integer num2, Birth birth, String str4, String str5, String str6, Boolean bool, String str7, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = playerData.f73574id;
        }
        if ((i10 & 2) != 0) {
            str = playerData.name;
        }
        if ((i10 & 4) != 0) {
            str2 = playerData.firstname;
        }
        if ((i10 & 8) != 0) {
            str3 = playerData.lastname;
        }
        if ((i10 & 16) != 0) {
            num2 = playerData.age;
        }
        if ((i10 & 32) != 0) {
            birth = playerData.birth;
        }
        if ((i10 & 64) != 0) {
            str4 = playerData.nationality;
        }
        if ((i10 & 128) != 0) {
            str5 = playerData.height;
        }
        if ((i10 & 256) != 0) {
            str6 = playerData.weight;
        }
        if ((i10 & 512) != 0) {
            bool = playerData.injured;
        }
        if ((i10 & 1024) != 0) {
            str7 = playerData.photo;
        }
        Boolean bool2 = bool;
        String str8 = str7;
        String str9 = str5;
        String str10 = str6;
        Birth birth2 = birth;
        String str11 = str4;
        Integer num3 = num2;
        String str12 = str2;
        return playerData.copy(num, str, str12, str3, num3, birth2, str11, str9, str10, bool2, str8);
    }

    @m
    public final Integer component1() {
        return this.f73574id;
    }

    @m
    public final Boolean component10() {
        return this.injured;
    }

    @m
    public final String component11() {
        return this.photo;
    }

    @m
    public final String component2() {
        return this.name;
    }

    @m
    public final String component3() {
        return this.firstname;
    }

    @m
    public final String component4() {
        return this.lastname;
    }

    @m
    public final Integer component5() {
        return this.age;
    }

    @m
    public final Birth component6() {
        return this.birth;
    }

    @m
    public final String component7() {
        return this.nationality;
    }

    @m
    public final String component8() {
        return this.height;
    }

    @m
    public final String component9() {
        return this.weight;
    }

    @l
    public final PlayerData copy(@m Integer num, @m String str, @m String str2, @m String str3, @m Integer num2, @m Birth birth, @m String str4, @m String str5, @m String str6, @m Boolean bool, @m String str7) {
        return new PlayerData(num, str, str2, str3, num2, birth, str4, str5, str6, bool, str7);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlayerData)) {
            return false;
        }
        PlayerData playerData = (PlayerData) obj;
        return m0.g(this.f73574id, playerData.f73574id) && m0.g(this.name, playerData.name) && m0.g(this.firstname, playerData.firstname) && m0.g(this.lastname, playerData.lastname) && m0.g(this.age, playerData.age) && m0.g(this.birth, playerData.birth) && m0.g(this.nationality, playerData.nationality) && m0.g(this.height, playerData.height) && m0.g(this.weight, playerData.weight) && m0.g(this.injured, playerData.injured) && m0.g(this.photo, playerData.photo);
    }

    @m
    public final Integer getAge() {
        return this.age;
    }

    @m
    public final Birth getBirth() {
        return this.birth;
    }

    @m
    public final String getFirstname() {
        return this.firstname;
    }

    @m
    public final String getHeight() {
        return this.height;
    }

    @m
    public final Integer getId() {
        return this.f73574id;
    }

    @m
    public final Boolean getInjured() {
        return this.injured;
    }

    @m
    public final String getLastname() {
        return this.lastname;
    }

    @m
    public final String getName() {
        return this.name;
    }

    @m
    public final String getNationality() {
        return this.nationality;
    }

    @m
    public final String getPhoto() {
        return this.photo;
    }

    @m
    public final String getWeight() {
        return this.weight;
    }

    public int hashCode() {
        Integer num = this.f73574id;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.firstname;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.lastname;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.age;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Birth birth = this.birth;
        int iHashCode6 = (iHashCode5 + (birth == null ? 0 : birth.hashCode())) * 31;
        String str4 = this.nationality;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.height;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.weight;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool = this.injured;
        int iHashCode10 = (iHashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str7 = this.photo;
        return iHashCode10 + (str7 != null ? str7.hashCode() : 0);
    }

    public final void setAge(@m Integer num) {
        this.age = num;
    }

    public final void setBirth(@m Birth birth) {
        this.birth = birth;
    }

    public final void setFirstname(@m String str) {
        this.firstname = str;
    }

    public final void setHeight(@m String str) {
        this.height = str;
    }

    public final void setId(@m Integer num) {
        this.f73574id = num;
    }

    public final void setInjured(@m Boolean bool) {
        this.injured = bool;
    }

    public final void setLastname(@m String str) {
        this.lastname = str;
    }

    public final void setName(@m String str) {
        this.name = str;
    }

    public final void setNationality(@m String str) {
        this.nationality = str;
    }

    public final void setPhoto(@m String str) {
        this.photo = str;
    }

    public final void setWeight(@m String str) {
        this.weight = str;
    }

    @l
    public String toString() {
        return "PlayerData(id=" + this.f73574id + ", name=" + this.name + ", firstname=" + this.firstname + ", lastname=" + this.lastname + ", age=" + this.age + ", birth=" + this.birth + ", nationality=" + this.nationality + ", height=" + this.height + ", weight=" + this.weight + ", injured=" + this.injured + ", photo=" + this.photo + j.f86771d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@l Parcel dest, int i10) {
        m0.p(dest, "dest");
        Integer num = this.f73574id;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        dest.writeString(this.name);
        dest.writeString(this.firstname);
        dest.writeString(this.lastname);
        Integer num2 = this.age;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num2.intValue());
        }
        Birth birth = this.birth;
        if (birth == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            birth.writeToParcel(dest, i10);
        }
        dest.writeString(this.nationality);
        dest.writeString(this.height);
        dest.writeString(this.weight);
        Boolean bool = this.injured;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        dest.writeString(this.photo);
    }

    public PlayerData(@m Integer num, @m String str, @m String str2, @m String str3, @m Integer num2, @m Birth birth, @m String str4, @m String str5, @m String str6, @m Boolean bool, @m String str7) {
        this.f73574id = num;
        this.name = str;
        this.firstname = str2;
        this.lastname = str3;
        this.age = num2;
        this.birth = birth;
        this.nationality = str4;
        this.height = str5;
        this.weight = str6;
        this.injured = bool;
        this.photo = str7;
    }

    public /* synthetic */ PlayerData(Integer num, String str, String str2, String str3, Integer num2, Birth birth, String str4, String str5, String str6, Boolean bool, String str7, int i10, x xVar) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? null : num2, (i10 & 32) != 0 ? new Birth(null, null, null, 7, null) : birth, (i10 & 64) != 0 ? null : str4, (i10 & 128) != 0 ? null : str5, (i10 & 256) != 0 ? null : str6, (i10 & 512) != 0 ? null : bool, (i10 & 1024) != 0 ? null : str7);
    }
}
