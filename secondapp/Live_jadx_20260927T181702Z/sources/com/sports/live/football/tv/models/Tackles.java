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
public final class Tackles implements Parcelable {

    @l
    public static final Parcelable.Creator<Tackles> CREATOR = new Creator();

    @fm.c("blocks")
    @m
    private String blocks;

    @fm.c("interceptions")
    @m
    private String interceptions;

    @fm.c(C4235d4.i.f61424l)
    @m
    private String total;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Creator implements Parcelable.Creator<Tackles> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Tackles createFromParcel(Parcel parcel) {
            m0.p(parcel, "parcel");
            return new Tackles(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Tackles[] newArray(int i10) {
            return new Tackles[i10];
        }
    }

    public Tackles() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ Tackles copy$default(Tackles tackles, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = tackles.total;
        }
        if ((i10 & 2) != 0) {
            str2 = tackles.blocks;
        }
        if ((i10 & 4) != 0) {
            str3 = tackles.interceptions;
        }
        return tackles.copy(str, str2, str3);
    }

    @m
    public final String component1() {
        return this.total;
    }

    @m
    public final String component2() {
        return this.blocks;
    }

    @m
    public final String component3() {
        return this.interceptions;
    }

    @l
    public final Tackles copy(@m String str, @m String str2, @m String str3) {
        return new Tackles(str, str2, str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Tackles)) {
            return false;
        }
        Tackles tackles = (Tackles) obj;
        return m0.g(this.total, tackles.total) && m0.g(this.blocks, tackles.blocks) && m0.g(this.interceptions, tackles.interceptions);
    }

    @m
    public final String getBlocks() {
        return this.blocks;
    }

    @m
    public final String getInterceptions() {
        return this.interceptions;
    }

    @m
    public final String getTotal() {
        return this.total;
    }

    public int hashCode() {
        String str = this.total;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.blocks;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.interceptions;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setBlocks(@m String str) {
        this.blocks = str;
    }

    public final void setInterceptions(@m String str) {
        this.interceptions = str;
    }

    public final void setTotal(@m String str) {
        this.total = str;
    }

    @l
    public String toString() {
        return "Tackles(total=" + this.total + ", blocks=" + this.blocks + ", interceptions=" + this.interceptions + j.f86771d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@l Parcel dest, int i10) {
        m0.p(dest, "dest");
        dest.writeString(this.total);
        dest.writeString(this.blocks);
        dest.writeString(this.interceptions);
    }

    public Tackles(@m String str, @m String str2, @m String str3) {
        this.total = str;
        this.blocks = str2;
        this.interceptions = str3;
    }

    public /* synthetic */ Tackles(String str, String str2, String str3, int i10, x xVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3);
    }
}
