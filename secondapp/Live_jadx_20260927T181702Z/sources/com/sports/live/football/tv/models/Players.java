package com.sports.live.football.tv.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.C4235d4;
import gi.j;
import iv.c;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@c
public final class Players implements Parcelable {

    @l
    public static final Parcelable.Creator<Players> CREATOR = new Creator();

    @fm.c("age")
    @m
    private Integer age;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @fm.c("id")
    @m
    private Integer f73575id;

    @fm.c("name")
    @m
    private String name;

    @fm.c("number")
    @m
    private Integer number;

    @fm.c("photo")
    @m
    private String photo;

    @fm.c(C4235d4.i.L)
    @m
    private String position;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Creator implements Parcelable.Creator<Players> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Players createFromParcel(Parcel parcel) {
            m0.p(parcel, "parcel");
            return new Players(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Players[] newArray(int i10) {
            return new Players[i10];
        }
    }

    public Players() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ Players copy$default(Players players, Integer num, String str, Integer num2, Integer num3, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = players.f73575id;
        }
        if ((i10 & 2) != 0) {
            str = players.name;
        }
        if ((i10 & 4) != 0) {
            num2 = players.age;
        }
        if ((i10 & 8) != 0) {
            num3 = players.number;
        }
        if ((i10 & 16) != 0) {
            str2 = players.position;
        }
        if ((i10 & 32) != 0) {
            str3 = players.photo;
        }
        String str4 = str2;
        String str5 = str3;
        return players.copy(num, str, num2, num3, str4, str5);
    }

    @m
    public final Integer component1() {
        return this.f73575id;
    }

    @m
    public final String component2() {
        return this.name;
    }

    @m
    public final Integer component3() {
        return this.age;
    }

    @m
    public final Integer component4() {
        return this.number;
    }

    @m
    public final String component5() {
        return this.position;
    }

    @m
    public final String component6() {
        return this.photo;
    }

    @l
    public final Players copy(@m Integer num, @m String str, @m Integer num2, @m Integer num3, @m String str2, @m String str3) {
        return new Players(num, str, num2, num3, str2, str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Players)) {
            return false;
        }
        Players players = (Players) obj;
        return m0.g(this.f73575id, players.f73575id) && m0.g(this.name, players.name) && m0.g(this.age, players.age) && m0.g(this.number, players.number) && m0.g(this.position, players.position) && m0.g(this.photo, players.photo);
    }

    @m
    public final Integer getAge() {
        return this.age;
    }

    @m
    public final Integer getId() {
        return this.f73575id;
    }

    @m
    public final String getName() {
        return this.name;
    }

    @m
    public final Integer getNumber() {
        return this.number;
    }

    @m
    public final String getPhoto() {
        return this.photo;
    }

    @m
    public final String getPosition() {
        return this.position;
    }

    public int hashCode() {
        Integer num = this.f73575id;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.age;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.number;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str2 = this.position;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.photo;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setAge(@m Integer num) {
        this.age = num;
    }

    public final void setId(@m Integer num) {
        this.f73575id = num;
    }

    public final void setName(@m String str) {
        this.name = str;
    }

    public final void setNumber(@m Integer num) {
        this.number = num;
    }

    public final void setPhoto(@m String str) {
        this.photo = str;
    }

    public final void setPosition(@m String str) {
        this.position = str;
    }

    @l
    public String toString() {
        return "Players(id=" + this.f73575id + ", name=" + this.name + ", age=" + this.age + ", number=" + this.number + ", position=" + this.position + ", photo=" + this.photo + j.f86771d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@l Parcel dest, int i10) {
        m0.p(dest, "dest");
        Integer num = this.f73575id;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        dest.writeString(this.name);
        Integer num2 = this.age;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num2.intValue());
        }
        Integer num3 = this.number;
        if (num3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num3.intValue());
        }
        dest.writeString(this.position);
        dest.writeString(this.photo);
    }

    public Players(@m Integer num, @m String str, @m Integer num2, @m Integer num3, @m String str2, @m String str3) {
        this.f73575id = num;
        this.name = str;
        this.age = num2;
        this.number = num3;
        this.position = str2;
        this.photo = str3;
    }

    public /* synthetic */ Players(Integer num, String str, Integer num2, Integer num3, String str2, String str3, int i10, x xVar) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : num2, (i10 & 8) != 0 ? null : num3, (i10 & 16) != 0 ? null : str2, (i10 & 32) != 0 ? null : str3);
    }
}
