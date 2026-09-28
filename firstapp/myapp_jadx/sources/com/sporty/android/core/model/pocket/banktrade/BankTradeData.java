package com.sporty.android.core.model.pocket.banktrade;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public class BankTradeData implements Parcelable {
    public static final Parcelable.Creator<BankTradeData> CREATOR = new Parcelable.Creator<BankTradeData>() { // from class: com.sporty.android.core.model.pocket.banktrade.BankTradeData.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BankTradeData createFromParcel(Parcel parcel) {
            return new BankTradeData(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BankTradeData[] newArray(int i) {
            return new BankTradeData[i];
        }
    };
    public String bankAccName;
    public String counterAuthority;
    public String counterIconUrl;
    public String counterPart;
    public long feeAmount;
    public String jumpUrl;
    public String name;
    public long payAmount;
    public String payChId;
    public String payChTxId;
    public String phoneNo;
    public int status;
    public String tradeId;

    public BankTradeData(Parcel parcel) {
        this.status = parcel.readInt();
        this.phoneNo = parcel.readString();
        this.payChId = parcel.readString();
        this.payChTxId = parcel.readString();
        this.payAmount = parcel.readLong();
        this.feeAmount = parcel.readLong();
        this.jumpUrl = parcel.readString();
        this.counterPart = parcel.readString();
        this.counterAuthority = parcel.readString();
        this.counterIconUrl = parcel.readString();
        this.bankAccName = parcel.readString();
        this.name = parcel.readString();
        this.tradeId = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.status);
        parcel.writeString(this.phoneNo);
        parcel.writeString(this.payChId);
        parcel.writeString(this.payChTxId);
        parcel.writeLong(this.payAmount);
        parcel.writeLong(this.feeAmount);
        parcel.writeString(this.jumpUrl);
        parcel.writeString(this.counterPart);
        parcel.writeString(this.counterAuthority);
        parcel.writeString(this.counterIconUrl);
        parcel.writeString(this.bankAccName);
        parcel.writeString(this.name);
        parcel.writeString(this.tradeId);
    }

    public BankTradeData() {
    }
}
