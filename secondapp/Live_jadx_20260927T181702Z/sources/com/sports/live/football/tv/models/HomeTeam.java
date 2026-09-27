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
public final class HomeTeam implements Parcelable {

    @l
    public static final Parcelable.Creator<HomeTeam> CREATOR = new Creator();

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @fm.c("id")
    @m
    private Integer f73566id;

    @fm.c("logo")
    @m
    private String logo;

    @fm.c("name")
    @m
    private String name;

    @fm.c("winner")
    @m
    private String winner;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Creator implements Parcelable.Creator<HomeTeam> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HomeTeam createFromParcel(Parcel parcel) {
            m0.p(parcel, "parcel");
            return new HomeTeam(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HomeTeam[] newArray(int i10) {
            return new HomeTeam[i10];
        }
    }

    public HomeTeam() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ HomeTeam copy$default(HomeTeam homeTeam, Integer num, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = homeTeam.f73566id;
        }
        if ((i10 & 2) != 0) {
            str = homeTeam.name;
        }
        if ((i10 & 4) != 0) {
            str2 = homeTeam.logo;
        }
        if ((i10 & 8) != 0) {
            str3 = homeTeam.winner;
        }
        return homeTeam.copy(num, str, str2, str3);
    }

    @m
    public final Integer component1() {
        return this.f73566id;
    }

    @m
    public final String component2() {
        return this.name;
    }

    @m
    public final String component3() {
        return this.logo;
    }

    @m
    public final String component4() {
        return this.winner;
    }

    @l
    public final HomeTeam copy(@m Integer num, @m String str, @m String str2, @m String str3) {
        return new HomeTeam(num, str, str2, str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HomeTeam)) {
            return false;
        }
        HomeTeam homeTeam = (HomeTeam) obj;
        return m0.g(this.f73566id, homeTeam.f73566id) && m0.g(this.name, homeTeam.name) && m0.g(this.logo, homeTeam.logo) && m0.g(this.winner, homeTeam.winner);
    }

    @m
    public final Integer getId() {
        return this.f73566id;
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
    public final String getWinner() {
        return this.winner;
    }

    public int hashCode() {
        Integer num = this.f73566id;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.logo;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.winner;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setId(@m Integer num) {
        this.f73566id = num;
    }

    public final void setLogo(@m String str) {
        this.logo = str;
    }

    public final void setName(@m String str) {
        this.name = str;
    }

    public final void setWinner(@m String str) {
        this.winner = str;
    }

    @l
    public String toString() {
        return "HomeTeam(id=" + this.f73566id + ", name=" + this.name + ", logo=" + this.logo + ", winner=" + this.winner + j.f86771d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@l Parcel dest, int i10) {
        int iIntValue;
        m0.p(dest, "dest");
        Integer num = this.f73566id;
        if (num == null) {
            iIntValue = 0;
        } else {
            dest.writeInt(1);
            iIntValue = num.intValue();
        }
        dest.writeInt(iIntValue);
        dest.writeString(this.name);
        dest.writeString(this.logo);
        dest.writeString(this.winner);
    }

    public HomeTeam(@m Integer num, @m String str, @m String str2, @m String str3) {
        this.f73566id = num;
        this.name = str;
        this.logo = str2;
        this.winner = str3;
    }

    public /* synthetic */ HomeTeam(Integer num, String str, String str2, String str3, int i10, x xVar) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : str3);
    }
}
