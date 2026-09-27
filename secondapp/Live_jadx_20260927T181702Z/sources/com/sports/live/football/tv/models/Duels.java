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
public final class Duels implements Parcelable {

    @l
    public static final Parcelable.Creator<Duels> CREATOR = new Creator();

    @fm.c(C4235d4.i.f61424l)
    @m
    private String total;

    @fm.c("won")
    @m
    private String won;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Creator implements Parcelable.Creator<Duels> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Duels createFromParcel(Parcel parcel) {
            m0.p(parcel, "parcel");
            return new Duels(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Duels[] newArray(int i10) {
            return new Duels[i10];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Duels() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ Duels copy$default(Duels duels, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = duels.total;
        }
        if ((i10 & 2) != 0) {
            str2 = duels.won;
        }
        return duels.copy(str, str2);
    }

    @m
    public final String component1() {
        return this.total;
    }

    @m
    public final String component2() {
        return this.won;
    }

    @l
    public final Duels copy(@m String str, @m String str2) {
        return new Duels(str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Duels)) {
            return false;
        }
        Duels duels = (Duels) obj;
        return m0.g(this.total, duels.total) && m0.g(this.won, duels.won);
    }

    @m
    public final String getTotal() {
        return this.total;
    }

    @m
    public final String getWon() {
        return this.won;
    }

    public int hashCode() {
        String str = this.total;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.won;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setTotal(@m String str) {
        this.total = str;
    }

    public final void setWon(@m String str) {
        this.won = str;
    }

    @l
    public String toString() {
        return "Duels(total=" + this.total + ", won=" + this.won + j.f86771d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@l Parcel dest, int i10) {
        m0.p(dest, "dest");
        dest.writeString(this.total);
        dest.writeString(this.won);
    }

    public Duels(@m String str, @m String str2) {
        this.total = str;
        this.won = str2;
    }

    public /* synthetic */ Duels(String str, String str2, int i10, x xVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2);
    }
}
