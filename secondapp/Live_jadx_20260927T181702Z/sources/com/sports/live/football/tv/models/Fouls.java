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
public final class Fouls implements Parcelable {

    @l
    public static final Parcelable.Creator<Fouls> CREATOR = new Creator();

    @fm.c("committed")
    @m
    private String committed;

    @fm.c("drawn")
    @m
    private String drawn;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Creator implements Parcelable.Creator<Fouls> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Fouls createFromParcel(Parcel parcel) {
            m0.p(parcel, "parcel");
            return new Fouls(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Fouls[] newArray(int i10) {
            return new Fouls[i10];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Fouls() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ Fouls copy$default(Fouls fouls, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = fouls.drawn;
        }
        if ((i10 & 2) != 0) {
            str2 = fouls.committed;
        }
        return fouls.copy(str, str2);
    }

    @m
    public final String component1() {
        return this.drawn;
    }

    @m
    public final String component2() {
        return this.committed;
    }

    @l
    public final Fouls copy(@m String str, @m String str2) {
        return new Fouls(str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Fouls)) {
            return false;
        }
        Fouls fouls = (Fouls) obj;
        return m0.g(this.drawn, fouls.drawn) && m0.g(this.committed, fouls.committed);
    }

    @m
    public final String getCommitted() {
        return this.committed;
    }

    @m
    public final String getDrawn() {
        return this.drawn;
    }

    public int hashCode() {
        String str = this.drawn;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.committed;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setCommitted(@m String str) {
        this.committed = str;
    }

    public final void setDrawn(@m String str) {
        this.drawn = str;
    }

    @l
    public String toString() {
        return "Fouls(drawn=" + this.drawn + ", committed=" + this.committed + j.f86771d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@l Parcel dest, int i10) {
        m0.p(dest, "dest");
        dest.writeString(this.drawn);
        dest.writeString(this.committed);
    }

    public Fouls(@m String str, @m String str2) {
        this.drawn = str;
        this.committed = str2;
    }

    public /* synthetic */ Fouls(String str, String str2, int i10, x xVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2);
    }
}
