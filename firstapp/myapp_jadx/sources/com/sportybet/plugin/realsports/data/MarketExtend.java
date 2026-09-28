package com.sportybet.plugin.realsports.data;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public class MarketExtend implements Parcelable {
    public static final Parcelable.Creator<MarketExtend> CREATOR = new Parcelable.Creator<MarketExtend>() { // from class: com.sportybet.plugin.realsports.data.MarketExtend.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MarketExtend createFromParcel(Parcel parcel) {
            return new MarketExtend(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MarketExtend[] newArray(int i) {
            return new MarketExtend[i];
        }
    };
    public String name;
    public String nodeMarketId;
    public boolean notSupport;
    public String rootMarketId;

    public MarketExtend(Parcel parcel) {
        this.name = parcel.readString();
        this.rootMarketId = parcel.readString();
        this.nodeMarketId = parcel.readString();
        this.notSupport = parcel.readByte() != 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.nodeMarketId);
        parcel.writeString(this.rootMarketId);
        parcel.writeByte(this.notSupport ? (byte) 1 : (byte) 0);
    }

    public MarketExtend() {
    }
}
