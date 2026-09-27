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
public final class Birth implements Parcelable {

    @l
    public static final Parcelable.Creator<Birth> CREATOR = new Creator();

    @fm.c("country")
    @m
    private String country;

    @fm.c("date")
    @m
    private String date;

    @fm.c("place")
    @m
    private String place;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Creator implements Parcelable.Creator<Birth> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Birth createFromParcel(Parcel parcel) {
            m0.p(parcel, "parcel");
            return new Birth(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Birth[] newArray(int i10) {
            return new Birth[i10];
        }
    }

    public Birth() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ Birth copy$default(Birth birth, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = birth.date;
        }
        if ((i10 & 2) != 0) {
            str2 = birth.place;
        }
        if ((i10 & 4) != 0) {
            str3 = birth.country;
        }
        return birth.copy(str, str2, str3);
    }

    @m
    public final String component1() {
        return this.date;
    }

    @m
    public final String component2() {
        return this.place;
    }

    @m
    public final String component3() {
        return this.country;
    }

    @l
    public final Birth copy(@m String str, @m String str2, @m String str3) {
        return new Birth(str, str2, str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Birth)) {
            return false;
        }
        Birth birth = (Birth) obj;
        return m0.g(this.date, birth.date) && m0.g(this.place, birth.place) && m0.g(this.country, birth.country);
    }

    @m
    public final String getCountry() {
        return this.country;
    }

    @m
    public final String getDate() {
        return this.date;
    }

    @m
    public final String getPlace() {
        return this.place;
    }

    public int hashCode() {
        String str = this.date;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.place;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.country;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setCountry(@m String str) {
        this.country = str;
    }

    public final void setDate(@m String str) {
        this.date = str;
    }

    public final void setPlace(@m String str) {
        this.place = str;
    }

    @l
    public String toString() {
        return "Birth(date=" + this.date + ", place=" + this.place + ", country=" + this.country + j.f86771d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@l Parcel dest, int i10) {
        m0.p(dest, "dest");
        dest.writeString(this.date);
        dest.writeString(this.place);
        dest.writeString(this.country);
    }

    public Birth(@m String str, @m String str2, @m String str3) {
        this.date = str;
        this.place = str2;
        this.country = str3;
    }

    public /* synthetic */ Birth(String str, String str2, String str3, int i10, x xVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3);
    }
}
