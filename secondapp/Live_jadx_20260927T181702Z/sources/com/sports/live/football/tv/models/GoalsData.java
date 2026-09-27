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
public final class GoalsData implements Parcelable {

    @l
    public static final Parcelable.Creator<GoalsData> CREATOR = new Creator();

    @fm.c("assists")
    @m
    private String assists;

    @fm.c("conceded")
    @m
    private Integer conceded;

    @fm.c("saves")
    @m
    private String saves;

    @fm.c(C4235d4.i.f61424l)
    @m
    private Integer total;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Creator implements Parcelable.Creator<GoalsData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GoalsData createFromParcel(Parcel parcel) {
            m0.p(parcel, "parcel");
            return new GoalsData(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GoalsData[] newArray(int i10) {
            return new GoalsData[i10];
        }
    }

    public GoalsData() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ GoalsData copy$default(GoalsData goalsData, Integer num, Integer num2, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = goalsData.total;
        }
        if ((i10 & 2) != 0) {
            num2 = goalsData.conceded;
        }
        if ((i10 & 4) != 0) {
            str = goalsData.assists;
        }
        if ((i10 & 8) != 0) {
            str2 = goalsData.saves;
        }
        return goalsData.copy(num, num2, str, str2);
    }

    @m
    public final Integer component1() {
        return this.total;
    }

    @m
    public final Integer component2() {
        return this.conceded;
    }

    @m
    public final String component3() {
        return this.assists;
    }

    @m
    public final String component4() {
        return this.saves;
    }

    @l
    public final GoalsData copy(@m Integer num, @m Integer num2, @m String str, @m String str2) {
        return new GoalsData(num, num2, str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GoalsData)) {
            return false;
        }
        GoalsData goalsData = (GoalsData) obj;
        return m0.g(this.total, goalsData.total) && m0.g(this.conceded, goalsData.conceded) && m0.g(this.assists, goalsData.assists) && m0.g(this.saves, goalsData.saves);
    }

    @m
    public final String getAssists() {
        return this.assists;
    }

    @m
    public final Integer getConceded() {
        return this.conceded;
    }

    @m
    public final String getSaves() {
        return this.saves;
    }

    @m
    public final Integer getTotal() {
        return this.total;
    }

    public int hashCode() {
        Integer num = this.total;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.conceded;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.assists;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.saves;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setAssists(@m String str) {
        this.assists = str;
    }

    public final void setConceded(@m Integer num) {
        this.conceded = num;
    }

    public final void setSaves(@m String str) {
        this.saves = str;
    }

    public final void setTotal(@m Integer num) {
        this.total = num;
    }

    @l
    public String toString() {
        return "GoalsData(total=" + this.total + ", conceded=" + this.conceded + ", assists=" + this.assists + ", saves=" + this.saves + j.f86771d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@l Parcel dest, int i10) {
        m0.p(dest, "dest");
        Integer num = this.total;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        Integer num2 = this.conceded;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num2.intValue());
        }
        dest.writeString(this.assists);
        dest.writeString(this.saves);
    }

    public GoalsData(@m Integer num, @m Integer num2, @m String str, @m String str2) {
        this.total = num;
        this.conceded = num2;
        this.assists = str;
        this.saves = str2;
    }

    public /* synthetic */ GoalsData(Integer num, Integer num2, String str, String str2, int i10, x xVar) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : num2, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? null : str2);
    }
}
