package com.sports.live.football.tv.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.internal.bind.TypeAdapters;
import gi.j;
import iv.c;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@c
public final class LeagueSeasonData implements Parcelable {

    @l
    public static final Parcelable.Creator<LeagueSeasonData> CREATOR = new Creator();

    @fm.c("created_at")
    @m
    private String createdAt;

    @fm.c("current")
    @m
    private Boolean current;

    @fm.c("end")
    @m
    private String end;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @fm.c("id")
    @m
    private Integer f73569id;

    @fm.c("league_id")
    @m
    private Integer leagueId;

    @fm.c("start")
    @m
    private String start;

    @fm.c("updated_at")
    @m
    private String updatedAt;

    @fm.c(TypeAdapters.r.f52524a)
    @m
    private Integer year;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Creator implements Parcelable.Creator<LeagueSeasonData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LeagueSeasonData createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            m0.p(parcel, "parcel");
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new LeagueSeasonData(numValueOf, numValueOf2, boolValueOf, parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LeagueSeasonData[] newArray(int i10) {
            return new LeagueSeasonData[i10];
        }
    }

    public LeagueSeasonData() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public static /* synthetic */ LeagueSeasonData copy$default(LeagueSeasonData leagueSeasonData, Integer num, Integer num2, Boolean bool, String str, String str2, Integer num3, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = leagueSeasonData.f73569id;
        }
        if ((i10 & 2) != 0) {
            num2 = leagueSeasonData.year;
        }
        if ((i10 & 4) != 0) {
            bool = leagueSeasonData.current;
        }
        if ((i10 & 8) != 0) {
            str = leagueSeasonData.start;
        }
        if ((i10 & 16) != 0) {
            str2 = leagueSeasonData.end;
        }
        if ((i10 & 32) != 0) {
            num3 = leagueSeasonData.leagueId;
        }
        if ((i10 & 64) != 0) {
            str3 = leagueSeasonData.createdAt;
        }
        if ((i10 & 128) != 0) {
            str4 = leagueSeasonData.updatedAt;
        }
        String str5 = str3;
        String str6 = str4;
        String str7 = str2;
        Integer num4 = num3;
        return leagueSeasonData.copy(num, num2, bool, str, str7, num4, str5, str6);
    }

    @m
    public final Integer component1() {
        return this.f73569id;
    }

    @m
    public final Integer component2() {
        return this.year;
    }

    @m
    public final Boolean component3() {
        return this.current;
    }

    @m
    public final String component4() {
        return this.start;
    }

    @m
    public final String component5() {
        return this.end;
    }

    @m
    public final Integer component6() {
        return this.leagueId;
    }

    @m
    public final String component7() {
        return this.createdAt;
    }

    @m
    public final String component8() {
        return this.updatedAt;
    }

    @l
    public final LeagueSeasonData copy(@m Integer num, @m Integer num2, @m Boolean bool, @m String str, @m String str2, @m Integer num3, @m String str3, @m String str4) {
        return new LeagueSeasonData(num, num2, bool, str, str2, num3, str3, str4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeagueSeasonData)) {
            return false;
        }
        LeagueSeasonData leagueSeasonData = (LeagueSeasonData) obj;
        return m0.g(this.f73569id, leagueSeasonData.f73569id) && m0.g(this.year, leagueSeasonData.year) && m0.g(this.current, leagueSeasonData.current) && m0.g(this.start, leagueSeasonData.start) && m0.g(this.end, leagueSeasonData.end) && m0.g(this.leagueId, leagueSeasonData.leagueId) && m0.g(this.createdAt, leagueSeasonData.createdAt) && m0.g(this.updatedAt, leagueSeasonData.updatedAt);
    }

    @m
    public final String getCreatedAt() {
        return this.createdAt;
    }

    @m
    public final Boolean getCurrent() {
        return this.current;
    }

    @m
    public final String getEnd() {
        return this.end;
    }

    @m
    public final Integer getId() {
        return this.f73569id;
    }

    @m
    public final Integer getLeagueId() {
        return this.leagueId;
    }

    @m
    public final String getStart() {
        return this.start;
    }

    @m
    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    @m
    public final Integer getYear() {
        return this.year;
    }

    public int hashCode() {
        Integer num = this.f73569id;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.year;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.current;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.start;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.end;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num3 = this.leagueId;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str3 = this.createdAt;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.updatedAt;
        return iHashCode7 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setCreatedAt(@m String str) {
        this.createdAt = str;
    }

    public final void setCurrent(@m Boolean bool) {
        this.current = bool;
    }

    public final void setEnd(@m String str) {
        this.end = str;
    }

    public final void setId(@m Integer num) {
        this.f73569id = num;
    }

    public final void setLeagueId(@m Integer num) {
        this.leagueId = num;
    }

    public final void setStart(@m String str) {
        this.start = str;
    }

    public final void setUpdatedAt(@m String str) {
        this.updatedAt = str;
    }

    public final void setYear(@m Integer num) {
        this.year = num;
    }

    @l
    public String toString() {
        return "LeagueSeasonData(id=" + this.f73569id + ", year=" + this.year + ", current=" + this.current + ", start=" + this.start + ", end=" + this.end + ", leagueId=" + this.leagueId + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + j.f86771d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@l Parcel dest, int i10) {
        m0.p(dest, "dest");
        Integer num = this.f73569id;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        Integer num2 = this.year;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num2.intValue());
        }
        Boolean bool = this.current;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        dest.writeString(this.start);
        dest.writeString(this.end);
        Integer num3 = this.leagueId;
        if (num3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num3.intValue());
        }
        dest.writeString(this.createdAt);
        dest.writeString(this.updatedAt);
    }

    public LeagueSeasonData(@m Integer num, @m Integer num2, @m Boolean bool, @m String str, @m String str2, @m Integer num3, @m String str3, @m String str4) {
        this.f73569id = num;
        this.year = num2;
        this.current = bool;
        this.start = str;
        this.end = str2;
        this.leagueId = num3;
        this.createdAt = str3;
        this.updatedAt = str4;
    }

    public /* synthetic */ LeagueSeasonData(Integer num, Integer num2, Boolean bool, String str, String str2, Integer num3, String str3, String str4, int i10, x xVar) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : num2, (i10 & 4) != 0 ? null : bool, (i10 & 8) != 0 ? null : str, (i10 & 16) != 0 ? null : str2, (i10 & 32) != 0 ? null : num3, (i10 & 64) != 0 ? null : str3, (i10 & 128) != 0 ? null : str4);
    }
}
