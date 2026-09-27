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
public final class Fulltime implements Parcelable {

    @l
    public static final Parcelable.Creator<Fulltime> CREATOR = new Creator();

    @fm.c("away")
    @m
    private String away;

    @fm.c("home")
    @m
    private String home;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Creator implements Parcelable.Creator<Fulltime> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Fulltime createFromParcel(Parcel parcel) {
            m0.p(parcel, "parcel");
            return new Fulltime(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Fulltime[] newArray(int i10) {
            return new Fulltime[i10];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Fulltime() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ Fulltime copy$default(Fulltime fulltime, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = fulltime.home;
        }
        if ((i10 & 2) != 0) {
            str2 = fulltime.away;
        }
        return fulltime.copy(str, str2);
    }

    @m
    public final String component1() {
        return this.home;
    }

    @m
    public final String component2() {
        return this.away;
    }

    @l
    public final Fulltime copy(@m String str, @m String str2) {
        return new Fulltime(str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Fulltime)) {
            return false;
        }
        Fulltime fulltime = (Fulltime) obj;
        return m0.g(this.home, fulltime.home) && m0.g(this.away, fulltime.away);
    }

    @m
    public final String getAway() {
        return this.away;
    }

    @m
    public final String getHome() {
        return this.home;
    }

    public int hashCode() {
        String str = this.home;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.away;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setAway(@m String str) {
        this.away = str;
    }

    public final void setHome(@m String str) {
        this.home = str;
    }

    @l
    public String toString() {
        return "Fulltime(home=" + this.home + ", away=" + this.away + j.f86771d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@l Parcel dest, int i10) {
        m0.p(dest, "dest");
        dest.writeString(this.home);
        dest.writeString(this.away);
    }

    public Fulltime(@m String str, @m String str2) {
        this.home = str;
        this.away = str2;
    }

    public /* synthetic */ Fulltime(String str, String str2, int i10, x xVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2);
    }
}
