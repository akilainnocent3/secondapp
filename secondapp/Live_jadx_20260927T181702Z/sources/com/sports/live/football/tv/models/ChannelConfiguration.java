package com.sports.live.football.tv.models;

import android.os.Parcel;
import android.os.Parcelable;
import gi.j;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;
import yv.g;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@g
public final class ChannelConfiguration implements Parcelable {

    @l
    public static final Parcelable.Creator<ChannelConfiguration> CREATOR = new Creator();

    @m
    private final String key;

    @m
    private final String value;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Creator implements Parcelable.Creator<ChannelConfiguration> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChannelConfiguration createFromParcel(Parcel parcel) {
            m0.p(parcel, "parcel");
            return new ChannelConfiguration(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChannelConfiguration[] newArray(int i10) {
            return new ChannelConfiguration[i10];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChannelConfiguration() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ChannelConfiguration copy$default(ChannelConfiguration channelConfiguration, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = channelConfiguration.key;
        }
        if ((i10 & 2) != 0) {
            str2 = channelConfiguration.value;
        }
        return channelConfiguration.copy(str, str2);
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
    public final ChannelConfiguration copy(@m String str, @m String str2) {
        return new ChannelConfiguration(str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelConfiguration)) {
            return false;
        }
        ChannelConfiguration channelConfiguration = (ChannelConfiguration) obj;
        return m0.g(this.key, channelConfiguration.key) && m0.g(this.value, channelConfiguration.value);
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

    @l
    public String toString() {
        return "ChannelConfiguration(key=" + this.key + ", value=" + this.value + j.f86771d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@l Parcel dest, int i10) {
        m0.p(dest, "dest");
        dest.writeString(this.key);
        dest.writeString(this.value);
    }

    public ChannelConfiguration(@m String str, @m String str2) {
        this.key = str;
        this.value = str2;
    }

    public /* synthetic */ ChannelConfiguration(String str, String str2, int i10, x xVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2);
    }
}
