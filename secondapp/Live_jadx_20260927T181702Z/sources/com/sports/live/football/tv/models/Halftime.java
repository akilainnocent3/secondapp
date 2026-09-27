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
public final class Halftime implements Parcelable {

    @l
    public static final Parcelable.Creator<Halftime> CREATOR = new Creator();

    @fm.c("away")
    @m
    private Integer away;

    @fm.c("home")
    @m
    private Integer home;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Creator implements Parcelable.Creator<Halftime> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Halftime createFromParcel(Parcel parcel) {
            m0.p(parcel, "parcel");
            return new Halftime(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Halftime[] newArray(int i10) {
            return new Halftime[i10];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Halftime() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ Halftime copy$default(Halftime halftime, Integer num, Integer num2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = halftime.home;
        }
        if ((i10 & 2) != 0) {
            num2 = halftime.away;
        }
        return halftime.copy(num, num2);
    }

    @m
    public final Integer component1() {
        return this.home;
    }

    @m
    public final Integer component2() {
        return this.away;
    }

    @l
    public final Halftime copy(@m Integer num, @m Integer num2) {
        return new Halftime(num, num2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Halftime)) {
            return false;
        }
        Halftime halftime = (Halftime) obj;
        return m0.g(this.home, halftime.home) && m0.g(this.away, halftime.away);
    }

    @m
    public final Integer getAway() {
        return this.away;
    }

    @m
    public final Integer getHome() {
        return this.home;
    }

    public int hashCode() {
        Integer num = this.home;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.away;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final void setAway(@m Integer num) {
        this.away = num;
    }

    public final void setHome(@m Integer num) {
        this.home = num;
    }

    @l
    public String toString() {
        return "Halftime(home=" + this.home + ", away=" + this.away + j.f86771d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@l Parcel dest, int i10) {
        m0.p(dest, "dest");
        Integer num = this.home;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        Integer num2 = this.away;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num2.intValue());
        }
    }

    public Halftime(@m Integer num, @m Integer num2) {
        this.home = num;
        this.away = num2;
    }

    public /* synthetic */ Halftime(Integer num, Integer num2, int i10, x xVar) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : num2);
    }
}
