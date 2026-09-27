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
public final class Dribbles implements Parcelable {

    @l
    public static final Parcelable.Creator<Dribbles> CREATOR = new Creator();

    @fm.c("attempts")
    @m
    private String attempts;

    @fm.c("past")
    @m
    private String past;

    @fm.c("success")
    @m
    private String success;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Creator implements Parcelable.Creator<Dribbles> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Dribbles createFromParcel(Parcel parcel) {
            m0.p(parcel, "parcel");
            return new Dribbles(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Dribbles[] newArray(int i10) {
            return new Dribbles[i10];
        }
    }

    public Dribbles() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ Dribbles copy$default(Dribbles dribbles, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = dribbles.attempts;
        }
        if ((i10 & 2) != 0) {
            str2 = dribbles.success;
        }
        if ((i10 & 4) != 0) {
            str3 = dribbles.past;
        }
        return dribbles.copy(str, str2, str3);
    }

    @m
    public final String component1() {
        return this.attempts;
    }

    @m
    public final String component2() {
        return this.success;
    }

    @m
    public final String component3() {
        return this.past;
    }

    @l
    public final Dribbles copy(@m String str, @m String str2, @m String str3) {
        return new Dribbles(str, str2, str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Dribbles)) {
            return false;
        }
        Dribbles dribbles = (Dribbles) obj;
        return m0.g(this.attempts, dribbles.attempts) && m0.g(this.success, dribbles.success) && m0.g(this.past, dribbles.past);
    }

    @m
    public final String getAttempts() {
        return this.attempts;
    }

    @m
    public final String getPast() {
        return this.past;
    }

    @m
    public final String getSuccess() {
        return this.success;
    }

    public int hashCode() {
        String str = this.attempts;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.success;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.past;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setAttempts(@m String str) {
        this.attempts = str;
    }

    public final void setPast(@m String str) {
        this.past = str;
    }

    public final void setSuccess(@m String str) {
        this.success = str;
    }

    @l
    public String toString() {
        return "Dribbles(attempts=" + this.attempts + ", success=" + this.success + ", past=" + this.past + j.f86771d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@l Parcel dest, int i10) {
        m0.p(dest, "dest");
        dest.writeString(this.attempts);
        dest.writeString(this.success);
        dest.writeString(this.past);
    }

    public Dribbles(@m String str, @m String str2, @m String str3) {
        this.attempts = str;
        this.success = str2;
        this.past = str3;
    }

    public /* synthetic */ Dribbles(String str, String str2, String str3, int i10, x xVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3);
    }
}
