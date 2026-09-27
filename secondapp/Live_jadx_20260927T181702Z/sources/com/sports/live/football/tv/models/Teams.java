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
public final class Teams implements Parcelable {

    @l
    public static final Parcelable.Creator<Teams> CREATOR = new Creator();

    @fm.c("created_at")
    @m
    private String createdAt;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @fm.c("id")
    @m
    private Integer f73579id;

    @fm.c("logo")
    @m
    private String logo;

    @fm.c("name")
    @m
    private String name;

    @fm.c("team_id")
    @m
    private Integer teamId;

    @fm.c("updated_at")
    @m
    private String updatedAt;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Creator implements Parcelable.Creator<Teams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Teams createFromParcel(Parcel parcel) {
            m0.p(parcel, "parcel");
            return new Teams(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Teams[] newArray(int i10) {
            return new Teams[i10];
        }
    }

    public Teams() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ Teams copy$default(Teams teams, Integer num, Integer num2, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = teams.f73579id;
        }
        if ((i10 & 2) != 0) {
            num2 = teams.teamId;
        }
        if ((i10 & 4) != 0) {
            str = teams.name;
        }
        if ((i10 & 8) != 0) {
            str2 = teams.logo;
        }
        if ((i10 & 16) != 0) {
            str3 = teams.createdAt;
        }
        if ((i10 & 32) != 0) {
            str4 = teams.updatedAt;
        }
        String str5 = str3;
        String str6 = str4;
        return teams.copy(num, num2, str, str2, str5, str6);
    }

    @m
    public final Integer component1() {
        return this.f73579id;
    }

    @m
    public final Integer component2() {
        return this.teamId;
    }

    @m
    public final String component3() {
        return this.name;
    }

    @m
    public final String component4() {
        return this.logo;
    }

    @m
    public final String component5() {
        return this.createdAt;
    }

    @m
    public final String component6() {
        return this.updatedAt;
    }

    @l
    public final Teams copy(@m Integer num, @m Integer num2, @m String str, @m String str2, @m String str3, @m String str4) {
        return new Teams(num, num2, str, str2, str3, str4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Teams)) {
            return false;
        }
        Teams teams = (Teams) obj;
        return m0.g(this.f73579id, teams.f73579id) && m0.g(this.teamId, teams.teamId) && m0.g(this.name, teams.name) && m0.g(this.logo, teams.logo) && m0.g(this.createdAt, teams.createdAt) && m0.g(this.updatedAt, teams.updatedAt);
    }

    @m
    public final String getCreatedAt() {
        return this.createdAt;
    }

    @m
    public final Integer getId() {
        return this.f73579id;
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
    public final Integer getTeamId() {
        return this.teamId;
    }

    @m
    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        Integer num = this.f73579id;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.teamId;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.name;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.logo;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.createdAt;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.updatedAt;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setCreatedAt(@m String str) {
        this.createdAt = str;
    }

    public final void setId(@m Integer num) {
        this.f73579id = num;
    }

    public final void setLogo(@m String str) {
        this.logo = str;
    }

    public final void setName(@m String str) {
        this.name = str;
    }

    public final void setTeamId(@m Integer num) {
        this.teamId = num;
    }

    public final void setUpdatedAt(@m String str) {
        this.updatedAt = str;
    }

    @l
    public String toString() {
        return "Teams(id=" + this.f73579id + ", teamId=" + this.teamId + ", name=" + this.name + ", logo=" + this.logo + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + j.f86771d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@l Parcel dest, int i10) {
        m0.p(dest, "dest");
        Integer num = this.f73579id;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        Integer num2 = this.teamId;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num2.intValue());
        }
        dest.writeString(this.name);
        dest.writeString(this.logo);
        dest.writeString(this.createdAt);
        dest.writeString(this.updatedAt);
    }

    public Teams(@m Integer num, @m Integer num2, @m String str, @m String str2, @m String str3, @m String str4) {
        this.f73579id = num;
        this.teamId = num2;
        this.name = str;
        this.logo = str2;
        this.createdAt = str3;
        this.updatedAt = str4;
    }

    public /* synthetic */ Teams(Integer num, Integer num2, String str, String str2, String str3, String str4, int i10, x xVar) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : num2, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? null : str3, (i10 & 32) != 0 ? null : str4);
    }
}
