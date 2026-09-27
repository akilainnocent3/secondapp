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
public final class Venue implements Parcelable {

    @l
    public static final Parcelable.Creator<Venue> CREATOR = new Creator();

    @fm.c("city")
    @m
    private String city;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @fm.c("id")
    @m
    private String f73580id;

    @fm.c("name")
    @m
    private String name;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Creator implements Parcelable.Creator<Venue> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Venue createFromParcel(Parcel parcel) {
            m0.p(parcel, "parcel");
            return new Venue(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Venue[] newArray(int i10) {
            return new Venue[i10];
        }
    }

    public Venue() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ Venue copy$default(Venue venue, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = venue.f73580id;
        }
        if ((i10 & 2) != 0) {
            str2 = venue.name;
        }
        if ((i10 & 4) != 0) {
            str3 = venue.city;
        }
        return venue.copy(str, str2, str3);
    }

    @m
    public final String component1() {
        return this.f73580id;
    }

    @m
    public final String component2() {
        return this.name;
    }

    @m
    public final String component3() {
        return this.city;
    }

    @l
    public final Venue copy(@m String str, @m String str2, @m String str3) {
        return new Venue(str, str2, str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Venue)) {
            return false;
        }
        Venue venue = (Venue) obj;
        return m0.g(this.f73580id, venue.f73580id) && m0.g(this.name, venue.name) && m0.g(this.city, venue.city);
    }

    @m
    public final String getCity() {
        return this.city;
    }

    @m
    public final String getId() {
        return this.f73580id;
    }

    @m
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        String str = this.f73580id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.city;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setCity(@m String str) {
        this.city = str;
    }

    public final void setId(@m String str) {
        this.f73580id = str;
    }

    public final void setName(@m String str) {
        this.name = str;
    }

    @l
    public String toString() {
        return "Venue(id=" + this.f73580id + ", name=" + this.name + ", city=" + this.city + j.f86771d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@l Parcel dest, int i10) {
        m0.p(dest, "dest");
        dest.writeString(this.f73580id);
        dest.writeString(this.name);
        dest.writeString(this.city);
    }

    public Venue(@m String str, @m String str2, @m String str3) {
        this.f73580id = str;
        this.name = str2;
        this.city = str3;
    }

    public /* synthetic */ Venue(String str, String str2, String str3, int i10, x xVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3);
    }
}
