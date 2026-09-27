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
public final class Player implements Parcelable {

    @l
    public static final Parcelable.Creator<Player> CREATOR = new Creator();

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @fm.c("id")
    @m
    private String f73573id;

    @fm.c("name")
    @m
    private String name;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Creator implements Parcelable.Creator<Player> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Player createFromParcel(Parcel parcel) {
            m0.p(parcel, "parcel");
            return new Player(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Player[] newArray(int i10) {
            return new Player[i10];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Player() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ Player copy$default(Player player, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = player.f73573id;
        }
        if ((i10 & 2) != 0) {
            str2 = player.name;
        }
        return player.copy(str, str2);
    }

    @m
    public final String component1() {
        return this.f73573id;
    }

    @m
    public final String component2() {
        return this.name;
    }

    @l
    public final Player copy(@m String str, @m String str2) {
        return new Player(str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Player)) {
            return false;
        }
        Player player = (Player) obj;
        return m0.g(this.f73573id, player.f73573id) && m0.g(this.name, player.name);
    }

    @m
    public final String getId() {
        return this.f73573id;
    }

    @m
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        String str = this.f73573id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setId(@m String str) {
        this.f73573id = str;
    }

    public final void setName(@m String str) {
        this.name = str;
    }

    @l
    public String toString() {
        return "Player(id=" + this.f73573id + ", name=" + this.name + j.f86771d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@l Parcel dest, int i10) {
        m0.p(dest, "dest");
        dest.writeString(this.f73573id);
        dest.writeString(this.name);
    }

    public Player(@m String str, @m String str2) {
        this.f73573id = str;
        this.name = str2;
    }

    public /* synthetic */ Player(String str, String str2, int i10, x xVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2);
    }
}
