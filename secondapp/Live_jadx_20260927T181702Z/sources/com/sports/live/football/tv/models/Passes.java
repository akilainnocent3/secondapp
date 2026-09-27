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
public final class Passes implements Parcelable {

    @l
    public static final Parcelable.Creator<Passes> CREATOR = new Creator();

    @fm.c("accuracy")
    @m
    private String accuracy;

    @fm.c("key")
    @m
    private String key;

    @fm.c(C4235d4.i.f61424l)
    @m
    private String total;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Creator implements Parcelable.Creator<Passes> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Passes createFromParcel(Parcel parcel) {
            m0.p(parcel, "parcel");
            return new Passes(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Passes[] newArray(int i10) {
            return new Passes[i10];
        }
    }

    public Passes() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ Passes copy$default(Passes passes, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = passes.total;
        }
        if ((i10 & 2) != 0) {
            str2 = passes.key;
        }
        if ((i10 & 4) != 0) {
            str3 = passes.accuracy;
        }
        return passes.copy(str, str2, str3);
    }

    @m
    public final String component1() {
        return this.total;
    }

    @m
    public final String component2() {
        return this.key;
    }

    @m
    public final String component3() {
        return this.accuracy;
    }

    @l
    public final Passes copy(@m String str, @m String str2, @m String str3) {
        return new Passes(str, str2, str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Passes)) {
            return false;
        }
        Passes passes = (Passes) obj;
        return m0.g(this.total, passes.total) && m0.g(this.key, passes.key) && m0.g(this.accuracy, passes.accuracy);
    }

    @m
    public final String getAccuracy() {
        return this.accuracy;
    }

    @m
    public final String getKey() {
        return this.key;
    }

    @m
    public final String getTotal() {
        return this.total;
    }

    public int hashCode() {
        String str = this.total;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.key;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.accuracy;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setAccuracy(@m String str) {
        this.accuracy = str;
    }

    public final void setKey(@m String str) {
        this.key = str;
    }

    public final void setTotal(@m String str) {
        this.total = str;
    }

    @l
    public String toString() {
        return "Passes(total=" + this.total + ", key=" + this.key + ", accuracy=" + this.accuracy + j.f86771d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@l Parcel dest, int i10) {
        m0.p(dest, "dest");
        dest.writeString(this.total);
        dest.writeString(this.key);
        dest.writeString(this.accuracy);
    }

    public Passes(@m String str, @m String str2, @m String str3) {
        this.total = str;
        this.key = str2;
        this.accuracy = str3;
    }

    public /* synthetic */ Passes(String str, String str2, String str3, int i10, x xVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3);
    }
}
