package com.sports.live.football.tv.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.C4235d4;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import gi.j;
import iv.c;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@c
public final class Games implements Parcelable {

    @l
    public static final Parcelable.Creator<Games> CREATOR = new Creator();

    @fm.c("appearences")
    @m
    private Integer appearences;

    @fm.c("captain")
    @m
    private Boolean captain;

    @fm.c("lineups")
    @m
    private Integer lineups;

    @fm.c("minutes")
    @m
    private Integer minutes;

    @fm.c("number")
    @m
    private String number;

    @fm.c(C4235d4.i.L)
    @m
    private String position;

    @fm.c(CampaignEx.JSON_KEY_STAR)
    @m
    private String rating;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Creator implements Parcelable.Creator<Games> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Games createFromParcel(Parcel parcel) {
            m0.p(parcel, "parcel");
            Boolean boolValueOf = null;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new Games(numValueOf, numValueOf2, numValueOf3, string, string2, string3, boolValueOf);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Games[] newArray(int i10) {
            return new Games[i10];
        }
    }

    public Games() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ Games copy$default(Games games, Integer num, Integer num2, Integer num3, String str, String str2, String str3, Boolean bool, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = games.appearences;
        }
        if ((i10 & 2) != 0) {
            num2 = games.lineups;
        }
        if ((i10 & 4) != 0) {
            num3 = games.minutes;
        }
        if ((i10 & 8) != 0) {
            str = games.number;
        }
        if ((i10 & 16) != 0) {
            str2 = games.position;
        }
        if ((i10 & 32) != 0) {
            str3 = games.rating;
        }
        if ((i10 & 64) != 0) {
            bool = games.captain;
        }
        String str4 = str3;
        Boolean bool2 = bool;
        String str5 = str2;
        Integer num4 = num3;
        return games.copy(num, num2, num4, str, str5, str4, bool2);
    }

    @m
    public final Integer component1() {
        return this.appearences;
    }

    @m
    public final Integer component2() {
        return this.lineups;
    }

    @m
    public final Integer component3() {
        return this.minutes;
    }

    @m
    public final String component4() {
        return this.number;
    }

    @m
    public final String component5() {
        return this.position;
    }

    @m
    public final String component6() {
        return this.rating;
    }

    @m
    public final Boolean component7() {
        return this.captain;
    }

    @l
    public final Games copy(@m Integer num, @m Integer num2, @m Integer num3, @m String str, @m String str2, @m String str3, @m Boolean bool) {
        return new Games(num, num2, num3, str, str2, str3, bool);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Games)) {
            return false;
        }
        Games games = (Games) obj;
        return m0.g(this.appearences, games.appearences) && m0.g(this.lineups, games.lineups) && m0.g(this.minutes, games.minutes) && m0.g(this.number, games.number) && m0.g(this.position, games.position) && m0.g(this.rating, games.rating) && m0.g(this.captain, games.captain);
    }

    @m
    public final Integer getAppearences() {
        return this.appearences;
    }

    @m
    public final Boolean getCaptain() {
        return this.captain;
    }

    @m
    public final Integer getLineups() {
        return this.lineups;
    }

    @m
    public final Integer getMinutes() {
        return this.minutes;
    }

    @m
    public final String getNumber() {
        return this.number;
    }

    @m
    public final String getPosition() {
        return this.position;
    }

    @m
    public final String getRating() {
        return this.rating;
    }

    public int hashCode() {
        Integer num = this.appearences;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.lineups;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.minutes;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str = this.number;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.position;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.rating;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.captain;
        return iHashCode6 + (bool != null ? bool.hashCode() : 0);
    }

    public final void setAppearences(@m Integer num) {
        this.appearences = num;
    }

    public final void setCaptain(@m Boolean bool) {
        this.captain = bool;
    }

    public final void setLineups(@m Integer num) {
        this.lineups = num;
    }

    public final void setMinutes(@m Integer num) {
        this.minutes = num;
    }

    public final void setNumber(@m String str) {
        this.number = str;
    }

    public final void setPosition(@m String str) {
        this.position = str;
    }

    public final void setRating(@m String str) {
        this.rating = str;
    }

    @l
    public String toString() {
        return "Games(appearences=" + this.appearences + ", lineups=" + this.lineups + ", minutes=" + this.minutes + ", number=" + this.number + ", position=" + this.position + ", rating=" + this.rating + ", captain=" + this.captain + j.f86771d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@l Parcel dest, int i10) {
        m0.p(dest, "dest");
        Integer num = this.appearences;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        Integer num2 = this.lineups;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num2.intValue());
        }
        Integer num3 = this.minutes;
        if (num3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num3.intValue());
        }
        dest.writeString(this.number);
        dest.writeString(this.position);
        dest.writeString(this.rating);
        Boolean bool = this.captain;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    public Games(@m Integer num, @m Integer num2, @m Integer num3, @m String str, @m String str2, @m String str3, @m Boolean bool) {
        this.appearences = num;
        this.lineups = num2;
        this.minutes = num3;
        this.number = str;
        this.position = str2;
        this.rating = str3;
        this.captain = bool;
    }

    public /* synthetic */ Games(Integer num, Integer num2, Integer num3, String str, String str2, String str3, Boolean bool, int i10, x xVar) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : num2, (i10 & 4) != 0 ? null : num3, (i10 & 8) != 0 ? null : str, (i10 & 16) != 0 ? null : str2, (i10 & 32) != 0 ? null : str3, (i10 & 64) != 0 ? null : bool);
    }
}
