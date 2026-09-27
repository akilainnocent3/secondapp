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
public final class Status implements Parcelable {

    @l
    public static final Parcelable.Creator<Status> CREATOR = new Creator();

    @fm.c("elapsed")
    @m
    private Integer elapsed;

    @fm.c("long")
    @m
    private String longName;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    @fm.c("short")
    @m
    private String f3258short;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Creator implements Parcelable.Creator<Status> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Status createFromParcel(Parcel parcel) {
            m0.p(parcel, "parcel");
            return new Status(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Status[] newArray(int i10) {
            return new Status[i10];
        }
    }

    public Status() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ Status copy$default(Status status, String str, String str2, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = status.longName;
        }
        if ((i10 & 2) != 0) {
            str2 = status.f3258short;
        }
        if ((i10 & 4) != 0) {
            num = status.elapsed;
        }
        return status.copy(str, str2, num);
    }

    @m
    public final String component1() {
        return this.longName;
    }

    @m
    public final String component2() {
        return this.f3258short;
    }

    @m
    public final Integer component3() {
        return this.elapsed;
    }

    @l
    public final Status copy(@m String str, @m String str2, @m Integer num) {
        return new Status(str, str2, num);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return m0.g(this.longName, status.longName) && m0.g(this.f3258short, status.f3258short) && m0.g(this.elapsed, status.elapsed);
    }

    @m
    public final Integer getElapsed() {
        return this.elapsed;
    }

    @m
    public final String getLongName() {
        return this.longName;
    }

    @m
    public final String getShort() {
        return this.f3258short;
    }

    public int hashCode() {
        String str = this.longName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f3258short;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.elapsed;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final void setElapsed(@m Integer num) {
        this.elapsed = num;
    }

    public final void setLongName(@m String str) {
        this.longName = str;
    }

    public final void setShort(@m String str) {
        this.f3258short = str;
    }

    @l
    public String toString() {
        return "Status(longName=" + this.longName + ", short=" + this.f3258short + ", elapsed=" + this.elapsed + j.f86771d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@l Parcel dest, int i10) {
        m0.p(dest, "dest");
        dest.writeString(this.longName);
        dest.writeString(this.f3258short);
        Integer num = this.elapsed;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
    }

    public Status(@m String str, @m String str2, @m Integer num) {
        this.longName = str;
        this.f3258short = str2;
        this.elapsed = num;
    }

    public /* synthetic */ Status(String str, String str2, Integer num, int i10, x xVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : num);
    }
}
