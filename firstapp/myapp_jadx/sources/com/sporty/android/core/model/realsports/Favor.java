package com.sporty.android.core.model.realsports;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class Favor implements Parcelable {
    public static final Parcelable.Creator<Favor> CREATOR = new Parcelable.Creator<Favor>() { // from class: com.sporty.android.core.model.realsports.Favor.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Favor createFromParcel(Parcel parcel) {
            return new Favor(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Favor[] newArray(int i) {
            return new Favor[i];
        }
    };
    public List<FavorInfo> favorInfo;
    public long totalAmount;

    public Favor(Parcel parcel) {
        this.totalAmount = parcel.readLong();
        this.favorInfo = parcel.createTypedArrayList(FavorInfo.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.totalAmount);
        parcel.writeTypedList(this.favorInfo);
    }
}
