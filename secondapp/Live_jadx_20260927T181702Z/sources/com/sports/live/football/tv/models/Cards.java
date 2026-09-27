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
public final class Cards implements Parcelable {

    @l
    public static final Parcelable.Creator<Cards> CREATOR = new Creator();

    @fm.c("red")
    @m
    private Integer red;

    @fm.c("yellow")
    @m
    private Integer yellow;

    @fm.c("yellowred")
    @m
    private Integer yellowred;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Creator implements Parcelable.Creator<Cards> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Cards createFromParcel(Parcel parcel) {
            m0.p(parcel, "parcel");
            return new Cards(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Cards[] newArray(int i10) {
            return new Cards[i10];
        }
    }

    public Cards() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ Cards copy$default(Cards cards, Integer num, Integer num2, Integer num3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = cards.yellow;
        }
        if ((i10 & 2) != 0) {
            num2 = cards.yellowred;
        }
        if ((i10 & 4) != 0) {
            num3 = cards.red;
        }
        return cards.copy(num, num2, num3);
    }

    @m
    public final Integer component1() {
        return this.yellow;
    }

    @m
    public final Integer component2() {
        return this.yellowred;
    }

    @m
    public final Integer component3() {
        return this.red;
    }

    @l
    public final Cards copy(@m Integer num, @m Integer num2, @m Integer num3) {
        return new Cards(num, num2, num3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cards)) {
            return false;
        }
        Cards cards = (Cards) obj;
        return m0.g(this.yellow, cards.yellow) && m0.g(this.yellowred, cards.yellowred) && m0.g(this.red, cards.red);
    }

    @m
    public final Integer getRed() {
        return this.red;
    }

    @m
    public final Integer getYellow() {
        return this.yellow;
    }

    @m
    public final Integer getYellowred() {
        return this.yellowred;
    }

    public int hashCode() {
        Integer num = this.yellow;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.yellowred;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.red;
        return iHashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public final void setRed(@m Integer num) {
        this.red = num;
    }

    public final void setYellow(@m Integer num) {
        this.yellow = num;
    }

    public final void setYellowred(@m Integer num) {
        this.yellowred = num;
    }

    @l
    public String toString() {
        return "Cards(yellow=" + this.yellow + ", yellowred=" + this.yellowred + ", red=" + this.red + j.f86771d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@l Parcel dest, int i10) {
        m0.p(dest, "dest");
        Integer num = this.yellow;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        Integer num2 = this.yellowred;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num2.intValue());
        }
        Integer num3 = this.red;
        if (num3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num3.intValue());
        }
    }

    public Cards(@m Integer num, @m Integer num2, @m Integer num3) {
        this.yellow = num;
        this.yellowred = num2;
        this.red = num3;
    }

    public /* synthetic */ Cards(Integer num, Integer num2, Integer num3, int i10, x xVar) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : num2, (i10 & 4) != 0 ? null : num3);
    }
}
