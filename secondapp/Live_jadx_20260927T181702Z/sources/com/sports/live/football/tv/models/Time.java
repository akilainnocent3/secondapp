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
public final class Time implements Parcelable {

    @l
    public static final Parcelable.Creator<Time> CREATOR = new Creator();

    @fm.c("elapsed")
    @m
    private Integer elapsed;

    @fm.c("extra")
    @m
    private String extra;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Creator implements Parcelable.Creator<Time> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Time createFromParcel(Parcel parcel) {
            m0.p(parcel, "parcel");
            return new Time(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Time[] newArray(int i10) {
            return new Time[i10];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Time() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ Time copy$default(Time time, Integer num, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = time.elapsed;
        }
        if ((i10 & 2) != 0) {
            str = time.extra;
        }
        return time.copy(num, str);
    }

    @m
    public final Integer component1() {
        return this.elapsed;
    }

    @m
    public final String component2() {
        return this.extra;
    }

    @l
    public final Time copy(@m Integer num, @m String str) {
        return new Time(num, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Time)) {
            return false;
        }
        Time time = (Time) obj;
        return m0.g(this.elapsed, time.elapsed) && m0.g(this.extra, time.extra);
    }

    @m
    public final Integer getElapsed() {
        return this.elapsed;
    }

    @m
    public final String getExtra() {
        return this.extra;
    }

    public int hashCode() {
        Integer num = this.elapsed;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.extra;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final void setElapsed(@m Integer num) {
        this.elapsed = num;
    }

    public final void setExtra(@m String str) {
        this.extra = str;
    }

    @l
    public String toString() {
        return "Time(elapsed=" + this.elapsed + ", extra=" + this.extra + j.f86771d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@l Parcel dest, int i10) {
        int iIntValue;
        m0.p(dest, "dest");
        Integer num = this.elapsed;
        if (num == null) {
            iIntValue = 0;
        } else {
            dest.writeInt(1);
            iIntValue = num.intValue();
        }
        dest.writeInt(iIntValue);
        dest.writeString(this.extra);
    }

    public Time(@m Integer num, @m String str) {
        this.elapsed = num;
        this.extra = str;
    }

    public /* synthetic */ Time(Integer num, String str, int i10, x xVar) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : str);
    }
}
