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
public final class PenaltyData implements Parcelable {

    @l
    public static final Parcelable.Creator<PenaltyData> CREATOR = new Creator();

    @fm.c("commited")
    @m
    private String commited;

    @fm.c("missed")
    @m
    private Integer missed;

    @fm.c("saved")
    @m
    private Integer saved;

    @fm.c("scored")
    @m
    private Integer scored;

    @fm.c("won")
    @m
    private String won;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Creator implements Parcelable.Creator<PenaltyData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PenaltyData createFromParcel(Parcel parcel) {
            m0.p(parcel, "parcel");
            return new PenaltyData(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PenaltyData[] newArray(int i10) {
            return new PenaltyData[i10];
        }
    }

    public PenaltyData() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ PenaltyData copy$default(PenaltyData penaltyData, String str, String str2, Integer num, Integer num2, Integer num3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = penaltyData.won;
        }
        if ((i10 & 2) != 0) {
            str2 = penaltyData.commited;
        }
        if ((i10 & 4) != 0) {
            num = penaltyData.scored;
        }
        if ((i10 & 8) != 0) {
            num2 = penaltyData.missed;
        }
        if ((i10 & 16) != 0) {
            num3 = penaltyData.saved;
        }
        Integer num4 = num3;
        Integer num5 = num;
        return penaltyData.copy(str, str2, num5, num2, num4);
    }

    @m
    public final String component1() {
        return this.won;
    }

    @m
    public final String component2() {
        return this.commited;
    }

    @m
    public final Integer component3() {
        return this.scored;
    }

    @m
    public final Integer component4() {
        return this.missed;
    }

    @m
    public final Integer component5() {
        return this.saved;
    }

    @l
    public final PenaltyData copy(@m String str, @m String str2, @m Integer num, @m Integer num2, @m Integer num3) {
        return new PenaltyData(str, str2, num, num2, num3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PenaltyData)) {
            return false;
        }
        PenaltyData penaltyData = (PenaltyData) obj;
        return m0.g(this.won, penaltyData.won) && m0.g(this.commited, penaltyData.commited) && m0.g(this.scored, penaltyData.scored) && m0.g(this.missed, penaltyData.missed) && m0.g(this.saved, penaltyData.saved);
    }

    @m
    public final String getCommited() {
        return this.commited;
    }

    @m
    public final Integer getMissed() {
        return this.missed;
    }

    @m
    public final Integer getSaved() {
        return this.saved;
    }

    @m
    public final Integer getScored() {
        return this.scored;
    }

    @m
    public final String getWon() {
        return this.won;
    }

    public int hashCode() {
        String str = this.won;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.commited;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.scored;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.missed;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.saved;
        return iHashCode4 + (num3 != null ? num3.hashCode() : 0);
    }

    public final void setCommited(@m String str) {
        this.commited = str;
    }

    public final void setMissed(@m Integer num) {
        this.missed = num;
    }

    public final void setSaved(@m Integer num) {
        this.saved = num;
    }

    public final void setScored(@m Integer num) {
        this.scored = num;
    }

    public final void setWon(@m String str) {
        this.won = str;
    }

    @l
    public String toString() {
        return "PenaltyData(won=" + this.won + ", commited=" + this.commited + ", scored=" + this.scored + ", missed=" + this.missed + ", saved=" + this.saved + j.f86771d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@l Parcel dest, int i10) {
        m0.p(dest, "dest");
        dest.writeString(this.won);
        dest.writeString(this.commited);
        Integer num = this.scored;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        Integer num2 = this.missed;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num2.intValue());
        }
        Integer num3 = this.saved;
        if (num3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num3.intValue());
        }
    }

    public PenaltyData(@m String str, @m String str2, @m Integer num, @m Integer num2, @m Integer num3) {
        this.won = str;
        this.commited = str2;
        this.scored = num;
        this.missed = num2;
        this.saved = num3;
    }

    public /* synthetic */ PenaltyData(String str, String str2, Integer num, Integer num2, Integer num3, int i10, x xVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : num, (i10 & 8) != 0 ? null : num2, (i10 & 16) != 0 ? null : num3);
    }
}
