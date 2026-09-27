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
public final class ApplicationConfiguration implements Parcelable {

    @l
    public static final Parcelable.Creator<ApplicationConfiguration> CREATOR = new Creator();

    @m
    private String key;

    @m
    private String value;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Creator implements Parcelable.Creator<ApplicationConfiguration> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApplicationConfiguration createFromParcel(Parcel parcel) {
            m0.p(parcel, "parcel");
            return new ApplicationConfiguration(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApplicationConfiguration[] newArray(int i10) {
            return new ApplicationConfiguration[i10];
        }
    }

    public ApplicationConfiguration(@m String str, @m String str2) {
        this.key = str;
        this.value = str2;
    }

    public static /* synthetic */ ApplicationConfiguration copy$default(ApplicationConfiguration applicationConfiguration, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = applicationConfiguration.key;
        }
        if ((i10 & 2) != 0) {
            str2 = applicationConfiguration.value;
        }
        return applicationConfiguration.copy(str, str2);
    }

    @m
    public final String component1() {
        return this.key;
    }

    @m
    public final String component2() {
        return this.value;
    }

    @l
    public final ApplicationConfiguration copy(@m String str, @m String str2) {
        return new ApplicationConfiguration(str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApplicationConfiguration)) {
            return false;
        }
        ApplicationConfiguration applicationConfiguration = (ApplicationConfiguration) obj;
        return m0.g(this.key, applicationConfiguration.key) && m0.g(this.value, applicationConfiguration.value);
    }

    @m
    public final String getKey() {
        return this.key;
    }

    @m
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.key;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.value;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setKey(@m String str) {
        this.key = str;
    }

    public final void setValue(@m String str) {
        this.value = str;
    }

    @l
    public String toString() {
        return "ApplicationConfiguration(key=" + this.key + ", value=" + this.value + j.f86771d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@l Parcel dest, int i10) {
        m0.p(dest, "dest");
        dest.writeString(this.key);
        dest.writeString(this.value);
    }
}
