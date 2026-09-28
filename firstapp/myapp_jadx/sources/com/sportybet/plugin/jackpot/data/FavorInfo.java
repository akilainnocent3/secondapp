package com.sportybet.plugin.jackpot.data;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public class FavorInfo implements Parcelable {
    public static final Parcelable.Creator<FavorInfo> CREATOR = new Parcelable.Creator<FavorInfo>() { // from class: com.sportybet.plugin.jackpot.data.FavorInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public FavorInfo createFromParcel(Parcel parcel) {
            return new FavorInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public FavorInfo[] newArray(int i) {
            return new FavorInfo[i];
        }
    };
    public long giftAmount;
    public String giftId;
    public int giftKind;

    public FavorInfo(Parcel parcel) {
        this.giftId = parcel.readString();
        this.giftKind = parcel.readInt();
        this.giftAmount = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.giftId);
        parcel.writeInt(this.giftKind);
        parcel.writeLong(this.giftAmount);
    }
}
