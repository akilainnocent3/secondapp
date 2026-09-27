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
public final class Extratime implements Parcelable {

    @l
    public static final Parcelable.Creator<Extratime> CREATOR = new Creator();

    @fm.c("away")
    @m
    private String away;

    @fm.c("home")
    @m
    private String home;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Creator implements Parcelable.Creator<Extratime> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Extratime createFromParcel(Parcel parcel) {
            m0.p(parcel, "parcel");
            return new Extratime(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Extratime[] newArray(int i10) {
            return new Extratime[i10];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Extratime() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ Extratime copy$default(Extratime extratime, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = extratime.home;
        }
        if ((i10 & 2) != 0) {
            str2 = extratime.away;
        }
        return extratime.copy(str, str2);
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
    public final Extratime copy(@m String str, @m String str2) {
        return new Extratime(str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Extratime)) {
            return false;
        }
        Extratime extratime = (Extratime) obj;
        return m0.g(this.home, extratime.home) && m0.g(this.away, extratime.away);
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
        return "Extratime(home=" + this.home + ", away=" + this.away + j.f86771d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@l Parcel dest, int i10) {
        m0.p(dest, "dest");
        dest.writeString(this.home);
        dest.writeString(this.away);
    }

    public Extratime(@m String str, @m String str2) {
        this.home = str;
        this.away = str2;
    }

    public /* synthetic */ Extratime(String str, String str2, int i10, x xVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2);
    }
}
