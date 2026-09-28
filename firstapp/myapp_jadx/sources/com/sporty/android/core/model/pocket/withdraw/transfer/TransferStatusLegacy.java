package com.sporty.android.core.model.pocket.withdraw.transfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class TransferStatusLegacy implements Parcelable {
    public static final Parcelable.Creator<TransferStatusLegacy> CREATOR = new Parcelable.Creator<TransferStatusLegacy>() { // from class: com.sporty.android.core.model.pocket.withdraw.transfer.TransferStatusLegacy.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TransferStatusLegacy createFromParcel(Parcel parcel) {
            return new TransferStatusLegacy(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TransferStatusLegacy[] newArray(int i) {
            return new TransferStatusLegacy[i];
        }
    };

    @SerializedName("bvn")
    public boolean bvn;

    @SerializedName("email")
    public boolean email;

    @SerializedName("enableTime")
    public long enableTime;

    @SerializedName("enableTransfer")
    public boolean enableTransfer;

    @SerializedName("maxDailyTransferAmount")
    public long maxDailyTransferAmount;

    @SerializedName("maxRecipients")
    public int maxRecipients;

    @SerializedName("maxSenders")
    public int maxSenders;

    @SerializedName("maxTransferAmount")
    public long maxTransferAmount;

    @SerializedName("minTransferAmount")
    public long minTransferAmount;

    @SerializedName("otp")
    public boolean otp;

    @SerializedName("withdrawPin")
    public boolean withdrawPin;

    public TransferStatusLegacy(Parcel parcel) {
        this.bvn = parcel.readByte() != 0;
        this.email = parcel.readByte() != 0;
        this.withdrawPin = parcel.readByte() != 0;
        this.otp = parcel.readByte() != 0;
        this.enableTransfer = parcel.readByte() != 0;
        this.maxRecipients = parcel.readInt();
        this.maxSenders = parcel.readInt();
        this.enableTime = parcel.readLong();
        this.maxDailyTransferAmount = parcel.readLong();
        this.minTransferAmount = parcel.readLong();
        this.maxTransferAmount = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.bvn ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.email ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.withdrawPin ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.otp ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.enableTransfer ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.maxRecipients);
        parcel.writeInt(this.maxSenders);
        parcel.writeLong(this.enableTime);
        parcel.writeLong(this.maxDailyTransferAmount);
        parcel.writeLong(this.minTransferAmount);
        parcel.writeLong(this.maxTransferAmount);
    }
}
