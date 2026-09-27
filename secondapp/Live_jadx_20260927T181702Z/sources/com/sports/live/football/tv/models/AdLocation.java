package com.sports.live.football.tv.models;

import android.os.Parcel;
import android.os.Parcelable;
import gi.j;
import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;
import wo.i;
import yv.g;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@i(generateAdapter = true)
@g
public final class AdLocation implements Parcelable {

    @l
    public static final Parcelable.Creator<AdLocation> CREATOR = new Creator();

    @m
    private String title;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Creator implements Parcelable.Creator<AdLocation> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AdLocation createFromParcel(Parcel parcel) {
            m0.p(parcel, "parcel");
            return new AdLocation(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AdLocation[] newArray(int i10) {
            return new AdLocation[i10];
        }
    }

    public AdLocation(@m String str) {
        this.title = str;
    }

    public static /* synthetic */ AdLocation copy$default(AdLocation adLocation, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = adLocation.title;
        }
        return adLocation.copy(str);
    }

    @m
    public final String component1() {
        return this.title;
    }

    @l
    public final AdLocation copy(@m String str) {
        return new AdLocation(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AdLocation) && m0.g(this.title, ((AdLocation) obj).title);
    }

    @m
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final void setTitle(@m String str) {
        this.title = str;
    }

    @l
    public String toString() {
        return "AdLocation(title=" + this.title + j.f86771d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@l Parcel dest, int i10) {
        m0.p(dest, "dest");
        dest.writeString(this.title);
    }
}
