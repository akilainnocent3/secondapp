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
public final class Assist implements Parcelable {

    @l
    public static final Parcelable.Creator<Assist> CREATOR = new Creator();

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @fm.c("id")
    @m
    private String f73563id;

    @fm.c("name")
    @m
    private String name;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Creator implements Parcelable.Creator<Assist> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Assist createFromParcel(Parcel parcel) {
            m0.p(parcel, "parcel");
            return new Assist(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Assist[] newArray(int i10) {
            return new Assist[i10];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Assist() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ Assist copy$default(Assist assist, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = assist.f73563id;
        }
        if ((i10 & 2) != 0) {
            str2 = assist.name;
        }
        return assist.copy(str, str2);
    }

    @m
    public final String component1() {
        return this.f73563id;
    }

    @m
    public final String component2() {
        return this.name;
    }

    @l
    public final Assist copy(@m String str, @m String str2) {
        return new Assist(str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Assist)) {
            return false;
        }
        Assist assist = (Assist) obj;
        return m0.g(this.f73563id, assist.f73563id) && m0.g(this.name, assist.name);
    }

    @m
    public final String getId() {
        return this.f73563id;
    }

    @m
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        String str = this.f73563id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setId(@m String str) {
        this.f73563id = str;
    }

    public final void setName(@m String str) {
        this.name = str;
    }

    @l
    public String toString() {
        return "Assist(id=" + this.f73563id + ", name=" + this.name + j.f86771d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@l Parcel dest, int i10) {
        m0.p(dest, "dest");
        dest.writeString(this.f73563id);
        dest.writeString(this.name);
    }

    public Assist(@m String str, @m String str2) {
        this.f73563id = str;
        this.name = str2;
    }

    public /* synthetic */ Assist(String str, String str2, int i10, x xVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2);
    }
}
