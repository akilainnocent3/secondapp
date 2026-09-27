package com.sports.live.football.tv.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.C4235d4;
import gi.j;
import iv.c;
import jv.w0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@c
public final class Shots implements Parcelable {

    @l
    public static final Parcelable.Creator<Shots> CREATOR = new Creator();

    /* JADX INFO: renamed from: on, reason: collision with root package name */
    @fm.c(w0.f100926d)
    @m
    private String f73576on;

    @fm.c(C4235d4.i.f61424l)
    @m
    private String total;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Creator implements Parcelable.Creator<Shots> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Shots createFromParcel(Parcel parcel) {
            m0.p(parcel, "parcel");
            return new Shots(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Shots[] newArray(int i10) {
            return new Shots[i10];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Shots() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ Shots copy$default(Shots shots, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = shots.total;
        }
        if ((i10 & 2) != 0) {
            str2 = shots.f73576on;
        }
        return shots.copy(str, str2);
    }

    @m
    public final String component1() {
        return this.total;
    }

    @m
    public final String component2() {
        return this.f73576on;
    }

    @l
    public final Shots copy(@m String str, @m String str2) {
        return new Shots(str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Shots)) {
            return false;
        }
        Shots shots = (Shots) obj;
        return m0.g(this.total, shots.total) && m0.g(this.f73576on, shots.f73576on);
    }

    @m
    public final String getOn() {
        return this.f73576on;
    }

    @m
    public final String getTotal() {
        return this.total;
    }

    public int hashCode() {
        String str = this.total;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f73576on;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setOn(@m String str) {
        this.f73576on = str;
    }

    public final void setTotal(@m String str) {
        this.total = str;
    }

    @l
    public String toString() {
        return "Shots(total=" + this.total + ", on=" + this.f73576on + j.f86771d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@l Parcel dest, int i10) {
        m0.p(dest, "dest");
        dest.writeString(this.total);
        dest.writeString(this.f73576on);
    }

    public Shots(@m String str, @m String str2) {
        this.total = str;
        this.f73576on = str2;
    }

    public /* synthetic */ Shots(String str, String str2, int i10, x xVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2);
    }
}
