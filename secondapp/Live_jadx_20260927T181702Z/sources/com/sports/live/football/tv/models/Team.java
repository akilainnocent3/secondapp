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
public final class Team implements Parcelable {

    @l
    public static final Parcelable.Creator<Team> CREATOR = new Creator();

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @fm.c("id")
    @m
    private Integer f73578id;

    @fm.c("logo")
    @m
    private String logo;

    @fm.c("name")
    @m
    private String name;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Creator implements Parcelable.Creator<Team> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Team createFromParcel(Parcel parcel) {
            m0.p(parcel, "parcel");
            return new Team(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Team[] newArray(int i10) {
            return new Team[i10];
        }
    }

    public Team() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ Team copy$default(Team team, Integer num, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = team.f73578id;
        }
        if ((i10 & 2) != 0) {
            str = team.name;
        }
        if ((i10 & 4) != 0) {
            str2 = team.logo;
        }
        return team.copy(num, str, str2);
    }

    @m
    public final Integer component1() {
        return this.f73578id;
    }

    @m
    public final String component2() {
        return this.name;
    }

    @m
    public final String component3() {
        return this.logo;
    }

    @l
    public final Team copy(@m Integer num, @m String str, @m String str2) {
        return new Team(num, str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Team)) {
            return false;
        }
        Team team = (Team) obj;
        return m0.g(this.f73578id, team.f73578id) && m0.g(this.name, team.name) && m0.g(this.logo, team.logo);
    }

    @m
    public final Integer getId() {
        return this.f73578id;
    }

    @m
    public final String getLogo() {
        return this.logo;
    }

    @m
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        Integer num = this.f73578id;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.logo;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setId(@m Integer num) {
        this.f73578id = num;
    }

    public final void setLogo(@m String str) {
        this.logo = str;
    }

    public final void setName(@m String str) {
        this.name = str;
    }

    @l
    public String toString() {
        return "Team(id=" + this.f73578id + ", name=" + this.name + ", logo=" + this.logo + j.f86771d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@l Parcel dest, int i10) {
        int iIntValue;
        m0.p(dest, "dest");
        Integer num = this.f73578id;
        if (num == null) {
            iIntValue = 0;
        } else {
            dest.writeInt(1);
            iIntValue = num.intValue();
        }
        dest.writeInt(iIntValue);
        dest.writeString(this.name);
        dest.writeString(this.logo);
    }

    public Team(@m Integer num, @m String str, @m String str2) {
        this.f73578id = num;
        this.name = str;
        this.logo = str2;
    }

    public /* synthetic */ Team(Integer num, String str, String str2, int i10, x xVar) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2);
    }
}
