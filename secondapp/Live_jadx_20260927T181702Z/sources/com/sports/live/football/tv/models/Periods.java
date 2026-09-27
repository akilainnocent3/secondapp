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
public final class Periods implements Parcelable {

    @l
    public static final Parcelable.Creator<Periods> CREATOR = new Creator();

    @fm.c("first")
    @m
    private Integer first;

    @fm.c(TypeAdapters.r.f52529f)
    @m
    private String second;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Creator implements Parcelable.Creator<Periods> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Periods createFromParcel(Parcel parcel) {
            m0.p(parcel, "parcel");
            return new Periods(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Periods[] newArray(int i10) {
            return new Periods[i10];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Periods() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ Periods copy$default(Periods periods, Integer num, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = periods.first;
        }
        if ((i10 & 2) != 0) {
            str = periods.second;
        }
        return periods.copy(num, str);
    }

    @m
    public final Integer component1() {
        return this.first;
    }

    @m
    public final String component2() {
        return this.second;
    }

    @l
    public final Periods copy(@m Integer num, @m String str) {
        return new Periods(num, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Periods)) {
            return false;
        }
        Periods periods = (Periods) obj;
        return m0.g(this.first, periods.first) && m0.g(this.second, periods.second);
    }

    @m
    public final Integer getFirst() {
        return this.first;
    }

    @m
    public final String getSecond() {
        return this.second;
    }

    public int hashCode() {
        Integer num = this.first;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.second;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final void setFirst(@m Integer num) {
        this.first = num;
    }

    public final void setSecond(@m String str) {
        this.second = str;
    }

    @l
    public String toString() {
        return "Periods(first=" + this.first + ", second=" + this.second + j.f86771d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@l Parcel dest, int i10) {
        int iIntValue;
        m0.p(dest, "dest");
        Integer num = this.first;
        if (num == null) {
            iIntValue = 0;
        } else {
            dest.writeInt(1);
            iIntValue = num.intValue();
        }
        dest.writeInt(iIntValue);
        dest.writeString(this.second);
    }

    public Periods(@m Integer num, @m String str) {
        this.first = num;
        this.second = str;
    }

    public /* synthetic */ Periods(Integer num, String str, int i10, x xVar) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : str);
    }
}
