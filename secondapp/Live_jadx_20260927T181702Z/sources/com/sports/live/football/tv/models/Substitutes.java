package com.sports.live.football.tv.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import gi.j;
import iv.c;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@c
public final class Substitutes implements Parcelable {

    @l
    public static final Parcelable.Creator<Substitutes> CREATOR = new Creator();

    @fm.c("bench")
    @m
    private Integer bench;

    @fm.c(ScarConstants.IN_SIGNAL_KEY)
    @m
    private Integer inn;

    @fm.c("out")
    @m
    private Integer out;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Creator implements Parcelable.Creator<Substitutes> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Substitutes createFromParcel(Parcel parcel) {
            m0.p(parcel, "parcel");
            return new Substitutes(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Substitutes[] newArray(int i10) {
            return new Substitutes[i10];
        }
    }

    public Substitutes() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ Substitutes copy$default(Substitutes substitutes, Integer num, Integer num2, Integer num3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = substitutes.inn;
        }
        if ((i10 & 2) != 0) {
            num2 = substitutes.out;
        }
        if ((i10 & 4) != 0) {
            num3 = substitutes.bench;
        }
        return substitutes.copy(num, num2, num3);
    }

    @m
    public final Integer component1() {
        return this.inn;
    }

    @m
    public final Integer component2() {
        return this.out;
    }

    @m
    public final Integer component3() {
        return this.bench;
    }

    @l
    public final Substitutes copy(@m Integer num, @m Integer num2, @m Integer num3) {
        return new Substitutes(num, num2, num3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Substitutes)) {
            return false;
        }
        Substitutes substitutes = (Substitutes) obj;
        return m0.g(this.inn, substitutes.inn) && m0.g(this.out, substitutes.out) && m0.g(this.bench, substitutes.bench);
    }

    @m
    public final Integer getBench() {
        return this.bench;
    }

    @m
    public final Integer getInn() {
        return this.inn;
    }

    @m
    public final Integer getOut() {
        return this.out;
    }

    public int hashCode() {
        Integer num = this.inn;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.out;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.bench;
        return iHashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public final void setBench(@m Integer num) {
        this.bench = num;
    }

    public final void setInn(@m Integer num) {
        this.inn = num;
    }

    public final void setOut(@m Integer num) {
        this.out = num;
    }

    @l
    public String toString() {
        return "Substitutes(inn=" + this.inn + ", out=" + this.out + ", bench=" + this.bench + j.f86771d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@l Parcel dest, int i10) {
        m0.p(dest, "dest");
        Integer num = this.inn;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        Integer num2 = this.out;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num2.intValue());
        }
        Integer num3 = this.bench;
        if (num3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num3.intValue());
        }
    }

    public Substitutes(@m Integer num, @m Integer num2, @m Integer num3) {
        this.inn = num;
        this.out = num2;
        this.bench = num3;
    }

    public /* synthetic */ Substitutes(Integer num, Integer num2, Integer num3, int i10, x xVar) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : num2, (i10 & 4) != 0 ? null : num3);
    }
}
